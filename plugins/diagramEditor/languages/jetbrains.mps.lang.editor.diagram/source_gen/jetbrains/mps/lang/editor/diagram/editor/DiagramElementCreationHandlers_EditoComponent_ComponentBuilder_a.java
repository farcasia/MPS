package jetbrains.mps.lang.editor.diagram.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class DiagramElementCreationHandlers_EditoComponent_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public DiagramElementCreationHandlers_EditoComponent_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_6gkixf_a();
  }

  private EditorCell createCollection_6gkixf_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_6gkixf_a");
    editorCell.addEditorCell(createConstant_6gkixf_a0());
    editorCell.addEditorCell(createRefNode_6gkixf_b0());
    return editorCell;
  }
  private EditorCell createConstant_6gkixf_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "on create:");
    editorCell.setCellId("Constant_6gkixf_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_6gkixf_b0() {
    SingleRoleCellProvider provider = new DiagramElementCreationHandlers_EditoComponent_ComponentBuilder_a.handlerSingleRoleHandler_6gkixf_b0(myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, 0x76f1cb20ba7726e1L, "handler"), getEditorContext());
    return provider.createCell();
  }
  private static class handlerSingleRoleHandler_6gkixf_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public handlerSingleRoleHandler_6gkixf_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, 0x76f1cb20ba7726e1L, "handler"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, 0x76f1cb20ba7726e1L, "handler"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, 0x76f1cb20ba7726e1L, "handler"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("handler");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x76f1cb20ba75918aL, 0x76f1cb20ba7726e1L, "handler")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_handler");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no handler>";
    }
  }
}
