package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;

public class Delete_BlockStatement {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new Delete_BlockStatement.Delete_BlockStatement_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new Delete_BlockStatement.Delete_BlockStatement_BACKSPACE(node));
  }
  public static class Delete_BlockStatement_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public Delete_BlockStatement_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"))) {
        UnwrapStatementsUtil.unwrapStatementListInContainer(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements")));
      } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")) && SNodeOperations.hasRole(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement"))) {
        SNode nodeToSelect = UnwrapStatementsUtil.unwrapElse(SNodeOperations.cast(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")));
        SelectionUtil.selectCell(editorContext, nodeToSelect, SelectionManager.FIRST_CELL);
      }
    }
  }
  public static class Delete_BlockStatement_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public Delete_BlockStatement_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node)) {
        return;
      }
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"))) {
        UnwrapStatementsUtil.unwrapStatementListInContainer(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements")));
      } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")) && SNodeOperations.hasRole(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement"))) {
        SNode nodeToSelect = UnwrapStatementsUtil.unwrapElse(SNodeOperations.cast(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")));
        SelectionUtil.selectCell(editorContext, nodeToSelect, SelectionManager.FIRST_CELL);
      }
    }
  }
}
