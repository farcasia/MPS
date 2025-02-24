package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.EditorUtil;

@MPSLaunch
public class TryCatchStatementUnwrap2_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TryCatchStatementUnwrap2_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public TryCatchStatementUnwrap2_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TryCatchStatementUnwrap2() throws Throwable {
    runTest("jetbrains.mps.editorTest.TryCatchStatementUnwrap2_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("4666906971842279663", "4666906971842279685");
      EditorUtil.runWithTwoStepDeletion(new EditorUtil.EditorTestRunnable() {
        public void run() throws Exception {
          invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
        }
      }, false);
    }
  }
}
