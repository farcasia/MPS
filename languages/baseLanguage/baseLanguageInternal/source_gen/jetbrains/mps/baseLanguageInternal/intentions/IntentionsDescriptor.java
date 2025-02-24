package jetbrains.mps.baseLanguageInternal.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionAspectDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class IntentionsDescriptor extends AbstractIntentionAspectDescriptor {
  private static final IntentionFactory[] EMPTY_ARRAY = new IntentionFactory[0];
  private Map<SAbstractConcept, IntentionFactory[]> myCached = new HashMap<SAbstractConcept, IntentionFactory[]>();

  public IntentionsDescriptor() {
  }

  @Nullable
  public Collection<IntentionFactory> getIntentions(@NotNull SAbstractConcept concept) {
    if (myCached.containsKey(concept)) {
      return Arrays.asList(myCached.get(concept));
    }

    IntentionFactory[] intentions = EMPTY_ARRAY;
    SAbstractConcept cncpt_d0f = concept;
    switch (index_hphjzv_d0f.index(cncpt_d0f)) {
      case 0:
        if (true) {
          // Concept: ConstantValue 
          intentions = new IntentionFactory[1];
          intentions[0] = new ReplaceWithFieldReference_Intention();
        }
        break;
      case 1:
        if (true) {
          // Concept: InternalClassifierType 
          intentions = new IntentionFactory[1];
          intentions[0] = new add_parameter_to_InternalClassifierType_Intention();
        }
        break;
      case 2:
        if (true) {
          // Concept: StaticFieldReference 
          intentions = new IntentionFactory[1];
          intentions[0] = new ReplaceWithConstantValue_Intention();
        }
        break;
      default:
    }
    myCached.put(concept, intentions);
    return Arrays.asList(intentions);
  }

  @NotNull
  @Override
  public Collection<IntentionFactory> getAllIntentions() {
    IntentionFactory[] rv = new IntentionFactory[3];
    rv[0] = new add_parameter_to_InternalClassifierType_Intention();
    rv[1] = new ReplaceWithFieldReference_Intention();
    rv[2] = new ReplaceWithConstantValue_Intention();
    return Arrays.asList(rv);
  }
  private static final ConceptSwitchIndex index_hphjzv_d0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x16007da97856bd8aL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1118e558c6dL), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940c80846L)).seal();
}
