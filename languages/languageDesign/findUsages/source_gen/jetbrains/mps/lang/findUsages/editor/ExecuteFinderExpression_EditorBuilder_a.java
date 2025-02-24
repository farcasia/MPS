package jetbrains.mps.lang.findUsages.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.MethodNameStyleClass;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenAfterNameStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightParenStyleClass;

/*package*/ class ExecuteFinderExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ExecuteFinderExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ydcqpo_a();
  }

  private EditorCell createCollection_ydcqpo_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ydcqpo_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_ydcqpo_a0());
    editorCell.addEditorCell(createRefCell_ydcqpo_b0());
    editorCell.addEditorCell(createConstant_ydcqpo_c0());
    editorCell.addEditorCell(createRefNode_ydcqpo_d0());
    editorCell.addEditorCell(createConstant_ydcqpo_e0());
    editorCell.addEditorCell(createRefNode_ydcqpo_f0());
    editorCell.addEditorCell(createConstant_ydcqpo_g0());
    editorCell.addEditorCell(createRefNode_ydcqpo_h0());
    editorCell.addEditorCell(createConstant_ydcqpo_i0());
    return editorCell;
  }
  private EditorCell createConstant_ydcqpo_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "execute");
    editorCell.setCellId("Constant_ydcqpo_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_ydcqpo_b0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new ExecuteFinderExpression_EditorBuilder_a.Inline_Builder_ydcqpo_a1a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "finder");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("finder");
    provider.setNoTargetText("<no finder>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("finder");
    }
    Style style = new StyleImpl();
    new MethodNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_ydcqpo_a1a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_ydcqpo_a1a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_ydcqpo_a0b0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_ydcqpo_a0b0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<finder>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_ydcqpo_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(");
    editorCell.setCellId("Constant_ydcqpo_c0");
    Style style = new StyleImpl();
    new LeftParenAfterNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ydcqpo_d0() {
    SingleRoleCellProvider provider = new ExecuteFinderExpression_EditorBuilder_a.queryNodeSingleRoleHandler_ydcqpo_d0(myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce804L, "queryNode"), getEditorContext());
    return provider.createCell();
  }
  private static class queryNodeSingleRoleHandler_ydcqpo_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public queryNodeSingleRoleHandler_ydcqpo_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce804L, "queryNode"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce804L, "queryNode"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce804L, "queryNode"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("queryNode");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce804L, "queryNode")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_queryNode");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<node>";
    }
  }
  private EditorCell createConstant_ydcqpo_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_ydcqpo_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ydcqpo_f0() {
    SingleRoleCellProvider provider = new ExecuteFinderExpression_EditorBuilder_a.queryScopeSingleRoleHandler_ydcqpo_f0(myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce805L, "queryScope"), getEditorContext());
    return provider.createCell();
  }
  private static class queryScopeSingleRoleHandler_ydcqpo_f0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public queryScopeSingleRoleHandler_ydcqpo_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce805L, "queryScope"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce805L, "queryScope"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce805L, "queryScope"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("queryScope");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x118d6fce805L, "queryScope")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_queryScope");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<same scope>";
    }
  }
  private EditorCell createConstant_ydcqpo_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_ydcqpo_g0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ydcqpo_h0() {
    SingleRoleCellProvider provider = new ExecuteFinderExpression_EditorBuilder_a.monitorSingleRoleHandler_ydcqpo_h0(myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x75272a849af7fedfL, "monitor"), getEditorContext());
    return provider.createCell();
  }
  private static class monitorSingleRoleHandler_ydcqpo_h0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public monitorSingleRoleHandler_ydcqpo_h0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x75272a849af7fedfL, "monitor"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x75272a849af7fedfL, "monitor"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x75272a849af7fedfL, "monitor"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("monitor");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x118d6fce801L, 0x75272a849af7fedfL, "monitor")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_monitor");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<progress monitor>";
    }
  }
  private EditorCell createConstant_ydcqpo_i0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ")");
    editorCell.setCellId("Constant_ydcqpo_i0");
    Style style = new StyleImpl();
    new RightParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
