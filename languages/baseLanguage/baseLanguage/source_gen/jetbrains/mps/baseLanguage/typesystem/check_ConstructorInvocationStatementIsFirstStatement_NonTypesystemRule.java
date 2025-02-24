package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.StatementList__BehaviorDescriptor;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_ConstructorInvocationStatementIsFirstStatement_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ConstructorInvocationStatementIsFirstStatement_NonTypesystemRule() {
  }
  public void applyRule(final SNode constructorInvocation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode constructor = SNodeOperations.getNodeAncestor(constructorInvocation, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b204L, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"), false, false);
    if (constructor != null) {
      SNode statementList = SLinkOperations.getTarget(constructor, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"));
      SNode firstStatement = StatementList__BehaviorDescriptor.getFirstStatement_id4GU1DgEHJ2u.invoke(statementList);
      if (firstStatement != constructorInvocation) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(constructorInvocation, "Call to '" + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(constructorInvocation) + "' must be first statement in constructor body", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3133930811460325358", null, errorTarget);
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x121119ae5ffL, "jetbrains.mps.baseLanguage.structure.ConstructorInvocationStatement");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
