package jetbrains.mps.lang.editor.style.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import junit.framework.Assert;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

@MPSLaunch
public class StyleAttributeUnapplyTest_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(StyleAttributeUnapplyTest_Test.class, "${mps_home}", "r:e796bc79-24a8-4433-8903-c71c59526bf7(jetbrains.mps.lang.editor.style.test)", false);

  public StyleAttributeUnapplyTest_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_StyleAttributeUnapplyTest() throws Throwable {
    runTest("jetbrains.mps.lang.editor.style.test.StyleAttributeUnapplyTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("23293207023100753", "");
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          SNode root = SNodeOperations.cast(getEditorComponent().getEditedNode(), MetaAdapterFactory.getConcept(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, "jetbrains.mps.lang.editor.styleTests.structure.NodeContainer"));
          SNode leaf = ListSequence.fromList(SLinkOperations.getChildren(root, MetaAdapterFactory.getContainmentLink(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, 0x74e28664f05605aeL, "node"))).getElement(0);
          SNode priority = ListSequence.fromList(SLinkOperations.getChildren(root, MetaAdapterFactory.getContainmentLink(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, 0x74e28664f05605aeL, "node"))).getElement(1);
          SNode innerLeaf = ListSequence.fromList(SLinkOperations.getChildren(priority, MetaAdapterFactory.getContainmentLink(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, 0x74e28664f05605aeL, "node"))).getElement(0);
          SNode unapply = ListSequence.fromList(SLinkOperations.getChildren(priority, MetaAdapterFactory.getContainmentLink(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, 0x74e28664f05605aeL, "node"))).getElement(1);
          SNode unapplyLeaf = ListSequence.fromList(SLinkOperations.getChildren(unapply, MetaAdapterFactory.getContainmentLink(0xa936c42ccb2c4d64L, 0xa1dc12986579a998L, 0x74e28664f056014cL, 0x74e28664f05605aeL, "node"))).getElement(0);

          Assert.assertEquals(getEditorComponent().findNodeCell(root).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "top");
          Assert.assertEquals(getEditorComponent().findNodeCell(leaf).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "top");
          Assert.assertEquals(getEditorComponent().findNodeCell(priority).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "Priority");
          Assert.assertEquals(getEditorComponent().findNodeCell(innerLeaf).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "Priority");
          Assert.assertEquals(getEditorComponent().findNodeCell(unapply).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "top");
          Assert.assertEquals(getEditorComponent().findNodeCell(unapplyLeaf).getStyle().get(StyleAttributes.getInstance().<String>getAttribute("jetbrains.mps.lang.editor.styleTests", "test-inherited-attribute")), "top");
        }
      });
    }
  }
}
