package jetbrains.mps.lang.editor.multiple.testLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class MultipleEditorsTestChild_compact_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public MultipleEditorsTestChild_compact_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createConstant_bdtuju_a();
  }

  private EditorCell createConstant_bdtuju_a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "compact");
    editorCell.setCellId("Constant_bdtuju_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
}
