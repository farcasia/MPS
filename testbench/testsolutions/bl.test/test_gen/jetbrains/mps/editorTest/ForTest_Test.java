package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import junit.framework.Assert;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class ForTest_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ForTest_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public ForTest_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_ForTest() throws Throwable {
    runTest("jetbrains.mps.editorTest.ForTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1230058635796", "");
      typeString("for ");
      Assert.assertTrue(((EditorComponent) getEditor().getCurrentEditorComponent()).getNodeSubstituteChooser().isVisible());
    }
  }
}
