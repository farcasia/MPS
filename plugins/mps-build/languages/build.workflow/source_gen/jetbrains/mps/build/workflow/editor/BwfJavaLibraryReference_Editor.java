package jetbrains.mps.build.workflow.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;

public class BwfJavaLibraryReference_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return new BwfJavaLibraryReference_EditorBuilder_a(editorContext, node).createCell();
  }
}
