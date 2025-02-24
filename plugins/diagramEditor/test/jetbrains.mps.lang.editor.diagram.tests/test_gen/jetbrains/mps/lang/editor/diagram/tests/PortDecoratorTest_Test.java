package jetbrains.mps.lang.editor.diagram.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.jetpad.mapper.Mapper;
import jetbrains.mps.nodeEditor.cells.jetpad.PortCell;
import junit.framework.Assert;
import jetbrains.mps.lang.editor.diagram.runtime.jetpad.views.PortDecoratorView;
import jetbrains.jetpad.projectional.view.View;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.nodeEditor.cells.jetpad.JetpadUtils;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.editor.diagram.runtime.jetpad.views.SelectionFrameView;

@MPSLaunch
public class PortDecoratorTest_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(PortDecoratorTest_Test.class, "${mps_home}", "r:e41d7e03-7ef3-4161-a48a-e48d8152e422(jetbrains.mps.lang.editor.diagram.tests@tests)", false);

  public PortDecoratorTest_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_PortDecoratorTest() throws Throwable {
    runTest("jetbrains.mps.lang.editor.diagram.tests.PortDecoratorTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1560508619094015368", "1560508619094015372");
      final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          node.value = SNodeOperations.cast(getNodeById("1560508619094050075"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x50560c9658e49c5L, 0xb8e79e4db4c7e97fL, "jetbrains.mps.lang.editor.diagram.testLanguage"), 0x4ce40ecaf41f71f2L, "InputPort")));
        }
      });

      Mapper descendantMapper;
      descendantMapper = DecoratorTestRunner.prepareAndGetMapper(node.value, getEditorComponent(), PortCell.class);

      Assert.assertTrue(descendantMapper != null);
      Assert.assertTrue(descendantMapper.getTarget() != null);
      Assert.assertTrue(descendantMapper.getTarget() instanceof PortDecoratorView);
      PortDecoratorView portDecoratorView = ((PortDecoratorView) descendantMapper.getTarget());
      Assert.assertTrue(portDecoratorView.hasError.get());
      View errorView = Sequence.fromIterable(JetpadUtils.getAllChildren(portDecoratorView)).findFirst(new IWhereFilter<View>() {
        public boolean accept(View it) {
          return it instanceof SelectionFrameView;
        }
      });
      Assert.assertTrue(errorView != null);
      Assert.assertTrue(errorView.visible().get());


    }
  }
}
