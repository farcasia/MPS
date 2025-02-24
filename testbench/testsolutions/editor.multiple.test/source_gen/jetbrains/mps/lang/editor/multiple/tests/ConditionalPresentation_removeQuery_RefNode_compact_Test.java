package jetbrains.mps.lang.editor.multiple.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class ConditionalPresentation_removeQuery_RefNode_compact_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ConditionalPresentation_removeQuery_RefNode_compact_Test.class, "${mps_home}", "r:dbab6746-af91-4594-857e-d38a36667e17(jetbrains.mps.lang.editor.multiple.tests)", false);

  public ConditionalPresentation_removeQuery_RefNode_compact_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_ConditionalPresentation_removeQuery_RefNode_compact() throws Throwable {
    runTest("jetbrains.mps.lang.editor.multiple.tests.ConditionalPresentation_removeQuery_RefNode_compact_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1947450138886995496", "1947450138886995514");
      typeString("propValue");
    }
  }
}
