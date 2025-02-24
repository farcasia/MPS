package jetbrains.mps.samples.SwingBuilder.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class Frame_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Frame_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_6y7w4f_a();
  }

  private EditorCell createCollection_6y7w4f_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_6y7w4f_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_6y7w4f_a0());
    editorCell.addEditorCell(createRefNode_6y7w4f_b0());
    editorCell.addEditorCell(createRefNodeList_6y7w4f_c0());
    return editorCell;
  }
  private EditorCell createConstant_6y7w4f_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "frame");
    editorCell.setCellId("Constant_6y7w4f_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_6y7w4f_b0() {
    SingleRoleCellProvider provider = new Frame_EditorBuilder_a.titleSingleRoleHandler_6y7w4f_b0(myNode, MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa547a6fL, "title"), getEditorContext());
    return provider.createCell();
  }
  private static class titleSingleRoleHandler_6y7w4f_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public titleSingleRoleHandler_6y7w4f_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa547a6fL, "title"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa547a6fL, "title"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa547a6fL, "title"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("title");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa547a6fL, "title")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_title");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no title>";
    }
  }
  private EditorCell createRefNodeList_6y7w4f_c0() {
    AbstractCellListHandler handler = new Frame_EditorBuilder_a.componentsListHandler_6y7w4f_c0(myNode, "components", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_components");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class componentsListHandler_6y7w4f_c0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public componentsListHandler_6y7w4f_c0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return nodeFactory();
    }
    public SNode nodeFactory() {
      return SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa545621L, "jetbrains.mps.samples.SwingBuilder.structure.EmptyComponent")), null);
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(componentsListHandler_6y7w4f_c0.this.getNode(), MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa543113L, "components")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L, 0x4a1cc65caa543113L, "components"), elementNode));
        }
      }
    }
  }
}
