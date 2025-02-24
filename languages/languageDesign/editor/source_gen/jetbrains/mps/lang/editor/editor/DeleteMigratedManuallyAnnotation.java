package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class DeleteMigratedManuallyAnnotation {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new DeleteMigratedManuallyAnnotation.DeleteMigratedManuallyAnnotation_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new DeleteMigratedManuallyAnnotation.DeleteMigratedManuallyAnnotation_BACKSPACE(node));
  }
  public static class DeleteMigratedManuallyAnnotation_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteMigratedManuallyAnnotation_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      SNodeOperations.deleteNode(node);
    }
  }
  public static class DeleteMigratedManuallyAnnotation_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteMigratedManuallyAnnotation_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      SNodeOperations.deleteNode(node);
    }
  }
}
