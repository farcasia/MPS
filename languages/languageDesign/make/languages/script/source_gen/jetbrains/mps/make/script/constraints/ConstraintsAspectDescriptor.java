package jetbrains.mps.make.script.constraints;

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
        return new AdvanceWorkStatement_Constraints();
      case 1:
        return new ConfigDefinition_Constraints();
      case 2:
        return new FinishWorkStatement_Constraints();
      case 3:
        return new GetMakeSessionExpression_Constraints();
      case 4:
        return new JobDefinition_Constraints();
      case 5:
        return new RelayQueryExpression_Constraints();
      case 6:
        return new ResourceType_Constraints();
      case 7:
        return new ResultStatement_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6984L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x1b731b4510dcbee4L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6987L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x61c1a3d1c45fac8cL), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972dabL), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x1b731b4510dbc59fL), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a947282L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x6237d5bb8b2a942dL)).seal();
}
