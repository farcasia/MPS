package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.behavior.IOperation__BehaviorDescriptor;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_PutAllOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PutAllOperation_InferenceRule() {
  }
  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode KEY_typevar_1240906967388 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode VALUE_typevar_1240906971637 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation__BehaviorDescriptor.getOperand_idhEwIP$m.invoke(operation);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "7668447476859120489", 0, null);
      typeCheckingContext.createGreaterThanInequality((SNode) _quotation_createNode_fb8qny_a0a2a2a1(typeCheckingContext.getRepresentative(KEY_typevar_1240906967388), typeCheckingContext.getRepresentative(VALUE_typevar_1240906971637)), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240906975191", true), false, true, _info_12389875345);
    }
    if (!(typeCheckingContext.isSingleTypeComputation())) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(operation, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120ebcea0f9L, 0x120ebd0f530L, "map"));
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907008336", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907000627", true), (SNode) _quotation_createNode_fb8qny_a1a2a0a3a1(typeCheckingContext.getRepresentative(KEY_typevar_1240906967388), typeCheckingContext.getRepresentative(VALUE_typevar_1240906971637)), true, true, _info_12389875345);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907073642", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907069153", true), (SNode) _quotation_createNode_fb8qny_a1a2a4a1(), _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120ebcea0f9L, "jetbrains.mps.baseLanguage.collections.structure.PutAllOperation");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_fb8qny_a0a2a2a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x116db7e6bcbL, "MapType"), null, null, false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f62a8L, "keyType"), HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f8516L, "valueType"), HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_fb8qny_a1a2a0a3a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, "jetbrains.mps.baseLanguage.collections"), 0x116db7e6bcbL, "MapType"), null, null, false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f62a8L, "keyType"), HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116db7e6bcbL, 0x116db7f8516L, "valueType"), HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_fb8qny_a1a2a4a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc6bf96dL, "VoidType"), null, null, false);
    return quotedNode_1;
  }
}
