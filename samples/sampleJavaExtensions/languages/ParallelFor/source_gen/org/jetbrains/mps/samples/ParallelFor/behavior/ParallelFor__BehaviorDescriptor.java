package org.jetbrains.mps.samples.ParallelFor.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.scopes.Scopes;
import jetbrains.mps.lang.core.behavior.ScopeProvider__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public final class ParallelFor__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Void> collectUncaughtMethodThrowables_id4Gt7ANIVH8f = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("collectUncaughtMethodThrowables").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4Gt7ANIVH8f").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<Set<SNode>>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter(Boolean.TYPE, ""));
  public static final SMethod<Set<SNode>> uncaughtThrowables_id2SVUfbZ9Qq1 = new SMethodBuilder<Set<SNode>>(new SJavaCompoundTypeImpl((Class<Set<SNode>>) ((Class) Object.class))).name("uncaughtThrowables").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2SVUfbZ9Qq1").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(Boolean.TYPE, ""));
  public static final SMethod<List<SNode>> getThrowableTypes_id5op8ooRkkc7 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("getThrowableTypes").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5op8ooRkkc7").registry(REGISTRY).build();
  public static final SMethod<SNode> getBody_idi2fhZ_m = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getBody").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i2fhZ_m").registry(REGISTRY).build();
  public static final SMethod<SNode> getExpectedRetType_idi2fhBNC = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("getExpectedRetType").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("i2fhBNC").registry(REGISTRY).build();
  public static final SMethod<Boolean> implicitThrows_id4kX30tnJ9kz = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("implicitThrows").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4kX30tnJ9kz").registry(REGISTRY).build();
  public static final SMethod<SNode> findPoolDeclaration_id6FH9fp$mItT = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("findPoolDeclaration").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6FH9fp$mItT").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getScope_id52_Geb4QDV$, collectUncaughtMethodThrowables_id4Gt7ANIVH8f, uncaughtThrowables_id2SVUfbZ9Qq1, getThrowableTypes_id5op8ooRkkc7, getBody_idi2fhZ_m, getExpectedRetType_idi2fhBNC, implicitThrows_id4kX30tnJ9kz, findPoolDeclaration_id6FH9fp$mItT);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"))) {
      List<SNode> variables = new ArrayList<SNode>();
      if (!(ScopeUtils.comeFrom(MetaAdapterFactory.getContainmentLink(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, 0x7bd8445d1e8810c2L, "loopVariable"), __thisNode__, child))) {
        ListSequence.fromList(variables).addElement(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, 0x7bd8445d1e8810c2L, "loopVariable")));
      }
      return Scopes.forVariables(kind, variables, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }

    return ((Scope) ScopeProvider__BehaviorDescriptor.getScope_id52_Geb4QDV$.invokeSuper(__thisNode__, MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x7bd8445d1e8770aaL, "org.jetbrains.mps.samples.ParallelFor.structure.ParallelFor"), kind, child));
  }
  /*package*/ static void collectUncaughtMethodThrowables_id4Gt7ANIVH8f(@NotNull SNode __thisNode__, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
  }
  /*package*/ static Set<SNode> uncaughtThrowables_id2SVUfbZ9Qq1(@NotNull SNode __thisNode__, boolean ignoreMayBeThrowables) {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    return result;
  }
  /*package*/ static List<SNode> getThrowableTypes_id5op8ooRkkc7(@NotNull SNode __thisNode__) {
    return new ArrayList<SNode>();
  }
  /*package*/ static SNode getBody_idi2fhZ_m(@NotNull SNode __thisNode__) {
    return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cb1ac5adeL, 0x10cb1ada6e8L, "body"));
  }
  /*package*/ static SNode getExpectedRetType_idi2fhBNC(@NotNull SNode __thisNode__) {
    return null;
  }
  /*package*/ static boolean implicitThrows_id4kX30tnJ9kz(@NotNull SNode __thisNode__) {
    return true;
  }
  /*package*/ static SNode findPoolDeclaration_id6FH9fp$mItT(@NotNull SNode __thisNode__) {
    SNode prevSibling = SNodeOperations.getPrevSibling(__thisNode__);
    while (prevSibling != null) {
      if (SNodeOperations.isInstanceOf(prevSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) && SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(prevSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, 0xf8cc67c7f1L, "localVariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), HUtil.createMatchingPatternByConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType")), true), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")) == SLinkOperations.getTarget(_quotation_createNode_1tdh13_a0a0a0b0h(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"))) {
        return SLinkOperations.getTarget(SNodeOperations.cast(prevSibling, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, 0xf8cc67c7f1L, "localVariableDeclaration"));
      }
      prevSibling = SNodeOperations.getPrevSibling(prevSibling);
    }
    return null;
  }

  /*package*/ ParallelFor__BehaviorDescriptor() {
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
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      case 1:
        collectUncaughtMethodThrowables_id4Gt7ANIVH8f(node, (Set<SNode>) parameters[0], ((boolean) (Boolean) parameters[1]));
        return null;
      case 2:
        return (T) ((Set<SNode>) uncaughtThrowables_id2SVUfbZ9Qq1(node, ((boolean) (Boolean) parameters[0])));
      case 3:
        return (T) ((List<SNode>) getThrowableTypes_id5op8ooRkkc7(node));
      case 4:
        return (T) ((SNode) getBody_idi2fhZ_m(node));
      case 5:
        return (T) ((SNode) getExpectedRetType_idi2fhBNC(node));
      case 6:
        return (T) ((Boolean) implicitThrows_id4kX30tnJ9kz(node));
      case 7:
        return (T) ((SNode) findPoolDeclaration_id6FH9fp$mItT(node));
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
  private static SNode _quotation_createNode_1tdh13_a0a0a0b0h() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util.concurrent(JDK/)"), facade.createNodeId("~ExecutorService")));
    return quotedNode_1;
  }
}
