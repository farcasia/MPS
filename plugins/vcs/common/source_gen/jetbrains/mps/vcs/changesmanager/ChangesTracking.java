package jetbrains.mps.vcs.changesmanager;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.mps.openapi.model.EditableSModel;
import com.intellij.util.containers.BidirectionalMultiMap;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import com.intellij.util.containers.BidirectionalMap;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import java.util.List;
import com.intellij.openapi.vcs.FileStatus;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.vcs.diff.changes.MetadataChange;
import jetbrains.mps.vcs.diff.changes.AddRootChange;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.vcs.diff.changes.NodeGroupChange;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.vcs.platform.util.ConflictsUtil;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.vcs.diff.merge.MergeTemporaryModel;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.log4j.Level;
import jetbrains.mps.vcs.diff.ui.common.DiffModelUtil;
import jetbrains.mps.vcs.diff.ChangeSet;
import jetbrains.mps.vcs.diff.ChangeSetBuilder;
import jetbrains.mps.vcs.diff.ChangeSetImpl;
import org.jetbrains.mps.openapi.persistence.DataSource;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.persistence.FilePerRootDataSource;
import jetbrains.mps.ide.vfs.IdeaFile;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import com.intellij.openapi.vcs.FileStatusManager;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.project.MPSProject;
import java.util.Objects;
import jetbrains.mps.vcs.diff.changes.NodeChange;
import jetbrains.mps.vcs.diff.changes.DeleteRootChange;
import jetbrains.mps.smodel.event.SModelEventVisitorAdapter;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.persistence.def.FilePerRootFormatUtil;
import jetbrains.mps.extapi.model.SModelBase;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.vcs.diff.changes.SetPropertyChange;
import jetbrains.mps.smodel.event.SModelReferenceEvent;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.vcs.diff.changes.SetReferenceChange;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.smodel.event.SModelRootEvent;
import jetbrains.mps.smodel.event.SModelLanguageEvent;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.vcs.diff.changes.UsedLanguageChange;
import jetbrains.mps.smodel.event.SModelDevKitEvent;
import jetbrains.mps.vcs.diff.changes.ModuleDependencyChange;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.smodel.event.SModelImportEvent;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.vcs.diff.changes.ImportedModelChange;

public class ChangesTracking {
  private static final Logger LOG = LogManager.getLogger(ChangesTracking.class);
  private static final Object LOCK = new Object();
  private final Project myProject;
  private final CurrentDifference myDifference;
  private final SimpleCommandQueue myQueue;
  private final EditableSModel myModelDescriptor;
  private final CurrentDifferenceRegistry myRegistry;
  private final SModelCommandListener myEventCollector = new ChangesTracking.MyEventsCollector();
  private boolean myDisposed = false;
  private BidirectionalMultiMap<SNodeId, ModelChange> myNodesToChanges = new BidirectionalMultiMap<SNodeId, ModelChange>();
  private Set<ModelChange> myMetadataChanges = SetSequence.fromSet(new HashSet<ModelChange>());
  private BidirectionalMap<SNodeId, ModelChange> myAddedNodesToChanges = new BidirectionalMap<SNodeId, ModelChange>();
  private Tuples._2<SNodeId, List<SNodeId>> myLastParentAndNewChildrenIds;
  private FileStatus myStatusOnLastUpdate;
  private EventConsumingMapping myEventConsumingMapping = new EventConsumingMapping();

  public ChangesTracking(@NotNull CurrentDifferenceRegistry registry, @NotNull CurrentDifference difference) {
    myDifference = difference;
    myProject = registry.getProject();
    myModelDescriptor = myDifference.getModelDescriptor();
    myQueue = registry.getCommandQueue();
    myRegistry = registry;
    registry.addEventCollector(myModelDescriptor, myEventCollector);
  }

