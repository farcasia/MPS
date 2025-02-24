package jetbrains.mps.lang.editor.completion.test;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNodeReference;
import junit.framework.Assert;
import jetbrains.mps.openapi.editor.menus.EditorMenuDescriptor;
import java.util.Objects;

/*package*/ class EditorMenuTraceTestUtil {
  /*package*/ static void checkTraceInfo(EditorMenuTraceInfo editorMenuTraceInfo, SNodeReference sourceToCheckAgainst) {
    Assert.assertTrue(editorMenuTraceInfo != null);
    EditorMenuDescriptor menuDescriptor = editorMenuTraceInfo.getMenuDescriptor();
    Assert.assertTrue(menuDescriptor != null);
    Assert.assertTrue(Objects.equals(menuDescriptor.getSource(), sourceToCheckAgainst));
  }
  /*package*/ static void checkTraceInfoPath(EditorMenuTraceInfo editorMenuTraceInfo, SNodeReference... sourcesToCheckAgainst) {
    Assert.assertTrue(editorMenuTraceInfo != null);
    for (SNodeReference source : sourcesToCheckAgainst) {
      EditorMenuDescriptor menuDescriptor = editorMenuTraceInfo.getMenuDescriptor();
      Assert.assertTrue(menuDescriptor != null);
      Assert.assertTrue(Objects.equals(menuDescriptor.getSource(), source));
      editorMenuTraceInfo = editorMenuTraceInfo.getParent();
    }
    Assert.assertTrue(editorMenuTraceInfo == null);
  }

}
