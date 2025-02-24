package jetbrains.mps.lang.script.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.SecondLevelStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.EditorCell_RefPresentation;
import jetbrains.mps.smodel.action.IReferentPresentationProvider;

/*package*/ class PullUpMethod_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public PullUpMethod_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_errt5h_a();
  }

  private EditorCell createCollection_errt5h_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_errt5h_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createComponent_errt5h_a0());
    editorCell.addEditorCell(createRefNode_errt5h_b0());
    editorCell.addEditorCell(createConstant_errt5h_c0());
    editorCell.addEditorCell(createRefCell_errt5h_d0());
    return editorCell;
  }
  private EditorCell createComponent_errt5h_a0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    new SecondLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createRefNode_errt5h_b0() {
    SingleRoleCellProvider provider = new PullUpMethod_EditorBuilder_a.oldMethodSpecificationSingleRoleHandler_errt5h_b0(myNode, MetaAdapterFactory.getContainmentLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x4243146ba1b41281L, "oldMethodSpecification"), getEditorContext());
    return provider.createCell();
  }
  private static class oldMethodSpecificationSingleRoleHandler_errt5h_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public oldMethodSpecificationSingleRoleHandler_errt5h_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x4243146ba1b41281L, "oldMethodSpecification"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x4243146ba1b41281L, "oldMethodSpecification"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x4243146ba1b41281L, "oldMethodSpecification"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("oldMethodSpecification");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x4243146ba1b41281L, "oldMethodSpecification")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_oldMethodSpecification");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "";
    }
  }
  private EditorCell createConstant_errt5h_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "->");
    editorCell.setCellId("Constant_errt5h_c0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_errt5h_d0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new PullUpMethod_EditorBuilder_a.Inline_Builder_errt5h_a3a(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "newMethodDeclaration");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };
    provider.setRole("newMethodDeclaration");
    provider.setNoTargetText("");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("newMethodDeclaration");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_errt5h_a3a extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_errt5h_a3a(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createReferencePresentation_errt5h_a0d0();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createReferencePresentation_errt5h_a0d0() {
      EditorCell_Property editorCell = EditorCell_RefPresentation.create(getEditorContext(), myNode, myReferencingNode, IReferentPresentationProvider.getDefaultPresentation(MetaAdapterFactory.getReferenceLink(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L, 0x3ae1f3a73b9e55daL, "newMethodDeclaration")));
      editorCell.setCellId("ReferencePresentation_errt5h_a0d0");
      return editorCell;
    }
  }
}