  public void dispose() {
    synchronized (LOCK) {
      if (!(myDisposed)) {
        myDisposed = true;
        myRegistry.removeEventCollector(myModelDescriptor, myEventCollector);
        myQueue.runTask(new Runnable() {
          public void run() {
            myDifference.removeChangeSet();
          }
        });
      }
    }
  }

  private void updateCacheForChange(@NotNull ModelChange change) {
    SNodeId id = getNodeIdForChange(change);
    if (id != null) {
      myNodesToChanges.put(id, change);
    } else {
      SetSequence.fromSet(myMetadataChanges).addElement((MetadataChange) change);
    }
    if (change instanceof AddRootChange) {
      MapSequence.fromMap(myAddedNodesToChanges).put(change.getRootId(), change);
    } else if (change instanceof NodeGroupChange) {
      for (SNodeId nodeId : Sequence.fromIterable(getNodeIdsForNodeGroupChange((NodeGroupChange) change, myLastParentAndNewChildrenIds))) {
        MapSequence.fromMap(myAddedNodesToChanges).put(nodeId, change);
      }
    }
  }

  private void buildCaches() {
    myNodesToChanges.clear();
    SetSequence.fromSet(myMetadataChanges).clear();
    myAddedNodesToChanges.clear();
    myLastParentAndNewChildrenIds = null;
    for (ModelChange ch : ListSequence.fromList(myDifference.getChangeSet().getModelChanges())) {
      updateCacheForChange(ch);
    }
  }

  /*package*/ void scheduleFullUpdate(final boolean force) {
    myQueue.addTask(new Runnable() {
      public void run() {
        update(force);
      }
    });
  }

  private void update(final boolean force) {
    myQueue.assertSoftlyIsCommandThread();

    SRepository repo = ProjectHelper.fromIdeaProject(myProject).getRepository();
    repo.getModelAccess().runReadAction(new Runnable() {
      public void run() {
        synchronized (LOCK) {
          if (myDisposed) {
            return;
          }
          if (!(myDifference.isEnabled())) {
            return;
          }
          if (!(isUnderVcs(myModelDescriptor))) {
            return;
          }

          boolean isConflict = ConflictsUtil.isModelOrModuleConflicting(myModelDescriptor, myProject);
          FileStatus status = (isConflict ? FileStatus.MERGED_WITH_CONFLICTS : getStatus(myModelDescriptor));

          // todo: make !force working for per-root persistence (here status==null) 
          if (status != null && myStatusOnLastUpdate == status && !(force)) {
            return;
          }

          myDifference.removeChangeSet();

          myStatusOnLastUpdate = status;
          if (FileStatus.NOT_CHANGED == status && !(force)) {
            return;
          }

          SModel baseVersionModel = null;
          if (isAdded(myModelDescriptor) || isConflict) {
            baseVersionModel = new MergeTemporaryModel(myModelDescriptor.getReference(), true);
          } else {
            baseVersionModel = BaseVersionUtil.getBaseVersionModel(myModelDescriptor, myProject);
            if (baseVersionModel == null) {
              return;
            }

            if (Sequence.fromIterable(((Iterable<SModel.Problem>) baseVersionModel.getProblems())).any(new IWhereFilter<SModel.Problem>() {
              public boolean accept(SModel.Problem it) {
                return it.isError();
              }
            })) {
              StringBuilder sb = new StringBuilder();
              for (SModel.Problem p : Sequence.fromIterable((Iterable<SModel.Problem>) baseVersionModel.getProblems())) {
                sb.append((p.isError() ? "error: " : "warn: ")).append(p.getText()).append("\n");
              }
              if (LOG.isEnabledFor(Level.WARN)) {
                LOG.warn(sb.toString());
              }
              return;
            }
          }

          if (!(myDisposed)) {
            DiffModelUtil.renameModel(baseVersionModel, "repository");
            ChangeSet changeSet = ChangeSetBuilder.buildChangeSet(baseVersionModel, myModelDescriptor, true);
            myDifference.setChangeSet((ChangeSetImpl) changeSet);
            buildCaches();
          }
        }
      }
    });
    repo.getModelAccess().runReadAction(new Runnable() {
      public void run() {
        synchronized (LOCK) {
        }
      }
    });
  }

