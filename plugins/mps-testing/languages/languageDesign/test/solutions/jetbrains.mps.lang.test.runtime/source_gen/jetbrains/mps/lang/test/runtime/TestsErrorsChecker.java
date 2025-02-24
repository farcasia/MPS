package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.errors.item.NodeReportItem;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.errors.MessageStatus;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.typesystemEngine.checker.TypesystemChecker;
import org.jetbrains.mps.openapi.util.Consumer;
import jetbrains.mps.progress.EmptyProgressMonitor;
import java.util.List;
import jetbrains.mps.checkers.IChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.checkers.AbstractConstraintsCheckerRootCheckerAdapter;
import jetbrains.mps.checkers.ConstraintsChecker;
import jetbrains.mps.checkers.RefScopeChecker;
import jetbrains.mps.checkers.TargetConceptChecker;
import jetbrains.mps.project.validation.ValidationUtil;
import org.jetbrains.mps.openapi.util.Processor;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.checkers.ErrorReportUtil;
import org.jetbrains.annotations.Nullable;

/**
 * 
 * @deprecated needs to be united with the common model checking logic. Here we have the second cache of the same things.
 */
@Deprecated
public class TestsErrorsChecker {
  private static final Logger LOG = LogManager.getLogger(TestsErrorsChecker.class);
  private final SNode myRoot;

  /**
   * contains cached warnings and errors for the current root
   */
  private TestsErrorsChecker.ModelErrorsHolder<NodeReportItem> ourModelErrorsHolder = new TestsErrorsChecker.ModelErrorsHolder<NodeReportItem>();

  @Deprecated
  public TestsErrorsChecker(SNode root) {
    assert root == SNodeOperations.getContainingRoot(root);
    myRoot = root;
  }

  public SNode getRoot() {
    return myRoot;
  }

  public Iterable<NodeReportItem> getAllErrors() {
    return getRootErrors();
  }

  public Iterable<NodeReportItem> getErrors(@NotNull SNode node) {
    Iterable<NodeReportItem> result = getRootErrors();
    return filterReportersByNode(result, node);
  }

  public Iterable<NodeReportItem> getErrorsSpecificType(SNode node, final MessageStatus errorType) {
    Set<NodeReportItem> result = SetSequence.fromSet(new HashSet<NodeReportItem>());
    SetSequence.fromSet(result).addSequence(Sequence.fromIterable(getErrors(node)).where(new IWhereFilter<NodeReportItem>() {
      public boolean accept(NodeReportItem it) {
        return it.getSeverity() == errorType;
      }
    }));
    return result;
  }

  private Iterable<NodeReportItem> filterReportersByNode(final Iterable<NodeReportItem> errors, @NotNull final SNode aNode) {
    return Sequence.fromIterable(errors).where(new IWhereFilter<NodeReportItem>() {
      public boolean accept(NodeReportItem it) {
        assert it.getNode() != null;
        return it.getNode().getNodeId().equals(aNode.getNodeId());
      }
    });
  }

  private Iterable<NodeReportItem> getRootErrors() {
    Set<NodeReportItem> cachedErrors = ourModelErrorsHolder.get(myRoot);
    if (cachedErrors != null) {
      return SetSequence.fromSet(cachedErrors).toListSequence();
    }

    if (LOG.isDebugEnabled()) {
      LOG.debug("Collecting errors in the root " + myRoot);
    }
    final Set<NodeReportItem> result = SetSequence.fromSet(new HashSet<NodeReportItem>());
    new TypesystemChecker().check(myRoot, myRoot.getModel().getRepository(), new Consumer<NodeReportItem>() {
      public void consume(NodeReportItem reportItem) {
        SetSequence.fromSet(result).addElement(reportItem);
      }
    }, new EmptyProgressMonitor());
    Consumer<NodeReportItem> errorCollector = new Consumer<NodeReportItem>() {
      public void consume(NodeReportItem reportItem) {
        SetSequence.fromSet(result).addElement(reportItem);
      }
    };
    List<IChecker<SNode, NodeReportItem>> checkers = ListSequence.fromList(new ArrayList<IChecker<SNode, NodeReportItem>>());
    // todo: add UsedLanguageChecker? 
    ListSequence.fromList(checkers).addSequence(ListSequence.fromList(AbstractConstraintsCheckerRootCheckerAdapter.createList(AbstractConstraintsCheckerRootCheckerAdapter.SKIP_CONSTRAINTS_CONDITION, new ConstraintsChecker(), new RefScopeChecker(), new TargetConceptChecker())));
    for (IChecker<SNode, NodeReportItem> checker : ListSequence.fromList(checkers)) {
      checker.check(myRoot, myRoot.getModel().getRepository(), errorCollector, new EmptyProgressMonitor());
    }
    ValidationUtil.validateModelContent(Sequence.<SNode>singleton(myRoot), new Processor<NodeReportItem>() {
      public boolean process(NodeReportItem vp) {
        SetSequence.fromSet(result).addElement(vp);
        return true;
      }
    });

    Set<NodeReportItem> res = SetSequence.fromSetWithValues(new HashSet<NodeReportItem>(), SetSequence.fromSet(result).where(new IWhereFilter<NodeReportItem>() {
      public boolean accept(NodeReportItem it) {
        SNodeReference node = NodeReportItem.FLAVOUR_NODE.tryToGet(it);
        return node == null || !(ErrorReportUtil.manuallySuppressed(node.resolve(myRoot.getModel().getRepository())));
      }
    }));
    ourModelErrorsHolder.set(myRoot, res);
    return res;
  }

  private static class ModelErrorsHolder<T> {
    private Set<T> myCachedErrors;
    private SNode myRoot;

    @Nullable
    public Set<T> get(SNode root) {
      if (myCachedErrors != null && sameRoot(root)) {
        return myCachedErrors;
      }
      return null;
    }

    private boolean sameRoot(SNode root) {
      return root == myRoot;
    }

    public void set(SNode root, Set<T> errors) {
      myRoot = root;
      myCachedErrors = SetSequence.fromSet(new HashSet<T>());
      SetSequence.fromSet(myCachedErrors).addSequence(SetSequence.fromSet(errors));
    }
  }
}
