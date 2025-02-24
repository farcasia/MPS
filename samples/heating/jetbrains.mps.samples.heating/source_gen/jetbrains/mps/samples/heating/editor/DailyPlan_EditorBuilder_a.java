package jetbrains.mps.samples.heating.editor;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.CommentStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FieldStyleClass;
import jetbrains.mps.lang.editor.menus.transformation.NamedTransformationMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class DailyPlan_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public DailyPlan_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_dgzt1x_a();
  }

  private EditorCell createCollection_dgzt1x_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_dgzt1x_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_dgzt1x_a0());
    editorCell.addEditorCell(createRefNode_dgzt1x_b0());
    editorCell.addEditorCell(createCollection_dgzt1x_c0());
    editorCell.addEditorCell(createCollection_dgzt1x_d0());
    editorCell.addEditorCell(createConstant_dgzt1x_e0());
    return editorCell;
  }
  private EditorCell createConstant_dgzt1x_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Daily Plan applicable");
    editorCell.setCellId("Constant_dgzt1x_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_dgzt1x_b0() {
    SingleRoleCellProvider provider = new DailyPlan_EditorBuilder_a.applicabilitySingleRoleHandler_dgzt1x_b0(myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x40bcae6c0e686ffeL, "applicability"), getEditorContext());
    return provider.createCell();
  }
  private static class applicabilitySingleRoleHandler_dgzt1x_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public applicabilitySingleRoleHandler_dgzt1x_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x40bcae6c0e686ffeL, "applicability"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x40bcae6c0e686ffeL, "applicability"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x40bcae6c0e686ffeL, "applicability"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("applicability");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x40bcae6c0e686ffeL, "applicability")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_applicability");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no applicability>";
    }
  }
  private EditorCell createCollection_dgzt1x_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("customizingCollection");
    if (nodeCondition_dgzt1x_a0c0()) {
      editorCell.addEditorCell(createConstant_dgzt1x_a2a());
    }
    editorCell.addEditorCell(createRefNode_dgzt1x_b2a());
    if (nodeCondition_dgzt1x_a2c0()) {
      editorCell.addEditorCell(createConstant_dgzt1x_c2a());
    }
    if (nodeCondition_dgzt1x_a3c0()) {
      editorCell.addEditorCell(createConstant_dgzt1x_d2a());
    }
    return editorCell;
  }
  private boolean nodeCondition_dgzt1x_a0c0() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes")) != null);
  }
  private boolean nodeCondition_dgzt1x_a2c0() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes")) == null);
  }
  private boolean nodeCondition_dgzt1x_a3c0() {
    return (SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes")) != null);
  }
  private EditorCell createConstant_dgzt1x_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "customizing the");
    editorCell.setCellId("Constant_dgzt1x_a2a");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    DeleteCustomizes.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_dgzt1x_b2a() {
    SingleRoleCellProvider provider = new DailyPlan_EditorBuilder_a.customizesSingleRoleHandler_dgzt1x_b2a(myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes"), getEditorContext());
    return provider.createCell();
  }
  private static class customizesSingleRoleHandler_dgzt1x_b2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public customizesSingleRoleHandler_dgzt1x_b2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("customizes");
      }
      Style style = new StyleImpl();
      new FieldStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0xcfa085c9af881f8L, "customizes")));
      try {
        EditorCell editorCell = createCollection_dgzt1x_a1c0();
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    private EditorCell createCollection_dgzt1x_a1c0() {
      EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
      editorCell.setCellId("Collection_dgzt1x_a1c0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.SELECTABLE, false);
      editorCell.getStyle().putAll(style);
      return editorCell;
    }
  }
  private EditorCell createConstant_dgzt1x_c2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_dgzt1x_c2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    DeleteCustomizes.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setTransformationMenuLookup(new NamedTransformationMenuLookup(LanguageRegistry.getInstance(getEditorContext().getRepository()), MetaAdapterFactory.getConcept(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, "jetbrains.mps.samples.heating.structure.DailyPlan"), "jetbrains.mps.samples.heating.editor.DailyPlan_ApplySideTransforms"));
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell));
    return editorCell;
  }
  private EditorCell createConstant_dgzt1x_d2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "plan");
    editorCell.setCellId("Constant_dgzt1x_d2a");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    DeleteCustomizes.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_dgzt1x_d0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_dgzt1x_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createRefNodeList_dgzt1x_a3a());
    return editorCell;
  }
  private EditorCell createRefNodeList_dgzt1x_a3a() {
    AbstractCellListHandler handler = new DailyPlan_EditorBuilder_a.itemsListHandler_dgzt1x_a3a(myNode, "items", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_items");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class itemsListHandler_dgzt1x_a3a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public itemsListHandler_dgzt1x_a3a(SNode ownerNode, String childRole, EditorContext context) {
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
      SNode item = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4f786d85fe288176L, "jetbrains.mps.samples.heating.structure.Slot")), null);
      SPropertyOperations.set(item, MetaAdapterFactory.getProperty(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4f786d85fe288176L, 0x4f786d85fe28827cL, "start"), "" + (-1));
      SPropertyOperations.set(SLinkOperations.getTarget(item, MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4f786d85fe288176L, 0x4f786d85fe289dd1L, "event")), MetaAdapterFactory.getProperty(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec62L, 0x4644aa4ce08aec70L, "temperature"), "" + (20));
      return item;
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(itemsListHandler_dgzt1x_a3a.this.getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x4644aa4ce08aec57L, "items")));
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec4fL, 0x4644aa4ce08aec57L, "items"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_dgzt1x_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_dgzt1x_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
