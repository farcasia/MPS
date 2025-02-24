package jetbrains.mps.lang.editor.menus.substitute.tests.tests;

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
public class TestSubstitute_Substitute_ChildWithConstraints_CanBeAncestor_GrandChild_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TestSubstitute_Substitute_ChildWithConstraints_CanBeAncestor_GrandChild_Test.class, "${mps_home}", "r:62873c84-7a76-488a-9b84-4e0ffdbec8db(jetbrains.mps.lang.editor.menus.substitute.tests.tests@tests)", false);

  public TestSubstitute_Substitute_ChildWithConstraints_CanBeAncestor_GrandChild_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TestSubstitute_Substitute_ChildWithConstraints_CanBeAncestor_GrandChild() throws Throwable {
    runTest("jetbrains.mps.lang.editor.menus.substitute.tests.tests.TestSubstitute_Substitute_ChildWithConstraints_CanBeAncestor_GrandChild_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("8289277620556837835", "8289277620556837838");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      Assert.assertTrue(getEditorComponent().getNodeSubstituteChooser().getNumberOfActions() == 1);
      pressKeys(ListSequence.fromListAndArray(new ArrayList<String>(), " ENTER"));
    }
  }
}
