package jetbrains.mps.lang.editor.editorTest.intentions;

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
          // Concept: BaseConcept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddTestReferenceAnnotation_Intention();
        }
        break;
      case 1:
        if (true) {
          // Concept: PlaceholderChild 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddPlaceholderChildAttribute_Intention();
        }
        break;
      case 2:
        if (true) {
          // Concept: SimplePropertyContainer 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddSimplePropertyAttribute_Intention();
        }
        break;
      case 3:
        if (true) {
          // Concept: TwoStepDeleteDefaultChild 
          intentions = new IntentionFactory[1];
          intentions[0] = new TwoStepDeleteDefaultChild_AddAttribute_Intention();
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
    IntentionFactory[] rv = new IntentionFactory[4];
    rv[0] = new AddTestReferenceAnnotation_Intention();
    rv[1] = new AddSimplePropertyAttribute_Intention();
    rv[2] = new TwoStepDeleteDefaultChild_AddAttribute_Intention();
    rv[3] = new AddPlaceholderChildAttribute_Intention();
    return Arrays.asList(rv);
  }
  private static final ConceptSwitchIndex index_hphjzv_d0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x5f4994bb9f207829L), MetaIdFactory.conceptId(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x2c59702023f8181eL), MetaIdFactory.conceptId(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x29e25dc0d0251d5eL)).seal();
}
