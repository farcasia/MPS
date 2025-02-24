package jetbrains.mps.lang.editor.editorTest.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class AttractsFocusBlock_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AttractsFocusBlock_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_on5i7m_a();
  }

  private EditorCell createCollection_on5i7m_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_on5i7m_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_on5i7m_a0());
    editorCell.addEditorCell(createRefNode_on5i7m_b0());
    return editorCell;
  }
  private EditorCell createConstant_on5i7m_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "attracts focus");
    editorCell.setCellId("Constant_on5i7m_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_on5i7m_b0() {
    SingleRoleCellProvider provider = new AttractsFocusBlock_EditorBuilder_a.childSingleRoleHandler_on5i7m_b0(myNode, MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2444dad137f8d778L, 0x2444dad137f8d779L, "child"), getEditorContext());
    return provider.createCell();
  }
  private static class childSingleRoleHandler_on5i7m_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public childSingleRoleHandler_on5i7m_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2444dad137f8d778L, 0x2444dad137f8d779L, "child"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2444dad137f8d778L, 0x2444dad137f8d779L, "child"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2444dad137f8d778L, 0x2444dad137f8d779L, "child"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("child");
      }
      if (true) {
        editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.ATTRACTS_FOCUS);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2444dad137f8d778L, 0x2444dad137f8d779L, "child")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_child");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no child>";
    }
  }
}
