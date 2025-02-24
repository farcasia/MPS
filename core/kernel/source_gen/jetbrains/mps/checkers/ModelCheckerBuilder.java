package jetbrains.mps.checkers;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.List;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.errors.item.IssueKindReportItem;
import org.apache.log4j.Level;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.util.Consumer;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.util.SubProgressKind;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.errors.item.NodeReportItem;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class ModelCheckerBuilder {
  private static final Logger LOG = LogManager.getLogger(ModelCheckerBuilder.class);

  private final ModelCheckerBuilder.ModelExtractor myModelExtractor;
  public ModelCheckerBuilder(ModelCheckerBuilder.ModelExtractor modelExtractor) {
    myModelExtractor = modelExtractor;
  }
  public ModelCheckerBuilder(boolean checkStubs) {
    this(new ModelCheckerBuilder.ModelsExtractorImpl().includeStubs(checkStubs));
  }

  public static abstract class ModelExtractor {
    public final List<SModel> getModels(SModule module) {
      Iterable<SModel> models = Sequence.fromIterable(getSubModules(module)).translate(new ITranslator2<SModule, SModel>() {
        public Iterable<SModel> translate(SModule m) {
          return m.getModels();
        }
      });
      return Sequence.fromIterable(models).where(new IWhereFilter<SModel>() {
        public boolean accept(SModel it) {
          return includeModel(it);
        }
      }).toListSequence();
    }
    public abstract Iterable<SModule> getSubModules(SModule module);
    public abstract boolean includeModel(SModel model);
  }

  public static class ModelsExtractorImpl extends ModelCheckerBuilder.ModelExtractor {
    private boolean myIncludeStubs = false;
    private boolean myIncludeGenerators = true;
    public ModelCheckerBuilder.ModelsExtractorImpl excludeGenerators() {
      myIncludeGenerators = false;
      return this;
    }
    public ModelCheckerBuilder.ModelsExtractorImpl includeStubs(boolean checkStubs) {
      myIncludeStubs = checkStubs;
      return this;
    }
    @Override
    public Iterable<SModule> getSubModules(SModule module) {
      List<SModule> result = ListSequence.fromListAndArray(new ArrayList<SModule>(), module);
      if (myIncludeGenerators && module instanceof Language) {
        ListSequence.fromList(result).addSequence(CollectionSequence.fromCollection(((Language) module).getOwnedGenerators()));
      }
      return result;
    }
    public boolean includeModel(SModel model) {
      return SModelStereotype.isUserModel(model) || (myIncludeStubs && SModelStereotype.isStubModelStereotype(SModelStereotype.getStereotype(model)));
    }
  }

  public static class ItemsToCheck {
    public static ModelCheckerBuilder.ItemsToCheck forSingleModule(SModule module) {
      ModelCheckerBuilder.ItemsToCheck result = new ModelCheckerBuilder.ItemsToCheck();
      ListSequence.fromList(result.modules).addElement(module);
      return result;
    }
    public List<SModel> models = ListSequence.fromList(new ArrayList<SModel>());
    public List<SModule> modules = ListSequence.fromList(new ArrayList<SModule>());
  }

  public IAbstractChecker<ModelCheckerBuilder.ItemsToCheck, IssueKindReportItem> createChecker(final List<? extends IChecker<?, ? extends IssueKindReportItem>> specificCheckers) {
    List<IChecker<SModel, ? extends IssueKindReportItem>> modelCheckers = ListSequence.fromList(new ArrayList<IChecker<SModel, ? extends IssueKindReportItem>>());
    List<IChecker<SModule, ? extends IssueKindReportItem>> moduleCheckers = ListSequence.fromList(new ArrayList<IChecker<SModule, ? extends IssueKindReportItem>>());

    for (IChecker<?, ? extends IssueKindReportItem> it : ListSequence.fromList(specificCheckers)) {
      IChecker<?, ? extends IssueKindReportItem> checker = it;
      if (checker instanceof IChecker.AbstractModuleChecker) {
        ListSequence.fromList(moduleCheckers).addElement((IChecker.AbstractModuleChecker<? extends IssueKindReportItem>) checker);
      } else if (checker instanceof IChecker.AbstractModelChecker || checker instanceof IChecker.AbstractRootChecker || checker instanceof IChecker.AbstractNodeChecker) {
        ListSequence.fromList(modelCheckers).addElement(IChecker.AbstractModelChecker.wrapToModelChecker(checker));
      } else {
        if (LOG.isEnabledFor(Level.ERROR)) {
          LOG.error("IChecker implementor doesn't extend none of expected base classes: " + checker.getClass().getName());
        }
      }
    }

    return createChecker(modelCheckers, moduleCheckers);
  }

  private IAbstractChecker<ModelCheckerBuilder.ItemsToCheck, IssueKindReportItem> createChecker(final List<IChecker<SModel, ? extends IssueKindReportItem>> specificModelCheckers, final List<IChecker<SModule, ? extends IssueKindReportItem>> specificModuleCheckers) {
    return new IAbstractChecker<ModelCheckerBuilder.ItemsToCheck, IssueKindReportItem>() {
      public void check(ModelCheckerBuilder.ItemsToCheck itemsToCheck, SRepository repository, Consumer<? super IssueKindReportItem> errorCollector, ProgressMonitor monitor) {
        List<SModule> modules = itemsToCheck.modules;
        modules = ListSequence.fromList(modules).translate(new ITranslator2<SModule, SModule>() {
          public Iterable<SModule> translate(SModule it) {
            return myModelExtractor.getSubModules(it);
          }
        }).toListSequence();
        int work = ListSequence.fromList(itemsToCheck.models).count() + ListSequence.fromList(itemsToCheck.modules).count() + ListSequence.fromList(modules).translate(new ITranslator2<SModule, SModel>() {
          public Iterable<SModel> translate(SModule it) {
            return myModelExtractor.getModels(it);
          }
        }).count();
        monitor.start("Checking", work);

        try {
          IAbstractChecker<SModule, ? extends IssueKindReportItem> generalModuleChecker = aggreagateSpecificCheckers(specificModuleCheckers, new _FunctionTypes._return_P1_E0<String, SModule>() {
            public String invoke(SModule m) {
              return m.getModuleName();
            }
          });
          IAbstractChecker<SModel, ? extends IssueKindReportItem> generalModelChecker = skipNullModules(aggreagateSpecificCheckers(specificModelCheckers, new _FunctionTypes._return_P1_E0<String, SModel>() {
            public String invoke(SModel m) {
              return m.getName().getLongName();
            }
          }));

          for (SModel model : ListSequence.fromList(itemsToCheck.models)) {
            generalModelChecker.check(model, repository, errorCollector, monitor.subTask(1, SubProgressKind.REPLACING));
            if (monitor.isCanceled()) {
              break;
            }
          }


          for (SModule module : ListSequence.fromList(modules)) {
            generalModuleChecker.check(module, repository, errorCollector, monitor.subTask(1, SubProgressKind.REPLACING));
            if (monitor.isCanceled()) {
              break;
            }
            for (SModel model : ListSequence.fromList(myModelExtractor.getModels(module))) {
              generalModelChecker.check(model, repository, errorCollector, monitor.subTask(1, SubProgressKind.REPLACING));
              if (monitor.isCanceled()) {
                break;
              }
            }
          }
        } finally {
          monitor.done();
        }
      }
    };
  }

  public static <O> IAbstractChecker<O, IssueKindReportItem> wrapWithFiltering(IAbstractChecker<O, ? extends IssueKindReportItem> specificChecker, final String checkerName) {
    return new FilteringChecker<O, IssueKindReportItem>(specificChecker, new _FunctionTypes._return_P2_E0<Boolean, IssueKindReportItem, SRepository>() {
      public Boolean invoke(IssueKindReportItem item, SRepository repository) {
        SNodeReference nodeRef = NodeReportItem.FLAVOUR_NODE.tryToGet(item);
        if (nodeRef != null) {
          SNode node = nodeRef.resolve(repository);
          if (ErrorReportUtil.shouldReportError(node)) {
            return true;
          } else {
            if (LOG.isInfoEnabled()) {
              LOG.info("Specific checker " + checkerName + " returned error that is supposed to be skipped. Node " + nodeRef.getNodeId() + " in model " + nodeRef.getModelReference());
            }
            return false;
          }
        } else {
          return true;
        }
      }
    });
  }

  public static IAbstractChecker<SModel, IssueKindReportItem> skipNullModules(IAbstractChecker<SModel, IssueKindReportItem> checker) {
    return new SkippingChecker<SModel, IssueKindReportItem>(checker, new _FunctionTypes._return_P2_E0<Boolean, SModel, SRepository>() {
      public Boolean invoke(SModel model, SRepository repository) {
        SModule module = model.getModule();
        if (module == null) {
          if (LOG.isEnabledFor(Level.WARN)) {
            LOG.warn("Module is null for " + model.getName() + " model");
          }
          return false;
        }
        return true;
      }
    });
  }

  public static <O> IAbstractChecker<O, IssueKindReportItem> aggreagateSpecificCheckers(@NotNull List<IChecker<O, ? extends IssueKindReportItem>> specificCheckers, final _FunctionTypes._return_P1_E0<? extends String, ? super O> getFqName) {
    AggregatingChecker<O, IssueKindReportItem> aggregation = new AggregatingChecker<O, IssueKindReportItem>(ListSequence.fromList(specificCheckers).select(new ISelector<IChecker<O, ? extends IssueKindReportItem>, CatchingChecker<O, IssueKindReportItem>>() {
      public CatchingChecker<O, IssueKindReportItem> select(IChecker<O, ? extends IssueKindReportItem> specificChecker) {
        return new CatchingChecker<O, IssueKindReportItem>(wrapWithFiltering(new CategoryShowingChecker<O, IssueKindReportItem>(specificChecker), specificChecker.toString()), new _FunctionTypes._return_P3_E0<String, O, Exception, SRepository>() {
          public String invoke(O m, Exception e, SRepository repository) {
            return "Exception while checking model " + getFqName.invoke(m);
          }
        });
      }
    }).toListSequence(), getFqName);
    return aggregation;
  }
}
