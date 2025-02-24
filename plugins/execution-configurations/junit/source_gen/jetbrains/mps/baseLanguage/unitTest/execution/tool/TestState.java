package jetbrains.mps.baseLanguage.unitTest.execution.tool;

/*Generated by MPS */

import com.intellij.icons.AllIcons;
import javax.swing.Icon;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public enum TestState {
  NOT_RAN(AllIcons.RunConfigurations.TestNotRan),
  IN_PROGRESS(AllIcons.RunConfigurations.TestInProgress1),
  PAUSED(AllIcons.RunConfigurations.TestPaused),
  IGNORED(AllIcons.RunConfigurations.TestIgnored),
  PASSED(AllIcons.RunConfigurations.TestPassed),
  FAILED(AllIcons.RunConfigurations.TestFailed),
  ERROR(AllIcons.RunConfigurations.TestError),
  TERMINATED(AllIcons.RunConfigurations.TestTerminated);

  private final Icon myIcon;
  TestState(Icon icon) {
    Language language = Language.getLanguageFor(SNodeOperations.getModel(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902d7(jetbrains.mps.baseLanguage.unitTest.structure)", "1216130694486")));
    myIcon = icon;
  }
  public Icon getIcon() {
    if (equals(TestState.IN_PROGRESS)) {
      return TestTreeIconAnimator.getCurrentFrame();
    }
    return myIcon;
  }
}
