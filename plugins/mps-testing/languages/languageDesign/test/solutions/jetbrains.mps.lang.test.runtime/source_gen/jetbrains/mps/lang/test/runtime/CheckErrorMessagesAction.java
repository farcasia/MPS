package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.errors.item.NodeReportItem;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import junit.framework.Assert;
import jetbrains.mps.errors.MessageStatus;

public class CheckErrorMessagesAction implements Runnable {
  private final SNode myNode;
  private boolean myAllowsWarnings;
  private boolean myAllowsErrors;
  private boolean myIncludeSelf;

  public CheckErrorMessagesAction(SNode node, boolean allowsWarnings, boolean allowsErrors) {
    this.myNode = node;
    this.myAllowsWarnings = allowsWarnings;
    this.myAllowsErrors = allowsErrors;
  }

  public CheckErrorMessagesAction includeSelf(boolean includeSelf) {
    myIncludeSelf = includeSelf;
    return this;
  }

  @Override
  public void run() {
    TestsErrorsChecker checker = new TestsErrorsChecker(SNodeOperations.getContainingRoot(myNode));
    List<SNode> descendants;
    descendants = (myIncludeSelf ? SNodeOperations.getNodeDescendants(myNode, null, true, new SAbstractConcept[]{}) : SNodeOperations.getNodeDescendants(myNode, null, false, new SAbstractConcept[]{}));
    final Iterable<NodeReportItem> reporters = checker.getAllErrors();
    for (NodeReportItem reporter : reporters) {
      SNode child = reporter.getNode().resolve(myNode.getModel().getRepository());
      assert child != null;
      if (!(ListSequence.fromList(descendants).contains(child))) {
        continue;
      }
      if (hasErrorOrWarningCheckOperationTag(child)) {
        continue;
      }
      final String messageString = getErrorString(reporter, child);
      checkWarnings(reporter, messageString);
      checkErrors(reporter, messageString);
    }
  }

  private static boolean hasErrorOrWarningCheckOperationTag(SNode node) {
    if (AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b07a3d4b5L, "jetbrains.mps.lang.test.structure.NodeOperationsContainer"))) == null) {
      return false;
    }
    SNode container = AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b07a3d4b5L, "jetbrains.mps.lang.test.structure.NodeOperationsContainer")));
    for (SNode property : SLinkOperations.getChildren(container, MetaAdapterFactory.getContainmentLink(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x11b07a3d4b5L, 0x11b07abae7cL, "nodeOperations"))) {
      if (SNodeOperations.isInstanceOf(property, MetaAdapterFactory.getInterfaceConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x770c2c9f6ef97f30L, "jetbrains.mps.lang.test.structure.IChecksRules"))) {
        return true;
      }
    }
    return false;
  }

  private void checkWarnings(NodeReportItem reporter, String warningMsg) {
    if (!(myAllowsWarnings)) {
      Assert.assertTrue(warningMsg, reporter.getSeverity() != MessageStatus.WARNING);
    }
  }

  private void checkErrors(NodeReportItem reporter, String errorMsg) {
    if (!(myAllowsErrors)) {
      Assert.assertTrue(errorMsg, reporter.getSeverity() != MessageStatus.ERROR);
    }
  }

  private String getErrorString(NodeReportItem reporter, SNode node) {
    return reporter.getMessage() + ". Node '" + NodeCheckerUtil.nodeWithIdToString(node) + "'";
  }
}
