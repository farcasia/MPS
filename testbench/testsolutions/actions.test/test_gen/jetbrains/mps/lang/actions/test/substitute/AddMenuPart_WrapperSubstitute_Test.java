package jetbrains.mps.lang.actions.test.substitute;

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
public class AddMenuPart_WrapperSubstitute_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(AddMenuPart_WrapperSubstitute_Test.class, "${mps_home}", "r:0d47ccef-2a97-4a7c-8ede-5adeaac0a5a7(jetbrains.mps.lang.actions.test.substitute@tests)", false);

  public AddMenuPart_WrapperSubstitute_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_AddMenuPart_WrapperSubstitute() throws Throwable {
    runTest("jetbrains.mps.lang.actions.test.substitute.AddMenuPart_WrapperSubstitute_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5164819300892650549", "2747974755163732990");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      pressKeys(ListSequence.fromListAndArray(new ArrayList<String>(), " ENTER"));
    }
  }
}
