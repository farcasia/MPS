package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
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

/*package*/ class SideTransformHintSubstituteActionsBuilder_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SideTransformHintSubstituteActionsBuilder_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_185r4c_a();
  }

  private EditorCell createCollection_185r4c_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_185r4c_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_185r4c_a0());
    editorCell.addEditorCell(createCollection_185r4c_b0());
    editorCell.setUsesBraces(true);
    return editorCell;
  }
  private EditorCell createCollection_185r4c_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createProperty_185r4c_a0a());
    editorCell.addEditorCell(createConstant_185r4c_b0a());
    editorCell.addEditorCell(createRefCell_185r4c_c0a());
    editorCell.addEditorCell(createConstant_185r4c_d0a());
    editorCell.addEditorCell(createProperty_185r4c_e0a());
    editorCell.addEditorCell(createConstant_185r4c_f0a());
    editorCell.addEditorCell(createProperty_185r4c_g0a());
    return editorCell;
  }
  private EditorCell createProperty_185r4c_a0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("side");
    provider.setNoTargetText("<no side>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_side");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_185r4c_b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "transformed node:");
    editorCell.setCellId("Constant_185r4c_b0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_185r4c_c0a() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new SideTransformHintSubstituteActionsBuilder_EditorBuilder_a.Inline_Builder_185r4c_a2a0(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "applicableConcept");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull_smartReference(cell);
        return cell;
      }
    };
    provider.setRole("applicableConcept");
    provider.setNoTargetText("<choose concept>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("applicableConcept");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_185r4c_a2a0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_185r4c_a2a0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_185r4c_a0c0a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_185r4c_a0c0a() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_name");
      Style style = new StyleImpl();
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
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
  private EditorCell createConstant_185r4c_d0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "tag:");
    editorCell.setCellId("Constant_185r4c_d0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_185r4c_e0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("transformTag");
    provider.setNoTargetText("<no transformTag>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_transformTag");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_185r4c_f0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " //");
    editorCell.setCellId("Constant_185r4c_f0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_185r4c_g0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_description");
    Style style = new StyleImpl();
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
  private EditorCell createCollection_185r4c_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a1a());
    editorCell.addEditorCell(createCollection_185r4c_b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_185r4c_b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_185r4c_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_185r4c_a1b0());
    editorCell.addEditorCell(createCollection_185r4c_b1b0());
    editorCell.addEditorCell(createConstant_185r4c_c1b0());
    editorCell.addEditorCell(createCollection_185r4c_d1b0());
    editorCell.addEditorCell(createCollection_185r4c_e1b0());
    editorCell.addEditorCell(createCollection_185r4c_f1b0());
    editorCell.addEditorCell(createCollection_185r4c_g1b0());
    editorCell.addEditorCell(createConstant_185r4c_h1b0());
    editorCell.addEditorCell(createCollection_185r4c_i1b0());
    editorCell.addEditorCell(createCollection_185r4c_j1b0());
    return editorCell;
  }
  private EditorCell createCollection_185r4c_a1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_a1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_185r4c_a0b1a());
    return editorCell;
  }
  private EditorCell createConstant_185r4c_a0b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "condition :");
    editorCell.setCellId("Constant_185r4c_a0b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_b1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_b1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a1b1a());
    editorCell.addEditorCell(createRefNode_185r4c_b1b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a1b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_185r4c_b1b1a() {
    SingleRoleCellProvider provider = new SideTransformHintSubstituteActionsBuilder_EditorBuilder_a.preconditionSingleRoleHandler_185r4c_b1b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x10cd4e11b18L, "precondition"), getEditorContext());
    return provider.createCell();
  }
  private static class preconditionSingleRoleHandler_185r4c_b1b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public preconditionSingleRoleHandler_185r4c_b1b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x10cd4e11b18L, "precondition"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x10cd4e11b18L, "precondition"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x10cd4e11b18L, "precondition"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("precondition");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x10cd4e11b18L, "precondition")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_precondition");
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
  private EditorCell createConstant_185r4c_c1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_185r4c_c1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_d1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_d1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_185r4c_a3b1a());
    return editorCell;
  }
  private EditorCell createConstant_185r4c_a3b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "common initializer :");
    editorCell.setCellId("Constant_185r4c_a3b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_e1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_e1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a4b1a());
    editorCell.addEditorCell(createRefNodeList_185r4c_b4b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a4b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNodeList_185r4c_b4b1a() {
    AbstractCellListHandler handler = new SideTransformHintSubstituteActionsBuilder_EditorBuilder_a.variableListHandler_185r4c_b4b1a(myNode, "variable", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_variable");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class variableListHandler_185r4c_b4b1a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public variableListHandler_185r4c_b4b1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1182d1a6565L, "jetbrains.mps.lang.actions.structure.SideTransformVariableDeclaration"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(variableListHandler_185r4c_b4b1a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d1f5f8bL, "variable")));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_185r4c_a1e1b0();
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d1f5f8bL, "variable"), elementNode));
        }
      }
    }
    private EditorCell createConstant_185r4c_a1e1b0() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
      editorCell.setCellId("Constant_185r4c_a1e1b0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.EDITABLE, true);
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("<no common variables>");
      return editorCell;
    }
  }
  private EditorCell createCollection_185r4c_f1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_f1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a5b1a());
    editorCell.addEditorCell(createConstant_185r4c_b5b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a5b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createConstant_185r4c_b5b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "....................................");
    editorCell.setCellId("Constant_185r4c_b5b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_g1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_g1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a6b1a());
    editorCell.addEditorCell(createRefNode_185r4c_b6b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a6b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_185r4c_b6b1a() {
    SingleRoleCellProvider provider = new SideTransformHintSubstituteActionsBuilder_EditorBuilder_a.commonInitializerSingleRoleHandler_185r4c_b6b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d38806cL, "commonInitializer"), getEditorContext());
    return provider.createCell();
  }
  private static class commonInitializerSingleRoleHandler_185r4c_b6b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public commonInitializerSingleRoleHandler_185r4c_b6b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d38806cL, "commonInitializer"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d38806cL, "commonInitializer"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d38806cL, "commonInitializer"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("commonInitializer");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1182d38806cL, "commonInitializer")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_commonInitializer");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no common initializer>";
    }
  }
  private EditorCell createConstant_185r4c_h1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_185r4c_h1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_i1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_i1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_185r4c_a8b1a());
    return editorCell;
  }
  private EditorCell createConstant_185r4c_a8b1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "actions :");
    editorCell.setCellId("Constant_185r4c_a8b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_185r4c_j1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_185r4c_j1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_185r4c_a9b1a());
    editorCell.addEditorCell(createRefNodeList_185r4c_b9b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_185r4c_a9b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNodeList_185r4c_b9b1a() {
    AbstractCellListHandler handler = new SideTransformHintSubstituteActionsBuilder_EditorBuilder_a.partListHandler_185r4c_b9b1a(myNode, "part", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_part");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class partListHandler_185r4c_b9b1a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public partListHandler_185r4c_b9b1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getInterfaceConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x743255fa452e1995L, "jetbrains.mps.lang.actions.structure.SideTransformMenuBuilderPart"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(partListHandler_185r4c_b9b1a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x11225076f7dL, "part")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x11225076f7dL, "part"), elementNode));
        }
      }
    }
    @Override
    public EditorCell createSeparatorCell(SNode prevNode, SNode nextNode) {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), getNode(), "----------");
      editorCell.setSelectable(false);
      Style style = new StyleImpl();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "");
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      editorCell.getStyle().putAll(style);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      return editorCell;
    }
  }
}
