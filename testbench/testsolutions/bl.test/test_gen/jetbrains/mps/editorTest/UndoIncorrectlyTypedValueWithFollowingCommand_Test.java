package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;

@MPSLaunch
public class UndoIncorrectlyTypedValueWithFollowingCommand_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(UndoIncorrectlyTypedValueWithFollowingCommand_Test.class, "${mps_home}", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest@tests)", false);

  public UndoIncorrectlyTypedValueWithFollowingCommand_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_UndoIncorrectlyTypedValueWithFollowingCommand() throws Throwable {
    runTest("jetbrains.mps.editorTest.UndoIncorrectlyTypedValueWithFollowingCommand_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("5305372928076817874", "5305372928076817881");
      typeString("=1");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveLeft_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveLeft_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveLeft_Action");
      invokeAction("jetbrains.mps.ide.editor.actions.MoveLeft_Action");
      typeString("§123");
      invokeAction("jetbrains.mps.ide.editor.actions.Insert_Action");
      invokeAction("$Undo");
      invokeAction("$Undo");
      invokeAction("$Undo");
    }
  }
}
