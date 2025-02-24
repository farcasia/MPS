package jetbrains.mps.baseLanguage.javadoc.editor;

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
import jetbrains.mps.baseLanguage.javadoc.editor.DocumentationCommentStyleSheet_StyleSheet.CommentTagStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

/*package*/ class ThrowsBlockDocTag_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ThrowsBlockDocTag_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_fp467p_a();
  }

  private EditorCell createCollection_fp467p_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_fp467p_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_fp467p_a0());
    editorCell.addEditorCell(createRefNode_fp467p_b0());
    editorCell.addEditorCell(createProperty_fp467p_c0());
    return editorCell;
  }
  private EditorCell createConstant_fp467p_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "@throws");
    editorCell.setCellId("Constant_fp467p_a0");
    Style style = new StyleImpl();
    new CommentTagStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    DeleteDocTag.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_fp467p_b0() {
    SingleRoleCellProvider provider = new ThrowsBlockDocTag_EditorBuilder_a.exceptionTypeSingleRoleHandler_fp467p_b0(myNode, MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, 0x5ed0d79d7dbd76f9L, "exceptionType"), getEditorContext());
    return provider.createCell();
  }
  private static class exceptionTypeSingleRoleHandler_fp467p_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public exceptionTypeSingleRoleHandler_fp467p_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, 0x5ed0d79d7dbd76f9L, "exceptionType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, 0x5ed0d79d7dbd76f9L, "exceptionType"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, 0x5ed0d79d7dbd76f9L, "exceptionType"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("exceptionType");
      }
      DeleteDocTag.setCellActions(editorCell, getNode(), getEditorContext());
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f68704ec270L, 0x5ed0d79d7dbd76f9L, "exceptionType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_exceptionType");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no exceptionType>";
    }
  }
  private EditorCell createProperty_fp467p_c0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_text");
    DeleteDocTag.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
