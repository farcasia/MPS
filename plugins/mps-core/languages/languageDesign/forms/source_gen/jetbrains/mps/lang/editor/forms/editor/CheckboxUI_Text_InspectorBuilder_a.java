package jetbrains.mps.lang.editor.forms.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.headerStyleClass;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.propertyStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

/*package*/ class CheckboxUI_Text_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CheckboxUI_Text_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_z84i6z_a();
  }

  private EditorCell createCollection_z84i6z_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_z84i6z_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(createConstant_z84i6z_a0());
    editorCell.addEditorCell(createComponent_z84i6z_b0());
    editorCell.addEditorCell(createConstant_z84i6z_c0());
    editorCell.addEditorCell(createConstant_z84i6z_d0());
    editorCell.addEditorCell(createCollection_z84i6z_e0());
    editorCell.addEditorCell(createCollection_z84i6z_f0());
    return editorCell;
  }
  private EditorCell createConstant_z84i6z_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Style:");
    editorCell.setCellId("Constant_z84i6z_a0");
    Style style = new StyleImpl();
    new headerStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_z84i6z_b0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.CellStyle_Component");
    return editorCell;
  }
  private EditorCell createConstant_z84i6z_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_z84i6z_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_z84i6z_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Text checkbox:");
    editorCell.setCellId("Constant_z84i6z_d0");
    Style style = new StyleImpl();
    new headerStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_z84i6z_e0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_z84i6z_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_z84i6z_a4a());
    editorCell.addEditorCell(createProperty_z84i6z_b4a());
    return editorCell;
  }
  private EditorCell createConstant_z84i6z_a4a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "true text");
    editorCell.setCellId("Constant_z84i6z_a4a");
    Style style = new StyleImpl();
    new propertyStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_z84i6z_b4a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("trueText");
    provider.setNoTargetText("<no trueText>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_trueText");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createCollection_z84i6z_f0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_z84i6z_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_z84i6z_a5a());
    editorCell.addEditorCell(createProperty_z84i6z_b5a());
    return editorCell;
  }
  private EditorCell createConstant_z84i6z_a5a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "false text");
    editorCell.setCellId("Constant_z84i6z_a5a");
    Style style = new StyleImpl();
    new propertyStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_z84i6z_b5a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("falseText");
    provider.setNoTargetText("<no falseText>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_falseText");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
