package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.Padding;
import jetbrains.mps.editor.runtime.style.Measure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftParenAfterNameStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.EditorCell_RefPresentation;
import jetbrains.mps.smodel.action.IReferentPresentationProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightParenStyleClass;

/*package*/ class EnumMemberValueRefExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public EnumMemberValueRefExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_ldpt2z_a();
  }

  private EditorCell createCollection_ldpt2z_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_ldpt2z_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_ldpt2z_a0());
    editorCell.addEditorCell(createConstant_ldpt2z_b0());
    editorCell.addEditorCell(createRefCell_ldpt2z_c0());
    editorCell.addEditorCell(createConstant_ldpt2z_d0());
    editorCell.addEditorCell(createRefCell_ldpt2z_e0());
    editorCell.addEditorCell(createConstant_ldpt2z_f0());
    return editorCell;
  }
  private EditorCell createConstant_ldpt2z_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "enum member value");
    editorCell.setCellId("Constant_ldpt2z_a0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ldpt2z_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "/");
    editorCell.setCellId("Constant_ldpt2z_b0");
    Style style = new StyleImpl();
    new LeftParenAfterNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_ldpt2z_c0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new EnumMemberValueRefExpression_EditorBuilder_a.Inline_Builder_ldpt2z_a2a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "enum");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("enum");
    provider.setNoTargetText("<no enum>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("enum");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_ldpt2z_a2a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_ldpt2z_a2a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_ldpt2z_a0c0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_ldpt2z_a0c0() {
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
  private EditorCell createConstant_ldpt2z_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_ldpt2z_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_ldpt2z_e0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new EnumMemberValueRefExpression_EditorBuilder_a.Inline_Builder_ldpt2z_a4a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "member");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("member");
    provider.setNoTargetText("<no member>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("member");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_ldpt2z_a4a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_ldpt2z_a4a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createReferencePresentation_ldpt2z_a0e0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createReferencePresentation_ldpt2z_a0e0() {
      EditorCell_Property editorCell = EditorCell_RefPresentation.create(getEditorContext(), myNode, myReferencingNode, IReferentPresentationProvider.getDefaultPresentation(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x60c7f83bafd83b5bL, 0x60c7f83bafda1168L, "member")));
      editorCell.setCellId("ReferencePresentation_ldpt2z_a0e0");
      return editorCell;
    }
  }
  private EditorCell createConstant_ldpt2z_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "/");
    editorCell.setCellId("Constant_ldpt2z_f0");
    Style style = new StyleImpl();
    new RightParenStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
