package jetbrains.mps.lang.actions.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.FirstLevelStyleClass;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

/*package*/ class SimpleSideTransformMenuPart_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public SimpleSideTransformMenuPart_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_cqa5bf_a();
  }

  private EditorCell createCollection_cqa5bf_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_cqa5bf_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_cqa5bf_a0());
    editorCell.addEditorCell(createCollection_cqa5bf_b0());
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqa5bf_a0a());
    return editorCell;
  }
  private EditorCell createConstant_cqa5bf_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "simple item");
    editorCell.setCellId("Constant_cqa5bf_a0a");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a1a());
    editorCell.addEditorCell(createCollection_cqa5bf_b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_cqa5bf_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqa5bf_a1b0());
    editorCell.addEditorCell(createCollection_cqa5bf_b1b0());
    editorCell.addEditorCell(createConstant_cqa5bf_c1b0());
    editorCell.addEditorCell(createCollection_cqa5bf_d1b0());
    if (nodeCondition_cqa5bf_a4b1a()) {
      editorCell.addEditorCell(createCollection_cqa5bf_e1b0());
    }
    editorCell.addEditorCell(createConstant_cqa5bf_f1b0());
    editorCell.addEditorCell(createCollection_cqa5bf_g1b0());
    editorCell.addEditorCell(createConstant_cqa5bf_h1b0());
    editorCell.addEditorCell(createCollection_cqa5bf_i1b0());
    editorCell.addEditorCell(createConstant_cqa5bf_j1b0());
    editorCell.addEditorCell(createCollection_cqa5bf_k1b0());
    return editorCell;
  }
  private boolean nodeCondition_cqa5bf_a4b1a() {
    return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon"))).isNotEmpty();
  }
  private EditorCell createConstant_cqa5bf_a1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "matching text");
    editorCell.setCellId("Constant_cqa5bf_a1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_b1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_b1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a1b1a());
    editorCell.addEditorCell(createRefNode_cqa5bf_b1b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a1b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b1b1a() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.matchingTextSingleRoleHandler_cqa5bf_b1b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c25a2L, "matchingText"), getEditorContext());
    return provider.createCell();
  }
  private static class matchingTextSingleRoleHandler_cqa5bf_b1b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public matchingTextSingleRoleHandler_cqa5bf_b1b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c25a2L, "matchingText"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c25a2L, "matchingText"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c25a2L, "matchingText"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("matchingText");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c25a2L, "matchingText")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_matchingText");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createConstant_cqa5bf_c1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "description text");
    editorCell.setCellId("Constant_cqa5bf_c1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_d1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_d1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a3b1a());
    editorCell.addEditorCell(createRefNode_cqa5bf_b3b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a3b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b3b1a() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.descriptionTextSingleRoleHandler_cqa5bf_b3b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c6389L, "descriptionText"), getEditorContext());
    return provider.createCell();
  }
  private static class descriptionTextSingleRoleHandler_cqa5bf_b3b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public descriptionTextSingleRoleHandler_cqa5bf_b3b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c6389L, "descriptionText"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c6389L, "descriptionText"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c6389L, "descriptionText"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("descriptionText");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285c6389L, "descriptionText")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_descriptionText");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createCollection_cqa5bf_e1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_cqa5bf_e1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createCollection_cqa5bf_a4b1a());
    editorCell.addEditorCell(createCollection_cqa5bf_b4b1a());
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_a4b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_a4b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_cqa5bf_a0e1b0());
    editorCell.addEditorCell(createConstant_cqa5bf_b0e1b0());
    return editorCell;
  }
  private EditorCell createConstant_cqa5bf_a0e1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "deprecated");
    editorCell.setCellId("Constant_cqa5bf_a0e1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.red));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_cqa5bf_b0e1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "icon");
    editorCell.setCellId("Constant_cqa5bf_b0e1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_b4b1a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_b4b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a1e1b0());
    editorCell.addEditorCell(createRefNode_cqa5bf_b1e1b0());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a1e1b0() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b1e1b0() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.iconSingleRoleHandler_cqa5bf_b1e1b0(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon"), getEditorContext());
    return provider.createCell();
  }
  private static class iconSingleRoleHandler_cqa5bf_b1e1b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public iconSingleRoleHandler_cqa5bf_b1e1b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("icon");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x1181cc8b9c7L, "icon")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_icon");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createConstant_cqa5bf_f1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "icon node");
    editorCell.setCellId("Constant_cqa5bf_f1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_g1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_g1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a6b1a());
    editorCell.addEditorCell(createRefNode_cqa5bf_b6b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a6b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b6b1a() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.iconNodeSingleRoleHandler_cqa5bf_b6b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x47e1d8e05151140eL, "iconNode"), getEditorContext());
    return provider.createCell();
  }
  private static class iconNodeSingleRoleHandler_cqa5bf_b6b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public iconNodeSingleRoleHandler_cqa5bf_b6b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x47e1d8e05151140eL, "iconNode"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x47e1d8e05151140eL, "iconNode"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x47e1d8e05151140eL, "iconNode"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("iconNode");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x47e1d8e05151140eL, "iconNode")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_iconNode");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createConstant_cqa5bf_h1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "type");
    editorCell.setCellId("Constant_cqa5bf_h1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_i1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_i1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a8b1a());
    editorCell.addEditorCell(createRefNode_cqa5bf_b8b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a8b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b8b1a() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.actionTypeSingleRoleHandler_cqa5bf_b8b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122837a3cdL, 0x11e73a4bf93L, "actionType"), getEditorContext());
    return provider.createCell();
  }
  private static class actionTypeSingleRoleHandler_cqa5bf_b8b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public actionTypeSingleRoleHandler_cqa5bf_b8b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122837a3cdL, 0x11e73a4bf93L, "actionType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122837a3cdL, 0x11e73a4bf93L, "actionType"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122837a3cdL, 0x11e73a4bf93L, "actionType"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("actionType");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122837a3cdL, 0x11e73a4bf93L, "actionType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_actionType");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<default>";
    }
  }
  private EditorCell createConstant_cqa5bf_j1b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "do transform");
    editorCell.setCellId("Constant_cqa5bf_j1b0");
    Style style = new StyleImpl();
    new FirstLevelStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_cqa5bf_k1b0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_cqa5bf_k1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createIndentCell_cqa5bf_a01b1a());
    editorCell.addEditorCell(createRefNode_cqa5bf_b01b1a());
    return editorCell;
  }
  private EditorCell createIndentCell_cqa5bf_a01b1a() {
    EditorCell_Indent editorCell = new EditorCell_Indent(getEditorContext(), myNode);
    return editorCell;
  }
  private EditorCell createRefNode_cqa5bf_b01b1a() {
    SingleRoleCellProvider provider = new SimpleSideTransformMenuPart_EditorBuilder_a.handlerSingleRoleHandler_cqa5bf_b01b1a(myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285cc498L, "handler"), getEditorContext());
    return provider.createCell();
  }
  private static class handlerSingleRoleHandler_cqa5bf_b01b1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public handlerSingleRoleHandler_cqa5bf_b01b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285cc498L, "handler"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285cc498L, "handler"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285cc498L, "handler"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("handler");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x1122859d0ecL, 0x112285cc498L, "handler")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_handler");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<none>";
    }
  }
}
