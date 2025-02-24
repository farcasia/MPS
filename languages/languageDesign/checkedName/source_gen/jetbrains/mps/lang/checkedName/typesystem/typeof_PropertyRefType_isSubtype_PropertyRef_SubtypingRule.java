package jetbrains.mps.lang.checkedName.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class typeof_PropertyRefType_isSubtype_PropertyRef_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public typeof_PropertyRefType_isSubtype_PropertyRef_SubtypingRule() {
  }
  public SNode getSubOrSuperType(SNode refType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_d1kmw7_a0a1();
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f3eL, "jetbrains.mps.lang.checkedName.structure.PropertyRefType");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean isWeak() {
    return false;
  }
  private static SNode _quotation_createNode_d1kmw7_a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.checkedName(MPS.Editor/)"), facade.createNodeId("~PropertyReference")));
    return quotedNode_1;
  }
}
