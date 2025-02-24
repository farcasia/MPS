package jetbrains.mps.execution.settings.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;

/*package*/ class SettingsEditor_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SettingsEditor_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_2l0ivi_a();
  }

  private EditorCell createCollection_2l0ivi_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_2l0ivi_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefNodeList_2l0ivi_a0());
    editorCell.addEditorCell(createConstant_2l0ivi_b0());
    editorCell.addEditorCell(createRefNode_2l0ivi_c0());
    editorCell.addEditorCell(createRefNode_2l0ivi_d0());
    editorCell.addEditorCell(createRefNode_2l0ivi_e0());
    editorCell.addEditorCell(createRefNode_2l0ivi_f0());
    return editorCell;
  }
  private EditorCell createRefNodeList_2l0ivi_a0() {
    AbstractCellListHandler handler = new SettingsEditor_EditorBuilder_a.propertyDeclarationListHandler_2l0ivi_a0(myNode, "propertyDeclaration", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_propertyDeclaration");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class propertyDeclarationListHandler_2l0ivi_a0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public propertyDeclarationListHandler_2l0ivi_a0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f910132L, "jetbrains.mps.execution.settings.structure.EditorPropertyDeclaration"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(propertyDeclarationListHandler_2l0ivi_a0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910142L, "propertyDeclaration")));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    public void installElementCellActions(SNode elementNode, EditorCell elementCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910142L, "propertyDeclaration"), elementNode));
        }
      }
    }
  }
  private EditorCell createConstant_2l0ivi_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_2l0ivi_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_2l0ivi_c0() {
    SingleRoleCellProvider provider = new SettingsEditor_EditorBuilder_a.createEditorSingleRoleHandler_2l0ivi_c0(myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013eL, "createEditor"), getEditorContext());
    return provider.createCell();
  }
  private static class createEditorSingleRoleHandler_2l0ivi_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public createEditorSingleRoleHandler_2l0ivi_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013eL, "createEditor"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013eL, "createEditor"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013eL, "createEditor"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("createEditor");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013eL, "createEditor")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_createEditor");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no createEditor>";
    }
  }
  private EditorCell createRefNode_2l0ivi_d0() {
    SingleRoleCellProvider provider = new SettingsEditor_EditorBuilder_a.resetFromSingleRoleHandler_2l0ivi_d0(myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910140L, "resetFrom"), getEditorContext());
    return provider.createCell();
  }
  private static class resetFromSingleRoleHandler_2l0ivi_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public resetFromSingleRoleHandler_2l0ivi_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910140L, "resetFrom"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910140L, "resetFrom"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910140L, "resetFrom"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("resetFrom");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910140L, "resetFrom")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_resetFrom");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no resetFrom>";
    }
  }
  private EditorCell createRefNode_2l0ivi_e0() {
    SingleRoleCellProvider provider = new SettingsEditor_EditorBuilder_a.applyToSingleRoleHandler_2l0ivi_e0(myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013fL, "applyTo"), getEditorContext());
    return provider.createCell();
  }
  private static class applyToSingleRoleHandler_2l0ivi_e0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public applyToSingleRoleHandler_2l0ivi_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013fL, "applyTo"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013fL, "applyTo"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013fL, "applyTo"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("applyTo");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f91013fL, "applyTo")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_applyTo");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no applyTo>";
    }
  }
  private EditorCell createRefNode_2l0ivi_f0() {
    SingleRoleCellProvider provider = new SettingsEditor_EditorBuilder_a.disposeSingleRoleHandler_2l0ivi_f0(myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910141L, "dispose"), getEditorContext());
    return provider.createCell();
  }
  private static class disposeSingleRoleHandler_2l0ivi_f0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public disposeSingleRoleHandler_2l0ivi_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910141L, "dispose"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910141L, "dispose"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910141L, "dispose"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("dispose");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x756e911c3f1f4a48L, 0xbdf5a2ceb91b723cL, 0xd244b712f91013dL, 0xd244b712f910141L, "dispose")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_dispose");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no dispose>";
    }
  }
}
