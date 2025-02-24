package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;

/*package*/ class RuleConsequence_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public RuleConsequence_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createError_grd82q_a();
  }

  private EditorCell createError_grd82q_a() {
    EditorCell_Error editorCell = new EditorCell_Error(getEditorContext(), myNode, "choose consequence");
    editorCell.setCellId("Error_grd82q_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    return editorCell;
  }
}
