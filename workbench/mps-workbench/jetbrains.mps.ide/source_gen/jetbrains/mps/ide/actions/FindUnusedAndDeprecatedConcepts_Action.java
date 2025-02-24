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
import java.util.List;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.Computable;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.ModelDependencyScanner;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.HashSet;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.util.DepthFirstConceptIterator;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.scopes.GlobalScope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import com.intellij.openapi.progress.ProgressManager;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.ide.findusages.view.UsageToolOptions;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindUnusedAndDeprecatedConcepts_Action extends BaseAction {
  private static final Icon ICON = null;

  public FindUnusedAndDeprecatedConcepts_Action() {
    super("Find unused and deprecated concepts", "", ICON);
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
      MapSequence.fromMap(_params).put("mpsProject", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {

    final List<SNodeReference> conceptsToShow = ListSequence.fromList(new ArrayList<SNodeReference>());

    Task.Modal modal = new Task.Modal(((Project) MapSequence.fromMap(_params).get("ideaProject")), event.getPresentation().getText(), true) {
      @Override
      public void run(@NotNull ProgressIndicator indicator) {
        final ProgressMonitor monitor = new ProgressMonitorAdapter(indicator);

        List<SNodeReference> concepts = new ModelAccessHelper(((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).getModelAccess()).runReadAction(new Computable<List<SNodeReference>>() {
          public List<SNodeReference> compute() {
            Iterable<? extends SModule> modules = ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).getModulesWithGenerators();
            int totalWork = Sequence.fromIterable(modules).count() * 2;
            // iterate all modules: 1/2, + 1/8 + 1/4 + 1/8 
            monitor.start("Find unused  and deprecated concepts", totalWork);
            ModelDependencyScanner scanner = new ModelDependencyScanner().usedConcepts(true).usedLanguages(false).crossModelReferences(false);
            for (SModule module : modules) {
              monitor.step(String.format("Look up concepts in use: %s...", NameUtil.compactNamespace(module.getModuleName())));
              for (SModel m : module.getModels()) {
                if (monitor.isCanceled()) {
                  return null;
                }
                scanner.walk(m);
              }
              monitor.advance(1);
            }
            monitor.step("Complete concept hierarchy...");
            final HashSet<String> conceptsInUse = new HashSet<String>();
            for (SConcept inUse : scanner.getConcepts()) {
              // could use concept<>.super-concepts/all<+> here, but resort to code that has been there for a while 
              for (SAbstractConcept c : new DepthFirstConceptIterator(inUse)) {
                conceptsInUse.add(c.getQualifiedName());
              }
              if (monitor.isCanceled()) {
                return null;
              }
            }
            monitor.advance(totalWork / 8);

            monitor.step("Look up concept declarations...");
            Iterable<SearchResult<Object>> searchResults = FindUtils.getSearchResults(new EmptyProgressMonitor(), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489090640"), new GlobalScope(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder").getSearchResults();
            if (monitor.isCanceled()) {
              return null;
            }
            monitor.advance(totalWork / 4);

            monitor.step("Filter unused and deprecated...");
            // FIXME why it's not a dedicated IFinder that takes AbstractConceptDeclaration instances as search query and nodes/models as scope? 
            Iterable<SNode> allConcepts = SNodeOperations.ofConcept(Sequence.fromIterable(searchResults).select(new ISelector<SearchResult<Object>, Object>() {
              public Object select(SearchResult<Object> it) {
                return it.getObject();
              }
            }).ofType(SNode.class), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
            List<SNodeReference> rv = Sequence.fromIterable(allConcepts).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode concept) {
                return ((boolean) (Boolean) BHReflection.invoke0(concept, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x11d205fe38dL, "jetbrains.mps.lang.core.structure.IDeprecatable"), SMethodTrimmedId.create("isDeprecated", null, "hOwoPtR"))) || !(conceptsInUse.contains(NameUtil.nodeFQName(concept)));
              }
            }).select(new ISelector<SNode, SNodeReference>() {
              public SNodeReference select(SNode it) {
                return SNodeOperations.getPointer(it);
              }
            }).toListSequence();
            monitor.done();
            return rv;
          }
        });
        ListSequence.fromList(conceptsToShow).addSequence(ListSequence.fromList(concepts));
      }
    };
    ProgressManager.getInstance().run(modal);

    FindUnusedAndDeprecatedConcepts_Action.this.showUsagesViewForNodes(conceptsToShow, _params);
  }
  /*package*/ void showUsagesViewForNodes(final List<SNodeReference> nodes, final Map<String, Object> _params) {
    IResultProvider provider = FindUtils.makeProvider(new BaseFinder() {
      @Override
      public SearchResults find(SearchQuery query, ProgressMonitor progress) {
        final SRepository repo = ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).getRepository();
        SearchResults<SNode> results = new SearchResults<SNode>();
        for (SNode node : ListSequence.fromList(nodes).select(new ISelector<SNodeReference, SNode>() {
          public SNode select(SNodeReference it) {
            return it.resolve(repo);
          }
        }).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return it != null;
          }
        })) {
          results.getSearchResults().add(new SearchResult<SNode>(node, "Uncategorized"));
        }
        return results;
      }
      @Override
      public String getDescription() {
        return "Specific Nodes";
      }
    });
    UsageToolOptions opt = new UsageToolOptions().allowRunAgain(false).navigateIfSingle(false).forceNewTab(false).notFoundMessage("Nothing");
    UsagesViewTool.showUsages(((Project) MapSequence.fromMap(_params).get("ideaProject")), provider, new SearchQuery(jetbrains.mps.project.GlobalScope.getInstance()), opt);
  }
}
