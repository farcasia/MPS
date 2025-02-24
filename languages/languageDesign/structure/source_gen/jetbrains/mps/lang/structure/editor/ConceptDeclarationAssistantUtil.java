package jetbrains.mps.lang.structure.editor;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import java.util.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;

public class ConceptDeclarationAssistantUtil {
  private SNode myCocnept;

  public ConceptDeclarationAssistantUtil(SNode concept) {
    myCocnept = concept;
  }

  public List<SNode> getStructurallyEqualSuperConcepts() {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());

    Queue<SNode> toCheck = QueueSequence.fromQueueAndArray(new LinkedList<SNode>(), myCocnept);
    SNode bestCandidate = null;
    while (QueueSequence.fromQueue(toCheck).isNotEmpty()) {
      SNode acd = QueueSequence.fromQueue(toCheck).removeFirstElement();
      if (acd == SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)", "1133920641626") || acd == SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)", "1169194658468")) {
        continue;
      }
      if (!(ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getLinkDeclarations_idhEwILKK.invoke(acd)).containsSequence(ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getLinkDeclarations_idhEwILKK.invoke(myCocnept)))) || !(ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getPropertyDeclarations_idhEwILLM.invoke(acd)).containsSequence(ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getPropertyDeclarations_idhEwILLM.invoke(myCocnept))))) {
        continue;
      }
      if (myCocnept != acd) {
        ListSequence.fromList(result).addElement(acd);
      }
      // continue concept hierarchy traversal only if acd contains all properties/link of the current concept 
      QueueSequence.fromQueue(toCheck).addSequence(ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.getImmediateSuperconcepts_idhMuxyK2.invoke(acd)));
    }
    return result;
  }
}
