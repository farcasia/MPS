package jetbrains.mps.ide.httpsupport.editor;

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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FieldStyleClass;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

/*package*/ class QueryParameter_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public QueryParameter_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_pp9zo5_a();
  }

  private EditorCell createCollection_pp9zo5_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_pp9zo5_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_pp9zo5_a0());
    editorCell.addEditorCell(createConstant_pp9zo5_b0());
    editorCell.addEditorCell(createRefNode_pp9zo5_c0());
    if (nodeCondition_pp9zo5_a3a()) {
      editorCell.addEditorCell(createConstant_pp9zo5_d0());
    }
    return editorCell;
  }
  private boolean nodeCondition_pp9zo5_a3a() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x205f4376c585b43dL, "required"));
  }
  private EditorCell createProperty_pp9zo5_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    new FieldStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_pp9zo5_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "converter:");
    editorCell.setCellId("Constant_pp9zo5_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_pp9zo5_c0() {
    SingleRoleCellProvider provider = new QueryParameter_EditorBuilder_a.parameterConverterSingleRoleHandler_pp9zo5_c0(myNode, MetaAdapterFactory.getContainmentLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x46f064803fbfba0fL, "parameterConverter"), getEditorContext());
    return provider.createCell();
  }
  private static class parameterConverterSingleRoleHandler_pp9zo5_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public parameterConverterSingleRoleHandler_pp9zo5_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x46f064803fbfba0fL, "parameterConverter"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x46f064803fbfba0fL, "parameterConverter"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x46f064803fbfba0fL, "parameterConverter"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("parameterConverter");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L, 0x46f064803fbfba0fL, "parameterConverter")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_parameterConverter");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no parameterConverter>";
    }
  }
  private EditorCell createConstant_pp9zo5_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "required");
    editorCell.setCellId("requiredKeyword");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, true);
    editorCell.getStyle().putAll(style);
    QueryParameter_Actions.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
}
