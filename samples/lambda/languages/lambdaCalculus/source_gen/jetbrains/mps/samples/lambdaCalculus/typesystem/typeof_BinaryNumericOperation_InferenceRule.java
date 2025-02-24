package jetbrains.mps.samples.lambdaCalculus.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_BinaryNumericOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_BinaryNumericOperation_InferenceRule() {
  }
  public void applyRule(final SNode binaryNumericOperation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binaryNumericOperation, MetaAdapterFactory.getContainmentLink(0x7c9e280794ad4afcL, 0xadf0aaee45eb2895L, 0x1ad829a6925a095bL, 0x1ad829a6925a095cL, "left"));
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "1888188276221891124", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:8c01d5e0-82c3-43e7-9986-af954df6cb8b(jetbrains.mps.samples.lambdaCalculus.typesystem)", "1888188276221891115", true), (SNode) _quotation_createNode_h9lwhb_a1a2a0a1(), _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x7c9e280794ad4afcL, 0xadf0aaee45eb2895L, 0x1a34313bb1413cb4L, "jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_h9lwhb_a1a2a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7c9e280794ad4afcL, 0xadf0aaee45eb2895L, "jetbrains.mps.samples.lambdaCalculus"), 0x3ee0e3dd7c1afadaL, "NumberType"), null, null, false);
    return quotedNode_1;
  }
}
