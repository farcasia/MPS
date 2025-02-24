package jetbrains.mps.samples.SwingBuilder.behavior;

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
  private final BHDescriptor myFilter__BehaviorDescriptor = new Filter__BehaviorDescriptor();
  private final BHDescriptor myMap__BehaviorDescriptor = new Map__BehaviorDescriptor();
  private final BHDescriptor myPipeline__BehaviorDescriptor = new Pipeline__BehaviorDescriptor();
  private final BHDescriptor myTransformers__BehaviorDescriptor = new Transformers__BehaviorDescriptor();
  private final BHDescriptor mySwingBuilderMember__BehaviorDescriptor = new SwingBuilderMember__BehaviorDescriptor();
  private final BHDescriptor mySourceDataType__BehaviorDescriptor = new SourceDataType__BehaviorDescriptor();
  private final BHDescriptor myTargetDataType__BehaviorDescriptor = new TargetDataType__BehaviorDescriptor();
  private final BHDescriptor myConverter__BehaviorDescriptor = new Converter__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0l = concept;
    switch (index_846f5o_a0l.index(cncpt_a0l)) {
      case 0:
        return myConverter__BehaviorDescriptor;
      case 1:
        return myFilter__BehaviorDescriptor;
      case 2:
        return myMap__BehaviorDescriptor;
      case 3:
        return myPipeline__BehaviorDescriptor;
      case 4:
        return mySourceDataType__BehaviorDescriptor;
      case 5:
        return mySwingBuilderMember__BehaviorDescriptor;
      case 6:
        return myTargetDataType__BehaviorDescriptor;
      case 7:
        return myTransformers__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0l = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4d5f82383b28563fL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1c61L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1d95L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1e59L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4d5f82383b276c5aL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa5245c9L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4d5f82383b277405L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1e78L)).seal();
}
