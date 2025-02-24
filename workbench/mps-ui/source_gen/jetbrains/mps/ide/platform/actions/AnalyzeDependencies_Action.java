package jetbrains.mps.ide.platform.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.mps.openapi.model.SNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import jetbrains.mps.ide.platform.dependencyViewer.DependencyViewerScope;
import org.jetbrains.mps.openapi.module.SRepository;

public class AnalyzeDependencies_Action extends BaseAction {
  private static final Icon ICON = AllIcons.Toolwindows.ToolWindowInspection;

  public AnalyzeDependencies_Action() {
    super("Analyze Model Dependencies", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return !(AnalyzeDependencies_Action.this.computeScope(event).isEmpty());
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
      List<SModel> p = event.getData(MPSCommonDataKeys.MODELS);
    }
    {
      List<SModule> p = event.getData(MPSCommonDataKeys.MODULES);
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    {
      SNode p = event.getData(MPSCommonDataKeys.NODE);
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
    DependencyViewerScope scope = AnalyzeDependencies_Action.this.computeScope(event);
    if (scope.isEmpty()) {
      return;
    }
    DependenciesUtil.openDependenciesTool(event.getData(CommonDataKeys.PROJECT), scope, true);
  }
  /*package*/ DependencyViewerScope computeScope(final AnActionEvent event) {
    SRepository repository = event.getData(MPSCommonDataKeys.MPS_PROJECT).getRepository();
    final DependencyViewerScope scope = new DependencyViewerScope(repository);
    repository.getModelAccess().runReadAction(new Runnable() {
      public void run() {
        if (event.getData(MPSCommonDataKeys.MODELS) != null) {
          for (SModel model : event.getData(MPSCommonDataKeys.MODELS)) {
            scope.add(model);
          }
        }
        if (event.getData(MPSCommonDataKeys.MODULES) != null) {
          for (SModule module : event.getData(MPSCommonDataKeys.MODULES)) {
            scope.add(module);
          }
        }
        if (scope.isEmpty()) {
          SNode node = check_rkpdtm_a0a0c0a0a2a0(event.getData(MPSCommonDataKeys.NODE));
          if (node != null) {
            scope.add(node);
          }
        }
      }
    });
    return scope;
  }
  private static SNode check_rkpdtm_a0a0c0a0a2a0(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getContainingRoot();
    }
    return null;
  }
}
