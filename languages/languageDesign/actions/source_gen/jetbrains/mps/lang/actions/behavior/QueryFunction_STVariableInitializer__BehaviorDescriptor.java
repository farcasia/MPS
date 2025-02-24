package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import org.jetbrains.mps.openapi.language.SConcept;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public final class QueryFunction_STVariableInitializer__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1182d1b57deL, "jetbrains.mps.lang.actions.structure.QueryFunction_STVariableInitializer");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<SNode> getExpectedReturnType_idhEwIGRD = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getExpectedReturnType").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIGRD").registry(REGISTRY).build();
  public static final SMethod<Boolean> usesParameterObject_id1653mnvAgq0 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("usesParameterObject").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1653mnvAgq0").registry(REGISTRY).build();
  public static final SMethod<List<SConcept>> getParameterConcepts_id2xELmDxyi2v = new SMethodBuilder<List<SConcept>>(new SJavaCompoundTypeImpl((Class<List<SConcept>>) ((Class) Object.class))).name("getParameterConcepts").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2xELmDxyi2v").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getExpectedReturnType_idhEwIGRD, usesParameterObject_id1653mnvAgq0, getParameterConcepts_id2xELmDxyi2v);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static SNode getExpectedReturnType_idhEwIGRD(@NotNull SNode __thisNode__) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1182d1a6565L, "jetbrains.mps.lang.actions.structure.SideTransformVariableDeclaration"))) {
      return SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1182d1a6565L, "jetbrains.mps.lang.actions.structure.SideTransformVariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")));
    }
    return _quotation_createNode_f9d5ph_a1a0();
  }
  /*package*/ static boolean usesParameterObject_id1653mnvAgq0(@NotNull SAbstractConcept __thisConcept__) {
    return true;
  }
  /*package*/ static List<SConcept> getParameterConcepts_id2xELmDxyi2v(@NotNull SNode __thisNode__) {
    List<SConcept> result = ConceptFunction__BehaviorDescriptor.getParameterConcepts_id2xELmDxyi2v.invoke0(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, "jetbrains.mps.baseLanguage.structure.ConceptFunction"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x112284c7b8bL, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x13744753c81f424aL, 0x9c1bcf8943bf4e86L, 0x10e761c927aL, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext"));
    ListSequence.fromList(result).addElement(MetaAdapterFactory.getConcept(0x13744753c81f424aL, 0x9c1bcf8943bf4e86L, 0x10e761b3745L, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model"));
    return result;
  }

  /*package*/ QueryFunction_STVariableInitializer__BehaviorDescriptor() {
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
        return (T) ((SNode) getExpectedReturnType_idhEwIGRD(node));
      case 2:
        return (T) ((List<SConcept>) getParameterConcepts_id2xELmDxyi2v(node));
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
      case 1:
        return (T) ((Boolean) usesParameterObject_id1653mnvAgq0(concept));
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
  private static SNode _quotation_createNode_f9d5ph_a1a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
