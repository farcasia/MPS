package jetbrains.mps.tool.builder.make;

/*Generated by MPS */

import jetbrains.mps.tool.common.IMessageFormat;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.tool.common.Script;
import jetbrains.mps.tool.builder.MpsWorker;
import java.io.File;
import java.io.IOException;
import jetbrains.mps.project.Project;
import java.util.Set;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.Computable;
import java.util.Collection;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;
import java.util.ArrayList;
import jetbrains.mps.make.script.PropertyPoolInitializer;
import jetbrains.mps.internal.make.cfg.MakeFacetInitializer;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.tool.builder.unittest.UnitTestListener;
import jetbrains.mps.internal.make.cfg.JavaCompileFacetInitializer;
import jetbrains.mps.make.script.IScriptController;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import java.util.concurrent.ExecutionException;
import org.jetbrains.mps.openapi.module.ModelAccess;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.progress.EmptyProgressMonitor;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.AbstractModule;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import java.util.LinkedList;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.tool.common.TeamCityMessageFormat;
import jetbrains.mps.tool.common.ScriptProperties;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.tool.builder.unittest.UnitTestAdapter;
import jetbrains.mps.tool.builder.unittest.ITestReporter;
import jetbrains.mps.tool.builder.unittest.XmlTestReporter;
import jetbrains.mps.tool.builder.unittest.ConsoleTestReporter;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import jetbrains.mps.progress.ProgressMonitorBase;
import org.jetbrains.mps.openapi.util.SubProgressKind;

public class GenTestWorker extends BaseGeneratorWorker {
  private final GenTestWorker.MyMessageHandler myMessageHandler = new GenTestWorker.MyMessageHandler();
  private boolean myTestFailed = false;
  private IMessageFormat myBuildServerMessageFormat;
  private Map<String, String> path2tmp = MapSequence.fromMap(new HashMap<String, String>());
  private String tmpPath;
  private GenTestWorker.MyReporter myReporter = new GenTestWorker.MyReporter();

