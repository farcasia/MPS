package jetbrains.mps.build.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

/*package*/ class GeneratorInternal_BuildSource_Folder_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public GeneratorInternal_BuildSource_Folder_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_yjbxlo_a();
  }

  private EditorCell createCollection_yjbxlo_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_yjbxlo_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_yjbxlo_a0());
    editorCell.addEditorCell(createProperty_yjbxlo_b0());
    return editorCell;
  }
  private EditorCell createConstant_yjbxlo_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "folder");
    editorCell.setCellId("Constant_yjbxlo_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_yjbxlo_b0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("folderName");
    provider.setNoTargetText("<no folderName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_folderName");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
