package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftAngleBracketStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightAngleBracketStyleClass;

/*package*/ class ButtonCreator_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ButtonCreator_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_v9w7sp_a();
  }

  private EditorCell createCollection_v9w7sp_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_v9w7sp_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_v9w7sp_a0());
    editorCell.addEditorCell(createConstant_v9w7sp_b0());
    editorCell.addEditorCell(createRefNode_v9w7sp_c0());
    editorCell.addEditorCell(createConstant_v9w7sp_d0());
    return editorCell;
  }
  private EditorCell createConstant_v9w7sp_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "button");
    editorCell.setCellId("Constant_v9w7sp_a0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_v9w7sp_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<");
    editorCell.setCellId("Constant_v9w7sp_b0");
    Style style = new StyleImpl();
    new LeftAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_v9w7sp_c0() {
    SingleRoleCellProvider provider = new ButtonCreator_EditorBuilder_a.actionSingleRoleHandler_v9w7sp_c0(myNode, MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL, 0x1b97d211bb020854L, "action"), getEditorContext());
    return provider.createCell();
  }
  private static class actionSingleRoleHandler_v9w7sp_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public actionSingleRoleHandler_v9w7sp_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL, 0x1b97d211bb020854L, "action"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL, 0x1b97d211bb020854L, "action"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL, 0x1b97d211bb020854L, "action"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("action");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL, 0x1b97d211bb020854L, "action")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_action");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no action>";
    }
  }
  private EditorCell createConstant_v9w7sp_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ">");
    editorCell.setCellId("Constant_v9w7sp_d0");
    Style style = new StyleImpl();
    new RightAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
