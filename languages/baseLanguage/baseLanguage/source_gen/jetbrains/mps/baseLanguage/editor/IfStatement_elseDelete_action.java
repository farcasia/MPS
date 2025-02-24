package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;

public class IfStatement_elseDelete_action {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new IfStatement_elseDelete_action.IfStatement_elseDelete_action_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new IfStatement_elseDelete_action.IfStatement_elseDelete_action_BACKSPACE(node));
  }
  public static class IfStatement_elseDelete_action_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public IfStatement_elseDelete_action_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement")))) {
        return;
      }
      SNode nodeToSelect = UnwrapStatementsUtil.unwrapElse(node);
      if (nodeToSelect != null) {
        SelectionUtil.selectCell(editorContext, nodeToSelect, SelectionManager.FIRST_CELL);
      } else {
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, node, SelectionManager.LAST_CELL, -1);
      }
    }
  }
  public static class IfStatement_elseDelete_action_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public IfStatement_elseDelete_action_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement")))) {
        return;
      }
      SNode nodeToSelect = UnwrapStatementsUtil.unwrapElse(node);
      if (nodeToSelect != null) {
        SelectionUtil.selectCell(editorContext, nodeToSelect, SelectionManager.FIRST_CELL);
      } else {
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, node, SelectionManager.LAST_CELL, -1);
      }
    }
  }
}
