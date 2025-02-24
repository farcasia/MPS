package jetbrains.mps.lang.editor.editorTest.editor;

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
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class DeleteLineTestChildWithNested_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public DeleteLineTestChildWithNested_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_f5h5o2_a();
  }

  private EditorCell createCollection_f5h5o2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_f5h5o2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_f5h5o2_a0());
    editorCell.addEditorCell(createConstant_f5h5o2_b0());
    editorCell.addEditorCell(createCollection_f5h5o2_c0());
    editorCell.addEditorCell(createConstant_f5h5o2_d0());
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "delete line test child with nested");
    editorCell.setCellId("Constant_f5h5o2_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_f5h5o2_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_f5h5o2_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_f5h5o2_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_f5h5o2_a2a());
    editorCell.addEditorCell(createConstant_f5h5o2_b2a());
    editorCell.addEditorCell(createRefNode_f5h5o2_c2a());
    editorCell.addEditorCell(createConstant_f5h5o2_d2a());
    editorCell.addEditorCell(createConstant_f5h5o2_e2a());
    editorCell.addEditorCell(createConstant_f5h5o2_f2a());
    editorCell.addEditorCell(createRefNodeList_f5h5o2_g2a());
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "single child");
    editorCell.setCellId("Constant_f5h5o2_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_f5h5o2_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_f5h5o2_c2a() {
    SingleRoleCellProvider provider = new DeleteLineTestChildWithNested_EditorBuilder_a.singleChildSingleRoleHandler_f5h5o2_c2a(myNode, MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8aL, "singleChild"), getEditorContext());
    return provider.createCell();
  }
  private static class singleChildSingleRoleHandler_f5h5o2_c2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public singleChildSingleRoleHandler_f5h5o2_c2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8aL, "singleChild"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8aL, "singleChild"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8aL, "singleChild"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("singleChild");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8aL, "singleChild")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_singleChild");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no singleChild>";
    }
  }
  private EditorCell createConstant_f5h5o2_d2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_f5h5o2_d2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_e2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "horizontal child");
    editorCell.setCellId("Constant_f5h5o2_e2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_f5h5o2_f2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_f5h5o2_f2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_f5h5o2_g2a() {
    AbstractCellListHandler handler = new DeleteLineTestChildWithNested_EditorBuilder_a.horizontalChildListHandler_f5h5o2_g2a(myNode, "horizontalChild", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Horizontal(), false);
    editorCell.setCellId("refNodeList_horizontalChild");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class horizontalChildListHandler_f5h5o2_g2a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public horizontalChildListHandler_f5h5o2_g2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x5d883c30af22ebf7L, "jetbrains.mps.lang.editor.editorTest.structure.DeleteLineTestChild"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(horizontalChildListHandler_f5h5o2_g2a.this.getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8cL, "horizontalChild")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x6c7380c23c9a0f89L, 0x6c7380c23c9a0f8cL, "horizontalChild"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_f5h5o2_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_f5h5o2_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
