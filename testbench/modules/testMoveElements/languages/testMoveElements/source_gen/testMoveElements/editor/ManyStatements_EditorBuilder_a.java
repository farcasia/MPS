package testMoveElements.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class ManyStatements_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ManyStatements_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_mtcnr8_a();
  }

  private EditorCell createCollection_mtcnr8_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_mtcnr8_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_mtcnr8_a0());
    editorCell.addEditorCell(createConstant_mtcnr8_b0());
    editorCell.addEditorCell(createCollection_mtcnr8_c0());
    editorCell.addEditorCell(createConstant_mtcnr8_d0());
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "many statements");
    editorCell.setCellId("Constant_mtcnr8_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_mtcnr8_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_mtcnr8_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_mtcnr8_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_mtcnr8_a2a());
    editorCell.addEditorCell(createConstant_mtcnr8_b2a());
    editorCell.addEditorCell(createRefNode_mtcnr8_c2a());
    editorCell.addEditorCell(createConstant_mtcnr8_d2a());
    editorCell.addEditorCell(createCollection_mtcnr8_e2a());
    editorCell.addEditorCell(createConstant_mtcnr8_f2a());
    editorCell.addEditorCell(createConstant_mtcnr8_g2a());
    editorCell.addEditorCell(createRefNode_mtcnr8_h2a());
    editorCell.addEditorCell(createConstant_mtcnr8_i2a());
    editorCell.addEditorCell(createConstant_mtcnr8_j2a());
    editorCell.addEditorCell(createConstant_mtcnr8_k2a());
    editorCell.addEditorCell(createRefNode_mtcnr8_l2a());
    editorCell.addEditorCell(createConstant_mtcnr8_m2a());
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "list");
    editorCell.setCellId("Constant_mtcnr8_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_mtcnr8_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_mtcnr8_c2a() {
    SingleRoleCellProvider provider = new ManyStatements_EditorBuilder_a.listSingleRoleHandler_mtcnr8_c2a(myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x62f47dac992b7389L, "list"), getEditorContext());
    return provider.createCell();
  }
  private static class listSingleRoleHandler_mtcnr8_c2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public listSingleRoleHandler_mtcnr8_c2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x62f47dac992b7389L, "list"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x62f47dac992b7389L, "list"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x62f47dac992b7389L, "list"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("list");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x62f47dac992b7389L, "list")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_list");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no list>";
    }
  }
  private EditorCell createConstant_mtcnr8_d2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_mtcnr8_d2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_mtcnr8_e2a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_mtcnr8_e2a");
    editorCell.addEditorCell(createConstant_mtcnr8_a4c0());
    editorCell.addEditorCell(createConstant_mtcnr8_b4c0());
    editorCell.addEditorCell(createRefNodeList_mtcnr8_c4c0());
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_a4c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "statement");
    editorCell.setCellId("Constant_mtcnr8_a4c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_b4c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_mtcnr8_b4c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_mtcnr8_c4c0() {
    AbstractCellListHandler handler = new ManyStatements_EditorBuilder_a.statementListHandler_mtcnr8_c4c0(myNode, "statement", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_statement");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class statementListHandler_mtcnr8_c4c0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public statementListHandler_mtcnr8_c4c0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(statementListHandler_mtcnr8_c4c0.this.getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784eL, "statement")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784eL, "statement"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_mtcnr8_f2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "list1");
    editorCell.setCellId("Constant_mtcnr8_f2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_g2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_mtcnr8_g2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_mtcnr8_h2a() {
    SingleRoleCellProvider provider = new ManyStatements_EditorBuilder_a.list1SingleRoleHandler_mtcnr8_h2a(myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd97849L, "list1"), getEditorContext());
    return provider.createCell();
  }
  private static class list1SingleRoleHandler_mtcnr8_h2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public list1SingleRoleHandler_mtcnr8_h2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd97849L, "list1"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd97849L, "list1"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd97849L, "list1"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("list1");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd97849L, "list1")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_list1");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no list1>";
    }
  }
  private EditorCell createConstant_mtcnr8_i2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_mtcnr8_i2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_j2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "list2");
    editorCell.setCellId("Constant_mtcnr8_j2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_k2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_mtcnr8_k2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_mtcnr8_l2a() {
    SingleRoleCellProvider provider = new ManyStatements_EditorBuilder_a.list2SingleRoleHandler_mtcnr8_l2a(myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784bL, "list2"), getEditorContext());
    return provider.createCell();
  }
  private static class list2SingleRoleHandler_mtcnr8_l2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public list2SingleRoleHandler_mtcnr8_l2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784bL, "list2"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784bL, "list2"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784bL, "list2"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("list2");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xe228eea107ef499cL, 0x88269c47a7e369dbL, 0x4cb3e593ffd97846L, 0x4cb3e593ffd9784bL, "list2")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_list2");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no list2>";
    }
  }
  private EditorCell createConstant_mtcnr8_m2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_mtcnr8_m2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_mtcnr8_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_mtcnr8_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
