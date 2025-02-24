package jetbrains.mps.console.ideCommands.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.console.tool.ConsoleContext;
import jetbrains.mps.console.tool.ConsoleStream;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.generator.GenPlanExtractor;
import jetbrains.mps.generator.ModelGenerationPlan;
import jetbrains.mps.console.ideCommands.util.PartitioningHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.impl.plan.GenerationPlan;
import jetbrains.mps.generator.impl.plan.EngagedGeneratorCollector;
import java.util.ArrayList;
import java.util.function.Consumer;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class ShowGenPlan__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, "jetbrains.mps.console.ideCommands.structure.ShowGenPlan");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Void> doExecute_id2SpVAIqougW = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("doExecute").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2SpVAIqougW").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(ConsoleContext.class, ""), SMethodBuilder.createJavaParameter(ConsoleStream.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(doExecute_id2SpVAIqougW);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void doExecute_id2SpVAIqougW(@NotNull SNode __thisNode__, ConsoleContext context, ConsoleStream console) {
    SRepository repo = context.getProject().getRepository();
    SModel model = ModelReference__BehaviorDescriptor.getModel_id67MRmR$z8Z2.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x61f2dd6de47f867aL, "targetModel")), repo);
    if (model == null) {
      return;
    }

    MessagesViewTool messagesView = context.getProject().getComponent(MessagesViewTool.class);

    // by default, show generation plan as Make/Generate would see it. 
    // If forced, however, may ignore context and show default (model content based) plan. 

    GenPlanExtractor gpExtractor = new GenPlanExtractor(repo, messagesView.newHandler());
    final ModelGenerationPlan externalPlan = (gpExtractor.hasPlan(model) ? gpExtractor.getPlan(model) : null);

    PartitioningHelper helper = new PartitioningHelper(messagesView, console);
    ModelGenerationPlan gp;
    if (SPropertyOperations.getBoolean(__thisNode__, MetaAdapterFactory.getProperty(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x2c510b378f8ce5ddL, "ignoreExternalPlan"))) {
      gp = new GenerationPlan(model);
      if (externalPlan != null) {
        console.addText("Model has alternative plan configured externally, ignored\n");
      }
    } else if (externalPlan != null) {
      console.addText("Model uses custom plan configured externally\n");
      gp = externalPlan;
    } else {
      // regular sequence, do not ignore external plan, but there's none 
      gp = new GenerationPlan(model);
    }

    helper.show(gp);
    EngagedGeneratorCollector egc = new EngagedGeneratorCollector(model, null);
    egc.getGenerators();
    helper.printLanguages(egc.getDirectlyUsedLanguages());
    final ArrayList<String> trace = new ArrayList<String>();
    egc.dump(new Consumer<String>() {
      public void accept(String s) {
        trace.add(s);
      }
    });
    helper.printToConsole("Engaged generators with trace:", trace);
    helper.printConnectedComponents(Sequence.<SModel>singleton(model));
  }

  /*package*/ ShowGenPlan__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        doExecute_id2SpVAIqougW(node, (ConsoleContext) parameters[0], (ConsoleStream) parameters[1]);
        return null;
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
