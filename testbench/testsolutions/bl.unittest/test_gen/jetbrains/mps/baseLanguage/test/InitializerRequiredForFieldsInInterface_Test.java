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
public class InitializerRequiredForFieldsInInterface_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(InitializerRequiredForFieldsInInterface_Test.class, "${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)", false);


  public InitializerRequiredForFieldsInInterface_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_NodeErrorCheck1187415722613141596() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.InitializerRequiredForFieldsInInterface_Test$TestBody", "test_NodeErrorCheck1187415722613141596", true);
  }
  @Test
  public void test_NodeErrorCheck1187415722613794413() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.InitializerRequiredForFieldsInInterface_Test$TestBody", "test_NodeErrorCheck1187415722613794413", true);
  }
  @Test
  public void test_ErrorMessagesCheck1187415722601361320() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.InitializerRequiredForFieldsInInterface_Test$TestBody", "test_ErrorMessagesCheck1187415722601361320", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {

    public void test_NodeErrorCheck1187415722613141596() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("1187415722613141596"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("1187415722601275233"));
    }
    public void test_NodeErrorCheck1187415722613794413() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("1187415722613794413"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("1187415722613751356"));
    }
    public void test_ErrorMessagesCheck1187415722601361320() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("1187415722601361320"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("1187415722601196320"));
    }

  }
}
