package jetbrains.mps.lang.editor.selection.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class CustomSelectAll_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(CustomSelectAll_Test.class, "${mps_home}", "r:f429894b-858b-4e34-87ae-2cfe2a061928(jetbrains.mps.lang.editor.selection.test)", false);

  public CustomSelectAll_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_CustomSelectAll() throws Throwable {
    runTest("jetbrains.mps.lang.editor.selection.test.CustomSelectAll_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1830938190578875294", "1830938190578881954");
      invokeAction("jetbrains.mps.ide.editor.actions.SelectAll_Action");
    }
  }
}
