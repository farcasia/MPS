package jetbrains.mps.baseLanguage.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0c = concept;
    switch (index_2qnle6_a0c.index(cncpt_a0c)) {
      case 0:
        return new AbstractFunctionType_Constraints();
      case 1:
        return new CompactInvokeFunctionExpression_Constraints();
      case 2:
        return new ControlAbstractionContainer_Constraints();
      case 3:
        return new ControlAbstractionDeclaration_Constraints();
      case 4:
        return new FunctionMethodDeclaration_Constraints();
      case 5:
        return new FunctionType_Constraints();
      case 6:
        return new InvokeFunctionOperation_Constraints();
      case 7:
        return new UnboundClosureParameterDeclaration_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x4de23a15f719357dL), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11fb8425aa8L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11e49db3870L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11e49dc8097L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x42d79e63a78a7784L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x1174a4d19ffL), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11d67349093L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x118276b7086L)).seal();
}
