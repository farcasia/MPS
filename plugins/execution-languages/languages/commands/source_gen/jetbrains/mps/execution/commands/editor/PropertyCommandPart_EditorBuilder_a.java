package jetbrains.mps.execution.commands.editor;

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
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class PropertyCommandPart_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public PropertyCommandPart_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_47e41d_a();
  }

  private EditorCell createCollection_47e41d_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_47e41d_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_47e41d_a0());
    editorCell.addEditorCell(createRefNode_47e41d_b0());
    editorCell.addEditorCell(createConstant_47e41d_c0());
    editorCell.addEditorCell(createRefNode_47e41d_d0());
    return editorCell;
  }
  private EditorCell createConstant_47e41d_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "-D");
    editorCell.setCellId("Constant_47e41d_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_47e41d_b0() {
    SingleRoleCellProvider provider = new PropertyCommandPart_EditorBuilder_a.keySingleRoleHandler_47e41d_b0(myNode, MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a706fL, "key"), getEditorContext());
    return provider.createCell();
  }
  private static class keySingleRoleHandler_47e41d_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public keySingleRoleHandler_47e41d_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a706fL, "key"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a706fL, "key"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a706fL, "key"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("key");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a706fL, "key")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_key");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no key>";
    }
  }
  private EditorCell createConstant_47e41d_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "=");
    editorCell.setCellId("Constant_47e41d_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_47e41d_d0() {
    SingleRoleCellProvider provider = new PropertyCommandPart_EditorBuilder_a.valueSingleRoleHandler_47e41d_d0(myNode, MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a7070L, "value"), getEditorContext());
    return provider.createCell();
  }
  private static class valueSingleRoleHandler_47e41d_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public valueSingleRoleHandler_47e41d_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a7070L, "value"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a7070L, "value"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a7070L, "value"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("value");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xf3347d8a0e794f35L, 0x8ac91574f25c986fL, 0x72450cdacb8a706eL, 0x72450cdacb8a7070L, "value")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_value");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no value>";
    }
  }
}
