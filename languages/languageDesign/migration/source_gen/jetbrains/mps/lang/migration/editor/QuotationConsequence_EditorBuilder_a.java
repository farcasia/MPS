package jetbrains.mps.lang.migration.editor;

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

/*package*/ class QuotationConsequence_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public QuotationConsequence_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ad3ebu_a();
  }

  private EditorCell createCollection_ad3ebu_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ad3ebu_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_ad3ebu_a0());
    return editorCell;
  }
  private EditorCell createRefNode_ad3ebu_a0() {
    SingleRoleCellProvider provider = new QuotationConsequence_EditorBuilder_a.quotationSingleRoleHandler_ad3ebu_a0(myNode, MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x4e382b39b6532d41L, 0x550f7de0eda6517eL, "quotation"), getEditorContext());
    return provider.createCell();
  }
  private static class quotationSingleRoleHandler_ad3ebu_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public quotationSingleRoleHandler_ad3ebu_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x4e382b39b6532d41L, 0x550f7de0eda6517eL, "quotation"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x4e382b39b6532d41L, 0x550f7de0eda6517eL, "quotation"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x4e382b39b6532d41L, 0x550f7de0eda6517eL, "quotation"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("quotation");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x4e382b39b6532d41L, 0x550f7de0eda6517eL, "quotation")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_quotation");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no quotation>";
    }
  }
}
