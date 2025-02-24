package jetbrains.mps.lang.editor.styleTests.editor;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class TestInheritedAttribute_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public TestInheritedAttribute_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createComponent_twhn5o_a();
  }

  private EditorCell createComponent_twhn5o_a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.styleTests.editor.StyleTest_EditorComponent");
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, getNode());
    if (bigCell != null) {
      bigCell.setBig(true);
      bigCell.setCellContext(getCellFactory().getCellContext());
    }
    Style style = new StyleImpl();
    style.set(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute"), _StyleParameter_QueryFunction_twhn5o_a0a());
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private String _StyleParameter_QueryFunction_twhn5o_a0a() {
    return SPropertyOperations.getString(getNode(), MetaAdapterFactory.getProperty(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x7bc02723c1a35eddL, 0x7bc02723c1a35edeL, "value"));
  }
}
