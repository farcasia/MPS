package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.smodel.SReference;

public class typeof_AsSConcept_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AsSConcept_InferenceRule() {
  }
  public void applyRule(final SNode asSConcept, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      final SNode operandType = typeCheckingContext.typeOf(SNodeOperation__BehaviorDescriptor.getLeftExpression_idhEwJdGu.invoke(asSConcept), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967391137", true);
      typeCheckingContext.whenConcrete(operandType, new Runnable() {
        public void run() {
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(operandType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x110f9b63680L, "jetbrains.mps.lang.smodel.structure.ConceptNodeType"))) {
            {
              SNode _nodeToCheck_1029348928467 = asSConcept;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967395230", 0, null);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967395095", true), (SNode) _quotation_createNode_24c979_a1a2a0a0a0a0b0a1a0a1(SLinkOperations.getTarget(SNodeOperations.cast(typeCheckingContext.getExpandedNode(operandType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x110f9b63680L, "jetbrains.mps.lang.smodel.structure.ConceptNodeType")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x110f9b63680L, 0x112da284156L, "conceptDeclaraton"))), _info_12389875345);
            }
          } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(operandType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, "jetbrains.mps.lang.smodel.structure.SConceptType")) || SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(operandType), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x4bf20760d53f89eaL, "jetbrains.mps.lang.smodel.structure.SConceptTypeLiteral"))) {
            {
              SNode _nodeToCheck_1029348928467 = asSConcept;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967397795", 0, null);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967397805", true), (SNode) typeCheckingContext.getExpandedNode(operandType), _info_12389875345);
            }
          } else {
            if (!(typeCheckingContext.isSingleTypeComputation())) {
              {
                SNode _nodeToCheck_1029348928467 = asSConcept;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "955802970103931815", 0, null);
                typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.getExpandedNode(operandType), (SNode) _quotation_createNode_24c979_a1a2a0a0a0a0a0a1a0b0a0b(), true, false, _info_12389875345);
              }
            }
            {
              SNode _nodeToCheck_1029348928467 = asSConcept;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "955802970103931821", 0, null);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "955802970103931826", true), (SNode) _quotation_createNode_24c979_a1a2a1a0a0a0a1a0b0a0b(), _info_12389875345);
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "8828148184967391136", false, false);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x4a4d7215f163131L, "jetbrains.mps.lang.smodel.structure.AsSConcept");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_24c979_a1a2a0a0a0a0b0a1a0a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x5cab42cd97571ceeL, "SConceptType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5cab42cd97571ceeL, 0x5cab42cd97571cefL, "conceptDeclaraton"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_24c979_a1a2a0a0a0a0a0a1a0b0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), SReference.create(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), quotedNode_1, facade.createModelReference("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)"), facade.createNodeId("1169125787135")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_24c979_a1a2a1a0a0a0a1a0b0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x5cab42cd97571ceeL, "SConceptType"), null, null, false);
    return quotedNode_1;
  }
}
