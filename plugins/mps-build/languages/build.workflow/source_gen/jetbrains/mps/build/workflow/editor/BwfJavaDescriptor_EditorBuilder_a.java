package jetbrains.mps.build.workflow.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.build.workflow.editor.workflowStyles_StyleSheet.keywordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

/*package*/ class BwfJavaDescriptor_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BwfJavaDescriptor_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_qa8ftx_a();
  }

  private EditorCell createCollection_qa8ftx_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_qa8ftx_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_qa8ftx_a0());
    editorCell.addEditorCell(createConstant_qa8ftx_b0());
    return editorCell;
  }
  private EditorCell createConstant_qa8ftx_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "java project");
    editorCell.setCellId("Constant_qa8ftx_a0");
    Style style = new StyleImpl();
    new keywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_qa8ftx_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_qa8ftx_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
