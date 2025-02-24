package jetbrains.mps.baseLanguage.lightweightdsl.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.lightweightdsl.behavior.DependentTypeInstance__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class DependentType_subtypeOfItsValue_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public DependentType_subtypeOfItsValue_SubtypingRule() {
  }
  public SNode getSubOrSuperType(SNode dependentTypeInstance, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return (SNode) DependentTypeInstance__BehaviorDescriptor.getMyType_id7T23sO8yx5P.invoke(dependentTypeInstance);
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d16bL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeInstance");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean isWeak() {
    return false;
  }
  public boolean surelyKeepsConcept() {
    return true;
  }
}
