package jetbrains.mps.lang.editor.menus.substitute.tests.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteChooser;
import junit.framework.Assert;
import jetbrains.mps.testbench.util.CachingAppender;
import org.apache.log4j.Priority;

@MPSLaunch
public class TestSubstituteExceptionActionCanSubstitute_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TestSubstituteExceptionActionCanSubstitute_Test.class, "${mps_home}", "r:62873c84-7a76-488a-9b84-4e0ffdbec8db(jetbrains.mps.lang.editor.menus.substitute.tests.tests@tests)", false);

  public TestSubstituteExceptionActionCanSubstitute_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TestSubstituteExceptionActionCanSubstitute() throws Throwable {
    runTest("jetbrains.mps.lang.editor.menus.substitute.tests.tests.TestSubstituteExceptionActionCanSubstitute_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("7153261420283723892", "");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      NodeSubstituteChooser nodeSubstituteChooser = getEditorComponent().getNodeSubstituteChooser();
      Assert.assertTrue(nodeSubstituteChooser.isVisible() && nodeSubstituteChooser.getNumberOfActions() == 1);
    }

    @Override
    protected void populateExpectedEvents(CachingAppender appender) {
      appender.expectEvent(Priority.ERROR_INT, null);
    }
  }
}
