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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.baseLanguage.collections.editor.Collections_Style_StyleSheet.LeftAngleBracketStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.collections.editor.Collections_Style_StyleSheet.RightAngleBracketStyleClass;

/*package*/ class ModuleTarget_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ModuleTarget_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_5pqt0n_a();
  }

  private EditorCell createCollection_5pqt0n_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_5pqt0n_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_5pqt0n_a0());
    editorCell.addEditorCell(createComponent_5pqt0n_b0());
    return editorCell;
  }
  private EditorCell createCollection_5pqt0n_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_5pqt0n_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_5pqt0n_a0a());
    editorCell.addEditorCell(createConstant_5pqt0n_b0a());
    editorCell.addEditorCell(createRefNode_5pqt0n_c0a());
    editorCell.addEditorCell(createConstant_5pqt0n_d0a());
    return editorCell;
  }
  private EditorCell createConstant_5pqt0n_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "module");
    editorCell.setCellId("Constant_5pqt0n_a0a");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5pqt0n_b0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<");
    editorCell.setCellId("Constant_5pqt0n_b0a");
    Style style = new StyleImpl();
    new LeftAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_5pqt0n_c0a() {
    SingleRoleCellProvider provider = new ModuleTarget_EditorBuilder_a.moduleTypeSingleRoleHandler_5pqt0n_c0a(myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a056bL, 0x5fb04b74a77a056fL, "moduleType"), getEditorContext());
    return provider.createCell();
  }
  private static class moduleTypeSingleRoleHandler_5pqt0n_c0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public moduleTypeSingleRoleHandler_5pqt0n_c0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a056bL, 0x5fb04b74a77a056fL, "moduleType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a056bL, 0x5fb04b74a77a056fL, "moduleType"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a056bL, 0x5fb04b74a77a056fL, "moduleType"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("moduleType");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x3ecd7c84cde345deL, 0x886c135ecc69b742L, 0x5fb04b74a77a056bL, 0x5fb04b74a77a056fL, "moduleType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_moduleType");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no moduleType>";
    }
  }
  private EditorCell createConstant_5pqt0n_d0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ">");
    editorCell.setCellId("Constant_5pqt0n_d0a");
    Style style = new StyleImpl();
    new RightAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_5pqt0n_b0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.refactoring.editor.RefactoringTarget");
    return editorCell;
  }
}
