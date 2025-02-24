package jetbrains.mps.lang.editor.table.genericTable.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class InsertRowBefore_FromFirstCell_ByIns_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(InsertRowBefore_FromFirstCell_ByIns_Test.class, "${mps_home}", "r:e02ee75b-0624-4ff2-b4d9-d2277a157ff4(jetbrains.mps.lang.editor.table.genericTable.test@tests)", false);

  public InsertRowBefore_FromFirstCell_ByIns_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_InsertRowBefore_FromFirstCell_ByIns() throws Throwable {
    runTest("jetbrains.mps.lang.editor.table.genericTable.test.InsertRowBefore_FromFirstCell_ByIns_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5481602834662762304", "5481602834662762326");
      invokeAction("jetbrains.mps.ide.editor.actions.InsertBefore_Action");
    }
  }
}
