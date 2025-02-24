package jetbrains.mps.baseLanguage.unitTest.execution.tool;

/*Generated by MPS */

import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import javax.swing.Icon;
import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;

public abstract class BaseTestTreeNode extends MPSTreeNode {
  private TestState myState = TestState.NOT_RAN;

  public BaseTestTreeNode() {
  }

  @Override
  protected void doUpdatePresentation() {
    Icon icon = myState.getIcon();
    if (icon != null) {
      setIcon(icon);
    }
  }
  public void setState(TestState state) {
    myState = state;
    renewPresentation();
  }
  public TestState getState() {
    return myState;
  }

  public abstract ITestNodeWrapper getTestWrapper();
}
