package jetbrains.mps.lang.editor.menus.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.smodel.SNodePointer;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItem;

@MPSLaunch
public class ContributionFromUsedLanguage_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ContributionFromUsedLanguage_Test.class, "${mps_home}", "r:4f8193a2-048e-4ddf-b505-dfca00e8c910(jetbrains.mps.lang.editor.menus.tests@tests)", false);

  public ContributionFromUsedLanguage_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_ContributionFromUsedLanguage() throws Throwable {
    runTest("jetbrains.mps.lang.editor.menus.tests.ContributionFromUsedLanguage_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("3526874291840777615", "");
      UsedLanguagesUtils.assertLanguageUsed(getEditorComponent(), MetaAdapterFactory.getLanguage(0x9b3af7e09a524741L, 0xa75dbecf7e1d5117L, "jetbrains.mps.lang.editor.transformationMenu.testExtendingLanguage"));
      List<TransformationMenuItem> items = MenuLoadingUtils.loadNamedMenu(getEditorComponent(), new SNodePointer("r:3b1c2f8c-f04f-4186-97fc-85ed47ba8aeb(jetbrains.mps.lang.editor.menus.testLanguage.editor)", "3526874291840774961"), "test location");
      Assert.assertEquals(1, ListSequence.fromList(items).count());
      ActionItem item = (ActionItem) ListSequence.fromList(items).getElement(0);
      Assert.assertEquals("action item from used extending language", item.getLabelText(""));
    }
  }
}
