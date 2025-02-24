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
public class UnusedLocalVariableDeclaration_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(UnusedLocalVariableDeclaration_Test.class, "${mps_home}", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test@tests)", false);


  public UnusedLocalVariableDeclaration_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_NodeVariableInitializerIsRedundantWarningCheck215889526509545817() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_NodeVariableInitializerIsRedundantWarningCheck215889526509545817", true);
  }
  @Test
  public void test_NodeUnusedLocalVariableCheck215889526509546049() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_NodeUnusedLocalVariableCheck215889526509546049", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509545709() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509545709", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509546687() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509546687", true);
  }
  @Test
  public void test_NodeVariableInitializerIsRedundantWarningCheck215889526509553873() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_NodeVariableInitializerIsRedundantWarningCheck215889526509553873", true);
  }
  @Test
  public void test_NodeUnusedLocalVariableCheck215889526509554611() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_NodeUnusedLocalVariableCheck215889526509554611", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509553154() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509553154", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509562440() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509562440", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509562472() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509562472", true);
  }
  @Test
  public void test_ErrorMessagesCheck215889526509563288() throws Throwable {
    runTest("jetbrains.mps.baseLanguage.test.UnusedLocalVariableDeclaration_Test$TestBody", "test_ErrorMessagesCheck215889526509563288", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {

    public void test_NodeVariableInitializerIsRedundantWarningCheck215889526509545817() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509545817"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509544986"));
    }
    public void test_NodeUnusedLocalVariableCheck215889526509546049() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509546049"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509544939"));
    }
    public void test_ErrorMessagesCheck215889526509545709() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509545709"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509543990"));
    }
    public void test_ErrorMessagesCheck215889526509546687() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509546687"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509545003"));
    }
    public void test_NodeVariableInitializerIsRedundantWarningCheck215889526509553873() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509553873"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509545053"));
    }
    public void test_NodeUnusedLocalVariableCheck215889526509554611() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509554611"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509545051"));
    }
    public void test_ErrorMessagesCheck215889526509553154() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509553154"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509545045"));
    }
    public void test_ErrorMessagesCheck215889526509562440() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509562440"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509545096"));
    }
    public void test_ErrorMessagesCheck215889526509562472() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509562472"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509562450"));
    }
    public void test_ErrorMessagesCheck215889526509563288() throws Exception {
      SNode operation = SNodeOperations.cast(getRealNodeById("215889526509563288"), MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x1510445f8a2c272dL, "jetbrains.mps.lang.test.structure.INodesTestMethod"));
      INodesTestMethod__BehaviorDescriptor.perform_id1kgh5YabdhC.invoke(operation, getRealNodeById("215889526509563266"));
    }

  }
}
