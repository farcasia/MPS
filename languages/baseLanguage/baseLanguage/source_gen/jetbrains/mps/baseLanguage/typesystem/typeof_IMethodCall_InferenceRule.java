package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.behavior.IMethodCall__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.IGenericType__BehaviorDescriptor;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.ITypeApplicable__BehaviorDescriptor;
import jetbrains.mps.errors.BaseQuickFixProvider;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SReference;

public class typeof_IMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IMethodCall_InferenceRule() {
  }
  public void applyRule(final SNode mcall, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode mdecl = SLinkOperations.getTarget(mcall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"));
    if (mdecl == null) {
      return;
    }

    final Map<SNode, SNode> subs = MapSequence.fromMap(new HashMap<SNode, SNode>());
    // check the inference context 
    if (!((boolean) IMethodCall__BehaviorDescriptor.isInTypeInferenceContext_id4cxv$9$kw67.invoke(mcall))) {
      for (SNode tvd : ListSequence.fromList(BaseMethodDeclaration__BehaviorDescriptor.getInferrableTypeVars_id5W9RYt5baxk.invoke(mdecl))) {
        // assume all unbound type vars outside an inference context are Object 
        MapSequence.fromMap(subs).put(tvd, _quotation_createNode_2u2uyg_a0b0a0f0b());
      }
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(mcall, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0x4500f31eb02a7788L, "typeArgument"))).isEmpty() && ListSequence.fromList(SLinkOperations.getChildren(mdecl, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"))).isNotEmpty()) {
      for (SNode tvd : ListSequence.fromList(SLinkOperations.getChildren(mdecl, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration")))) {
        if (!(MapSequence.fromMap(subs).containsKey(tvd))) {
          final SNode T_typevar_4695112407844173847 = typeCheckingContext.createNewRuntimeTypesVariable();
          MapSequence.fromMap(subs).put(tvd, typeCheckingContext.getRepresentative(T_typevar_4695112407844173847));
        }
      }
      for (SNode tvd : ListSequence.fromList(SLinkOperations.getChildren(mdecl, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration")))) {
        if ((SLinkOperations.getTarget(tvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")) != null) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(tvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
          IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(SNodeOperations.cast(SLinkOperations.getTarget(tvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound")), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
          {
            SNode _nodeToCheck_1029348928467 = mcall;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5302270944911972807", 0, null);
            typeCheckingContext.createLessThanInequality((SNode) MapSequence.fromMap(subs).get(tvd), (SNode) IGenericType__BehaviorDescriptor.expandGenerics_id3zZky3wFPhu.invoke(SNodeOperations.cast(SNodeOperations.copyNode(SLinkOperations.getTarget(tvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1024639ed74L, 0x11ae375bda0L, "bound"))), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs), false, false, _info_12389875345);
          }
        }
      }

    } else {
      {
        Iterator<SNode> tvd_it = ListSequence.fromList(SLinkOperations.getChildren(mdecl, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"))).iterator();
        Iterator<SNode> targ_it = ListSequence.fromList(SLinkOperations.getChildren(mcall, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0x4500f31eb02a7788L, "typeArgument"))).iterator();
        SNode tvd_var;
        SNode targ_var;
        while (tvd_it.hasNext() && targ_it.hasNext()) {
          tvd_var = tvd_it.next();
          targ_var = targ_it.next();
          MapSequence.fromMap(subs).put(tvd_var, targ_var);
          if (SNodeOperations.isInstanceOf(targ_var, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
            IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(SNodeOperations.cast(targ_var, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
          }
        }
      }
    }

    List<SNode> argl = SLinkOperations.getChildren(mcall, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"));
    List<SNode> typel = ITypeApplicable__BehaviorDescriptor.getTypeApplicationParameters_id7bu6bIyR2DR.invoke(mdecl, ((int) ListSequence.fromList(argl).count()));
    for (SNode type : ListSequence.fromList(typel)) {
      if (SNodeOperations.isInstanceOf(type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
        IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(SNodeOperations.cast(type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
      }
    }

    SNode retType = SLinkOperations.getTarget(mdecl, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"));
    if (SNodeOperations.isInstanceOf(retType, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
      IGenericType__BehaviorDescriptor.collectGenericSubstitutions_id3zZky3wF74h.invoke(SNodeOperations.cast(retType, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
      retType = IGenericType__BehaviorDescriptor.expandGenerics_id3zZky3wFPhu.invoke(SNodeOperations.cast(retType, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs);
    }
    {
      SNode _nodeToCheck_1029348928467 = mcall;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4695112407843789343", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) retType, (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4660288602099522945", true), false, true, _info_12389875345);
    }

    {
      Iterator<SNode> type_it = ListSequence.fromList(typel).iterator();
      Iterator<SNode> arg_it = ListSequence.fromList(argl).iterator();
      SNode type_var;
      SNode arg_var;
      while (type_it.hasNext() && arg_it.hasNext()) {
        type_var = type_it.next();
        arg_var = arg_it.next();
        final SNode _type = type_var;
        final SNode _arg = arg_var;

        if (SNodeOperations.isInstanceOf(_type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType"))) {
          {
            final SNode A = typeCheckingContext.typeOf(arg_var, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9033423951295792137", true);
            typeCheckingContext.whenConcrete(A, new Runnable() {
              public void run() {
                {
                  SNode _nodeToCheck_1029348928467 = mcall;
                  EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9033423951293505964", 0, null);
                  {
                    BaseQuickFixProvider intentionProvider = null;
                    intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.AddCast_QuickFix", false);
                    intentionProvider.putArgument("desiredType", _type);
                    intentionProvider.putArgument("expression", _arg);
                    _info_12389875345.addIntentionProvider(intentionProvider);
                  }
                  typeCheckingContext.createGreaterThanInequality((SNode) IGenericType__BehaviorDescriptor.expandGenerics_id3zZky3wFPhu.invoke(SNodeOperations.cast(_type, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x38ff5220e0ac710dL, "jetbrains.mps.baseLanguage.structure.IGenericType")), subs), (SNode) typeCheckingContext.getExpandedNode(A), false, true, _info_12389875345);
                }
              }
            }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9033423951293505962", false, false);
          }
        } else {
          if (!(typeCheckingContext.isSingleTypeComputation())) {
            {
              SNode _nodeToCheck_1029348928467 = arg_var;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9033423951293505984", 0, null);
              {
                BaseQuickFixProvider intentionProvider = null;
                intentionProvider = new BaseQuickFixProvider("jetbrains.mps.baseLanguage.typesystem.AddCast_QuickFix", false);
                intentionProvider.putArgument("desiredType", _type);
                intentionProvider.putArgument("expression", _arg);
                _info_12389875345.addIntentionProvider(intentionProvider);
              }
              typeCheckingContext.createGreaterThanInequality((SNode) _type, (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9033423951293505986", true), true, true, _info_12389875345);
            }
          }
        }
      }
    }

    TypeVariableMatchUtil.checkTypeParametersMatchingTypeArguments(typeCheckingContext, mdecl, mcall, subs);
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_2u2uyg_a0b0a0f0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"), null, null, false);
    quotedNode_1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), quotedNode_1, facade.createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
