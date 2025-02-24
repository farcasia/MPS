/*
 * Copyright 2003-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.generator.impl;

import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.generator.GenerationSessionContext;
import jetbrains.mps.generator.GenerationTrace;
import jetbrains.mps.generator.GenerationTracerUtil;
import jetbrains.mps.generator.IGeneratorLogger;
import jetbrains.mps.generator.ModelGenerationPlan.Checkpoint;
import jetbrains.mps.generator.impl.CloneUtil.Factory;
import jetbrains.mps.generator.impl.CloneUtil.RegularSModelFactory;
import jetbrains.mps.generator.impl.FastRuleFinder.BlockedReductionsData;
import jetbrains.mps.generator.impl.RoleValidation.RoleValidator;
import jetbrains.mps.generator.impl.RoleValidation.Status;
import jetbrains.mps.generator.impl.plan.CheckpointState;
import jetbrains.mps.generator.impl.plan.CrossModelEnvironment;
import jetbrains.mps.generator.impl.plan.ModelCheckpoints;
import jetbrains.mps.generator.impl.query.GeneratorQueryProvider;
import jetbrains.mps.generator.impl.reference.DynamicReferenceUpdate;
import jetbrains.mps.generator.impl.reference.PostponedReference;
import jetbrains.mps.generator.impl.reference.PostponedReferenceUpdate;
import jetbrains.mps.generator.impl.reference.ReferenceInfo_CopiedInputNode;
import jetbrains.mps.generator.impl.template.DeltaBuilder;
import jetbrains.mps.generator.impl.template.QueryExecutionContextWithTracing;
import jetbrains.mps.generator.plan.CheckpointIdentity;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.NodePostProcessor;
import jetbrains.mps.generator.runtime.ReferenceReductionRule;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateDropAttributeRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateRule;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.template.DefaultQueryExecutionContext;
import jetbrains.mps.generator.template.QueryExecutionContext;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.smodel.DynamicReference;
import jetbrains.mps.smodel.FastNodeFinderManager;
import jetbrains.mps.smodel.ModelDependencyUpdate;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.textgen.trace.TracingUtil;
import jetbrains.mps.util.SNodeOperations;
import jetbrains.mps.util.performance.IPerformanceTracer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import org.jetbrains.mps.openapi.model.SNodeId;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import org.jetbrains.mps.util.DescendantsTreeIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by: Sergey Dmitriev
 * Date: Jan 23, 2007
 * <p/>
 * Created once per micro-step.
 */
public class TemplateGenerator extends AbstractTemplateGenerator {

  private boolean myChanged = false;
  private final GenPlanActiveStep myPlanStep;
  private final DelayedChanges myDelayedChanges;
  private final Map<SNode, SNode> myNewToOldRoot = new HashMap<SNode, SNode>();
  /**
   * Input nodes coming from a model other than input model (or no model at all), e.g. if
   * input node query follows a reference from an input model to some outer model.
   * We track these nodes, including children, to facilitate reference resolution (i.e. if there's
   * a reference in an input model pointing somewhere to subtree of a foreign node, we redirect
   * that reference to the copied counterpart). Generally, this approach might not be everyone's
   * desire, but it's the way it was so far.
   */
  private final Set<SNode> myAdditionalInputNodes = new HashSet<SNode>();
  protected final List<SNode> myOutputRoots;

  private final QueryExecutionContext myExecutionContext;

  private final boolean myIsStrict;
  private boolean myAreMappingsReady = false;

  /* cached session data */
  private BlockedReductionsData myReductionData;

  private DeltaBuilder myDeltaBuilder;
  private boolean myInplaceModelChange = false; // indicates transformation was in-place (even after deltaBuilder was disposed). cries for better approach
  private WeavingProcessor myWeavingProcessor;
  private TemplateProcessor myTemplateProcessor;
  private final PostponedReferenceUpdate myPostponedRefs;
  private final DynamicReferenceUpdate myDynamicRefs;
  private final GenerationTrace myNewTrace;
  private final TransitionTrace myTransitionTrace;

  static final class StepArguments {
    public final GenPlanActiveStep planStep;
    public final GenerationTrace genTrace;
    public final GeneratorMappings mappingLabels;
    public final TransitionTrace transitionTrace;
    public final GeneratorQueryProvider.Source querySource;

    public StepArguments(GeneratorQueryProvider.Source gqps) {
      // FIXME refactor TMC.isApplicable call not to take ITemplateGenerator, or use dedicated ITemplateGenerator implementation
      // that doesn't need anything we could not provide here anyway.
      // Alternative is to initialize StepArguments once prior to isApplicable check, which we can't do now as isApplicable gives us GenPlanActiveStep
      // If refactored (e.g. GPAS made TG's argument or use of dedicated fake GPAS for isApplicable), could drop this cons altogether.
      // I.e. if anyone would like to query e.g. mapping label from isApplicable(), it's a chance not to fail with NPE (and to let the error go unnoticed)
      this(null, null, null, null, gqps);
    }

    public StepArguments(GenPlanActiveStep planStep, GenerationTrace genTrace, GeneratorMappings mapLabels,
        TransitionTrace transitionTrace, GeneratorQueryProvider.Source gqps) {
      this.planStep = planStep;
      this.genTrace = genTrace;
      this.mappingLabels = mapLabels;
      this.transitionTrace = transitionTrace;
      this.querySource = gqps;
    }
  }

  public TemplateGenerator(GenerationSessionContext operationContext, SModel inputModel, SModel outputModel, StepArguments stepArgs) {
    super(operationContext, inputModel, outputModel, stepArgs.mappingLabels, stepArgs.querySource);
    myPlanStep = stepArgs.planStep;
    GenerationOptions options = operationContext.getGenerationOptions();
    myIsStrict = options.isStrictMode();
    myDelayedChanges = new DelayedChanges();
    myOutputRoots = new ArrayList<SNode>();
    DefaultQueryExecutionContext ctx = new DefaultQueryExecutionContext(this);
    myExecutionContext = options.getTracingMode() >= GenerationOptions.TRACE_LANGS
      ? new QueryExecutionContextWithTracing(ctx, operationContext.getPerformanceTracer())
      : ctx;
    myPostponedRefs = new PostponedReferenceUpdate();
    myDynamicRefs = new DynamicReferenceUpdate(this);
    myNewTrace = stepArgs.genTrace;
    myTransitionTrace = stepArgs.transitionTrace;
  }

