package jetbrains.mps.ide.platform.actions;

/*Generated by MPS */

import jetbrains.mps.ide.tools.BaseProjectTool;
import jetbrains.mps.ide.platform.dependencyViewer.DependenciesPanel;
import com.intellij.openapi.project.Project;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.ide.platform.dependencyViewer.DependencyViewerScope;
import javax.swing.JComponent;

public class AnalyzeDependenciesViewTool extends BaseProjectTool {

  private DependenciesPanel myDependenciesPanel;

  public AnalyzeDependenciesViewTool(Project project) {
    super(project, "Dependencies Viewer", null, AllIcons.Toolwindows.ToolWindowInspection, ToolWindowAnchor.BOTTOM, false, false);
  }

  @Override
  protected void createTool() {
    myDependenciesPanel = new DependenciesPanel(this, ProjectHelper.fromIdeaProject(getProject()));
  }

  public void setContent(DependencyViewerScope scope) {
    myDependenciesPanel.resetContent(scope, false);
    myDependenciesPanel.revalidate();
  }

  @Override
  public JComponent getComponent() {
    return myDependenciesPanel;
  }
}
