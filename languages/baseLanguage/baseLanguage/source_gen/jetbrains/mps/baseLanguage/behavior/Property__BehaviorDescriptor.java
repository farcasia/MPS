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
import jetbrains.mps.smodel.runtime.IconResource;
import jetbrains.mps.baseLanguage.scopes.MembersPopulatingContext;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.scopes.VisibilityUtil;
import java.util.Objects;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.baseLanguage.scopes.ClassifierScopeUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class Property__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, "jetbrains.mps.baseLanguage.structure.Property");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> isDefaultImplementation_idhEwIIZu = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isDefaultImplementation").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIIZu").registry(REGISTRY).build();
  public static final SMethod<Boolean> isCustomImplementation_idhEwIIZC = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isCustomImplementation").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIIZC").registry(REGISTRY).build();
  public static final SMethod<Boolean> isCustomSetterOnlyImplementation_id2hzApTi_Lsg = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isCustomSetterOnlyImplementation").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2hzApTi_Lsg").registry(REGISTRY).build();
  public static final SMethod<SNode> getCustomPropertyImplementation_idhEwIIZM = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getCustomPropertyImplementation").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIIZM").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getCustomSetterStatements_id2hzApTjcJcI = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getCustomSetterStatements").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2hzApTjcJcI").registry(REGISTRY).build();
  public static final SMethod<String> getPropertyNameWithId_idhEwIIZU = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPropertyNameWithId").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIIZU").registry(REGISTRY).build();
  public static final SMethod<String> getBackingVarName_id1tRxQXfvLw = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getBackingVarName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1tRxQXfvLw").registry(REGISTRY).build();
  public static final SMethod<String> getGetterMethodName_idhEwIJ02 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGetterMethodName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIJ02").registry(REGISTRY).build();
  public static final SMethod<String> getSetterMethodName_idhEwIJ0b = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getSetterMethodName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIJ0b").registry(REGISTRY).build();
  public static final SMethod<SNode> getSetterVisibility_idhEwIJ0k = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getSetterVisibility").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIJ0k").registry(REGISTRY).build();
  public static final SMethod<Boolean> isSetterVisible_id5WTl5xSBxvj = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isSetterVisible").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5WTl5xSBxvj").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Boolean> hasSetter_idhEwIJ0S = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("hasSetter").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIJ0S").registry(REGISTRY).build();
  public static final SMethod<IconResource> getSideIcon_id6TtJ6IUjtJX = new SMethodBuilder<IconResource>(new SJavaCompoundTypeImpl(IconResource.class)).name("getSideIcon").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6TtJ6IUjtJX").registry(REGISTRY).build();
  public static final SMethod<Void> populateMember_id6r77ob2UW9O = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("populateMember").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6r77ob2UW9O").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(MembersPopulatingContext.class, ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<String> getFqName_idhEwIO9y = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getFqName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIO9y").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(isDefaultImplementation_idhEwIIZu, isCustomImplementation_idhEwIIZC, isCustomSetterOnlyImplementation_id2hzApTi_Lsg, getCustomPropertyImplementation_idhEwIIZM, getCustomSetterStatements_id2hzApTjcJcI, getPropertyNameWithId_idhEwIIZU, getBackingVarName_id1tRxQXfvLw, getGetterMethodName_idhEwIJ02, getSetterMethodName_idhEwIJ0b, getSetterVisibility_idhEwIJ0k, isSetterVisible_id5WTl5xSBxvj, hasSetter_idhEwIJ0S, getSideIcon_id6TtJ6IUjtJX, populateMember_id6r77ob2UW9O, getFqName_idhEwIO9y);

  private static void ___init___(@NotNull SNode __thisNode__) {
    SLinkOperations.setNewChild(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9581ff1L, "jetbrains.mps.baseLanguage.structure.PublicVisibility"));
    SLinkOperations.setTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation"), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation")), null));
  }

  /*package*/ static boolean isDefaultImplementation_idhEwIIZu(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation"));
  }
  /*package*/ static boolean isCustomImplementation_idhEwIIZC(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b8f1b18eL, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation"));
  }
  /*package*/ static boolean isCustomSetterOnlyImplementation_id2hzApTi_Lsg(@NotNull SNode __thisNode__) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3b7a2005a14cfe5eL, "jetbrains.mps.baseLanguage.structure.CustomSetterPropertyImplementation"));
  }
  /*package*/ static SNode getCustomPropertyImplementation_idhEwIIZM(@NotNull SNode __thisNode__) {
    return SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b8f1b18eL, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation"));
  }
  /*package*/ static List<SNode> getCustomSetterStatements_id2hzApTjcJcI(@NotNull SNode __thisNode__) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b8f1b18eL, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation"))) {
      return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b8f1b18eL, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b8f1b18eL, 0x117bd9b26faL, "setAccessor")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117bd9ac3d9L, 0x11800260be3L, "statementList")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"));
    } else {
      return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3b7a2005a14cfe5eL, "jetbrains.mps.baseLanguage.structure.CustomSetterPropertyImplementation")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3b7a2005a14cfe5eL, 0x3b7a2005a14d0185L, "setAccessor")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117bd9ac3d9L, 0x11800260be3L, "statementList")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"));
    }
  }
  /*package*/ static String getPropertyNameWithId_idhEwIIZU(@NotNull SNode __thisNode__) {
    return NameUtil.capitalize(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75204e4L, "propertyName")));
  }
  /*package*/ static String getBackingVarName_id1tRxQXfvLw(@NotNull SNode __thisNode__) {
    return "my" + Property__BehaviorDescriptor.getPropertyNameWithId_idhEwIIZU.invoke(__thisNode__);
  }
  /*package*/ static String getGetterMethodName_idhEwIJ02(@NotNull SNode __thisNode__) {
    return (check_9xvv7i_a0a0h(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b752a0b9L, "type"))) ? "is" + Property__BehaviorDescriptor.getPropertyNameWithId_idhEwIIZU.invoke(__thisNode__) : "get" + Property__BehaviorDescriptor.getPropertyNameWithId_idhEwIIZU.invoke(__thisNode__));
  }
  /*package*/ static String getSetterMethodName_idhEwIJ0b(@NotNull SNode __thisNode__) {
    return "set" + Property__BehaviorDescriptor.getPropertyNameWithId_idhEwIIZU.invoke(__thisNode__);
  }
  /*package*/ static SNode getSetterVisibility_idhEwIJ0k(@NotNull SNode __thisNode__) {
    SNode visibility = SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
    if (((boolean) Property__BehaviorDescriptor.isDefaultImplementation_idhEwIIZu.invoke(__thisNode__))) {
      SNode setterVisibility = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, 0x117e16fe6eaL, "defaultSetAccessor")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117e16a7273L, 0x117e16abba2L, "visibility"));
      if ((setterVisibility != null)) {
        visibility = setterVisibility;
      }
    }
    return visibility;
  }
  /*package*/ static boolean isSetterVisible_id5WTl5xSBxvj(@NotNull SNode __thisNode__, final SNode contextClassifier, SNode contextNode) {
    SNode setterVisibility = Property__BehaviorDescriptor.getSetterVisibility_idhEwIJ0k.invoke(__thisNode__);
    // public 
    if (SNodeOperations.isInstanceOf(setterVisibility, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9581ff1L, "jetbrains.mps.baseLanguage.structure.PublicVisibility"))) {
      return true;
    }
    // private 
    if (SNodeOperations.isInstanceOf(setterVisibility, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9586f0cL, "jetbrains.mps.baseLanguage.structure.PrivateVisibility"))) {
      return ListSequence.fromList(SNodeOperations.getNodeAncestors(contextNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), true)).last() == ListSequence.fromList(SNodeOperations.getNodeAncestors(contextClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), true)).last();
    }
    // default 
    String contextNodePackage = VisibilityUtil.packageName(contextNode);
    String contextClassifierPackage = VisibilityUtil.packageName(contextClassifier);
    if ((setterVisibility == null)) {
      return Objects.equals(contextNodePackage, contextClassifierPackage);
    }
    // protected 
    if (SNodeOperations.isInstanceOf(setterVisibility, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af958b686L, "jetbrains.mps.baseLanguage.structure.ProtectedVisibility"))) {
      String declarationClassifierPackage = VisibilityUtil.packageName(Classifier__BehaviorDescriptor.getContextClassifier_id5mDmeD1aaq0.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier")), __thisNode__));
      if (Objects.equals(contextNodePackage, declarationClassifierPackage)) {
        return true;
      }

      // two cases: 1) from class 2) from dot expression 
      Iterable<SNode> possibleClassifiers = ListSequence.fromList(SNodeOperations.getNodeAncestors(contextNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), true)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SetSequence.fromSet(ClassifierScopeUtils.getExtendedClassifiers(it)).contains(contextClassifier);
        }
      });
      if (!(SNodeOperations.isInstanceOf(contextNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")))) {
        // 1 
        return Sequence.fromIterable(possibleClassifiers).isNotEmpty();
      } else {
        // 2 
        SNode leftClassifier = DotExpression__BehaviorDescriptor.getClassifier_idhEwIPI9.invoke(SNodeOperations.cast(contextNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")));
        final Set<SNode> extendedClassifiers = SetSequence.fromSetWithValues(new HashSet<SNode>(), ClassifierScopeUtils.getExtendedClassifiers(leftClassifier));
        return Sequence.fromIterable(possibleClassifiers).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SetSequence.fromSet(extendedClassifiers).contains(it);
          }
        });
      }
    }

    return false;
  }
  /*package*/ static boolean hasSetter_idhEwIJ0S(@NotNull SNode __thisNode__) {
    return (boolean) PropertyImplementation__BehaviorDescriptor.hasSetter_idhEwIUA2.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")));
  }
  /*package*/ static IconResource getSideIcon_id6TtJ6IUjtJX(@NotNull SNode __thisNode__) {
    return ((IconResource) IVisible__BehaviorDescriptor.getVisibilityIcon_id4mxbjAOAG0d.invoke(__thisNode__));
  }
  /*package*/ static void populateMember_id6r77ob2UW9O(@NotNull SNode __thisNode__, MembersPopulatingContext context, SNode classifier) {
    // todo: just populate for now, make it right! 
    context.addMember(__thisNode__, null);
  }
  /*package*/ static String getFqName_idhEwIO9y(@NotNull SNode __thisNode__) {
    SNode containingClassifier = SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), false, false);
    if (containingClassifier != null) {
      return INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(containingClassifier) + "." + SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    }
    return INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke0(__thisNode__, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, "jetbrains.mps.lang.core.structure.INamedConcept"));
  }

  /*package*/ Property__BehaviorDescriptor() {
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
        return (T) ((Boolean) isDefaultImplementation_idhEwIIZu(node));
      case 1:
        return (T) ((Boolean) isCustomImplementation_idhEwIIZC(node));
      case 2:
        return (T) ((Boolean) isCustomSetterOnlyImplementation_id2hzApTi_Lsg(node));
      case 3:
        return (T) ((SNode) getCustomPropertyImplementation_idhEwIIZM(node));
      case 4:
        return (T) ((List<SNode>) getCustomSetterStatements_id2hzApTjcJcI(node));
      case 5:
        return (T) ((String) getPropertyNameWithId_idhEwIIZU(node));
      case 6:
        return (T) ((String) getBackingVarName_id1tRxQXfvLw(node));
      case 7:
        return (T) ((String) getGetterMethodName_idhEwIJ02(node));
      case 8:
        return (T) ((String) getSetterMethodName_idhEwIJ0b(node));
      case 9:
        return (T) ((SNode) getSetterVisibility_idhEwIJ0k(node));
      case 10:
        return (T) ((Boolean) isSetterVisible_id5WTl5xSBxvj(node, (SNode) parameters[0], (SNode) parameters[1]));
      case 11:
        return (T) ((Boolean) hasSetter_idhEwIJ0S(node));
      case 12:
        return (T) ((IconResource) getSideIcon_id6TtJ6IUjtJX(node));
      case 13:
        populateMember_id6r77ob2UW9O(node, (MembersPopulatingContext) parameters[0], (SNode) parameters[1]);
        return null;
      case 14:
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
  private static boolean check_9xvv7i_a0a0h(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return SNodeOperations.isInstanceOf(checkedDotOperand, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d6513eL, "jetbrains.mps.baseLanguage.structure.BooleanType"));
    }
    return false;
  }
}
