package jetbrains.mps.debugger.java.customViewers.constraints;

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
        return new CanWrapHighLevelValue_ConceptFunction_Constraints();
      case 1:
        return new GetHighLevelValuePresentation_ConceptFunction_Constraints();
      case 2:
        return new GetHighLevelWatchablesBlock_ConceptFunction_Constraints();
      case 3:
        return new HighLevelWatchableCreator_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xfa8aeae94df94e13L, 0xbfb19b04c67ddb77L, 0x9a1514043ecbdbL), MetaIdFactory.conceptId(0xfa8aeae94df94e13L, 0xbfb19b04c67ddb77L, 0x9a1514043ecbd2L), MetaIdFactory.conceptId(0xfa8aeae94df94e13L, 0xbfb19b04c67ddb77L, 0x9a1514043ecbd6L), MetaIdFactory.conceptId(0xfa8aeae94df94e13L, 0xbfb19b04c67ddb77L, 0x9a1514044030ceL)).seal();
}
