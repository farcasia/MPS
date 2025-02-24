package jetbrains.mps.lang.behavior.test.behavior;

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
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class B__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xa18fb831fb54541L, 0x97c9a13312451954L, 0x41ab5625f92e5b5eL, "jetbrains.mps.lang.behavior.test.structure.B");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> abstractVirtualMethod_id46FlynTbIB0 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("abstractVirtualMethod").modifiers(SModifiersImpl.create(14, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbIB0").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<String> virtualMethod_id46FlynTbICa = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("virtualMethod").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbICa").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<String> nonVirtualMethod_id46FlynTbICr = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("nonVirtualMethod").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbICr").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<String> virtualMethod_id46FlynTbAzL = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("virtualMethod").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbAzL").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<String> staticVirtualMethod_id46FlynTbAGG = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("staticVirtualMethod").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbAGG").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  public static final SMethod<Void> doInvokeAll_id46FlynTbJDa = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("doInvokeAll").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("46FlynTbJDa").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(abstractVirtualMethod_id46FlynTbIB0, virtualMethod_id46FlynTbICa, nonVirtualMethod_id46FlynTbICr, virtualMethod_id46FlynTbAzL, staticVirtualMethod_id46FlynTbAGG, doInvokeAll_id46FlynTbJDa);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String virtualMethod_id46FlynTbICa(@NotNull SNode __thisNode__, String in, int dummy) {
    return "B";
  }
  /*package*/ static String nonVirtualMethod_id46FlynTbICr(@NotNull SNode __thisNode__, String in, int dummy) {
    return "B";
  }
  /*package*/ static String virtualMethod_id46FlynTbAzL(@NotNull SNode __thisNode__, String in, int dummy) {
    return "B";
  }
  /*package*/ static String staticVirtualMethod_id46FlynTbAGG(@NotNull SAbstractConcept __thisConcept__, String in, int dummy) {
    return "B";
  }
  /*package*/ static void doInvokeAll_id46FlynTbJDa(@NotNull SNode __thisNode__) {
    B__BehaviorDescriptor.abstractVirtualMethod_id46FlynTbIB0.invoke(__thisNode__, ((int) 0));
    B__BehaviorDescriptor.abstractVirtualMethod_id46FlynTbIB0.invoke(__thisNode__, ((int) 0));
    // 
    B__BehaviorDescriptor.virtualMethod_id46FlynTbICa.invoke(__thisNode__, "from B", ((int) 0));
    B__BehaviorDescriptor.virtualMethod_id46FlynTbICa.invoke(__thisNode__, "from B", ((int) 0));
    A__BehaviorDescriptor.virtualMethod_id46FlynTbAzL.invoke(__thisNode__, "from A", ((int) 0));
    A__BehaviorDescriptor.virtualMethod_id46FlynTbAzL.invoke(__thisNode__, "from A", ((int) 0));
    // 
    B__BehaviorDescriptor.nonVirtualMethod_id46FlynTbICr.invoke(__thisNode__, "from B", ((int) 0));
    B__BehaviorDescriptor.nonVirtualMethod_id46FlynTbICr.invoke(__thisNode__, "from B", ((int) 0));
    A__BehaviorDescriptor.nonVirtualMethod_id46FlynTbAz8.invoke(__thisNode__, "from A", ((int) 0));
    A__BehaviorDescriptor.nonVirtualMethod_id46FlynTbAz8.invoke(__thisNode__, "from A", ((int) 0));
    // 
    A__BehaviorDescriptor.staticVirtualMethod_id46FlynTbAGG.invoke(__thisNode__.getConcept(), "from A", ((int) 0));
    // 
    // FIXME it's possible to declare static virtual abstract method, but impossible to call it 
    // staticAbstractVirtualMethod() 
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
      case 1:
        return (T) ((String) virtualMethod_id46FlynTbICa(node, (String) parameters[0], ((int) (Integer) parameters[1])));
      case 2:
        return (T) ((String) nonVirtualMethod_id46FlynTbICr(node, (String) parameters[0], ((int) (Integer) parameters[1])));
      case 3:
        return (T) ((String) virtualMethod_id46FlynTbAzL(node, (String) parameters[0], ((int) (Integer) parameters[1])));
      case 5:
        doInvokeAll_id46FlynTbJDa(node);
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
      case 4:
        return (T) ((String) staticVirtualMethod_id46FlynTbAGG(concept, (String) parameters[0], ((int) (Integer) parameters[1])));
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
