package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class MoveInManyStatementsContainerDown_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(MoveInManyStatementsContainerDown_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public MoveInManyStatementsContainerDown_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_MoveInManyStatementsContainerDown() throws Throwable {
    runTest("jetbrains.mps.editorTest.MoveInManyStatementsContainerDown_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5938462602860138176", "5938462602860138191");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveElementsDown_Action");
    }
  }
}
