package jetbrains.mps.lang.smodel.behavior;

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
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Map;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.IGenericType__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public final class SNodeListType__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aae26be32L, "jetbrains.mps.lang.smodel.structure.SNodeListType");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getPresentation_idhEwIMiw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPresentation").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIMiw").registry(REGISTRY).build();
  public static final SMethod<List<String>> getVariableSuffixes_idhEwIzNo = new SMethodBuilder<List<String>>(new SJavaCompoundTypeImpl((Class<List<String>>) ((Class) Object.class))).name("getVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNo").registry(REGISTRY).build();
  public static final SMethod<Boolean> hasPluralVariableSuffixes_id1gn9ujF3bz3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasPluralVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("1gn9ujF3bz3").registry(REGISTRY).build();
  public static final SMethod<SNode> getAbstractCreator_idhEwIzNW = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getAbstractCreator").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNW").registry(REGISTRY).build();
  public static final SMethod<SNode> getClassExpression_idhEwIzOd = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getClassExpression").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzOd").registry(REGISTRY).build();
  public static final SMethod<Boolean> hasMissingParameters_id32KZwowVoMu = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasMissingParameters").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("32KZwowVoMu").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeCoerced_id476YRQvP9l3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeCoerced").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("476YRQvP9l3").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""));
  public static final SMethod<Void> collectGenericSubstitutions_id3zZky3wF74h = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("collectGenericSubstitutions").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3zZky3wF74h").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<Map<SNode, SNode>>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getPresentation_idhEwIMiw, getVariableSuffixes_idhEwIzNo, hasPluralVariableSuffixes_id1gn9ujF3bz3, getAbstractCreator_idhEwIzNW, getClassExpression_idhEwIzOd, hasMissingParameters_id32KZwowVoMu, canBeCoerced_id476YRQvP9l3, collectGenericSubstitutions_id3zZky3wF74h);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getPresentation_idhEwIMiw(@NotNull SNode __thisNode__) {
    SNode conceptDeclaration = SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aae26be32L, 0x10aae27c421L, "elementConcept"));
    return (conceptDeclaration == null ? "nlist< >" : "nlist<" + SPropertyOperations.getString(conceptDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + ">");
  }
  /*package*/ static List<String> getVariableSuffixes_idhEwIzNo(@NotNull SNode __thisNode__) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "nodes");
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aae26be32L, 0x10aae27c421L, "elementConcept")) != null)) {
      String name = NameUtil.pluralize(NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aae26be32L, 0x10aae27c421L, "elementConcept")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }
  /*package*/ static boolean hasPluralVariableSuffixes_id1gn9ujF3bz3(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static SNode getAbstractCreator_idhEwIzNW(@NotNull SNode __thisNode__) {
    SNode creator = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10ab923b94aL, "jetbrains.mps.lang.smodel.structure.SNodeListCreator"));
    SLinkOperations.setTarget(creator, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10ab923b94aL, 0x10ab92468d9L, "createdType"), SNodeOperations.copyNode(__thisNode__));
    return creator;
  }
  /*package*/ static SNode getClassExpression_idhEwIzOd(@NotNull SNode __thisNode__) {
    return _quotation_createNode_r176b6_a0a4();
  }
  /*package*/ static boolean hasMissingParameters_id32KZwowVoMu(@NotNull SNode __thisNode__) {
    return (SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x10aae26be32L, 0x10aae27c421L, "elementConcept")) == null);
  }
  /*package*/ static boolean canBeCoerced_id476YRQvP9l3(@NotNull SNode __thisNode__, SAbstractConcept c) {
    if (MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e9a0b9a890137e9L, "jetbrains.mps.baseLanguage.collections.structure.LinkedListType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e99e9ab97de7711L, "jetbrains.mps.baseLanguage.collections.structure.DequeType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x5e6446aa46ee5eecL, "jetbrains.mps.baseLanguage.collections.structure.StackType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf74491L, "jetbrains.mps.baseLanguage.collections.structure.QueueType").equals(c)) {
      return false;
    }
    return true;
  }
  /*package*/ static void collectGenericSubstitutions_id3zZky3wF74h(@NotNull SNode __thisNode__, Map<SNode, SNode> substitutions) {
    IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(_quotation_createNode_r176b6_a0a0h(), substitutions);
  }

  /*package*/ SNodeListType__BehaviorDescriptor() {
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
        return (T) ((String) getPresentation_idhEwIMiw(node));
      case 1:
        return (T) ((List<String>) getVariableSuffixes_idhEwIzNo(node));
      case 2:
        return (T) ((Boolean) hasPluralVariableSuffixes_id1gn9ujF3bz3(node));
      case 3:
        return (T) ((SNode) getAbstractCreator_idhEwIzNW(node));
      case 4:
        return (T) ((SNode) getClassExpression_idhEwIzOd(node));
      case 5:
        return (T) ((Boolean) hasMissingParameters_id32KZwowVoMu(node));
      case 6:
        return (T) ((Boolean) canBeCoerced_id476YRQvP9l3(node, (SAbstractConcept) parameters[0]));
      case 7:
        collectGenericSubstitutions_id3zZky3wF74h(node, (Map<SNode, SNode>) parameters[0]);
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
  private static SNode _quotation_createNode_r176b6_a0a4() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)"), facade.createNodeId("~List")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_r176b6_a0a0h() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)"), facade.createNodeId("~List")));
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_2.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_2, facade.createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)"), facade.createNodeId("~SNode")));
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter"), quotedNode_2);
    return quotedNode_1;
  }
}
