package jetbrains.mps.lang.script.pluginSolution.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.Language;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import java.util.Comparator;
import jetbrains.mps.ide.script.plugin.ScriptsActionGroupHelper;
import jetbrains.mps.workbench.action.BaseGroup;

/*package*/ final class ScriptsMenuBuilder {
  private boolean applyToSelection;
  private List<Language> allLanguages;
  private List<SNode> allScripts;
  public ScriptsMenuBuilder(MPSProject mpsProject, boolean applyToSelection) {
    this.applyToSelection = applyToSelection;
    this.allLanguages = ListSequence.fromListWithValues(new ArrayList<Language>(), new ModuleRepositoryFacade(mpsProject).getAllModules(Language.class));
    ListSequence.fromList(this.allLanguages).sort(new Comparator<Language>() {
      public int compare(Language l1, Language l2) {
        return l1.getModuleName().compareTo(l2.getModuleName());
      }
    }, true);
    this.allScripts = ScriptsActionGroupHelper.getMigrationScripts(this.allLanguages);
  }
  public BaseGroup create_ByCategoryPopup() {
    BaseGroup byCategoryGroup = new BaseGroup("By Category");
    byCategoryGroup.setPopup(true);
    ScriptsActionGroupHelper.populateByCategoryGroup(this.allScripts, byCategoryGroup, this.applyToSelection);
    return byCategoryGroup;
  }

  /*package*/ boolean isSelectionOnly() {
    return applyToSelection;
  }

  public List<SNode> getAllScripts() {
    return this.allScripts;
  }
}
