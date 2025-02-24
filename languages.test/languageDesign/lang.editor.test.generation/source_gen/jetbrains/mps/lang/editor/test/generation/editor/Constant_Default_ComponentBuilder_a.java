package jetbrains.mps.lang.editor.test.generation.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class Constant_Default_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Constant_Default_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createConstant_jagg9f_a();
  }

  private EditorCell createConstant_jagg9f_a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "default");
    editorCell.setCellId("Constant_jagg9f_a");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
