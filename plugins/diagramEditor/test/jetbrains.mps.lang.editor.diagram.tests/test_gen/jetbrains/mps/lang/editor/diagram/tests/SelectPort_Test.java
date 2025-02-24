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
public class SelectPort_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(SelectPort_Test.class, "${mps_home}", "r:e41d7e03-7ef3-4161-a48a-e48d8152e422(jetbrains.mps.lang.editor.diagram.tests@tests)", false);

  public SelectPort_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_SelectPort() throws Throwable {
    runTest("jetbrains.mps.lang.editor.diagram.tests.SelectPort_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("2278461409091538799", "2278461409091538806");
      {
        int x_2sfs2m_a0 = 87;
        int y_2sfs2m_a0 = 42;
        Component eventTargetComponent_2sfs2m_a0 = processMouseEvent(x_2sfs2m_a0, y_2sfs2m_a0, MouseEvent.MOUSE_PRESSED);
        processSecondaryMouseEvent(eventTargetComponent_2sfs2m_a0, x_2sfs2m_a0, y_2sfs2m_a0, MouseEvent.MOUSE_RELEASED);
        processSecondaryMouseEvent(eventTargetComponent_2sfs2m_a0, x_2sfs2m_a0, y_2sfs2m_a0, MouseEvent.MOUSE_CLICKED);
      }
    }
  }
}
