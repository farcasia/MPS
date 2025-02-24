package jetbrains.mps.core.xml.sax.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.editor.runtime.deletionApprover.DeletionApproverUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class delete_CompactKW {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new delete_CompactKW.delete_CompactKW_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new delete_CompactKW.delete_CompactKW_BACKSPACE(node));
  }
  public static class delete_CompactKW_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public delete_CompactKW_DELETE(SNode node) {
      this.myNode = node;
    }
    public String getDescriptionText() {
      return "Full view";
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node, "compactKeyword")) {
        return;
      }
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2f2L, 0x1f6c736337b5e2faL, "isCompact"), "" + (false));
    }
  }
  public static class delete_CompactKW_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public delete_CompactKW_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public String getDescriptionText() {
      return "Full view";
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (DeletionApproverUtil.approve(editorContext, node, "compactKeyword")) {
        return;
      }
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2f2L, 0x1f6c736337b5e2faL, "isCompact"), "" + (false));
    }
  }
}
