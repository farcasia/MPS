package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class RT_ClassTypeVarialeDeclaration_with_AngleBracker_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(RT_ClassTypeVarialeDeclaration_with_AngleBracker_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public RT_ClassTypeVarialeDeclaration_with_AngleBracker_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_RT_ClassTypeVarialeDeclaration_with_AngleBracker() throws Throwable {
    runTest("jetbrains.mps.editorTest.RT_ClassTypeVarialeDeclaration_with_AngleBracker_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1528454294471609027", "1528454294471625075");
      typeString("<");
    }
  }
}
