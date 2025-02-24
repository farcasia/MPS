package jetbrains.mps.lang.util.order.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.util.order.behavior.Order__BehaviorDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_Order_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Order_NonTypesystemRule() {
  }
  public void applyRule(final SNode order, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((SNodeOperations.getParent(order) == null)) {
      return;
    }
    if ((boolean) Order__BehaviorDescriptor.presents_id1jgMklchcXk.invoke(order, SNodeOperations.getNodeAncestor(order, MetaAdapterFactory.getInterfaceConcept(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x2085244dcb20c1dcL, "jetbrains.mps.lang.util.order.structure.OrderParticipant"), false, false))) {
      return;
    }
    {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(order, "order does not contain current entity", "r:f788c62b-42b4-4d31-be80-806bf92fccaf(jetbrains.mps.lang.util.order.typesystem)", "1499919975383986350", null, errorTarget);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getInterfaceConcept(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78145L, "jetbrains.mps.lang.util.order.structure.Order");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
