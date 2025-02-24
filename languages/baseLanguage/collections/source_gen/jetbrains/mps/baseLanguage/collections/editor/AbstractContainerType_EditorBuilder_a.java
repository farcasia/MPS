package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.Padding;
import jetbrains.mps.editor.runtime.style.Measure;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.collections.editor.Collections_Style_StyleSheet.LeftAngleBracketStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.collections.editor.Collections_Style_StyleSheet.RightAngleBracketStyleClass;

/*package*/ class AbstractContainerType_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AbstractContainerType_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_v6pnhl_a();
  }

  private EditorCell createCollection_v6pnhl_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_v6pnhl_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_v6pnhl_a0());
    editorCell.addEditorCell(createConstant_v6pnhl_b0());
    editorCell.addEditorCell(createRefNode_v6pnhl_c0());
    editorCell.addEditorCell(createConstant_v6pnhl_d0());
    return editorCell;
  }
  private EditorCell createComponent_v6pnhl_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), new BasicCellContext(myNode), new SubstituteInfoPartExt[]{new AbstractContainerType_EditorBuilder_a.AbstractContainerType_component_cellMenu_v6pnhl_a0a0(), new SChildSubstituteInfoPartEx(editorCell)}));
    return editorCell;
  }
  public static class AbstractContainerType_component_cellMenu_v6pnhl_a0a0 implements SubstituteInfoPartExt {
    private replace_withAnotherSequenceType myComponent;
    public AbstractContainerType_component_cellMenu_v6pnhl_a0a0() {
      this.myComponent = new replace_withAnotherSequenceType();
    }
    public List<SubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createSubstituteActions(cellContext, editorContext);
    }
  }
  private EditorCell createConstant_v6pnhl_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<");
    editorCell.setCellId("Constant_v6pnhl_b0");
    Style style = new StyleImpl();
    new LeftAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_v6pnhl_c0() {
    SingleRoleCellProvider provider = new AbstractContainerType_EditorBuilder_a.elementTypeSingleRoleHandler_v6pnhl_c0(myNode, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), getEditorContext());
    return provider.createCell();
  }
  private static class elementTypeSingleRoleHandler_v6pnhl_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public elementTypeSingleRoleHandler_v6pnhl_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("elementType");
      }
      if (true) {
        editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.ATTRACTS_FOCUS);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_elementType");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no elementType>";
    }
  }
  private EditorCell createConstant_v6pnhl_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ">");
    editorCell.setCellId("Constant_v6pnhl_d0");
    Style style = new StyleImpl();
    new RightAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
