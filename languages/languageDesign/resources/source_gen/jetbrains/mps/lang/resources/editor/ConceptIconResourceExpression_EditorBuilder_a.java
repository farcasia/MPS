package jetbrains.mps.lang.resources.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class ConceptIconResourceExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ConceptIconResourceExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_5awc4i_a();
  }

  private EditorCell createCollection_5awc4i_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_5awc4i_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_5awc4i_a0());
    editorCell.addEditorCell(createConstant_5awc4i_b0());
    if (nodeCondition_5awc4i_a2a()) {
      editorCell.addEditorCell(createCollection_5awc4i_c0());
    }
    if (nodeCondition_5awc4i_a3a()) {
      editorCell.addEditorCell(createRefNode_5awc4i_d0());
    }
    editorCell.addEditorCell(createConstant_5awc4i_e0());
    return editorCell;
  }
  private boolean nodeCondition_5awc4i_a2a() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getReferenceLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x7ce01982590bd48L, "concept_old")) != null);
  }
  private boolean nodeCondition_5awc4i_a3a() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept")) != null) || (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getReferenceLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x7ce01982590bd48L, "concept_old")) == null);
  }
  private EditorCell createComponent_5awc4i_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    return editorCell;
  }
  private EditorCell createConstant_5awc4i_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "/");
    editorCell.setCellId("Constant_5awc4i_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_5awc4i_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_5awc4i_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_5awc4i_a2a());
    editorCell.addEditorCell(createRefCell_5awc4i_b2a());
    return editorCell;
  }
  private EditorCell createConstant_5awc4i_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(deprecated)");
    editorCell.setCellId("Constant_5awc4i_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_5awc4i_b2a() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new ConceptIconResourceExpression_EditorBuilder_a.Inline_Builder_5awc4i_a1c0(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "concept_old");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };
    provider.setRole("concept_old");
    provider.setNoTargetText("<no concept_old>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("concept_old");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_5awc4i_a1c0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_5awc4i_a1c0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_5awc4i_a0b2a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_5awc4i_a0b2a() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
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
  private EditorCell createRefNode_5awc4i_d0() {
    SingleRoleCellProvider provider = new ConceptIconResourceExpression_EditorBuilder_a.conceptSingleRoleHandler_5awc4i_d0(myNode, MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept"), getEditorContext());
    return provider.createCell();
  }
  private static class conceptSingleRoleHandler_5awc4i_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public conceptSingleRoleHandler_5awc4i_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("concept");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x7ce01982590bd1eL, 0x426bf72c54e74e64L, "concept")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_concept");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no concept>";
    }
  }
  private EditorCell createConstant_5awc4i_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "/");
    editorCell.setCellId("Constant_5awc4i_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
