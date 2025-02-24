package jetbrains.mps.lang.behavior.test.behavior;

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
  private final BHDescriptor myA__BehaviorDescriptor = new A__BehaviorDescriptor();
  private final BHDescriptor myB__BehaviorDescriptor = new B__BehaviorDescriptor();
  private final BHDescriptor myI__BehaviorDescriptor = new I__BehaviorDescriptor();
  private final BHDescriptor myC__BehaviorDescriptor = new C__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0h = concept;
    switch (index_846f5o_a0h.index(cncpt_a0h)) {
      case 0:
        return myA__BehaviorDescriptor;
      case 1:
        return myB__BehaviorDescriptor;
      case 2:
        return myC__BehaviorDescriptor;
      case 3:
        return myI__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0h = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xa18fb831fb54541L, 0x97c9a13312451954L, 0x41ab5625f92e5b2aL), MetaIdFactory.conceptId(0xa18fb831fb54541L, 0x97c9a13312451954L, 0x41ab5625f92e5b5eL), MetaIdFactory.conceptId(0xa18fb831fb54541L, 0x97c9a13312451954L, 0x41ab5625f92e6873L), MetaIdFactory.conceptId(0xa18fb831fb54541L, 0x97c9a13312451954L, 0x41ab5625f92e6814L)).seal();
}
