package jetbrains.mps.baseLanguage.builders.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.baseLanguage.builders.behavior.Builder__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.SemicolonStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightParenStyleClass;

/*package*/ class BuilderStatement_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BuilderStatement_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_idzzzw_a();
  }

  private EditorCell createCollection_idzzzw_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_idzzzw_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_idzzzw_a0());
    if (nodeCondition_idzzzw_a1a()) {
      editorCell.addEditorCell(createConstant_idzzzw_b0());
    }
    if (nodeCondition_idzzzw_a2a()) {
      editorCell.addEditorCell(createCollection_idzzzw_c0());
    }
    return editorCell;
  }
  private boolean nodeCondition_idzzzw_a1a() {
    return (boolean) Builder__BehaviorDescriptor.isLeaf_id67LR$5LQnln.invoke(SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder")));
  }
  private boolean nodeCondition_idzzzw_a2a() {
    return !((boolean) Builder__BehaviorDescriptor.isLeaf_id67LR$5LQnln.invoke(SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder"))));
  }
  private EditorCell createRefNode_idzzzw_a0() {
    SingleRoleCellProvider provider = new BuilderStatement_EditorBuilder_a.builderSingleRoleHandler_idzzzw_a0(myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder"), getEditorContext());
    return provider.createCell();
  }
  private static class builderSingleRoleHandler_idzzzw_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public builderSingleRoleHandler_idzzzw_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("builder");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e2ee2f8L, "builder")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_builder");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no builder>";
    }
  }
  private EditorCell createConstant_idzzzw_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ";");
    editorCell.setCellId("Constant_idzzzw_b0");
    Style style = new StyleImpl();
    new SemicolonStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_idzzzw_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_idzzzw_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_idzzzw_a2a());
    editorCell.addEditorCell(createRefNode_idzzzw_b2a());
    editorCell.addEditorCell(createConstant_idzzzw_c2a());
    return editorCell;
  }
  private EditorCell createConstant_idzzzw_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_idzzzw_a2a");
    Style style = new StyleImpl();
    new LeftParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_idzzzw_b2a() {
    SingleRoleCellProvider provider = new BuilderStatement_EditorBuilder_a.bodySingleRoleHandler_idzzzw_b2a(myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e25129cL, "body"), getEditorContext());
    return provider.createCell();
  }
  private static class bodySingleRoleHandler_idzzzw_b2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public bodySingleRoleHandler_idzzzw_b2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e25129cL, "body"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e25129cL, "body"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e25129cL, "body"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("body");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a081aa9e4L, 0x429426276e25129cL, "body")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_body");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no body>";
    }
  }
  private EditorCell createConstant_idzzzw_c2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_idzzzw_c2a");
    Style style = new StyleImpl();
    new RightParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
