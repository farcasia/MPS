package jetbrains.mps.samples.Expressions.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.samples.Expressions.editor.SimpleMath_StyleSheet.KeyWordStyleClass;

/*package*/ class LogicalSimpleMathExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public LogicalSimpleMathExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_hge5w8_a();
  }

  private EditorCell createCollection_hge5w8_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_hge5w8_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_hge5w8_a0());
    editorCell.addEditorCell(createComponent_hge5w8_b0());
    editorCell.addEditorCell(createRefNode_hge5w8_c0());
    return editorCell;
  }
  private EditorCell createRefNode_hge5w8_a0() {
    SingleRoleCellProvider provider = new LogicalSimpleMathExpression_EditorBuilder_a.leftSingleRoleHandler_hge5w8_a0(myNode, MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5476L, "left"), getEditorContext());
    return provider.createCell();
  }
  private static class leftSingleRoleHandler_hge5w8_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public leftSingleRoleHandler_hge5w8_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5476L, "left"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5476L, "left"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5476L, "left"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("left");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5476L, "left")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_left");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no left>";
    }
  }
  private EditorCell createComponent_hge5w8_b0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNode_hge5w8_c0() {
    SingleRoleCellProvider provider = new LogicalSimpleMathExpression_EditorBuilder_a.rightSingleRoleHandler_hge5w8_c0(myNode, MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5478L, "right"), getEditorContext());
    return provider.createCell();
  }
  private static class rightSingleRoleHandler_hge5w8_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public rightSingleRoleHandler_hge5w8_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5478L, "right"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5478L, "right"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5478L, "right"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("right");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b81c52ccL, 0x1cc69153b81d5478L, "right")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_right");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no right>";
    }
  }
}
