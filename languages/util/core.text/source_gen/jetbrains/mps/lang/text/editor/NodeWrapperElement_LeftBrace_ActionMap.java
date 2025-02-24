package jetbrains.mps.lang.text.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class NodeWrapperElement_LeftBrace_ActionMap {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.BACKSPACE, new NodeWrapperElement_LeftBrace_ActionMap.NodeWrapperElement_LeftBrace_ActionMap_BACKSPACE(node));
    editorCell.setAction(CellActionType.DELETE, new NodeWrapperElement_LeftBrace_ActionMap.NodeWrapperElement_LeftBrace_ActionMap_DELETE(node));
    editorCell.setAction(CellActionType.INSERT, new NodeWrapperElement_LeftBrace_ActionMap.NodeWrapperElement_LeftBrace_ActionMap_INSERT(node));
    editorCell.setAction(CellActionType.INSERT_BEFORE, new NodeWrapperElement_LeftBrace_ActionMap.NodeWrapperElement_LeftBrace_ActionMap_INSERT_BEFORE(node));
  }
  public static class NodeWrapperElement_LeftBrace_ActionMap_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public NodeWrapperElement_LeftBrace_ActionMap_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      TextDeleteStrategyFactory.createDeleteStrategy(node, editorContext, false).execute();
    }
  }
  public static class NodeWrapperElement_LeftBrace_ActionMap_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public NodeWrapperElement_LeftBrace_ActionMap_DELETE(SNode node) {
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
  public static class NodeWrapperElement_LeftBrace_ActionMap_INSERT extends AbstractCellAction {
    /*package*/ SNode myNode;
    public NodeWrapperElement_LeftBrace_ActionMap_INSERT(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      NewElementStrategyFactory.createNewLineStrategy(node, editorContext, true, true).execute();
    }
  }
  public static class NodeWrapperElement_LeftBrace_ActionMap_INSERT_BEFORE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public NodeWrapperElement_LeftBrace_ActionMap_INSERT_BEFORE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      NewElementStrategyFactory.createNewLineStrategy(node, editorContext, true, true).execute();
    }
  }
}
