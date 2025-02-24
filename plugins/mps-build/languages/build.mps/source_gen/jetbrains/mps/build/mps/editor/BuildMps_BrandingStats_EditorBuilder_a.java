package jetbrains.mps.build.mps.editor;

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
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class BuildMps_BrandingStats_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BuildMps_BrandingStats_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_wg356q_a();
  }

  private EditorCell createCollection_wg356q_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_wg356q_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_wg356q_a0());
    editorCell.addEditorCell(createCollection_wg356q_b0());
    return editorCell;
  }
  private EditorCell createConstant_wg356q_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "statistics");
    editorCell.setCellId("Constant_wg356q_a0");
    Style style = new StyleImpl();
    new keywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_wg356q_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_wg356q_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_wg356q_a1a());
    editorCell.addEditorCell(createRefNode_wg356q_b1a());
    editorCell.addEditorCell(createConstant_wg356q_c1a());
    editorCell.addEditorCell(createRefNode_wg356q_d1a());
    return editorCell;
  }
  private EditorCell createConstant_wg356q_a1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "service");
    editorCell.setCellId("Constant_wg356q_a1a");
    Style style = new StyleImpl();
    new keywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_wg356q_b1a() {
    SingleRoleCellProvider provider = new BuildMps_BrandingStats_EditorBuilder_a.serviceSingleRoleHandler_wg356q_b1a(myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1298L, "service"), getEditorContext());
    return provider.createCell();
  }
  private static class serviceSingleRoleHandler_wg356q_b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public serviceSingleRoleHandler_wg356q_b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1298L, "service"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1298L, "service"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1298L, "service"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("service");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1298L, "service")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_service");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no service>";
    }
  }
  private EditorCell createConstant_wg356q_c1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "settings");
    editorCell.setCellId("Constant_wg356q_c1a");
    Style style = new StyleImpl();
    new keywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_wg356q_d1a() {
    SingleRoleCellProvider provider = new BuildMps_BrandingStats_EditorBuilder_a.settingsSingleRoleHandler_wg356q_d1a(myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1297L, "settings"), getEditorContext());
    return provider.createCell();
  }
  private static class settingsSingleRoleHandler_wg356q_d1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public settingsSingleRoleHandler_wg356q_d1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1297L, "settings"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1297L, "settings"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1297L, "settings"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("settings");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xad72aee24a9d06fL, 0xad72aee24aa1297L, "settings")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_settings");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no settings>";
    }
  }
}
