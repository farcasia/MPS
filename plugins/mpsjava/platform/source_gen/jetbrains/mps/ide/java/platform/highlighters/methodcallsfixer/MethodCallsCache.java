package jetbrains.mps.ide.java.platform.highlighters.methodcallsfixer;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SRepository;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNodeReference;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import com.intellij.openapi.util.Pair;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

/**
 * Caches method calls and method declarations visited by the checker.
 */
/*package*/ class MethodCallsCache {
  private final SRepository myRepository;
  private final Set<SNodeReference> myCheckedMethodCalls = new HashSet<SNodeReference>();
  private final Map<SNodeReference, SNodeReference> myMethodCallsToSetDecls = new HashMap<SNodeReference, SNodeReference>();
  private final Map<SNodeReference, Set<SNodeReference>> myMethodDeclsToCheckedMethodCalls = new HashMap<SNodeReference, Set<SNodeReference>>();
  private final Map<Pair<String, String>, Set<SNodeReference>> myMethodConceptsAndNamesToCheckedMethodCalls = new HashMap<Pair<String, String>, Set<SNodeReference>>();

  /*package*/ MethodCallsCache(SRepository repository) {
    myRepository = repository;
  }

  /*package*/ boolean wasChecked(SNode methodCall) {
    return wasChecked(SNodeOperations.getPointer(methodCall));
  }
  /*package*/ boolean wasChecked(SNodeReference methodCall) {
    return myCheckedMethodCalls.contains(methodCall);
  }

  /*package*/ Iterable<SNode> getCheckedCallsToMethodByConceptAndName(SNode method) {
    Set<SNodeReference> methodCallPointers = myMethodConceptsAndNamesToCheckedMethodCalls.get(new Pair<String, String>(method.getConcept().getQualifiedName(), method.getName()));
    return getMethodCalls(methodCallPointers);
  }

  /*package*/ Iterable<SNode> getCheckedCallsToMethodByNodeReference(SNode method) {
    Set<SNodeReference> methodCallPointers = myMethodDeclsToCheckedMethodCalls.get(SNodeOperations.getPointer(method));
    return getMethodCalls(methodCallPointers);
  }

  private Iterable<SNode> getMethodCalls(Set<SNodeReference> methodCallPointers) {
    if (methodCallPointers == null) {
      return Sequence.fromIterable(Collections.<SNode>emptyList());
    }
    return SNodeOperations.ofConcept(SetSequence.fromSet(methodCallPointers).where(new IWhereFilter<SNodeReference>() {
      public boolean accept(SNodeReference it) {
        return it != null;
      }
    }).select(new ISelector<SNodeReference, SNode>() {
      public SNode select(SNodeReference it) {
        return it.resolve(myRepository);
      }
    }), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall"));
  }

  /*package*/ void putCheckedMethodCall(SNode methodCallNode, SNode methodNode, String methodName) {
    SNodeReference methodCallPointer = SNodeOperations.getPointer(methodCallNode);
    SNodeReference methodNodePointer = SNodeOperations.getPointer(methodNode);
    myMethodCallsToSetDecls.put(methodCallPointer, methodNodePointer);
    myCheckedMethodCalls.add(methodCallPointer);
    Set<SNodeReference> nodeSet = myMethodDeclsToCheckedMethodCalls.get(methodNodePointer);
    if (nodeSet == null) {
      nodeSet = new HashSet<SNodeReference>();
      myMethodDeclsToCheckedMethodCalls.put(methodNodePointer, nodeSet);
    }
    nodeSet.add(methodCallPointer);
    Pair<String, String> key = new Pair<String, String>(methodNode.getConcept().getQualifiedName(), methodName);
    Set<SNodeReference> nodesByNameAndConcept = myMethodConceptsAndNamesToCheckedMethodCalls.get(key);
    if (nodesByNameAndConcept == null) {
      nodesByNameAndConcept = new HashSet<SNodeReference>();
      myMethodConceptsAndNamesToCheckedMethodCalls.put(key, nodesByNameAndConcept);
    }
    nodesByNameAndConcept.add(methodCallPointer);
  }

  /*package*/ boolean isMethodCallUpToDate(SNode methodCall) {
    SNodeReference methodCallPointer = SNodeOperations.getPointer(methodCall);
    return myCheckedMethodCalls.contains(methodCallPointer) && SLinkOperations.getTarget(methodCall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")) == myMethodCallsToSetDecls.get(methodCallPointer).resolve(myRepository);
  }
}
