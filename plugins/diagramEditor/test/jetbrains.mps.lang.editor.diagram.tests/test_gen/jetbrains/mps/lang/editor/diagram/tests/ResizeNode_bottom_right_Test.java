package jetbrains.mps.lang.editor.diagram.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import java.awt.Component;
import java.awt.event.MouseEvent;

@MPSLaunch
public class ResizeNode_bottom_right_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ResizeNode_bottom_right_Test.class, "${mps_home}", "r:e41d7e03-7ef3-4161-a48a-e48d8152e422(jetbrains.mps.lang.editor.diagram.tests@tests)", false);

  public ResizeNode_bottom_right_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_ResizeNode_bottom_right() throws Throwable {
    runTest("jetbrains.mps.lang.editor.diagram.tests.ResizeNode_bottom_right_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1030067674862347895", "1030067674862347898");
      {
        int x_rlzz6g_a0 = 91;
        int y_rlzz6g_a0 = 91;
        Component eventTargetComponent_rlzz6g_a0 = processMouseEvent(x_rlzz6g_a0, y_rlzz6g_a0, MouseEvent.MOUSE_PRESSED);
        processSecondaryMouseEvent(eventTargetComponent_rlzz6g_a0, x_rlzz6g_a0 = 86, y_rlzz6g_a0 = 106, MouseEvent.MOUSE_DRAGGED);
        processSecondaryMouseEvent(eventTargetComponent_rlzz6g_a0, x_rlzz6g_a0, y_rlzz6g_a0, MouseEvent.MOUSE_RELEASED);
      }
    }
  }
}
