package jetbrains.mps.ide.java.platform.highlighters.methodcallsfixer;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.HashMap;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.search.MethodResolveUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

/**
 * Maintains information for incremental updates.
 */
/*package*/ class MethodCallsUpdateSession {
  private Map<SNode, SNode> myMethodCallsToUpdate = new HashMap<SNode, SNode>();
  private final MethodCallsCache myCache;

  /*package*/ MethodCallsUpdateSession(SRepository repository) {
    myCache = new MethodCallsCache(repository);
  }

  /*package*/ void checkMethodCall(@NotNull SNode methodCallNode) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(methodCallNode, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"));
    String methodName = getMethodName(methodCallNode);

    Tuples._2<SNode, Boolean> resolveResult = MethodResolveUtil.resolveMethod(methodCallNode, methodName);
    SNode newTarget = resolveResult._0();
    boolean good = (boolean) resolveResult._1();

    if (newTarget != null) {
      if (baseMethodDeclaration == null || (good && newTarget != baseMethodDeclaration)) {
        myMethodCallsToUpdate.put(methodCallNode, newTarget);
      }
      myCache.putCheckedMethodCall(methodCallNode, newTarget, methodName);
    }
  }
  /*package*/ void methodDeclarationSignatureChanged(SNode method) {
    for (SNode methodCall : Sequence.fromIterable(myCache.getCheckedCallsToMethodByConceptAndName(method))) {
      checkMethodCall(methodCall);
    }
  }
  /*package*/ void methodCallChanged(SNode methodCall) {
    if (myCache.isMethodCallUpToDate(methodCall)) {
      return;
    }

    checkMethodCall(methodCall);
  }
  /*package*/ void nodeAdded(SNode child) {
    for (SNode methodCall : SNodeOperations.getNodeDescendants(child, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall"), true, new SAbstractConcept[]{})) {
      checkMethodCall(methodCall);
    }
    SNode parent = SNodeOperations.getParent(child);
    if (myCache.wasChecked(parent)) {
      SNode p = SNodeOperations.cast(parent, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall"));
      checkMethodCall(p);
    }
    SNode formalParam = SNodeOperations.getNodeAncestor(child, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), true, false);
    if ((SNodeOperations.getParent(formalParam) != null)) {
      methodDeclarationSignatureChanged(SNodeOperations.getParent(formalParam));
    }
  }

  /*package*/ void nodeRemoved(SNode child, SNode formerParent, SModel m) {
    if (myCache.wasChecked(new SNodePointer(m.getReference(), formerParent.getNodeId()))) {
      SNode methodCallNode = SNodeOperations.cast(formerParent, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall"));
      checkMethodCall(methodCallNode);
    }
    if (SNodeOperations.isInstanceOf(child, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"))) {
      methodDeclarationSignatureChanged(formerParent);
    } else {
      SNode formalParam = SNodeOperations.getNodeAncestor(formerParent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), true, false);
      if ((SNodeOperations.getParent(formalParam) != null)) {
        methodDeclarationSignatureChanged(SNodeOperations.getParent(formalParam));
      }
    }
  }
  /*package*/ void methodDeclarationNameChanged(SNode method) {
    Iterable<SNode> methodCalls = myCache.getCheckedCallsToMethodByNodeReference(method);
    for (SNode methodCall : Sequence.fromIterable(methodCalls)) {
      SNode methodCallNode = methodCall;
      checkMethodCall(methodCallNode);
    }
  }
  /*package*/ String getMethodName(SNode methodCall) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(methodCall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"));
    if (baseMethodDeclaration == null) {
      if (SLinkOperations.getTarget(SNodeOperations.as(methodCall, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier")) != null) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.as(methodCall, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      } else {
        return SLinkOperations.getResolveInfo(SNodeOperations.getReference(methodCall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")));
      }
    } else {
      return SPropertyOperations.getString(baseMethodDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    }
  }

  /**
   * Returns a copy of the internally maintained collection of method calls that should be updated to new targets, and
   * clears the original collection.
   * 
   * @return a non-null map from IMethodCall to BaseMethodDeclaration
   */
  @NotNull
  /*package*/ Map<SNode, SNode> collectMethodCallsToUpdate() {
    Map<SNode, SNode> result = myMethodCallsToUpdate;
    myMethodCallsToUpdate = new HashMap<SNode, SNode>();
    return result;
  }

  /*package*/ boolean hasMethodCallsToUpdate() {
    return !(myMethodCallsToUpdate.isEmpty());
  }

  public void doneUpdating() {
    myMethodCallsToUpdate.clear();
  }
}
