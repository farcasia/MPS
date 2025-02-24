package jetbrains.mps.lang.editor.table.stateMachine.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class TabNavigationToEmptyCell_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TabNavigationToEmptyCell_Test.class, "${mps_home}", "r:dc1400b5-0aa4-448e-8f15-11fb0ccb5c23(jetbrains.mps.lang.editor.table.stateMachine.test@tests)", false);

  public TabNavigationToEmptyCell_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TabNavigationToEmptyCell() throws Throwable {
    runTest("jetbrains.mps.lang.editor.table.stateMachine.test.TabNavigationToEmptyCell_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("3152271290514981437", "3152271290514981463");
      pressKeys(ListSequence.fromListAndArray(new ArrayList<String>(), " TAB"));
    }
  }
}
