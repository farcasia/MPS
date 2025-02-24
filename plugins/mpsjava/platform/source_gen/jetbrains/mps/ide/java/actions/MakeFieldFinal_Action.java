package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import jetbrains.mps.refactoring.runtime.access.RefactoringAccess;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import java.util.Arrays;

public class MakeFieldFinal_Action extends BaseAction {
  private static final Icon ICON = null;

  public MakeFieldFinal_Action() {
    super("Make Field Final", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return RefactoringUtil.isApplicable(RefactoringUtil.getRefactoringByClassName("jetbrains.mps.baseLanguage.refactorings" + "." + "MakeFieldFinal"), ((SNode) MapSequence.fromMap(_params).get("target")));
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
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null && !(SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")))) {
        node = null;
      }
      MapSequence.fromMap(_params).put("target", node);
      if (node == null) {
        return false;
      }
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      MapSequence.fromMap(_params).put("project", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    ((MPSProject) MapSequence.fromMap(_params).get("project")).getModelAccess().runReadInEDT(new Runnable() {
      @Override
      public void run() {
        if (!(SNodeUtil.isAccessible(((SNode) MapSequence.fromMap(_params).get("target")), ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository()))) {
          return;
        }
        RefactoringAccess.getInstance().getRefactoringFacade().execute(RefactoringContext.createRefactoringContextByName("jetbrains.mps.baseLanguage.refactorings.MakeFieldFinal", Arrays.asList(), Arrays.asList(), ((SNode) MapSequence.fromMap(_params).get("target")), ((MPSProject) MapSequence.fromMap(_params).get("project"))));
      }
    });

  }
}
