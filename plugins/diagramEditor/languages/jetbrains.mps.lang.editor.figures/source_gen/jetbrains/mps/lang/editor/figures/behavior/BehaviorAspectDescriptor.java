package jetbrains.mps.lang.editor.figures.behavior;

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
  private final BHDescriptor myFigureParameter__BehaviorDescriptor = new FigureParameter__BehaviorDescriptor();
  private final BHDescriptor myFigureParameterAttributeMethod__BehaviorDescriptor = new FigureParameterAttributeMethod__BehaviorDescriptor();
  private final BHDescriptor myFigureParameterAttributeField__BehaviorDescriptor = new FigureParameterAttributeField__BehaviorDescriptor();
  private final BHDescriptor myExternalViewFigure__BehaviorDescriptor = new ExternalViewFigure__BehaviorDescriptor();
  private final BHDescriptor myExternalViewFigureParameter__BehaviorDescriptor = new ExternalViewFigureParameter__BehaviorDescriptor();
  private final BHDescriptor myFigureAttribute__BehaviorDescriptor = new FigureAttribute__BehaviorDescriptor();
  private final BHDescriptor myFigureParameterAttribute__BehaviorDescriptor = new FigureParameterAttribute__BehaviorDescriptor();
  private final BHDescriptor myFigureParameterAttributeViewProperty__BehaviorDescriptor = new FigureParameterAttributeViewProperty__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0l = concept;
    switch (index_846f5o_a0l.index(cncpt_a0l)) {
      case 0:
        return myExternalViewFigure__BehaviorDescriptor;
      case 1:
        return myExternalViewFigureParameter__BehaviorDescriptor;
      case 2:
        return myFigureAttribute__BehaviorDescriptor;
      case 3:
        return myFigureParameter__BehaviorDescriptor;
      case 4:
        return myFigureParameterAttribute__BehaviorDescriptor;
      case 5:
        return myFigureParameterAttributeField__BehaviorDescriptor;
      case 6:
        return myFigureParameterAttributeMethod__BehaviorDescriptor;
      case 7:
        return myFigureParameterAttributeViewProperty__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0l = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x1e3b9cbb9f7493c2L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x1e3b9cbb9f749406L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x4b412569a095b5a4L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x4bf6bbafe7e7155L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x4b412569a0c593e1L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x1ceea85e3fd59976L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x1ceea85e3fd59954L), MetaIdFactory.conceptId(0xd7722d504b934c3aL, 0xae061903d05f95a7L, 0x6595651980a1f8ecL)).seal();
}
