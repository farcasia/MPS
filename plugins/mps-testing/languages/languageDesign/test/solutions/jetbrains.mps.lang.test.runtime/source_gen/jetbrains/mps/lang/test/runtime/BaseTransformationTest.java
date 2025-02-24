package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import jetbrains.mps.tool.environment.EnvironmentAware;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.project.Project;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.tool.environment.Environment;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import jetbrains.mps.util.MacrosFactory;
import java.io.File;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.ide.ThreadUtils;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.module.ReloadableModule;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.smodel.tempmodel.TemporaryModels;
import jetbrains.mps.smodel.tempmodel.TempModuleOptions;
import jetbrains.mps.generator.impl.CloneUtil;
import org.junit.After;

public abstract class BaseTransformationTest implements TransformationTest, EnvironmentAware {
  private static final Logger LOG = LogManager.getLogger(BaseTransformationTest.class);
  private Project myProject;
  private SModel myModel;
  private SModel myTransientModel;
  private TestRunner myRunner;
  private final TestParametersCache myParamCache;
  private Environment myEnvironment;

  public BaseTransformationTest() {
    myParamCache = null;
  }

  protected BaseTransformationTest(TestParametersCache paramCache) {
    myParamCache = paramCache;
  }

  @Override
  public void setEnvironment(@NotNull Environment env) {
    myEnvironment = env;
  }

  @Override
  public void setTestRunner(TestRunner runner) {
    myRunner = runner;
  }

  @Override
  public TestRunner getTestRunner() {
    return myRunner;
  }

  @Before
  public void setup() throws Exception {
    if (myParamCache != null) {
      //  invokes this.initTest() for the first test in the class, reuse initialized values for subsequent tests from the same class 
      myParamCache.populate(this);
    }
  }

  public void initTest(@NotNull String projectPath, final String model) throws Exception {
    initTest(projectPath, model, false);
  }

  public void initTest(@NotNull String projectPath, final String model, boolean reOpenProject) throws Exception {
    if (myRunner != null) {
      //  fallback for tests that still use TestRunner (e.g. editor tests from mps-as-idea-plugin) 
      myRunner.initTest(this, projectPath, model, reOpenProject);
    } else {
      // MPS's in-process, out-of-process and ant script executors supply Environment through EnvironmentAware and custom RunnerBuilder  
      // namely, PushEnvironmentRunnerBuilder. IDEA MPS plugin and IDEA test configurations use this RunnerBuilder, too. 
      if (myEnvironment == null) {
        String m = String.format("Test %s needs an Environment instance to access %s project instance", getClass().getName(), projectPath);
        throw new IllegalStateException(m);
      }
      if (LOG.isInfoEnabled()) {
        LOG.info("Initializing the test");
      }

      // FIXME can access MacrosFactory through environment.getPlatform, if necessary. 
      String expandedProjectPath = MacrosFactory.getGlobal().expandPath(projectPath);
      if ((expandedProjectPath == null || expandedProjectPath.length() == 0)) {
        throw new IllegalStateException("You shall specify project path with TestInfo root.");
      }
      File projectToOpen = new File(expandedProjectPath);
      Project p = myEnvironment.openProject(projectToOpen);
      if (reOpenProject) {
        myEnvironment.closeProject(p);
        p = myEnvironment.openProject(projectToOpen);
      }
      setProject(p);
      final SRepository repository = p.getRepository();
      Exception exception = ThreadUtils.runInUIThreadAndWait(new Runnable() {
        public void run() {
          // FIXME drop command, needed for transient/temp model initialization only 
          repository.getModelAccess().executeCommand(new Runnable() {
            @Override
            public void run() {
              SModelReference modelRef = PersistenceFacade.getInstance().createModelReference(model);
              SModel modelDescriptor = modelRef.resolve(repository);
              if (modelDescriptor == null) {
                throw new IllegalStateException(String.format("Can't find model %s in supplied repository %s.", model, repository));
              }
              BaseTransformationTest.this.setModelDescriptor(modelDescriptor);
              // FIXME drop init(), move to TestParametersCache 
              BaseTransformationTest.this.init();
            }
          });
        }
      });
      if (exception != null) {
        throw new RuntimeException(exception);
      }

      // XXX do I need that? 
      myEnvironment.flushAllEvents();
    }
  }

