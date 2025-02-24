package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.generator.behavior.BaseMappingRule__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class typeof_BaseMappingRule_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_BaseMappingRule_InferenceRule() {
  }
  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x1179c430cc8L, "labelDeclaration")), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1179be47606L, 0x1179be4dc5eL, "sourceConcept")) != null) {
      if (!((boolean) AbstractConceptDeclaration__BehaviorDescriptor.isSubconceptOf_id73yVtVlWOga.invoke(SLinkOperations.getTarget(nodeToCheck, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x10fc0b6e730L, "applicableConcept")), SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x1179c430cc8L, "labelDeclaration")), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1179be47606L, 0x1179be4dc5eL, "sourceConcept"))))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "Label has incorrect type", "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1203556587912", null, errorTarget);
        }
      }
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1200922039515", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) _quotation_createNode_dxi99s_a0a2a1a0a1(SNodeOperations.asNode(BaseMappingRule__BehaviorDescriptor.getTemplateType_idhEwJbaf.invoke(nodeToCheck))), (SNode) _quotation_createNode_dxi99s_a1a2a1a0a1(SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, 0x1179c430cc8L, "labelDeclaration")), MetaAdapterFactory.getReferenceLink(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1179be47606L, 0x1179bfe3866L, "targetConcept"))), false, false, _info_12389875345);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L, "jetbrains.mps.lang.generator.structure.BaseMappingRule");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_dxi99s_a0a2a1a0a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_dxi99s_a1a2a1a0a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), (SNode) parameter_1);
    return quotedNode_2;
  }
}
