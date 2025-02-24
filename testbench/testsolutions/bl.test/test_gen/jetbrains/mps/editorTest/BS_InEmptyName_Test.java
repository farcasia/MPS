package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class BS_InEmptyName_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(BS_InEmptyName_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public BS_InEmptyName_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_BS_InEmptyName() throws Throwable {
    runTest("jetbrains.mps.editorTest.BS_InEmptyName_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("3737056097455998572", "3737056097455998579");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
    }
  }
}
