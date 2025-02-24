package jetbrains.mps.editor.contextActionsTool.lang.menus.behavior;

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
  private final BHDescriptor myQueryFunction_TransformationMenu_Tooltip__BehaviorDescriptor = new QueryFunction_TransformationMenu_Tooltip__BehaviorDescriptor();
  private final BHDescriptor myQueryFunction_TransformationMenu_Icon__BehaviorDescriptor = new QueryFunction_TransformationMenu_Icon__BehaviorDescriptor();
  private final BHDescriptor myTransformationLocation_ContextActionsTool__BehaviorDescriptor = new TransformationLocation_ContextActionsTool__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0g = concept;
    switch (index_846f5o_a0g.index(cncpt_a0g)) {
      case 0:
        return myQueryFunction_TransformationMenu_Icon__BehaviorDescriptor;
      case 1:
        return myQueryFunction_TransformationMenu_Tooltip__BehaviorDescriptor;
      case 2:
        return myTransformationLocation_ContextActionsTool__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0g = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x7c45559defbb1acaL), MetaIdFactory.conceptId(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x652f322a3695c3acL), MetaIdFactory.conceptId(0xb1c7d06f525d43b5L, 0x9b0a2fc8f7f076baL, 0x7c45559defbb1da8L)).seal();
}
