package typesystemIntegration.languageChecker;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.smodel.RepoListenerRegistrar;
import java.util.Map;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.checkers.LanguageErrorsComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.SModelAdapter;
import org.jetbrains.mps.openapi.module.SRepositoryContentAdapter;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.HashSet;
import com.intellij.openapi.application.ApplicationManager;

/*package*/ class ErrorComponents {
  private final SRepository myRepository;

  /*package*/ ErrorComponents(SRepository repository) {
    myRepository = repository;
    new RepoListenerRegistrar(myRepository, myRepositoryListener).attach();
  }

  /**
   * The two maps below are accessed from EDT (by {@link typesystemIntegration.languageChecker.ErrorComponents#myDisposeListener }) and from the background highlighter
   * thread. Access to the maps must be therefore guarded by this lock.
   */
  private final Object myMapsLock = new Object();
  private Map<EditorComponent, LanguageErrorsComponent> myEditorComponentToErrorMap = MapSequence.fromMap(new HashMap<EditorComponent, LanguageErrorsComponent>());
  private Map<SModel, Set<EditorComponent>> myModelToEditorComponentsMap = MapSequence.fromMap(new HashMap<SModel, Set<EditorComponent>>());

  private EditorComponent.EditorDisposeListener myDisposeListener = new EditorComponent.EditorDisposeListener() {
    @Override
    public void editorWillBeDisposed(@NotNull EditorComponent editorComponent) {
      synchronized (myMapsLock) {
        removeByEditorComponent(editorComponent);

        for (SModel model : MapSequence.fromMap(myModelToEditorComponentsMap).keySet()) {
          Set<EditorComponent> editorComponents = MapSequence.fromMap(myModelToEditorComponentsMap).get(model);
          if (SetSequence.fromSet(editorComponents).removeElement(editorComponent) != null) {
            if (SetSequence.fromSet(editorComponents).isEmpty()) {
              MapSequence.fromMap(myModelToEditorComponentsMap).removeKey(model);
              removeModelListener(model);
            }
            break;
          }
        }
      }
    }
  };

  private SModelListener myModelListener = new SModelAdapter() {
    @Override
    public void beforeModelDisposed(SModel model) {
      synchronized (myMapsLock) {
        removeByModel(model);
      }
    }
  };

  private final SRepositoryContentAdapter myRepositoryListener = new SRepositoryContentAdapter() {

    @Override
    protected boolean isIncluded(SModule module) {
      return !(module.isReadOnly());
    }
    @Override
    protected void stopListening(SModel model) {
      synchronized (myMapsLock) {
        removeByModel(model);
      }
      removeModelListener(model);
    }
  };

  private void removeByModel(SModel model) {
    Set<EditorComponent> editorComponents = MapSequence.fromMap(myModelToEditorComponentsMap).removeKey(model);
    if (editorComponents != null) {
      for (EditorComponent editorComponent : editorComponents) {
        removeByEditorComponent(editorComponent);
      }
    }
  }

  private void removeByEditorComponent(@NotNull EditorComponent editorComponent) {
    LanguageErrorsComponent component = MapSequence.fromMap(myEditorComponentToErrorMap).removeKey(editorComponent);
    if (component != null) {
      component.dispose();
    }
    editorComponent.removeDisposeListener(myDisposeListener);
  }

  private void removeModelListener(SModel model) {
    ((SModelInternal) model).removeModelListener(myModelListener);
  }
  private void addModelListener(SModel modelDescriptor) {
    ((SModelInternal) modelDescriptor).addModelListener(myModelListener);
  }

  /*package*/ void dispose() {
    synchronized (myMapsLock) {
      new RepoListenerRegistrar(myRepository, myRepositoryListener).detach();
      Sequence.fromIterable(MapSequence.fromMap(myEditorComponentToErrorMap).values()).visitAll(new IVisitor<LanguageErrorsComponent>() {
        public void visit(LanguageErrorsComponent it) {
          it.dispose();
        }
      });
      SetSequence.fromSet(MapSequence.fromMap(myEditorComponentToErrorMap).keySet()).visitAll(new IVisitor<EditorComponent>() {
        public void visit(EditorComponent it) {
          it.removeDisposeListener(myDisposeListener);
        }
      });
      myEditorComponentToErrorMap = null;
      SetSequence.fromSet(MapSequence.fromMap(myModelToEditorComponentsMap).keySet()).visitAll(new IVisitor<SModel>() {
        public void visit(SModel it) {
          removeModelListener(it);
        }
      });
      myModelToEditorComponentsMap = null;
    }
  }
  /**
   * 
   * @return null if {@code editorComponent} is null, a non-null value otherwise
   */
  @Nullable
  /*package*/ LanguageErrorsComponent getErrorsComponent(EditorComponent editorComponent) {
    synchronized (myMapsLock) {
      LanguageErrorsComponent errorsComponent;

      final Wrappers._T<EditorComponent> mainEditorComponent = new Wrappers._T<EditorComponent>(null);
      if (editorComponent instanceof InspectorEditorComponent) {
        List<SNode> editedNodeAncestors = SNodeOperations.getNodeAncestors(((SNode) editorComponent.getEditedNode()), null, true);
        for (EditorComponent candidate : MapSequence.fromMap(myEditorComponentToErrorMap).keySet()) {
          if (ListSequence.fromList(editedNodeAncestors).contains(candidate.getEditedNode())) {
            mainEditorComponent.value = candidate;
            break;
          }
        }
        if (mainEditorComponent.value == null) {
          return null;
        }
      } else {
        mainEditorComponent.value = editorComponent;
      }

      SModel model = editorComponent.getEditorContext().getModel();
      errorsComponent = MapSequence.fromMap(myEditorComponentToErrorMap).get(mainEditorComponent.value);
      if (errorsComponent == null) {
        errorsComponent = new LanguageErrorsComponent(model);
        MapSequence.fromMap(myEditorComponentToErrorMap).put(mainEditorComponent.value, errorsComponent);

        Set<EditorComponent> mappedEditorComponent = MapSequence.fromMap(myModelToEditorComponentsMap).get(model);
        if (mappedEditorComponent == null) {
          mappedEditorComponent = SetSequence.fromSet(new HashSet<EditorComponent>());
          MapSequence.fromMap(myModelToEditorComponentsMap).put(model, mappedEditorComponent);
          addModelListener(model);
        }
        SetSequence.fromSet(mappedEditorComponent).addElement(mainEditorComponent.value);

        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            mainEditorComponent.value.addDisposeListener(myDisposeListener);
            if (mainEditorComponent.value.isDisposed()) {
              myDisposeListener.editorWillBeDisposed(mainEditorComponent.value);
            }
          }
        });
      }
      return errorsComponent;
    }
  }
  /*package*/ void clear(EditorComponent editorComponent) {
    synchronized (myMapsLock) {
      MapSequence.fromMap(myEditorComponentToErrorMap).get(editorComponent).clear();
    }
  }

}
