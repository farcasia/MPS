package jetbrains.mps.build.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;

public class GeneratorInternal_IWorkflowParticipantReference_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return new GeneratorInternal_IWorkflowParticipantReference_EditorBuilder_a(editorContext, node).createCell();
  }
}
