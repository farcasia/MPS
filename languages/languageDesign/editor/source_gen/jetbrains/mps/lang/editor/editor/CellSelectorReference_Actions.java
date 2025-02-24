package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;

public class CellSelectorReference_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new CellSelectorReference_Actions.CellSelectorReference_Actions_DELETE(node));
    editorCell.setAction(CellActionType.INSERT, new CellSelectorReference_Actions.CellSelectorReference_Actions_INSERT(node));
    editorCell.setAction(CellActionType.BACKSPACE, new CellSelectorReference_Actions.CellSelectorReference_Actions_BACKSPACE(node));
  }
  public static class CellSelectorReference_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public CellSelectorReference_Actions_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1b0a9b8c0eb8e726L, "jetbrains.mps.lang.editor.structure.AbstractCellSelector")), SNodeOperations.asSConcept(SNodeOperations.getConcept(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector")))))) {
        if (DeletionApproverUtil.approve(editorContext, node, "cellSelector")) {
          return;
        }
        SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector"), null);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, node, "closingBracket", 0);
      } else {
        SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1b0a9b8c0eb8e726L, "jetbrains.mps.lang.editor.structure.AbstractCellSelector")));
      }
    }
  }
  public static class CellSelectorReference_Actions_INSERT extends AbstractCellAction {
    /*package*/ SNode myNode;
    public CellSelectorReference_Actions_INSERT(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x320558d6ffc96d72L, "selectionStart")) == null) {
        SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x320558d6ffc96d72L, "selectionStart"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
      }
    }
  }
  public static class CellSelectorReference_Actions_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public CellSelectorReference_Actions_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1b0a9b8c0eb8e726L, "jetbrains.mps.lang.editor.structure.AbstractCellSelector")), SNodeOperations.asSConcept(SNodeOperations.getConcept(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector")))))) {
        if (DeletionApproverUtil.approve(editorContext, node, "cellSelector")) {
          return;
        }
        SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector"), null);
        SelectionUtil.selectLabelCellAnSetCaret(editorContext, node, "closingBracket", 0);
      } else {
        SLinkOperations.setTarget(node, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, 0x1b0a9b8c0eb90bdeL, "cellSelector"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1b0a9b8c0eb8e726L, "jetbrains.mps.lang.editor.structure.AbstractCellSelector")));
      }
    }
  }
}
