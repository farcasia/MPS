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

public final class C__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x424c173aee734dc9L, 0xbc43d0051c9b1e8fL, 0x559729dec0461c33L, "BHL6.structure.C");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Integer> foo_id5mnatV0hxLf = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("foo").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5mnatV0hxLf").registry(REGISTRY).build();
  public static final SMethod<Integer> bar_id5mnatV0hxLE = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("bar").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5mnatV0hxLE").registry(REGISTRY).build();
  public static final SMethod<Object> virtual_id47lrFSh1$Ca = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("virtual").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("47lrFSh1$Ca").registry(REGISTRY).build();
  public static final SMethod<Object> nonVirtual_id7zO8mNAVkj1 = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("nonVirtual").modifiers(SModifiersImpl.create(1, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7zO8mNAVkj1").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(foo_id5mnatV0hxLf, bar_id5mnatV0hxLE, virtual_id47lrFSh1$Ca, nonVirtual_id7zO8mNAVkj1);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static int foo_id5mnatV0hxLf(@NotNull SAbstractConcept __thisConcept__) {
    return ((int) C__BehaviorDescriptor.bar_id5mnatV0hxLE.invoke(__thisConcept__));
  }
  /*package*/ static int bar_id5mnatV0hxLE(@NotNull SAbstractConcept __thisConcept__) {
    return TestResults.DEFAULT_RETURN_VALUE;
  }
  /*package*/ static Object virtual_id47lrFSh1$Ca(@NotNull SAbstractConcept __thisConcept__) {
    return TestResults.POLYMORPHIC_PARENT;
  }
  /*package*/ static Object nonVirtual_id7zO8mNAVkj1(@NotNull SAbstractConcept __thisConcept__) {
    return C__BehaviorDescriptor.virtual_id47lrFSh1$Ca.invoke(__thisConcept__);
  }

  /*package*/ C__BehaviorDescriptor() {
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
      case 0:
        return (T) ((Integer) foo_id5mnatV0hxLf(concept));
      case 1:
        return (T) ((Integer) bar_id5mnatV0hxLE(concept));
      case 2:
        return (T) ((Object) virtual_id47lrFSh1$Ca(concept));
      case 3:
        return (T) ((Object) nonVirtual_id7zO8mNAVkj1(concept));
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
