package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class BooleanConstantDeleteWithParen2_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(BooleanConstantDeleteWithParen2_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public BooleanConstantDeleteWithParen2_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_BooleanConstantDeleteWithParen2() throws Throwable {
    runTest("jetbrains.mps.editorTest.BooleanConstantDeleteWithParen2_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6450120067538814189", "6450120067538814197");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
    }
  }
}
