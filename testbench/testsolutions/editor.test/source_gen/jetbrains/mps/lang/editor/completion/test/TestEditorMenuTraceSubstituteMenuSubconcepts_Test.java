package jetbrains.mps.lang.editor.completion.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import junit.framework.Assert;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

@MPSLaunch
public class TestEditorMenuTraceSubstituteMenuSubconcepts_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TestEditorMenuTraceSubstituteMenuSubconcepts_Test.class, "${mps_home}", "r:f27d9626-8ef5-4cba-bce0-6aa6369f05ff(jetbrains.mps.lang.editor.completion.test)", false);

  public TestEditorMenuTraceSubstituteMenuSubconcepts_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_TestEditorMenuTraceSubstituteMenuSubconcepts() throws Throwable {
    runTest("jetbrains.mps.lang.editor.completion.test.TestEditorMenuTraceSubstituteMenuSubconcepts_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("1384684774803304775", "1384684774803304777");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");
      typeString("menu trace substitute subchild2");
      getEditorComponent().getEditorContext().getRepository().getModelAccess().runReadAction(new Runnable() {
        public void run() {
          Assert.assertTrue(getEditorComponent().getNodeSubstituteChooser().isVisible());
          SubstituteAction action = (SubstituteAction) getEditorComponent().getData(PlatformDataKeys.SELECTED_ITEM.getName());
          Assert.assertTrue(action != null);

          EditorMenuTraceInfo editorMenuTraceInfo = action.getEditorMenuTraceInfo();
          EditorMenuTraceTestUtil.checkTraceInfo(editorMenuTraceInfo, null);

          editorMenuTraceInfo = editorMenuTraceInfo.getParent();
          EditorMenuTraceTestUtil.checkTraceInfo(editorMenuTraceInfo, new SNodePointer("r:1a7fc406-f263-498c-a126-51036fe6a9da(jetbrains.mps.lang.editor.editorTest.structure)", "913276302144045616"));
          Assert.assertTrue(editorMenuTraceInfo.getMenuDescriptor().isImplicit());


          editorMenuTraceInfo = editorMenuTraceInfo.getParent();
          EditorMenuTraceTestUtil.checkTraceInfo(editorMenuTraceInfo, Sequence.fromIterable(SNodeOperations.ofConcept(SLinkOperations.getChildren(SNodeOperations.getNode("r:12055fd0-2d7f-4ac3-93ec-28bb09579a63(jetbrains.mps.lang.editor.editorTest.editor)", "913276302143897423"), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1bc2c2df999a7727L, 0x5c03050cab44f64L, "parts")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x88a6ffdb3b4f8c6L, "jetbrains.mps.lang.editor.structure.SubstituteMenuPart_Subconcepts"))).first().getReference());


          editorMenuTraceInfo = editorMenuTraceInfo.getParent();
          EditorMenuTraceTestUtil.checkTraceInfo(editorMenuTraceInfo, new SNodePointer("r:12055fd0-2d7f-4ac3-93ec-28bb09579a63(jetbrains.mps.lang.editor.editorTest.editor)", "913276302143897423"));


          editorMenuTraceInfo = editorMenuTraceInfo.getParent();
          Assert.assertTrue(editorMenuTraceInfo == null);
        }
      });
    }
  }
}
