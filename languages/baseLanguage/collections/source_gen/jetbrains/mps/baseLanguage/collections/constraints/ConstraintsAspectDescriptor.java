package jetbrains.mps.baseLanguage.collections.constraints;

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
        return new AllConstant_Constraints();
      case 1:
        return new CustomContainerCreator_Constraints();
      case 2:
        return new CustomContainerDeclaration_Constraints();
      case 3:
        return new CustomMapCreator_Constraints();
      case 4:
        return new ForEachVariableReference_Constraints();
      case 5:
        return new MultiForEachVariableReference_Constraints();
      case 6:
        return new SmartClosureParameterDeclaration_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x12031a066ecL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x127be81db92655b3L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x54a5d587c1f3c7e0L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x15e2150d4bff8a67L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10cac6fa5c3L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x731a0dad81895f16L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118374464e4L)).seal();
}
