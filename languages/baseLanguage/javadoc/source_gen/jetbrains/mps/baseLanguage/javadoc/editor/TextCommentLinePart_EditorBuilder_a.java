package jetbrains.mps.baseLanguage.javadoc.editor;

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
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.lang.editor.menus.transformation.NamedTransformationMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;

/*package*/ class TextCommentLinePart_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public TextCommentLinePart_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_x1gmbt_a();
  }

  private EditorCell createCollection_x1gmbt_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_x1gmbt_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    HandleEnterInTheEnd_Actions.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.addEditorCell(createModelAccess_x1gmbt_a0());
    return editorCell;
  }
  private EditorCell createModelAccess_x1gmbt_a0() {
    ModelAccessor modelAccessor = new ModelAccessor() {
      public String getText() {
        return SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, 0x7c7f5b2f31990288L, "text"));
      }
      public void setText(String text) {
        SPropertyOperations.set(myNode, MetaAdapterFactory.getProperty(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, 0x7c7f5b2f31990288L, "text"), text);
        TextCommentPartUtil.processCellText(getEditorContext(), myNode, text);
      }
      public boolean isValidText(String text) {
        return true;
      }
    };
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), modelAccessor, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ModelAccess_x1gmbt_a0");
    TextCommentLinePart_ActionMap.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setTransformationMenuLookup(new NamedTransformationMenuLookup(LanguageRegistry.getInstance(getEditorContext().getRepository()), MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x7c7f5b2f31990287L, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "jetbrains.mps.baseLanguage.javadoc.editor.TextCommentLinePart_ApplySideTransforms"));
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell));
    return editorCell;
  }
}
