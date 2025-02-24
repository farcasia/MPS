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
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.scope.Scope;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.scopes.Scopes;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class SwitchStatement__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, "jetbrains.mps.baseLanguage.structure.SwitchStatement");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Void> collectUncaughtMethodThrowables_id4Gt7ANIVH8f = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("collectUncaughtMethodThrowables").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4Gt7ANIVH8f").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<Set<SNode>>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(Boolean.TYPE, ""));
  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(collectUncaughtMethodThrowables_id4Gt7ANIVH8f, getScope_id52_Geb4QDV$);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void collectUncaughtMethodThrowables_id4Gt7ANIVH8f(@NotNull SNode __thisNode__, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    if (!(ignoreMayBeThrowables)) {
      Statement__BehaviorDescriptor.collectUncaughtMethodThrowables_id4Gt7ANIVBW7.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement")), throwables, SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02ec241L, "expression")));
    }
    for (SNode caseNode : ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case")))) {
      SwitchCase__BehaviorDescriptor.collectUncaughtThrowables_id3JrbGEZ6KoZ.invoke(caseNode, throwables, ((boolean) ignoreMayBeThrowables));
    }
    if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02c1b6eL, "defaultBlock")) != null)) {
      StatementList__BehaviorDescriptor.collectUncaughtThrowables_id4Gt7ANIVHca.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02c1b6eL, "defaultBlock")), throwables, ((boolean) ignoreMayBeThrowables));
    }
  }
  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    SNode childStatement = child;
    while ((childStatement != null) && SNodeOperations.getParent(childStatement) != __thisNode__) {
      childStatement = SNodeOperations.getParent(childStatement);
    }

    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"))) {
      if (SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02ec241L, "expression")) == childStatement) {
        return ScopeUtils.lazyParentScope(__thisNode__, kind);
      }

      List<SNode> variables = new ArrayList<SNode>();
      for (SNode caseNode : SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case"))) {
        if (caseNode == childStatement) {
          break;
        }
        ListSequence.fromList(variables).addSequence(ListSequence.fromList(StatementList__BehaviorDescriptor.getLocalVariableDeclarations_id3tkxRydYUUs.invoke(SLinkOperations.getTarget(caseNode, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02cdd1bL, 0x10ef02d8048L, "body")), null)));
      }
      return Scopes.forVariables(kind, variables, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x50c493bf9552f6aL, "jetbrains.mps.baseLanguage.structure.LoopLabel"))) {
      List<SNode> parameter = new ArrayList<SNode>();
      if ((SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x4091554b655a230eL, "switchLabel")) != null)) {
        ListSequence.fromList(parameter).addElement(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x4091554b655a230eL, "switchLabel")));
      }
      SNode[] nodesInScope = new SNode[ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case"))).count() + 1];
      for (int i = 0; i < ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case"))).count(); i++) {
        nodesInScope[i] = ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case"))).getElement(i);
      }
      nodesInScope[nodesInScope.length - 1] = SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02c1b6eL, "defaultBlock"));

      // todo: how to generialize? 
      if (Arrays.asList(nodesInScope).contains(child)) {
        return Scopes.forLoopLabels(parameter, ScopeUtils.lazyParentScope(__thisNode__, kind));
      }
    }
    return null;
  }

  /*package*/ SwitchStatement__BehaviorDescriptor() {
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
        collectUncaughtMethodThrowables_id4Gt7ANIVH8f(node, (Set<SNode>) parameters[0], ((boolean) (Boolean) parameters[1]));
        return null;
      case 1:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
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
