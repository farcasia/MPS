package jetbrains.mps.make.script.editor;

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
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class QueryDefinition_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public QueryDefinition_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_egantk_a();
  }

  private EditorCell createCollection_egantk_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_egantk_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_egantk_a0());
    editorCell.addEditorCell(createCollection_egantk_b0());
    editorCell.addEditorCell(createCollection_egantk_c0());
    editorCell.addEditorCell(createCollection_egantk_d0());
    return editorCell;
  }
  private EditorCell createProperty_egantk_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
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
  private EditorCell createCollection_egantk_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_egantk_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_egantk_a1a());
    editorCell.addEditorCell(createRefNode_egantk_b1a());
    return editorCell;
  }
  private EditorCell createConstant_egantk_a1a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "with title");
    editorCell.setCellId("Constant_egantk_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_egantk_b1a() {
    SingleRoleCellProvider provider = new QueryDefinition_EditorBuilder_a.titleSingleRoleHandler_egantk_b1a(myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x3354875940086e32L, "title"), getEditorContext());
    return provider.createCell();
  }
  private static class titleSingleRoleHandler_egantk_b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public titleSingleRoleHandler_egantk_b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x3354875940086e32L, "title"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x3354875940086e32L, "title"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x3354875940086e32L, "title"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("title");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x3354875940086e32L, "title")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_title");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no title>";
    }
  }
  private EditorCell createCollection_egantk_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_egantk_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_egantk_a2a());
    editorCell.addEditorCell(createRefNode_egantk_b2a());
    return editorCell;
  }
  private EditorCell createConstant_egantk_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "display");
    editorCell.setCellId("Constant_egantk_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_egantk_b2a() {
    SingleRoleCellProvider provider = new QueryDefinition_EditorBuilder_a.presentationSingleRoleHandler_egantk_b2a(myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc589f7L, "presentation"), getEditorContext());
    return provider.createCell();
  }
  private static class presentationSingleRoleHandler_egantk_b2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public presentationSingleRoleHandler_egantk_b2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc589f7L, "presentation"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc589f7L, "presentation"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc589f7L, "presentation"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("presentation");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc589f7L, "presentation")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_presentation");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no presentation>";
    }
  }
  private EditorCell createCollection_egantk_d0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_egantk_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_egantk_a3a());
    editorCell.addEditorCell(createRefNode_egantk_b3a());
    return editorCell;
  }
  private EditorCell createConstant_egantk_a3a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "expect");
    editorCell.setCellId("Constant_egantk_a3a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_egantk_b3a() {
    SingleRoleCellProvider provider = new QueryDefinition_EditorBuilder_a.expectedSingleRoleHandler_egantk_b3a(myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc4d7c4L, "expected"), getEditorContext());
    return provider.createCell();
  }
  private static class expectedSingleRoleHandler_egantk_b3a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public expectedSingleRoleHandler_egantk_b3a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc4d7c4L, "expected"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc4d7c4L, "expected"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc4d7c4L, "expected"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("expected");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL, 0x70276038dc4d7c4L, "expected")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_expected");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no expected>";
    }
  }
}
