package jetbrains.mps.lang.editor.actions.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class Comment_EditInsideComment_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(Comment_EditInsideComment_Test.class, "${mps_home}", "r:c44f4b8c-137c-4225-8bd9-38d232a9b736(jetbrains.mps.lang.editor.actions.test)", false);

  public Comment_EditInsideComment_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_Comment_EditInsideComment() throws Throwable {
    runTest("jetbrains.mps.lang.editor.actions.test.Comment_EditInsideComment_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("4247887444754064722", "4247887444754068827");
      typeString("return 1");
    }
  }
}
