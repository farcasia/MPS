package jetbrains.mps.testHybridEditor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Objects;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_all_ports_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_all_ports_NonTypesystemRule() {
  }
  public void applyRule(final SNode block, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    boolean result = true;
    for (SNode port : ListSequence.fromList(SLinkOperations.getChildren(block, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702f98L, 0xa10615a65702ffeL, "inputPorts")))) {
      boolean portResult = false;
      for (SNode connector : ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(block), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702ec1L, "jetbrains.mps.testHybridEditor.structure.Diagram")), MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702ec1L, 0xa10615a65702fdaL, "connectors")))) {
        portResult = portResult || Objects.equals(SLinkOperations.getTarget(connector, MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702fa1L, 0xa10615a65703018L, "inputPort")), port);
      }
      result = result && portResult;
    }
    for (SNode port : ListSequence.fromList(SLinkOperations.getChildren(block, MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702f98L, 0xa10615a65703000L, "outputPorts")))) {
      boolean portResult = false;
      for (SNode connector : ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(block), MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702ec1L, "jetbrains.mps.testHybridEditor.structure.Diagram")), MetaAdapterFactory.getContainmentLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702ec1L, 0xa10615a65702fdaL, "connectors")))) {
        portResult = portResult || Objects.equals(SLinkOperations.getTarget(connector, MetaAdapterFactory.getReferenceLink(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702fa1L, 0xa10615a65703014L, "outputPort")), port);
      }
      result = result && portResult;
    }
    if (!(result)) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(block, "all ports must be connected", "r:ad8f2b18-3038-4a9d-ad27-aa5680bf8421(jetbrains.mps.testHybridEditor.typesystem)", "884514646183091769", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x913a1d639e1948faL, 0xad03e33ecccd3814L, 0xa10615a65702f98L, "jetbrains.mps.testHybridEditor.structure.Block");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
