package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class vector_subtype_of_matrix_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public vector_subtype_of_matrix_SubtypingRule() {
  }
  public SNode getSubOrSuperType(SNode vectorType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_exb2lq_a0a1(SLinkOperations.getTarget(vectorType, MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f775L, 0x42d5783a6268466fL, "elementType")), "" + SPropertyOperations.getInteger(vectorType, MetaAdapterFactory.getProperty(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f775L, 0x42d5783a6268466eL, "height")));
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f775L, "jetbrains.mps.baseLanguage.math.structure.VectorType");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean isWeak() {
    return false;
  }
  private static SNode _quotation_createNode_exb2lq_a0a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, "jetbrains.mps.baseLanguage.math"), 0x42d5783a6267f776L, "MatrixType"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f776L, 0x42d5783a62683dadL, "columns"), "1");
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f776L, 0x42d5783a62683dacL, "rows"), (String) parameter_2);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x3304fc6e7c6b401eL, 0xa016b944934bb21fL, 0x42d5783a6267f776L, 0x42d5783a62684653L, "elementType"), HUtil.copyIfNecessary(quotedNode_4));
    }
    return quotedNode_3;
  }
}
