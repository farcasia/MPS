package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class WeaveMacro_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public WeaveMacro_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_1n0h5d_a_0();
  }

  private EditorCell createCollection_1n0h5d_a_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_1n0h5d_a_0");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_1n0h5d_a0_0());
    editorCell.addEditorCell(createConstant_1n0h5d_b0());
    editorCell.addEditorCell(createCollection_1n0h5d_c0());
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_a0_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "weave nodes under output node");
    editorCell.setCellId("Constant_1n0h5d_a0_0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE, StyleRegistry.getInstance().getSimpleColor(MPSColors.lightGray)));
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.lightGray));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_1n0h5d_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_1n0h5d_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_1n0h5d_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(createComponent_1n0h5d_a2a());
    editorCell.addEditorCell(createComponent_1n0h5d_b2a());
    editorCell.addEditorCell(createCollection_1n0h5d_c2a());
    editorCell.addEditorCell(createCollection_1n0h5d_d2a());
    editorCell.addEditorCell(createCollection_1n0h5d_e2a());
    return editorCell;
  }
  private EditorCell createComponent_1n0h5d_a2a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.generator.editor.AbstractMacro_comment_inspector");
    return editorCell;
  }
  private EditorCell createComponent_1n0h5d_b2a() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.generator.editor.NodeMacro_label_inspector");
    return editorCell;
  }
  private EditorCell createCollection_1n0h5d_c2a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_1n0h5d_c2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_1n0h5d_a2c0());
    editorCell.addEditorCell(createConstant_1n0h5d_b2c0());
    editorCell.addEditorCell(createRefNode_1n0h5d_c2c0());
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_a2c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "use input");
    editorCell.setCellId("Constant_1n0h5d_a2c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_b2c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_1n0h5d_b2c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1n0h5d_c2c0() {
    SingleRoleCellProvider provider = new WeaveMacro_InspectorBuilder_a.nodesToWeaveQuerySingleRoleHandler_1n0h5d_c2c0(myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261ebL, "nodesToWeaveQuery"), getEditorContext());
    return provider.createCell();
  }
  private static class nodesToWeaveQuerySingleRoleHandler_1n0h5d_c2c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public nodesToWeaveQuerySingleRoleHandler_1n0h5d_c2c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261ebL, "nodesToWeaveQuery"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261ebL, "nodesToWeaveQuery"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261ebL, "nodesToWeaveQuery"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("nodesToWeaveQuery");
      }
      if (true) {
        editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.FIRST_EDITABLE_CELL);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261ebL, "nodesToWeaveQuery")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_nodesToWeaveQuery");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<current source node>";
    }
  }
  private EditorCell createCollection_1n0h5d_d2a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_1n0h5d_d2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_1n0h5d_a3c0());
    editorCell.addEditorCell(createConstant_1n0h5d_b3c0());
    editorCell.addEditorCell(createRefNode_1n0h5d_c3c0());
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_a3c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "weave");
    editorCell.setCellId("Constant_1n0h5d_a3c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_b3c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_1n0h5d_b3c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1n0h5d_c3c0() {
    SingleRoleCellProvider provider = new WeaveMacro_InspectorBuilder_a.ruleConsequenceSingleRoleHandler_1n0h5d_c3c0(myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261edL, "ruleConsequence"), getEditorContext());
    return provider.createCell();
  }
  private static class ruleConsequenceSingleRoleHandler_1n0h5d_c3c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public ruleConsequenceSingleRoleHandler_1n0h5d_c3c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261edL, "ruleConsequence"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261edL, "ruleConsequence"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261edL, "ruleConsequence"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("ruleConsequence");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x300c02df884261edL, "ruleConsequence")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_ruleConsequence");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<none>";
    }
  }
  private EditorCell createCollection_1n0h5d_e2a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_1n0h5d_e2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_1n0h5d_a4c0());
    editorCell.addEditorCell(createConstant_1n0h5d_b4c0());
    editorCell.addEditorCell(createRefNode_1n0h5d_c4c0());
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_a4c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "anchor");
    editorCell.setCellId("Constant_1n0h5d_a4c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1n0h5d_b4c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_1n0h5d_b4c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1n0h5d_c4c0() {
    SingleRoleCellProvider provider = new WeaveMacro_InspectorBuilder_a.anchorQuerySingleRoleHandler_1n0h5d_c4c0(myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x2449b12bc386c28dL, "anchorQuery"), getEditorContext());
    return provider.createCell();
  }
  private static class anchorQuerySingleRoleHandler_1n0h5d_c4c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public anchorQuerySingleRoleHandler_1n0h5d_c4c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x2449b12bc386c28dL, "anchorQuery"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x2449b12bc386c28dL, "anchorQuery"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x2449b12bc386c28dL, "anchorQuery"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("anchorQuery");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L, 0x2449b12bc386c28dL, "anchorQuery")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_anchorQuery");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no anchorQuery>";
    }
  }
}
