package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;

public class DeleteCondition {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new DeleteCondition.DeleteCondition_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new DeleteCondition.DeleteCondition_BACKSPACE(node));
  }
  public static class DeleteCondition_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteCondition_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode condition;
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition"));
      } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, "jetbrains.mps.baseLanguage.structure.WhileStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, "jetbrains.mps.baseLanguage.structure.WhileStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, 0xfaa4bf0f30L, "condition"));
      } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, "jetbrains.mps.baseLanguage.structure.DoWhileStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, "jetbrains.mps.baseLanguage.structure.DoWhileStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, 0x11232679422L, "condition"));
      } else {
        return;
      }
      if (DeletionApproverUtil.approve(editorContext, condition)) {
        return;
      }
      SNodeOperations.replaceWithNewChild(condition, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
      editorContext.selectWRTFocusPolicy(node);
    }
  }
  public static class DeleteCondition_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteCondition_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode condition;
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition"));
      } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, "jetbrains.mps.baseLanguage.structure.WhileStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, "jetbrains.mps.baseLanguage.structure.WhileStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfaa4bf0f2fL, 0xfaa4bf0f30L, "condition"));
      } else if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, "jetbrains.mps.baseLanguage.structure.DoWhileStatement"))) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, "jetbrains.mps.baseLanguage.structure.DoWhileStatement")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11232674988L, 0x11232679422L, "condition"));
      } else {
        return;
      }
      if (DeletionApproverUtil.approve(editorContext, condition)) {
        return;
      }
      SNodeOperations.replaceWithNewChild(condition, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
      editorContext.selectWRTFocusPolicy(node);
    }
  }
}
