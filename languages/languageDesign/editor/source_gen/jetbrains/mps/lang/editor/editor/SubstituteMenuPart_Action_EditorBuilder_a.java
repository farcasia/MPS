package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.ShowBoundariesArea;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.EditorKeyWordStyleClass;
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
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FoldedCellStyleClass;

/*package*/ class SubstituteMenuPart_Action_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SubstituteMenuPart_Action_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_1b7dtd_a();
  }

  private EditorCell createCollection_1b7dtd_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_1b7dtd_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
    editorCell.getStyle().putAll(style);
    editorCell.setFoldable(true);
    editorCell.setFoldedCell(createCollection_1b7dtd_a0());
    editorCell.addEditorCell(createComponent_1b7dtd_a0());
    editorCell.addEditorCell(createComponent_1b7dtd_b0());
    editorCell.addEditorCell(createCollection_1b7dtd_c0());
    return editorCell;
  }
  private EditorCell createComponent_1b7dtd_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.SubstituteMenuPartAlias");
    return editorCell;
  }
  private EditorCell createComponent_1b7dtd_b0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.IOutputConcept_Component");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createCollection_1b7dtd_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_1b7dtd_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_1b7dtd_a2a());
    editorCell.addEditorCell(createRefNode_1b7dtd_b2a());
    editorCell.addEditorCell(createRefNodeList_1b7dtd_c2a());
    return editorCell;
  }
  private EditorCell createConstant_1b7dtd_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "create node");
    editorCell.setCellId("Constant_1b7dtd_a2a");
    Style style = new StyleImpl();
    new EditorKeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1b7dtd_b2a() {
    SingleRoleCellProvider provider = new SubstituteMenuPart_Action_EditorBuilder_a.substituteHandlerSingleRoleHandler_1b7dtd_b2a(myNode, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x65e54712ab56010bL, 0x77859491bd47a692L, "substituteHandler"), getEditorContext());
    return provider.createCell();
  }
  private static class substituteHandlerSingleRoleHandler_1b7dtd_b2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public substituteHandlerSingleRoleHandler_1b7dtd_b2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x65e54712ab56010bL, 0x77859491bd47a692L, "substituteHandler"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x65e54712ab56010bL, 0x77859491bd47a692L, "substituteHandler"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x65e54712ab56010bL, 0x77859491bd47a692L, "substituteHandler"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("substituteHandler");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x65e54712ab56010bL, 0x77859491bd47a692L, "substituteHandler")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_substituteHandler");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no substituteHandler>";
    }
  }
  private EditorCell createRefNodeList_1b7dtd_c2a() {
    AbstractCellListHandler handler = new SubstituteMenuPart_Action_EditorBuilder_a.featuresListHandler_1b7dtd_c2a(myNode, "features", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_features");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class featuresListHandler_1b7dtd_c2a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public featuresListHandler_1b7dtd_c2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x75a895eb6bcee969L, "jetbrains.mps.lang.editor.structure.SubstituteFeature"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(featuresListHandler_1b7dtd_c2a.this.getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x75a895eb6bcee99dL, 0x75a895eb6bcee99eL, "features")));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_1b7dtd_a2c0();
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
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x75a895eb6bcee99dL, 0x75a895eb6bcee99eL, "features"), elementNode));
        }
      }
    }
    private EditorCell createConstant_1b7dtd_a2c0() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
      editorCell.setCellId("Constant_1b7dtd_a2c0");
      Style style = new StyleImpl();
      style.set(StyleAttributes.EDITABLE, true);
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("<no additional features>");
      return editorCell;
    }
  }
  private EditorCell createCollection_1b7dtd_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_1b7dtd_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createComponent_1b7dtd_a0a());
    editorCell.addEditorCell(createReadOnlyModelAccessor_1b7dtd_b0a());
    return editorCell;
  }
  private EditorCell createComponent_1b7dtd_a0a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.editor.editor.SubstituteMenuPartAlias");
    return editorCell;
  }
  private EditorCell createReadOnlyModelAccessor_1b7dtd_b0a() {
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new ModelAccessor() {
      public String getText() {
        SNode matchingTextQuery = SLinkOperations.getTarget(Sequence.fromIterable(SNodeOperations.ofConcept(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x75a895eb6bcee99dL, 0x75a895eb6bcee99eL, "features")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce1116e3a2dee5aL, "jetbrains.mps.lang.editor.structure.SubstituteFeature_MatchingText"))).first(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce1116e3a2dee5aL, 0x7ce1116e3a2dfe9cL, "query"));
        String text = null;
        if (matchingTextQuery != null) {
          SAbstractConcept cncpt_a0c0a0a1a0a0t = SNodeOperations.getConcept(matchingTextQuery);
          boolean noneMatched_a0c0a0a1a0a0t = true;
          if (noneMatched_a0c0a0a1a0a0t && SConceptOperations.isSubConceptOf(cncpt_a0c0a0a1a0a0t, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1121eb0d54dL, "jetbrains.mps.lang.editor.structure.QueryFunction_SubstituteMenu_SubstituteString"))) {
            noneMatched_a0c0a0a1a0a0t = false;
            text = ConceptFunctionFoldingUtil.getSimpleString(SNodeOperations.cast(matchingTextQuery, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1121eb0d54dL, "jetbrains.mps.lang.editor.structure.QueryFunction_SubstituteMenu_SubstituteString")));
          }
          if (noneMatched_a0c0a0a1a0a0t && SConceptOperations.isSubConceptOf(cncpt_a0c0a0a1a0a0t, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x116910ff20bL, "jetbrains.mps.lang.editor.structure.SubstituteMenu_SimpleString"))) {
            noneMatched_a0c0a0a1a0a0t = false;
            text = SPropertyOperations.getString(SNodeOperations.cast(matchingTextQuery, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x116910ff20bL, "jetbrains.mps.lang.editor.structure.SubstituteMenu_SimpleString")), MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x116910ff20bL, 0x11691130517L, "text"));
          }
        }
        return (text == null ? "..." : text);
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_1b7dtd_b0a");
    Style style = new StyleImpl();
    new FoldedCellStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
