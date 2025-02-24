package jetbrains.mps.baseLanguage.collections.behavior;

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
import org.jetbrains.mps.openapi.model.SModel;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;

public final class MapType__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, "jetbrains.mps.baseLanguage.collections.structure.MapType");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getPresentation_idhEwIMiw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPresentation").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIMiw").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getAbstractCreators_id6A07P3f4z36 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getAbstractCreators").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6A07P3f4z36").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SModel>) ((Class) Object.class), ""));
  public static final SMethod<SNode> getClassExpression_idhEwIzOd = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getClassExpression").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzOd").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeCoerced_id476YRQvP9l3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeCoerced").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("476YRQvP9l3").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getPresentation_idhEwIMiw, getAbstractCreators_id6A07P3f4z36, getClassExpression_idhEwIzOd, canBeCoerced_id476YRQvP9l3);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getPresentation_idhEwIMiw(@NotNull SNode __thisNode__) {
    return SConceptOperations.conceptAlias(SNodeOperations.getConcept(__thisNode__)) + "<" + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f62a8L, "keyType"))) + "," + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f8516L, "valueType"))) + ">";
  }
  /*package*/ static List<SNode> getAbstractCreators_id6A07P3f4z36(@NotNull SNode __thisNode__, SModel targetModel) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(_quotation_createNode_icy1a5_a0a1a1(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f62a8L, "keyType")), SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f8516L, "valueType"))));
    ListSequence.fromList(result).addElement(_quotation_createNode_icy1a5_a0a2a1(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f62a8L, "keyType")), SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f8516L, "valueType"))));
    ListSequence.fromList(result).addSequence(Sequence.fromIterable(CustomContainersUtil.containerCreators(targetModel, __thisNode__)));
    return result;
  }
  /*package*/ static SNode getClassExpression_idhEwIzOd(@NotNull SNode __thisNode__) {
    return _quotation_createNode_icy1a5_a0a2();
  }
  /*package*/ static boolean canBeCoerced_id476YRQvP9l3(@NotNull SNode __thisNode__, SAbstractConcept c) {
    if (MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e9a0b9a890137e9L, "jetbrains.mps.baseLanguage.collections.structure.LinkedListType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e99e9ab97de7711L, "jetbrains.mps.baseLanguage.collections.structure.DequeType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x5e6446aa46ee5eecL, "jetbrains.mps.baseLanguage.collections.structure.StackType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf74491L, "jetbrains.mps.baseLanguage.collections.structure.QueueType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d91cbbcd0L, "jetbrains.mps.baseLanguage.collections.structure.SetType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10c25fb076aL, "jetbrains.mps.baseLanguage.collections.structure.ListType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c482dd1aL, "jetbrains.mps.baseLanguage.collections.structure.SortedSetType").equals(c)) {
      return false;
    }

    return true;

  }

  /*package*/ MapType__BehaviorDescriptor() {
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
        return (T) ((List<SNode>) getAbstractCreators_id6A07P3f4z36(node, (SModel) parameters[0]));
      case 2:
        return (T) ((SNode) getClassExpression_idhEwIzOd(node));
      case 3:
        return (T) ((Boolean) canBeCoerced_id476YRQvP9l3(node, (SAbstractConcept) parameters[0]));
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
  private static SNode _quotation_createNode_icy1a5_a0a1a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x116dbb34f2dL, "HashMapCreator"), null, null, false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116dbb34f2dL, 0x116dbb5b4d0L, "keyType"), HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116dbb34f2dL, 0x116dbb5d76dL, "valueType"), HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_icy1a5_a0a2a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x120c2ad6432L, "LinkedHashMapCreator"), null, null, false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116dbb34f2dL, 0x116dbb5b4d0L, "keyType"), HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116dbb34f2dL, 0x116dbb5d76dL, "valueType"), HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_icy1a5_a0a2() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)"), facade.createNodeId("~Map")));
    return quotedNode_1;
  }
}
