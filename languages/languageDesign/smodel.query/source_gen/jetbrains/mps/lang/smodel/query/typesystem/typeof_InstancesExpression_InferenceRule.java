package jetbrains.mps.lang.smodel.query.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class typeof_InstancesExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InstancesExpression_InferenceRule() {
  }
  public void applyRule(final SNode instancesExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(instancesExpression, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, 0x6b643f33718aa10eL, "conceptArg"));
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "7057947030084340457", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "7057947030084340460", true), (SNode) _quotation_createNode_dwt96n_a1a2a0a1(), false, true, _info_12389875345);
    }

    {
      SNode _nodeToCheck_1029348928467 = instancesExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "473081947984804985", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "473081947984804988", true), (SNode) _quotation_createNode_dwt96n_a1a2a2a1(), false, true, _info_12389875345);
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(instancesExpression, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, 0x6b643f33718aa10eL, "conceptArg")), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11885c0d945L, "jetbrains.mps.lang.smodel.structure.PoundExpression"))) {
      {
        final SNode conceptParameterType = typeCheckingContext.typeOf(SLinkOperations.getTarget(instancesExpression, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, 0x6b643f33718aa10eL, "conceptArg")), "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024291279", true);
        typeCheckingContext.whenConcrete(conceptParameterType, new Runnable() {
          public void run() {
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(conceptParameterType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, "jetbrains.mps.lang.smodel.structure.SConceptType"))) {
              SNode conceptType = SNodeOperations.cast(typeCheckingContext.getExpandedNode(conceptParameterType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, "jetbrains.mps.lang.smodel.structure.SConceptType"));
              if (SLinkOperations.getTarget(conceptType, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, 0x5cab42cd97571cefL, "conceptDeclaraton")) == null) {
                {
                  SNode _nodeToCheck_1029348928467 = instancesExpression;
                  EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024608968", 0, null);
                  typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024608970", true), (SNode) _quotation_createNode_dwt96n_a1a2a0a1a0a0a0b0a1a0a3a1(), _info_12389875345);
                }
              } else {
                {
                  SNode _nodeToCheck_1029348928467 = instancesExpression;
                  EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024291267", 0, null);
                  typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024291269", true), (SNode) _quotation_createNode_dwt96n_a1a2a0a0b0a0a0a1a0b0a0d0b(SLinkOperations.getTarget(conceptType, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, 0x5cab42cd97571cefL, "conceptDeclaraton"))), _info_12389875345);
                }
              }
            }
          }
        }, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "6864030874024291258", false, false);
      }
    } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(instancesExpression, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, 0x6b643f33718aa10eL, "conceptArg")), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1120c45902cL, "jetbrains.mps.lang.smodel.structure.RefConcept_Reference"))) {
      {
        SNode _nodeToCheck_1029348928467 = instancesExpression;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "4693937538539160493", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:7e8cfa8a-da13-467d-9878-63b90b943128(jetbrains.mps.lang.smodel.query.typesystem)", "4693937538539160495", true), (SNode) _quotation_createNode_dwt96n_a1a2a0a0d0b(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(instancesExpression, MetaAdapterFactory.getContainmentLink(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, 0x6b643f33718aa10eL, "conceptArg")), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1120c45902cL, "jetbrains.mps.lang.smodel.structure.RefConcept_Reference")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1120c45902cL, 0x1120c45d024L, "conceptDeclaration"))), _info_12389875345);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x1a8554c4eb8443baL, 0x8c346f0d90c6e75aL, 0x6b643f33718aa10dL, "jetbrains.mps.lang.smodel.query.structure.InstancesExpression");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_dwt96n_a1a2a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x5cab42cd97571ceeL, "SConceptType"), null, null, false);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_dwt96n_a1a2a2a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x62e1df06bd2172b2L, "CollectionType"), null, null, false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), quotedNode_2);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_dwt96n_a1a2a0a1a0a0a0b0a1a0a3a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x62e1df06bd2172b2L, "CollectionType"), null, null, false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), quotedNode_2);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_dwt96n_a1a2a0a0b0a0a0a1a0b0a0d0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x62e1df06bd2172b2L, "CollectionType"), null, null, false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), (SNode) parameter_1);
    quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), quotedNode_3);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_dwt96n_a1a2a0a0d0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x62e1df06bd2172b2L, "CollectionType"), null, null, false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), (SNode) parameter_1);
    quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4eec26fcbaf8c39bL, 0x4eec26fcbaf8c39cL, "elementType"), quotedNode_3);
    return quotedNode_2;
  }
}
