package jetbrains.mps.vcs.changesmanager.editor;

/*Generated by MPS */

import jetbrains.mps.project.MPSProject;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vcs.diff.ui.common.ChangeGroup;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import java.util.List;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.vcs.diff.changes.NodeCopier;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.vcs.diff.changes.NodeGroupChange;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.ui.common.Bounds;
import jetbrains.mps.vcs.diff.changes.ChangeType;
import jetbrains.mps.vcs.diff.ui.common.DiffModelUtil;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.vcs.diff.changes.NodeChange;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import java.util.Objects;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.ide.datatransfer.CopyPasteUtil;

public final class ChangesStripActionsHelper {
  private final MPSProject myProject;
  private final EditorContext myEditorContext;

  public ChangesStripActionsHelper(@NotNull MPSProject mpsProject, @NotNull EditorContext editorContext) {
    myProject = mpsProject;
    myEditorContext = editorContext;
  }

  @Nullable
  private ChangeGroup getNeighbourChangeGroup(boolean next) {
    return check_ikrecr_a0a5(getPainter(), myEditorContext, next, this);
  }

  public boolean isNeighbourGroupAvailable(boolean next) {
    return getNeighbourChangeGroup(next) != null;
  }
  public void goToNeighbourGroup(boolean next) {
    ChangeGroup group = getNeighbourChangeGroup(next);
    if (group == null) {
      return;
    }
    EditorComponent editorComponent = (EditorComponent) myEditorContext.getEditorComponent();
    goToY(editorComponent, (int) group.getBounds(true).end());
    goToY(editorComponent, (int) group.getBounds(true).start());
    check_ikrecr_a5a8(getPainter(), group, this);
  }
  private static void goToY(EditorComponent editorComponent, int y) {
    EditorCell editorCell = editorComponent.findCellWeak(1, y + 1);
    if (editorCell != null) {
      editorComponent.changeSelection(editorCell);
    }
  }
  @Nullable
  private EditorHighlighter getHighlighter() {
    EditorComponent editorComponent = (EditorComponent) myEditorContext.getEditorComponent();
    return check_ikrecr_a1a01(myProject.getComponent(EditorHighlighterFactory.class), editorComponent);
  }
  @Nullable
  private ChangeStripsPainter getPainter() {
    return check_ikrecr_a0a11(getHighlighter(), this);
  }
  @Nullable
  private ChangeGroup getCurrentChangeGroup() {
    return check_ikrecr_a0a21(getPainter(), this);
  }

  public void rollbackChanges() {
    final List<ModelChange> changes = check_ikrecr_a0a0o(getCurrentChangeGroup(), this);
    if (changes == null) {
      return;
    }
    myEditorContext.getRepository().getModelAccess().executeCommand(new Runnable() {
      public void run() {
        final SModel model = ListSequence.fromList(changes).first().getChangeSet().getNewModel();
        final NodeCopier nc = new NodeCopier(model);
        Iterable<ModelChange> oppositeChanges = ListSequence.fromList(changes).select(new ISelector<ModelChange, ModelChange>() {
          public ModelChange select(ModelChange ch) {
            return ch.getOppositeChange();
          }
        });
        for (ModelChange ch : Sequence.fromIterable(oppositeChanges)) {
          if (ch instanceof NodeGroupChange) {
            ((NodeGroupChange) ch).prepare();
          }
        }
        Sequence.fromIterable(oppositeChanges).visitAll(new IVisitor<ModelChange>() {
          public void visit(ModelChange ch) {
            ch.apply(model, nc);
          }
        });
        nc.restoreIds(true);
        check_ikrecr_a6a0a0c0o(getPainter(), ChangesStripActionsHelper.this);
      }
    });
  }

  public Bounds getCurrentChangeGroupPositionAndHidePopup() {
    ChangeGroup cg = getCurrentChangeGroup();
    check_ikrecr_a1a61(getPainter(), this);
    return check_ikrecr_a2a61(cg);
  }

