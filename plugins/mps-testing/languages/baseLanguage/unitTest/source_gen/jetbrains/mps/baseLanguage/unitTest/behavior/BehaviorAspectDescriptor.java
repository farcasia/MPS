package jetbrains.mps.baseLanguage.unitTest.behavior;

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
  private final BHDescriptor myTestMethod__BehaviorDescriptor = new TestMethod__BehaviorDescriptor();
  private final BHDescriptor myBTestCase__BehaviorDescriptor = new BTestCase__BehaviorDescriptor();
  private final BHDescriptor myITestable__BehaviorDescriptor = new ITestable__BehaviorDescriptor();
  private final BHDescriptor myITestCase__BehaviorDescriptor = new ITestCase__BehaviorDescriptor();
  private final BHDescriptor myITestMethod__BehaviorDescriptor = new ITestMethod__BehaviorDescriptor();
  private final BHDescriptor myBeforeTest__BehaviorDescriptor = new BeforeTest__BehaviorDescriptor();
  private final BHDescriptor myAfterTest__BehaviorDescriptor = new AfterTest__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0k = concept;
    switch (index_846f5o_a0k.index(cncpt_a0k)) {
      case 0:
        return myAfterTest__BehaviorDescriptor;
      case 1:
        return myBTestCase__BehaviorDescriptor;
      case 2:
        return myBeforeTest__BehaviorDescriptor;
      case 3:
        return myITestCase__BehaviorDescriptor;
      case 4:
        return myITestMethod__BehaviorDescriptor;
      case 5:
        return myITestable__BehaviorDescriptor;
      case 6:
        return myTestMethod__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0k = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x72682467022fd3ddL), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc94e923L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x72682467022fc039L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b2709bd56L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b27438a3dL), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x11b08a01119L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dc92748eL)).seal();
}
