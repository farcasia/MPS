package jetbrains.mps.lang.editor.multiple.testLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;

public class MultipleEditorsTestEditorComponentChild_compact implements ConceptEditorComponent {
  private Collection<String> myContextHints = Arrays.asList(new String[]{"jetbrains.mps.lang.editor.multiple.testLanguage.editor.MultipleEditorTestHints.compact"});
  @NotNull
  public Collection<String> getContextHints() {
    return myContextHints;
  }
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return new MultipleEditorsTestEditorComponentChild_compact_ComponentBuilder_a(editorContext, node).createCell();
  }
}
