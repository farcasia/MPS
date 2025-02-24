package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class supertypes_of_typeVariableReference_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypes_of_typeVariableReference_SubtypingRule() {
  }
  public List<SNode> getSubOrSuperTypes(SNode typeVariableReference, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode typeVariableDeclaration = SLinkOperations.getTarget(typeVariableReference, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, 0x1024673a581L, "typeVariableDeclaration"));
    List<SNode> supertypes = new ArrayList<SNode>();
    if ((SLinkOperations.getTarget(typeVariableDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")) != null)) {
      ListSequence.fromList(supertypes).addElement(SLinkOperations.getTarget(typeVariableDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")));
    }
    for (SNode bound : SLinkOperations.getChildren(typeVariableDeclaration, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae913a476L, "auxBounds"))) {
      ListSequence.fromList(supertypes).addElement(bound);
    }
    if (ListSequence.fromList(supertypes).isEmpty()) {
      ListSequence.fromList(supertypes).addElement(_quotation_createNode_bsqhn5_a0a0a4a1());
    }
    return supertypes;
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102467229d8L, "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean isWeak() {
    return false;
  }
  private static SNode _quotation_createNode_bsqhn5_a0a0a4a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
