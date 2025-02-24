package jetbrains.mps.lang.editor.editor;

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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import java.util.function.Function;
import jetbrains.mps.smodel.action.NodeSubstituteActionWrapper;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.nodeEditor.menus.EditorMenuTraceInfoImpl;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import java.util.stream.Collectors;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.lang.sharedConcepts.editor.SharedStyles_StyleSheet.ReferenceOnConceptStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;

/*package*/ class CellActionMapDeclaration_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CellActionMapDeclaration_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_dnk0aj_a();
  }

  private EditorCell createCollection_dnk0aj_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_dnk0aj_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createCollection_dnk0aj_a0());
    editorCell.addEditorCell(createConstant_dnk0aj_b0());
    editorCell.addEditorCell(createCollection_dnk0aj_c0());
    editorCell.addEditorCell(createConstant_dnk0aj_d0());
    editorCell.addEditorCell(createConstant_dnk0aj_e0());
    editorCell.addEditorCell(createConstant_dnk0aj_f0());
    editorCell.addEditorCell(createRefNodeList_dnk0aj_g0());
    return editorCell;
  }
  private EditorCell createCollection_dnk0aj_a0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_dnk0aj_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_dnk0aj_a0a());
    editorCell.addEditorCell(createProperty_dnk0aj_b0a());
    return editorCell;
  }
  private EditorCell createConstant_dnk0aj_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "action map");
    editorCell.setCellId("Constant_dnk0aj_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_dnk0aj_b0a() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), provider.getCellContext(), new SubstituteInfoPartExt[]{new CellActionMapDeclaration_EditorBuilder_a.CellActionMapDeclaration_name_cellMenu_dnk0aj_a0b0a(), new SChildSubstituteInfoPartEx(editorCell)}));
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  public static class CellActionMapDeclaration_name_cellMenu_dnk0aj_a0b0a extends AbstractCellMenuPart_PropertyValues {
    public CellActionMapDeclaration_name_cellMenu_dnk0aj_a0b0a() {
    }
    @Override
    public List<SubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      List<SubstituteAction> actions = super.createActions(cellContext, editorContext);
      Function<SubstituteAction, SubstituteAction> mapper = new Function<SubstituteAction, SubstituteAction>() {
        public SubstituteAction apply(SubstituteAction action) {
          return new NodeSubstituteActionWrapper(action) {
            @Override
            public EditorMenuTraceInfo getEditorMenuTraceInfo() {
              EditorMenuTraceInfoImpl result = new EditorMenuTraceInfoImpl();
              result.setDescriptor(new EditorMenuDescriptorBase("property postfix values", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1185873717405")));
              return result;
            }
          };
        }
      };
      return actions.stream().map(mapper).collect(Collectors.toList());
    }

    public List<String> getPropertyValues(SNode node, IOperationContext operationContext, EditorContext editorContext) {
      List<String> names = ListSequence.fromList(new ArrayList<String>());
      if ((SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10951978cfeL, 0x10951978d00L, "applicableConcept")) != null)) {
        ListSequence.fromList(names).addElement(SPropertyOperations.getString(SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10951978cfeL, 0x10951978d00L, "applicableConcept")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_Actions");
      }
      return names;
    }
  }
  private EditorCell createConstant_dnk0aj_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_dnk0aj_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_dnk0aj_c0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_dnk0aj_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_dnk0aj_a2a());
    editorCell.addEditorCell(createRefCell_dnk0aj_b2a());
    return editorCell;
  }
  private EditorCell createConstant_dnk0aj_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "applicable concept:");
    editorCell.setCellId("Constant_dnk0aj_a2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_dnk0aj_b2a() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, final SNode effectiveNode, SNode node) {
        EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
          public EditorCell compute() {
            return new CellActionMapDeclaration_EditorBuilder_a.Inline_Builder_dnk0aj_a1c0(getEditorContext(), myNode, effectiveNode).createCell();
          }
        }, effectiveNode, "applicableConcept");
        CellUtil.setupIDeprecatableStyles(effectiveNode, cell);
        setSemanticNodeToCells(cell, myNode);
        installDeleteActions_nullable_reference(cell);
        return cell;
      }
    };
    provider.setRole("applicableConcept");
    provider.setNoTargetText("<any>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("applicableConcept");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder_dnk0aj_a1c0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder_dnk0aj_a1c0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createProperty_dnk0aj_a0b2a();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createProperty_dnk0aj_a0b2a() {
      CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(getEditorContext());
      editorCell.setCellId("property_name_1");
      Style style = new StyleImpl();
      new ReferenceOnConceptStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
      style.set(StyleAttributes.DRAW_BORDER, true);
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_dnk0aj_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_dnk0aj_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_dnk0aj_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "actions:");
    editorCell.setCellId("Constant_dnk0aj_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_dnk0aj_f0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_dnk0aj_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_dnk0aj_g0() {
    AbstractCellListHandler handler = new CellActionMapDeclaration_EditorBuilder_a.itemListHandler_dnk0aj_g0(myNode, "item", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_item");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class itemListHandler_dnk0aj_g0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public itemListHandler_dnk0aj_g0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x109519879e9L, "jetbrains.mps.lang.editor.structure.CellActionMapItem"), null, getNode(), getNode().getModel());
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(itemListHandler_dnk0aj_g0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10951978cfeL, 0x10951978d01L, "item")));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    public void installElementCellActions(SNode elementNode, EditorCell elementCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10951978cfeL, 0x10951978d01L, "item"), elementNode));
        }
      }
    }
  }
}
