package jetbrains.mps.lang.quotation.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class NodeBuilderExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public NodeBuilderExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_nw41a5_a();
  }

  private EditorCell createCollection_nw41a5_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_nw41a5_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_nw41a5_a0());
    editorCell.addEditorCell(createRefNode_nw41a5_b0());
    return editorCell;
  }
  private EditorCell createConstant_nw41a5_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "#");
    editorCell.setCellId("Constant_nw41a5_a0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_nw41a5_b0() {
    SingleRoleCellProvider provider = new NodeBuilderExpression_EditorBuilder_a.expressionSingleRoleHandler_nw41a5_b0(myNode, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x718e3f4cb7a3132eL, 0x718e3f4cb7a31330L, "expression"), getEditorContext());
    return provider.createCell();
  }
  private static class expressionSingleRoleHandler_nw41a5_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public expressionSingleRoleHandler_nw41a5_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x718e3f4cb7a3132eL, 0x718e3f4cb7a31330L, "expression"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x718e3f4cb7a3132eL, 0x718e3f4cb7a31330L, "expression"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x718e3f4cb7a3132eL, 0x718e3f4cb7a31330L, "expression"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("expression");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x718e3f4cb7a3132eL, 0x718e3f4cb7a31330L, "expression")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_expression");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no expression>";
    }
  }
}
