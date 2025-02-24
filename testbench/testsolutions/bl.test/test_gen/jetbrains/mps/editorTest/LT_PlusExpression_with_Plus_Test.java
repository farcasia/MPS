package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class LT_PlusExpression_with_Plus_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(LT_PlusExpression_with_Plus_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public LT_PlusExpression_with_Plus_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_LT_PlusExpression_with_Plus() throws Throwable {
    runTest("jetbrains.mps.editorTest.LT_PlusExpression_with_Plus_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1413941122942931504", "1413941122942931506");
      typeString("+ ");
    }
  }
}
