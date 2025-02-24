package jetbrains.mps.lang.editor.table.stateMachine.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class CreateTransition_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(CreateTransition_Test.class, "${mps_home}", "r:dc1400b5-0aa4-448e-8f15-11fb0ccb5c23(jetbrains.mps.lang.editor.table.stateMachine.test@tests)", false);

  public CreateTransition_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_CreateTransition() throws Throwable {
    runTest("jetbrains.mps.lang.editor.table.stateMachine.test.CreateTransition_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("8017670888383389087", "8207994269122295113");
      invokeAction("jetbrains.mps.ide.editor.actions.Insert_Action");
    }
  }
}
