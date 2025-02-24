package jetbrains.mps.lang.editor.table.decTable.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class TypeColumnInDecisionTable_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TypeColumnInDecisionTable_Test.class, "${mps_home}", "r:c09cbf74-c0bb-4531-bd9d-ade611acf77c(jetbrains.mps.lang.editor.table.decTable.test@tests)", false);

  public TypeColumnInDecisionTable_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TypeColumnInDecisionTable() throws Throwable {
    runTest("jetbrains.mps.lang.editor.table.decTable.test.TypeColumnInDecisionTable_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("7976451618609826520", "5177493460314239335");
      typeString("1");

    }
  }
}
