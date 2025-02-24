package jetbrains.mps.lang.constraints.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.editor.runtime.style.Padding;
import jetbrains.mps.editor.runtime.style.Measure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightParenStyleClass;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FirstLevelStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class NodeReferentConstraint_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public NodeReferentConstraint_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_y1wtxd_a();
  }

  private EditorCell createCollection_y1wtxd_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_y1wtxd_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_y1wtxd_a0());
    editorCell.addEditorCell(createConstant_y1wtxd_b0());
    editorCell.addEditorCell(createRefCell_y1wtxd_c0());
    editorCell.addEditorCell(createConstant_y1wtxd_d0());
    editorCell.addEditorCell(createCollection_y1wtxd_e0());
    editorCell.addEditorCell(createConstant_y1wtxd_f0());
    return editorCell;
  }
  private EditorCell createConstant_y1wtxd_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "link");
    editorCell.setCellId("Constant_y1wtxd_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_y1wtxd_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_y1wtxd_b0");
    Style style = new StyleImpl();
    new LeftParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_y1wtxd_c0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new NodeReferentConstraint_EditorBuilder_a.Inline_Builder_y1wtxd_a2a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "applicableLink");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull_smartReference(cell);
        return cell;
      }
    };
    provider.setRole("applicableLink");
    provider.setNoTargetText("<choose reference>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("applicableLink");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_y1wtxd_a2a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_y1wtxd_a2a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_y1wtxd_a0c0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_y1wtxd_a0c0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("role");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_role");
      Style style = new StyleImpl();
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
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
  private EditorCell createConstant_y1wtxd_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_y1wtxd_d0");
    Style style = new StyleImpl();
    new RightParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_y1wtxd_e0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_y1wtxd_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_y1wtxd_a4a());
    editorCell.addEditorCell(createRefNode_y1wtxd_b4a());
    if (nodeCondition_y1wtxd_a2e0()) {
      editorCell.addEditorCell(createCollection_y1wtxd_c4a());
    }
    editorCell.addEditorCell(createConstant_y1wtxd_d4a());
    editorCell.addEditorCell(createRefNode_y1wtxd_e4a());
    if (nodeCondition_y1wtxd_a5e0()) {
      editorCell.addEditorCell(createConstant_y1wtxd_f4a());
    }
    editorCell.addEditorCell(createRefNode_y1wtxd_g4a());
    return editorCell;
  }
  private boolean nodeCondition_y1wtxd_a2e0() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler")) != null);
  }
  private boolean nodeCondition_y1wtxd_a5e0() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation")) != null);
  }
  private EditorCell createConstant_y1wtxd_a4a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "referent set handler");
    editorCell.setCellId("Constant_y1wtxd_a4a");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_y1wtxd_b4a() {
    SingleRoleCellProvider provider = new NodeReferentConstraint_EditorBuilder_a.referentSetHandlerSingleRoleHandler_y1wtxd_b4a(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler"), getEditorContext());
    return provider.createCell();
  }
  private static class referentSetHandlerSingleRoleHandler_y1wtxd_b4a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public referentSetHandlerSingleRoleHandler_y1wtxd_b4a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("referentSetHandler");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10ed4593a89L, "referentSetHandler")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_referentSetHandler");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<none>";
    }
  }
  private EditorCell createCollection_y1wtxd_c4a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_y1wtxd_c4a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_y1wtxd_a2e0());
    editorCell.addEditorCell(createRefNode_y1wtxd_b2e0());
    return editorCell;
  }
  private EditorCell createConstant_y1wtxd_a2e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "keeps original reference");
    editorCell.setCellId("Constant_y1wtxd_a2e0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_y1wtxd_b2e0() {
    SingleRoleCellProvider provider = new NodeReferentConstraint_EditorBuilder_a.keepsReferenceSingleRoleHandler_y1wtxd_b2e0(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x7a8b97cf0435231fL, "keepsReference"), getEditorContext());
    return provider.createCell();
  }
  private static class keepsReferenceSingleRoleHandler_y1wtxd_b2e0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public keepsReferenceSingleRoleHandler_y1wtxd_b2e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x7a8b97cf0435231fL, "keepsReference"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x7a8b97cf0435231fL, "keepsReference"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x7a8b97cf0435231fL, "keepsReference"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("keepsReference");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x7a8b97cf0435231fL, "keepsReference")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_keepsReference");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<true>";
    }
  }
  private EditorCell createConstant_y1wtxd_d4a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "scope");
    editorCell.setCellId("Constant_y1wtxd_d4a");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_y1wtxd_e4a() {
    SingleRoleCellProvider provider = new NodeReferentConstraint_EditorBuilder_a.searchScopeFactorySingleRoleHandler_y1wtxd_e4a(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10b7319e797L, "searchScopeFactory"), getEditorContext());
    return provider.createCell();
  }
  private static class searchScopeFactorySingleRoleHandler_y1wtxd_e4a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public searchScopeFactorySingleRoleHandler_y1wtxd_e4a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10b7319e797L, "searchScopeFactory"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10b7319e797L, "searchScopeFactory"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10b7319e797L, "searchScopeFactory"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("searchScopeFactory");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x10b7319e797L, "searchScopeFactory")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_searchScopeFactory");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createConstant_y1wtxd_f4a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "presentation");
    editorCell.setCellId("Constant_y1wtxd_f4a");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.STRIKE_OUT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_y1wtxd_g4a() {
    SingleRoleCellProvider provider = new NodeReferentConstraint_EditorBuilder_a.presentationSingleRoleHandler_y1wtxd_g4a(myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation"), getEditorContext());
    return provider.createCell();
  }
  private static class presentationSingleRoleHandler_y1wtxd_g4a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public presentationSingleRoleHandler_y1wtxd_g4a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("presentation");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3f4bc5f5c6c14a28L, 0x8b10c83066ffa4a1L, 0x10b731752daL, 0x36367902116a44c4L, "presentation")));
      try {
        EditorCell editorCell = createConstant_y1wtxd_a6e0();
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    private EditorCell createConstant_y1wtxd_a6e0() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<no presentation (deprecated)>");
      editorCell.setCellId("Constant_y1wtxd_a6e0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_y1wtxd_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_y1wtxd_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
