package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.EditorUtil;
import junit.framework.Assert;

@MPSLaunch
public class DeleteIncompleteMemberFinalKeywordTwoStep_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(DeleteIncompleteMemberFinalKeywordTwoStep_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public DeleteIncompleteMemberFinalKeywordTwoStep_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_DeleteIncompleteMemberFinalKeywordTwoStep() throws Throwable {
    runTest("jetbrains.mps.editorTest.DeleteIncompleteMemberFinalKeywordTwoStep_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5758795788990888972", "5758795788990888977");
      EditorUtil.runWithTwoStepDeletion(new EditorUtil.EditorTestRunnable() {
        public void run() throws Exception {
          invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
          Assert.assertTrue(getEditorComponent().getDeletionApprover().isApprovedForDeletion(getEditorComponent().getSelectedCell()));
          invokeAction("jetbrains.mps.ide.editor.actions.Delete_Action");
        }
      }, true);
    }
  }
}
