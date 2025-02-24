package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_CommentOrUncommentChild;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.cells.CellAction;

public class StatementList_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.COMMENT, new StatementList_Actions.StatementList_Actions_COMMENT(node));
    editorCell.setAction(CellActionType.INSERT_PLACEHOLDER, new StatementList_Actions.StatementList_Actions_INSERT_PLACEHOLDER(node));
    editorCell.setAction(CellActionType.INSERT_PLACEHOLDER_BEFORE, new StatementList_Actions.StatementList_Actions_INSERT_PLACEHOLDER_BEFORE(node));
  }
  public static class StatementList_Actions_COMMENT extends AbstractCellAction {
    /*package*/ SNode myNode;
    public StatementList_Actions_COMMENT(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      new CellAction_CommentOrUncommentChild(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement")).execute(editorContext);
    }
    @Override
    public boolean canExecute(EditorContext editorContext) {
      return this.canExecute_internal(editorContext, this.myNode);
    }
    public boolean canExecute_internal(EditorContext editorContext, SNode node) {
      return new CellAction_CommentOrUncommentChild(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement")).canExecute(editorContext);
    }
  }
  public static class StatementList_Actions_INSERT_PLACEHOLDER extends AbstractCellAction {
    /*package*/ SNode myNode;
    public StatementList_Actions_INSERT_PLACEHOLDER(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      CellAction action = editorContext.getContextCell().getAction(CellActionType.INSERT);
      action.execute(editorContext);
    }
    @Override
    public boolean canExecute(EditorContext editorContext) {
      return this.canExecute_internal(editorContext, this.myNode);
    }
    public boolean canExecute_internal(EditorContext editorContext, SNode node) {
      CellAction action = editorContext.getContextCell().getAction(CellActionType.INSERT);
      return action.canExecute(editorContext);
    }
  }
  public static class StatementList_Actions_INSERT_PLACEHOLDER_BEFORE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public StatementList_Actions_INSERT_PLACEHOLDER_BEFORE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      CellAction action = editorContext.getContextCell().getAction(CellActionType.INSERT_BEFORE);
      action.execute(editorContext);
    }
    @Override
    public boolean canExecute(EditorContext editorContext) {
      return this.canExecute_internal(editorContext, this.myNode);
    }
    public boolean canExecute_internal(EditorContext editorContext, SNode node) {
      CellAction action = editorContext.getContextCell().getAction(CellActionType.INSERT_BEFORE);
      return action.canExecute(editorContext);
    }
  }
}
