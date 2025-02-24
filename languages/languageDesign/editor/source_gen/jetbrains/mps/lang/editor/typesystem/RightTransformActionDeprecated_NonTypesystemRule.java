package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class RightTransformActionDeprecated_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public RightTransformActionDeprecated_NonTypesystemRule() {
  }
  public void applyRule(final SNode cellActionMapItem, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SPropertyOperations.hasValue(cellActionMapItem, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x109519879e9L, 0x1095198c0daL, "actionId"), "right_transform_action_id", null)) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(cellActionMapItem, "Right transform in action map is deprecated.", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "9215127012917439383", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x109519879e9L, "jetbrains.mps.lang.editor.structure.CellActionMapItem");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
