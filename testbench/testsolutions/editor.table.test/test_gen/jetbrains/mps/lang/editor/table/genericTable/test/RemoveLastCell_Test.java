package jetbrains.mps.lang.editor.table.genericTable.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class RemoveLastCell_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(RemoveLastCell_Test.class, "${mps_home}", "r:e02ee75b-0624-4ff2-b4d9-d2277a157ff4(jetbrains.mps.lang.editor.table.genericTable.test@tests)", false);

  public RemoveLastCell_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_RemoveLastCell() throws Throwable {
    runTest("jetbrains.mps.lang.editor.table.genericTable.test.RemoveLastCell_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6610030841081007205", "8626146371984912334");
      invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
    }
  }
}
