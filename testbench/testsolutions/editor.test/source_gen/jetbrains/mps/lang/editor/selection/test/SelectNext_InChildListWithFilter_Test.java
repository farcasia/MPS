package jetbrains.mps.lang.editor.selection.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class SelectNext_InChildListWithFilter_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(SelectNext_InChildListWithFilter_Test.class, "${mps_home}", "r:f429894b-858b-4e34-87ae-2cfe2a061928(jetbrains.mps.lang.editor.selection.test)", false);

  public SelectNext_InChildListWithFilter_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_SelectNext_InChildListWithFilter() throws Throwable {
    runTest("jetbrains.mps.lang.editor.selection.test.SelectNext_InChildListWithFilter_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("6132666365585678264", "6132666365585680692");
      invokeAction("jetbrains.mps.ide.editor.actions.SelectNext_Action");
    }
  }
}
