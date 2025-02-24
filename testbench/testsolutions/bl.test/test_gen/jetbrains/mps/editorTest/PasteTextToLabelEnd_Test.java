package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class PasteTextToLabelEnd_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(PasteTextToLabelEnd_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public PasteTextToLabelEnd_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_PasteTextToLabelEnd() throws Throwable {
    runTest("jetbrains.mps.editorTest.PasteTextToLabelEnd_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("7591654183801450341", "7591654183801450354");
      invokeAction("$Copy");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveDown_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.End_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveLeft_Action");
      invokeAction("$Paste");
    }
  }
}
