package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction__BehaviorDescriptor;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;

/*package*/ class ConceptFunction_InspectorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ConceptFunction_InspectorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCustom_qilpva_a();
  }

  private EditorCell createCustom_qilpva_a() {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<AbstractCellProvider>() {
      public AbstractCellProvider invoke() {
        return new AbstractCellProvider(myNode) {
          @Override
          public EditorCell createEditorCell(EditorContext context) {
            EditorCell_Collection collection = jetbrains.mps.nodeEditor.cells.EditorCell_Collection.createVertical(context, myNode);
            collection.addEditorCell(new EditorCell_Constant(context, myNode, "Concept function help:"));
            if (SConceptOperations.shortDescription(SNodeOperations.getConcept(myNode)) != null) {
              collection.addEditorCell(new EditorCell_Constant(context, myNode, SConceptOperations.shortDescription(SNodeOperations.getConcept(myNode))));
            }
            collection.addEditorCell(new EditorCell_Constant(context, myNode, ""));
            collection.addEditorCell(new EditorCell_Constant(context, myNode, "Parameter help:"));
            for (SConcept cfp : ConceptFunction__BehaviorDescriptor.getParameterConcepts_id2xELmDxyi2v.invoke(myNode)) {
              String alias = SConceptOperations.conceptAlias(cfp);
              String description = SConceptOperations.shortDescription(cfp);
              if (description == null) {
                description = "<no help. use conceptShortDescription concept function property to create one>";
              }
              EditorCell_Constant message = new EditorCell_Constant(context, myNode, alias + " : " + description);
              collection.addEditorCell(message);
            }
            return collection;
          }
        };
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("Custom_qilpva_a");
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, getNode());
    if (bigCell != null) {
      bigCell.setBig(true);
      bigCell.setCellContext(getCellFactory().getCellContext());
    }
    return editorCell;
  }
}