  public boolean apply(@NotNull ProgressMonitor progressMonitor, boolean isPrimary) throws GenerationFailureException, GenerationCanceledException {
    myProgressMonitor = progressMonitor;
    checkMonitorCanceled();
    final IPerformanceTracer ttrace = getGeneratorSessionContext().getPerformanceTracer();
    myAreMappingsReady = false;
    // prepare weaving
    ttrace.push("weavings", false);
    myWeavingProcessor = new WeavingProcessor(this);
    myWeavingProcessor.prepareWeavingRules(getInputModel());
    ttrace.pop();

    myTemplateProcessor = new TemplateProcessor(this);

    ttrace.push("reductions", false);
    applyReductions(isPrimary);
    ttrace.pop();
    myInplaceModelChange = myDeltaBuilder != null;

    myAreMappingsReady = true;

    if (myDeltaBuilder == null) {
      // publish roots
      for (SNode outputRoot : myOutputRoots) {
        myOutputModel.addRootNode(outputRoot);
      }
    }

    if (myWeavingProcessor.hasWeavingRulesToApply()) {
      checkMonitorCanceled();
      ttrace.push("weavings", false);
      myWeavingProcessor.apply();
      myWeavingProcessor = null;
      ttrace.pop();
    }

    if (!myDelayedChanges.isEmpty()) {
      checkMonitorCanceled();
      // execute mapper in all $MAP_SRC$/$MAP_SRCL$
      ttrace.push("delayed mappings", false);
      myDelayedChanges.doAllChanges(this);
      ttrace.pop();
    }

    //////////////////////////////////////////////////////////////
    // replace references with PostponedReference to respect model changes up to this point
    if (myDeltaBuilder != null && myDeltaBuilder.hasChanges()) {
      ttrace.push("apply delta changes", false);
//      myDeltaBuilder.dump();
      myDeltaBuilder.prepareReferences(getInputModel(), this);
      ttrace.pop();
    }

    // resolve PostponedReferences, but do not replace them in the model yet
    if (!myPostponedRefs.isEmpty()) {
      // new unresolved references could appear after applying reduction rules (all delayed changes should be done before this, like replacing children)
      ttrace.push("restoring references", false);
      myPostponedRefs.prepare();
      ttrace.pop();
    }

    // apply structural change delta onto input model
    if (myDeltaBuilder != null && myDeltaBuilder.hasChanges()) {
      ttrace.push("apply delta changes", false);
      myDeltaBuilder.applyInplace(getInputModel());
      ttrace.pop();
    }

    if (myChanged) {
      // Unless we manage to update set of used languages along with changes being generated,
      // we shall maintain set of used languages prior to any attempt to resolve references, as they might
      // be using model scopes and TypeSystem, and latter is quite picky about imports.
      // we don't use any repository as it's ok to reference language's accessory model explicitly for a transient model
      new ModelDependencyUpdate(getOutputModel()).updateUsedLanguages().updateImportedModels(null);
    }

    // replace reference placeholders (PostponedReference) with resolved
    // replace DynamicReference with StaticReference, if needed
    if (!myPostponedRefs.isEmpty() || !myDynamicRefs.isEmpty()) {
      ttrace.push("restoring references", false);
      myPostponedRefs.replace();
      myDynamicRefs.replace();
      ttrace.pop();
    }

    myOutputRoots.clear();
    myDeltaBuilder = null;

    /////////////////////////////////////////////////////////////^^^
    if (myChanged || isPrimary) {
      // advance blocked reduction data
      getBlockedReductionsData().advanceStep();
      checkMonitorCanceled();
    }
    return myChanged;
  }

  public void executeScript(TemplateMappingScript script) throws GenerationFailureException {
    getDefaultExecutionContext(null).executeScript(script, myInputModel);
  }

  protected void applyReductions(boolean isPrimary) throws GenerationCanceledException, GenerationFailureException {
    if (isInplaceChangeEnabled()) {
      if (myWeavingProcessor.hasWeavingRulesToApply()) {
        getLogger().info("Could have had delta builder here, but can't due to active weavings");
      } else {
        getLogger().info("Active in-place model transformation");
        myDeltaBuilder = createDeltaBuilder();
      }
    }
    final IPerformanceTracer ttrace = getGeneratorSessionContext().getPerformanceTracer();
    // create all roots
    if (isPrimary) {
      ttrace.push("create roots", false);

      final QueryExecutionContext executionContext = getExecutionContext(null);
      if (executionContext != null) {
        for (TemplateCreateRootRule rule : getRuleManager().getCreateRootRules()) {
          TemplateExecutionEnvironment environment = new TemplateExecutionEnvironmentImpl(myTemplateProcessor, executionContext, new ReductionTrack(getBlockedReductionsData()));
          applyCreateRoot(rule, environment);
        }
        checkMonitorCanceled();
      }
      ttrace.pop();
    }

    // root mapping rules
    ttrace.push("root mappings", false);
    ArrayList<SNode> rootsConsumed = new ArrayList<SNode>();
    for (TemplateRootMappingRule rule : getRuleManager().getRoot_MappingRules()) {
      checkMonitorCanceled();
      applyRootRule(rule, rootsConsumed);
    }
    ttrace.pop();

    // copy roots
    getGeneratorSessionContext().clearCopiedRootsSet();
    for (SNode rootToCopy : myInputModel.getRootNodes()) {
      if (rootsConsumed.contains(rootToCopy)) {
        continue;
      }
      QueryExecutionContext context = getExecutionContext(rootToCopy);
      if (context != null) {
        TemplateExecutionEnvironmentImpl rootenv = new TemplateExecutionEnvironmentImpl(myTemplateProcessor, context, new ReductionTrack(getBlockedReductionsData()));
        copyRootInputNode(rootToCopy, rootenv);
        checkMonitorCanceled();
      }
    }
  }

