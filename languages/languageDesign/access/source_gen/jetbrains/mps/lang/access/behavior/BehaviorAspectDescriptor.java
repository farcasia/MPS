package jetbrains.mps.lang.access.behavior;

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
  private final BHDescriptor myCommandClosureLiteral__BehaviorDescriptor = new CommandClosureLiteral__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_846f5o_a0e.index(cncpt_a0e)) {
      case 0:
        return myCommandClosureLiteral__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x63650c5916c8498aL, 0x99c8005c7ee9515dL, 0x7c8b08a50a3ea20dL)).seal();
}
