package BHL6.behavior;

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
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import UtilSolution.util.TestResults;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class B__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x424c173aee734dc9L, 0xbc43d0051c9b1e8fL, 0x559729dec0460fdaL, "BHL6.structure.B");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Integer> foo_id5mnatV0hwZQ = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5mnatV0hwZQ").registry(REGISTRY).build();
  public static final SMethod<Integer> bar_id5mnatV0hx04 = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("bar").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5mnatV0hx04").registry(REGISTRY).build();
  public static final SMethod<Integer> bar1_id5jWiLvujSC6 = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("bar1").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5jWiLvujSC6").registry(REGISTRY).build();
  public static final SMethod<Integer> foo1_id5jWiLvujSmw = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo1").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5jWiLvujSmw").registry(REGISTRY).build();
  public static final SMethod<Integer> foo2_id5jWiLvujSzJ = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo2").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5jWiLvujSzJ").registry(REGISTRY).build();
  public static final SMethod<Integer> foo3_id4RMBeRWcio1 = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.class)).name("foo3").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4RMBeRWcio1").registry(REGISTRY).build();
  /*package*/ static final SMethod<Integer> privateMethod_id1olXtyGAKnt = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("privateMethod").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("1olXtyGAKnt").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Object.class, ""));
  public static final SMethod<Integer> foo4_id1olXtyGAKpB = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo4").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1olXtyGAKpB").registry(REGISTRY).build();
  public static final SMethod<Integer> foo5_id1olXtyGAKsY = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo5").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1olXtyGAKsY").registry(REGISTRY).build();
  public static final SMethod<Object> foo6_id186XXh$CxOf = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("foo6").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("186XXh$CxOf").registry(REGISTRY).build();
  public static final SMethod<Object> foo7_id1eK5xBtRuXu = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("foo7").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1eK5xBtRuXu").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(foo_id5mnatV0hwZQ, bar_id5mnatV0hx04, bar1_id5jWiLvujSC6, foo1_id5jWiLvujSmw, foo2_id5jWiLvujSzJ, foo3_id4RMBeRWcio1, privateMethod_id1olXtyGAKnt, foo4_id1olXtyGAKpB, foo5_id1olXtyGAKsY, foo6_id186XXh$CxOf, foo7_id1eK5xBtRuXu);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static int foo_id5mnatV0hwZQ(@NotNull SNode __thisNode__) {
    return ((int) B__BehaviorDescriptor.bar_id5mnatV0hx04.invoke(__thisNode__));
  }
  /*package*/ static int bar_id5mnatV0hx04(@NotNull SNode __thisNode__) {
    return TestResults.DEFAULT_RETURN_VALUE;
  }
  /*package*/ static int bar1_id5jWiLvujSC6(@NotNull SNode __thisNode__) {
    return TestResults.INCORRECT_RETURN_VALUE;
  }
  /*package*/ static int foo1_id5jWiLvujSmw(@NotNull SNode __thisNode__) {
    return TestResults.DEFAULT_RETURN_VALUE;
  }
  /*package*/ static int foo2_id5jWiLvujSzJ(@NotNull SNode __thisNode__) {
    return ((int) B__BehaviorDescriptor.bar1_id5jWiLvujSC6.invoke(__thisNode__));
  }
  /*package*/ static Integer foo3_id4RMBeRWcio1(@NotNull SNode __thisNode__) {
    return Integer.valueOf(1);
  }
  /*package*/ static int privateMethod_id1olXtyGAKnt(@NotNull SNode __thisNode__, Object obj) {
    return TestResults.DEFAULT_RETURN_VALUE;
  }
  /*package*/ static int foo4_id1olXtyGAKpB(@NotNull SNode __thisNode__) {
    return ((int) B__BehaviorDescriptor.privateMethod_id1olXtyGAKnt.invoke(__thisNode__, null));
  }
  /*package*/ static int foo5_id1olXtyGAKsY(@NotNull SNode __thisNode__) {
    return ((int) B__BehaviorDescriptor.privateMethod_id1olXtyGAKnt.invoke(__thisNode__, null));
  }
  /*package*/ static Object foo6_id186XXh$CxOf(@NotNull SNode __thisNode__) {
    return TestResults.POLYMORPHIC_PARENT;
  }
  /*package*/ static Object foo7_id1eK5xBtRuXu(@NotNull SNode __thisNode__) {
    return TestResults.POLYMORPHIC_PARENT;
  }

  /*package*/ B__BehaviorDescriptor() {
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
        return (T) ((Integer) foo_id5mnatV0hwZQ(node));
      case 1:
        return (T) ((Integer) bar_id5mnatV0hx04(node));
      case 2:
        return (T) ((Integer) bar1_id5jWiLvujSC6(node));
      case 3:
        return (T) ((Integer) foo1_id5jWiLvujSmw(node));
      case 4:
        return (T) ((Integer) foo2_id5jWiLvujSzJ(node));
      case 5:
        return (T) ((Integer) foo3_id4RMBeRWcio1(node));
      case 6:
        return (T) ((Integer) privateMethod_id1olXtyGAKnt(node, (Object) parameters[0]));
      case 7:
        return (T) ((Integer) foo4_id1olXtyGAKpB(node));
      case 8:
        return (T) ((Integer) foo5_id1olXtyGAKsY(node));
      case 9:
        return (T) ((Object) foo6_id186XXh$CxOf(node));
      case 10:
        return (T) ((Object) foo7_id1eK5xBtRuXu(node));
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
