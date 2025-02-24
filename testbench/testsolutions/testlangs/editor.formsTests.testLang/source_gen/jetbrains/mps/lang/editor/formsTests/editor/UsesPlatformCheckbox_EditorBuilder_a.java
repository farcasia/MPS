package jetbrains.mps.lang.editor.formsTests.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.nodeEditor.cells.EditorCell_Image;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class UsesPlatformCheckbox_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public UsesPlatformCheckbox_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_7xa7wl_a();
  }

  private EditorCell createCollection_7xa7wl_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_7xa7wl_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Checkbox_ActionMap_7xa7wl_a.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.addKeyMap(new Checkbox_KeyMap_7xa7wl_a());
    editorCell.addEditorCell(createAlternation_7xa7wl_a0());
    editorCell.addEditorCell(createConstant_7xa7wl_b0());
    return editorCell;
  }
  private EditorCell createAlternation_7xa7wl_a0() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_7xa7wl_a0a();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createImage_7xa7wl_a0a();
    } else {
      editorCell = createImage_7xa7wl_a0a_0();
    }
    return editorCell;
  }
  private boolean nodeCondition_7xa7wl_a0a() {
    return SPropertyOperations.getBoolean(myNode, MetaAdapterFactory.getProperty(0xafb9a5fdbc5d4169L, 0xa22542d8823d623aL, 0x61552ecc953bf2a9L, 0x61552ecc953bf2aaL, "property"));
  }
  private EditorCell createImage_7xa7wl_a0a() {
    SModule imageModule;
    String imagePath;
    {
      Tuples._2<SModule, String> _tmp_ad0ig9_a0c0l = (new _FunctionTypes._return_P0_E0<Tuples._2<SModule, String>>() {
        public Tuples._2<SModule, String> invoke() {
          return MultiTuple.<SModule,String>from(ModuleRepositoryFacade.getInstance().getModule(PersistenceFacade.getInstance().createModuleReference("90966cb5-4f67-429a-b7ba-d0fded4ede71(jetbrains.mps.lang.editor.forms.runtime)")), "${module}/icons/checkBoxSelected.png");
        }
      }).invoke();
      imageModule = _tmp_ad0ig9_a0c0l._0();
      imagePath = _tmp_ad0ig9_a0c0l._1();
    }
    EditorCell_Image editorCell = EditorCell_Image.createImageCell(getEditorContext(), myNode, imageModule, imagePath);
    editorCell.setCellId("Image_7xa7wl_a0a");
    editorCell.setDescent(-1);
    return editorCell;
  }
  private EditorCell createImage_7xa7wl_a0a_0() {
    SModule imageModule;
    String imagePath;
    {
      Tuples._2<SModule, String> _tmp_ad0ig9_a0c0m = (new _FunctionTypes._return_P0_E0<Tuples._2<SModule, String>>() {
        public Tuples._2<SModule, String> invoke() {
          return MultiTuple.<SModule,String>from(ModuleRepositoryFacade.getInstance().getModule(PersistenceFacade.getInstance().createModuleReference("90966cb5-4f67-429a-b7ba-d0fded4ede71(jetbrains.mps.lang.editor.forms.runtime)")), "${module}/icons/checkBox.png");
        }
      }).invoke();
      imageModule = _tmp_ad0ig9_a0c0m._0();
      imagePath = _tmp_ad0ig9_a0c0m._1();
    }
    EditorCell_Image editorCell = EditorCell_Image.createImageCell(getEditorContext(), myNode, imageModule, imagePath);
    editorCell.setCellId("Image_7xa7wl_a0a_0");
    editorCell.setDescent(-1);
    return editorCell;
  }
  private EditorCell createConstant_7xa7wl_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "the label");
    editorCell.setCellId("Constant_7xa7wl_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
