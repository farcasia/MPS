package jetbrains.mps.lang.quotation.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.smodel.SReference;

public class typeof_Quotation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Quotation_InferenceRule() {
  }
  public void applyRule(final SNode quotation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode quotationNode = quotation;
    {
      SNode _nodeToCheck_1029348928467 = quotationNode;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "1196858483110", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "1196858483112", true), (SNode) _quotation_createNode_wzo52i_a1a2a1a1(SNodeOperations.asNode(SNodeOperations.getConcept(SLinkOperations.getTarget(quotationNode, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, 0x1168c10465aL, "quotedNode"))))), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(quotation, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, 0x1168c10465bL, "modelToCreate"));
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "3180306201267183159", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "3180306201267183161", true), (SNode) _quotation_createNode_wzo52i_a1a2a2a1(), false, false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(quotation, MetaAdapterFactory.getContainmentLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, 0x2c22b7a3db809c05L, "nodeId"));
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "3180306201267192129", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.typesystem)", "3180306201267192131", true), (SNode) _quotation_createNode_wzo52i_a1a2a3a1(), false, false, _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, "jetbrains.mps.lang.quotation.structure.Quotation");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_wzo52i_a1a2a1a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_wzo52i_a1a2a2a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)"), facade.createNodeId("~SModel")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_wzo52i_a1a2a3a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)"), facade.createNodeId("~SNodeId")));
    return quotedNode_1;
  }
}
