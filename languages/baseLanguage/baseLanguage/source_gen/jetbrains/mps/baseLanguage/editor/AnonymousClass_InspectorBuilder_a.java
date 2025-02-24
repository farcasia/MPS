package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.EditorCell_RefPresentation;
import jetbrains.mps.smodel.action.IReferentPresentationProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class AnonymousClass_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AnonymousClass_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_msf9u8_a_0();
  }

  private EditorCell createCollection_msf9u8_a_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_msf9u8_a_0");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_msf9u8_a0());
    editorCell.addEditorCell(createRefCell_msf9u8_b0());
    return editorCell;
  }
  private EditorCell createConstant_msf9u8_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Constructor:");
    editorCell.setCellId("Constant_msf9u8_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_msf9u8_b0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new AnonymousClass_InspectorBuilder_a.Inline_Builder_msf9u8_a1a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "baseMethodDeclaration");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("constructorDeclaration");
    provider.setNoTargetText("<no constructorDeclaration>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("baseMethodDeclaration");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_msf9u8_a1a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_msf9u8_a1a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createReferencePresentation_msf9u8_a0b0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createReferencePresentation_msf9u8_a0b0() {
      EditorCell_Property editorCell = EditorCell_RefPresentation.create(getEditorContext(), myNode, myReferencingNode, IReferentPresentationProvider.getDefaultPresentation(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")));
      editorCell.setCellId("ReferencePresentation_msf9u8_a0b0");
      return editorCell;
    }
  }
}
