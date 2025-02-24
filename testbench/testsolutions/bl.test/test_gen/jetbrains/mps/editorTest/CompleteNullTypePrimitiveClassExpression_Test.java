package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import junit.framework.Assert;

@MPSLaunch
public class CompleteNullTypePrimitiveClassExpression_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(CompleteNullTypePrimitiveClassExpression_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public CompleteNullTypePrimitiveClassExpression_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_CompleteNullTypePrimitiveClassExpression() throws Throwable {
    runTest("jetbrains.mps.editorTest.CompleteNullTypePrimitiveClassExpression_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("3048587904660599263", "3048587904660599265");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      typeString("nullType.class");
      Assert.assertTrue(getEditorComponent().getNodeSubstituteChooser().getNumberOfActions() == 0);
    }
  }
}
