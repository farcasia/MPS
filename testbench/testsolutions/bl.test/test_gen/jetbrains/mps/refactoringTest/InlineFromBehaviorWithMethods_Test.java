package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.InlineMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class InlineFromBehaviorWithMethods_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(InlineFromBehaviorWithMethods_Test.class, "${mps_home}", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest@tests)", false);


  public InlineFromBehaviorWithMethods_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_InlineFromBehaviorWithMethods() throws Throwable {
    runTest("jetbrains.mps.refactoringTest.InlineFromBehaviorWithMethods_Test$TestBody", "test_InlineFromBehaviorWithMethods", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_InlineFromBehaviorWithMethods() throws Exception {
      addNodeById("1230053040768");
      addNodeById("1230053040816");
      addNodeById("1230053040864");
      addNodeById("1230053040868");
      InlineMethodRefactoring ref = new InlineMethodRefactoring(SNodeOperations.cast(getNodeById("1230053040785"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x1129a43046bL, "Node_ConceptMethodCall"))));
      ref.doRefactor();
      {
        List<SNode> nodesBefore = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("1230053040769"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, "jetbrains.mps.lang.behavior"), 0x11d43447b1aL, "ConceptBehavior"))));
        List<SNode> nodesAfter = ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(getNodeById("1230053040817"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, "jetbrains.mps.lang.behavior"), 0x11d43447b1aL, "ConceptBehavior"))));
        Assert.assertNull("The nodes '" + nodesBefore + "' and '" + nodesAfter + "' do not match!", new NodesMatcher().match(nodesBefore, nodesAfter));
      }
    }


  }
}
