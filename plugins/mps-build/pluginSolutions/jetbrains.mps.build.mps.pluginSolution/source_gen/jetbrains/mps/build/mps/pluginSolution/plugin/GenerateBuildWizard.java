package jetbrains.mps.build.mps.pluginSolution.plugin;

/*Generated by MPS */

import com.intellij.ide.wizard.AbstractWizard;
import jetbrains.mps.project.Project;
import jetbrains.mps.project.MPSProject;
import javax.swing.JComponent;
import com.intellij.ide.wizard.Step;

public class GenerateBuildWizard extends AbstractWizard {
  private final Project myProject;
  protected final AbstractBuildGenerator myGenerator;
  protected IErrorHandler myErrorHandler = new IErrorHandler() {
    @Override
    public void setErrorText(String text) {
      GenerateBuildWizard.this.setErrorText(text);
    }
  };

  public GenerateBuildWizard(String title, Project project, AbstractBuildGenerator generator) {
    super(title, ((MPSProject) project).getProject());
    myProject = project;
    myGenerator = generator;

    initWizard();
  }

  @Override
  public String getHelpID() {
    return null;
  }

  @Override
  protected JComponent createCenterPanel() {
    JComponent panel = super.createCenterPanel();
    assert panel != null;
    panel.doLayout();
    return panel;
  }

  @Override
  protected boolean canFinish() {
    return super.canFinish() && myGenerator.isValid();
  }

  @Override
  protected void doOKAction() {
    super.doOKAction();
    myGenerator.generate();
  }

  public void initWizard() {
    Step moduleStep = new SolutionStep(myProject, myGenerator, myErrorHandler);
    Step modelStep = new ModelStep(myProject, myGenerator, myErrorHandler);
    Step dependencyStep = new DependencyStep(myGenerator, myErrorHandler);
    Step languagesStep = new LanguagesStep(myProject, myGenerator, myErrorHandler);
    addStep(moduleStep);
    addStep(modelStep);
    addStep(dependencyStep);
    addStep(languagesStep);
    init();
  }
}
