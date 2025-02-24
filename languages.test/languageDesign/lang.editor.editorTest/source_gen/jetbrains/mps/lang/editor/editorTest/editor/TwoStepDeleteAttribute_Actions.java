package jetbrains.mps.lang.editor.editorTest.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TwoStepDeleteAttribute_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new TwoStepDeleteAttribute_Actions.TwoStepDeleteAttribute_Actions_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new TwoStepDeleteAttribute_Actions.TwoStepDeleteAttribute_Actions_BACKSPACE(node));
  }
  public static class TwoStepDeleteAttribute_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public TwoStepDeleteAttribute_Actions_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeOperations.deleteNode(node);
    }
  }
  public static class TwoStepDeleteAttribute_Actions_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public TwoStepDeleteAttribute_Actions_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeOperations.deleteNode(node);
    }
  }
}
