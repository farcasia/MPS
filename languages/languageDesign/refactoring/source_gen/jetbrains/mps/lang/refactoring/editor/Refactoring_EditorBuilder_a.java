package jetbrains.mps.lang.refactoring.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.MatchingStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.StringLiteralStyleClass;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class Refactoring_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Refactoring_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_kt8f5i_a();
  }

  private EditorCell createCollection_kt8f5i_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_kt8f5i_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_kt8f5i_a0());
    editorCell.addEditorCell(createCollection_kt8f5i_b0());
    editorCell.addEditorCell(createConstant_kt8f5i_c0());
    editorCell.addEditorCell(createConstant_kt8f5i_d0());
    editorCell.addEditorCell(createRefNodeList_kt8f5i_e0());
    editorCell.addEditorCell(createConstant_kt8f5i_f0());
    editorCell.addEditorCell(createConstant_kt8f5i_g0());
    editorCell.addEditorCell(createRefNodeList_kt8f5i_h0());
    editorCell.addEditorCell(createConstant_kt8f5i_i0());
    editorCell.addEditorCell(createRefNode_kt8f5i_j0());
    editorCell.addEditorCell(createConstant_kt8f5i_k0());
    editorCell.addEditorCell(createRefNode_kt8f5i_l0());
    editorCell.addEditorCell(createConstant_kt8f5i_m0());
    editorCell.addEditorCell(createRefNode_kt8f5i_n0());
    editorCell.addEditorCell(createConstant_kt8f5i_o0());
    editorCell.addEditorCell(createRefNode_kt8f5i_p0());
    editorCell.addEditorCell(createConstant_kt8f5i_q0());
    editorCell.addEditorCell(createRefNode_kt8f5i_r0());
    return editorCell;
  }
  private EditorCell createCollection_kt8f5i_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_kt8f5i_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_kt8f5i_a0a());
    editorCell.addEditorCell(createProperty_kt8f5i_b0a());
    editorCell.addEditorCell(createConstant_kt8f5i_c0a());
    editorCell.addEditorCell(createProperty_kt8f5i_d0a());
    editorCell.addEditorCell(createConstant_kt8f5i_e0a());
    editorCell.addEditorCell(createConstant_kt8f5i_f0a());
    editorCell.addEditorCell(createRefCell_kt8f5i_g0a());
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "refactoring");
    editorCell.setCellId("Constant_kt8f5i_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_kt8f5i_b0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
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
  private EditorCell createConstant_kt8f5i_c0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(");
    editorCell.setCellId("Constant_kt8f5i_c0a");
    Style style = new StyleImpl();
    new MatchingStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_kt8f5i_d0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("userFriendlyName");
    provider.setNoTargetText("<no caption>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_userFriendlyName");
    Style style = new StyleImpl();
    new StringLiteralStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_e0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ")");
    editorCell.setCellId("Constant_kt8f5i_e0a");
    Style style = new StyleImpl();
    new MatchingStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_f0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "overrides");
    editorCell.setCellId("Constant_kt8f5i_f0a");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_kt8f5i_g0a() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new Refactoring_EditorBuilder_a.Inline_Builder_kt8f5i_a6a0(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "overrides");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };
    provider.setRole("overrides");
    provider.setNoTargetText("<nothing>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("overrides");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_kt8f5i_a6a0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_kt8f5i_a6a0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_kt8f5i_a0g0a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_kt8f5i_a0g0a() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_name_1");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createCollection_kt8f5i_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_kt8f5i_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_kt8f5i_a1a());
    editorCell.addEditorCell(createRefNode_kt8f5i_b1a());
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_a1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "target:");
    editorCell.setCellId("Constant_kt8f5i_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_b1a() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.targetSingleRoleHandler_kt8f5i_b1a(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a77a0656L, "target"), getEditorContext());
    return provider.createCell();
  }
  private static class targetSingleRoleHandler_kt8f5i_b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public targetSingleRoleHandler_kt8f5i_b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a77a0656L, "target"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a77a0656L, "target"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a77a0656L, "target"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("target");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a77a0656L, "target")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_target");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no target>";
    }
  }
  private EditorCell createConstant_kt8f5i_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "parameters:");
    editorCell.setCellId("Constant_kt8f5i_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_kt8f5i_e0() {
    AbstractCellListHandler handler = new Refactoring_EditorBuilder_a.parameterListHandler_kt8f5i_e0(myNode, "parameter", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_parameter");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class parameterListHandler_kt8f5i_e0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public parameterListHandler_kt8f5i_e0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0664L, "jetbrains.mps.lang.refactoring.structure.RefactoringParameter"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(parameterListHandler_kt8f5i_e0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2d8L, "parameter")));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    public void installElementCellActions(SNode elementNode, EditorCell elementCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2d8L, "parameter"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_kt8f5i_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_kt8f5i_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "internal fields:");
    editorCell.setCellId("Constant_kt8f5i_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_kt8f5i_h0() {
    AbstractCellListHandler handler = new Refactoring_EditorBuilder_a.fieldListHandler_kt8f5i_h0(myNode, "field", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_field");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class fieldListHandler_kt8f5i_h0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public fieldListHandler_kt8f5i_h0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0662L, "jetbrains.mps.lang.refactoring.structure.RefactoringField"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(fieldListHandler_kt8f5i_h0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2d9L, "field")));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    public void installElementCellActions(SNode elementNode, EditorCell elementCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2d9L, "field"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_kt8f5i_i0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_i0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_j0() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.initBlockSingleRoleHandler_kt8f5i_j0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x4c4b92003e4d77d8L, "initBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class initBlockSingleRoleHandler_kt8f5i_j0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public initBlockSingleRoleHandler_kt8f5i_j0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x4c4b92003e4d77d8L, "initBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x4c4b92003e4d77d8L, "initBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x4c4b92003e4d77d8L, "initBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("initBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x4c4b92003e4d77d8L, "initBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_initBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no init block>";
    }
  }
  private EditorCell createConstant_kt8f5i_k0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_k0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_l0() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.affectedNodesBlockSingleRoleHandler_kt8f5i_l0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x12b38e70a3eb6027L, "affectedNodesBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class affectedNodesBlockSingleRoleHandler_kt8f5i_l0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public affectedNodesBlockSingleRoleHandler_kt8f5i_l0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x12b38e70a3eb6027L, "affectedNodesBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x12b38e70a3eb6027L, "affectedNodesBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x12b38e70a3eb6027L, "affectedNodesBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("affectedNodesBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x12b38e70a3eb6027L, "affectedNodesBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_affectedNodesBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<affected nodes>";
    }
  }
  private EditorCell createConstant_kt8f5i_m0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_m0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_n0() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.doRefactorBlockSingleRoleHandler_kt8f5i_n0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2ddL, "doRefactorBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class doRefactorBlockSingleRoleHandler_kt8f5i_n0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public doRefactorBlockSingleRoleHandler_kt8f5i_n0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2ddL, "doRefactorBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2ddL, "doRefactorBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2ddL, "doRefactorBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("doRefactorBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x5fb04b74a778e2ddL, "doRefactorBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_doRefactorBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no doRefactorBlock>";
    }
  }
  private EditorCell createConstant_kt8f5i_o0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_o0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_p0() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.modelsToGenerateBlockSingleRoleHandler_kt8f5i_p0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x88e6d7a0aad9adfL, "modelsToGenerateBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class modelsToGenerateBlockSingleRoleHandler_kt8f5i_p0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public modelsToGenerateBlockSingleRoleHandler_kt8f5i_p0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x88e6d7a0aad9adfL, "modelsToGenerateBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x88e6d7a0aad9adfL, "modelsToGenerateBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x88e6d7a0aad9adfL, "modelsToGenerateBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("modelsToGenerateBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x88e6d7a0aad9adfL, "modelsToGenerateBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_modelsToGenerateBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no modelsToGenerateBlock>";
    }
  }
  private EditorCell createConstant_kt8f5i_q0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_kt8f5i_q0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_kt8f5i_r0() {
    SingleRoleCellProvider provider = new Refactoring_EditorBuilder_a.doWhenDoneBlockSingleRoleHandler_kt8f5i_r0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x1c9210c7226dbbf9L, "doWhenDoneBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class doWhenDoneBlockSingleRoleHandler_kt8f5i_r0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public doWhenDoneBlockSingleRoleHandler_kt8f5i_r0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x1c9210c7226dbbf9L, "doWhenDoneBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x1c9210c7226dbbf9L, "doWhenDoneBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x1c9210c7226dbbf9L, "doWhenDoneBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("doWhenDoneBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a778e245L, 0x1c9210c7226dbbf9L, "doWhenDoneBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_doWhenDoneBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no doWhenDoneBlock>";
    }
  }
}
