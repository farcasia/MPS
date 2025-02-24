package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.IMemberContainer__BehaviorDescriptor;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class BTestCase__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<List<SNode>> getTestSet_idhGB2z8L = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getTestSet").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hGB2z8L").registry(REGISTRY).build();
  public static final SMethod<String> getClassName_idhGBnqtL = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getClassName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hGBnqtL").registry(REGISTRY).build();
  public static final SMethod<Boolean> isMpsStartRequired_id2RMg39tmiFh = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("isMpsStartRequired").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2RMg39tmiFh").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getTestMethods_id1RfJDyhAUar = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getTestMethods").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1RfJDyhAUar").registry(REGISTRY).build();
  public static final SMethod<List<SNode>> getMembers_idhEwJjl2 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getMembers").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwJjl2").registry(REGISTRY).build();
  public static final SMethod<String> getSimpleClassName_idhSQIE8p = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getSimpleClassName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hSQIE8p").registry(REGISTRY).build();
  public static final SMethod<Boolean> canRunInProcess_id5_jSk8paieB = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canRunInProcess").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5_jSk8paieB").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getTestSet_idhGB2z8L, getClassName_idhGBnqtL, isMpsStartRequired_id2RMg39tmiFh, getTestMethods_id1RfJDyhAUar, getMembers_idhEwJjl2, getSimpleClassName_idhSQIE8p, canRunInProcess_id5_jSk8paieB);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static List<SNode> getTestSet_idhGB2z8L(@NotNull SNode __thisNode__) {
    SNode node = __thisNode__;
    List<SNode> methods = new ArrayList<SNode>();
    if ((SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")) != null) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))) {
      List<SNode> superMethods = ITestCase__BehaviorDescriptor.getTestSet_idhGB2z8L.invoke(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase")));
      ListSequence.fromList(methods).addSequence(ListSequence.fromList(superMethods));
    }
    ListSequence.fromList(methods).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, 0x110dc94e924L, "testMethodList")), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc95061dL, 0x110dc95061eL, "testMethod"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode method) {
        return (ListSequence.fromList(SLinkOperations.getChildren(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation"))).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode annotation) {
            return SLinkOperations.getTarget(annotation, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation")).equals(SNodeOperations.getNode("49808fad-9d41-4b96-83fa-9231640f6b2b/java:org.junit(JUnit/)", "~Ignore"));
          }
        }) == null);
      }
    }));
    return methods;
  }
  /*package*/ static String getClassName_idhGBnqtL(@NotNull SNode __thisNode__) {
    return ((String) INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(__thisNode__));
  }
  /*package*/ static boolean isMpsStartRequired_id2RMg39tmiFh(@NotNull SNode __thisNode__) {
    for (SNode annotationInstance : ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation")))) {
      if (SLinkOperations.getTarget(annotationInstance, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation")).equals(SNodeOperations.getNode("920eaa0e-ecca-46bc-bee7-4e5c59213dd6/java:jetbrains.mps(Testbench/)", "~MPSLaunch"))) {
        return true;
      }
    }
    for (SNode method : SLinkOperations.getChildren(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, 0x110dc94e924L, "testMethodList")), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc95061dL, 0x110dc95061eL, "testMethod"))) {
      for (SNode annotationInstance : SLinkOperations.getChildren(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation"))) {
        if (SLinkOperations.getTarget(annotationInstance, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6b4ccabL, 0x114a6b85d40L, "annotation")).equals(SNodeOperations.getNode("920eaa0e-ecca-46bc-bee7-4e5c59213dd6/java:jetbrains.mps(Testbench/)", "~MPSLaunch"))) {
          return true;
        }
      }
    }
    return false;
  }
  /*package*/ static List<SNode> getTestMethods_id1RfJDyhAUar(@NotNull SNode __thisNode__) {
    List<SNode> result = new ArrayList<SNode>();
    if (!(SPropertyOperations.getBoolean(__thisNode__, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0xfa5cee6dfaL, "abstractClass")))) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, 0x110dc94e924L, "testMethodList")), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc95061dL, 0x110dc95061eL, "testMethod"))));
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(ITestCase__BehaviorDescriptor.getTestMethods_id1RfJDyhAUar.invoke(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase")))));
      }
    }
    return result;
  }
  /*package*/ static List<SNode> getMembers_idhEwJjl2(@NotNull SNode __thisNode__) {
    List<SNode> members = IMemberContainer__BehaviorDescriptor.getMembers_idhEwJjl2.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase"));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, 0x110dc94e924L, "testMethodList")), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc95061dL, 0x110dc95061eL, "testMethod"))));
    return members;
  }
  /*package*/ static String getSimpleClassName_idhSQIE8p(@NotNull SNode __thisNode__) {
    return NameUtil.toValidCamelIdentifier(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  /*package*/ static boolean canRunInProcess_id5_jSk8paieB(@NotNull SNode __thisNode__) {
    return false;
  }

  /*package*/ BTestCase__BehaviorDescriptor() {
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
        return (T) ((List<SNode>) getTestSet_idhGB2z8L(node));
      case 1:
        return (T) ((String) getClassName_idhGBnqtL(node));
      case 2:
        return (T) ((Boolean) isMpsStartRequired_id2RMg39tmiFh(node));
      case 3:
        return (T) ((List<SNode>) getTestMethods_id1RfJDyhAUar(node));
      case 4:
        return (T) ((List<SNode>) getMembers_idhEwJjl2(node));
      case 5:
        return (T) ((String) getSimpleClassName_idhSQIE8p(node));
      case 6:
        return (T) ((Boolean) canRunInProcess_id5_jSk8paieB(node));
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