  private boolean isUnderVcs(@NotNull SModel model) {
    DataSource ds = model.getSource();
    IFile file = null;
    if (ds instanceof FileDataSource) {
      file = ((FileDataSource) ds).getFile();
    } else if (ds instanceof FilePerRootDataSource) {
      file = ((FilePerRootDataSource) ds).getFile(FilePerRootDataSource.HEADER_FILE);
    }
    if (file == null) {
      return false;
    }
    if (!(file instanceof IdeaFile)) {
      if (LOG.isEnabledFor(Level.WARN)) {
        LOG.warn("File " + file + " must be a project file and managed by IDEA FS");
      }
      return false;
    }
    VirtualFile vFile = ((IdeaFile) file).getVirtualFile();
    return vFile != null && ProjectLevelVcsManager.getInstance(myProject).getVcsFor(vFile) != null;
  }

  private boolean isAdded(SModel model) {
    DataSource ds = model.getSource();
    IFile file = null;
    if (ds instanceof FileDataSource) {
      file = ((FileDataSource) ds).getFile();
    } else if (ds instanceof FilePerRootDataSource) {
      file = ((FilePerRootDataSource) ds).getFile(FilePerRootDataSource.HEADER_FILE);
    }
    VirtualFile vFile = VirtualFileUtils.getProjectVirtualFile(file);
    assert vFile != null;
    FileStatus status = FileStatusManager.getInstance(myProject).getStatus(vFile);
    return BaseVersionUtil.isAddedFileStatus(status);
  }

  private FileStatus getStatus(SModel model) {
    DataSource ds = model.getSource();
    if (ds instanceof FileDataSource) {
      VirtualFile file = VirtualFileUtils.getProjectVirtualFile(((FileDataSource) ds).getFile());
      return (file == null ? FileStatus.UNKNOWN : FileStatusManager.getInstance(myProject).getStatus(file));
    } else if (ds instanceof FilePerRootDataSource) {
      // todo: do we need status at all? 
      return null;
    }
    return FileStatus.UNKNOWN;
  }

  private void addChange(@NotNull ModelChange change) {
    updateCacheForChange(change);
    myDifference.addChange(change);
  }

  private void removeChange(@NotNull ModelChange change) {
    if (change instanceof MetadataChange) {
      SetSequence.fromSet(myMetadataChanges).removeElement((MetadataChange) change);
    } else {
      myNodesToChanges.removeValue(change);
    }
    myAddedNodesToChanges.removeValue(change);
    myDifference.removeChange(change);
  }

