package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IGenericType__BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.ITypeApplicable__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SuperConstructorInvocation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SuperConstructorInvocation_InferenceRule() {
  }
  public void applyRule(final SNode sci, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode cdecl = SLinkOperations.getTarget(sci, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"));
    if (cdecl == null) {
      return;
    }
    SNode thisClassifier = SNodeOperations.getNodeAncestor(sci, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false, false);
    if (thisClassifier == null) {
      return;
    }

    final Map<SNode, SNode> subs = MapSequence.fromMap(new HashMap<SNode, SNode>());
    SNode thisType = Classifier__BehaviorDescriptor.getThisType_id2RtWPFZ12w7.invoke(thisClassifier);
    IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(thisType, subs);

    List<SNode> argl = SLinkOperations.getChildren(sci, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"));
    List<SNode> typel = ITypeApplicable__BehaviorDescriptor.getTypeApplicationParameters_id7bu6bIyR2DR.invoke(cdecl, ((int) ListSequence.fromList(argl).count()));
    for (SNode type : ListSequence.fromList(typel)) {
      if (SNodeOperations.isInstanceOf(type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
        IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(SNodeOperations.cast(type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
      }
    }
    {
      Iterator<SNode> type_it = ListSequence.fromList(typel).iterator();
      Iterator<SNode> arg_it = ListSequence.fromList(argl).iterator();
      SNode type_var;
      SNode arg_var;
      while (type_it.hasNext() && arg_it.hasNext()) {
        type_var = type_it.next();
        arg_var = arg_it.next();
        if (SNodeOperations.isInstanceOf(type_var, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
          {
            SNode _nodeToCheck_1029348928467 = arg_var;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956571", 0, null);
            typeCheckingContext.createGreaterThanInequality((SNode) IGenericType__BehaviorDescriptor.expandGenerics_id3zZky3wFPhu.invoke(SNodeOperations.cast(type_var, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956573", true), false, true, _info_12389875345);
          }
        } else {
          if (!(typeCheckingContext.isSingleTypeComputation())) {
            {
              SNode _nodeToCheck_1029348928467 = arg_var;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956587", 0, null);
              typeCheckingContext.createGreaterThanInequality((SNode) type_var, (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956589", true), true, true, _info_12389875345);
            }
          }
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = sci;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956895", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "185741718243956872", true), (SNode) _quotation_createNode_tm50ix_a1a2a31a1(), _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d512e1eL, "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return true;
  }
  private static SNode _quotation_createNode_tm50ix_a1a2a31a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc6bf96dL, "VoidType"), null, null, false);
    return quotedNode_1;
  }
}