  protected void applyCreateRoot(TemplateCreateRootRule rule, TemplateExecutionEnvironment environment) throws GenerationFailureException, GenerationCanceledException {
    if (!environment.getQueryExecutor().isApplicable(rule, new DefaultTemplateContext(environment, null, null))) {
      return;
    }
    try {
      Collection<SNode> outputNodes = environment.getQueryExecutor().applyRule(rule, environment);
      if (outputNodes == null) {
        return;
      }

      environment.getTrace().trace(null, GenerationTracerUtil.translateOutput(outputNodes), rule.getRuleNode());
      for (SNode outputNode : outputNodes) {
        registerRoot(new GeneratedRootDescriptor(outputNode, rule.getRuleNode()));
        setChanged();
      }
    } catch (DismissTopMappingRuleException ex) {
      // it's ok, just continue
      reportDismissRuleException(ex, rule);
    } catch (TemplateProcessingFailureException ex) {
      getLogger().error(rule.getRuleNode(), String.format("couldn't create root node: %s", ex.getMessage()), ex.asProblemDescription());
    } catch (GenerationCanceledException ex) {
      throw ex;
    } catch (GenerationFailureException ex) {
      throw ex;
    } catch (GenerationException e) {
      getLogger().error(rule.getRuleNode(), "internal error: " + e.toString());
    }
  }

  private void applyRootRule(TemplateRootMappingRule rule, List<SNode> rootsConsumed) throws GenerationFailureException, GenerationCanceledException {
    Iterable<SNode> inputNodes = FastNodeFinderManager.get(myInputModel).getNodes(rule.getApplicableConcept(), rule.applyToInheritors());
    for (SNode inputNode : inputNodes) {
      // do not apply root mapping if root node has been copied from input model on previous micro-step
      // because some roots can be already mapped and copied as well (if some rule has 'keep root' = true)
      if (getGeneratorSessionContext().isCopiedRoot(inputNode)) {
        continue;
      }

      final QueryExecutionContext executionContext = getExecutionContext(inputNode);
      if (executionContext != null) {
        TemplateExecutionEnvironmentImpl environment = new TemplateExecutionEnvironmentImpl(myTemplateProcessor, executionContext, new ReductionTrack(getBlockedReductionsData()));
        final DefaultTemplateContext templateContext = new DefaultTemplateContext(environment, inputNode, null);
        if (!executionContext.isApplicable(rule, templateContext)) {
          continue;
        }
        boolean copyRootOnFailure = false;
        if (inputNode.getModel() != null && inputNode.getParent() == null && !rule.keepSourceRoot()) {
          rootsConsumed.add(inputNode);
          copyRootOnFailure = true;
        }
        createRootNodeByRule(rule, inputNode, environment, copyRootOnFailure);
      }
    }
  }

  protected void createRootNodeByRule(TemplateRootMappingRule rule, SNode inputNode, TemplateExecutionEnvironmentImpl env, boolean copyRootOnFailure)
    throws GenerationCanceledException, GenerationFailureException {
    try {
      final DefaultTemplateContext templateContext = new DefaultTemplateContext(env, inputNode, null);
      Collection<SNode> outputNodes = env.getQueryExecutor().applyRule(rule, templateContext);
      if (outputNodes == null) {
        return;
      }

      copyNodeAttributes(templateContext, outputNodes, env);
      recordTransformInputTrace(inputNode, outputNodes);

      env.getTrace().trace(inputNode.getNodeId(), GenerationTracerUtil.translateOutput(outputNodes), rule.getRuleNode());

      final boolean inputIsRoot = inputNode.getParent() == null;
      // if we picked a non-root node to produce a root, it would get processed later as part of copyRootInputNode(), hence inputPersists == true.
      final boolean inputPersists = !inputIsRoot || rule.keepSourceRoot();
      for (SNode outputNode : outputNodes) {
        registerRoot(new GeneratedRootDescriptor(outputNode, inputNode, inputPersists, rule.getRuleNode()));
        setChanged();
        if (!inputPersists) {
          // output node should be accessible via 'findCopiedNode'
          // however, if the node stays in the model, let other rules/copy facility register it as appropriate (see MPS-23159),
          // it's unlikely anyone referencing original node would need to restore reference to a newly introduced root, when there's
          // reduction/copy alternative.
          addCopiedOutputNodeForInputNode(inputNode, outputNode);
        }
        // we copy user objects in reduction rules, root mapping rules are no different
        // in addition, this copies TracingUtil.ORIGINAL_INPUT_NODE, so that outputNodes
        // are marked as originating at inputNode's origin
        CopyUtil.copyUserObjects(inputNode, outputNode);
      }

    } catch (DismissTopMappingRuleException e) {
      // it's ok, just continue
      reportDismissRuleException(e, rule);
      if (copyRootOnFailure && inputNode.getModel() != null && inputNode.getParent() == null) {
        final FullCopyFacility copyFacility = new FullCopyFacility(env);
        copyFacility.copyRootInputNode(inputNode);
        if (copyFacility.hasChanges()) {
          setChanged();
        }
      }
    } catch (TemplateProcessingFailureException ex) {
      getLogger().error(rule.getRuleNode(), String.format("couldn't create root node: %s", ex.getMessage()), ex.asProblemDescription());
    } catch (GenerationException e) {
      if (e instanceof GenerationCanceledException) throw (GenerationCanceledException) e;
      if (e instanceof GenerationFailureException) throw (GenerationFailureException) e;
      getLogger().error(rule.getRuleNode(), "internal error: " + e.toString(), GeneratorUtil.describe(inputNode, "input node"));
    }
  }

  protected void copyRootInputNode(@NotNull SNode inputRootNode, @NotNull TemplateExecutionEnvironmentImpl env) throws GenerationFailureException, GenerationCanceledException {
    NodeCopyFacility copyProcessor;
    if (myDeltaBuilder == null) {
      copyProcessor = new FullCopyFacility(env);
    } else {
      copyProcessor = new PartialCopyFacility(env, myDeltaBuilder);
    }
    // check if can drop
    if (copyProcessor.checkDropRules(inputRootNode, getRuleManager().getDropRootRules(inputRootNode))) {
      setChanged();
      return;
    }
    copyProcessor.copyRootInputNode(inputRootNode);
    if(copyProcessor.hasChanges()) {
      setChanged();
    }
  }

