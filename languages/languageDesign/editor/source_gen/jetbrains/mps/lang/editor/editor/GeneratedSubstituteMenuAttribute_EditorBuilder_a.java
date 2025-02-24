package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.itemStyleClass;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;

/*package*/ class GeneratedSubstituteMenuAttribute_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public GeneratedSubstituteMenuAttribute_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_7rg9e4_a();
  }

  private EditorCell createCollection_7rg9e4_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_7rg9e4_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_7rg9e4_a0());
    editorCell.addEditorCell(createAttributedNodeCell_7rg9e4_b0());
    return editorCell;
  }
  private EditorCell createCollection_7rg9e4_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_7rg9e4_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_7rg9e4_a0a());
    editorCell.addEditorCell(createCollection_7rg9e4_b0a());
    return editorCell;
  }
  private EditorCell createIndentCell_7rg9e4_a0a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_7rg9e4_b0a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_7rg9e4_b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_7rg9e4_a1a0());
    editorCell.addEditorCell(createConstant_7rg9e4_b1a0());
    editorCell.addEditorCell(createConstant_7rg9e4_c1a0());
    return editorCell;
  }
  private EditorCell createConstant_7rg9e4_a1a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "This substitute menu has been automaticaly generated during migration.");
    editorCell.setCellId("Constant_7rg9e4_a1a0");
    Style style = new StyleImpl();
    new itemStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_7rg9e4_b1a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "You can inline the menu or just remove the annotation.");
    editorCell.setCellId("Constant_7rg9e4_b1a0");
    Style style = new StyleImpl();
    new itemStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_7rg9e4_c1a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Use enhancement script for such purposes.");
    editorCell.setCellId("Constant_7rg9e4_c1a0");
    Style style = new StyleImpl();
    new itemStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createAttributedNodeCell_7rg9e4_b0() {
    EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
    EditorCell editorCell = getUpdateSession().getAttributedCell(AttributeKind.NODE, myNode);
    return editorCell;
  }
}
