package jetbrains.mps.lang.editor.cells.transactional.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class RedoTypingInTransactionalPropertyCell_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(RedoTypingInTransactionalPropertyCell_Test.class, "${mps_home}", "r:686abb70-e3f7-4623-b559-272901399ab3(jetbrains.mps.lang.editor.cells.transactional.test)", false);

  public RedoTypingInTransactionalPropertyCell_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_RedoTypingInTransactionalPropertyCell() throws Throwable {
    runTest("jetbrains.mps.lang.editor.cells.transactional.test.RedoTypingInTransactionalPropertyCell_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5931285799429786232", "5931285799429786234");
      typeString("tmpstr");
      invokeAction("$Undo");
      invokeAction("$Redo");

    }
  }
}
