package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;

public class ShowTypeSystemTrace_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowTypeSystemTrace_Action() {
    super("Show Typesystem Trace", "Show typesystem trace", ICON);
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
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node == null) {
        return false;
      }
    }
    {
      EditorComponent editorComponent = event.getData(MPSEditorDataKeys.EDITOR_COMPONENT);
      if (editorComponent != null && editorComponent.isInvalid()) {
        editorComponent = null;
      }
      if (editorComponent == null) {
        return false;
      }
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      if (p == null) {
        return false;
      }
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
    event.getData(MPSCommonDataKeys.MPS_PROJECT).getModelAccess().runReadAction(new Runnable() {
      public void run() {
        TraceTool_Tool tool = event.getData(CommonDataKeys.PROJECT).getComponent(ProjectPluginManager.class).getTool(TraceTool_Tool.class);
        tool.buildTrace(event.getData(MPSCommonDataKeys.MPS_PROJECT), event.getData(MPSCommonDataKeys.NODE), event.getData(MPSEditorDataKeys.EDITOR_COMPONENT));
        tool.openToolLater(true);
      }
    });
  }
}
