package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import junit.framework.Assert;

@MPSLaunch
public class TryingToLeftTransformNewExpression_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TryingToLeftTransformNewExpression_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public TryingToLeftTransformNewExpression_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TryingToLeftTransformNewExpression() throws Throwable {
    runTest("jetbrains.mps.editorTest.TryingToLeftTransformNewExpression_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("2907839077756812217", "2907839077756812221");
      typeString(" ");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      Assert.assertTrue(getEditorComponent().getNodeSubstituteChooser().isVisible());
      getEditorComponent().getNodeSubstituteChooser().setVisible(false);
      invokeAction("jetbrains.mps.ide.editor.actions.MoveUp_Action");
    }
  }
}
