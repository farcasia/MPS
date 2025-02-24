package jetbrains.mps.ide.java.platform.index;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.search.ClassifierSuccessors;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.ide.MPSCoreComponents;
import jetbrains.mps.project.Project;
import com.intellij.openapi.project.DumbService;
import jetbrains.mps.ide.project.ProjectHelper;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.jetbrains.mps.openapi.persistence.DataSource;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import java.util.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.intellij.util.indexing.FileBasedIndex;
import jetbrains.mps.workbench.index.SNodeEntry;
import org.jetbrains.mps.openapi.module.SRepository;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.openapi.module.Module;

public class ClassifierSuccessorsFinder implements ClassifierSuccessors.Finder, ApplicationComponent {
  public ClassifierSuccessorsFinder(MPSCoreComponents coreComponents) {
  }

  @Override
  public boolean isIndexReady(Project project) {
    return !(DumbService.getInstance(ProjectHelper.toIdeaProject(project)).isDumb());
  }

  @Override
  public List<SNode> getDerivedClassifiers(SNode classifier, org.jetbrains.mps.openapi.module.SearchScope scope) {
    Set<VirtualFile> unModifiedModelFiles = SetSequence.fromSet(new HashSet<VirtualFile>());
    List<SNode> modifiedClasses = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> modifiedInterfaces = ListSequence.fromList(new ArrayList<SNode>());
    for (SModel md : scope.getModels()) {
      if (!((md instanceof EditableSModel))) {
        continue;
      }
      EditableSModel emd = (EditableSModel) md;
      DataSource source = emd.getSource();
      IFile modelFile = (source instanceof FileDataSource ? ((FileDataSource) source).getFile() : null);
      if (modelFile == null) {
        continue;
      }
      if (emd.isChanged()) {
        ListSequence.fromList(modifiedClasses).addSequence(ListSequence.fromList(SModelOperations.nodes(md, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
        ListSequence.fromList(modifiedInterfaces).addSequence(ListSequence.fromList(SModelOperations.nodes(md, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface"))));
      } else {
        SetSequence.fromSet(unModifiedModelFiles).addElement(VirtualFileUtils.getOrCreateVirtualFile(modelFile));
      }
    }
    List<SNode> result = new ArrayList<SNode>();
    Queue<SNode> queue = QueueSequence.fromQueue(new LinkedList<SNode>());
    QueueSequence.fromQueue(queue).addLastElement(classifier);
    ClassifierSuccessorsFinder.ValueProcessor valueProcessor = new ClassifierSuccessorsFinder.ValueProcessor(result, queue, SNodeOperations.getModel(classifier).getRepository());
    ClassifierSuccessorsFinder.ModifiedsuccessorFinder modifiedSuccessorFinder = new ClassifierSuccessorsFinder.ModifiedsuccessorFinder(modifiedClasses, modifiedInterfaces, result, queue);
    ClassifierSuccessorsFinder.SearchScope unModifiedFilesSearchScope = new ClassifierSuccessorsFinder.SearchScope(unModifiedModelFiles);
    while (!(QueueSequence.fromQueue(queue).isEmpty())) {
      SNode nextClassifier = QueueSequence.fromQueue(queue).removeFirstElement();
      ClassifierSuccessorsIndexer.processValues(nextClassifier, valueProcessor, unModifiedFilesSearchScope);
      modifiedSuccessorFinder.process(nextClassifier);
    }
    return result;
  }

  @Override
  public void initComponent() {
    ClassifierSuccessors.getInstance().setFinder(this);
  }

  @Override
  public void disposeComponent() {
    ClassifierSuccessors.getInstance().setFinder(null);
  }

  @NonNls
  @NotNull
  @Override
  public String getComponentName() {
    return "Classifiers successors finder";
  }
  private static class ModifiedsuccessorFinder {
    private List<SNode> myModifiedClasses;
    private List<SNode> myModifiedInterfaces;
    private Queue<SNode> myClassifiersQueue;
    private List<SNode> myResult;
    private Set<SNode> myProcessedNodes = SetSequence.fromSet(new HashSet<SNode>());
    private Map<SNode, List<SNode>> mySuccessorsMap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    private boolean myInterfacesMapped;
    private boolean myClassesMapped;
    /*package*/ ModifiedsuccessorFinder(List<SNode> modifiedClasses, List<SNode> modifiedInterfaces, List<SNode> result, Queue<SNode> classifiersQueue) {
      myModifiedClasses = modifiedClasses;
      myModifiedInterfaces = modifiedInterfaces;
      myClassifiersQueue = classifiersQueue;
      myResult = result;
    }
    public void process(SNode superClassifier) {
      if (SetSequence.fromSet(myProcessedNodes).contains(superClassifier)) {
        return;
      }
      SetSequence.fromSet(myProcessedNodes).addElement(superClassifier);
      if (SNodeOperations.isInstanceOf(superClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface"))) {
        mapInterfaces();
        mapClasses();
      } else if (SNodeOperations.isInstanceOf(superClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
        mapClasses();
      } else {
        return;
      }
      List<SNode> successors = MapSequence.fromMap(mySuccessorsMap).get(superClassifier);
      if (successors != null) {
        for (SNode successor : ListSequence.fromList(successors)) {
          ListSequence.fromList(myResult).addElement(successor);
          QueueSequence.fromQueue(myClassifiersQueue).addLastElement(successor);
        }
      }
    }
    private void mapClasses() {
      if (myClassesMapped) {
        return;
      }
      myClassesMapped = true;
      for (SNode aClass : ListSequence.fromList(myModifiedClasses)) {
        SNode superClass = SLinkOperations.getTarget(aClass, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass"));
        if (superClass != null) {
          safeMap(SLinkOperations.getTarget(superClass, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), aClass);
        }
        if (SNodeOperations.isInstanceOf(aClass, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass"))) {
          safeMap(SLinkOperations.getTarget(SNodeOperations.cast(aClass, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier")), aClass);
        }
        for (SNode implementedInterface : ListSequence.fromList(SLinkOperations.getChildren(aClass, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0xff2ac0b419L, "implementedInterface")))) {
          safeMap(SLinkOperations.getTarget(implementedInterface, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), aClass);
        }
      }
    }
    private void mapInterfaces() {
      if (myInterfacesMapped) {
        return;
      }
      myInterfacesMapped = true;
      for (SNode anInterface : ListSequence.fromList(myModifiedInterfaces)) {
        for (SNode extendedInterface : ListSequence.fromList(SLinkOperations.getChildren(anInterface, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, 0x101eddadad7L, "extendedInterface")))) {
          safeMap(SLinkOperations.getTarget(extendedInterface, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")), anInterface);
        }
      }
    }
    private void safeMap(SNode predecessor, SNode successor) {
      if (predecessor == null) {
        return;
      }
      List<SNode> successors = MapSequence.fromMap(mySuccessorsMap).get(predecessor);
      if (successors == null) {
        successors = new ArrayList<SNode>();
        MapSequence.fromMap(mySuccessorsMap).put(predecessor, successors);
      }
      ListSequence.fromList(successors).addElement(successor);
    }
  }
  private static class ValueProcessor implements FileBasedIndex.ValueProcessor<List<SNodeEntry>> {
    private List<SNode> myResult;
    private Queue<SNode> myQueue;
    private final SRepository myRepo;

    private Set<SNodeEntry> myProcessedNodes = SetSequence.fromSet(new HashSet<SNodeEntry>());
    /*package*/ ValueProcessor(List<SNode> result, Queue<SNode> queue, SRepository repository) {
      myResult = result;
      myQueue = queue;
      myRepo = repository;
    }
    @Override
    public boolean process(VirtualFile file, List<SNodeEntry> successors) {
      for (SNodeEntry sNodeId : successors) {
        if (SetSequence.fromSet(myProcessedNodes).contains(sNodeId)) {
          continue;
        }
        SetSequence.fromSet(myProcessedNodes).addElement(sNodeId);
        SNode node = sNodeId.getNodePointer().resolve(myRepo);
        if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
          SNode classifier = SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"));
          ListSequence.fromList(myResult).addElement(classifier);
          QueueSequence.fromQueue(myQueue).addLastElement(classifier);
        }
      }
      return true;
    }
  }
  private static class SearchScope extends GlobalSearchScope {
    private Set<VirtualFile> myFilesInScope;
    /*package*/ SearchScope(Set<VirtualFile> notModifiedModelFiles) {
      super(null);
      myFilesInScope = notModifiedModelFiles;
    }
    @Override
    public boolean contains(VirtualFile file) {
      return SetSequence.fromSet(myFilesInScope).contains(file);
    }
    @Override
    public int compare(VirtualFile file1, VirtualFile file2) {
      return file1.getPath().compareTo(file2.getPath());
    }
    @Override
    public boolean isSearchInModuleContent(@NotNull Module aModule) {
      return true;
    }
    @Override
    public boolean isSearchInLibraries() {
      return false;
    }
  }
}