  @Override
  public boolean isDirty(SNode node) {
    // FIXME deprecate and remove
    return true;
  }

  @Override
  public SModel getOutputModel() {
    if (myDeltaBuilder != null || myInplaceModelChange) {
      return getInputModel();
    }
    return super.getOutputModel();
  }

  /*
     * Unsynchronized
     */
  @Nullable
  protected QueryExecutionContext getExecutionContext(SNode inputNode) {
    return getDefaultExecutionContext(inputNode);
  }

  protected QueryExecutionContext getDefaultExecutionContext(SNode inputNode) {
    return myExecutionContext;
  }

  protected DeltaBuilder createDeltaBuilder() {
    return DeltaBuilder.newSingleThreadDeltaBuilder();
  }

  @Override
  public SNode findOutputNodeById(SNodeId nodeId) {
    if (myDeltaBuilder != null) {
      return myDeltaBuilder.findOutputNodeById(nodeId);
    }
    return super.findOutputNodeById(nodeId);
  }

  @Override
  public SNode findCopiedOutputNodeForInputNode(SNode inputNode) {
    SNode existing = super.findCopiedOutputNodeForInputNode(inputNode);
    if (existing != null) {
      return existing;
    }
    // provisional support for scenarios where reference target has been just copied, not transformed
    // and we need to update reference in a source model without need for explicit ML on a copy.
    if (inputNode == null) {
      return null;
    }
    SModel inputNodeModel = inputNode.getModel();
    if (inputNodeModel == getInputModel() || inputNodeModel == null) {
      return null;
    }
//    CheckpointState cp = findMatchingStateFor(inputNodeModel);
    CrossModelEnvironment env = getGeneratorSessionContext().getCrossModelEnvironment();
    ModelCheckpoints modelCheckpoints = env.getState(inputNodeModel);
    if (modelCheckpoints == null) {
      return null;
    }
    Checkpoint targetPoint = myPlanStep.getNextCheckpoint();
    if (targetPoint == null) {
      // this might be perfectly legal scenario - when we try to restore a reference in a model close to GP sequence, with no CP at the end
      // however, without a CP got nothing to synchronize against, as we don't keep final transformation model now (perhaps, we should?)
      return null;
    }
    CheckpointIdentity cpId = targetPoint.getIdentity();
    SNode copiedOutput = modelCheckpoints.findCopiedNode(cpId, inputNode);
    return copiedOutput;
  }

