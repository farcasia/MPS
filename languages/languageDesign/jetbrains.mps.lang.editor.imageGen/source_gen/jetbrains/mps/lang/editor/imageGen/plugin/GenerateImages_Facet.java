package jetbrains.mps.lang.editor.imageGen.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.facet.ITargetEx;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.resources.GResource;
import org.jetbrains.mps.openapi.module.SRepository;
import java.util.Map;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.make.facets.Make_Facet.Target_make;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNodeId;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import jetbrains.mps.internal.make.runtime.util.StaleFilesCollector;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.smodel.resources.DResource;
import jetbrains.mps.vfs.FileSystem;
import java.io.OutputStream;
import java.io.IOException;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.script.IPropertiesPool;

public class GenerateImages_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.lang.editor.imageGen.GenerateImages");
  public GenerateImages_Facet() {
    ListSequence.fromList(targets).addElement(new GenerateImages_Facet.Target_generateImages());
  }
  public Iterable<ITarget> targets() {
    return targets;
  }
  public Iterable<IFacet.Name> optional() {
    return null;
  }
  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("jetbrains.mps.make.facets.Make"), new IFacet.Name("jetbrains.mps.lang.core.TextGen"), new IFacet.Name("jetbrains.mps.lang.core.Generate")});
  }
  public Iterable<IFacet.Name> extended() {
    return null;
  }
  public IFacet.Name getName() {
    return this.name;
  }
  public IPropertiesPersistence propertiesPersistence() {
    return new GenerateImages_Facet.TargetProperties();
  }
  public static class Target_generateImages implements ITargetEx {
    private static final ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.editor.imageGen.GenerateImages.generateImages");
    public Target_generateImages() {
    }
    public IJob createJob() {
      return new IJob.Stub() {
        @Override
        public IResult execute(final Iterable<IResource> rawInput, final IJobMonitor monitor, final IPropertiesAccessor pa, @NotNull final ProgressMonitor progressMonitor) {
          Iterable<IResource> _output_7crsqe_a0a = null;
          final Iterable<GResource> input = (Iterable<GResource>) (Iterable) rawInput;
          switch (0) {
            case 0:
              progressMonitor.start("Printing Images", 4);

              try {
                final SRepository repository = monitor.getSession().getProject().getRepository();

                final Map<IFile, List<PrintNodeRunnable>> folder2PrintRunnables = MapSequence.fromMap(new HashMap<IFile, List<PrintNodeRunnable>>());

                repository.getModelAccess().runReadAction(new Runnable() {
                  public void run() {
                    progressMonitor.step("Collecting models to print");
                    // TODO: check status & outputPath... see TextGen facet 
                    Iterable<GResource> resourcesWithOutput = Sequence.fromIterable(input).where(new IWhereFilter<GResource>() {
                      public boolean accept(GResource it) {
                        return SModelOperations.getOutputLocation(it.model()) != null && it.status().getOutputModel() != null;
                      }
                    });
                    Iterable<Tuples._2<SModel, SModel>> allModels = Sequence.fromIterable(resourcesWithOutput).select(new ISelector<GResource, Tuples._2<SModel, SModel>>() {
                      public Tuples._2<SModel, SModel> select(GResource gResource) {
                        SModel inputModel = gResource.model();
                        SModel outputModel = gResource.status().getOutputModel();
                        return MultiTuple.<SModel,SModel>from(inputModel, outputModel);
                      }
                    });
                    progressMonitor.advance(1);

                    ProgressMonitor collectingNodesMonitor = progressMonitor.subTask(1);
                    collectingNodesMonitor.start("Collecting nodes to print", Sequence.fromIterable(allModels).count());
                    for (Tuples._2<SModel, SModel> modelsPair : Sequence.fromIterable(allModels)) {
                      collectingNodesMonitor.step(jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations.getModelName(modelsPair._0()));
                      // XXX what if there are multiple GenerationTargetFacet (now it's only JavaModuleFacet), shall we generate into each? Or identify them somehow? 
                      IFile modelOutputLocation = SModelOperations.getOutputLocation(modelsPair._0());
                      IFile outputDir = Target_make.vars(pa.global()).pathToFile().invoke(modelOutputLocation.getPath());
                      if (!(MapSequence.fromMap(folder2PrintRunnables).containsKey(outputDir))) {
                        MapSequence.fromMap(folder2PrintRunnables).put(outputDir, ListSequence.fromList(new ArrayList<PrintNodeRunnable>()));
                      }
                      for (SNode imageGenerator : ListSequence.fromList(jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations.roots(modelsPair._1(), MetaAdapterFactory.getConcept(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, "jetbrains.mps.lang.editor.imageGen.structure.ImageGenerator")))) {
                        SNodeId nodeId = PersistenceFacade.getInstance().createNodeId(SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x2d0ad2528389ad26L, "id")));
                        SNode node = modelsPair._0().getNode(nodeId);

                        PrintNodeRunnable printRunnable = new PrintNodeRunnable(node.getReference(), repository, SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x20c051df23a9da87L, "fileName")));
                        if (SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x132781a3b11568fbL, "imageFormat")) != null) {
                          printRunnable.setImageFormat(SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x132781a3b11568fbL, "imageFormat")));
                        }
                        if (SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x132781a3b11572e9L, "scale")) != null) {
                          printRunnable.setScale(Double.parseDouble(SPropertyOperations.getString(imageGenerator, MetaAdapterFactory.getProperty(0x1839bec5cea641dfL, 0xb9e0c405ff35c41eL, 0x20c051df23a9488cL, 0x132781a3b11572e9L, "scale"))));
                        }
                        printRunnable.setBackgroundColor(255, 255, 255, 255);

                        ListSequence.fromList(MapSequence.fromMap(folder2PrintRunnables).get(outputDir)).addElement(printRunnable);
                      }
                      collectingNodesMonitor.advance(1);
                    }
                    collectingNodesMonitor.done();
                  }
                });

                List<IDelta> deltaList = ListSequence.fromList(new ArrayList<IDelta>());
                List<Tuples._2<IFile, byte[]>> fileContentsToWrite = ListSequence.fromList(new ArrayList<Tuples._2<IFile, byte[]>>());
                ProgressMonitor printingFoldersMonitor = progressMonitor.subTask(1);
                printingFoldersMonitor.start("Printing folders", MapSequence.fromMap(folder2PrintRunnables).count());
                for (IFile folder : SetSequence.fromSet(MapSequence.fromMap(folder2PrintRunnables).keySet())) {
                  FilesDelta fd = new FilesDelta(folder);
                  ListSequence.fromList(deltaList).addElement(fd);
                  new StaleFilesCollector(folder).updateDelta(fd);

                  ProgressMonitor printFilesMonitor = printingFoldersMonitor.subTask(1);
                  printFilesMonitor.start("Printing files", ListSequence.fromList(MapSequence.fromMap(folder2PrintRunnables).get(folder)).count());
                  for (PrintNodeRunnable printNodeRunnable : ListSequence.fromList(MapSequence.fromMap(folder2PrintRunnables).get(folder))) {
                    printFilesMonitor.step(printNodeRunnable.getFileName());
                    repository.getModelAccess().runWriteInEDT(printNodeRunnable);
                    if (printNodeRunnable.waitForExecution()) {
                      IFile outputFile = folder.getDescendant(printNodeRunnable.getFileName());
                      ListSequence.fromList(fileContentsToWrite).addElement(MultiTuple.<IFile,byte[]>from(outputFile, printNodeRunnable.getResult()));
                      fd.written(outputFile);
                    } else {
                      monitor.reportFeedback(new IFeedback.ERROR(String.valueOf(printNodeRunnable.getErrorMessage())));
                    }
                    printFilesMonitor.advance(1);
                  }
                  printFilesMonitor.done();
                }
                printingFoldersMonitor.done();

                _output_7crsqe_a0a = Sequence.fromIterable(_output_7crsqe_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new DResource(deltaList))));

                ProgressMonitor saveFilesMonitor = progressMonitor.subTask(1);
                saveFilesMonitor.start("Saving images", ListSequence.fromList(fileContentsToWrite).count());
                for (Tuples._2<IFile, byte[]> fileContent : ListSequence.fromList(fileContentsToWrite)) {
                  saveFilesMonitor.step(fileContent._0().getName());
                  final IFile fileToWrite = fileContent._0();
                  final byte[] bytes = fileContent._1();
                  if (!(FileSystem.getInstance().runWriteTransaction(new Runnable() {
                    public void run() {
                      OutputStream stream = null;
                      try {
                        stream = fileToWrite.openOutputStream();
                        stream.write(bytes);
                      } catch (IOException e) {
                        monitor.reportFeedback(new IFeedback.ERROR(String.valueOf(e.toString())));
                      } finally {
                        if (stream != null) {
                          try {
                            stream.close();
                          } catch (IOException ignored) {
                          }
                        }
                      }
                    }
                  }))) {
                    monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("Failed to save files")));
                    return new IResult.FAILURE(_output_7crsqe_a0a);
                  }
                  saveFilesMonitor.advance(1);
                }
                saveFilesMonitor.done();
              } finally {
                progressMonitor.done();
              }
            default:
              progressMonitor.done();
              return new IResult.SUCCESS(_output_7crsqe_a0a);
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
  }
  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }
    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
    }
    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
      } catch (RuntimeException re) {
      }
    }
  }
}
