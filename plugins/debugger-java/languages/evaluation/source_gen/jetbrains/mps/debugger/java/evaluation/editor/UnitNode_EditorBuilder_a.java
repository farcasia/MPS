package jetbrains.mps.debugger.java.evaluation.editor;

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

/*package*/ class UnitNode_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public UnitNode_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ht3f9v_a();
  }

  private EditorCell createCollection_ht3f9v_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ht3f9v_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_ht3f9v_a0());
    return editorCell;
  }
  private EditorCell createRefNode_ht3f9v_a0() {
    SingleRoleCellProvider provider = new UnitNode_EditorBuilder_a.debuggedTypeSingleRoleHandler_ht3f9v_a0(myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3c2f40ee0bb3cbf5L, 0x3f11b1341fa2c39cL, "debuggedType"), getEditorContext());
    return provider.createCell();
  }
  private static class debuggedTypeSingleRoleHandler_ht3f9v_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public debuggedTypeSingleRoleHandler_ht3f9v_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3c2f40ee0bb3cbf5L, 0x3f11b1341fa2c39cL, "debuggedType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3c2f40ee0bb3cbf5L, 0x3f11b1341fa2c39cL, "debuggedType"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3c2f40ee0bb3cbf5L, 0x3f11b1341fa2c39cL, "debuggedType"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("debuggedType");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3c2f40ee0bb3cbf5L, 0x3f11b1341fa2c39cL, "debuggedType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_debuggedType");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no debuggedType>";
    }
  }
}
