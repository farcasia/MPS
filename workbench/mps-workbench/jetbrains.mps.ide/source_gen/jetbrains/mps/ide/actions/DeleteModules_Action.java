package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import java.util.List;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.dialogs.DeleteDialog;
import com.intellij.util.ui.UIUtil;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.mps.openapi.module.ModelAccess;
import jetbrains.mps.module.ModuleDeleteHelper;

public class DeleteModules_Action extends BaseAction {
  private static final Icon ICON = null;

  public DeleteModules_Action() {
    super("Delete Module...", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    boolean isApplicable = ((List<SModule>) MapSequence.fromMap(_params).get("modules")).size() != 0 && !(Sequence.fromIterable(((Iterable<SModule>) ((List<SModule>) MapSequence.fromMap(_params).get("modules")))).any(new IWhereFilter<SModule>() {
      public boolean accept(SModule it) {
        return it.isPackaged() || it.isReadOnly() || !((it instanceof Solution || it instanceof Language || it instanceof DevKit));
      }
    }));
    event.getPresentation().setEnabled(isApplicable);
    event.getPresentation().setVisible(isApplicable);

    if (isApplicable) {
      if (((List<SModule>) MapSequence.fromMap(_params).get("modules")).size() > 1) {
        event.getPresentation().setText("&Delete Modules...", true);
      } else {
        // If isApplicable and !(modules > 1) => modules == 1 
        SModule module = ((List<SModule>) MapSequence.fromMap(_params).get("modules")).get(0);
        if (module instanceof Solution) {
          event.getPresentation().setText("&Delete Solution...", true);
        } else if (module instanceof Language) {
          event.getPresentation().setText("&Delete Language...", true);
        } else if (module instanceof DevKit) {
          event.getPresentation().setText("&Delete DevKit...", true);
        } else if (module instanceof Generator) {
          // For fututre implementation 
          event.getPresentation().setText("&Delete Generator...", true);
        } else {
          event.getPresentation().setText("&Delete Module...", true);
        }
      }
    }
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
      List<SModule> p = event.getData(MPSCommonDataKeys.MODULES);
      MapSequence.fromMap(_params).put("modules", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    String message = "<html>Are you sure you want to delete selected modules?<br>This operation is not undoable.</html>";

    final DeleteDialog.DeleteOption filesOption = new DeleteDialog.DeleteOption(UIUtil.replaceMnemonicAmpersand("Delete &Files"), false, true);

    DeleteDialog dialog = new DeleteDialog(((MPSProject) MapSequence.fromMap(_params).get("project")), "Delete Modules", message, filesOption);
    dialog.show();
    if (!(dialog.isOK())) {
      return;
    }

    if (!(filesOption.selected) && Sequence.fromIterable(((Iterable<SModule>) ((List<SModule>) MapSequence.fromMap(_params).get("modules")))).any(new IWhereFilter<SModule>() {
      public boolean accept(SModule it) {
        return !(((MPSProject) MapSequence.fromMap(_params).get("project")).isProjectModule(it));
      }
    })) {
      final StringBuilder builder = new StringBuilder();
      Sequence.fromIterable(((Iterable<SModule>) ((List<SModule>) MapSequence.fromMap(_params).get("modules")))).where(new IWhereFilter<SModule>() {
        public boolean accept(SModule it) {
          return !(((MPSProject) MapSequence.fromMap(_params).get("project")).isProjectModule(it));
        }
      }).visitAll(new IVisitor<SModule>() {
        public void visit(SModule it) {
          builder.append("<br>").append(it.getModuleName());
        }
      });
      Messages.showWarningDialog(((MPSProject) MapSequence.fromMap(_params).get("project")).getProject(), String.format("<html>Non-project modules can only be deleted with files deletion enabled:%s<html>", builder), "Can't delete module");
      return;
    }

    ModelAccess modelAccess = ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess();
    // While don't support undo no need for command here 
    modelAccess.runWriteAction(new Runnable() {
      public void run() {
        new ModuleDeleteHelper(((MPSProject) MapSequence.fromMap(_params).get("project"))).deleteModules(((List<SModule>) MapSequence.fromMap(_params).get("modules")), false, filesOption.selected);
      }
    });
  }
}
