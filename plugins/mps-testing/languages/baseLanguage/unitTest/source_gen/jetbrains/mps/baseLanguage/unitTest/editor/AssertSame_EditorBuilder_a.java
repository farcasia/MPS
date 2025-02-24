package jetbrains.mps.baseLanguage.unitTest.editor;

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
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.OperatorStyleClass;

/*package*/ class AssertSame_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AssertSame_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_1px6hs_a();
  }

  private EditorCell createCollection_1px6hs_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_1px6hs_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_1px6hs_a0());
    editorCell.addEditorCell(createRefNode_1px6hs_b0());
    editorCell.addEditorCell(createConstant_1px6hs_c0());
    editorCell.addEditorCell(createRefNode_1px6hs_d0());
    editorCell.addEditorCell(createComponent_1px6hs_e0());
    editorCell.addEditorCell(createConstant_1px6hs_f0());
    return editorCell;
  }
  private EditorCell createConstant_1px6hs_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "assert");
    editorCell.setCellId("Constant_1px6hs_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1px6hs_b0() {
    SingleRoleCellProvider provider = new AssertSame_EditorBuilder_a.expectedSingleRoleHandler_1px6hs_b0(myNode, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd44L, "expected"), getEditorContext());
    return provider.createCell();
  }
  private static class expectedSingleRoleHandler_1px6hs_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public expectedSingleRoleHandler_1px6hs_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd44L, "expected"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd44L, "expected"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd44L, "expected"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("expected");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd44L, "expected")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_expected");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no expected>";
    }
  }
  private EditorCell createConstant_1px6hs_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "==");
    editorCell.setCellId("Constant_1px6hs_c0");
    Style style = new StyleImpl();
    new OperatorStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1px6hs_d0() {
    SingleRoleCellProvider provider = new AssertSame_EditorBuilder_a.actualSingleRoleHandler_1px6hs_d0(myNode, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd45L, "actual"), getEditorContext());
    return provider.createCell();
  }
  private static class actualSingleRoleHandler_1px6hs_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public actualSingleRoleHandler_1px6hs_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd45L, "actual"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd45L, "actual"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd45L, "actual"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("actual");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x74f562a3a993fd3dL, 0x74f562a3a993fd45L, "actual")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_actual");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no actual>";
    }
  }
  private EditorCell createComponent_1px6hs_e0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.baseLanguage.unitTest.editor.MessageComponent");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createConstant_1px6hs_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ";");
    editorCell.setCellId("Constant_1px6hs_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
