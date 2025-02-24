package jetbrains.mps.make.facets;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.facet.ITargetEx2;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.resources.DResource;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.internal.make.runtime.util.DeltaReconciler;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.make.delta.IInternalDelta;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.make.facet.ITargetEx;
import jetbrains.mps.smodel.resources.CleanupActivityResource;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class Make_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.make.facets.Make");
  public Make_Facet() {
    ListSequence.fromList(targets).addElement(new Make_Facet.Target_reconcile());
    ListSequence.fromList(targets).addElement(new Make_Facet.Target_cleanup());
    ListSequence.fromList(targets).addElement(new Make_Facet.Target_make());
  }
  public Iterable<ITarget> targets() {
    return targets;
  }
  public Iterable<IFacet.Name> optional() {
    return null;
  }
  public Iterable<IFacet.Name> required() {
    return null;
  }
  public Iterable<IFacet.Name> extended() {
    return null;
  }
  public IFacet.Name getName() {
    return this.name;
  }
  public IPropertiesPersistence propertiesPersistence() {
    return new Make_Facet.TargetProperties();
  }
  public static class Target_reconcile implements ITargetEx2 {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile");
    public Target_reconcile() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_pm9z_a0a = null;
          final Iterable<DResource> input = (Iterable<DResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
              if (Boolean.TRUE.equals(vars(pa.global()).skipReconcile())) {
                _output_pm9z_a0a = Sequence.fromIterable(_output_pm9z_a0a).concat(Sequence.fromIterable(input));
                return new IResult.SUCCESS(_output_pm9z_a0a);
              }
              progressMonitor.start("Reconciling", 1);
              try {
                FileSystem.getInstance().runWriteTransaction(new Runnable() {
                  public void run() {
                    final List<IFile> writtenFiles = ListSequence.fromList(new ArrayList<IFile>());
                    DeltaReconciler reconciler = new DeltaReconciler(Sequence.fromIterable(input).translate(new ITranslator2<DResource, IDelta>() {
                      public Iterable<IDelta> translate(DResource res) {
                        return res.delta();
                      }
                    }).where(new IWhereFilter<IDelta>() {
                      public boolean accept(IDelta d) {
                        return !(d instanceof IInternalDelta);
                      }
                    }));
                    reconciler.reconcileAll();
                    reconciler.visitAll(new FilesDelta.Visitor() {
                      @Override
                      public boolean acceptWritten(IFile file) {
                        ListSequence.fromList(writtenFiles).addElement(file);
                        return true;
                      }
                    });
                    DeltaReconciler internalReconciler = new DeltaReconciler(Sequence.fromIterable(input).translate(new ITranslator2<DResource, IDelta>() {
                      public Iterable<IDelta> translate(DResource res) {
                        return res.delta();
                      }
                    }).where(new IWhereFilter<IDelta>() {
                      public boolean accept(IDelta d) {
                        return d instanceof IInternalDelta;
                      }
                    }));
                    internalReconciler.reconcileAll();
                    internalReconciler.visitAll(new FilesDelta.Visitor() {
                      @Override
                      public boolean acceptWritten(IFile file) {
                        ListSequence.fromList(writtenFiles).addElement(file);
                        return true;
                      }
                    });
                    FileSystem.getInstance().scheduleUpdateForWrittenFiles(writtenFiles);
                  }
                });
                _output_pm9z_a0a = Sequence.fromIterable(_output_pm9z_a0a).concat(Sequence.fromIterable(input));
              } finally {
                progressMonitor.done();
              }
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_pm9z_a0a);
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
      return null;
    }
    public Iterable<ITarget.Name> notBefore() {
      return null;
    }
    public Iterable<ITarget.Name> before() {
      return null;
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
      ListSequence.fromList(rv).addElement(DResource.class);
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
    public int workEstimate() {
      return 200;
    }
    public static Make_Facet.Target_reconcile.Parameters vars(IPropertiesPool ppool) {
      return ppool.properties(name, Make_Facet.Target_reconcile.Parameters.class);
    }
    public static class Parameters extends MultiTuple._1<Boolean> {
      public Parameters() {
        super();
      }
      public Parameters(Boolean skipReconcile) {
        super(skipReconcile);
      }
      public Boolean skipReconcile(Boolean value) {
        return super._0(value);
      }
      public Boolean skipReconcile() {
        return super._0();
      }
    }
  }
  public static class Target_cleanup implements ITargetEx {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.cleanup");
    public Target_cleanup() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_pm9z_a0b = null;
          final Iterable<CleanupActivityResource> input = (Iterable<CleanupActivityResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
              for (CleanupActivityResource activity : Sequence.fromIterable(input)) {
                activity.run();
              }
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_pm9z_a0b);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile")});
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
      return false;
    }
    public Iterable<Class<? extends IResource>> expectedInput() {
      List<Class<? extends IResource>> rv = ListSequence.fromList(new ArrayList<Class<? extends IResource>>());
      ListSequence.fromList(rv).addElement(CleanupActivityResource.class);
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
  }
  public static class Target_make implements ITargetEx2 {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.make");
    public Target_make() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_pm9z_a0c = null;
          final Iterable<IResource> input = (Iterable<IResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_pm9z_a0c);
          }
        }
      };
    }
    public IConfig createConfig() {
      return new IConfig.Stub() {
        @Override
        public boolean configure(final IConfigMonitor cmonitor, final IPropertiesAccessor pa) {
          switch (0) {
            case 0:
              if (vars(pa.global()).pathToFile() == null) {
                vars(pa.global()).pathToFile(new _FunctionTypes._return_P1_E0<IFile, String>() {
                  public IFile invoke(String p) {
                    return FileSystem.getInstance().getFileByPath(p);
                  }
                });
              }
            default:
              return true;
          }
        }
      };
    }
    public Iterable<ITarget.Name> notAfter() {
      return null;
    }
    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile"), new ITarget.Name("jetbrains.mps.make.facets.Make.cleanup")});
    }
    public Iterable<ITarget.Name> notBefore() {
      return null;
    }
    public Iterable<ITarget.Name> before() {
      return null;
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
      return false;
    }
    public Iterable<Class<? extends IResource>> expectedInput() {
      List<Class<? extends IResource>> rv = ListSequence.fromList(new ArrayList<Class<? extends IResource>>());
      ListSequence.fromList(rv).addElement(IResource.class);
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
    public int workEstimate() {
      return 1;
    }
    public static Make_Facet.Target_make.Parameters vars(IPropertiesPool ppool) {
      return ppool.properties(name, Make_Facet.Target_make.Parameters.class);
    }
    public static class Parameters extends MultiTuple._1<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>> {
      public Parameters() {
        super();
      }
      public Parameters(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile) {
        super(pathToFile);
      }
      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> value) {
        return super._0(value);
      }
      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile() {
        return super._0();
      }
    }
  }
  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }
    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile");
        if (properties.hasProperties(name)) {
          Make_Facet.Target_reconcile.Parameters props = properties.properties(name, Make_Facet.Target_reconcile.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.make.facets.Make.reconcile.skipReconcile", String.valueOf(props.skipReconcile()));
        }
      }
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.make");
        if (properties.hasProperties(name)) {
          Make_Facet.Target_make.Parameters props = properties.properties(name, Make_Facet.Target_make.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.make.facets.Make.make.pathToFile", null);
        }
      }
    }
    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile");
          Make_Facet.Target_reconcile.Parameters props = properties.properties(name, Make_Facet.Target_reconcile.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.make.facets.Make.reconcile.skipReconcile")) {
            props.skipReconcile(Boolean.valueOf(MapSequence.fromMap(store).get("jetbrains.mps.make.facets.Make.reconcile.skipReconcile")));
          }
        }
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.make.facets.Make.make");
          Make_Facet.Target_make.Parameters props = properties.properties(name, Make_Facet.Target_make.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.make.facets.Make.make.pathToFile")) {
            props.pathToFile(null);
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}
