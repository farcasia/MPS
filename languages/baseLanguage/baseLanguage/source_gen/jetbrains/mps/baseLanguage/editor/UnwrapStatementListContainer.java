package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;

public class UnwrapStatementListContainer {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new UnwrapStatementListContainer.UnwrapStatementListContainer_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new UnwrapStatementListContainer.UnwrapStatementListContainer_BACKSPACE(node));
  }
  public static class UnwrapStatementListContainer_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public UnwrapStatementListContainer_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      UnwrapStatementsUtil.unwrapIContainsStatementList(node);
    }
  }
  public static class UnwrapStatementListContainer_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public UnwrapStatementListContainer_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      UnwrapStatementsUtil.unwrapIContainsStatementList(node);
    }
  }
}
