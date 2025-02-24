package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.Objects;

public class check_InlineTemplateWithContext_RuleConsequence_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_InlineTemplateWithContext_RuleConsequence_NonTypesystemRule() {
  }
  public void applyRule(final SNode consequence, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    // FIXME there's identical code in check_TemplateDeclaration 
    // see TemplateContainer#checkAdjacentFragments 
    SNode commonParent = null;
    SContainmentLink commonAggregationLink = null;
    for (SNode tf : SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(consequence, MetaAdapterFactory.getContainmentLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7b85dded0be53d6cL, 0x7b85dded0be53d6fL, "contentNode")), MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0xff1b29b76cL, "jetbrains.mps.lang.generator.structure.TemplateFragment"), false, new SAbstractConcept[]{})) {
      SNode fragmentParent = SNodeOperations.getParent(tf);
      SContainmentLink containmentLink = fragmentParent.getContainmentLink();
      if (commonParent == null) {
        // first fragment - remember its parent and role to use as reference value 
        commonParent = SNodeOperations.getParent(fragmentParent);
        commonAggregationLink = containmentLink;
      } else {
        if (commonParent != SNodeOperations.getParent(fragmentParent)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(tf, String.format("Template Fragments shall reside under same parent node"), "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "4888628500252446443", null, errorTarget);
          }
        }
        if (!(Objects.equals(commonAggregationLink, fragmentParent.getContainmentLink()))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(tf, String.format("Template Fragments shall use same same containment link"), "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "4888628500252448664", null, errorTarget);
          }
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7b85dded0be53d6cL, "jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
