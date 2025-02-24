package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

/*package*/ class UnknownConsCall_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public UnknownConsCall_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_bnhthl_a();
  }

  private EditorCell createCollection_bnhthl_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_bnhthl_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_bnhthl_a0());
    editorCell.addEditorCell(createComponent_bnhthl_b0());
    return editorCell;
  }
  private EditorCell createCollection_bnhthl_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_bnhthl_a0");
    editorCell.addEditorCell(createAlternation_bnhthl_a0a());
    return editorCell;
  }
  private EditorCell createAlternation_bnhthl_a0a() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_bnhthl_a0a0();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createConstant_bnhthl_a0a0();
    } else {
      editorCell = createConstant_bnhthl_a0a0_0();
    }
    return editorCell;
  }
  private boolean nodeCondition_bnhthl_a0a0() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x7e4a5cff51167b74L, 0x7e4a5cff51167ce2L, "isSuper"));
  }
  private EditorCell createConstant_bnhthl_a0a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "super");
    editorCell.setCellId("Constant_bnhthl_a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_bnhthl_a0a0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "this");
    editorCell.setCellId("Constant_bnhthl_a0a0_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_bnhthl_b0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.baseLanguage.editor.IMethodCall_actualArguments");
    return editorCell;
  }
}
