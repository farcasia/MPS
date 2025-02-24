package jetbrains.mps.lang.editor.tableTests.editor;

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
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.table.runtime.TableModelFactory;
import jetbrains.mps.lang.editor.table.runtime.TableModel;
import jetbrains.mps.lang.editor.table.runtime.XYCTableModel;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.table.runtime.EditorCell_Table;

/*package*/ class Matrix_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Matrix_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_io08np_a();
  }

  private EditorCell createCollection_io08np_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_io08np_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_io08np_a0());
    editorCell.addEditorCell(createProperty_io08np_b0());
    editorCell.addEditorCell(createTable_io08np_c0());
    return editorCell;
  }
  private EditorCell createConstant_io08np_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Matrix");
    editorCell.setCellId("Constant_io08np_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD_ITALIC);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_io08np_b0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createTable_io08np_c0() {
    TableModelFactory creator = new TableModelFactory() {
      public TableModel createTableModel() {
        return new XYCTableModel(myNode, MetaAdapterFactory.getContainmentLink(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23e4590L, 0x3cc6bd99e23f0931L, "xs"), MetaAdapterFactory.getContainmentLink(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23e4590L, 0x3cc6bd99e23f0932L, "ys"), MetaAdapterFactory.getContainmentLink(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23e4590L, 0x3cc6bd99e23f0933L, "contents"), getEditorContext());
      }
    };
    jetbrains.mps.openapi.editor.cells.EditorCell_Collection editorCell = EditorCell_Table.createTable(getEditorContext(), myNode, creator.createTableModel(), "Table_io08np_c0");
    editorCell.setCellId("Table_io08np_c0_0");
    return editorCell;
  }
}
