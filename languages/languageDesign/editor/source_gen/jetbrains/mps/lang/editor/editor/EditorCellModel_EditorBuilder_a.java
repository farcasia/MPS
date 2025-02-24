package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.rootCellModelStyleStyleClass;

/*package*/ class EditorCellModel_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public EditorCellModel_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createError_nb4xc9_a();
  }

  private EditorCell createError_nb4xc9_a() {
    EditorCell_Error editorCell = new EditorCell_Error(getEditorContext(), myNode, "<choose cell model>");
    editorCell.setCellId("Error_nb4xc9_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    new rootCellModelStyleStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
