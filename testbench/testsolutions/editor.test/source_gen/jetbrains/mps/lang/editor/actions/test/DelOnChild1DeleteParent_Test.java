package jetbrains.mps.lang.editor.actions.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.EditorUtil;

@MPSLaunch
public class DelOnChild1DeleteParent_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(DelOnChild1DeleteParent_Test.class, "${mps_home}", "r:c44f4b8c-137c-4225-8bd9-38d232a9b736(jetbrains.mps.lang.editor.actions.test)", false);

  public DelOnChild1DeleteParent_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_DelOnChild1DeleteParent() throws Throwable {
    runTest("jetbrains.mps.lang.editor.actions.test.DelOnChild1DeleteParent_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("7803854675610520167", "7803854675610520171");
      EditorUtil.runWithTwoStepDeletion(new EditorUtil.EditorTestRunnable() {
        public void run() throws Exception {
          invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
        }
      }, false);
    }
  }
}
