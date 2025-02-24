package jetbrains.mps.console.ideCommands.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.console.base.typesystem.ShowingKind;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ShowExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ShowExpression_InferenceRule() {
  }
  public void applyRule(final SNode showExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = showExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "7600370246417176611", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "7600370246417176148", true), (SNode) _quotation_createNode_jy8svg_a1a2a0a1(), _info_12389875345);
    }
    {
      final SNode argType = typeCheckingContext.typeOf(SLinkOperations.getTarget(showExpression, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x75bb0160f191d79fL, 0x6979f0787b81e875L, "object")), "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "7989807750029968337", true);
      typeCheckingContext.whenConcrete(argType, new Runnable() {
        public void run() {
          if (!(ShowingKind.getKind(typeCheckingContext.getExpandedNode(argType)) != null)) {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(showExpression, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x75bb0160f191d79fL, 0x6979f0787b81e875L, "object")), "#show is applicable only to sequences of " + Sequence.fromIterable(Sequence.fromArray(ShowingKind.values())).select(new ISelector<ShowingKind, String>() {
              public String select(ShowingKind it) {
                return it.getKindLabel();
              }
            }), "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "7989807750030123140", null, errorTarget);
          }
        }
      }, "r:71e81c80-d7fe-47f3-91de-9281cfae8376(jetbrains.mps.console.ideCommands.typesystem)", "7989807750029968262", false, false);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x75bb0160f191d79fL, "jetbrains.mps.console.ideCommands.structure.ShowExpression");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_jy8svg_a1a2a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc6bf96dL, "VoidType"), null, null, false);
    return quotedNode_1;
  }
}
