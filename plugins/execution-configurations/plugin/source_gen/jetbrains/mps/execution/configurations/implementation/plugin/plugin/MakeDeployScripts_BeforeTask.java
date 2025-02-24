package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.configurations.BaseMpsBeforeTaskProvider;
import com.intellij.openapi.util.Key;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNodeReference;
import com.intellij.openapi.project.Project;
import com.intellij.execution.runners.ExecutionEnvironment;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.project.ProjectHelper;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;

public class MakeDeployScripts_BeforeTask extends BaseMpsBeforeTaskProvider<MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask> {
  private static final Key<MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask> KEY = Key.create("jetbrains.mps.execution.configurations.implementation.plugin.plugin.MakeDeployScripts_BeforeTask");
  public MakeDeployScripts_BeforeTask() {
    super("Make deploy scripts", "Make deploy scripts");
  }
  protected MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask createTaskImpl() {
    return new MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask();
  }
  public Key<MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask> getId() {
    return KEY;
  }
  public static class MakeDeployScripts_BeforeTask_RunTask extends BaseMpsBeforeTaskProvider.BaseMpsBeforeRunTask<MakeDeployScripts_BeforeTask.MakeDeployScripts_BeforeTask_RunTask> {
    private List<SNodeReference> myPlugins;
    public MakeDeployScripts_BeforeTask_RunTask() {
      super(KEY);
    }
    public boolean configure(List<SNodeReference> plugins) {
      myPlugins = plugins;
      return true;
    }
    public boolean execute(Project project, ExecutionEnvironment environment) {
      if (ListSequence.fromList(myPlugins).isEmpty()) {
        return false;
      }

      final Wrappers._T<DeployScript> script = new Wrappers._T<DeployScript>();
      final jetbrains.mps.project.Project mpsProject = ProjectHelper.toMPSProject(project);

      ApplicationManager.getApplication().invokeAndWait(new Runnable() {
        public void run() {
          mpsProject.getModelAccess().executeCommand(new Runnable() {
            public void run() {
              script.value = new DeployScript(mpsProject, myPlugins);
            }
          });
        }
      }, ModalityState.NON_MODAL);

      String deployScriptLocation = script.value.make();
      if ((deployScriptLocation == null || deployScriptLocation.length() == 0)) {
        script.value.dispose();
        return false;
      }

      ScriptsHolder.put(environment, script.value);

      return true;
    }
  }
}
