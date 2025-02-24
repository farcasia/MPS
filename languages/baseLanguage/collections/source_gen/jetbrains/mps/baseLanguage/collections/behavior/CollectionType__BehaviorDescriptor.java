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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.behavior.Type__BehaviorDescriptor;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public final class CollectionType__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x62e1df06bd2172b2L, "jetbrains.mps.baseLanguage.collections.structure.CollectionType");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getPresentation_idhEwIMiw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPresentation").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIMiw").registry(REGISTRY).build();
  public static final SMethod<List<String>> getVariableSuffixes_idhEwIzNo = new SMethodBuilder<List<String>>(new SJavaCompoundTypeImpl((Class<List<String>>) ((Class) Object.class))).name("getVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNo").registry(REGISTRY).build();
  public static final SMethod<Boolean> hasPluralVariableSuffixes_id1gn9ujF3bz3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasPluralVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("1gn9ujF3bz3").registry(REGISTRY).build();
  public static final SMethod<SNode> getAbstractCreator_idhEwIzNW = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getAbstractCreator").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNW").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getAbstractCreators_id6A07P3f4z36 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getAbstractCreators").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6A07P3f4z36").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SModel>) ((Class) Object.class), ""));
  public static final SMethod<SNode> getClassExpression_idhEwIzOd = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getClassExpression").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzOd").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeCoerced_id476YRQvP9l3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeCoerced").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("476YRQvP9l3").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getPresentation_idhEwIMiw, getVariableSuffixes_idhEwIzNo, hasPluralVariableSuffixes_id1gn9ujF3bz3, getAbstractCreator_idhEwIzNW, getAbstractCreators_id6A07P3f4z36, getClassExpression_idhEwIzOd, canBeCoerced_id476YRQvP9l3);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getPresentation_idhEwIMiw(@NotNull SNode __thisNode__) {
    return SConceptOperations.conceptAlias(SNodeOperations.getConcept(__thisNode__)) + "<" + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"))) + ">";
  }
  /*package*/ static List<String> getVariableSuffixes_idhEwIzNo(@NotNull SNode __thisNode__) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), SConceptOperations.conceptAlias(SNodeOperations.getConcept(__thisNode__)));
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType")) != null)) {
      if ((boolean) Type__BehaviorDescriptor.hasPluralVariableSuffixes_id1gn9ujF3bz3.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType")))) {
        for (String suffix : Type__BehaviorDescriptor.getVariableSuffixes_idhEwIzNo.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType")))) {
          if (!(ListSequence.fromList(variableSuffixes).contains(suffix))) {
            ListSequence.fromList(variableSuffixes).addElement(suffix);
          }
        }
      } else {
        for (String suffix : Type__BehaviorDescriptor.getVariableSuffixes_idhEwIzNo.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType")))) {
          ListSequence.fromList(variableSuffixes).addElement(NameUtil.pluralize(suffix));
        }
      }
    }
    return variableSuffixes;
  }
  /*package*/ static boolean hasPluralVariableSuffixes_id1gn9ujF3bz3(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static SNode getAbstractCreator_idhEwIzNW(@NotNull SNode __thisNode__) {
    return null;
  }
  /*package*/ static List<SNode> getAbstractCreators_id6A07P3f4z36(@NotNull SNode __thisNode__, SModel targetModel) {
    return null;
  }
  /*package*/ static SNode getClassExpression_idhEwIzOd(@NotNull SNode __thisNode__) {
    return _quotation_createNode_tehk2k_a0a5();
  }
  /*package*/ static boolean canBeCoerced_id476YRQvP9l3(@NotNull SNode __thisNode__, SAbstractConcept c) {
    if (MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e9a0b9a890137e9L, "jetbrains.mps.baseLanguage.collections.structure.LinkedListType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10c25fb076aL, "jetbrains.mps.baseLanguage.collections.structure.ListType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d91cbbcd0L, "jetbrains.mps.baseLanguage.collections.structure.SetType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf74491L, "jetbrains.mps.baseLanguage.collections.structure.QueueType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e99e9ab97de7711L, "jetbrains.mps.baseLanguage.collections.structure.DequeType").equals(c) || MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x5e6446aa46ee5eecL, "jetbrains.mps.baseLanguage.collections.structure.StackType").equals(c)) {
      return false;
    }
    return true;
  }

  /*package*/ CollectionType__BehaviorDescriptor() {
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
        return (T) ((List<SNode>) getAbstractCreators_id6A07P3f4z36(node, (SModel) parameters[0]));
      case 5:
        return (T) ((SNode) getClassExpression_idhEwIzOd(node));
      case 6:
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
  private static SNode _quotation_createNode_tehk2k_a0a5() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)"), facade.createNodeId("~Collection")));
    return quotedNode_1;
  }
}
