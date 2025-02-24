package jetbrains.mps.lang.smodel.query.runtime;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.module.SModule;
import java.util.Collection;
import java.util.Set;
import jetbrains.mps.findUsages.FindUsagesManager;
import java.util.Collections;
import jetbrains.mps.progress.EmptyProgressMonitor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.ide.findusages.model.SearchResults;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.ide.findusages.model.SearchResult;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.project.EditableFilteringScope;
import jetbrains.mps.ide.findusages.model.scopes.ModelsScope;
import jetbrains.mps.ide.findusages.model.scopes.ModulesScope;
import java.util.Iterator;
import jetbrains.mps.project.Project;
import jetbrains.mps.ide.findusages.model.scopes.ProjectScope;

public class CommandUtil {
  public static Iterable<SNode> nodes(SearchScope scope) {
    return Sequence.fromIterable(models(scope)).translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel it) {
        return SModelOperations.nodes(it, null);
      }
    });
  }

  public static Iterable<SReference> references(SearchScope scope) {
    return Sequence.fromIterable(nodes(scope)).translate(new ITranslator2<SNode, SReference>() {
      public Iterable<SReference> translate(SNode it) {
        return SNodeOperations.getReferences(it);
      }
    });
  }

  public static Iterable<SModel> models(SearchScope scope) {
    return (Iterable<SModel>) scope.getModels();
  }

  public static Iterable<SModule> modules(SearchScope scope) {
    return scope.getModules();
  }

  public static Collection<SReference> usages(SearchScope scope, SNode node) {
    return (Set<SReference>) FindUsagesManager.getInstance().findUsages(scope, Collections.<SNode>singleton(node), new EmptyProgressMonitor());
  }

  public static Collection<SNode> instances(SearchScope scope, SAbstractConcept concept, boolean exact) {
    return FindUsagesManager.getInstance().findInstances(scope, Collections.singleton(concept), exact, new EmptyProgressMonitor());
  }

  public static _FunctionTypes._return_P0_E0<? extends SearchResults> nodesToResults(final Iterable<SNodeReference> nodes, final SRepository repository) {
    return new _FunctionTypes._return_P0_E0<SearchResults<SNode>>() {
      public SearchResults<SNode> invoke() {
        final SearchResults<SNode> res = new SearchResults<SNode>();
        Sequence.fromIterable(nodes).where(new IWhereFilter<SNodeReference>() {
          public boolean accept(SNodeReference it) {
            return check_1pinza_a0a0a0a0b0a0a21(it, repository) != null;
          }
        }).visitAll(new IVisitor<SNodeReference>() {
          public void visit(SNodeReference it) {
            res.getSearchResults().add(new SearchResult<SNode>(check_1pinza_a0a0a0a0a0b0a0a21(it, repository), "usage"));
          }
        });
        return res;
      }
    };
  }

  public static _FunctionTypes._return_P0_E0<? extends SearchResults> modelsToResults(final Iterable<SModelReference> models, final SRepository repository) {
    return new _FunctionTypes._return_P0_E0<SearchResults<SModel>>() {
      public SearchResults<SModel> invoke() {
        final SearchResults<SModel> res = new SearchResults<SModel>();
        Sequence.fromIterable(models).where(new IWhereFilter<SModelReference>() {
          public boolean accept(SModelReference it) {
            return check_1pinza_a0a0a0a0b0a0a41(it, repository) != null;
          }
        }).visitAll(new IVisitor<SModelReference>() {
          public void visit(SModelReference it) {
            res.getSearchResults().add(new SearchResult<SModel>(check_1pinza_a0a0a0a0a0b0a0a41(it, repository), "usage"));
          }
        });
        return res;
      }
    };
  }

  public static _FunctionTypes._return_P0_E0<? extends SearchResults> modulesToResults(final Iterable<SModuleReference> modules, final SRepository repository) {
    return new _FunctionTypes._return_P0_E0<SearchResults<SModule>>() {
      public SearchResults<SModule> invoke() {
        final SearchResults<SModule> res = new SearchResults<SModule>();
        Sequence.fromIterable(modules).where(new IWhereFilter<SModuleReference>() {
          public boolean accept(SModuleReference it) {
            return check_1pinza_a0a0a0a0b0a0a61(it, repository) != null;
          }
        }).visitAll(new IVisitor<SModuleReference>() {
          public void visit(SModuleReference it) {
            res.getSearchResults().add(new SearchResult<SModule>(check_1pinza_a0a0a0a0a0b0a0a61(it, repository), "usage"));
          }
        });
        return res;
      }
    };

  }

  public static SNodeReference getNodeReference(SNode aNode) {
    return check_1pinza_a0a81(aNode);
  }
  public static SNodeReference getReferenceReference(SReference aReference) {
    return check_1pinza_a0a91(check_1pinza_a0a0t(aReference));
  }
  public static SModelReference getModelReference(SModel aModel) {
    return check_1pinza_a0a02(aModel);
  }
  public static SModuleReference getModuleReference(SModule aModule) {
    return check_1pinza_a0a12(aModule);
  }

  @Deprecated
  @ToRemove(version = 2018.1)
  public static SearchScope createConsoleScope(@Nullable final SearchScope baseScope, final boolean includeReadOnly, QueryExecutionContext context) {
    SearchScope scope = (baseScope == null ? context.getDefaultSearchScope() : baseScope);
    return (includeReadOnly ? scope : new EditableFilteringScope(scope));
  }

  public static SearchScope selectScope(@Nullable final SearchScope baseScope, QueryExecutionContext context) {
    return (baseScope == null ? context.getDefaultSearchScope() : baseScope);
  }

  public static SearchScope createScope(SModel model) {
    return new EditableFilteringScope(new ModelsScope(model));
  }
  public static SearchScope createScope(SModule module) {
    return new EditableFilteringScope(new ModulesScope(module));
  }
  public static SearchScope createScope(Iterable modelsAndModules) {
    Iterator<Object> it = modelsAndModules.iterator();
    if (!(it.hasNext())) {
      return new ModelsScope();
    }
    return (it.next() instanceof SModule ? new EditableFilteringScope(new ModulesScope(modelsAndModules)) : new EditableFilteringScope(new ModelsScope(modelsAndModules)));
  }
  public static SearchScope createScope(Project project) {
    return new EditableFilteringScope(new ProjectScope(project));
  }
  public static SearchScope createScope(SearchScope searchScope) {
    return new EditableFilteringScope(searchScope);
  }

  private static SNode check_1pinza_a0a0a0a0b0a0a21(SNodeReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SNode check_1pinza_a0a0a0a0a0b0a0a21(SNodeReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SModel check_1pinza_a0a0a0a0b0a0a41(SModelReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SModel check_1pinza_a0a0a0a0a0b0a0a41(SModelReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SModule check_1pinza_a0a0a0a0b0a0a61(SModuleReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SModule check_1pinza_a0a0a0a0a0b0a0a61(SModuleReference checkedDotOperand, SRepository repository) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.resolve(repository);
    }
    return null;
  }
  private static SNodeReference check_1pinza_a0a81(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getReference();
    }
    return null;
  }
  private static SNodeReference check_1pinza_a0a91(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getReference();
    }
    return null;
  }
  private static SNode check_1pinza_a0a0t(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getSourceNode();
    }
    return null;
  }
  private static SModelReference check_1pinza_a0a02(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getReference();
    }
    return null;
  }
  private static SModuleReference check_1pinza_a0a12(SModule checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModuleReference();
    }
    return null;
  }
}
