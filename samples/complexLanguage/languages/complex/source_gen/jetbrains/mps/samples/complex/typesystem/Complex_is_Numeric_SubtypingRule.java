package jetbrains.mps.samples.complex.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class Complex_is_Numeric_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public Complex_is_Numeric_SubtypingRule() {
  }
  public SNode getSubOrSuperType(SNode complexType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return SLinkOperations.getTarget(_quotation_createNode_5kk67h_a0a0b(), MetaAdapterFactory.getReferenceLink(0xed6d7656532c4bc2L, 0x81d1af945aeb8280L, 0x10de9cbf8e8L, 0x10de9cbf8e7L, "descriptor"));
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xff24ab03965e4d15L, 0x9aed52dc276658f4L, 0x11686a0422aL, "jetbrains.mps.samples.complex.structure.ComplexType");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean isWeak() {
    return false;
  }
  private static SNode _quotation_createNode_5kk67h_a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xed6d7656532c4bc2L, 0x81d1af945aeb8280L, "jetbrains.mps.baseLanguage.blTypes"), 0x10de9cbf8e8L, "PrimitiveTypeRef"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xed6d7656532c4bc2L, 0x81d1af945aeb8280L, 0x10de9cbf8e8L, 0x10de9cbf8e7L, "descriptor"), SReference.create(MetaAdapterFactory.getReferenceLink(0xed6d7656532c4bc2L, 0x81d1af945aeb8280L, 0x10de9cbf8e8L, 0x10de9cbf8e7L, "descriptor"), quotedNode_1, facade.createModelReference("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), facade.createNodeId("1196683729865")));
    return quotedNode_1;
  }
}
