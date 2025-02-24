package jetbrains.mps.tool.builder.make;

/*Generated by MPS */

import jetbrains.mps.tool.builder.MpsWorker;
import jetbrains.mps.tool.common.Script;
import jetbrains.mps.tool.common.GeneratorProperties;
import jetbrains.mps.generator.IModifiableGenerationSettings;
import jetbrains.mps.generator.GenerationSettingsProvider;
import jetbrains.mps.project.Project;
import java.util.Collection;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.smodel.resources.MResource;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.internal.make.cfg.JavaCompileFacetInitializer;
import jetbrains.mps.make.script.IScriptController;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.progress.EmptyProgressMonitor;
import java.util.concurrent.ExecutionException;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.resources.ModelsToResources;
import jetbrains.mps.messages.IMessageHandler;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.messages.IMessage;

public abstract class BaseGeneratorWorker extends MpsWorker {
  public BaseGeneratorWorker(Script whatToDo, MpsWorker.AntLogger logger) {
    super(whatToDo, logger);
  }

  protected void setGenerationProperties() {
    GeneratorProperties gp = new GeneratorProperties(myWhatToDo);
    IModifiableGenerationSettings settings = GenerationSettingsProvider.getInstance().getGenerationSettings();
    boolean strictMode = gp.isStrictMode();
    boolean parallelMode = gp.isParallelMode();
    boolean inplace = gp.isInplaceTransform();
    boolean warnings = !(gp.isHideWarnings());
    int threadCount = gp.getParallelThreads();
    final boolean useStaticRefs = gp.isCreateStaticRefs();
    settings.setStrictMode(strictMode);
    if (strictMode) {
      settings.setParallelGenerator(parallelMode);
      if (parallelMode) {
        settings.setNumberOfParallelThreads(threadCount);
      }
    }
    String[] onoff = new String[]{"on", "off"};
    settings.enableInplaceTransformations(inplace);
    settings.setShowBadChildWarning(warnings);
    settings.setCreateStaticReferences(useStaticRefs);
    settings.setCheckModelsBeforeGeneration(false);
    info(String.format("Generating: strict mode is %s, parallel generation is %s (%d threads), in-place is %s, warnings are %s, static references to replace dynamic is %s", onoff[(strictMode ? 0 : 1)], onoff[(parallelMode ? 0 : 1)], (parallelMode ? threadCount : 1), onoff[(inplace ? 0 : 1)], onoff[(warnings ? 0 : 1)], onoff[(useStaticRefs ? 0 : 1)]));
  }

  protected void showStatistic() {
    failBuild("generation");
  }

  /**
   * 
   * @deprecated use {@link jetbrains.mps.tool.builder.make.BaseGeneratorWorker#generate(Project, Collection<SModule>) } instead
   */
  @Deprecated
  @ToRemove(version = 2018.1)
  protected void generate(Project project, MpsWorker.ObjectsToProcess go) {
    generate(project, go.getModules());
  }

  protected void generate(Project project, Collection<SModule> modules) {
    StringBuffer s = new StringBuffer("Generating:");
    for (SModule m : modules) {
      s.append("\n    ");
      s.append(m);
    }
    info(s.toString());
    Iterable<MResource> resources = Sequence.fromIterable(collectResources(project, modules)).toListSequence();
    myEnvironment.flushAllEvents();
    final MakeSession session = new MakeSession(project, new BaseGeneratorWorker.MyMessageHandler(), true);
    JavaCompileFacetInitializer jcfi = new JavaCompileFacetInitializer().skipCompilation(mySkipCompilation).setJavaCompileOptions(myJavaCompilerOptions);
    IScriptController controller = new IScriptController.Stub2(session, jcfi);
    Future<IResult> res = new BuildMakeService().make(session, resources, null, controller, new EmptyProgressMonitor());

    try {
      if (!(res.get().isSucessful())) {
        myErrors.add("Make was not successful");
      }
    } catch (InterruptedException e) {
      myErrors.add(e.toString());
    } catch (ExecutionException e) {
      myErrors.add(e.toString());
    }
    myEnvironment.flushAllEvents();
  }

  protected Iterable<MResource> collectResources(Project project, final Collection<SModule> modules) {
    // FIXME it's odd to have distinct set of modules but lock repository to access its modules. 
    // Shall rather keem modules as part of the project 
    final Wrappers._T<Iterable<SModel>> models = new Wrappers._T<Iterable<SModel>>(null);
    project.getModelAccess().runReadAction(new Runnable() {
      public void run() {
        for (SModule mod : modules) {
          models.value = Sequence.fromIterable(models.value).concat(Sequence.fromIterable(mod.getModels()));
        }
      }
    });
    // XXX resources() needs model access, isn't it? 
    return Sequence.fromIterable(new ModelsToResources(models.value).resources()).ofType(MResource.class);
  }

  private class MyMessageHandler implements IMessageHandler {
    /*package*/ MyMessageHandler() {
    }

    @Override
    public void handle(@NotNull IMessage msg) {
      switch (msg.getKind()) {
        case ERROR:
          if (msg.getException() != null) {
            BaseGeneratorWorker.this.error(MpsWorker.extractStackTrace(msg.getException()).toString());
          } else {
            BaseGeneratorWorker.this.error(msg.getText());
          }
          break;
        case WARNING:
          BaseGeneratorWorker.this.warning(msg.getText());
          break;
        case INFORMATION:
          BaseGeneratorWorker.this.info(msg.getText());
          break;
        default:
      }
    }
  }
}
