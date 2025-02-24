package jetbrains.mps.lang.editor.table.editor;

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
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.borderedCollectionStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.borderedStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

/*package*/ class CellModel_HierarchycalTable_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CellModel_HierarchycalTable_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_cqolwn_a();
  }

  private EditorCell createCollection_cqolwn_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_cqolwn_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(createCollection_cqolwn_a0());
    editorCell.addEditorCell(createCollection_cqolwn_b0());
    return editorCell;
  }
  private EditorCell createCollection_cqolwn_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqolwn_a0");
    Style style = new StyleImpl();
    new borderedCollectionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqolwn_a0a());
    editorCell.addEditorCell(createCollection_cqolwn_b0a());
    return editorCell;
  }
  private EditorCell createConstant_cqolwn_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_cqolwn_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqolwn_b0a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqolwn_b0a");
    Style style = new StyleImpl();
    new borderedCollectionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqolwn_a1a0());
    editorCell.addEditorCell(createRefCell_cqolwn_b1a0());
    editorCell.addEditorCell(createConstant_cqolwn_c1a0());
    return editorCell;
  }
  private EditorCell createConstant_cqolwn_a1a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_a1a0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_cqolwn_b1a0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new CellModel_HierarchycalTable_EditorBuilder_a.Inline_Builder_cqolwn_a1b0a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "headerRowLinkDeclaration");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };
    provider.setRole("headerRowLinkDeclaration");
    provider.setNoTargetText("<no headerRowLinkDeclaration>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("headerRowLinkDeclaration");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_cqolwn_a1b0a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_cqolwn_a1b0a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_cqolwn_a0b1a0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_cqolwn_a0b1a0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_role");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_cqolwn_c1a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_c1a0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqolwn_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqolwn_b0");
    Style style = new StyleImpl();
    new borderedCollectionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_cqolwn_a1a());
    editorCell.addEditorCell(createCollection_cqolwn_b1a());
    return editorCell;
  }
  private EditorCell createCollection_cqolwn_a1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqolwn_a1a");
    Style style = new StyleImpl();
    new borderedCollectionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqolwn_a0b0());
    editorCell.addEditorCell(createRefCell_cqolwn_b0b0());
    editorCell.addEditorCell(createConstant_cqolwn_c0b0());
    return editorCell;
  }
  private EditorCell createConstant_cqolwn_a0b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_a0b0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_cqolwn_b0b0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new CellModel_HierarchycalTable_EditorBuilder_a.Inline_Builder_cqolwn_a1a1a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "rowsLinkDeclaration");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("rowsLinkDeclaration");
    provider.setNoTargetText("<no rowsLinkDeclaration>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("rowsLinkDeclaration");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_cqolwn_a1a1a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_cqolwn_a1a1a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_cqolwn_a0b0b0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_cqolwn_a0b0b0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_role_1");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_cqolwn_c0b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_c0b0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqolwn_b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqolwn_b1a");
    Style style = new StyleImpl();
    new borderedCollectionStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqolwn_a1b0());
    editorCell.addEditorCell(createRefCell_cqolwn_b1b0());
    editorCell.addEditorCell(createConstant_cqolwn_c1b0());
    return editorCell;
  }
  private EditorCell createConstant_cqolwn_a1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_a1b0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_cqolwn_b1b0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new CellModel_HierarchycalTable_EditorBuilder_a.Inline_Builder_cqolwn_a1b1a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "cellsInRowLinkDeclaration");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("cellsInRowLinkDeclaration");
    provider.setNoTargetText("<no cellsInRowLinkDeclaration>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("cellsInRowLinkDeclaration");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_cqolwn_a1b1a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_cqolwn_a1b1a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_cqolwn_a0b1b0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_cqolwn_a0b1b0() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_role_2");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_cqolwn_c1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "%");
    editorCell.setCellId("Constant_cqolwn_c1b0");
    Style style = new StyleImpl();
    new borderedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
