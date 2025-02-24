package jetbrains.mps.debugger.java.evaluation.behavior;

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
  private final BHDescriptor myEvaluator__BehaviorDescriptor = new Evaluator__BehaviorDescriptor();
  private final BHDescriptor myDebuggedType__BehaviorDescriptor = new DebuggedType__BehaviorDescriptor();
  private final BHDescriptor myUnprocessedAnnotation__BehaviorDescriptor = new UnprocessedAnnotation__BehaviorDescriptor();
  private final BHDescriptor myEvaluatorConcept__BehaviorDescriptor = new EvaluatorConcept__BehaviorDescriptor();
  private final BHDescriptor myLowLevelVariable__BehaviorDescriptor = new LowLevelVariable__BehaviorDescriptor();
  private final BHDescriptor myEvaluatorsSuperMethodCall__BehaviorDescriptor = new EvaluatorsSuperMethodCall__BehaviorDescriptor();
  private final BHDescriptor myDoNotTransformAnnotation__BehaviorDescriptor = new DoNotTransformAnnotation__BehaviorDescriptor();
  private final BHDescriptor myIEvaluatorConcept__BehaviorDescriptor = new IEvaluatorConcept__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0l = concept;
    switch (index_846f5o_a0l.index(cncpt_a0l)) {
      case 0:
        return myDebuggedType__BehaviorDescriptor;
      case 1:
        return myDoNotTransformAnnotation__BehaviorDescriptor;
      case 2:
        return myEvaluator__BehaviorDescriptor;
      case 3:
        return myEvaluatorConcept__BehaviorDescriptor;
      case 4:
        return myEvaluatorsSuperMethodCall__BehaviorDescriptor;
      case 5:
        return myIEvaluatorConcept__BehaviorDescriptor;
      case 6:
        return myLowLevelVariable__BehaviorDescriptor;
      case 7:
        return myUnprocessedAnnotation__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0l = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x3f11b1341fa25ed8L), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x7eed83c2376f34a5L), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0xbbe5b47d7cc5fa1L), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d925L), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b1ae1feL), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x7f4a99699cea367bL), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x53c5060c6b18d926L), MetaIdFactory.conceptId(0x7da4580f9d754603L, 0x816251a896d78375L, 0x50b810dd5c871ea2L)).seal();
}
