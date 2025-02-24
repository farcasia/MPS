package jetbrains.mps.lang.editor.diagram.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.diagram.behavior.FigureParameterMapping__BehaviorDescriptor;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.editor.diagram.behavior.AbstractFigureReference__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.openapi.editor.menus.EditorMenuDescriptor;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class FigureParameterMapping_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public FigureParameterMapping_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_3uf681_a();
  }

  private EditorCell createCollection_3uf681_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_3uf681_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_3uf681_a0());
    editorCell.addEditorCell(createConstant_3uf681_b0());
    editorCell.addEditorCell(createRefNode_3uf681_c0());
    return editorCell;
  }
  private EditorCell createProperty_3uf681_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_3uf681_a0a0());
    style.set(StyleAttributes.AUTO_DELETABLE, true);
    editorCell.getStyle().putAll(style);
    FigureParameterMappingName_Actions.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), provider.getCellContext(), new SubstituteInfoPartExt[]{new FigureParameterMapping_EditorBuilder_a.FigureParameterMapping_generic_cellMenu_3uf681_a0a0(), new SChildSubstituteInfoPartEx(editorCell)}));
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private SNode _StyleParameter_QueryFunction_3uf681_a0a0() {
    return (SNode) FigureParameterMapping__BehaviorDescriptor.getParameterDeclaration_id3$rM_t_1zAw.invoke(getNode());
  }
  public static class FigureParameterMapping_generic_cellMenu_3uf681_a0a0 extends AbstractCellMenuPart_Generic_Group {
    public FigureParameterMapping_generic_cellMenu_3uf681_a0a0() {
    }

    public List<?> createParameterObjects(SNode node, IOperationContext operationContext, EditorContext editorContext) {
      return (List<String>) AbstractFigureReference__BehaviorDescriptor.getFigureParameterNames_id1iN4mn3lWCq.invoke(SLinkOperations.getTarget(FigureParameterMapping__BehaviorDescriptor.getDiagramNodeCell_id1iN4mn3k5m3.invoke(node), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a326e1L, 0xf301bf106a329d9L, "figure")));
    }
    protected void handleAction(Object parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((String) parameterObject, node, model, operationContext, editorContext);
    }
    public void handleAction_impl(String parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), parameterObject);
    }
    public boolean isReferentPresentation() {
      return false;
    }

    @Override
    protected EditorMenuDescriptor getEditorMenuDescriptor(Object parameterObject) {
      return new EditorMenuDescriptorBase("generic group with parameter: " + ((parameterObject == null ? "null" : parameterObject.toString())), new SNodePointer("r:bb92ee7f-8413-44e2-a971-e49f27dd2af5(jetbrains.mps.lang.editor.diagram.editor)", "1491555030356413376"));
    }
  }
  private EditorCell createConstant_3uf681_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_3uf681_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.MATCHING_LABEL, "body-paren");
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_3uf681_c0() {
    SingleRoleCellProvider provider = new FigureParameterMapping_EditorBuilder_a.argumentSingleRoleHandler_3uf681_c0(myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a7d7c7L, 0x3f6e840fdd824ddL, "argument"), getEditorContext());
    return provider.createCell();
  }
  private static class argumentSingleRoleHandler_3uf681_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public argumentSingleRoleHandler_3uf681_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a7d7c7L, 0x3f6e840fdd824ddL, "argument"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a7d7c7L, 0x3f6e840fdd824ddL, "argument"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a7d7c7L, 0x3f6e840fdd824ddL, "argument"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("argument");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a7d7c7L, 0x3f6e840fdd824ddL, "argument")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_argument");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no argument>";
    }
  }
}
