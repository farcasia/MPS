package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

/*package*/ class Reference_GetRoleOperation_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Reference_GetRoleOperation_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createComponent_e4wrz2_a();
  }

  private EditorCell createComponent_e4wrz2_a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.smodel.editor.AliasComponent");
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, getNode());
    if (bigCell != null) {
      bigCell.setBig(true);
      bigCell.setCellContext(getCellFactory().getCellContext());
    }
    Style style = new StyleImpl();
    style.set(StyleAttributes.STRIKE_OUT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
