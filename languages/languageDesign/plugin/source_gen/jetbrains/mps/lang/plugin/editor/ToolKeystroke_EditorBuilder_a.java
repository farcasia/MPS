package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class ToolKeystroke_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ToolKeystroke_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_nczmp2_a();
  }

  private EditorCell createCollection_nczmp2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_nczmp2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_nczmp2_a0());
    editorCell.addEditorCell(createConstant_nczmp2_b0());
    editorCell.addEditorCell(createRefNode_nczmp2_c0());
    return editorCell;
  }
  private EditorCell createProperty_nczmp2_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("keymap");
    provider.setNoTargetText("<no keymap>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_keymap");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_nczmp2_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_nczmp2_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_nczmp2_c0() {
    SingleRoleCellProvider provider = new ToolKeystroke_EditorBuilder_a.keystrokeSingleRoleHandler_nczmp2_c0(myNode, MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L, 0x68b8d4843b76126L, "keystroke"), getEditorContext());
    return provider.createCell();
  }
  private static class keystrokeSingleRoleHandler_nczmp2_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public keystrokeSingleRoleHandler_nczmp2_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L, 0x68b8d4843b76126L, "keystroke"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L, 0x68b8d4843b76126L, "keystroke"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L, 0x68b8d4843b76126L, "keystroke"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("keystroke");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L, 0x68b8d4843b76126L, "keystroke")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_keystroke");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no keystroke>";
    }
  }
}
