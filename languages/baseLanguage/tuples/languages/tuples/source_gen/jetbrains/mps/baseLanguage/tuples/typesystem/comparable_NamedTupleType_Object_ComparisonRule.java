package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class comparable_NamedTupleType_Object_ComparisonRule extends ComparisonRule_Runtime {
  public comparable_NamedTupleType_Object_ComparisonRule() {
  }
  public boolean areComparable(SNode node1, SNode node2, IsApplicable2Status status) {
    return SLinkOperations.getTarget(node2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")) == SLinkOperations.getTarget(_quotation_createNode_6f56oq_a0a0a1(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"));
  }
  public boolean isWeak() {
    return true;
  }
  public IsApplicableStatus isApplicableFirst(SNode node) {
    return new IsApplicableStatus(node.getConcept().isSubConceptOf(getApplicableConcept1()), null);
  }
  public IsApplicableStatus isApplicableSecond(SNode node) {
    return new IsApplicableStatus(node.getConcept().isSubConceptOf(getApplicableConcept2()), null);
  }

  public SAbstractConcept getApplicableConcept1() {
    return MetaAdapterFactory.getConcept(0xa247e09e243545baL, 0xb8d207e93feba96aL, 0x12099dc1365L, "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType");
  }
  public SAbstractConcept getApplicableConcept2() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType");
  }
  private static SNode _quotation_createNode_6f56oq_a0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
