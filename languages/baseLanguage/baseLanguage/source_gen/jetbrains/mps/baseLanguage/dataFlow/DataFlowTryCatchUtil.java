package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Set;
import jetbrains.mps.baseLanguage.behavior.Statement__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class DataFlowTryCatchUtil {
  public DataFlowTryCatchUtil() {
  }
  public static List<SNode> getPossibleCatches(SNode source, List<SNode> catchClauses) {
    List<SNode> result = new ArrayList<SNode>();
    SNode statement = SNodeOperations.getNodeAncestor(source, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), false, false);
    Set<SNode> uncaughtThrowables = Statement__BehaviorDescriptor.uncaughtThrowables_id4Gt7ANIVAVT.invoke(statement, ((boolean) false));
    for (SNode catchClause : catchClauses) {
      SNode caughtType = SLinkOperations.getTarget(SLinkOperations.getTarget(catchClause, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10f39a56e2fL, 0x10f39a6a2f1L, "throwable")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"));
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(caughtType, _quotation_createNode_l1x7gt_b0a0a1a3a1()) || TypeChecker.getInstance().getSubtypingManager().isSubtype(caughtType, _quotation_createNode_l1x7gt_b0a0a1a3a1_0()) || TypeChecker.getInstance().getSubtypingManager().isSubtype(_quotation_createNode_l1x7gt_a0a0b0d0b(), caughtType)) {
        ListSequence.fromList(result).addElement(catchClause);
      } else {
        for (SNode throwed : uncaughtThrowables) {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(_quotation_createNode_l1x7gt_a0a0a0a0b0d0b(throwed), caughtType)) {
            ListSequence.fromList(result).addElement(catchClause);
          }
        }
      }
    }
    return result;
  }
  private static SNode _quotation_createNode_l1x7gt_b0a0a1a3a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Error")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_l1x7gt_b0a0a1a3a1_0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~RuntimeException")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_l1x7gt_a0a0b0d0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Exception")));
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_l1x7gt_a0a0a0a0b0d0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), (SNode) parameter_1);
    return quotedNode_2;
  }
}
