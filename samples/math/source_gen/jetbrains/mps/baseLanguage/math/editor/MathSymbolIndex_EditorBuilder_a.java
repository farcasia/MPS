package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
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

/*package*/ class MathSymbolIndex_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public MathSymbolIndex_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_hqsv2l_a();
  }

  private EditorCell createCollection_hqsv2l_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_hqsv2l_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_hqsv2l_a0());
    editorCell.addEditorCell(createConstant_hqsv2l_b0());
    editorCell.addEditorCell(createRefNode_hqsv2l_c0());
    return editorCell;
  }
  private EditorCell createProperty_hqsv2l_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_hqsv2l_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "in");
    editorCell.setCellId("Constant_hqsv2l_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_hqsv2l_c0() {
    SingleRoleCellProvider provider = new MathSymbolIndex_EditorBuilder_a.iterableSingleRoleHandler_hqsv2l_c0(myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x11fe0ca6da8L, 0x11fe0ccecc0L, "iterable"), getEditorContext());
    return provider.createCell();
  }
  private static class iterableSingleRoleHandler_hqsv2l_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public iterableSingleRoleHandler_hqsv2l_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x11fe0ca6da8L, 0x11fe0ccecc0L, "iterable"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x11fe0ca6da8L, 0x11fe0ccecc0L, "iterable"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x11fe0ca6da8L, 0x11fe0ccecc0L, "iterable"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("iterable");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x11fe0ca6da8L, 0x11fe0ccecc0L, "iterable")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_iterable");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no iterable>";
    }
  }
}
