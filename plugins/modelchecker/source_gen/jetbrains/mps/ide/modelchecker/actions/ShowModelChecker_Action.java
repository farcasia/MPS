package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelCheckerTool;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.project.Project;

public class ShowModelChecker_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowModelChecker_Action() {
    super("Model Checker...", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return ModelCheckerTool.getInstance(event.getData(CommonDataKeys.PROJECT)).isAvailable();
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    this.setEnabledState(event.getPresentation(), this.isApplicable(event, _params));
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    ModelCheckerTool tool = ModelCheckerTool.getInstance(event.getData(CommonDataKeys.PROJECT));
    if (!(tool.isAvailable()) || !(tool.toolIsOpened())) {
      // Not visible: open 
      tool.openToolLater(true);
    } else if (tool.getToolWindow().isActive()) {
      // Visible and active: hide 
      tool.getToolWindow().hide(null);
    } else {
      // Visible and not active: activate 
      tool.getToolWindow().activate(null);
    }
  }
}
