package jetbrains.mps.baseLanguage.closures.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.SemicolonStyleClass;

/*package*/ class YieldStatement_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public YieldStatement_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_66ieid_a();
  }

  private EditorCell createCollection_66ieid_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_66ieid_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_66ieid_a0());
    editorCell.addEditorCell(createRefNode_66ieid_b0());
    editorCell.addEditorCell(createConstant_66ieid_c0());
    return editorCell;
  }
  private EditorCell createComponent_66ieid_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNode_66ieid_b0() {
    SingleRoleCellProvider provider = new YieldStatement_EditorBuilder_a.expressionSingleRoleHandler_66ieid_b0(myNode, MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x11797183e82L, 0x1179719d515L, "expression"), getEditorContext());
    return provider.createCell();
  }
  private static class expressionSingleRoleHandler_66ieid_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public expressionSingleRoleHandler_66ieid_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x11797183e82L, 0x1179719d515L, "expression"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x11797183e82L, 0x1179719d515L, "expression"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x11797183e82L, 0x1179719d515L, "expression"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("expression");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x11797183e82L, 0x1179719d515L, "expression")));
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
  private EditorCell createConstant_66ieid_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ";");
    editorCell.setCellId("Constant_66ieid_c0");
    Style style = new StyleImpl();
    new SemicolonStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
