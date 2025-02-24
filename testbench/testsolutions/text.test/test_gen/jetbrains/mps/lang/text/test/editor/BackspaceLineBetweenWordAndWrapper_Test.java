package jetbrains.mps.lang.text.test.editor;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class BackspaceLineBetweenWordAndWrapper_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(BackspaceLineBetweenWordAndWrapper_Test.class, "${mps_home}", "r:6cf522f1-8af4-45dd-b0f5-721b6e5caab5(jetbrains.mps.lang.text.test.editor@tests)", false);

  public BackspaceLineBetweenWordAndWrapper_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_BackspaceLineBetweenWordAndWrapper() throws Throwable {
    runTest("jetbrains.mps.lang.text.test.editor.BackspaceLineBetweenWordAndWrapper_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6328114375522040984", "6328114375522040995");
      invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
    }
  }
}
