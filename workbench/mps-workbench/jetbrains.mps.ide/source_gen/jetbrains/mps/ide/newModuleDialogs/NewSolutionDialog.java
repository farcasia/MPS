package jetbrains.mps.ide.newModuleDialogs;

/*Generated by MPS */

import jetbrains.mps.project.Solution;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.ide.newSolutionDialog.NewModuleUtil;
import jetbrains.mps.project.StandaloneMPSProject;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.ide.ui.dialogs.modules.NewSolutionSettings;

public class NewSolutionDialog extends AbstractModuleCreationDialog<Solution> {

  public NewSolutionDialog(MPSProject project, @Nullable String virtualFolder) {
    super(project, virtualFolder);
    setTitle("New Solution");

    init();
  }

  @Override
  protected void runCreation() {
    String solutionName = mySettings.getModuleName();
    String solutionLocation = mySettings.getModuleLocation();
    myResult = NewModuleUtil.createSolution(solutionName, solutionLocation, myProject);
    ((StandaloneMPSProject) myProject).setFolderFor(myResult, myVirtualFolder);
    myProject.save();
  }

  @Override
  protected String getExtension() {
    return MPSExtentions.DOT_SOLUTION;
  }

  @Override
  protected NewSolutionSettings createSettingsInstance() {
    return new NewSolutionSettings(getProjectPath());
  }
}
