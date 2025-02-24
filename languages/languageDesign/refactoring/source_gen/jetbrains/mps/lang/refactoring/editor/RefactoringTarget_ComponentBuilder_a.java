package jetbrains.mps.lang.refactoring.editor;

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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class RefactoringTarget_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public RefactoringTarget_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_l747zs_a();
  }

  private EditorCell createCollection_l747zs_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_l747zs_a");
    editorCell.addEditorCell(createCollection_l747zs_a0());
    editorCell.addEditorCell(createRefNode_l747zs_b0());
    return editorCell;
  }
  private EditorCell createCollection_l747zs_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_l747zs_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_l747zs_a0a());
    editorCell.addEditorCell(createProperty_l747zs_b0a());
    return editorCell;
  }
  private EditorCell createConstant_l747zs_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "allow multiple:");
    editorCell.setCellId("Constant_l747zs_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_l747zs_b0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("allowMultiple");
    provider.setNoTargetText("<no allowMultiple>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("RT_property_allowMultiple");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createRefNode_l747zs_b0() {
    SingleRoleCellProvider provider = new RefactoringTarget_ComponentBuilder_a.isApplicableBlockSingleRoleHandler_l747zs_b0(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0569L, 0x4c4b92003e4d7817L, "isApplicableBlock"), getEditorContext());
    return provider.createCell();
  }
  private static class isApplicableBlockSingleRoleHandler_l747zs_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public isApplicableBlockSingleRoleHandler_l747zs_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0569L, 0x4c4b92003e4d7817L, "isApplicableBlock"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0569L, 0x4c4b92003e4d7817L, "isApplicableBlock"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0569L, 0x4c4b92003e4d7817L, "isApplicableBlock"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("isApplicableBlock");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a0569L, 0x4c4b92003e4d7817L, "isApplicableBlock")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_isApplicableBlock");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<applicable=true>";
    }
  }
}
