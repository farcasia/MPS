package jetbrains.mps.lang.plugin.plugin;

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
import jetbrains.mps.smodel.resources.TResource;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.internal.make.runtime.util.DeltaReconciler;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import java.util.Objects;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.vfs.IFileUtils;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class CopyPluginXml_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.lang.plugin.CopyPluginXml");
  public CopyPluginXml_Facet() {
    ListSequence.fromList(targets).addElement(new CopyPluginXml_Facet.Target_copyPluginXml());
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
    return new CopyPluginXml_Facet.TargetProperties();
  }
  public static class Target_copyPluginXml implements ITargetEx2 {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml");
    public Target_copyPluginXml() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_ehksfb_a0a = null;
          final Iterable<TResource> input = (Iterable<TResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
              progressMonitor.start("Copying resources", 2);
              progressMonitor.step("plugin.xml");
              try {
                for (TResource tres : Sequence.fromIterable(input)) {
                  String dest = vars(pa.forResource(tres)).pluginRoot();

                  if (dest != null) {
                    final IFile destDir = FileSystem.getInstance().getFileByPath(MacrosFactory.forModule((AbstractModule) tres.module()).expandPath(dest));
                    if (destDir.exists() && destDir.isDirectory()) {
                      final IFile metaInf = destDir.getDescendant("META-INF");
                      if (!(metaInf.exists()) || metaInf.isDirectory()) {
                        final IFile[] pluginXml = new IFile[1];
                        new DeltaReconciler(tres.delta()).visitAll(new FilesDelta.Visitor() {
                          @Override
                          public boolean acceptWritten(IFile file) {
                            if (Objects.equals(file.getName(), "plugin.xml")) {
                              pluginXml[0] = file;
                              monitor.reportFeedback(new IFeedback.INFORMATION(String.valueOf("Copying " + file + " to " + metaInf + " directory.")));
                              return false;
                            }
                            return true;
                          }
                        });
                        if (pluginXml[0] != null) {
                          FileSystem.getInstance().runWriteTransaction(new Runnable() {
                            @Override
                            public void run() {
                              if (!(metaInf.exists())) {
                                metaInf.mkdirs();
                              }
                              IFileUtils.copyFileContent(pluginXml[0], metaInf.getDescendant(pluginXml[0].getName()));
                            }
                          });
                        }
                      }

                    }
                  }

                  _output_ehksfb_a0a = Sequence.fromIterable(_output_ehksfb_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(tres)));
                }
              } finally {
                progressMonitor.done();
              }
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_ehksfb_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.TextGen.textGen")});
    }
    public Iterable<ITarget.Name> notBefore() {
      return null;
    }
    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.make.facets.Make.reconcile")});
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
      ListSequence.fromList(rv).addElement(TResource.class);
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
      return 10;
    }
    public static CopyPluginXml_Facet.Target_copyPluginXml.Parameters vars(IPropertiesPool ppool) {
      return ppool.properties(name, CopyPluginXml_Facet.Target_copyPluginXml.Parameters.class);
    }
    public static class Parameters extends MultiTuple._1<String> {
      public Parameters() {
        super();
      }
      public Parameters(String pluginRoot) {
        super(pluginRoot);
      }
      public String pluginRoot(String value) {
        return super._0(value);
      }
      public String pluginRoot() {
        return super._0();
      }
    }
  }
  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }
    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml");
        if (properties.hasProperties(name)) {
          CopyPluginXml_Facet.Target_copyPluginXml.Parameters props = properties.properties(name, CopyPluginXml_Facet.Target_copyPluginXml.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml.pluginRoot", String.valueOf(props.pluginRoot()));
        }
      }
    }
    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml");
          CopyPluginXml_Facet.Target_copyPluginXml.Parameters props = properties.properties(name, CopyPluginXml_Facet.Target_copyPluginXml.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml.pluginRoot")) {
            props.pluginRoot(String.valueOf(MapSequence.fromMap(store).get("jetbrains.mps.lang.plugin.CopyPluginXml.copyPluginXml.pluginRoot")));
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}