  public void runTest(final String className, final String methodName, final boolean runInCommand) throws Throwable {
    if (LOG.isInfoEnabled()) {
      LOG.info("Running the test " + methodName);
    }
    final Wrappers._T<Class> clazz = new Wrappers._T<Class>();
    final Throwable[] error = new Throwable[1];

    getProject().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        final SModule module = getModelDescriptor().getModule();
        if (!(module instanceof ReloadableModule)) {
          error[0] = new IllegalArgumentException("module" + module + " is not reloadable -- cannot run tests in it");
          return;
        }
        try {
          clazz.value = ((ReloadableModule) module).getOwnClass(className);
        } catch (Throwable t) {
          error[0] = t;
        }
      }
    });
    if (error[0] != null) {
      throw error[0];
    }

    final Object obj = clazz.value.newInstance();
    clazz.value.getField("myModel").set(obj, getTransientModelDescriptor());
    clazz.value.getField("myProject").set(obj, getProject());
    if (runInCommand) {
      ThreadUtils.runInUIThreadAndWait(new Runnable() {
        public void run() {
          getProject().getModelAccess().executeCommand(new Runnable() {
            public void run() {
              error[0] = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
            }
          });
        }
      });
    } else {
      error[0] = this.tryToRunTest(clazz.value, methodName, obj);
    }
    if (error[0] != null) {
      if (LOG.isInfoEnabled()) {
        LOG.info("Test failed");
      }
      throw error[0];
    }
    if (LOG.isInfoEnabled()) {
      LOG.info("Test passed");
    }
  }

  /*package*/ Throwable tryToRunTest(Class clazz, String methodName, Object obj) {
    Throwable exception = null;
    try {
      clazz.getMethod(methodName).invoke(obj);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      exception = e.getTargetException();
    }
    return exception;
  }

  /**
   * FIXME Poor/unspecified contract. The method used to be invoked only once for a class with tests, although it's not apparent from the name.
   */
  @Override
  public void init() {
    // if we got here with myParamCache != null, it means it is being initialized, has invoked runner.initTest() which in turn got here. 
    // In this case, the code below shall move into TestParametersCache which is responsible to manage (i.e. dispose) transient model. 
    // However, for transition/migration period, we create a transient model here and let TPC pick it afterwards. This is to support tests that do not use 
    // TestParametersCache as ClassRule 
    // FIXME move to TestParametersCache as there are no more tests that do not supply paramCache at construction time.  
    // XXX UNLESS THERE ARE MBEDDR TESTS THAT SUBCLASS OURS! 
    this.myTransientModel = TemporaryModels.getInstance().create(false, TempModuleOptions.forDefaultModule());
    new CloneUtil(this.myModel, this.myTransientModel).cloneModelWithAllImports();
  }

  /**
   * FIXME explain/justify contract, see {@link jetbrains.mps.lang.test.runtime.BaseTransformationTest#init() }
   */
  @Override
  public void dispose() {
    TemporaryModels.getInstance().dispose(myTransientModel);
    myTransientModel = null;
  }

  @After
  public void tearDown() {
    if (myParamCache == null) {
      getProject().getModelAccess().runWriteInEDT(new Runnable() {
        public void run() {
          dispose();
        }
      });
      // otherwise, TPC does this for us after all tests of the class are executed 
    }
  }

  @Override
  public SModel getModelDescriptor() {
    return myModel;
  }

  @Override
  public void setModelDescriptor(SModel descriptor) {
    myModel = descriptor;
  }

  @Override
  public void setTransientModelDescriptor(SModel descriptor) {
    myTransientModel = descriptor;
  }

  @Override
  public SModel getTransientModelDescriptor() {
    return myTransientModel;
  }

  @Override
  public Project getProject() {
    return myProject;
  }

  @Override
  public void setProject(Project project) {
    myProject = project;
  }
}
