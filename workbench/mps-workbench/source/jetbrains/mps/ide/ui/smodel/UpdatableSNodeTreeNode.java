/*
 * Copyright 2003-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.ui.smodel;

import jetbrains.mps.ide.projectPane.logicalview.SNodeTreeUpdater;
import jetbrains.mps.ide.ui.smodel.SModelEventsDispatcher.SModelEventsListener;
import jetbrains.mps.ide.ui.tree.smodel.SNodeTreeNode;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.event.SModelEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;

import javax.swing.tree.DefaultTreeModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// FIXME seems like favorites view is the only client for this tree node, shall reuse some other tree node instead?
public class UpdatableSNodeTreeNode extends SNodeTreeNode {
  private final Project myProject;
  private SNodeTreeUpdater myTreeUpdater;
  private SModelEventsListener myEventsListener;

  public UpdatableSNodeTreeNode(Project mpsProject, SNode node) {
    super(node);
    myProject = mpsProject;
  }

  private void addListeners() {
    if (myEventsListener == null) return;
    SModelEventsDispatcher.getInstance().registerListener(myEventsListener);
  }

  private void removeListeners() {
    SModel md = getModelDescriptor();
    if (md == null) return;
    if (myEventsListener == null) return;
    SModelEventsDispatcher.getInstance().unregisterListener(myEventsListener);
    myEventsListener = null;
    myTreeUpdater = null;
  }


  private SModel getModelDescriptor() {
    SNode node = getSNode();
    return (node == null) ? null : node.getModel();
  }

  @Override
  protected void onRemove() {
    super.onRemove();
    removeListeners();
  }

  @Override
  protected void onAdd() {
    super.onAdd();
    if (myEventsListener != null) return;
    myEventsListener = new MyEventsListener(getModelDescriptor());
    if (getModelDescriptor() instanceof EditableSModel) {
      myTreeUpdater = new MySNodeTreeUpdater(myProject, this);
    }
    addListeners();
  }

  private class MyEventsListener implements SModelEventsListener {
    private SModel myModelDescriptor;

    private MyEventsListener(SModel modelDescriptor) {
      myModelDescriptor = modelDescriptor;
    }

    @NotNull
    @Override
    public SModel getModelDescriptor() {
      return myModelDescriptor;
    }

    @Override
    public void eventsHappened(List<SModelEvent> events) {
      if (myTreeUpdater == null) return;
      myTreeUpdater.eventsHappenedInCommand(events);
    }
  }

  private class MySNodeTreeUpdater extends SNodeTreeUpdater<UpdatableSNodeTreeNode> {
    public MySNodeTreeUpdater(Project project, UpdatableSNodeTreeNode treeNode) {
      super(project, treeNode);
    }

    private Set<SNode> getNodesInThisRoot(Set<SNode> candidates) {
      Set<SNode> nodesInThisRoot = new HashSet<SNode>();
      for (SNode node : candidates) {
        SNode root = (node.getModel() != null && node.getParent() == null) ? node : node.getContainingRoot();
        if (myTreeNode.getSNode().equals(root)) {
          nodesInThisRoot.add(node);
        }
      }
      return nodesInThisRoot;
    }

    @Override
    public SModel getSModelDescriptor() {
      return myTreeNode.getSNode().getModel();
    }

    @Override
    public void updateNodesWithChangedPackages(Set<SNode> nodesWithChangedPackages) {
      // empty
    }

    @Override
    public void addAndRemoveRoots(Set<SNode> removedRoots, Set<SNode> addedRoots) {
      if (getTree() == null) return;
      DefaultTreeModel treeModel = (DefaultTreeModel) getTree().getModel();
      for (SNode removedRoot : removedRoots) {
        if (removedRoot.equals(myTreeNode.getSNode())) {
          treeModel.removeNodeFromParent(myTreeNode);
        }
      }
    }

    @Override
    public void updateChangedPresentations(Set<SNode> nodesWithChangedPresentations) {
      Set<SNode> nodeInThisRoot = getNodesInThisRoot(nodesWithChangedPresentations);
      super.updateChangedPresentations(nodeInThisRoot);
    }

    @Override
    public void updateChangedRefs(Set<SNode> nodesWithChangedRefs) {
      Set<SNode> nodeInThisRoot = getNodesInThisRoot(nodesWithChangedRefs);
      super.updateChangedRefs(nodeInThisRoot);
    }
  }
}
