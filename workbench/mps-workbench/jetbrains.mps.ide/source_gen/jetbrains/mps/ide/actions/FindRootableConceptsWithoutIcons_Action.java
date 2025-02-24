package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.ModelAccess;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.findusages.model.SearchResults;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.scopes.GlobalScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.ide.platform.refactoring.RefactoringAccessEx;
import jetbrains.mps.ide.platform.refactoring.RefactoringViewAction;
import jetbrains.mps.ide.platform.refactoring.RefactoringViewItem;

public class FindRootableConceptsWithoutIcons_Action extends BaseAction {
  private static final Icon ICON = null;

  public FindRootableConceptsWithoutIcons_Action() {
    super("Find Rootable Concepts without Icons", "", ICON);
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
      Project p = event.getData(CommonDataKeys.PROJECT);
      MapSequence.fromMap(_params).put("ideaProject", p);
      if (p == null) {
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
    final ModelAccess modelAccess = ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess();

    ProgressManager.getInstance().run(new Task.Modal(((Project) MapSequence.fromMap(_params).get("ideaProject")), "Finding Usages", true) {
      @Override
      public void run(@NotNull ProgressIndicator p0) {
        final Wrappers._T<SearchResults<SNode>> concepts = new Wrappers._T<SearchResults<SNode>>();
        final Wrappers._T<List<SearchResult<SNode>>> results = new Wrappers._T<List<SearchResult<SNode>>>();

        modelAccess.runReadAction(new Runnable() {
          public void run() {
            concepts.value = FindUtils.getSearchResults(new EmptyProgressMonitor(), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489090640"), new GlobalScope(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder");
            results.value = ListSequence.fromList(((List<SearchResult<SNode>>) concepts.value.getSearchResults())).where(new IWhereFilter<SearchResult<SNode>>() {
              public boolean accept(SearchResult<SNode> it) {
                SNode node = (SNode) it.getObject();
                return SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xff49c1d648L, "rootable")) && (SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x57cf4eb14c4f9ef5L, "icon")) == null);
              }
            }).toListSequence();
          }
        });

        if (p0.isCanceled()) {
          return;
        }

        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            RefactoringAccessEx.getInstance().showRefactoringView(((Project) MapSequence.fromMap(_params).get("ideaProject")), new RefactoringViewAction() {
              @Override
              public void performAction(RefactoringViewItem refactoringViewItem) {
                refactoringViewItem.close();
              }
            }, new SearchResults<SNode>(concepts.value.getSearchedNodes(), results.value), false, "Safe Delete");
          }
        });
      }
    });
  }
}