  public GenTestWorker(Script whatToDo, MpsWorker.AntLogger logger) {
    super(whatToDo, logger);
    myBuildServerMessageFormat = getBuildServerMessageFormat();
    File tmpDir;
    try {
      tmpDir = File.createTempFile("gentest_", "tmp");
      tmpDir.delete();
      tmpDir.mkdir();
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
    this.tmpPath = tmpDir.getAbsolutePath();
  }

  @Override
  public void work() {
    myReporter.init();
    setGenerationProperties();
    final Project project = createDummyProject();

    Set<SModule> modules = new ModelAccessHelper(project.getModelAccess()).runWriteAction(new Computable<Set<SModule>>() {
      public Set<SModule> compute() {
        return collectFromModuleFiles(project.getRepository());
      }
    });

    if (!(modules.isEmpty())) {
      loadAndMake(project, modules);
      generate(project, modules);
    } else {
      error("Could not find anything to test.");
    }

    myReporter.finishRun();
    showStatistic();
  }


  @Override
  protected void dispose() {
    cleanUp();
    super.dispose();
  }

  @Override
  protected void generate(Project project, Collection<SModule> modules) {
    StringBuffer s = new StringBuffer("Generating:");
    for (SModule m : modules) {
      s.append("\n    ");
      s.append(m);
    }
    info(s.toString());

    final _FunctionTypes._void_P1_E0<? super String> startTestFormat = new _FunctionTypes._void_P1_E0<String>() {
      public void invoke(String msg) {
        myReporter.testStarted(((msg == null ? null : msg.trim())));
      }
    };
    final _FunctionTypes._void_P1_E0<? super String> finishTestFormat = new _FunctionTypes._void_P1_E0<String>() {
      public void invoke(String msg) {
        myReporter.testFinished(((msg == null ? null : msg.trim())));
      }
    };

    final MakeSession ms = new MakeSession(project, myMessageHandler, true) {
      @Override
      public IScript toScript(ScriptBuilder scriptBuilder) {
        if (isInvokeTestsSet()) {
          scriptBuilder.withFacetName(new IFacet.Name("jetbrains.mps.tool.gentest.Test"));
        }
        if (isShowDiff()) {
          scriptBuilder.withFacetName(new IFacet.Name("jetbrains.mps.tool.gentest.Diff"));
        }
        return scriptBuilder.toScript();
      }
    };
    ArrayList<PropertyPoolInitializer> ppi = new ArrayList<PropertyPoolInitializer>();
    ppi.add(new MakeFacetInitializer().setPathToFile(new _FunctionTypes._return_P1_E0<IFile, String>() {
      public IFile invoke(String path) {
        return tmpFile(path);
      }
    }));
    if (isShowDiff()) {
      PropertyPoolInitializer diffFacetInit = new PropertyPoolInitializer() {
        public void populate(IPropertiesPool ppool) {
          Tuples._2<_FunctionTypes._return_P1_E0<? extends String, ? super IFile>, Set<File>> dparams = (Tuples._2<_FunctionTypes._return_P1_E0<? extends String, ? super IFile>, Set<File>>) ppool.properties(new ITarget.Name("jetbrains.mps.tool.gentest.Diff.diff"), Object.class);
          if (dparams != null) {
            dparams._0(new _FunctionTypes._return_P1_E0<String, IFile>() {
              public String invoke(IFile f) {
                return pathOfTmpFile(f);
              }
            });
            dparams._1(myWhatToDo.getExcludedFromDiffFiles());
          }
        }
      };
      ppi.add(diffFacetInit);
    }
    if (isInvokeTestsSet()) {
      PropertyPoolInitializer testFacetInit = new PropertyPoolInitializer() {
        public void populate(IPropertiesPool ppool) {
          Tuples._1<UnitTestListener> testParams = (Tuples._1<UnitTestListener>) ppool.properties(new ITarget.Name("jetbrains.mps.tool.gentest.Test.runTests"), Object.class);
          if (testParams != null) {
            testParams._0(new GenTestWorker.MyUnitTestAdapter());
          }
        }
      };
      ppi.add(testFacetInit);
    }
    ppi.add(new JavaCompileFacetInitializer().setJavaCompileOptions(myJavaCompilerOptions));

    IScriptController ctl = new IScriptController.Stub2(ms, ppi.toArray(new PropertyPoolInitializer[ppi.size()]));
    try {
      BuildMakeService bms = new BuildMakeService();
      myReporter.finishRun();
      myReporter.startRun(myWhatToDo.getProperty("ant.project.name"));
      Future<IResult> result = bms.make(ms, collectResources(project, modules), null, ctl, new GenTestWorker.MyProgressMonitorBase(startTestFormat, finishTestFormat));
      if (!(result.get().isSucessful())) {
        myErrors.add("Make was not successful " + result.get().output());
      }
    } catch (InterruptedException e) {
      myErrors.add(e.toString());
    } catch (ExecutionException e) {
      myErrors.add(e.toString());
    }
  }

  private void loadAndMake(final Project project, final Collection<SModule> modules) {
    ModelAccess access = project.getRepository().getModelAccess();
    access.runReadAction(new Runnable() {
      public void run() {
        new ModuleMaker().make(modules, new EmptyProgressMonitor() {
          @Override
          public void step(String text) {
            // silently 
          }
          @Override
          public void start(@NotNull String taskName, int work) {
            // silently 
          }
        }, myJavaCompilerOptions);
      }
    });
    access.runWriteAction(new Runnable() {
      public void run() {
        // the following updates stub models that could change due to the compilation happened (webr, 3.0 migration case) 
        for (SModule m : project.getRepository().getModules()) {
          if (!((m instanceof AbstractModule))) {
            continue;
          }
          ((AbstractModule) m).updateModelsSet();
        }
      }
    });
  }

  private void reportIfStartsWith(String prefix, String work, _FunctionTypes._void_P1_E0<? super String> format) {
    // This logic looks flawed (how come test name ends with ".Test.Generating"), but as long as GenTestWorker doesn't work, I can't figure out what's right 
    if (work != null && work.startsWith(prefix)) {
      format.invoke(work.substring(prefix.length()) + ".Test." + ((prefix == null ? null : prefix.trim())));
    }
  }

  private void cleanUp() {
    for (Queue<File> dirs = QueueSequence.fromQueueAndArray(new LinkedList<File>(), new File(tmpPath)); QueueSequence.fromQueue(dirs).isNotEmpty();) {
      File dir = QueueSequence.fromQueue(dirs).removeFirstElement();
      dir.deleteOnExit();
      for (File f : dir.listFiles()) {
        if (f.isDirectory()) {
          QueueSequence.fromQueue(dirs).addLastElement(f);
        } else {
          f.deleteOnExit();
        }
      }
    }
    this.tmpPath = null;
    MapSequence.fromMap(path2tmp).clear();
  }

  private IFile tmpFile(String path) {
    if (MapSequence.fromMap(path2tmp).containsKey(path)) {
      return FileSystem.getInstance().getFileByPath(MapSequence.fromMap(path2tmp).get(path));
    }
    int idx = path.indexOf("/");
    if (idx > 0) {
      throw new IllegalArgumentException("not an absolute path '" + path + "'");
    }
    idx = (idx < 0 ? path.indexOf(File.separator) : idx);
    if (idx > "C:\\".length() && path.indexOf(":") < 0) {
      throw new IllegalArgumentException("not an absolute path '" + path + "'");
    }
    String tmp = tmpPath + "/" + ((idx != 0 ? path.replace(":", "_w_") : path.substring(1)));
    MapSequence.fromMap(path2tmp).put(path, tmp);
    return FileSystem.getInstance().getFileByPath(tmp);
  }

  private String pathOfTmpFile(IFile file) {
    String p = file.getPath();
    if (!(p.startsWith(tmpPath))) {
      throw new IllegalArgumentException("unknown tmp path '" + file.getParent() + "'");
    }
    p = p.substring(tmpPath.length() + 1);
    if (p.contains("_w_")) {
      return FileSystem.getInstance().getFileByPath(p.replace("_w_", ":")).getPath();
    }
    String prefix = (File.separatorChar == '/' ? "/" : "\\\\");
    return FileSystem.getInstance().getFileByPath(prefix + p).getPath();
  }

  public IMessageFormat getBuildServerMessageFormat() {
    if (isRunningOnTeamCity()) {
      return new TeamCityMessageFormat();
    } else {
      return new ConsoleMessageFormat();
    }
  }

  private boolean isRunningOnTeamCity() {
    return myWhatToDo.getProperty("teamcity.version") != null;
  }

  private boolean isInvokeTestsSet() {
    return Boolean.parseBoolean(myWhatToDo.getProperty(ScriptProperties.INVOKE_TESTS)) && isCompileSet();
  }

  private boolean isCompileSet() {
    return Boolean.parseBoolean(myWhatToDo.getProperty(ScriptProperties.COMPILE));
  }

  private boolean isShowDiff() {
    return Boolean.parseBoolean(myWhatToDo.getProperty(ScriptProperties.SHOW_DIFF));
  }

  @Override
  protected void showStatistic() {
    super.showStatistic();
    if (myTestFailed) {
      throw new RuntimeException("Tests Failed");
    }
  }

  public static void main(String[] args) {
    GenTestWorker generator = new GenTestWorker(Script.fromDumpInFile(new File(args[0])), new MpsWorker.SystemOutLogger());
    generator.workFromMain();
  }

  private class MyMessageHandler implements IMessageHandler {
    public MyMessageHandler() {
    }
    @Override
    public void handle(@NotNull IMessage msg) {
      switch (msg.getKind()) {
        case ERROR:
          GenTestWorker.this.error(msg.getText());
          myReporter.errorLine("[ERROR] " + msg.getText());
          // next code used to be in JobMonitor.reportFeedback, but as long as all feedback is piped to MyMessageHandler,  
          // the code relocated here, and is activated only when there's active test (although I doubt getCurrentTestName() ever gives 
          // reasonable value - mechanism to find out current test looks quite odd, see reportIfStartsWith() 
          String test = myReporter.getCurrentTestName();
          if (test != null) {
            Throwable thr = msg.getException();
            String text = msg.getText();
            String details = (thr == null ? "(no details)" : String.valueOf(MpsWorker.extractStackTrace(thr)));
            int eol = text.indexOf("\n");
            if (eol >= 0) {
              details = text.substring(eol + 1) + "\n" + details;
              text = text.substring(0, eol);
            }
            myReporter.testFailed(test, text, details);
          }
          break;
        case WARNING:
          GenTestWorker.this.warning(msg.getText());
          myReporter.outputLine("[WARNING]" + msg.getText());
          break;
        case INFORMATION:
          GenTestWorker.this.info(msg.getText());
          myReporter.outputLine("[INFO]" + msg.getText());
          break;
        default:
      }
    }
  }

  private class MyUnitTestAdapter extends UnitTestAdapter {
    private MyUnitTestAdapter() {
    }
    @Override
    public void testStarted(String testName) {
      myReporter.testStarted(testName);
    }
    @Override
    public void testFailed(String test, String message, String details) {
      myReporter.testFailed(test, message, details);
      myTestFailed = true;
    }
    @Override
    public void testFinished(String testName) {
      myReporter.testFinished(testName);
    }
    @Override
    public void logMessage(String message) {
      if (message != null && !(message.isEmpty())) {
        info(message);
        myReporter.outputLine(message);
      }
    }
    @Override
    public void logError(String errorMessage) {
      if (errorMessage != null && !(errorMessage.isEmpty())) {
        error(errorMessage);
        myReporter.errorLine(errorMessage);
      }
    }
  }

  private class MyReporter {
    private ITestReporter testReporter;
    private String currentTestName;
    private File gentestdir;
    private MyReporter() {
    }
    private void init() {
      if (gentestdir != null) {
        return;
      }
      if (isRunningOnTeamCity()) {
        String wd = myWhatToDo.getProperty("mps.gentest.reportsDir");
        wd = (wd == null ? System.getProperty("user.dir") : wd);
        gentestdir = new File(wd, ".gentest");
        if (!(gentestdir.exists())) {
          if (!(gentestdir.mkdirs())) {
            File tmpDir;
            try {
              tmpDir = File.createTempFile("gentest", "reports");
              tmpDir.delete();
              tmpDir.mkdir();
            } catch (IOException ex) {
              throw new RuntimeException(ex);
            }
            gentestdir = tmpDir;
          }
        } else if (gentestdir.isDirectory()) {
          for (File f : gentestdir.listFiles()) {
            f.delete();
          }
        }
      }
    }
    private String getCurrentTestName() {
      return currentTestName;
    }
    private void startRun(String name) {
      this.testReporter = (isRunningOnTeamCity() ? new XmlTestReporter(name) : new ConsoleTestReporter());
    }
    private void finishRun() {
      if (testReporter == null) {
        return;
      }
      if (currentTestName != null) {
        testReporter.testFinished(currentTestName);
      }
      testReporter.runFinished();
      if (isRunningOnTeamCity()) {
        BufferedOutputStream os = null;
        try {
          File reportFile = File.createTempFile("gentest_report-", ".xml", gentestdir);
          os = new BufferedOutputStream(new FileOutputStream(reportFile));
          ((XmlTestReporter) testReporter).dump(os);
          System.out.println("##teamcity[importData type='junit' path='" + reportFile.getAbsolutePath() + "']");
        } catch (IOException ex) {
        } finally {
          if (os != null) {
            try {
              os.close();
            } catch (IOException ignore) {
            }
          }
        }
      }
      this.testReporter = null;
    }
    private String normalizeTestName(String name) {
      return name.replace("@", "_");
    }
    private void testStarted(String testname) {
      testname = normalizeTestName(testname);
      if (currentTestName != null) {
        testReporter.testFinished(currentTestName);
      }
      this.currentTestName = testname;
      testReporter.testStarted(testname);
    }
    private void testFinished(String testname) {
      testname = normalizeTestName(testname);
      testReporter.testFinished(testname);
      this.currentTestName = null;
    }
    private void testFailed(String testname, String msg, String longmsg) {
      testname = normalizeTestName(testname);
      testReporter.testFailed(testname, msg, longmsg);
    }
    private void outputLine(String out) {
      if (currentTestName != null) {
        testReporter.testOutputLine(currentTestName, out);
      } else if (testReporter != null) {
        testReporter.outputLine(out);
      } else {
        System.out.println(out);
      }
    }
    private void errorLine(String err) {
      if (currentTestName != null) {
        testReporter.testErrorLine(currentTestName, err);
      } else if (testReporter != null) {
        testReporter.errorLine(err);
      } else {
        System.err.println(err);
      }
    }
  }

  private class MyProgressMonitorBase extends ProgressMonitorBase {
    private String prevTitle;
    private final _FunctionTypes._void_P1_E0<? super String> myStartTestFormat;
    private final _FunctionTypes._void_P1_E0<? super String> myFinishTestFormat;
    public MyProgressMonitorBase(_FunctionTypes._void_P1_E0<? super String> startTestFormat, _FunctionTypes._void_P1_E0<? super String> finishTestFormat) {
      myStartTestFormat = startTestFormat;
      myFinishTestFormat = finishTestFormat;
    }
    @Override
    protected void update(double p0) {
    }
    @Override
    protected void startInternal(String text) {
    }
    @Override
    protected void doneInternal(String text) {
    }
    @Override
    protected void setTitleInternal(String text) {
      prevTitle = text;
    }
    @Override
    protected void setStepInternal(String p0) {
    }
    @Override
    public boolean isCanceled() {
      return false;
    }
    @Override
    public void cancel() {
    }
    private ProgressMonitorBase.SubProgressMonitor customSubProgress(ProgressMonitorBase parent, int work, SubProgressKind kind) {
      if (prevTitle != null && prevTitle.startsWith("Generating :: ")) {
        return new ProgressMonitorBase.SubProgressMonitor(parent, work, kind) {
          @Override
          protected void startInternal(String text) {
            reportIfStartsWith("Generating ", "Generating " + text, MyProgressMonitorBase.this.myStartTestFormat);
          }
          @Override
          protected void doneInternal(String text) {
            reportIfStartsWith("Generating ", "Generating " + text, MyProgressMonitorBase.this.myFinishTestFormat);
          }
        };
      }
      return new ProgressMonitorBase.SubProgressMonitor(parent, work, kind) {
        @Override
        protected ProgressMonitorBase.SubProgressMonitor subTaskInternal(int work, SubProgressKind kind) {
          return customSubProgress(this, work, kind);
        }
      };
    }
    @Override
    protected ProgressMonitorBase.SubProgressMonitor subTaskInternal(int work, SubProgressKind kind) {
      return customSubProgress(this, work, kind);
    }
  }
}
