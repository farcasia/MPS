package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class DeleteClassifierMember {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new DeleteClassifierMember.DeleteClassifierMember_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new DeleteClassifierMember.DeleteClassifierMember_BACKSPACE(node));
  }
  public static class DeleteClassifierMember_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteClassifierMember_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.getParent(node) != null) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x3dcc194340c24debL, "jetbrains.mps.lang.core.structure.BaseCommentAttribute"))) {
          if (DeletionApproverUtil.approve(editorContext, SNodeOperations.getParent(node))) {
            return;
          }
          SNodeOperations.deleteNode(SNodeOperations.getParent(node));
        } else {
          if (DeletionApproverUtil.approve(editorContext, node)) {
            return;
          }
          if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
            SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1458378889e6d166L, "jetbrains.mps.baseLanguage.structure.PlaceholderMember")));
          } else {
            SNodeOperations.deleteNode(node);
          }
        }
      }
    }
  }
  public static class DeleteClassifierMember_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public DeleteClassifierMember_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.getParent(node) != null) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x3dcc194340c24debL, "jetbrains.mps.lang.core.structure.BaseCommentAttribute"))) {
          if (DeletionApproverUtil.approve(editorContext, SNodeOperations.getParent(node))) {
            return;
          }
          SNodeOperations.deleteNode(SNodeOperations.getParent(node));
        } else {
          if (DeletionApproverUtil.approve(editorContext, node)) {
            return;
          }
          if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
            SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1458378889e6d166L, "jetbrains.mps.baseLanguage.structure.PlaceholderMember")));
          } else {
            SNodeOperations.deleteNode(node);
          }
        }
      }
    }
  }
}
