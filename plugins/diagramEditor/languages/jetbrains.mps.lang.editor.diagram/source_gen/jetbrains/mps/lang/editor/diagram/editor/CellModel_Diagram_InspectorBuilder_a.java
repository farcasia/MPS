package jetbrains.mps.lang.editor.diagram.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;

/*package*/ class CellModel_Diagram_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CellModel_Diagram_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_7br2q0_a_0();
  }

  private EditorCell createCollection_7br2q0_a_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_7br2q0_a_0");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createComponent_7br2q0_a0_0());
    editorCell.addEditorCell(createConstant_7br2q0_b0_0());
    editorCell.addEditorCell(createConstant_7br2q0_c0_0());
    editorCell.addEditorCell(createRefNodeList_7br2q0_d0());
    editorCell.addEditorCell(createConstant_7br2q0_e0());
    editorCell.addEditorCell(createRefNodeList_7br2q0_f0());
    return editorCell;
  }
  private EditorCell createComponent_7br2q0_a0_0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor._CellModel_Common");
    return editorCell;
  }
  private EditorCell createConstant_7br2q0_b0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_7br2q0_b0_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_7br2q0_c0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "elements creation:");
    editorCell.setCellId("Constant_7br2q0_c0_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_7br2q0_d0() {
    AbstractCellListHandler handler = new CellModel_Diagram_InspectorBuilder_a.elementsCreationListHandler_7br2q0_d0(myNode, "elementsCreation", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_elementsCreation");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class elementsCreationListHandler_7br2q0_d0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public elementsCreationListHandler_7br2q0_d0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, "jetbrains.mps.lang.editor.diagram.structure.DiagramElementsCreation"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(elementsCreationListHandler_7br2q0_d0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x57869048dc89fbf7L, 0x76f1cb20ba7a1c35L, "elementsCreation")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x57869048dc89fbf7L, 0x76f1cb20ba7a1c35L, "elementsCreation"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_7br2q0_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "connector creation:");
    editorCell.setCellId("Constant_7br2q0_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_7br2q0_f0() {
    AbstractCellListHandler handler = new CellModel_Diagram_InspectorBuilder_a.connectorCreationListHandler_7br2q0_f0(myNode, "connectorCreation", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_connectorCreation");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class connectorCreationListHandler_7br2q0_f0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public connectorCreationListHandler_7br2q0_f0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xd0b2f9de3710044L, "jetbrains.mps.lang.editor.diagram.structure.DiagramConnectorCreation"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(connectorCreationListHandler_7br2q0_f0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x57869048dc89fbf7L, 0xd0b2f9de3717551L, "connectorCreation")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x57869048dc89fbf7L, 0xd0b2f9de3717551L, "connectorCreation"), elementNode));
        }
      }
    }
  }
}
