package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class _CellModel_Common_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public _CellModel_Common_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_1stfn5_a();
  }

  private EditorCell createCollection_1stfn5_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_1stfn5_a");
    editorCell.addEditorCell(createComponent_1stfn5_a0());
    editorCell.addEditorCell(createConstant_1stfn5_b0());
    editorCell.addEditorCell(createComponent_1stfn5_c0());
    return editorCell;
  }
  private EditorCell createComponent_1stfn5_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.Style_Component");
    return editorCell;
  }
  private EditorCell createConstant_1stfn5_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_1stfn5_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_1stfn5_c0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.Common_Component");
    return editorCell;
  }
}
