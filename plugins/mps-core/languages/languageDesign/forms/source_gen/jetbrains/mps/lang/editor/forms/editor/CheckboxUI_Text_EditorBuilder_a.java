package jetbrains.mps.lang.editor.forms.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;

/*package*/ class CheckboxUI_Text_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CheckboxUI_Text_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createComponent_z84i6z_a();
  }

  private EditorCell createComponent_z84i6z_a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, getNode());
    if (bigCell != null) {
      bigCell.setBig(true);
      bigCell.setCellContext(getCellFactory().getCellContext());
    }
    return editorCell;
  }
}
