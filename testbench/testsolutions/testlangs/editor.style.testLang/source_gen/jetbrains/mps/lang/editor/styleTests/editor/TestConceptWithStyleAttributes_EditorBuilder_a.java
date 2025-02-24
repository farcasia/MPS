package jetbrains.mps.lang.editor.styleTests.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.styleTests.editor.TestStylesheet_StyleSheet.priorityStyleStyleClass;
import jetbrains.mps.lang.editor.styleTests.editor.TestStylesheet_StyleSheet.hugePriorityStyleStyleClass;
import jetbrains.mps.lang.editor.styleTests.editor.TestStylesheet_StyleSheet.unapplyPriorityStyleCopyStyleClass;

/*package*/ class TestConceptWithStyleAttributes_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public TestConceptWithStyleAttributes_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_58m68g_a();
  }

  private EditorCell createCollection_58m68g_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_58m68g_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute"), _StyleParameter_QueryFunction_58m68g_a0a());
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_58m68g_a0());
    editorCell.addEditorCell(createCollection_58m68g_b0());
    return editorCell;
  }
  private String _StyleParameter_QueryFunction_58m68g_a0a() {
    return "Hey!";
  }
  private EditorCell createConstant_58m68g_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "do");
    editorCell.setCellId("Constant_58m68g_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_58m68g_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_58m68g_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute"), _StyleParameter_QueryFunction_58m68g_a1b0());
    style.set(StyleAttributes.getInstance().<Boolean>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-simple-attribute"), _StyleParameter_QueryFunction_58m68g_a2b0());
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_58m68g_a1a());
    editorCell.addEditorCell(createConstant_58m68g_b1a());
    editorCell.addEditorCell(createCollection_58m68g_c1a());
    return editorCell;
  }
  private String _StyleParameter_QueryFunction_58m68g_a1b0() {
    return "Bye!";
  }
  private boolean _StyleParameter_QueryFunction_58m68g_a2b0() {
    return true;
  }
  private EditorCell createConstant_58m68g_a1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "re");
    editorCell.setCellId("Constant_58m68g_a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute"), _StyleParameter_QueryFunction_58m68g_a0a1a());
    style.set(StyleAttributes.getInstance().<Boolean>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-simple-attribute"), _StyleParameter_QueryFunction_58m68g_a1a1a());
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private String _StyleParameter_QueryFunction_58m68g_a0a1a() {
    return "Yeah!";
  }
  private boolean _StyleParameter_QueryFunction_58m68g_a1a1a() {
    return false;
  }
  private EditorCell createConstant_58m68g_b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "mi");
    editorCell.setCellId("Constant_58m68g_b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_58m68g_c1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_58m68g_c1a");
    Style style = new StyleImpl();
    new priorityStyleStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_58m68g_a2b0());
    editorCell.addEditorCell(createConstant_58m68g_b2b0());
    editorCell.addEditorCell(createCollection_58m68g_c2b0());
    return editorCell;
  }
  private EditorCell createConstant_58m68g_a2b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "fa");
    editorCell.setCellId("Constant_58m68g_a2b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_58m68g_b2b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "sol");
    editorCell.setCellId("Constant_58m68g_b2b0");
    Style style = new StyleImpl();
    new hugePriorityStyleStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_58m68g_c2b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_58m68g_c2b0");
    Style style = new StyleImpl();
    new unapplyPriorityStyleCopyStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_58m68g_a2c1a());
    editorCell.addEditorCell(createConstant_58m68g_b2c1a());
    return editorCell;
  }
  private EditorCell createConstant_58m68g_a2c1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "la");
    editorCell.setCellId("Constant_58m68g_a2c1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_58m68g_b2c1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "ti");
    editorCell.setCellId("Constant_58m68g_b2c1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
