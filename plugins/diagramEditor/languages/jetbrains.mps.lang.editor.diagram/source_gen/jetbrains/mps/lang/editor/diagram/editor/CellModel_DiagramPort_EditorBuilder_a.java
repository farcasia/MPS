package jetbrains.mps.lang.editor.diagram.editor;

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
import jetbrains.mps.lang.editor.editor.Styles_StyleSheet.rootCellModelStyleStyleClass;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
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
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

/*package*/ class CellModel_DiagramPort_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public CellModel_DiagramPort_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_inwiug_a();
  }

  private EditorCell createCollection_inwiug_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_inwiug_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    new rootCellModelStyleStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createAlternation_inwiug_a0());
    editorCell.addEditorCell(createConstant_inwiug_b0());
    return editorCell;
  }
  private EditorCell createAlternation_inwiug_a0() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_inwiug_a0a();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createConstant_inwiug_a0a();
    } else {
      editorCell = createConstant_inwiug_a0a_0();
    }
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), new BasicCellContext(myNode), new SubstituteInfoPartExt[]{new CellModel_DiagramPort_EditorBuilder_a.CellModel_DiagramPort_generic_cellMenu_inwiug_a0a0(), new CellModel_DiagramPort_EditorBuilder_a.CellModel_DiagramPort_generic_cellMenu_inwiug_b0a0(), new SChildSubstituteInfoPartEx(editorCell)}));
    return editorCell;
  }
  private boolean nodeCondition_inwiug_a0a() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x3f6e840fd120282L, 0x3f6e840fd12753fL, "input"));
  }
  public static class CellModel_DiagramPort_generic_cellMenu_inwiug_a0a0 extends AbstractCellMenuPart_Generic_Item {
    public CellModel_DiagramPort_generic_cellMenu_inwiug_a0a0() {
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
              result.setDescriptor(new EditorMenuDescriptorBase("generic item", new SNodePointer("r:bb92ee7f-8413-44e2-a971-e49f27dd2af5(jetbrains.mps.lang.editor.diagram.editor)", "675321057241822895")));
              return result;
            }
          };
        }
      };
      return actions.stream().map(mapper).collect(Collectors.toList());
    }

    public void handleAction(SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x3f6e840fd120282L, 0x3f6e840fd12753fL, "input"), "" + (true));
    }
    public String getMatchingText() {
      return "input";
    }
  }
  public static class CellModel_DiagramPort_generic_cellMenu_inwiug_b0a0 extends AbstractCellMenuPart_Generic_Item {
    public CellModel_DiagramPort_generic_cellMenu_inwiug_b0a0() {
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
              result.setDescriptor(new EditorMenuDescriptorBase("generic item", new SNodePointer("r:bb92ee7f-8413-44e2-a971-e49f27dd2af5(jetbrains.mps.lang.editor.diagram.editor)", "675321057241832158")));
              return result;
            }
          };
        }
      };
      return actions.stream().map(mapper).collect(Collectors.toList());
    }

    public void handleAction(SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x3f6e840fd120282L, 0x3f6e840fd12753fL, "input"), "" + (false));
    }
    public String getMatchingText() {
      return "output";
    }
  }
  private EditorCell createConstant_inwiug_a0a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "input");
    editorCell.setCellId("Constant_inwiug_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_inwiug_a0a_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "output");
    editorCell.setCellId("Constant_inwiug_a0a_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_inwiug_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "port");
    editorCell.setCellId("Constant_inwiug_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
