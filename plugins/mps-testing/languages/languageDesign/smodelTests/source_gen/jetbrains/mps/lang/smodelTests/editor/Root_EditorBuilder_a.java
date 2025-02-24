package jetbrains.mps.lang.smodelTests.editor;

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
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

/*package*/ class Root_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Root_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_30aiet_a();
  }

  private EditorCell createCollection_30aiet_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_30aiet_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_30aiet_a0());
    editorCell.addEditorCell(createCollection_30aiet_b0());
    if (nodeCondition_30aiet_a2a()) {
      editorCell.addEditorCell(createConstant_30aiet_c0());
    }
    return editorCell;
  }
  private boolean nodeCondition_30aiet_a2a() {
    return BlockCells.useBraces();
  }
  private EditorCell createCollection_30aiet_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_30aiet_a0a());
    if (nodeCondition_30aiet_a1a0()) {
      editorCell.addEditorCell(createConstant_30aiet_b0a());
    }
    return editorCell;
  }
  private boolean nodeCondition_30aiet_a1a0() {
    return BlockCells.useBraces();
  }
  private EditorCell createCollection_30aiet_a0a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_a0a");
    editorCell.addEditorCell(createConstant_30aiet_a0a0());
    editorCell.addEditorCell(createProperty_30aiet_b0a0());
    return editorCell;
  }
  private EditorCell createConstant_30aiet_a0a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "root");
    editorCell.setCellId("Constant_30aiet_a0a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_30aiet_b0a0() {
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
  private EditorCell createConstant_30aiet_b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_30aiet_b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_30aiet_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_30aiet_a1a());
    editorCell.addEditorCell(createCollection_30aiet_b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_30aiet_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_30aiet_b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_30aiet_b1a");
    editorCell.addEditorCell(createConstant_30aiet_a1b0());
    editorCell.addEditorCell(createCollection_30aiet_b1b0());
    editorCell.addEditorCell(createConstant_30aiet_c1b0());
    editorCell.addEditorCell(createCollection_30aiet_d1b0());
    editorCell.addEditorCell(createConstant_30aiet_e1b0());
    editorCell.addEditorCell(createCollection_30aiet_f1b0());
    return editorCell;
  }
  private EditorCell createConstant_30aiet_a1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "child_0_n:");
    editorCell.setCellId("Constant_30aiet_a1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_30aiet_b1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_b1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_30aiet_a1b1a());
    editorCell.addEditorCell(createRefNodeList_30aiet_b1b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_30aiet_a1b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNodeList_30aiet_b1b1a() {
    AbstractCellListHandler handler = new Root_EditorBuilder_a.child_0_nListHandler_30aiet_b1b1a(myNode, "child_0_n", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_child_0_n");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class child_0_nListHandler_30aiet_b1b1a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public child_0_nListHandler_30aiet_b1b1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fbfL, "jetbrains.mps.lang.smodelTests.structure.Child"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(child_0_nListHandler_30aiet_b1b1a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc6L, "child_0_n")));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_30aiet_a1b1b0();
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc6L, "child_0_n"), elementNode));
        }
      }
    }
    private EditorCell createConstant_30aiet_a1b1b0() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<empty>");
      editorCell.setCellId("Constant_30aiet_a1b1b0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_30aiet_c1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "child_1_n:");
    editorCell.setCellId("Constant_30aiet_c1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_30aiet_d1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_d1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_30aiet_a3b1a());
    editorCell.addEditorCell(createRefNodeList_30aiet_b3b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_30aiet_a3b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNodeList_30aiet_b3b1a() {
    AbstractCellListHandler handler = new Root_EditorBuilder_a.child_1_nListHandler_30aiet_b3b1a(myNode, "child_1_n", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_child_1_n");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class child_1_nListHandler_30aiet_b3b1a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public child_1_nListHandler_30aiet_b3b1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fbfL, "jetbrains.mps.lang.smodelTests.structure.Child"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(child_1_nListHandler_30aiet_b3b1a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n")));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_30aiet_a1d1b0();
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n"), elementNode));
        }
      }
    }
    private EditorCell createConstant_30aiet_a1d1b0() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<empty>");
      editorCell.setCellId("Constant_30aiet_a1d1b0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_30aiet_e1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "childSubConcept_0_n:");
    editorCell.setCellId("Constant_30aiet_e1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_30aiet_f1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_30aiet_f1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_30aiet_a5b1a());
    editorCell.addEditorCell(createRefNodeList_30aiet_b5b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_30aiet_a5b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNodeList_30aiet_b5b1a() {
    AbstractCellListHandler handler = new Root_EditorBuilder_a.childSubConcept_0_nListHandler_30aiet_b5b1a(myNode, "childSubConcept_0_n", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_childSubConcept_0_n");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class childSubConcept_0_nListHandler_30aiet_b5b1a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public childSubConcept_0_nListHandler_30aiet_b5b1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x7a02788de4ab4dL, "jetbrains.mps.lang.smodelTests.structure.ChildSubConcept"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(childSubConcept_0_nListHandler_30aiet_b5b1a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x7a02788de4ab50L, "childSubConcept_0_n")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x7a02788de4ab50L, "childSubConcept_0_n"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_30aiet_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_30aiet_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NO_WRAP, true);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
