package jetbrains.mps.baseLanguage.closures.intentions;

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
          // Concept: ClosureLiteral 
          intentions = new IntentionFactory[2];
          intentions[0] = new convert_to_from_unrestricted_Intention();
          intentions[1] = new ToggleMultiLine_Intention();
        }
        break;
      case 1:
        if (true) {
          // Concept: FunctionType 
          intentions = new IntentionFactory[2];
          intentions[0] = new add_throws_to_FunctionType_Intention();
          intentions[1] = new convert_to_unrestricted_Intention();
        }
        break;
      case 2:
        if (true) {
          // Concept: InvokeFunctionOperation 
          intentions = new IntentionFactory[1];
          intentions[0] = new replace_invokeOperation_with_compactInvoke_Intention();
        }
        break;
      case 3:
        if (true) {
          // Concept: UnrestrictedFunctionType 
          intentions = new IntentionFactory[1];
          intentions[0] = new convert_to_restricted_Intention();
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
    IntentionFactory[] rv = new IntentionFactory[6];
    rv[0] = new add_throws_to_FunctionType_Intention();
    rv[1] = new convert_to_unrestricted_Intention();
    rv[2] = new convert_to_restricted_Intention();
    rv[3] = new convert_to_from_unrestricted_Intention();
    rv[4] = new replace_invokeOperation_with_compactInvoke_Intention();
    rv[5] = new ToggleMultiLine_Intention();
    return Arrays.asList(rv);
  }
  private static final ConceptSwitchIndex index_hphjzv_d0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x1174a4d19ffL), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11d67349093L), MetaIdFactory.conceptId(0xfd3920347849419dL, 0x907112563d152375L, 0x11e505b9d83L)).seal();
}
