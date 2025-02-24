package jetbrains.mps.lang.editor.folding.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class ManuallyExpandedCell_UnrelatedModelChange_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ManuallyExpandedCell_UnrelatedModelChange_Test.class, "${mps_home}", "r:0204c664-b836-4137-bb87-42caecd8a4e3(jetbrains.mps.lang.editor.folding.test)", false);

  public ManuallyExpandedCell_UnrelatedModelChange_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_ManuallyExpandedCell_UnrelatedModelChange() throws Throwable {
    runTest("jetbrains.mps.lang.editor.folding.test.ManuallyExpandedCell_UnrelatedModelChange_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("175447375140054074", "175447375140054097");
      invokeAction("jetbrains.mps.ide.editor.actions.Expand_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveUp_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveUp_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveUp_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.Insert_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveDown_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveDown_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveDown_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveDown_Action");
    }
  }
}
