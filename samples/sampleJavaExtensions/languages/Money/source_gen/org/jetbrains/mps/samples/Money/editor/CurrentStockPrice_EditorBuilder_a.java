package org.jetbrains.mps.samples.Money.editor;

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
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.CommentStyleClass;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import org.jetbrains.mps.samples.Money.behavior.CurrentStockPrice__BehaviorDescriptor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

/*package*/ class CurrentStockPrice_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CurrentStockPrice_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_w8qb9s_a();
  }

  private EditorCell createCollection_w8qb9s_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_w8qb9s_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_w8qb9s_a0());
    editorCell.addEditorCell(createConstant_w8qb9s_b0());
    editorCell.addEditorCell(createRefNode_w8qb9s_c0());
    editorCell.addEditorCell(createConstant_w8qb9s_d0());
    editorCell.addEditorCell(createReadOnlyModelAccessor_w8qb9s_e0());
    editorCell.addEditorCell(createConstant_w8qb9s_f0());
    return editorCell;
  }
  private EditorCell createComponent_w8qb9s_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    return editorCell;
  }
  private EditorCell createConstant_w8qb9s_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "for");
    editorCell.setCellId("Constant_w8qb9s_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_w8qb9s_c0() {
    SingleRoleCellProvider provider = new CurrentStockPrice_EditorBuilder_a.symbolSingleRoleHandler_w8qb9s_c0(myNode, MetaAdapterFactory.getContainmentLink(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L, 0x3786e3f480b0926aL, "symbol"), getEditorContext());
    return provider.createCell();
  }
  private static class symbolSingleRoleHandler_w8qb9s_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public symbolSingleRoleHandler_w8qb9s_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L, 0x3786e3f480b0926aL, "symbol"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L, 0x3786e3f480b0926aL, "symbol"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L, 0x3786e3f480b0926aL, "symbol"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("symbol");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L, 0x3786e3f480b0926aL, "symbol")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_symbol");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no symbol>";
    }
  }
  private EditorCell createConstant_w8qb9s_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(Current price:");
    editorCell.setCellId("Constant_w8qb9s_d0");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createReadOnlyModelAccessor_w8qb9s_e0() {
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new ModelAccessor() {
      public String getText() {
        return CurrentStockPrice__BehaviorDescriptor.getCurrentPrice_id3u6SZi0yq4L.invoke(myNode).toString();
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_w8qb9s_e0");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createConstant_w8qb9s_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ")");
    editorCell.setCellId("Constant_w8qb9s_f0");
    Style style = new StyleImpl();
    new CommentStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
