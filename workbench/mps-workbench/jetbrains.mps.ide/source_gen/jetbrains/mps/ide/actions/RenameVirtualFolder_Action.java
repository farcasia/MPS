package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import javax.swing.tree.TreeNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.ui.tree.module.NamespaceTextNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.mps.openapi.module.ModelAccess;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.StandaloneMPSProject;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class RenameVirtualFolder_Action extends BaseAction {
  private static final Icon ICON = null;

  public RenameVirtualFolder_Action() {
    super("Rename", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return ((TreeNode) MapSequence.fromMap(_params).get("treeNode")) instanceof NamespaceTextNode && RenameVirtualFolder_Action.this.getProjectPane(_params) != null && !(((NamespaceTextNode) ((TreeNode) MapSequence.fromMap(_params).get("treeNode"))).isFinalName());
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
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      MapSequence.fromMap(_params).put("project", p);
      if (p == null) {
        return false;
      }
    }
    {
      TreeNode p = event.getData(MPSCommonDataKeys.TREE_NODE);
      MapSequence.fromMap(_params).put("treeNode", p);
      if (p == null) {
        return false;
      }
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      MapSequence.fromMap(_params).put("ideaProject", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    final NamespaceTextNode node = ((NamespaceTextNode) ((TreeNode) MapSequence.fromMap(_params).get("treeNode")));
    final Wrappers._T<String> newFolder = new Wrappers._T<String>(Messages.showInputDialog(((Project) MapSequence.fromMap(_params).get("ideaProject")), "Rename virtual folder", "Rename", null, node.getName(), null));
    if (newFolder.value == null) {
      return;
    }
    if (newFolder.value.equals("")) {
      newFolder.value = null;
    }
    ModelAccess modelAccess = ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess();
    modelAccess.executeCommandInEDT(new Runnable() {
      public void run() {
        for (SModule module : ListSequence.fromList(node.getModulesUnder())) {
          ((StandaloneMPSProject) ((MPSProject) MapSequence.fromMap(_params).get("project"))).setFolderFor(module, newFolder.value);
        }
        RenameVirtualFolder_Action.this.getProjectPane(_params).rebuild();
      }
    });
  }
  private ProjectPane getProjectPane(final Map<String, Object> _params) {
    return ProjectPane.getInstance(((MPSProject) MapSequence.fromMap(_params).get("project")));
  }
}
