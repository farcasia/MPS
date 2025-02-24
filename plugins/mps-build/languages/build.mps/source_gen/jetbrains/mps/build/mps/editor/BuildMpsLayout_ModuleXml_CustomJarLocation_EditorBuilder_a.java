package jetbrains.mps.build.mps.editor;

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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

/*package*/ class BuildMpsLayout_ModuleXml_CustomJarLocation_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BuildMpsLayout_ModuleXml_CustomJarLocation_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_r8678q_a();
  }

  private EditorCell createCollection_r8678q_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_r8678q_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNode_r8678q_a0());
    editorCell.addEditorCell(createConstant_r8678q_b0());
    editorCell.addEditorCell(createProperty_r8678q_c0());
    return editorCell;
  }
  private EditorCell createRefNode_r8678q_a0() {
    SingleRoleCellProvider provider = new BuildMpsLayout_ModuleXml_CustomJarLocation_EditorBuilder_a.pathSingleRoleHandler_r8678q_a0(myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3c765492deb1a384L, 0x3c765492deb1a385L, "path"), getEditorContext());
    return provider.createCell();
  }
  private static class pathSingleRoleHandler_r8678q_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public pathSingleRoleHandler_r8678q_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3c765492deb1a384L, 0x3c765492deb1a385L, "path"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3c765492deb1a384L, 0x3c765492deb1a385L, "path"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3c765492deb1a384L, 0x3c765492deb1a385L, "path"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("path");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3c765492deb1a384L, 0x3c765492deb1a385L, "path")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_path");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no path>";
    }
  }
  private EditorCell createConstant_r8678q_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "->");
    editorCell.setCellId("Constant_r8678q_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_r8678q_c0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("packagedLocation");
    provider.setNoTargetText("<no packagedLocation>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_packagedLocation");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
