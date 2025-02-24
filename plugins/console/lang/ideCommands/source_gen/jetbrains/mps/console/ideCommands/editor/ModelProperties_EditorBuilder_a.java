package jetbrains.mps.console.ideCommands.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenAfterNameStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightParenStyleClass;

/*package*/ class ModelProperties_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ModelProperties_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_d82jgo_a();
  }

  private EditorCell createCollection_d82jgo_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_d82jgo_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_d82jgo_a0());
    editorCell.addEditorCell(createConstant_d82jgo_b0());
    editorCell.addEditorCell(createRefNode_d82jgo_c0());
    editorCell.addEditorCell(createConstant_d82jgo_d0());
    return editorCell;
  }
  private EditorCell createComponent_d82jgo_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    return editorCell;
  }
  private EditorCell createConstant_d82jgo_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(");
    editorCell.setCellId("Constant_d82jgo_b0");
    Style style = new StyleImpl();
    new LeftParenAfterNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_d82jgo_c0() {
    SingleRoleCellProvider provider = new ModelProperties_EditorBuilder_a.targetModelSingleRoleHandler_d82jgo_c0(myNode, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587b0L, 0x4d7759afce9587b1L, "targetModel"), getEditorContext());
    return provider.createCell();
  }
  private static class targetModelSingleRoleHandler_d82jgo_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public targetModelSingleRoleHandler_d82jgo_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587b0L, 0x4d7759afce9587b1L, "targetModel"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587b0L, 0x4d7759afce9587b1L, "targetModel"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587b0L, 0x4d7759afce9587b1L, "targetModel"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("targetModel");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587b0L, 0x4d7759afce9587b1L, "targetModel")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_targetModel");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no targetModel>";
    }
  }
  private EditorCell createConstant_d82jgo_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ")");
    editorCell.setCellId("Constant_d82jgo_d0");
    Style style = new StyleImpl();
    new RightParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
