package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class OrCellSelector_Left_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new OrCellSelector_Left_Actions.OrCellSelector_Left_Actions_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new OrCellSelector_Left_Actions.OrCellSelector_Left_Actions_BACKSPACE(node));
  }
  public static class OrCellSelector_Left_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public OrCellSelector_Left_Actions_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x235af965a76b03fL, 0x235af965a76b040L, "leftSelector")))) {
        return;
      }
      SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x235af965a76b03fL, 0x235af965a76b042L, "rightSelector")));
    }
  }
  public static class OrCellSelector_Left_Actions_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public OrCellSelector_Left_Actions_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x235af965a76b03fL, 0x235af965a76b040L, "leftSelector")))) {
        return;
      }
      SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x235af965a76b03fL, 0x235af965a76b042L, "rightSelector")));
    }
  }
}
