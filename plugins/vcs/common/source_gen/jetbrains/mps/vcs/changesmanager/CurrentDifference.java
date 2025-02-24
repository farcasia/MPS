package jetbrains.mps.vcs.changesmanager;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.EditableSModel;
import jetbrains.mps.vcs.diff.ChangeSetImpl;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vcs.diff.ChangeSet;

public class CurrentDifference {
  private final SimpleCommandQueue myCommandQueue;
  private final EditableSModel myModelDescriptor;
  private final ChangesTracking myTracking;
  private ChangeSetImpl myChangeSet;
  private final CurrentDifferenceBroadcaster myBroadcaster;
  private boolean myEnabled = false;

  public CurrentDifference(@NotNull CurrentDifferenceRegistry registry, @NotNull EditableSModel modelDescriptor) {
    myCommandQueue = registry.getCommandQueue();
    myModelDescriptor = modelDescriptor;
    myTracking = new ChangesTracking(registry, this);
    myBroadcaster = new CurrentDifferenceBroadcaster(myCommandQueue);
    myBroadcaster.addDifferenceListener(registry.getGlobalBroadcaster());
  }

  public void dispose() {
    myTracking.dispose();
  }

  public void addDifferenceListener(@NotNull CurrentDifferenceListener listener) {
    myBroadcaster.addDifferenceListener(listener);
  }

  public void removeDifferenceListener(@NotNull CurrentDifferenceListener listener) {
    myBroadcaster.removeDifferenceListener(listener);
  }

  /*package*/ void removeChangeSet() {
    myCommandQueue.assertSoftlyIsCommandThread();
    if (myChangeSet != null) {
      myBroadcaster.changeUpdateStarted();
      ListSequence.fromList(myChangeSet.getModelChanges()).visitAll(new IVisitor<ModelChange>() {
        public void visit(ModelChange ch) {
          myBroadcaster.changeRemoved(ch);
        }
      });
      myChangeSet = null;
      myBroadcaster.changeUpdateFinished();
    }
  }

  /*package*/ void setChangeSet(@NotNull ChangeSetImpl changeSetImpl) {
    myCommandQueue.assertSoftlyIsCommandThread();
    removeChangeSet();
    myBroadcaster.changeUpdateStarted();
    myChangeSet = changeSetImpl;
    ListSequence.fromList(myChangeSet.getModelChanges()).visitAll(new IVisitor<ModelChange>() {
      public void visit(ModelChange ch) {
        myBroadcaster.changeAdded(ch);
      }
    });
    myBroadcaster.changeUpdateFinished();
  }

  /*package*/ CurrentDifferenceBroadcaster getBroadcaster() {
    return myBroadcaster;
  }

  /*package*/ void addChange(@NotNull ModelChange change) {
    if (myChangeSet != null) {
      myChangeSet.add(change);
      myBroadcaster.changeAdded(change);
    }
  }

  /*package*/ void removeChange(@NotNull ModelChange change) {
    if (myChangeSet != null) {
      myChangeSet.remove(change);
      myBroadcaster.changeRemoved(change);
    }
  }

  public EditableSModel getModelDescriptor() {
    return myModelDescriptor;
  }

  /*package*/ ChangesTracking getChangesTracker() {
    return myTracking;
  }

  /*package*/ boolean isEnabled() {
    return myEnabled;
  }

  public void setEnabled(boolean enabled) {
    if (myEnabled != enabled) {
      myEnabled = enabled;
      if (enabled) {
        myTracking.scheduleFullUpdate(true);
      } else {
        myCommandQueue.addTask(new Runnable() {
          public void run() {
            setChangeSet(null);
          }
        });
      }
    }
  }

  @Nullable
  public ChangeSet getChangeSet() {
    return myChangeSet;
  }
}
