package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.mps.openapi.model.EditableSModel;
import jetbrains.mps.kernel.model.MissingDependenciesFixer;

public class FixModuleImportsInProject_Action extends BaseAction {
  private static final Icon ICON = null;

  public FixModuleImportsInProject_Action() {
    super("Fix Module Imports", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    for (SModule module : Sequence.fromIterable(event.getData(MPSCommonDataKeys.MPS_PROJECT).getModulesWithGenerators())) {
      if (module.isReadOnly()) {
        continue;
      }
      for (SModel model : Sequence.fromIterable(module.getModels())) {
        if (!(SModelStereotype.isUserModel(model))) {
          continue;
        }
        if (!(model instanceof EditableSModel)) {
          continue;
        }

        new MissingDependenciesFixer(model).fixModuleDependencies();
      }
    }
  }
}
