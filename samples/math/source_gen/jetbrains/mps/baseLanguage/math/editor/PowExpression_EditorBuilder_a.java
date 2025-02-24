package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Superscript;
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
import jetbrains.mps.editor.runtime.style.ScriptKind;
import jetbrains.mps.editor.runtime.EditorCell_Empty;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

/*package*/ class PowExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public PowExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ysso2m_a();
  }

  private EditorCell createCollection_ysso2m_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ysso2m_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_ysso2m_a0());
    editorCell.addEditorCell(createEmpty_ysso2m_b0());
    return editorCell;
  }
  private EditorCell createCollection_ysso2m_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Superscript());
    editorCell.setCellId("Collection_ysso2m_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createRefNode_ysso2m_a0a());
    editorCell.addEditorCell(createRefNode_ysso2m_b0a());
    return editorCell;
  }
  private EditorCell createRefNode_ysso2m_a0a() {
    SingleRoleCellProvider provider = new PowExpression_EditorBuilder_a.baseSingleRoleHandler_ysso2m_a0a(myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b71f8bL, "base"), getEditorContext());
    return provider.createCell();
  }
  private static class baseSingleRoleHandler_ysso2m_a0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public baseSingleRoleHandler_ysso2m_a0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b71f8bL, "base"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b71f8bL, "base"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b71f8bL, "base"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("base");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b71f8bL, "base")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_base");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no base>";
    }
  }
  private EditorCell createRefNode_ysso2m_b0a() {
    SingleRoleCellProvider provider = new PowExpression_EditorBuilder_a.exponentSingleRoleHandler_ysso2m_b0a(myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b722e7L, "exponent"), getEditorContext());
    return provider.createCell();
  }
  private static class exponentSingleRoleHandler_ysso2m_b0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public exponentSingleRoleHandler_ysso2m_b0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b722e7L, "exponent"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b722e7L, "exponent"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b722e7L, "exponent"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("exponent");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.SCRIPT_KIND, ScriptKind.SUPERSCRIPT);
      editorCell.getStyle().putAll(style);
      delete_exponent.setCellActions(editorCell, getNode(), getEditorContext());
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x12052b2cdd3L, 0x12052b722e7L, "exponent")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_exponent");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no exponent>";
    }
  }
  private EditorCell createEmpty_ysso2m_b0() {
    EditorCell_Empty editorCell = new EditorCell_Empty(getEditorContext(), myNode);
    editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
    editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(editorCell.getSNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
    editorCell.setCellId("Empty_ysso2m_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
