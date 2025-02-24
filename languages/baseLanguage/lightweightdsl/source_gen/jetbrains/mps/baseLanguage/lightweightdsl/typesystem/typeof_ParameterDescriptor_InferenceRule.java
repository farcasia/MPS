package jetbrains.mps.baseLanguage.lightweightdsl.typesystem;

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
import jetbrains.mps.smodel.SReference;

public class typeof_ParameterDescriptor_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ParameterDescriptor_InferenceRule() {
  }
  public void applyRule(final SNode pd, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(typeCheckingContext.isSingleTypeComputation())) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(pd, MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, 0x1c6f8dad3c495fe9L, "condition"));
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:e04b7053-8c89-4f87-b296-94779c625d9d(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.typesystem)", "2049012130657191712", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:e04b7053-8c89-4f87-b296-94779c625d9d(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.typesystem)", "2049012130657190066", true), (SNode) _quotation_createNode_6o66u8_a1a2a0a0a1(), true, false, _info_12389875345);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.ParameterDescriptor");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_6o66u8_a1a2a0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xfd3920347849419dL, 0x907112563d152375L, "jetbrains.mps.baseLanguage.closures"), 0x1174a4d19ffL, "FunctionType"), null, null, false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    quotedNode_2.setReference(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), SReference.create(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), quotedNode_2, facade.createModelReference("c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:7cc2086d-c7d0-49c7-811c-ebbaf40d9195(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.structure)"), facade.createNodeId("3751132065236767060")));
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174a4d19ffL, 0x1174a4e013cL, "parameterType"), quotedNode_2);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940d6513eL, "BooleanType"), null, null, false);
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174a4d19ffL, 0x1174a4d5371L, "resultType"), quotedNode_3);
    return quotedNode_1;
  }
}
