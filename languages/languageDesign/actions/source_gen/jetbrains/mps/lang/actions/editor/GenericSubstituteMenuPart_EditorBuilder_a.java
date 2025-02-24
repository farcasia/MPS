package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class GenericSubstituteMenuPart_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public GenericSubstituteMenuPart_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_nnjeis_a();
  }

  private EditorCell createCollection_nnjeis_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_nnjeis_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_nnjeis_a0());
    editorCell.addEditorCell(createCollection_nnjeis_b0());
    return editorCell;
  }
  private EditorCell createCollection_nnjeis_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_nnjeis_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_nnjeis_a0a());
    return editorCell;
  }
  private EditorCell createConstant_nnjeis_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "generic query");
    editorCell.setCellId("Constant_nnjeis_a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_nnjeis_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_nnjeis_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_nnjeis_a1a());
    editorCell.addEditorCell(createRefNode_nnjeis_b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_nnjeis_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_nnjeis_b1a() {
    SingleRoleCellProvider provider = new GenericSubstituteMenuPart_EditorBuilder_a.querySingleRoleHandler_nnjeis_b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1175fc5138eL, 0x1175fc65d5dL, "query"), getEditorContext());
    return provider.createCell();
  }
  private static class querySingleRoleHandler_nnjeis_b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public querySingleRoleHandler_nnjeis_b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1175fc5138eL, 0x1175fc65d5dL, "query"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1175fc5138eL, 0x1175fc65d5dL, "query"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1175fc5138eL, 0x1175fc65d5dL, "query"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("query");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1175fc5138eL, 0x1175fc65d5dL, "query")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_query");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no query>";
    }
  }
}
