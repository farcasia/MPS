package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MoveStaticMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class SimpleMoveMethod_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(SimpleMoveMethod_Test.class, "${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)", false);


  public SimpleMoveMethod_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_check() throws Throwable {
    runTest("jetbrains.mps.refactoringTest.SimpleMoveMethod_Test$TestBody", "test_check", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_check() throws Exception {
      addNodeById("1230053302711");
      addNodeById("1230053302720");
      addNodeById("1230053302724");
      addNodeById("1230053302728");
      MoveStaticMethodRefactoring ref = new MoveStaticMethodRefactoring(SNodeOperations.cast(getNodeById("1230053302713"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf0aL, "StaticMethodDeclaration"))), SNodeOperations.cast(getNodeById("1230053302721"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
      ref.doRefactoring();
      {
        List<SNode> nodesBefore = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("1230053302712"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))), SNodeOperations.cast(getNodeById("1230053302721"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
        List<SNode> nodesAfter = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("1230053302725"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))), SNodeOperations.cast(getNodeById("1230053302729"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
        Assert.assertNull("The nodes '" + nodesBefore + "' and '" + nodesAfter + "' do not match!", new NodesMatcher().match(nodesBefore, nodesAfter));
      }
    }


  }
}
