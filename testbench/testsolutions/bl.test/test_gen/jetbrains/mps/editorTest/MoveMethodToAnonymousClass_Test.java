package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class MoveMethodToAnonymousClass_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(MoveMethodToAnonymousClass_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public MoveMethodToAnonymousClass_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_MoveMethodToAnonymousClass() throws Throwable {
    runTest("jetbrains.mps.editorTest.MoveMethodToAnonymousClass_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("9046977500687661865", "9046977500687737714");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveElementsDown_Action");
    }
  }
}
