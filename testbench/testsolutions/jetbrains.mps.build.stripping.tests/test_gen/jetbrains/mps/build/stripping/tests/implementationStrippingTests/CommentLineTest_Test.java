package jetbrains.mps.build.stripping.tests.implementationStrippingTests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class CommentLineTest_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(CommentLineTest_Test.class, "${mps_home}", "r:a7360bf3-0305-4b0f-a849-53283ec620bf(jetbrains.mps.build.stripping.tests.implementationStrippingTests@tests)", false);

  public CommentLineTest_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_CommentLineTest() throws Throwable {
    runTest("jetbrains.mps.build.stripping.tests.implementationStrippingTests.CommentLineTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5264300948581798080", "5264300948581798087");
      typeString("#foo");
    }
  }
}
