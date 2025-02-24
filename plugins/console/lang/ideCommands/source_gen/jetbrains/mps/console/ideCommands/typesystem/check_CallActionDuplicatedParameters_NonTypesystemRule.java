package jetbrains.mps.console.ideCommands.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.console.ideCommands.behavior.ActionCallParameter__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_CallActionDuplicatedParameters_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_CallActionDuplicatedParameters_NonTypesystemRule() {
  }
  public void applyRule(final SNode callAction, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final Iterable<SNode> parameters = SLinkOperations.getChildren(callAction, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587adL, 0x4d7759afce9587afL, "parameter"));
    Iterable<SNode> parameterFields = Sequence.fromIterable(parameters).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return (SNode) ActionCallParameter__BehaviorDescriptor.getParameterDeclaration_id4PRmqZe_o$D.invoke(it);
      }
    }).distinct();
    Iterable<? extends Iterable<SNode>> grouped = Sequence.fromIterable(parameterFields).select(new ISelector<SNode, ISequence<SNode>>() {
      public ISequence<SNode> select(final SNode c) {
        return Sequence.fromIterable(parameters).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode p) {
            return Objects.equals(ActionCallParameter__BehaviorDescriptor.getParameterDeclaration_id4PRmqZe_o$D.invoke(p), c);
          }
        });
      }
    });

    for (Iterable<SNode> group : Sequence.fromIterable(grouped)) {
      if (Sequence.fromIterable(group).count() > 1) {
        for (SNode other : Sequence.fromIterable(group).tail(Sequence.fromIterable(group).count() - 1)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(other, "Duplicated parameter: " + INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(ActionCallParameter__BehaviorDescriptor.getParameterDeclaration_id4PRmqZe_o$D.invoke(Sequence.fromIterable(group).first())), "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "5582028874769074233", null, errorTarget);
          }
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x4d7759afce9587adL, "jetbrains.mps.console.ideCommands.structure.CallActionExpression");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
