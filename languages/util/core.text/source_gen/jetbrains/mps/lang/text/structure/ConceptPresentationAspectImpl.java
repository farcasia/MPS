package jetbrains.mps.lang.text.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Line;
  private ConceptPresentation props_NodeWrapperElement;
  private ConceptPresentation props_Text;
  private ConceptPresentation props_TextElement;
  private ConceptPresentation props_Word;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Line:
        if (props_Line == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Line");
          props_Line = cpb.create();
        }
        return props_Line;
      case LanguageConceptSwitch.NodeWrapperElement:
        if (props_NodeWrapperElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("element which wraps any node");
          cpb.rawPresentation("node");
          props_NodeWrapperElement = cpb.create();
        }
        return props_NodeWrapperElement;
      case LanguageConceptSwitch.Text:
        if (props_Text == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Text");
          props_Text = cpb.create();
        }
        return props_Text;
      case LanguageConceptSwitch.TextElement:
        if (props_TextElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_TextElement = cpb.create();
        }
        return props_TextElement;
      case LanguageConceptSwitch.Word:
        if (props_Word == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Word");
          props_Word = cpb.create();
        }
        return props_Word;
    }
    return null;
  }
}
