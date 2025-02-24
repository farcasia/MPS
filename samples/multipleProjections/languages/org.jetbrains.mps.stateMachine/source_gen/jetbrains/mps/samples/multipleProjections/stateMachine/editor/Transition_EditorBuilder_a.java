package jetbrains.mps.samples.multipleProjections.stateMachine.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class Transition_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Transition_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_jj4qz_a();
  }

  private EditorCell createCollection_jj4qz_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_jj4qz_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_jj4qz_a0());
    editorCell.addEditorCell(createRefNode_jj4qz_b0());
    editorCell.addEditorCell(createCollection_jj4qz_c0());
    editorCell.addEditorCell(createConstant_jj4qz_d0());
    return editorCell;
  }
  private EditorCell createConstant_jj4qz_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "on event");
    editorCell.setCellId("Constant_jj4qz_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_jj4qz_b0() {
    SingleRoleCellProvider provider = new Transition_EditorBuilder_a.triggerSingleRoleHandler_jj4qz_b0(myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743fL, "trigger"), getEditorContext());
    return provider.createCell();
  }
  private static class triggerSingleRoleHandler_jj4qz_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public triggerSingleRoleHandler_jj4qz_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743fL, "trigger"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743fL, "trigger"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743fL, "trigger"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("trigger");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743fL, "trigger")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_trigger");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no trigger>";
    }
  }
  private EditorCell createCollection_jj4qz_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_jj4qz_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createRefNode_jj4qz_a2a());
    editorCell.addEditorCell(createConstant_jj4qz_b2a());
    editorCell.addEditorCell(createRefNode_jj4qz_c2a());
    return editorCell;
  }
  private EditorCell createRefNode_jj4qz_a2a() {
    SingleRoleCellProvider provider = new Transition_EditorBuilder_a.fromStateSingleRoleHandler_jj4qz_a2a(myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743eL, "fromState"), getEditorContext());
    return provider.createCell();
  }
  private static class fromStateSingleRoleHandler_jj4qz_a2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public fromStateSingleRoleHandler_jj4qz_a2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743eL, "fromState"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743eL, "fromState"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743eL, "fromState"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("fromState");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c845743eL, "fromState")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_fromState");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no fromState>";
    }
  }
  private EditorCell createConstant_jj4qz_b2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "->");
    editorCell.setCellId("Constant_jj4qz_b2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_jj4qz_c2a() {
    SingleRoleCellProvider provider = new Transition_EditorBuilder_a.toStateSingleRoleHandler_jj4qz_c2a(myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c8457440L, "toState"), getEditorContext());
    return provider.createCell();
  }
  private static class toStateSingleRoleHandler_jj4qz_c2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public toStateSingleRoleHandler_jj4qz_c2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c8457440L, "toState"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c8457440L, "toState"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c8457440L, "toState"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("toState");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x530533eef7894c1eL, 0xba56de1bbf3afda7L, 0xa99ffe1c845743dL, 0xa99ffe1c8457440L, "toState")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_toState");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no toState>";
    }
  }
  private EditorCell createConstant_jj4qz_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_jj4qz_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
