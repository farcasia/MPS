package jetbrains.mps.lang.editor.label.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class LabelWithBrackets_RemoveText_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(LabelWithBrackets_RemoveText_Test.class, "${mps_home}", "r:40a702b4-7737-42f4-8412-0355208396f3(jetbrains.mps.lang.editor.label.tests)", false);

  public LabelWithBrackets_RemoveText_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_LabelWithBrackets_RemoveText() throws Throwable {
    runTest("jetbrains.mps.lang.editor.label.tests.LabelWithBrackets_RemoveText_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6546125805699762593", "6546125805699762595");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Backspace_Action");
    }
  }
}