  /**
   * For a cross-mode reference, we expect inputNode to point either at original model (or external non-transient model), or one of checkpoint models.
   * There's no evidence one could get anything but that for a node referenced from another model during generation (i.e. no chances for inputNode to point
   * to intermediate transient model).
   */
  @Override
  public SNode findOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName) {
    SNode existing = super.findOutputNodeByInputNodeAndMappingName(inputNode, mappingName);
    if (existing != null) {
      // XXX apparently, there are models that use input nodes from a model other than that being transformed
      // e.g. in build.workflow, bl.closures, bl.collections. Shall revert the change and try to rebuild
      // to find out particular uses, as it's potential error (i.e. MLs between different models).
      // For now, though, just check if there's mapping, and use it.
      return existing;
    }
    if (inputNode == null) {
      // there are models e.g. bl.plugin, debugger.api.ui.icons, d.java.runtime.ui that pass null as inputNode
      return null;
    }
    SModel inputNodeModel = inputNode.getModel();
    if (inputNodeModel == getInputModel()) {
//      return super.findOutputNodeByInputNodeAndMappingName(inputNode, mappingName);
      return null; // code down there deals with xModel references only
    }
    if (inputNodeModel == null) {
      return null;
    }
//    CheckpointState cp = findMatchingStateFor(inputNodeModel);
    CrossModelEnvironment env = getGeneratorSessionContext().getCrossModelEnvironment();
    ModelCheckpoints modelCheckpoints = env.getState(inputNodeModel);
    if (modelCheckpoints == null) {
      return null;
    }
    Checkpoint targetPoint = myPlanStep.getNextCheckpoint();
    if (targetPoint == null) {
      // this might be perfectly legal scenario - when we try to restore a reference in a model close to GP sequence, with no CP at the end
      // however, without a CP got nothing to synchronize against, as we don't keep final transformation model now (perhaps, we should?)
      return null;
    }
    CheckpointIdentity cpId = targetPoint.getIdentity();
    SNode output = modelCheckpoints.findTransformedNode(cpId, inputNode, mappingName);
    return output;
  }

  private CheckpointState findMatchingStateFor(/*non-null*/SModel model) {
    CrossModelEnvironment env = getGeneratorSessionContext().getCrossModelEnvironment();
    // last and next are not necessarily in immediately adjacent generation steps, i.e. cpLast, transfStep1, transfStep2, activeTransformStep, transfStep3, cpNext
    Checkpoint lastPoint = myPlanStep.getLastCheckpoint();
    // XXX alternatively, we can extract active checkpoint from TransitionTrace. Do we need both ways to get the value I don't care to use?
    //     Isn't it too complicated?
    Checkpoint targetPoint = myPlanStep.getNextCheckpoint();
    if (targetPoint == null) {
      // XXX can I do anything in this case?
      return null;
    }
    // Note, myPlanStep.getPlanIdentity() points to the plan in action; while we need that of target model
    // which could be generated against different plan (although with a shared CP).
    ModelCheckpoints modelHistory = env.getState(model);
    if (modelHistory == null) {
      return null;
    }
    return modelHistory.find(targetPoint.getIdentity());
  }

  @Nullable
  @Override
  public SNode findOutputNode(SModel inputModel, String mappingName) {
    if (inputModel == null || inputModel == getInputModel()) {
      // XXX 1. not sure it's proper delegation, perhaps findOutputNodeByInputNodeAndMappingName(null) shall delegate here. Did that
      //        not to bother with refactoring right now.
      //     2. inputModel might be some intermediate model between original and current input, shall I consult ModelTransitions or similar
      //        facility to find out if this model is from active transformation or truly external.
      return super.findOutputNodeByInputNodeAndMappingName(null, mappingName);
    }
    CheckpointState cps = findMatchingStateFor(inputModel);
    if (cps == null) {
      return null;
    }
    List<SNode> rv = cps.getOutputWithoutInput(mappingName);
    if (rv.size() != 1) {
      return null;
    }
    return rv.get(0);
  }

  // in fact, it's reasonable to keep this method in TEEI (in ReductionTrack, actually), to reflect narrowing scope of
  // generator -> TEEI -> TemplateProcessor. This would take another round of refactoring, though
  // (first of all, shall update TEEI API)
  @NotNull
  List<SNode> copyNodes(@NotNull Iterable<SNode> inputNodes, final TemplateContext outerContext, @NotNull String templateId, TemplateExecutionEnvironmentImpl env)
      throws GenerationCanceledException, GenerationFailureException {

    final Iterator<SNode> it = inputNodes.iterator();
    if (!it.hasNext()) {
      return Collections.emptyList();
    }
    ArrayList<SNode> outputNodes = new ArrayList<SNode>();
    while(it.hasNext()) {
      SNode newInputNode = it.next();
      trackIfForeign(newInputNode);

      if (myDeltaBuilder != null) {
        myDeltaBuilder.enterNestedCopySrc(newInputNode);
      }
      try {
        final String mappingName = outerContext.getInputName();
        Collection<SNode> _outputNodes = env.tryToReduce(newInputNode);
        if (_outputNodes != null) {
          if (mappingName != null && _outputNodes.size() == 1) {
            registerMappingLabel(newInputNode, mappingName, _outputNodes.iterator().next());
          }
          outputNodes.addAll(_outputNodes);
        } else {
          FullCopyFacility copyFacility = new FullCopyFacility(env, new HashSet<SNode>(getForeignNodes()));
          SNode copiedNode = copyFacility.copyInputNode(newInputNode);
          addOutputNodeByInputAndTemplateNode(newInputNode, templateId, copiedNode);
          if (mappingName != null) {
            registerMappingLabel(newInputNode, mappingName, copiedNode);
          }
          outputNodes.add(copiedNode);
        }
      } finally {
        if (myDeltaBuilder != null) {
          myDeltaBuilder.leaveNestedCopySrc(newInputNode);
        }
      }
    }
    return outputNodes;

  }

  private Set<SNode> getForeignNodes() {
    synchronized (myAdditionalInputNodes) {
      return new HashSet<SNode>(myAdditionalInputNodes);
    }
  }

  private void trackIfForeign(@NotNull SNode inputNode) {
    SModel model = inputNode.getModel();
    if (model != getInputModel() || model == null) {
      synchronized (myAdditionalInputNodes) {
        if (!myAdditionalInputNodes.contains(inputNode)) {
          for (SNode n : SNodeUtil.getDescendants(inputNode, null, true)) {
            myAdditionalInputNodes.add(n);
          }
        }
      }
    }
  }

  BlockedReductionsData getBlockedReductionsData() {
    if (myReductionData == null) {
      myReductionData = BlockedReductionsData.getStepData(getGeneratorSessionContext());
    }
    return myReductionData;
  }

  @NotNull
  /*package*/ GenerationTrace getTrace() {
    return myNewTrace;
  }

  /*package*/ void reportDismissRuleException(@NotNull DismissTopMappingRuleException ex, @NotNull TemplateRule rule) {
    if (!ex.isLoggingNeeded()) {
      return;
    }
    SNodeReference ruleNode = rule.getRuleNode();
    String messageText = String.format("-- rule dismissed: %s", ex.getMessage() == null ? "<no message>" : ex.getMessage());
    if (ex.isInfo()) {
      getLogger().info(ruleNode, messageText);
    } else if (ex.isWarning()) {
      getLogger().warning(ruleNode, messageText, GeneratorUtil.describeInput(ex.getTemplateContext()), GeneratorUtil.describeTemplateLocation(ex));
    } else {
      getLogger().error(ruleNode, messageText, GeneratorUtil.describeInput(ex.getTemplateContext()), GeneratorUtil.describeTemplateLocation(ex));
    }
  }

  DelayedChanges getDelayedChanges() {
    return myDelayedChanges;
  }

  final GenPlanActiveStep getGenerationPlan() {
    return myPlanStep;
  }

  final RuleManager getRuleManager() {
    return myPlanStep.getRuleManager();
  }

  public TemplateSwitchMapping getSwitch(SNodeReference switch_) {
    return getRuleManager().getSwitch(switch_);
  }

  @Override
  public boolean areMappingsAvailable() {
    return myIsStrict ? myAreMappingsReady : true;
  }

  @Override
  public boolean isStrict() {
    return myIsStrict;
  }

  public PostponedReference register(@NotNull PostponedReference ref) {
    myPostponedRefs.add(ref);
    return ref;
  }

  /**
   * Let generator know about dynamic references produced during generation.
   * We might handle {@link jetbrains.mps.smodel.DynamicReference} in a special way as long as there's evading reason to
   * keep references dynamic during generation (as it only slows down model access due to ongoing scope use.
   * @param dr DynamicReference instance
   */
  public void registerDynamicReference(@NotNull SReference dr) {
    myDynamicRefs.add(dr);
  }

  void setChanged() {
    myChanged = true;
  }

  protected void registerRoot(GeneratedRootDescriptor rd) {
    myOutputRoots.add(rd.myOutputRoot);
    myNewToOldRoot.put(rd.myOutputRoot, rd.myInputNode);
    if (rd.myIsCopied) {
      getGeneratorSessionContext().registerCopiedRoot(rd.myOutputRoot);
    }
    if (myDeltaBuilder != null) {
      if (rd.myIsInputPreserved) {
        // if a new root comes from root mapping rule with keepRoot == true, pretend it's completely new root
        // if a new root comes from a non-root node, treat it as brand-new root, too. Input node in this case might
        // be later processed by the rest of the rules (copied or reduced).
        // FIXME the whole thing with registerRoot shall be refactored - there's little sense to forget about context
        // root being added at, and to restore this knowledge inside DeltaBuilder.registerRoot based on two node values only.
        myDeltaBuilder.registerRoot(null, rd.myOutputRoot);
      } else {
        myDeltaBuilder.registerRoot(rd.myInputNode, rd.myOutputRoot);
      }
    }
  }

  void replacePlaceholderNode(@NotNull NodePostProcessor postProcessor, @NotNull SNode substitute) {
    SNode placeholder = postProcessor.getOutputAnchor();
    SNode parent = placeholder.getParent();
    if (parent != null) {
      // check new child
      SContainmentLink childRole = placeholder.getContainmentLink();
      final Status status = getChildRoleValidator(parent, childRole).validate(substitute);
      if (status != null) {
        getLogger().warning(postProcessor.getTemplateNode(), status.getMessage("delayed changes"), status.describe(
            GeneratorUtil.describeInput(postProcessor.getTemplateContext()), GeneratorUtil.describe(parent, "parent")
        ));
      }
    }
    if (myDeltaBuilder != null) {
      // placeholders with active inplace may lack both model and parent (top of MAP-SRC-injected subtree)
      myDeltaBuilder.replacePlaceholderNode(placeholder, substitute);
    } else {
      assert placeholder.getModel() != null || parent != null : "Can't replace node that is not part of another structure (hangs in the air)";
      SNodeUtil.replaceWithAnother(placeholder, substitute);
    }
  }

  void copyNodeAttributes(@NotNull TemplateContext ctx, @NotNull Collection<SNode> outputNodes, @NotNull TemplateExecutionEnvironmentImpl env) throws GenerationException {
    final SNode input = ctx.getInput();
    if (input == null) {
      // context in create root rule might have no input
      return;
    }

    for (SNode attr : input.getChildren(jetbrains.mps.smodel.SNodeUtil.link_BaseConcept_smodelAttribute)) {
      if (checkDropNodeAttribute(ctx.subContext(attr))) {
        continue;
      }
      for (SNode output : outputNodes) {
        // We need FullCopyFacility here as we make a copy of attribute hierarchy and there could be references
        // outside of attribute, e.g. N1 and N2, with attribute A on the latter that references N1. Mere CopyUtil
        // won't update reference and its immature node would point to input model that might get disposed at the next step, leaving
        // broken reference.
        // NOTE. Use of FCF, however, implies we are going to activate reduction rules on attribute children, which might be quite unexpected.
        //       Perhaps, shall refactor FCF to support two modes, with/without nested reductions.
        // XXX Likely, current approach does't allow references to attributes to resolve magically (i.e. by matched node id)
        // Is it important, do we care about references to attributes at all?
        final SNode attrCopy = new FullCopyFacility(env, getForeignNodes()).copyInputNode(attr);
        output.addChild(jetbrains.mps.smodel.SNodeUtil.link_BaseConcept_smodelAttribute, attrCopy);
      }
    }
  }

  boolean checkDropNodeAttribute(@NotNull TemplateContext ctx) throws GenerationFailureException {
    final SNode attr = ctx.getInput();
    assert jetbrains.mps.smodel.SNodeUtil.link_BaseConcept_smodelAttribute.equals(attr.getContainmentLink());
    QueryExecutionContext queryExecutor = ctx.getEnvironment().getQueryExecutor();
    for (TemplateDropAttributeRule dropRule : getRuleManager().getDropAttributeRules(attr)) {
      if (queryExecutor.isApplicable(dropRule, ctx)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Indicates a node of output model originates from given node of input model by means of mere copy.
   *
   * Both parameters are not null. Both may point to the same node (e.g. when it's partial copy
   * and we just record the 'would-be' copy of a node. Even though the node itself doesn't change (provided
   * we modify model in-place), we shall record the fact its original input is from last checkpoint state
   */
  /*package*/ void recordCopyInputTrace(SNode inputNode, SNode outputNode) {
    myTransitionTrace.deriveOrigin(inputNode, outputNode);
  }

  /**
   * Indicates output nodes originate from given input node by means of transformation by a rule.
   * FIXME Input node is likely not null, though not sure what to do with create root rules. Perhaps, they don't need trace as there's no origin to trace to?
   */
  /*package*/ void recordTransformInputTrace(SNode inputNode, @Nullable Collection<SNode> outputNodes) {
    if (outputNodes == null) {
      return;
    }
    if (inputNode == null || !myTransitionTrace.hasOrigin(inputNode)) {
      return;
    }
    for (SNode output : outputNodes) {
      if (output == null) {
        continue;
      }
      myTransitionTrace.deriveOrigin(inputNode, new DescendantsTreeIterator(output));
    }
  }


  public SNode getOriginalRootByGenerated(SNode root) {
    SNode node = myNewToOldRoot.get(root);
    if (node == null) return null;
    if (node.getModel() == null) return null;
    if (node.getParent() == null) return node;
    return node.getContainingRoot();
  }

  private boolean isInplaceChangeEnabled() {
    return getGeneratorSessionContext().getGenerationOptions().applyTransformationsInplace();
  }

  private abstract static class NodeCopyFacility {
    protected final TemplateExecutionEnvironmentImpl myEnv;
    // reflects presense of structural changes
    protected boolean myIsChanged = false;

    protected NodeCopyFacility(@NotNull TemplateExecutionEnvironmentImpl env) {
      myEnv = env;
    }
    public final IGeneratorLogger getLogger() {
      return myEnv.getLogger();
    }
    public final boolean hasChanges() {
      return myIsChanged;
    }

    /**
     * @return true if one of drop rules matched
     */
    public final boolean checkDropRules(SNode inputRootNode, List<TemplateDropRootRule> rules) throws GenerationFailureException {
      final DefaultTemplateContext tc = new DefaultTemplateContext(myEnv, inputRootNode, null);
      for (TemplateDropRootRule dropRootRule : rules) {
        if (myEnv.getQueryExecutor().isApplicable(dropRootRule, tc)) {
          drop(inputRootNode, dropRootRule);
          myEnv.getTrace().trace(inputRootNode.getNodeId(), Collections.<SNodeId>emptyList(), dropRootRule.getRuleNode());
          return true;
        }
      }
      return false;
    }

    protected final boolean checkAttributeDropRules(SNode attributeNode) throws GenerationFailureException {
      final DefaultTemplateContext tc = new DefaultTemplateContext(myEnv, attributeNode, null);
      return myEnv.getGenerator().checkDropNodeAttribute(tc);
    }

    protected abstract void drop(SNode inputRootNode, TemplateDropRootRule rule);

    public abstract void copyRootInputNode(@NotNull SNode inputRoot) throws GenerationFailureException, GenerationCanceledException;
  }

  static class GeneratedRootDescriptor {
    // newly created root output node
    final SNode myOutputRoot;
    // input node, if any; not necessarily root
    final SNode myInputNode;
    // rule that produced the root, or null if copy root
    final SNodeReference myTemplateNode;
    // true if root is a copy of a root in input model
    final boolean myIsCopied;
    /**
     * true iff outputRoot is created from an inputNode which is either root and is kept in the output model
     * or from non-root node that might get copied/reduced afterwards.
     * IOW, indicates if the new myOutputRoot replaced a root or not.
     */
    final boolean myIsInputPreserved;

    private GeneratedRootDescriptor(@NotNull SNode outputRoot, @Nullable SNode input, boolean isInputPreserved, SNodeReference templateNode, boolean isCopied) {
      myOutputRoot = outputRoot;
      myInputNode = input;
      myTemplateNode = templateNode;
      myIsInputPreserved = isInputPreserved;
      myIsCopied = isCopied;
    }

    // new root produced
    public GeneratedRootDescriptor(@NotNull SNode outputRoot, @NotNull SNodeReference templateNode) {
      this(outputRoot, null, false, templateNode, false);
    }

    // new root produced based on existing node, possibly replacing it
    public GeneratedRootDescriptor(@NotNull SNode outputRoot, @NotNull SNode input, boolean inputPersists, @NotNull SNodeReference templateNode) {
      this(outputRoot, input, inputPersists, templateNode, false);
    }

    // copy of input root in the output model
    public GeneratedRootDescriptor(@NotNull SNode outputRoot, @NotNull SNode input) {
      this(outputRoot, input, false, null, true);
    }
  }

  private static class PartialCopyFacility extends NodeCopyFacility {
    private final DeltaBuilder myDeltaBuilder;

    public PartialCopyFacility(@NotNull TemplateExecutionEnvironmentImpl env, @NotNull DeltaBuilder deltaBuilder) {
      super(env);
      myDeltaBuilder = deltaBuilder;
    }

    @Override
    protected void drop(SNode inputRootNode, TemplateDropRootRule rule) {
      myDeltaBuilder.deleteInputRoot(inputRootNode);
    }

    @Override
    public void copyRootInputNode(@NotNull SNode inputRootNode) throws GenerationFailureException, GenerationCanceledException {
      myDeltaBuilder.enterInputRoot(inputRootNode);
      try {
        visitInputNode(inputRootNode);
      } finally {
        myDeltaBuilder.leaveInputRoot(inputRootNode);
      }
      // for now, registerRoot shall go *after* leaveInputRoot, as deltaBuilder expects CopyRoot to be full of replacing nodes
      // at the moment root is registered (to fill id map of new nodes)
      // TODO make map building an explicit step in DeltaBuilder so that ordering won't matter that much.
      // (the question is what if anyone calls findOutputNode while rules are applied (seems !strict model allows that)
      myEnv.getGenerator().registerRoot(new GeneratedRootDescriptor(inputRootNode, inputRootNode)); // weaving rules need myNewToOldRoot mapping
    }

    private void visitInputNode(SNode inputNode) throws GenerationFailureException, GenerationCanceledException {
      myEnv.getGenerator().recordCopyInputTrace(inputNode, inputNode);
      myEnv.blockReductionsForCopiedNode(inputNode, inputNode); // prevent infinite applying of the same reduction to the 'same' node.

      List<ReferenceReductionRule> referenceRules = myEnv.getGenerator().getRuleManager().getReferenceReductionRules(inputNode);
      if (!referenceRules.isEmpty()) {
        DefaultTemplateContext templateContext = new DefaultTemplateContext(myEnv, inputNode, null);
        for (ReferenceReductionRule rule : referenceRules) {
          if (rule.isApplicable(templateContext)) {
            rule.apply(templateContext, inputNode);
          }
        }
      }

      for (SNode inputChildNode : inputNode.getChildren()) {
        SContainmentLink childRole = inputChildNode.getContainmentLink();
        assert childRole != null;

        Collection<SNode> outputChildNodes = myEnv.tryToReduce(inputChildNode);
        if (outputChildNodes != null) {
          myDeltaBuilder.registerSubTree(inputChildNode, childRole, outputChildNodes);
          myIsChanged = true;
        } else {
          if (jetbrains.mps.smodel.SNodeUtil.link_BaseConcept_smodelAttribute.equals(childRole) && checkAttributeDropRules(inputChildNode)) {
            myDeltaBuilder.registerSubTree(inputChildNode, childRole, Collections.<SNode>emptyList());
            myIsChanged = true;
          } else {
            visitInputNode(inputChildNode);
          }
        }
    }
    }
  }

  private static class FullCopyFacility extends NodeCopyFacility {
    private final Set<SNode> myAdditionalInputNodes;
    private final SModel myInputModel;
    private final SModelReference myOutputModelRef;
    private final Factory myNodeFactory;

    public FullCopyFacility(TemplateExecutionEnvironmentImpl env) {
      this(env, Collections.<SNode>emptySet());
    }
    public FullCopyFacility(TemplateExecutionEnvironmentImpl env, Set<SNode> additionalInputs) {
      super(env);
      myAdditionalInputNodes = additionalInputs;
      myInputModel = env.getGenerator().getInputModel();
      myOutputModelRef = env.getOutputModel().getReference();
      myNodeFactory = new RegularSModelFactory();
    }

    @Override
    protected void drop(SNode inputRootNode, TemplateDropRootRule rule) {
    }

    @Override
    public void copyRootInputNode(@NotNull SNode inputRootNode) throws GenerationFailureException, GenerationCanceledException {
      // copy
      SNode root = copyInputNode(inputRootNode);
      myEnv.getGenerator().registerRoot(new GeneratedRootDescriptor(root, inputRootNode));
    }

    private void reportBrokenRef(@NotNull SNode inputNode, @NotNull SReference ref) {
      getLogger().error(inputNode.getReference(),
          String.format("broken reference '%s' in %s (target model is null)", ref.getLink().getName(), SNodeOperations.getDebugText(inputNode)),
          GeneratorUtil.describeIfExists(inputNode, "input node"));
    }

    public SNode copyInputNode(@NotNull SNode inputNode) throws GenerationFailureException, GenerationCanceledException {
      // no reduction found - do node copying
      SNode outputNode;
      final SModel inputNodeModel = inputNode.getModel();
      if (inputNode.getNodeId() != null && inputNodeModel != null) {
        // copy preserving id
        outputNode = myNodeFactory.create(inputNode);
      } else {
        outputNode = myEnv.getOutputModel().createNode(inputNode.getConcept());
      }
      myEnv.getGenerator().recordCopyInputTrace(inputNode, outputNode);
      myEnv.blockReductionsForCopiedNode(inputNode, outputNode); // prevent infinite applying of the same reduction to the 'same' node.

      // output node should be accessible via 'findCopiedNode'
      myEnv.getGenerator().addCopiedOutputNodeForInputNode(inputNode, outputNode);

      CopyUtil.copyProperties(inputNode, outputNode);
      CopyUtil.copyUserObjects(inputNode, outputNode);

      final List<ReferenceReductionRule> referenceRules = myEnv.getGenerator().getRuleManager().getReferenceReductionRules(inputNode);
      final Set<SReferenceLink> handledReferences;
      if (!referenceRules.isEmpty()) {
        handledReferences = new HashSet<>();
        DefaultTemplateContext templateContext = new DefaultTemplateContext(myEnv, inputNode, null);
        for (ReferenceReductionRule rule : referenceRules) {
          if (rule.isApplicable(templateContext)) {
            handledReferences.add(rule.getApplicableLink());
            rule.apply(templateContext, outputNode);
          }
        }
      } else {
        handledReferences = Collections.emptySet();
      }


      for (SReference inputReference : inputNode.getReferences()) {
        if (handledReferences.contains(inputReference.getLink())) {
          continue;
        }
        if (inputNodeModel != null) {
          boolean external = true;
          if (inputReference instanceof PostponedReference){
            external = false;
          } else if (inputNodeModel.getReference().equals(inputReference.getTargetSModelReference())){
            external = false;
          }
          if (inputReference instanceof DynamicReference || external) {
            // dynamic & external references don't need validation => replace input model with output
            SModelReference targetModelReference = external ? inputReference.getTargetSModelReference() : myOutputModelRef;
            if (inputReference instanceof StaticReference) {
              if (targetModelReference == null) {
                reportBrokenRef(inputNode, inputReference);
                continue;
              }

              SReference reference = new StaticReference(
                  inputReference.getLink(),
                  outputNode,
                  targetModelReference,
                  inputReference.getTargetNodeId(),
                  ((StaticReference) inputReference).getResolveInfo());
              outputNode.setReference(reference.getLink(), reference);
            } else if (inputReference instanceof DynamicReference) {
              DynamicReference outputReference = new DynamicReference(
                  inputReference.getLink(),
                  outputNode,
                  targetModelReference,
                  ((DynamicReference) inputReference).getResolveInfo());
              outputReference.setOrigin(((DynamicReference) inputReference).getOrigin());
              outputNode.setReference(outputReference.getLink(), outputReference);
            } else {
              String msg = "internal error: can't clone reference '%s' in %s. Reference class: %s";
              getLogger().error(inputNode.getReference(),
                  String.format(msg, inputReference.getLink().getName(), SNodeOperations.getDebugText(inputNode), inputReference.getClass().getName()));
            }
            continue;
          }
        }

        SNode refTarget = jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(inputReference);
        if (refTarget == null) {
          reportBrokenRef(inputNode, inputReference);
          continue;
        }

        if (refTarget.getModel() != null && refTarget.getModel().equals(myInputModel) || myAdditionalInputNodes.contains(refTarget)) {
          ReferenceInfo_CopiedInputNode refInfo = new ReferenceInfo_CopiedInputNode(inputNode, refTarget);
          new PostponedReference(inputReference.getLink(), outputNode, refInfo).registerWith(myEnv.getGenerator());
        } else if (refTarget.getModel() != null) {
          SNodeAccessUtil.setReferenceTarget(outputNode, inputReference.getLink(), refTarget);
        } else {
          reportBrokenRef(inputNode, inputReference);
        }
      }

      for (SNode inputChildNode : inputNode.getChildren()) {
        SContainmentLink childRole = inputChildNode.getContainmentLink();
        assert childRole != null;

        Collection<SNode> outputChildNodes = myEnv.tryToReduce(inputChildNode);
        if (outputChildNodes != null) {
          myIsChanged = true;
          RoleValidator rv = myEnv.getGenerator().getChildRoleValidator(outputNode, childRole);
          for (SNode outputChildNode : outputChildNodes) {
            // check child
            Status status = rv.validate(outputChildNode);
            if (status != null) {
              getLogger().warning(inputChildNode.getReference(), status.getMessage("copy input node"),
                  status.describe(GeneratorUtil.describeIfExists(TracingUtil.getInput(inputNode), "origin")));
            }
            outputNode.addChild(childRole, outputChildNode);
          }
        } else {
          if (jetbrains.mps.smodel.SNodeUtil.link_BaseConcept_smodelAttribute.equals(childRole) && checkAttributeDropRules(inputChildNode)) {
            // attribute conforms to drop rule, ignore and do not copy.
            continue;
          }
          outputNode.addChild(childRole, copyInputNode(inputChildNode));
        }
      }

      return outputNode;
    }
  }

}
