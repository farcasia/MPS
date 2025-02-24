package jetbrains.mps.lang.editor.completion.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class CompleteDotCamelCase_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(CompleteDotCamelCase_Test.class, "${mps_home}", "r:f27d9626-8ef5-4cba-bce0-6aa6369f05ff(jetbrains.mps.lang.editor.completion.test)", false);

  public CompleteDotCamelCase_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_CompleteDotCamelCase() throws Throwable {
    runTest("jetbrains.mps.lang.editor.completion.test.CompleteDotCamelCase_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("787021975296625134", "787021975296625136");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      typeString("stDot");
      Assert.assertTrue(getEditorComponent().getNodeSubstituteChooser().isVisible() && getEditorComponent().getNodeSubstituteChooser().getNumberOfActions() == 1);
      pressKeys(ListSequence.fromListAndArray(new ArrayList<String>(), " ENTER"));
    }
  }
}
