package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.Generator;

public class BuildAllGenerators_Action extends BaseAction {
  private static final Icon ICON = null;

  public BuildAllGenerators_Action() {
    super("Rebuild All Generators", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
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
    final Wrappers._T<List<SModule>> m = new Wrappers._T<List<SModule>>();
    event.getData(MPSCommonDataKeys.MPS_PROJECT).getModelAccess().runReadAction(new Runnable() {
      public void run() {
        Iterable<SModule> projectModules = event.getData(MPSCommonDataKeys.MPS_PROJECT).getProjectModulesWithGenerators();
        m.value = ListSequence.fromListWithValues(new ArrayList<SModule>(), Sequence.fromIterable(projectModules).ofType(Generator.class));
      }
    });
    new MakeActionImpl(new MakeActionParameters(event.getData(MPSCommonDataKeys.MPS_PROJECT)).modules(m.value).cleanMake(true)).executeAction();
  }
}
