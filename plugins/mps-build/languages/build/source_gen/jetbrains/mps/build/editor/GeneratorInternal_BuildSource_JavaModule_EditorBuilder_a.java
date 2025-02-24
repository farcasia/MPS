package jetbrains.mps.build.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class GeneratorInternal_BuildSource_JavaModule_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public GeneratorInternal_BuildSource_JavaModule_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_zc1akc_a();
  }

  private EditorCell createCollection_zc1akc_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_zc1akc_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createRefCell_zc1akc_a0());
    if (nodeCondition_zc1akc_a1a()) {
      editorCell.addEditorCell(createConstant_zc1akc_b0());
    }
    return editorCell;
  }
  private boolean nodeCondition_zc1akc_a1a() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x44e5dd192e7c0c18L, 0x44e5dd192e7c0c1aL, "targetReexport"));
  }
  private EditorCell createRefCell_zc1akc_a0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new GeneratorInternal_BuildSource_JavaModule_EditorBuilder_a.Inline_Builder_zc1akc_a0a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "targetModule");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull_smartReference(cell);
        return cell;
      }
    };
    provider.setRole("targetModule");
    provider.setNoTargetText("<no targetModule>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("targetModule");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_zc1akc_a0a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_zc1akc_a0a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_zc1akc_a0a0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_zc1akc_a0a0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_zc1akc_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "reexported");
    editorCell.setCellId("Constant_zc1akc_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
