package jetbrains.mps.baseLanguage.behavior;

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
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class ArrayType__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getPresentation_idhEwIMiw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPresentation").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIMiw").registry(REGISTRY).build();
  public static final SMethod<String> getErasureSignature_idhEwIzNx = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getErasureSignature").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNx").registry(REGISTRY).build();
  public static final SMethod<SNode> getErasure_idB1mAlA38Mq = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getErasure").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("B1mAlA38Mq").registry(REGISTRY).build();
  public static final SMethod<SNode> getJavaType_idhEwIzO1 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getJavaType").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzO1").registry(REGISTRY).build();
  public static final SMethod<SNode> getClassExpression_idhEwIzOd = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getClassExpression").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzOd").registry(REGISTRY).build();
  public static final SMethod<List<String>> getVariableSuffixes_idhEwIzNo = new SMethodBuilder<List<String>>(new SJavaCompoundTypeImpl((Class<List<String>>) ((Class) Object.class))).name("getVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNo").registry(REGISTRY).build();
  public static final SMethod<Boolean> hasPluralVariableSuffixes_id1gn9ujF3bz3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasPluralVariableSuffixes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PROTECTED)).concept(CONCEPT).id("1gn9ujF3bz3").registry(REGISTRY).build();
  public static final SMethod<SNode> getAbstractCreator_idhEwIzNW = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getAbstractCreator").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIzNW").registry(REGISTRY).build();
  public static final SMethod<String> jniSignature_id7F81Cd2C7e3 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("jniSignature").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7F81Cd2C7e3").registry(REGISTRY).build();
  public static final SMethod<Boolean> isReifiable_id2soW6EObTNQ = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isReifiable").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2soW6EObTNQ").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeCoerced_id476YRQvP9l3 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeCoerced").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("476YRQvP9l3").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""));
  public static final SMethod<SNode> eraseGenerics_id4qyz6djw13y = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("eraseGenerics").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4qyz6djw13y").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getPresentation_idhEwIMiw, getErasureSignature_idhEwIzNx, getErasure_idB1mAlA38Mq, getJavaType_idhEwIzO1, getClassExpression_idhEwIzOd, getVariableSuffixes_idhEwIzNo, hasPluralVariableSuffixes_id1gn9ujF3bz3, getAbstractCreator_idhEwIzNW, jniSignature_id7F81Cd2C7e3, isReifiable_id2soW6EObTNQ, canBeCoerced_id476YRQvP9l3, eraseGenerics_id4qyz6djw13y);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getPresentation_idhEwIMiw(@NotNull SNode __thisNode__) {
    if (SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")) == null) {
      return "???[]";
    }
    return BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"))) + "[]";
  }
  /*package*/ static String getErasureSignature_idhEwIzNx(@NotNull SNode __thisNode__) {
    return Type__BehaviorDescriptor.getErasureSignature_idhEwIzNx.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"))) + "[]";
  }
  /*package*/ static SNode getErasure_idB1mAlA38Mq(@NotNull SNode __thisNode__) {
    SNode result = SNodeOperations.copyNode(__thisNode__);
    SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"), Type__BehaviorDescriptor.getErasure_idB1mAlA38Mq.invoke(SLinkOperations.getTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"))));
    return result;
  }
  /*package*/ static SNode getJavaType_idhEwIzO1(@NotNull SNode __thisNode__) {
    SNode result = SNodeOperations.copyNode(__thisNode__);
    SLinkOperations.setTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"), Type__BehaviorDescriptor.getJavaType_idhEwIzO1.invoke(SLinkOperations.getTarget(result, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"))));
    return result;
  }
  /*package*/ static SNode getClassExpression_idhEwIzOd(@NotNull SNode __thisNode__) {
    SNode expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x115f7830a32a65e7L, "jetbrains.mps.baseLanguage.structure.ArrayClassExpression"));
    SLinkOperations.setTarget(expr, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x115f7830a32a65e7L, 0x115f7830a32a65e8L, "arrayType"), SNodeOperations.cast(Type__BehaviorDescriptor.getErasure_idB1mAlA38Mq.invoke(__thisNode__), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")));
    return expr;
  }
  /*package*/ static List<String> getVariableSuffixes_idhEwIzNo(@NotNull SNode __thisNode__) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "array");
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")) != null)) {
      if ((boolean) Type__BehaviorDescriptor.hasPluralVariableSuffixes_id1gn9ujF3bz3.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")))) {
        for (String suffix : Type__BehaviorDescriptor.getVariableSuffixes_idhEwIzNo.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")))) {
          if (!(ListSequence.fromList(variableSuffixes).contains(suffix))) {
            ListSequence.fromList(variableSuffixes).addElement(suffix);
          }
        }
      } else {
        for (String suffix : Type__BehaviorDescriptor.getVariableSuffixes_idhEwIzNo.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")))) {
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
    SNode arrayCreator = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x113e4952f12L, "jetbrains.mps.baseLanguage.structure.ArrayCreator"));
    SNode type = SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"));
    while (SNodeOperations.isInstanceOf(type, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType"))) {
      type = SLinkOperations.getTarget(SNodeOperations.cast(type, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"));
      SLinkOperations.addNewChild(arrayCreator, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x113e4952f12L, 0x113e4b36742L, "dimensionExpression"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x113e4b2dfdaL, "jetbrains.mps.baseLanguage.structure.DimensionExpression"));
    }
    SLinkOperations.setTarget(arrayCreator, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x113e4952f12L, 0x113e49578edL, "componentType"), SNodeOperations.copyNode(type));
    return arrayCreator;
  }
  /*package*/ static String jniSignature_id7F81Cd2C7e3(@NotNull SNode __thisNode__) {
    return "[" + Type__BehaviorDescriptor.jniSignature_id7F81Cd2C7e3.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")));
  }
  /*package*/ static boolean isReifiable_id2soW6EObTNQ(@NotNull SNode __thisNode__) {
    return (boolean) Type__BehaviorDescriptor.isReifiable_id2soW6EObTNQ.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")));
  }
  /*package*/ static boolean canBeCoerced_id476YRQvP9l3(@NotNull SNode __thisNode__, SAbstractConcept c) {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType").equals(c) || MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType").equals(c);
  }
  /*package*/ static SNode eraseGenerics_id4qyz6djw13y(@NotNull SNode __thisNode__) {
    SNode copy = SNodeOperations.copyNode(__thisNode__);
    SNode componentType = SLinkOperations.getTarget(copy, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType"));
    if (SNodeOperations.isInstanceOf(componentType, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
      SNodeOperations.replaceWithAnother(componentType, SNodeOperations.cast(IGenericType__BehaviorDescriptor.eraseGenerics_id4qyz6djw13y.invoke(SNodeOperations.cast(componentType, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type")));
    }
    return copy;
  }

  /*package*/ ArrayType__BehaviorDescriptor() {
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
        return (T) ((String) getErasureSignature_idhEwIzNx(node));
      case 2:
        return (T) ((SNode) getErasure_idB1mAlA38Mq(node));
      case 3:
        return (T) ((SNode) getJavaType_idhEwIzO1(node));
      case 4:
        return (T) ((SNode) getClassExpression_idhEwIzOd(node));
      case 5:
        return (T) ((List<String>) getVariableSuffixes_idhEwIzNo(node));
      case 6:
        return (T) ((Boolean) hasPluralVariableSuffixes_id1gn9ujF3bz3(node));
      case 7:
        return (T) ((SNode) getAbstractCreator_idhEwIzNW(node));
      case 8:
        return (T) ((String) jniSignature_id7F81Cd2C7e3(node));
      case 9:
        return (T) ((Boolean) isReifiable_id2soW6EObTNQ(node));
      case 10:
        return (T) ((Boolean) canBeCoerced_id476YRQvP9l3(node, (SAbstractConcept) parameters[0]));
      case 11:
        return (T) ((SNode) eraseGenerics_id4qyz6djw13y(node));
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
