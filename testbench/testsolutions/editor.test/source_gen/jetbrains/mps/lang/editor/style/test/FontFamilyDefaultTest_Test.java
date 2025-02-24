package jetbrains.mps.lang.editor.style.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.CellFinderUtil;
import junit.framework.Assert;
import jetbrains.mps.nodeEditor.EditorSettings;

@MPSLaunch
public class FontFamilyDefaultTest_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(FontFamilyDefaultTest_Test.class, "${mps_home}", "r:e796bc79-24a8-4433-8903-c71c59526bf7(jetbrains.mps.lang.editor.style.test)", false);

  public FontFamilyDefaultTest_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_FontFamilyDefaultTest() throws Throwable {
    runTest("jetbrains.mps.lang.editor.style.test.FontFamilyDefaultTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1157549163016324766", "");
      EditorCell_Label label = CellFinderUtil.findChildByClass(getEditorComponent().getSelectedCell(), EditorCell_Label.class, true, true);
      Assert.assertEquals(EditorSettings.getInstance().getFontFamily(), label.getFont().getFamily());
    }
  }
}
