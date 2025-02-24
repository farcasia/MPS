package jetbrains.mps.lang.quotation.behavior;

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
import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.IMetaLevelChanger__BehaviorDescriptor;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class AbstractAntiquotation__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104656L, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Integer> getMetaLevelChange_idbc0iGlxcsE = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("getMetaLevelChange").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("bc0iGlxcsE").registry(REGISTRY).build();
  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Scope> getScope_id52_Geb4QFgX = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QFgX").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(SContainmentLink.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));
  /*package*/ static final SMethod<Scope> getScope_id6SHIBw3Z40z = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("6SHIBw3Z40z").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getMetaLevelChange_idbc0iGlxcsE, getScope_id52_Geb4QDV$, getScope_id52_Geb4QFgX, getScope_id6SHIBw3Z40z);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static int getMetaLevelChange_idbc0iGlxcsE(@NotNull SNode __thisNode__) {
    return 1;
  }
  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    return AbstractAntiquotation__BehaviorDescriptor.getScope_id6SHIBw3Z40z.invoke(__thisNode__, kind);
  }
  /*package*/ static Scope getScope_id52_Geb4QFgX(@NotNull SNode __thisNode__, SAbstractConcept kind, SContainmentLink link, int index) {
    return AbstractAntiquotation__BehaviorDescriptor.getScope_id6SHIBw3Z40z.invoke(__thisNode__, kind);
  }
  /*package*/ static Scope getScope_id6SHIBw3Z40z(@NotNull SNode __thisNode__, SAbstractConcept kind) {
    SNode node = __thisNode__;
    int metaLevelChange = 0;
    while ((node != null)) {
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2cc012b1584bd3aL, "jetbrains.mps.lang.core.structure.IMetaLevelChanger"))) {
        metaLevelChange += (int) IMetaLevelChanger__BehaviorDescriptor.getMetaLevelChange_idbc0iGlxcsE.invoke(SNodeOperations.cast(node, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2cc012b1584bd3aL, "jetbrains.mps.lang.core.structure.IMetaLevelChanger")));
      }
      if (metaLevelChange == 0) {
        break;
      }
      node = Scope.parent(node);
    }
    if ((node == null)) {
      return new EmptyScope();
    }
    return Scope.getScope(Scope.parent(node), node, kind);
  }

  /*package*/ AbstractAntiquotation__BehaviorDescriptor() {
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
        return (T) ((Integer) getMetaLevelChange_idbc0iGlxcsE(node));
      case 1:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      case 2:
        return (T) ((Scope) getScope_id52_Geb4QFgX(node, (SAbstractConcept) parameters[0], (SContainmentLink) parameters[1], ((int) (Integer) parameters[2])));
      case 3:
        return (T) ((Scope) getScope_id6SHIBw3Z40z(node, (SAbstractConcept) parameters[0]));
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
