package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ConvertAnonymousRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class ConvertAnonymousWithLocalVariables_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ConvertAnonymousWithLocalVariables_Test.class, "${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)", false);


  public ConvertAnonymousWithLocalVariables_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_AbstractClassTest() throws Throwable {
    runTest("jetbrains.mps.refactoringTest.ConvertAnonymousWithLocalVariables_Test$TestBody", "test_AbstractClassTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_AbstractClassTest() throws Exception {
      addNodeById("3109730807963748197");
      addNodeById("3109730807963748238");
      new ConvertAnonymousRefactoring(SNodeOperations.cast(getNodeById("3109730807963748209"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x1107e0cb103L, "AnonymousClass"))), "MyComparable").doRefactor();
      {
        List<SNode> nodesBefore = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("3109730807963748198"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
        List<SNode> nodesAfter = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("3109730807963748251"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
        Assert.assertNull("The nodes '" + nodesBefore + "' and '" + nodesAfter + "' do not match!", new NodesMatcher().match(nodesBefore, nodesAfter));
      }
    }


  }
}
