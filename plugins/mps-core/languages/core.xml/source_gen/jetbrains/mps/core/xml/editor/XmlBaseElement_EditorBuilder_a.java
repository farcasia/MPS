package jetbrains.mps.core.xml.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.Padding;
import jetbrains.mps.editor.runtime.style.Measure;

/*package*/ class XmlBaseElement_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public XmlBaseElement_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createError_xlug9o_a();
  }

  private EditorCell createError_xlug9o_a() {
    EditorCell_Error editorCell = new EditorCell_Error(getEditorContext(), myNode, "<no element>");
    editorCell.setCellId("Error_xlug9o_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.PADDING_LEFT, new Padding(0, Measure.SPACES));
    style.set(StyleAttributes.PADDING_RIGHT, new Padding(0, Measure.SPACES));
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
