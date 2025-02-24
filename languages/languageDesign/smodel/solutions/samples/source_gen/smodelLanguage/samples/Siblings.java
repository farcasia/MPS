package smodelLanguage.samples;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;

public class Siblings {
  public void nextSibling(SNode statement) {
    SNode next1 = SNodeOperations.getNextSibling(statement);
    SNode next2 = SNodeOperations.cast(SNodeOperations.getNextSibling(statement), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"));
    SNode next3 = SNodeOperations.insertNewNextSiblingChild(statement, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"));
    SNodeOperations.insertNextSiblingChild(statement, SNodeOperations.copyNode(next3));
  }
  public void nextSiblings(SNode statement) {
    List<SNode> nextSiblings_exclusive = SNodeOperations.getNextSiblings(statement, false);
    List<SNode> nextSiblings_inclusive = SNodeOperations.getNextSiblings(statement, true);
  }
  public void allSiblings(SNode statement) {
    List<SNode> siblings_inclusive = SNodeOperations.getAllSiblings(statement, true);
  }
}
