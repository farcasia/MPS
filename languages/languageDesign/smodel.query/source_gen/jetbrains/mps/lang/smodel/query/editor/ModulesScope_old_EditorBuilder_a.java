package jetbrains.mps.lang.smodel.query.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftBracketStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightBracketStyleClass;

/*package*/ class ModulesScope_old_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ModulesScope_old_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_lan3wb_a();
  }

  private EditorCell createCollection_lan3wb_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_lan3wb_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_lan3wb_a0());
    editorCell.addEditorCell(createConstant_lan3wb_b0());
    editorCell.addEditorCell(createConstant_lan3wb_c0());
    editorCell.addEditorCell(createRefNode_lan3wb_d0());
    editorCell.addEditorCell(createConstant_lan3wb_e0());
    return editorCell;
  }
  private EditorCell createComponent_lan3wb_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    return editorCell;
  }
  private EditorCell createConstant_lan3wb_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_lan3wb_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_lan3wb_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "[");
    editorCell.setCellId("Constant_lan3wb_c0");
    Style style = new StyleImpl();
    new LeftBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_lan3wb_d0() {
    SingleRoleCellProvider provider = new ModulesScope_old_EditorBuilder_a.modules_oldSingleRoleHandler_lan3wb_d0(myNode, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x263c7e661fa6d53dL, 0x307931d0f94af768L, "modules_old"), getEditorContext());
    return provider.createCell();
  }
  private static class modules_oldSingleRoleHandler_lan3wb_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public modules_oldSingleRoleHandler_lan3wb_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x263c7e661fa6d53dL, 0x307931d0f94af768L, "modules_old"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x263c7e661fa6d53dL, 0x307931d0f94af768L, "modules_old"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x263c7e661fa6d53dL, 0x307931d0f94af768L, "modules_old"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("modules_old");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x263c7e661fa6d53dL, 0x307931d0f94af768L, "modules_old")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_modules_old");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no modules_old>";
    }
  }
  private EditorCell createConstant_lan3wb_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "]");
    editorCell.setCellId("Constant_lan3wb_e0");
    Style style = new StyleImpl();
    new RightBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
