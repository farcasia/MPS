package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.editor.runtime.EditorCell_Empty;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Table;
import jetbrains.mps.editor.runtime.style.DefaultBaseLine;
import jetbrains.mps.editor.runtime.style.TableComponent;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class MatrixConstructor_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public MatrixConstructor_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createAlternation_lhhqxl_a();
  }

  private EditorCell createAlternation_lhhqxl_a() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_lhhqxl_a0();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createCollection_lhhqxl_a0();
    } else {
      editorCell = createCollection_lhhqxl_a0_0();
    }
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, getNode());
    if (bigCell != null) {
      bigCell.setBig(true);
      bigCell.setCellContext(getCellFactory().getCellContext());
    }
    return editorCell;
  }
  private boolean nodeCondition_lhhqxl_a0() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a626b0a85L, 0x308cb55abc73bd40L, "column"));
  }
  private EditorCell createCollection_lhhqxl_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_lhhqxl_a0");
    editorCell.addEditorCell(createEmpty_lhhqxl_a0a());
    editorCell.addEditorCell(createRefNodeList_lhhqxl_b0a());
    editorCell.addEditorCell(createEmpty_lhhqxl_c0a());
    return editorCell;
  }
  private EditorCell createEmpty_lhhqxl_a0a() {
    EditorCell_Empty editorCell = new EditorCell_Empty(getEditorContext(), myNode);
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("Empty_lhhqxl_a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNodeList_lhhqxl_b0a() {
    AbstractCellListHandler handler = new MatrixConstructor_EditorBuilder_a.componentsListHandler_lhhqxl_b0a(myNode, "components", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Table(), false);
    editorCell.setCellId("refNodeList_components");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BRACKETS, true);
    style.set(StyleAttributes.DEFAULT_BASE_LINE, DefaultBaseLine.CENTER);
    style.set(StyleAttributes.TABLE_COMPONENT, TableComponent.VERTICAL_COLLECTION);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class componentsListHandler_lhhqxl_b0a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public componentsListHandler_lhhqxl_b0a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(componentsListHandler_lhhqxl_b0a.this.getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a626b0a85L, 0x42d5783a626b0a8dL, "components")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a626b0a85L, 0x42d5783a626b0a8dL, "components"), elementNode));
        }
      }
    }
  }
  private EditorCell createEmpty_lhhqxl_c0a() {
    EditorCell_Empty editorCell = new EditorCell_Empty(getEditorContext(), myNode);
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("Empty_lhhqxl_c0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createCollection_lhhqxl_a0_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_lhhqxl_a0_0");
    editorCell.addEditorCell(createEmpty_lhhqxl_a0a_0());
    editorCell.addEditorCell(createRefNodeList_lhhqxl_b0a_0());
    editorCell.addEditorCell(createEmpty_lhhqxl_c0a_0());
    return editorCell;
  }
  private EditorCell createEmpty_lhhqxl_a0a_0() {
    EditorCell_Empty editorCell = new EditorCell_Empty(getEditorContext(), myNode);
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("Empty_lhhqxl_a0a_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNodeList_lhhqxl_b0a_0() {
    AbstractCellListHandler handler = new MatrixConstructor_EditorBuilder_a.componentsListHandler_lhhqxl_b0a_0(myNode, "components", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Table(), false);
    editorCell.setCellId("refNodeList_components_1");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BRACKETS, true);
    style.set(StyleAttributes.DEFAULT_BASE_LINE, DefaultBaseLine.CENTER);
    style.set(StyleAttributes.TABLE_COMPONENT, TableComponent.HORIZONTAL_COLLECTION);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class componentsListHandler_lhhqxl_b0a_0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public componentsListHandler_lhhqxl_b0a_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(componentsListHandler_lhhqxl_b0a_0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a626b0a85L, 0x42d5783a626b0a8dL, "components")));
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
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, " "));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a626b0a85L, 0x42d5783a626b0a8dL, "components"), elementNode));
        }
      }
    }
    @Override
    public EditorCell createSeparatorCell(SNode prevNode, SNode nextNode) {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), getNode(), " ");
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
  private EditorCell createEmpty_lhhqxl_c0a_0() {
    EditorCell_Empty editorCell = new EditorCell_Empty(getEditorContext(), myNode);
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("Empty_lhhqxl_c0a_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
