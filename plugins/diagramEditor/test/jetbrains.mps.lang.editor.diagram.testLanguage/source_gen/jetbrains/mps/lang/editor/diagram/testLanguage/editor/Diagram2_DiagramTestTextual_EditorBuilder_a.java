package jetbrains.mps.lang.editor.diagram.testLanguage.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;

/*package*/ class Diagram2_DiagramTestTextual_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Diagram2_DiagramTestTextual_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_b472j3_a();
  }

  private EditorCell createCollection_b472j3_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_b472j3_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_b472j3_a0());
    editorCell.addEditorCell(createConstant_b472j3_b0());
    editorCell.addEditorCell(createCollection_b472j3_c0());
    editorCell.addEditorCell(createConstant_b472j3_d0());
    return editorCell;
  }
  private EditorCell createConstant_b472j3_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "diagram2");
    editorCell.setCellId("Constant_b472j3_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b472j3_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_b472j3_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_b472j3_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_b472j3_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_b472j3_a2a());
    editorCell.addEditorCell(createConstant_b472j3_b2a());
    editorCell.addEditorCell(createRefNodeList_b472j3_c2a());
    editorCell.addEditorCell(createConstant_b472j3_d2a());
    editorCell.addEditorCell(createConstant_b472j3_e2a());
    editorCell.addEditorCell(createConstant_b472j3_f2a());
    editorCell.addEditorCell(createRefNodeList_b472j3_g2a());
    return editorCell;
  }
  private EditorCell createConstant_b472j3_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "main nodes");
    editorCell.setCellId("Constant_b472j3_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b472j3_b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_b472j3_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_b472j3_c2a() {
    AbstractCellListHandler handler = new Diagram2_DiagramTestTextual_EditorBuilder_a.mainNodesListHandler_b472j3_c2a(myNode, "mainNodes", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_mainNodes");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class mainNodesListHandler_b472j3_c2a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public mainNodesListHandler_b472j3_c2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1de05L, "jetbrains.mps.lang.editor.diagram.testLanguage.structure.Node"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(mainNodesListHandler_b472j3_c2a.this.getNode(), MetaAdapterFactory.getContainmentLink(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1dce2L, 0x7a0afda102e20209L, "mainNodes")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1dce2L, 0x7a0afda102e20209L, "mainNodes"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_b472j3_d2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_b472j3_d2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b472j3_e2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "node connectors");
    editorCell.setCellId("Constant_b472j3_e2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_b472j3_f2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_b472j3_f2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_b472j3_g2a() {
    AbstractCellListHandler handler = new Diagram2_DiagramTestTextual_EditorBuilder_a.nodeConnectorsListHandler_b472j3_g2a(myNode, "nodeConnectors", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_nodeConnectors");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class nodeConnectorsListHandler_b472j3_g2a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public nodeConnectorsListHandler_b472j3_g2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x4ce40ecaf4106a9bL, "jetbrains.mps.lang.editor.diagram.testLanguage.structure.OutputToInputPortConnector"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(nodeConnectorsListHandler_b472j3_g2a.this.getNode(), MetaAdapterFactory.getContainmentLink(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1dce2L, 0x4ce40ecaf414670eL, "nodeConnectors")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, 0x7a0afda102e1dce2L, 0x4ce40ecaf414670eL, "nodeConnectors"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_b472j3_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_b472j3_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