  public boolean areOldNodesAvailable() {
    ChangeGroup cg = getCurrentChangeGroup();
    return cg != null && cg.getChangeType() != ChangeType.ADD;
  }
  public void copyOldNodes() {
    ChangeGroup changeGroup = getCurrentChangeGroup();
    assert changeGroup != null;

    final SModel oldModel = ListSequence.fromList(changeGroup.getChanges()).first().getChangeSet().getOldModel();
    // do we need??? there were no de-registration 
    DiffModelUtil.renameModelAndRegister(oldModel, "old");

    // compute paths to root 
    Iterable<SNode> baseNodes = ListSequence.fromList(changeGroup.getChanges()).translate(new ITranslator2<ModelChange, SNode>() {
      public Iterable<SNode> translate(ModelChange ch) {
        if (ch instanceof NodeChange) {
          return Sequence.<SNode>singleton(oldModel.getNode(((NodeChange) ch).getAffectedNodeId()));
        } else if (ch instanceof NodeGroupChange) {
          NodeGroupChange ngc = (NodeGroupChange) ch;
          List<SNode> changeChildren = ngc.getChangedCollection(false);
          return ListSequence.fromList(changeChildren).page(ngc.getBegin(), ngc.getEnd());
        } else {
          return Sequence.fromIterable(Collections.<SNode>emptyList());
        }
      }
    });
    List<List<SNode>> paths = Sequence.fromIterable(baseNodes).select(new ISelector<SNode, List<SNode>>() {
      public List<SNode> select(SNode n) {
        return (List<SNode>) ListSequence.fromList(SNodeOperations.getNodeAncestors(n, null, true)).reversedList();
      }
    }).toListSequence();

    // find common path 
    final Wrappers._T<List<SNode>> commonPath = new Wrappers._T<List<SNode>>(ListSequence.fromList(paths).getElement(0));
    for (List<SNode> pathToRoot : ListSequence.fromList(paths)) {
      for (int i = 0; i < Math.min(ListSequence.fromList(commonPath.value).count(), ListSequence.fromList(pathToRoot).count()); i++) {
        if (ListSequence.fromList(commonPath.value).getElement(i) != ListSequence.fromList(pathToRoot).getElement(i)) {
          commonPath.value = ListSequence.fromList(commonPath.value).take(i).toListSequence();
          break;
        }
      }
      if (ListSequence.fromList(pathToRoot).count() < ListSequence.fromList(commonPath.value).count()) {
        commonPath.value = ListSequence.fromList(commonPath.value).take(ListSequence.fromList(pathToRoot).count()).toListSequence();
      }
    }
    assert !(ListSequence.fromList(commonPath.value).isEmpty());

    // by default, copy common ancestor 
    SNode commonNode = ListSequence.fromList(commonPath.value).last();
    List<SNode> nodesToCopy = Sequence.fromIterable(Sequence.<SNode>singleton(commonNode)).toListSequence();

    if (ListSequence.fromList(paths).all(new IWhereFilter<List<SNode>>() {
      public boolean accept(List<SNode> p) {
        return ListSequence.fromList(p).count() > ListSequence.fromList(commonPath.value).count();
      }
    })) {
      Iterable<SNode> children = ListSequence.fromList(paths).select(new ISelector<List<SNode>, SNode>() {
        public SNode select(List<SNode> p) {
          return ListSequence.fromList(p).getElement(ListSequence.fromList(commonPath.value).count());
        }
      });
      Iterable<SContainmentLink> links = Sequence.fromIterable(children).select(new ISelector<SNode, SContainmentLink>() {
        public SContainmentLink select(SNode c) {
          return SNodeOperations.getContainingLinkInChildrenAndChildAttributesCollection(c);
        }
      });
      final SContainmentLink commonRole = Sequence.fromIterable(links).first();
      if (Sequence.fromIterable(links).all(new IWhereFilter<SContainmentLink>() {
        public boolean accept(SContainmentLink r) {
          return Objects.equals(r, commonRole);
        }
      })) {
        Iterable<Integer> indices = Sequence.fromIterable(children).select(new ISelector<SNode, Integer>() {
          public Integer select(SNode c) {
            return SNodeOperations.getIndexInChildrenAndChildAttributesCollection(c);
          }
        }).distinct();
        int min = Sequence.fromIterable(indices).reduceLeft(new ILeftCombinator<Integer, Integer>() {
          public Integer combine(Integer a, Integer b) {
            return Math.min(a, b);
          }
        });
        int max = Sequence.fromIterable(indices).reduceLeft(new ILeftCombinator<Integer, Integer>() {
          public Integer combine(Integer a, Integer b) {
            return Math.max(a, b);
          }
        });
        ListSequence.fromList(nodesToCopy).clear();
        ListSequence.fromList(nodesToCopy).addSequence(Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(commonNode, commonRole)).page(min, max + 1));
      }
    }

    CopyPasteUtil.copyNodesToClipboard(nodesToCopy);
    check_ikrecr_a32a91(getPainter(), this);
  }
  private static ChangeGroup check_ikrecr_a0a5(ChangeStripsPainter checkedDotOperand, EditorContext myEditorContext, Boolean next, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getNeighbourChangeGroup(myEditorContext.getContextCell(), next);
    }
    return null;
  }
  private static void check_ikrecr_a5a8(ChangeStripsPainter checkedDotOperand, ChangeGroup group, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      checkedDotOperand.showPopupForGroup(group);
    }

  }
  private static EditorHighlighter check_ikrecr_a1a01(EditorHighlighterFactory checkedDotOperand, EditorComponent editorComponent) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getHighlighter(editorComponent);
    }
    return null;
  }
  private static ChangeStripsPainter check_ikrecr_a0a11(EditorHighlighter checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getStripsPainter();
    }
    return null;
  }
  private static ChangeGroup check_ikrecr_a0a21(ChangeStripsPainter checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getCurrentChangeGroup();
    }
    return null;
  }
  private static List<ModelChange> check_ikrecr_a0a0o(ChangeGroup checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getChanges();
    }
    return null;
  }
  private static void check_ikrecr_a6a0a0c0o(ChangeStripsPainter checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      checkedDotOperand.showPopupForGroup(null);
    }

  }
  private static void check_ikrecr_a1a61(ChangeStripsPainter checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      checkedDotOperand.showPopupForGroup(null);
    }

  }
  private static Bounds check_ikrecr_a2a61(ChangeGroup checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getBounds(true);
    }
    return null;
  }
  private static void check_ikrecr_a32a91(ChangeStripsPainter checkedDotOperand, ChangesStripActionsHelper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      checkedDotOperand.showPopupForGroup(null);
    }

  }
}
