package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;

/*package*/ class SubconceptCase_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SubconceptCase_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ikghsa_a();
  }

  private EditorCell createCollection_ikghsa_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ikghsa_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_ikghsa_a0());
    editorCell.addEditorCell(createRefNode_ikghsa_b0());
    editorCell.addEditorCell(createConstant_ikghsa_c0());
    editorCell.addEditorCell(createRefNode_ikghsa_d0());
    return editorCell;
  }
  private EditorCell createConstant_ikghsa_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "subconcept of");
    editorCell.setCellId("Constant_ikghsa_a0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ikghsa_b0() {
    SingleRoleCellProvider provider = new SubconceptCase_EditorBuilder_a.conceptSingleRoleHandler_ikghsa_b0(myNode, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d67cfL, "concept"), getEditorContext());
    return provider.createCell();
  }
  private static class conceptSingleRoleHandler_ikghsa_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public conceptSingleRoleHandler_ikghsa_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d67cfL, "concept"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d67cfL, "concept"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d67cfL, "concept"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("concept");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d67cfL, "concept")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_concept");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no concept>";
    }
  }
  private EditorCell createConstant_ikghsa_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_ikghsa_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ikghsa_d0() {
    SingleRoleCellProvider provider = new SubconceptCase_EditorBuilder_a.bodySingleRoleHandler_ikghsa_d0(myNode, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d8048L, "body"), getEditorContext());
    return provider.createCell();
  }
  private static class bodySingleRoleHandler_ikghsa_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public bodySingleRoleHandler_ikghsa_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d8048L, "body"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d8048L, "body"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d8048L, "body"), child));
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
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f432L, 0x10ef02d8048L, "body")));
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
}
