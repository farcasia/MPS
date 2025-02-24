package jetbrains.mps.baseLanguage.unitTest.execution.server;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.test.behavior.TestInfo__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase__BehaviorDescriptor;

/**
 * Check a node of an ITestNodeWrapper and if it's not suitable for in-process execution, replace original request with a failing one.
 */
/*package*/ class InProcessExecutionFilter {

  public void check(ITestNodeWrapper testNodeWrapper, SNode testNode) throws Exception {
    SNode rootNode = SNodeOperations.getContainingRoot(testNode);

    if (!(SNodeOperations.isInstanceOf(testNode, MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b08a01119L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestable")))) {
      throw new Exception("The test concept must be an instance on ITestable concept. Test " + testNodeWrapper.getName() + " is ignored.");
    }
    if ((boolean) TestInfo__BehaviorDescriptor.reOpenProject_idThWTaQhG7P.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x46bca02bfb6e730aL, "jetbrains.mps.lang.test.structure.TestInfo")), SNodeOperations.getModel(rootNode))) {
      throw new Exception("The project properties given in the TestInfo file is impossible to set in-process. Test " + testNodeWrapper.getName() + " is ignored.");
    }
    if (SNodeOperations.isInstanceOf(testNode, MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))) {
      if (!((boolean) ITestCase__BehaviorDescriptor.canRunInProcess_id5_jSk8paieB.invoke(SNodeOperations.cast(testNode, MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))))) {
        throw new Exception("The test is set not to be executed in-process. Test " + testNodeWrapper.getName() + " is ignored.");
      }
    }
    // cannot run (in-process) test methods from TestCase, which is not executable in the same process 
    if (SNodeOperations.isInstanceOf(rootNode, MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))) {
      if (!((boolean) ITestCase__BehaviorDescriptor.canRunInProcess_id5_jSk8paieB.invoke(SNodeOperations.cast(rootNode, MetaAdapterFactory.getInterfaceConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))))) {
        if (SNodeOperations.isInstanceOf(rootNode, MetaAdapterFactory.getConcept(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L, "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase"))) {
          throw new Exception("The test " + testNodeWrapper.getName() + " is BTestCase which is not executed in-process. It is ignored for now.");
        } else {
          throw new Exception("The test is set not to be executed in-process. Test " + testNodeWrapper.getName() + " is ignored.");
        }
      }
    }
  }
}
