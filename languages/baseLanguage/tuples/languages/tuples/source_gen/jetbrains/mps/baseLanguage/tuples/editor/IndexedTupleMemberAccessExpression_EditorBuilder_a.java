package jetbrains.mps.baseLanguage.tuples.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenAfterNameStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightBracketStyleClass;

/*package*/ class IndexedTupleMemberAccessExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public IndexedTupleMemberAccessExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_pessfj_a();
  }

  private EditorCell createCollection_pessfj_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_pessfj_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_pessfj_a0());
    editorCell.addEditorCell(createConstant_pessfj_b0());
    editorCell.addEditorCell(createRefNode_pessfj_c0());
    editorCell.addEditorCell(createConstant_pessfj_d0());
    return editorCell;
  }
  private EditorCell createRefNode_pessfj_a0() {
    SingleRoleCellProvider provider = new IndexedTupleMemberAccessExpression_EditorBuilder_a.tupleSingleRoleHandler_pessfj_a0(myNode, MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ad5056L, "tuple"), getEditorContext());
    return provider.createCell();
  }
  private static class tupleSingleRoleHandler_pessfj_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public tupleSingleRoleHandler_pessfj_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ad5056L, "tuple"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ad5056L, "tuple"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ad5056L, "tuple"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("tuple");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ad5056L, "tuple")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_tuple");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no tuple>";
    }
  }
  private EditorCell createConstant_pessfj_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "[");
    editorCell.setCellId("Constant_pessfj_b0");
    Style style = new StyleImpl();
    new LeftParenAfterNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_pessfj_c0() {
    SingleRoleCellProvider provider = new IndexedTupleMemberAccessExpression_EditorBuilder_a.indexSingleRoleHandler_pessfj_c0(myNode, MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ae5facL, "index"), getEditorContext());
    return provider.createCell();
  }
  private static class indexSingleRoleHandler_pessfj_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public indexSingleRoleHandler_pessfj_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ae5facL, "index"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ae5facL, "index"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ae5facL, "index"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("index");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12071acfb50L, 0x12071ae5facL, "index")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_index");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no index>";
    }
  }
  private EditorCell createConstant_pessfj_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "]");
    editorCell.setCellId("Constant_pessfj_d0");
    Style style = new StyleImpl();
    new RightBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
