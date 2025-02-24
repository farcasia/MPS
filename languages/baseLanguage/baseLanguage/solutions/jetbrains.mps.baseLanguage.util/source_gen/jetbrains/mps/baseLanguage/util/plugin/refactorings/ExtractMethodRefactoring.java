package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.ArrayList;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.Set;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public abstract class ExtractMethodRefactoring {
  protected ExtractMethodRefactoringParameters myParameters;
  protected ExtractMethodRefactoringAnalyzer myAnalyzer;
  private IStaticContainerProcessor myStaticContainer;
  protected List<MethodMatch> myMatches;
  public ExtractMethodRefactoring(ExtractMethodRefactoringParameters parameters) {
    this.myParameters = parameters;
    this.myAnalyzer = parameters.getAnalyzer();
  }
  @NotNull
  public SNode doRefactor() {
    SNode body = createMethodBody();
    List<SNode> params = new ArrayList<SNode>();
    Map<SNode, SNode> inputToParams = this.createInputParameters(body, params);
    Map<SNode, SNode> inputMapping = this.createInputVaryablesMapping(inputToParams, this.myParameters.getNodesToRefactor());
    this.myMatches = new MethodDuplicatesFinder(this.myParameters.getNodesToRefactor(), inputMapping, params, this.getOutputReferences()).findDuplicates(SNodeOperations.getNodeAncestor(ListSequence.fromList(this.myParameters.getNodesToRefactor()).first(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), false, false));
    this.replaceInputVariablesByParameters(SLinkOperations.getChildren(body, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement")), inputToParams);
    SNode newMethod = this.createNewMethod(SNodeOperations.copyNode(this.getMethodType()), params, body);

    this.addMethod(newMethod);
    MethodMatch exactMatch = this.createMatch(this.myParameters.getNodesToRefactor(), inputMapping, params);
    this.replaceMatch(exactMatch, newMethod);
    MethodOptimizer.optimize(body);
    return newMethod;
  }
  protected abstract SNode createMethodBody();
  public abstract void replaceMatch(MethodMatch match, SNode methodDeclaration);
  protected MethodMatch createMatch(List<SNode> nodes, Map<SNode, SNode> inputMapping, List<SNode> parametersOrder) {
    MethodMatch match = new MethodMatch(parametersOrder);
    for (SNode node : ListSequence.fromList(nodes)) {
      match.putNode(node);
    }
    for (SNode node : SetSequence.fromSet(MapSequence.fromMap(inputMapping).keySet())) {
      match.putMapping(node, MapSequence.fromMap(inputMapping).get(node));
    }
    return match;
  }
  protected SNode createNewMethod(SNode returnType, List<SNode> params, SNode body) {
    SNode myMethod;
    if (this.myStaticContainer != null) {
      myMethod = this.myStaticContainer.createNewMethod();
    } else {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      if (processor instanceof AbstractExtractMethodRefactoringProcessor) {
        ((AbstractExtractMethodRefactoringProcessor) processor).setStatic(this.myParameters.isStatic());
      }
      myMethod = processor.createNewMethod();
    }
    this.fillBaseMethodDeclaration(myMethod, returnType, params, body);
    this.createNewDeclarations(myMethod);
    this.correctThrowsList(myMethod);
    return myMethod;
  }
  private void correctThrowsList(SNode method) {
    List<SNode> throwables = new ArrayList<SNode>();
    for (SNode statement : ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement")))) {
      ListSequence.fromList(throwables).addSequence(SetSequence.fromSet(((Set<SNode>) BHReflection.invoke0(statement, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), SMethodTrimmedId.create("uncaughtThrowables", MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), "4Gt7ANIVAVT"), ((boolean) false)))));
    }
    ListSequence.fromList(SLinkOperations.getChildren(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0x10f383d6949L, "throwsItem"))).addSequence(ListSequence.fromList(throwables).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return _quotation_createNode_jq3ovj_a0a0a0a0c0k(it);
      }
    }));
  }
  protected void createNewDeclarations(SNode method) {
    Map<SNode, List<SNode>> mapping = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    for (SNode reference : ListSequence.fromList(SNodeOperations.getNodeDescendants(method, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"), false, new SAbstractConcept[]{}))) {
      SNode declaration = SLinkOperations.getTarget(reference, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"));
      if (!((SNodeOperations.isInstanceOf(declaration, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) || SNodeOperations.isInstanceOf(declaration, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"))))) {
        continue;
      }

      if (!(ListSequence.fromList(SNodeOperations.getNodeAncestors(declaration, null, false)).contains(method))) {
        if (!(SetSequence.fromSet(MapSequence.fromMap(mapping).keySet()).contains(declaration))) {
          MapSequence.fromMap(mapping).put(declaration, new ArrayList<SNode>());
        }
        ListSequence.fromList(MapSequence.fromMap(mapping).get(declaration)).addElement(reference);
      }
    }
    for (SNode declaration : SetSequence.fromSet(MapSequence.fromMap(mapping).keySet())) {
      SNode newDeclaration = _quotation_createNode_jq3ovj_a0a0c0l(SNodeOperations.copyNode(SLinkOperations.getTarget(declaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"))), SPropertyOperations.getString(declaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).first(), _quotation_createNode_jq3ovj_a0a1a2a11(newDeclaration));
      for (SNode reference : ListSequence.fromList(MapSequence.fromMap(mapping).get(declaration))) {
        SNodeOperations.replaceWithAnother(reference, ((SNode) BHReflection.invoke0(newDeclaration, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), SMethodTrimmedId.create("createReference", null, "hEwJfME"))));
      }
    }
  }
  protected SNode fillBaseMethodDeclaration(SNode declaration, SNode returnType, List<SNode> params, SNode body) {
    if (SNodeOperations.isInstanceOf(declaration, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, "jetbrains.mps.baseLanguage.structure.IVisible"))) {
      SNode visibleDeclaration = SNodeOperations.cast(declaration, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, "jetbrains.mps.baseLanguage.structure.IVisible"));
      SLinkOperations.setTarget(visibleDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), this.myParameters.getVisibilityLevel().getNode());
    }
    SNode methodDeclaration = declaration;
    SLinkOperations.setTarget(methodDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"), SNodeOperations.copyNode(returnType));
    SPropertyOperations.set(methodDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), this.myParameters.getName());
    ListSequence.fromList(SLinkOperations.getChildren(methodDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"))).addSequence(ListSequence.fromList(params));
    SLinkOperations.setTarget(methodDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"), body);
    return methodDeclaration;
  }
  protected void addMethod(SNode node) {
    if (this.myStaticContainer == null) {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      processor.addMethod(node);
    } else {
      this.myStaticContainer.addMethod(node);
    }
  }
  protected Map<SNode, SNode> createInputParameters(SNode body, List<SNode> parameters) {
    Map<SNode, SNode> result = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (MethodParameter methodParameter : ListSequence.fromList(this.myParameters.getParameters())) {
      if (methodParameter.isSelected()) {
        SNode parameter = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"));
        SLinkOperations.setTarget(parameter, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), SNodeOperations.copyNode(methodParameter.getType()));
        SPropertyOperations.set(parameter, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), methodParameter.getName());
        if (methodParameter.isFinal()) {
          SPropertyOperations.set(parameter, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0x111f9e9f00cL, "isFinal"), "" + (true));
        }
        ListSequence.fromList(parameters).addElement(parameter);
        MapSequence.fromMap(result).put(methodParameter.getDeclaration(), parameter);
      }
    }
    return result;
  }
  public void replaceInputVariablesByParameters(List<SNode> nodes, Map<SNode, SNode> mapping) {
    Map<SNode, SNode> anotherMap = this.createInputVaryablesMapping(mapping, nodes);
    for (SNode node : SetSequence.fromSet(MapSequence.fromMap(anotherMap).keySet())) {
      SNodeOperations.replaceWithAnother(node, _quotation_createNode_jq3ovj_a0a0a1a51(MapSequence.fromMap(anotherMap).get(node)));
    }
  }
  public Map<SNode, SNode> createInputVaryablesMapping(Map<SNode, SNode> variableDeclarationToParameter, List<SNode> nodes) {
    Map<SNode, SNode> mapping = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (SNode node : ListSequence.fromList(nodes)) {
      for (SNode reference : ListSequence.fromList(SNodeOperations.getNodeDescendants(node, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept"), false, new SAbstractConcept[]{}))) {
        if (MoveRefactoringUtils.isReference(reference)) {
          SNode target = ListSequence.fromList(SNodeOperations.getReferences(reference)).first().getTargetNode();
          if (MapSequence.fromMap(variableDeclarationToParameter).containsKey(target)) {
            MapSequence.fromMap(mapping).put(reference, MapSequence.fromMap(variableDeclarationToParameter).get(target));
          }
        }
      }
      for (SNode parameter : ListSequence.fromList(SNodeOperations.getNodeDescendants(node, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d486a1d9eL, "jetbrains.mps.baseLanguage.structure.IParameter"), false, new SAbstractConcept[]{}))) {
        SNode declaration = ((SNode) BHReflection.invoke0(parameter, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d486a1d9eL, "jetbrains.mps.baseLanguage.structure.IParameter"), SMethodTrimmedId.create("getDeclaration", null, "hP8xjWn")));
        if (MapSequence.fromMap(variableDeclarationToParameter).containsKey(declaration)) {
          MapSequence.fromMap(mapping).put(parameter, MapSequence.fromMap(variableDeclarationToParameter).get(declaration));
        }
      }
    }
    return mapping;
  }
  protected SNode createReference(SNode variable) {
    return ((SNode) BHReflection.invoke0(variable, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), SMethodTrimmedId.create("createReference", null, "hEwJfME")));
  }
  protected List<SNode> createCallParameters() {
    List<SNode> result = new ArrayList<SNode>();
    for (MethodParameter parameter : ListSequence.fromList(this.myParameters.getParameters())) {
      if (parameter.isSelected()) {
        ListSequence.fromList(result).addElement(parameter.getReference());
      }
    }
    return result;
  }
  protected SNode createMethodCall(SNode methodDeclaration, List<SNode> parameters) {
    if (this.myStaticContainer == null) {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      return processor.createMethodCall(methodDeclaration, parameters);
    } else {
      return this.myStaticContainer.createMethodCall(methodDeclaration, parameters);
    }
  }
  public SNode createMethodCall(MethodMatch match, SNode methodDeclaration) {
    return this.createMethodCall(methodDeclaration, match.getCallParameters());
  }
  public void setStaticContainer(SNode node) {
    if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      this.myStaticContainer = new ClassStaticContainerProcessor(node);
    } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11c8f444674L, "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods"))) {
      SNode staticContainer = SNodeOperations.cast(node, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11c8f444674L, "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods"));
      this.myStaticContainer = ((IStaticContainerProcessor) BHReflection.invoke0(staticContainer, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11c8f444674L, "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods"), SMethodTrimmedId.create("getStaticContainerProcessor", null, "hMfhg$W"), node));
    } else {
      throw new IllegalArgumentException();
    }
  }
  public Set<SNode> getOutputReferences() {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    List<SNode> outputVariables = myParameters.getAnalyzer().getOutputVariables();
    for (SNode node : ListSequence.fromList(myParameters.getNodesToRefactor())) {
      for (SNode varReference : ListSequence.fromList(SNodeOperations.getNodeDescendants(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"), false, new SAbstractConcept[]{}))) {
        if (ListSequence.fromList(outputVariables).contains(SLinkOperations.getTarget(varReference, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")))) {
          SetSequence.fromSet(result).addElement(varReference);
        }
      }
    }
    return result;
  }
  public List<MethodMatch> getMatches() {
    return this.myMatches;
  }
  public ExtractMethodRefactoringAnalyzer getAnalyzer() {
    return myParameters.getAnalyzer();
  }
  @Nullable
  public abstract SNode getMethodType();
  public boolean canBeStatic() {
    return this.myAnalyzer.canBeStatic();
  }
  public boolean shouldBeStatic() {
    return this.myAnalyzer.shouldBeStatic();
  }
  private static SNode _quotation_createNode_jq3ovj_a0a0a0a0c0k(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_jq3ovj_a0a0c0l(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7efL, "LocalVariableDeclaration"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), (String) parameter_2);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), HUtil.copyIfNecessary(quotedNode_4));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_jq3ovj_a0a1a2a11(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7f0L, "LocalVariableDeclarationStatement"), null, null, false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, 0xf8cc67c7f1L, "localVariableDeclaration"), HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_jq3ovj_a0a0a1a51(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c77f1e98L, "VariableReference"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), (SNode) parameter_1);
    return quotedNode_2;
  }
}
