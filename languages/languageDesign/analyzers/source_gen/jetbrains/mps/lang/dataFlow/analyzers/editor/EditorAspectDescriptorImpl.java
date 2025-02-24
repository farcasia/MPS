package jetbrains.mps.lang.dataFlow.analyzers.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AnalysisDirection_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Analyzer_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new AnalyzerConstructorParameter_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new AnalyzerConstructorParameterReference_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new AnalyzerRunnerAnalyzeOperation_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new AnalyzerRunnerCreator_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ApplicableNodeReference_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ConceptCondition_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new CustomInstructionsContainer_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new CustomInstructionsContainerReference_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new EmitInstruction_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new InsertPosition_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Instruction_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new InstructionParameter_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new InstructionReference_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new IsOperation_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new PatternCondition_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new ProgramParameter_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new Rule_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new RuleReference_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0d = concept;
    switch (index_xbvbvu_a0d.index(cncpt_a0d)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new AnalyzerConstructorParameterReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new ApplicableNodeReference_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new CustomInstructionsContainerReference_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new InstructionReference_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new Rule_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new RuleReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb86L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f46789L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c420b0L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c421f8L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x151c4f99e489a11L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x151c4f99e489a16L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788f30110L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788e9b9deL), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c172b8b1L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c1738798L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b3e894L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x74ea0fbaafcebf23L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd583aa0L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b4cedcL), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x6ed2c546d46ea462L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919e0b63L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x33bb3f8bce3bc61cL), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd57b6c8L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0xa72ff3b2ca7c5b0L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c421f8L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788f30110L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c1738798L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b4cedcL), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd57b6c8L), MetaIdFactory.conceptId(0x97a52717898f4598L, 0x8150573d9fd03868L, 0xa72ff3b2ca7c5b0L)).seal();
}
