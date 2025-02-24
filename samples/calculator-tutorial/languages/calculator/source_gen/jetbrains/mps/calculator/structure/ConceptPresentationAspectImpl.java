package jetbrains.mps.calculator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Calculator;
  private ConceptPresentation props_InputField;
  private ConceptPresentation props_InputFieldReference;
  private ConceptPresentation props_OutputField;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Calculator:
        if (props_Calculator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Calculator = cpb.create();
        }
        return props_Calculator;
      case LanguageConceptSwitch.InputField:
        if (props_InputField == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_InputField = cpb.create();
        }
        return props_InputField;
      case LanguageConceptSwitch.InputFieldReference:
        if (props_InputFieldReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x26b3d6d5b99a4ed6L, 0x83bed2ea6f3627a1L, 0x12107017046L, 0x1210701c618L, "field", "", "");
          props_InputFieldReference = cpb.create();
        }
        return props_InputFieldReference;
      case LanguageConceptSwitch.OutputField:
        if (props_OutputField == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("OutputField");
          props_OutputField = cpb.create();
        }
        return props_OutputField;
    }
    return null;
  }
}
