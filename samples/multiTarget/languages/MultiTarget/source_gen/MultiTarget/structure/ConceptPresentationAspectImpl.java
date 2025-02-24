package MultiTarget.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Container;
  private ConceptPresentation props_Member;
  private ConceptPresentation props_NumericValue;
  private ConceptPresentation props_StringValue;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Container:
        if (props_Container == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Container = cpb.create();
        }
        return props_Container;
      case LanguageConceptSwitch.Member:
        if (props_Member == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Member = cpb.create();
        }
        return props_Member;
      case LanguageConceptSwitch.NumericValue:
        if (props_NumericValue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("numeric value");
          props_NumericValue = cpb.create();
        }
        return props_NumericValue;
      case LanguageConceptSwitch.StringValue:
        if (props_StringValue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("string value");
          props_StringValue = cpb.create();
        }
        return props_StringValue;
    }
    return null;
  }
}
