package jetbrains.mps.build.workflow.editor;

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
import jetbrains.mps.build.workflow.editor.workflowStyles_StyleSheet.keywordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class BwfProjectPartStatement_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BwfProjectPartStatement_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_bye224_a();
  }

  private EditorCell createCollection_bye224_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_bye224_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_bye224_a0());
    editorCell.addEditorCell(createRefNode_bye224_b0());
    return editorCell;
  }
  private EditorCell createConstant_bye224_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "project part");
    editorCell.setCellId("Constant_bye224_a0");
    Style style = new StyleImpl();
    new keywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_bye224_b0() {
    SingleRoleCellProvider provider = new BwfProjectPartStatement_EditorBuilder_a.partSingleRoleHandler_bye224_b0(myNode, MetaAdapterFactory.getContainmentLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL, 0x2318e5dbdfc153ddL, "part"), getEditorContext());
    return provider.createCell();
  }
  private static class partSingleRoleHandler_bye224_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public partSingleRoleHandler_bye224_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL, 0x2318e5dbdfc153ddL, "part"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL, 0x2318e5dbdfc153ddL, "part"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL, 0x2318e5dbdfc153ddL, "part"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("part");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL, 0x2318e5dbdfc153ddL, "part")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_part");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no part>";
    }
  }
}
