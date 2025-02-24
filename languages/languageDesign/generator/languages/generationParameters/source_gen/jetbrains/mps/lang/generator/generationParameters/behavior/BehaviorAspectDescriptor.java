package jetbrains.mps.lang.generator.generationParameters.behavior;

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
  private final BHDescriptor myDefaultGeneratorParameter__BehaviorDescriptor = new DefaultGeneratorParameter__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_846f5o_a0e.index(cncpt_a0e)) {
      case 0:
        return myDefaultGeneratorParameter__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x289fcc83654341e8L, 0xa5ca768235715ce4L, 0x75bebc44281efab4L)).seal();
}
