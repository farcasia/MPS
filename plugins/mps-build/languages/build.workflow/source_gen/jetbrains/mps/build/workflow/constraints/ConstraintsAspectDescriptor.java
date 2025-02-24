package jetbrains.mps.build.workflow.constraints;

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
        return new BwfFileSet_Constraints();
      case 1:
        return new BwfJavaClassPath_Constraints();
      case 2:
        return new BwfSubTask_Constraints();
      case 3:
        return new BwfSubTaskDependency_Constraints();
      case 4:
        return new BwfTask_Constraints();
      case 5:
        return new BwfTaskLibrary_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede077L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114724ce92L)).seal();
}
