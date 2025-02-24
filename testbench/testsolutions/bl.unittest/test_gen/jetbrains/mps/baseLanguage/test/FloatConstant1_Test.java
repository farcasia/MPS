package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class FloatConstant1_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(FloatConstant1_Test.class, "${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)", false);

  public FloatConstant1_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_FloatConstant1() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.FloatConstant1_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5868639094267617185", "5868639094267617192");
      typeString("-1.56754E9f");
    }
  }
}
