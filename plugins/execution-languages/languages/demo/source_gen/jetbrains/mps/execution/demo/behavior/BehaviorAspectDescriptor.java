package jetbrains.mps.execution.demo.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBehaviorAspectDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.BHDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class BehaviorAspectDescriptor extends BaseBehaviorAspectDescriptor {
  private final BHDescriptor mySomeConcept__BehaviorDescriptor = new SomeConcept__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_846f5o_a0e.index(cncpt_a0e)) {
      case 0:
        return mySomeConcept__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xe6081818930c4926L, 0xbdef3537bcc59087L, 0x446739e63be33684L)).seal();
}
