package jetbrains.mps.build.mps.runner.editor;

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
import jetbrains.mps.build.editor.buildStyles_StyleSheet.projectPartKeywordStyleClass;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.EditorCell_RefPresentation;
import jetbrains.mps.smodel.action.IReferentPresentationProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.mps.runner.behavior.BuildSolutionRunnerAspect__BehaviorDescriptor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

/*package*/ class BuildSolutionRunnerAspect_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public BuildSolutionRunnerAspect_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_xi87ym_a();
  }

  private EditorCell createCollection_xi87ym_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_xi87ym_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_xi87ym_a0());
    editorCell.addEditorCell(createCollection_xi87ym_b0());
    return editorCell;
  }
  private EditorCell createConstant_xi87ym_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "run code from solution");
    editorCell.setCellId("Constant_xi87ym_a0");
    Style style = new StyleImpl();
    new projectPartKeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_xi87ym_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_xi87ym_b0");
    editorCell.addEditorCell(createRefCell_xi87ym_a1a());
    editorCell.addEditorCell(createReadOnlyModelAccessor_xi87ym_b1a());
    return editorCell;
  }
  private EditorCell createRefCell_xi87ym_a1a() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new BuildSolutionRunnerAspect_EditorBuilder_a.Inline_Builder_xi87ym_a0b0(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "solution");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setRole("solution");
    provider.setNoTargetText("<no solution>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("solution");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_xi87ym_a0b0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_xi87ym_a0b0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createReferencePresentation_xi87ym_a0a1a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createReferencePresentation_xi87ym_a0a1a() {
      EditorCell_Property editorCell = EditorCell_RefPresentation.create(getEditorContext(), myNode, myReferencingNode, IReferentPresentationProvider.getDefaultPresentation(MetaAdapterFactory.getReferenceLink(0x427a473d5177432cL, 0x9905bcbceb71b996L, 0x39ea87a41cc0827eL, 0x54b085b5945c6691L, "solution")));
      editorCell.setCellId("ReferencePresentation_xi87ym_a0a1a");
      return editorCell;
    }
  }
  private EditorCell createReadOnlyModelAccessor_xi87ym_b1a() {
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new ModelAccessor() {
      public String getText() {
        return (((SLinkOperations.getTarget(myNode, MetaAdapterFactory.getReferenceLink(0x427a473d5177432cL, 0x9905bcbceb71b996L, 0x39ea87a41cc0827eL, 0x54b085b5945c6691L, "solution")) != null) ? BuildSolutionRunnerAspect__BehaviorDescriptor.getFQClassName_id1aYLt$9eyUg.invoke(myNode) + "." + BuildSolutionRunnerAspect__BehaviorDescriptor.getMethodName_id1aYLt$9dX0a.invoke(myNode) + "()" : "<not available>"));
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_xi87ym_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
