package jetbrains.mps.editor.runtime.style;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;

public interface ParametersInformation<T> {
  Iterable<T> getMethods(SNode node, EditorContext editorContext);
  void getStyledMethodPresentation(SNode node, EditorContext editorContext, T method, StyledTextPrinter printer);
  boolean isMethodCurrent(SNode node, EditorContext editorContext, T method);
}
