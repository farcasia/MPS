package jetbrains.mps.lang.dataFlow.editor;

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
import jetbrains.mps.lang.dataFlow.editor.DataFlow_StyleSheet.InstructionStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class BaseEmitVariableStatement_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BaseEmitVariableStatement_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_w7ohj2_a();
  }

  private EditorCell createCollection_w7ohj2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_w7ohj2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_w7ohj2_a0());
    editorCell.addEditorCell(createRefNode_w7ohj2_b0());
    return editorCell;
  }
  private EditorCell createComponent_w7ohj2_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new InstructionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNode_w7ohj2_b0() {
    SingleRoleCellProvider provider = new BaseEmitVariableStatement_EditorBuilder_a.variableSingleRoleHandler_w7ohj2_b0(myNode, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e5b40208L, 0x118e5b41f27L, "variable"), getEditorContext());
    return provider.createCell();
  }
  private static class variableSingleRoleHandler_w7ohj2_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public variableSingleRoleHandler_w7ohj2_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e5b40208L, 0x118e5b41f27L, "variable"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e5b40208L, 0x118e5b41f27L, "variable"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e5b40208L, 0x118e5b41f27L, "variable"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("variable");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e5b40208L, 0x118e5b41f27L, "variable")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_variable");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no variable>";
    }
  }
}
