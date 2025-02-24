package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_TransformationFeaturesAreNotDuplicated_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_TransformationFeaturesAreNotDuplicated_NonTypesystemRule() {
  }
  public void applyRule(final SNode part, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    ListSequence.fromList(DuplicationUtil.getDuplications(SLinkOperations.getChildren(part, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x652f322a364c9a28L, 0x7c45559defbb3517L, "features")))).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(it, "duplicated feature", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "6239791100560465408", null, errorTarget);
        }
      }
    });
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x652f322a364c9a28L, "jetbrains.mps.lang.editor.structure.IExtensibleTransformationMenuPart");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
