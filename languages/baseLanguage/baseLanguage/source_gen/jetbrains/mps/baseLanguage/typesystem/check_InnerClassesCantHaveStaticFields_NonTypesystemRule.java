package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IClassifierMember__BehaviorDescriptor;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_InnerClassesCantHaveStaticFields_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_InnerClassesCantHaveStaticFields_NonTypesystemRule() {
  }
  public void applyRule(final SNode staticFieldDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(SNodeOperations.getParent(staticFieldDeclaration))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      SNode classConcept = (SNode) SNodeOperations.getParent(staticFieldDeclaration);
      if ((boolean) Classifier__BehaviorDescriptor.isInner_idsWroEc0xXl.invoke(classConcept) && !((boolean) IClassifierMember__BehaviorDescriptor.isStatic_id6r77ob2USS8.invoke(classConcept))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(staticFieldDeclaration, "Inner classes cannot have static fields", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "498633765599992972", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.MakeStaticFieldNotStatic_QuickFix", false);
            intentionProvider.putArgument("staticField", staticFieldDeclaration);
            intentionProvider.putArgument("containingClass", classConcept);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
