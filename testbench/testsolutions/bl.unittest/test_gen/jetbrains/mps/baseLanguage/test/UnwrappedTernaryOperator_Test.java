package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.test.behavior.INodesTestMethod__BehaviorDescriptor;

@MPSLaunch
public class UnwrappedTernaryOperator_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(UnwrappedTernaryOperator_Test.class, "${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)", false);


  public UnwrappedTernaryOperator_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_NodeTernaryOperatorMustBeCheck818296778600411956() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnwrappedTernaryOperator_Test$TestBody", "test_NodeTernaryOperatorMustBeCheck818296778600411956", true);
  }
  @Test
  public void test_NodeTernaryOperatorMustBeCheck818296778609411375() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnwrappedTernaryOperator_Test$TestBody", "test_NodeTernaryOperatorMustBeCheck818296778609411375", true);
  }
  @Test
  public void test_ErrorMessagesCheck818296778600411854() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnwrappedTernaryOperator_Test$TestBody", "test_ErrorMessagesCheck818296778600411854", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {

    public void test_NodeTernaryOperatorMustBeCheck818296778600411956() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("818296778600411956"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("818296778600403614"));
    }
    public void test_NodeTernaryOperatorMustBeCheck818296778609411375() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("818296778609411375"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("818296778607007111"));
    }
    public void test_ErrorMessagesCheck818296778600411854() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("818296778600411854"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("818296778600378579"));
    }

  }
}