  private <C extends ModelChange> int removeChanges(SNodeId nodeId, final Class<C> changeClass, final _FunctionTypes._return_P1_E0<? extends Boolean, ? super C> condition) {
    Set<ModelChange> changes = (nodeId == null ? myMetadataChanges : myNodesToChanges.getValues(nodeId));
    List<ModelChange> toRemove = SetSequence.fromSet(changes).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange ch) {
        return changeClass.isInstance(ch) && condition.invoke((C) ch);
      }
    }).toListSequence();
    ListSequence.fromList(toRemove).visitAll(new IVisitor<ModelChange>() {
      public void visit(ModelChange it) {
        removeChange(it);
      }
    });
    return ListSequence.fromList(toRemove).count();
  }

  private void removeDescendantChanges(SNodeId parentId, SContainmentLink role) {
    SNode oldNode = getOldNode(parentId);
    if (oldNode == null) {
      return;
    }
    Iterable<SNode> children = AttributeOperations.getChildNodesAndAttributes(oldNode, role);
    Sequence.fromIterable(children).visitAll(new IVisitor<SNode>() {
      public void visit(SNode c) {
        removeDescendantChanges(c.getNodeId());
      }
    });
  }

  private void removeDescendantChanges(SNodeId nodeId) {
    SNode oldNode = getOldNode(nodeId);
    assert oldNode != null;
    for (SNode d : ListSequence.fromList(SNodeOperations.getNodeDescendants(oldNode, null, true, new SAbstractConcept[]{}))) {
      removeChanges(d.getNodeId(), ModelChange.class, new _FunctionTypes._return_P1_E0<Boolean, ModelChange>() {
        public Boolean invoke(ModelChange ch) {
          return true;
        }
      });
    }
  }

  private void buildAndAddChanges(_FunctionTypes._void_P1_E0<? super ChangeSetBuilder> buildAction) {
    ChangeSet cs = myDifference.getChangeSet();
    ChangeSetBuilder builder = ChangeSetBuilder.createBuilder(cs);
    buildAction.invoke(builder);
    ListSequence.fromList(builder.getNewChanges()).visitAll(new IVisitor<ModelChange>() {
      public void visit(ModelChange ch) {
        addChange(ch);
      }
    });
  }

  @Nullable
  private SNode getOldNode(@NotNull SNodeId id) {
    return check_5iuzi5_a0a54(check_5iuzi5_a0a0a54(myDifference.getChangeSet()), id);
  }

  private void runUpdateTask(final _FunctionTypes._void_P0_E0 task, SNode currentNode, final SModelEvent event) {
    myEventConsumingMapping.addEvent(event);
    final List<SNodeId> ancestors = ListSequence.fromList(SNodeOperations.getNodeAncestors(currentNode, null, true)).select(new ISelector<SNode, SNodeId>() {
      public SNodeId select(SNode a) {
        return a.getNodeId();
      }
    }).toListSequence();
    myQueue.runTask(new Runnable() {
      public void run() {
        if (myDifference.getChangeSet() == null) {
          update(true);
        } else {
          if (ListSequence.fromList(ancestors).any(new IWhereFilter<SNodeId>() {
            public boolean accept(SNodeId a) {
              return myAddedNodesToChanges.containsKey(a);
            }
          })) {
            // ignore 
          } else {
            if (myEventConsumingMapping.removeEvent(event)) {
              myDifference.getBroadcaster().changeUpdateStarted();
              MPSProject mpsProject = ProjectHelper.fromIdeaProject(myProject);
              mpsProject.getModelAccess().runReadAction(new Runnable() {
                public void run() {
                  synchronized (LOCK) {
                    if (!(myDisposed)) {
                      task.invoke();
                    }
                  }
                }
              });
              myDifference.getBroadcaster().changeUpdateFinished();
            }
          }
        }
      }
    });
  }

  private static Iterable<SNodeId> getNodeIdsForNodeGroupChange(@NotNull NodeGroupChange ngc, @Nullable Tuples._2<SNodeId, List<SNodeId>> lastParentAndNewChildrenIds) {
    List<SNodeId> childrenIds;
    if (lastParentAndNewChildrenIds == null || !(Objects.equals(lastParentAndNewChildrenIds._0(), ngc.getParentNodeId()))) {
      List<SNode> children = ngc.getChangedCollection(true);
      childrenIds = ListSequence.fromList(children).select(new ISelector<SNode, SNodeId>() {
        public SNodeId select(SNode n) {
          return n.getNodeId();
        }
      }).toListSequence();
    } else {
      childrenIds = lastParentAndNewChildrenIds._1();
    }
    return ListSequence.fromList(childrenIds).page(ngc.getResultBegin(), ngc.getResultEnd());
  }

  @Nullable
  private static SNodeId getNodeIdForChange(@NotNull ModelChange change) {
    if (change instanceof NodeChange) {
      return ((NodeChange) change).getAffectedNodeId();
    } else if (change instanceof AddRootChange || change instanceof DeleteRootChange) {
      return change.getRootId();
    } else if (change instanceof NodeGroupChange) {
      return ((NodeGroupChange) change).getParentNodeId();
    }
    return null;
  }

  public class MyEventsCollector extends SModelEventVisitorAdapter implements SModelCommandListener {
    private Map<SNode, Set<SContainmentLink>> childChanged;

    @Override
    public void eventsHappenedInCommand(List<SModelEvent> events) {
      childChanged = MapSequence.fromMap(new HashMap<SNode, Set<SContainmentLink>>());
      for (SModelEvent event : ListSequence.fromList(events)) {
        event.accept(this);
      }
      childChanged = null;

      // make model file[s] dirty 
      Set<IFile> affectedFiles = SetSequence.fromSet(new HashSet<IFile>());
      DataSource dataSource = myModelDescriptor.getSource();
      if (dataSource instanceof FileDataSource) {
        SetSequence.fromSet(affectedFiles).addElement(((FileDataSource) dataSource).getFile());
      } else if (dataSource instanceof FilePerRootDataSource) {
        FilePerRootDataSource ds = (FilePerRootDataSource) dataSource;
        Map<SNodeId, String> streamNames = FilePerRootFormatUtil.getStreamNames(((SModelBase) myModelDescriptor).getSModel());
        for (SModelEvent event : ListSequence.fromList(events)) {
          SNodeId rootId = check_5iuzi5_a0a0c0a7a2bc(event.getAffectedRoot());
          if (rootId != null && streamNames.containsKey(rootId)) {
            SetSequence.fromSet(affectedFiles).addElement(ds.getFile(streamNames.get(rootId)));
          }
        }
        // model file can be affected also 
        SetSequence.fromSet(affectedFiles).addElement(ds.getFile(FilePerRootDataSource.HEADER_FILE));
      }
      VcsFileStatusProvider provider = myProject.getComponent(VcsFileStatusProvider.class);
      for (IFile iFile : SetSequence.fromSet(affectedFiles)) {
        VirtualFile vFile = VirtualFileUtils.getVirtualFile(iFile);
        if (vFile != null) {
          Document document = FileDocumentManager.getInstance().getDocument(vFile);
          if (document != null && provider != null) {
            provider.refreshFileStatusFromDocument(vFile, document);
          }
        }
      }
    }

    @Override
    public void visitPropertyEvent(SModelPropertyEvent event) {
      final SNode node = event.getNode();
      if (node.getModel() == null) {
        return;
      }
      final SNodeId nodeId = node.getNodeId();
      final SProperty property = event.getProperty();

      // get more info for debugging 
      assert node.getModel().getNode(nodeId) != null : "cannot find node " + nodeId + " in model " + node.getModel();

      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          removeChanges(nodeId, SetPropertyChange.class, new _FunctionTypes._return_P1_E0<Boolean, SetPropertyChange>() {
            public Boolean invoke(SetPropertyChange ch) {
              return ch.isAbout(property);
            }
          });
          buildAndAddChanges(new _FunctionTypes._void_P1_E0<ChangeSetBuilder>() {
            public void invoke(ChangeSetBuilder b) {
              b.buildForProperty(getOldNode(nodeId), node, property);
            }
          });
        }
      }, node, event);
    }

    @Override
    public void visitReferenceEvent(SModelReferenceEvent event) {
      SReference ref = event.getReference();
      final SNode sourceNode = ref.getSourceNode();
      if (sourceNode.getModel() == null) {
        return;
      }
      final SNodeId nodeId = sourceNode.getNodeId();
      final SReferenceLink role = ref.getLink();
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          removeChanges(nodeId, SetReferenceChange.class, new _FunctionTypes._return_P1_E0<Boolean, SetReferenceChange>() {
            public Boolean invoke(SetReferenceChange ch) {
              return ch.isAbout(role);
            }
          });
          buildAndAddChanges(new _FunctionTypes._void_P1_E0<ChangeSetBuilder>() {
            public void invoke(ChangeSetBuilder b) {
              b.buildForReference(getOldNode(nodeId), sourceNode, role);
            }
          });
        }
      }, event.getReference().getSourceNode(), event);
    }

    @Override
    public void visitChildEvent(SModelChildEvent event) {
      SNode parent = event.getParent();
      if (parent.getModel() == null) {
        return;
      }
      SNode child = event.getChild();
      final SContainmentLink childRole = (SNodeOperations.isInstanceOf(child, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x9d98713f247885aL, "jetbrains.mps.lang.core.structure.ChildAttribute")) ? ((SContainmentLink) BHReflection.invoke0(SNodeOperations.cast(child, MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x9d98713f247885aL, "jetbrains.mps.lang.core.structure.ChildAttribute")), MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x9d98713f247885aL, "jetbrains.mps.lang.core.structure.ChildAttribute"), SMethodTrimmedId.create("getLink", MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x9d98713f247885aL, "jetbrains.mps.lang.core.structure.ChildAttribute"), "BpxLfMirzf"))) : event.getAggregationLink());

      // trying to avoid update task execution for the same child role twice 
      Set<SContainmentLink> changedChildRoles = MapSequence.fromMap(childChanged).get(parent);
      if (changedChildRoles == null) {
        changedChildRoles = SetSequence.fromSet(new HashSet<SContainmentLink>());
        MapSequence.fromMap(childChanged).put(parent, changedChildRoles);
      }
      if (SetSequence.fromSet(changedChildRoles).contains(childRole)) {
        return;
      } else {
        SetSequence.fromSet(changedChildRoles).addElement(childRole);
      }
      final SNodeId parentId = parent.getNodeId();

      final Wrappers._T<Iterable<SNode>> childrenRightAfterEvent = new Wrappers._T<Iterable<SNode>>(AttributeOperations.getChildNodesAndAttributes(((SNode) parent), childRole));
      childrenRightAfterEvent.value = Sequence.fromIterable(childrenRightAfterEvent.value).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode n) {
          return CopyUtil.copyAndPreserveId(n, false);
        }
      }).toListSequence();
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          removeChanges(parentId, NodeGroupChange.class, new _FunctionTypes._return_P1_E0<Boolean, NodeGroupChange>() {
            public Boolean invoke(NodeGroupChange ch) {
              return ch.isAbout(childRole);
            }
          });
          removeDescendantChanges(parentId, childRole);
          myLastParentAndNewChildrenIds = MultiTuple.<SNodeId,List<SNodeId>>from(parentId, Sequence.fromIterable(childrenRightAfterEvent.value).select(new ISelector<SNode, SNodeId>() {
            public SNodeId select(SNode n) {
              return n.getNodeId();
            }
          }).toListSequence());
          buildAndAddChanges(new _FunctionTypes._void_P1_E0<ChangeSetBuilder>() {
            public void invoke(ChangeSetBuilder b) {
              SNode oldParentNode = getOldNode(parentId);
              if (oldParentNode != null) {
                b.buildForNodeRole(IterableUtil.asList(AttributeOperations.getChildNodesAndAttributes(oldParentNode, childRole)), IterableUtil.asList(childrenRightAfterEvent.value), parentId, childRole);
              }
            }
          });
        }
      }, parent, event);
    }

    @Override
    public void visitRootEvent(final SModelRootEvent event) {
      SNode root = event.getRoot();
      final boolean added = event.isAdded();
      if (added) {
        if (root.getModel() == null) {
          return;
        }
      } else {
        // there are two almost identical SModelRootEvent generated: from beforeRootRemoved and from rootRemoved 
        // rootRemoved event has SModelRootEvent with rootRef = (null, null) 
        //  we skip the first one 
        if (event.getRootRef().getNodeId() != null) {
          return;
        }
      }
      final SNodeId rootId = root.getNodeId();
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          if (added) {
            removeChanges(rootId, DeleteRootChange.class, new _FunctionTypes._return_P1_E0<Boolean, DeleteRootChange>() {
              public Boolean invoke(DeleteRootChange ch) {
                return true;
              }
            });
            buildAndAddChanges(new _FunctionTypes._void_P1_E0<ChangeSetBuilder>() {
              public void invoke(ChangeSetBuilder b) {
                b.buildForNode(getOldNode(rootId), event.getRoot());
              }
            });
          } else {
            if (removeChanges(rootId, AddRootChange.class, new _FunctionTypes._return_P1_E0<Boolean, AddRootChange>() {
              public Boolean invoke(AddRootChange ch) {
                return true;
              }
            }) == 0) {
              // root was not added 
              removeDescendantChanges(rootId);
              buildAndAddChanges(new _FunctionTypes._void_P1_E0<ChangeSetBuilder>() {
                public void invoke(ChangeSetBuilder b) {
                  b.buildForNode(getOldNode(rootId), null);
                }
              });
            }
          }
        }
      }, null, event);
    }

    @Override
    public void visitLanguageEvent(SModelLanguageEvent event) {
      final SLanguage eventLang = event.getEventLanguage();
      final boolean deleted = !(event.isAdded());
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          // XXX I have no idea why we skip adding a change object if we successfully removed one or more queued earlier. 
          //  just kept it the way it is in #moduleDependencyEvent 
          if (removeChanges(null, UsedLanguageChange.class, new _FunctionTypes._return_P1_E0<Boolean, UsedLanguageChange>() {
            public Boolean invoke(UsedLanguageChange ulc) {
              return eventLang.equals(ulc.getLanguage());
            }
          }) == 0) {
            addChange(new UsedLanguageChange(myDifference.getChangeSet(), deleted, eventLang));
          }
        }
      }, null, event);
    }

    @Override
    public void visitDevKitEvent(SModelDevKitEvent event) {
      moduleDependencyEvent(event, event.getDevkitNamespace(), ModuleDependencyChange.DependencyType.USED_DEVKIT, event.isAdded());
    }

    private void moduleDependencyEvent(SModelEvent event, final SModuleReference moduleRef, final ModuleDependencyChange.DependencyType type, final boolean added) {
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          if (removeChanges(null, ModuleDependencyChange.class, new _FunctionTypes._return_P1_E0<Boolean, ModuleDependencyChange>() {
            public Boolean invoke(ModuleDependencyChange mdc) {
              return type == mdc.getDependencyType() && moduleRef.equals(mdc.getModuleReference());
            }
          }) == 0) {
            addChange(new ModuleDependencyChange(myDifference.getChangeSet(), moduleRef, type, !(added)));
          }
        }
      }, null, event);
    }

    @Override
    public void visitImportEvent(final SModelImportEvent event) {
      final SModelReference modelRef = event.getModelUID();
      runUpdateTask(new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          if (removeChanges(null, ImportedModelChange.class, new _FunctionTypes._return_P1_E0<Boolean, ImportedModelChange>() {
            public Boolean invoke(ImportedModelChange imc) {
              return modelRef.equals(imc.getModelReference());
            }
          }) == 0) {
            addChange(new ImportedModelChange(myDifference.getChangeSet(), modelRef, !(event.isAdded())));
          }
        }
      }, null, event);
    }
  }
  private static SNode check_5iuzi5_a0a54(SModel checkedDotOperand, SNodeId id) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getNode(id);
    }
    return null;
  }
  private static SModel check_5iuzi5_a0a0a54(ChangeSet checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getOldModel();
    }
    return null;
  }
  private static SNodeId check_5iuzi5_a0a0c0a7a2bc(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getNodeId();
    }
    return null;
  }
}
