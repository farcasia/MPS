package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.DynamicReference;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class check_DynamicReference_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_DynamicReference_NonTypesystemRule() {
  }
  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SModel ourModel = SNodeOperations.getModel(node);
    if (!(ourModel instanceof DefaultSModelDescriptor)) {
      return;
    }

    for (SReference ref : ListSequence.fromList(SNodeOperations.getReferences(node))) {
      if (!((SReference) ref instanceof DynamicReference)) {
        continue;
      }
      if (ref.getTargetNode() == null) {
        continue;
      }

      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new ReferenceMessageTarget(SLinkOperations.getRefLink(ref).getName());
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Dynamic reference", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "6287546302289294798", null, errorTarget);
        {
          BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.makeReferenceStatic_QuickFix", true);
          intentionProvider.putArgument("role", SLinkOperations.getRefLink(ref));
          _reporter_2309309498.addIntentionProvider(intentionProvider);
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
