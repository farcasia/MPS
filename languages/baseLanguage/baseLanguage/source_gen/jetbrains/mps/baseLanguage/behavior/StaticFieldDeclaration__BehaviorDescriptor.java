package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import java.util.List;
import jetbrains.mps.smodel.runtime.IconResource;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.project.Project;
import jetbrains.mps.baseLanguage.scopes.MembersPopulatingContext;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.util.CodeStyleSettings;
import jetbrains.mps.baseLanguage.util.CodeStyleSettingsRegistry;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.scopes.FieldSignature;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public final class StaticFieldDeclaration__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<List<IconResource>> getIconMarks_id6TtJ6IUkhQJ = new SMethodBuilder<List<IconResource>>(new SJavaCompoundTypeImpl((Class<List<IconResource>>) ((Class) Object.class))).name("getIconMarks").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6TtJ6IUkhQJ").registry(REGISTRY).build();
  public static final SMethod<Boolean> isInitializable_idhEwJfMK = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isInitializable").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwJfMK").registry(REGISTRY).build();
  public static final SMethod<SNode> createReference_idhEwJfME = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("createReference").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwJfME").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getChildrenToDisplayIntention_id3vsDNFqJVhw = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getChildrenToDisplayIntention").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3vsDNFqJVhw").registry(REGISTRY).build();
  public static final SMethod<Boolean> isStatic_id7MS72Gc8avw = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isStatic").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7MS72Gc8avw").registry(REGISTRY).build();
  public static final SMethod<IconResource> getSideIcon_id6TtJ6IUjtJX = new SMethodBuilder<IconResource>(new SJavaCompoundTypeImpl(IconResource.class)).name("getSideIcon").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6TtJ6IUjtJX").registry(REGISTRY).build();
  public static final SMethod<Boolean> canBeInterfaceMember_id2zJQqQIUx2B = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canBeInterfaceMember").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2zJQqQIUx2B").registry(REGISTRY).build();
  public static final SMethod<String> getSuffix_id2Bet8mWh3pg = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getSuffix").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2Bet8mWh3pg").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Project.class, ""));
  public static final SMethod<String> getPrefix_id2Bet8mWh2lw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPrefix").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2Bet8mWh2lw").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Project.class, ""));
  public static final SMethod<String> getTraceableProperty_id4pl5GY7LKmH = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getTraceableProperty").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4pl5GY7LKmH").registry(REGISTRY).build();
  public static final SMethod<Void> populateMember_id6r77ob2UW9O = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("populateMember").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6r77ob2UW9O").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(MembersPopulatingContext.class, ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<SNode> getQualifiedReference_id3Zg$dTLuqo9 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getQualifiedReference").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3Zg$dTLuqo9").registry(REGISTRY).build();
  public static final SMethod<Void> markDeprecated_id6Va_BJexupi = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("markDeprecated").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6Va_BJexupi").registry(REGISTRY).build();
  public static final SMethod<Void> unmarkDeprecated_id6Va_BJex$aE = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("unmarkDeprecated").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6Va_BJex$aE").registry(REGISTRY).build();
  public static final SMethod<Void> markLoadedNodeAsDeprecated_id5H8W9_ECCQE = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("markLoadedNodeAsDeprecated").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5H8W9_ECCQE").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<String> getFqName_idhEwIO9y = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getFqName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIO9y").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getIconMarks_id6TtJ6IUkhQJ, isInitializable_idhEwJfMK, createReference_idhEwJfME, getChildrenToDisplayIntention_id3vsDNFqJVhw, isStatic_id7MS72Gc8avw, getSideIcon_id6TtJ6IUjtJX, canBeInterfaceMember_id2zJQqQIUx2B, getSuffix_id2Bet8mWh3pg, getPrefix_id2Bet8mWh2lw, getTraceableProperty_id4pl5GY7LKmH, populateMember_id6r77ob2UW9O, getQualifiedReference_id3Zg$dTLuqo9, markDeprecated_id6Va_BJexupi, unmarkDeprecated_id6Va_BJex$aE, markLoadedNodeAsDeprecated_id5H8W9_ECCQE, getFqName_idhEwIO9y);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static List<IconResource> getIconMarks_id6TtJ6IUkhQJ(@NotNull SNode __thisNode__) {
    List<IconResource> markIcons = new ArrayList<IconResource>(BaseConcept__BehaviorDescriptor.getIconMarks_id6TtJ6IUkhQJ.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")));
    markIcons.add(BLIconMarks.STATIC);
    return markIcons;
  }
  /*package*/ static boolean isInitializable_idhEwJfMK(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static SNode createReference_idhEwJfME(@NotNull SNode __thisNode__) {
    SNode ref = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"));
    SLinkOperations.setTarget(ref, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), __thisNode__);
    return ref;
  }
  /*package*/ static List<SNode> getChildrenToDisplayIntention_id3vsDNFqJVhw(@NotNull SNode __thisNode__) {
    List<SNode> result = HasAnnotation__BehaviorDescriptor.getChildrenToDisplayIntention_id3vsDNFqJVhw.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"));
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")));
    return result;
  }
  /*package*/ static boolean isStatic_id7MS72Gc8avw(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static IconResource getSideIcon_id6TtJ6IUjtJX(@NotNull SNode __thisNode__) {
    return ((IconResource) IVisible__BehaviorDescriptor.getVisibilityIcon_id4mxbjAOAG0d.invoke(__thisNode__));
  }
  /*package*/ static boolean canBeInterfaceMember_id2zJQqQIUx2B(@NotNull SAbstractConcept __thisConcept__) {
    return true;
  }
  /*package*/ static String getSuffix_id2Bet8mWh3pg(@NotNull SNode __thisNode__, Project project) {
    CodeStyleSettings settings = CodeStyleSettingsRegistry.getSettings(project);
    if (settings == null) {
      return "";
    }
    return (settings.getStaticFieldSuffix() == null ? "" : settings.getStaticFieldSuffix());
  }
  /*package*/ static String getPrefix_id2Bet8mWh2lw(@NotNull SNode __thisNode__, Project project) {
    CodeStyleSettings settings = CodeStyleSettingsRegistry.getSettings(project);
    if (settings == null) {
      return "";
    }
    return (settings.getStaticFieldPrefix() == null ? "" : settings.getStaticFieldPrefix());
  }
  @Nullable
  /*package*/ static String getTraceableProperty_id4pl5GY7LKmH(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  /*package*/ static void populateMember_id6r77ob2UW9O(@NotNull SNode __thisNode__, MembersPopulatingContext context, SNode classifier) {
    if (!(context.isElementVisible(__thisNode__)) || SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) == null) {
      return;
    }
    context.addMember(__thisNode__, new FieldSignature(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))));
    context.hideMembers(new FieldSignature(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))));
  }
  /*package*/ static SNode getQualifiedReference_id3Zg$dTLuqo9(@NotNull SNode __thisNode__) {
    return _quotation_createNode_ge0l0h_a0a11(SNodeOperations.cast(SNodeOperations.getParent(__thisNode__), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier")), __thisNode__);
  }
  /*package*/ static void markDeprecated_id6Va_BJexupi(@NotNull SNode __thisNode__) {
    IBLDeprecatable__BehaviorDescriptor.markDeprecated_id6Va_BJexupi.invoke0(__thisNode__, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d2ea8a339L, "jetbrains.mps.baseLanguage.structure.IBLDeprecatable"));
    if ((AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))) == null)) {
      SNodeFactoryOperations.setNewAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")));
    }
    if (!(((boolean) IBLDeprecatable__BehaviorDescriptor.hasDeprecatedBlockDocTag_id3yvWaPI09DC.invoke(__thisNode__)))) {
      SNodeFactoryOperations.addNewChild(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x757ba20a4c87f964L, "jetbrains.mps.baseLanguage.javadoc.structure.DeprecatedBlockDocTag")));
    }
    AnnotationUtil.attachAnnotation(__thisNode__, SNodeOperations.getNode("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)", "~Deprecated"));
  }
  /*package*/ static void unmarkDeprecated_id6Va_BJex$aE(@NotNull SNode __thisNode__) {
    IBLDeprecatable__BehaviorDescriptor.unmarkDeprecated_id6Va_BJex$aE.invoke0(__thisNode__, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d2ea8a339L, "jetbrains.mps.baseLanguage.structure.IBLDeprecatable"));
    IBLDeprecatable__BehaviorDescriptor.removeDeprecationFromDoc_id63oBH1IM79r.invoke(__thisNode__, AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment"))));
    AnnotationUtil.detachAnnotation(__thisNode__, SNodeOperations.getNode("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)", "~Deprecated"));
  }
  /*package*/ static void markLoadedNodeAsDeprecated_id5H8W9_ECCQE(@NotNull SAbstractConcept __thisConcept__, SNode node) {
    AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")), DeprecationUtil.createDocComment(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x5ed0d79d7dc44bf2L, "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment")));
  }
  /*package*/ static String getFqName_idhEwIO9y(@NotNull SNode __thisNode__) {
    SNode containingClassifier = SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), false, false);
    if (containingClassifier != null) {
      return INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(containingClassifier) + "." + SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    }
    return INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke0(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
  }

  /*package*/ StaticFieldDeclaration__BehaviorDescriptor() {
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
        return (T) ((List<IconResource>) getIconMarks_id6TtJ6IUkhQJ(node));
      case 1:
        return (T) ((Boolean) isInitializable_idhEwJfMK(node));
      case 2:
        return (T) ((SNode) createReference_idhEwJfME(node));
      case 3:
        return (T) ((List<SNode>) getChildrenToDisplayIntention_id3vsDNFqJVhw(node));
      case 4:
        return (T) ((Boolean) isStatic_id7MS72Gc8avw(node));
      case 5:
        return (T) ((IconResource) getSideIcon_id6TtJ6IUjtJX(node));
      case 7:
        return (T) ((String) getSuffix_id2Bet8mWh3pg(node, (Project) parameters[0]));
      case 8:
        return (T) ((String) getPrefix_id2Bet8mWh2lw(node, (Project) parameters[0]));
      case 9:
        return (T) ((String) getTraceableProperty_id4pl5GY7LKmH(node));
      case 10:
        populateMember_id6r77ob2UW9O(node, (MembersPopulatingContext) parameters[0], (SNode) parameters[1]);
        return null;
      case 11:
        return (T) ((SNode) getQualifiedReference_id3Zg$dTLuqo9(node));
      case 12:
        markDeprecated_id6Va_BJexupi(node);
        return null;
      case 13:
        unmarkDeprecated_id6Va_BJex$aE(node);
        return null;
      case 15:
        return (T) ((String) getFqName_idhEwIO9y(node));
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
      case 6:
        return (T) ((Boolean) canBeInterfaceMember_id2zJQqQIUx2B(concept));
      case 14:
        markLoadedNodeAsDeprecated_id5H8W9_ECCQE(concept, (SNode) parameters[0]);
        return null;
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
  private static SNode _quotation_createNode_ge0l0h_a0a11(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940c80846L, "StaticFieldReference"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940c80846L, 0x10a75869f9bL, "classifier"), (SNode) parameter_1);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), (SNode) parameter_2);
    return quotedNode_3;
  }
}
