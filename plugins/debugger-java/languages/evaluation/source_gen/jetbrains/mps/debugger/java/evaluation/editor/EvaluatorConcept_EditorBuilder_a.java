package jetbrains.mps.debugger.java.evaluation.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.debugger.java.evaluation.editor.EvaluationStyles_StyleSheet.HeaderStyleClass;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.debugger.java.evaluation.editor.EvaluationStyles_StyleSheet.ContextKeywordStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
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
import jetbrains.mps.editor.runtime.style.FocusPolicy;

/*package*/ class EvaluatorConcept_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public EvaluatorConcept_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_6rl195_a();
  }

  private EditorCell createCollection_6rl195_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_6rl195_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    if (nodeCondition_6rl195_a0a()) {
      editorCell.addEditorCell(createCollection_6rl195_a0());
    }
    editorCell.addEditorCell(createConstant_6rl195_b0());
    editorCell.addEditorCell(createRefNode_6rl195_c0());
    return editorCell;
  }
  private boolean nodeCondition_6rl195_a0a() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x53c5060c6b19c79bL, "isShowContext"));
  }
  private EditorCell createCollection_6rl195_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_6rl195_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_6rl195_a0a());
    editorCell.addEditorCell(createCollection_6rl195_b0a());
    editorCell.addEditorCell(createConstant_6rl195_c0a());
    return editorCell;
  }
  private EditorCell createConstant_6rl195_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "context");
    editorCell.setCellId("Constant_6rl195_a0a");
    Style style = new StyleImpl();
    new HeaderStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_6rl195_b0a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_6rl195_b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(createCollection_6rl195_a1a0());
    editorCell.addEditorCell(createCollection_6rl195_b1a0());
    editorCell.addEditorCell(createCollection_6rl195_c1a0());
    return editorCell;
  }
  private EditorCell createCollection_6rl195_a1a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_6rl195_a1a0");
    editorCell.addEditorCell(createIndentCell_6rl195_a0b0a());
    editorCell.addEditorCell(createConstant_6rl195_b0b0a());
    editorCell.addEditorCell(createRefNode_6rl195_c0b0a());
    return editorCell;
  }
  private EditorCell createIndentCell_6rl195_a0b0a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createConstant_6rl195_b0b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "static context type");
    editorCell.setCellId("Constant_6rl195_b0b0a");
    Style style = new StyleImpl();
    new ContextKeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_6rl195_c0b0a() {
    SingleRoleCellProvider provider = new EvaluatorConcept_EditorBuilder_a.contextNodeSingleRoleHandler_6rl195_c0b0a(myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23615L, "contextNode"), getEditorContext());
    return provider.createCell();
  }
  private static class contextNodeSingleRoleHandler_6rl195_c0b0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public contextNodeSingleRoleHandler_6rl195_c0b0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23615L, "contextNode"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23615L, "contextNode"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23615L, "contextNode"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("contextNode");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23615L, "contextNode")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_contextNode");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no contextNode>";
    }
  }
  private EditorCell createCollection_6rl195_b1a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_6rl195_b1a0");
    editorCell.addEditorCell(createIndentCell_6rl195_a1b0a());
    editorCell.addEditorCell(createConstant_6rl195_b1b0a());
    editorCell.addEditorCell(createRefNode_6rl195_c1b0a());
    return editorCell;
  }
  private EditorCell createIndentCell_6rl195_a1b0a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createConstant_6rl195_b1b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "this type");
    editorCell.setCellId("Constant_6rl195_b1b0a");
    Style style = new StyleImpl();
    new ContextKeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_6rl195_c1b0a() {
    SingleRoleCellProvider provider = new EvaluatorConcept_EditorBuilder_a.thisNodeSingleRoleHandler_6rl195_c1b0a(myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23613L, "thisNode"), getEditorContext());
    return provider.createCell();
  }
  private static class thisNodeSingleRoleHandler_6rl195_c1b0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public thisNodeSingleRoleHandler_6rl195_c1b0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23613L, "thisNode"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23613L, "thisNode"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23613L, "thisNode"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("thisNode");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x3f11b1341fa23613L, "thisNode")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_thisNode");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no thisNode>";
    }
  }
  private EditorCell createCollection_6rl195_c1a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_6rl195_c1a0");
    editorCell.addEditorCell(createIndentCell_6rl195_a2b0a());
    editorCell.addEditorCell(createConstant_6rl195_b2b0a());
    editorCell.addEditorCell(createCollection_6rl195_c2b0a());
    return editorCell;
  }
  private EditorCell createIndentCell_6rl195_a2b0a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createConstant_6rl195_b2b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "visible variables");
    editorCell.setCellId("Constant_6rl195_b2b0a");
    Style style = new StyleImpl();
    new ContextKeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_6rl195_c2b0a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_6rl195_c2b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createRefNodeList_6rl195_a2c1a0());
    return editorCell;
  }
  private EditorCell createRefNodeList_6rl195_a2c1a0() {
    AbstractCellListHandler handler = new EvaluatorConcept_EditorBuilder_a.variablesListHandler_6rl195_a2c1a0(myNode, "variables", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_variables");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class variablesListHandler_6rl195_a2c1a0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public variablesListHandler_6rl195_a2c1a0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d926L, "jetbrains.mps.debugger.java.evaluation.structure.LowLevelVariable"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(variablesListHandler_6rl195_a2c1a0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x53c5060c6b19c797L, "variables")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x53c5060c6b19c797L, "variables"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_6rl195_c0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_6rl195_c0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_6rl195_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "statements to evaluate");
    editorCell.setCellId("Constant_6rl195_b0");
    Style style = new StyleImpl();
    new HeaderStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_6rl195_c0() {
    SingleRoleCellProvider provider = new EvaluatorConcept_EditorBuilder_a.evaluatedStatementsSingleRoleHandler_6rl195_c0(myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x10093bb8b0669700L, "evaluatedStatements"), getEditorContext());
    return provider.createCell();
  }
  private static class evaluatedStatementsSingleRoleHandler_6rl195_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public evaluatedStatementsSingleRoleHandler_6rl195_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x10093bb8b0669700L, "evaluatedStatements"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x10093bb8b0669700L, "evaluatedStatements"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x10093bb8b0669700L, "evaluatedStatements"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("evaluatedStatements");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      editorCell.getStyle().putAll(style);
      if (true) {
        editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.FIRST_EDITABLE_CELL);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L, 0x10093bb8b0669700L, "evaluatedStatements")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_evaluatedStatements");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no evaluatedStatements>";
    }
  }
}
