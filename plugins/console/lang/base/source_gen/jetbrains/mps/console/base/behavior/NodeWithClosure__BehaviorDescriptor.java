package jetbrains.mps.console.base.behavior;

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
import jetbrains.mps.project.MPSProject;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.console.actions.ClosureHoldingNodeUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class NodeWithClosure__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0xf6d4d958ec2f2c6L, "jetbrains.mps.console.base.structure.NodeWithClosure");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Runnable> execute_id7oNS25df64x = new SMethodBuilder<Runnable>(new SJavaCompoundTypeImpl(Runnable.class)).name("execute").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7oNS25df64x").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(MPSProject.class, ""));
  public static final SMethod<Boolean> canExecute_id2QdC0h7dh1h = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("canExecute").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2QdC0h7dh1h").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(execute_id7oNS25df64x, canExecute_id2QdC0h7dh1h);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Runnable execute_id7oNS25df64x(@NotNull SNode __thisNode__, MPSProject project) {
    return ClosureHoldingNodeUtil.getInstance().getClosure(__thisNode__);
  }
  /*package*/ static boolean canExecute_id2QdC0h7dh1h(@NotNull SNode __thisNode__) {
    return ClosureHoldingNodeUtil.getInstance().getClosure(__thisNode__) != null;
  }

  /*package*/ NodeWithClosure__BehaviorDescriptor() {
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
        return (T) ((Runnable) execute_id7oNS25df64x(node, (MPSProject) parameters[0]));
      case 1:
        return (T) ((Boolean) canExecute_id2QdC0h7dh1h(node));
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
