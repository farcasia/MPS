package jetbrains.mps.tool.gentest.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.facet.ITargetEx2;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.resources.GResource;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.facet.ITargetEx;
import java.util.stream.IntStream;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.tool.builder.unittest.UnitTestOutputReader;
import java.io.IOException;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.tool.builder.unittest.UnitTestListener;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class Test_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.tool.gentest.Test");
  public Test_Facet() {
    ListSequence.fromList(targets).addElement(new Test_Facet.Target_collectTest());
    ListSequence.fromList(targets).addElement(new Test_Facet.Target_runTests());
  }
  public Iterable<ITarget> targets() {
    return targets;
  }
  public Iterable<IFacet.Name> optional() {
    return null;
  }
  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen")});
  }
  public Iterable<IFacet.Name> extended() {
    return null;
  }
  public IFacet.Name getName() {
    return this.name;
  }
  public IPropertiesPersistence propertiesPersistence() {
    return new Test_Facet.TargetProperties();
  }
  public static class Target_collectTest implements ITargetEx2 {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.tool.gentest.Test.collectTest");
    public Target_collectTest() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_rwbd_a0a = null;
          final Iterable<GResource> input = (Iterable<GResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
              for (final GResource gr : Sequence.fromIterable(input)) {
                final Wrappers._T<List<String>> tests = new Wrappers._T<List<String>>();
                // FIXME here, shall not use makeSession.getProject().getModelAccess(), but instead, shall lock 
                // repository of a transient model. Expose it either with GenerationStatus or GResource 
                ModelAccess.instance().runReadAction(new Runnable() {
                  public void run() {
                    SModel outModel = gr.status().getOutputModel();
                    tests.value = Sequence.fromIterable(new TestCollector(Sequence.<SModel>singleton(outModel)).collectTests()).toListSequence();
                  }
                });
                if (ListSequence.fromList(tests.value).isNotEmpty()) {
                  _output_rwbd_a0a = Sequence.fromIterable(_output_rwbd_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new Tester(gr.module(), tests.value))));
                }
              }
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_rwbd_a0a);
          }
        }
      };
    }
    public IConfig createConfig() {
      return null;
    }
    public Iterable<ITarget.Name> notAfter() {
      return null;
    }
    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.Generate.generate")});
    }
    public Iterable<ITarget.Name> notBefore() {
      return null;
    }
    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.TextGen.textGen")});
    }
    public ITarget.Name getName() {
      return name;
    }
    public boolean isOptional() {
      return false;
    }
    public boolean requiresInput() {
      return true;
    }
    public boolean producesOutput() {
      return true;
    }
    public Iterable<Class<? extends IResource>> expectedInput() {
      List<Class<? extends IResource>> rv = ListSequence.fromList(new ArrayList<Class<? extends IResource>>());
      ListSequence.fromList(rv).addElement(GResource.class);
      return rv;
    }
    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }
    public <T> T createParameters(Class<T> cls) {
      return null;
    }
    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      return t;
    }
    public int workEstimate() {
      return 1000;
    }
  }
  public static class Target_runTests implements ITargetEx {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.tool.gentest.Test.runTests");
    public Target_runTests() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_rwbd_a0b = null;
          final Iterable<ITestResource> input = (Iterable<ITestResource>) (Iterable) rawInput;
          progressMonitor.start("", IntStream.of(1000).sum());
          switch (0) {
            case 0:
              if (vars(pa.global()).testListener() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("No test listener provided, stopping")));
                return new IResult.FAILURE(_output_rwbd_a0b);
              }
              final ProgressMonitor subProgress_b0a0b = progressMonitor.subTask(1000);
              subProgress_b0a0b.start("Testing", Sequence.fromIterable(input).count() * 100);
              for (ITestResource resource : Sequence.fromIterable(input)) {
                String fqn = resource.getModule().getModuleName();
                subProgress_b0a0b.advance(1);
                subProgress_b0a0b.step(fqn);
                ProcessBuilder pb = new ProcessBuilder(resource.buildCommandLine());
                try {
                  Process process = pb.start();
                  UnitTestOutputReader reader = new UnitTestOutputReader(process, vars(pa.global()).testListener());
                  int exitCode = reader.start();
                  if (exitCode != 0) {
                    monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("Process Exited With Code " + exitCode)));
                  }
                } catch (IOException ioe) {
                  monitor.reportFeedback(new IFeedback.ERROR(String.valueOf(ioe.getMessage())));
                }
                subProgress_b0a0b.advance(99);
                subProgress_b0a0b.step(fqn);
              }
              subProgress_b0a0b.done();
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_rwbd_a0b);
          }
        }
      };
    }
    public IConfig createConfig() {
      return null;
    }
    public Iterable<ITarget.Name> notAfter() {
      return null;
    }
    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.tool.gentest.Test.collectTest")});
    }
    public Iterable<ITarget.Name> notBefore() {
      return null;
    }
    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.make.facets.Make.make")});
    }
    public ITarget.Name getName() {
      return name;
    }
    public boolean isOptional() {
      return true;
    }
    public boolean requiresInput() {
      return true;
    }
    public boolean producesOutput() {
      return true;
    }
    public Iterable<Class<? extends IResource>> expectedInput() {
      List<Class<? extends IResource>> rv = ListSequence.fromList(new ArrayList<Class<? extends IResource>>());
      ListSequence.fromList(rv).addElement(ITestResource.class);
      return rv;
    }
    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }
    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Parameters());
    }
    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((Tuples._1) t).assign((Tuples._1) copyFrom);
      }
      return t;
    }
    public static Test_Facet.Target_runTests.Parameters vars(IPropertiesPool ppool) {
      return ppool.properties(name, Test_Facet.Target_runTests.Parameters.class);
    }
    public static class Parameters extends MultiTuple._1<UnitTestListener> {
      public Parameters() {
        super();
      }
      public Parameters(UnitTestListener testListener) {
        super(testListener);
      }
      public UnitTestListener testListener(UnitTestListener value) {
        return super._0(value);
      }
      public UnitTestListener testListener() {
        return super._0();
      }
    }
  }
  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }
    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.tool.gentest.Test.runTests");
        if (properties.hasProperties(name)) {
          Test_Facet.Target_runTests.Parameters props = properties.properties(name, Test_Facet.Target_runTests.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.tool.gentest.Test.runTests.testListener", null);
        }
      }
    }
    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.tool.gentest.Test.runTests");
          Test_Facet.Target_runTests.Parameters props = properties.properties(name, Test_Facet.Target_runTests.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.tool.gentest.Test.runTests.testListener")) {
            props.testListener(null);
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}
