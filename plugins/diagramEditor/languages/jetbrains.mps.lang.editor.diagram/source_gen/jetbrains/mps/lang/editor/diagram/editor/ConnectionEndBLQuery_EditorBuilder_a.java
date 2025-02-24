package jetbrains.mps.lang.editor.diagram.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;

/*package*/ class ConnectionEndBLQuery_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ConnectionEndBLQuery_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_fk2o1x_a();
  }

  private EditorCell createCollection_fk2o1x_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_fk2o1x_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_fk2o1x_a0());
    editorCell.addEditorCell(createConstant_fk2o1x_b0());
    editorCell.addEditorCell(createRefNode_fk2o1x_c0());
    return editorCell;
  }
  private EditorCell createRefNode_fk2o1x_a0() {
    SingleRoleCellProvider provider = new ConnectionEndBLQuery_EditorBuilder_a.targetNodeSingleRoleHandler_fk2o1x_a0(myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x287647ebcf77ee1aL, "targetNode"), getEditorContext());
    return provider.createCell();
  }
  private static class targetNodeSingleRoleHandler_fk2o1x_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public targetNodeSingleRoleHandler_fk2o1x_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x287647ebcf77ee1aL, "targetNode"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x287647ebcf77ee1aL, "targetNode"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x287647ebcf77ee1aL, "targetNode"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("targetNode");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x287647ebcf77ee1aL, "targetNode")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_targetNode");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no targetNode>";
    }
  }
  private EditorCell createConstant_fk2o1x_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "#");
    editorCell.setCellId("Constant_fk2o1x_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_fk2o1x_c0() {
    SingleRoleCellProvider provider = new ConnectionEndBLQuery_EditorBuilder_a.pointIDSingleRoleHandler_fk2o1x_c0(myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x10efa534a5093964L, "pointID"), getEditorContext());
    return provider.createCell();
  }
  private static class pointIDSingleRoleHandler_fk2o1x_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public pointIDSingleRoleHandler_fk2o1x_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x10efa534a5093964L, "pointID"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x10efa534a5093964L, "pointID"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x10efa534a5093964L, "pointID"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("pointID");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x10efa534a508176dL, 0x10efa534a5093964L, "pointID")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_pointID");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no pointID>";
    }
  }
}
