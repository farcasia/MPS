package jetbrains.mps.lang.aspect.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_AspectMethodDescriptor;
  private ConceptPresentation props_GenerationDescriptor;
  private ConceptPresentation props_GenerationDescriptor_ByInterface;
  private ConceptPresentation props_GenerationDescriptor_Class;
  private ConceptPresentation props_IAspectConcept;
  private ConceptPresentation props_LanguageAspectDescriptor;
  private ConceptPresentation props_LanguageReference;
  private ConceptPresentation props_OldHelpURL;
  private ConceptPresentation props_SimpleAspectOrderRef;
  private ConceptPresentation props_SimpleLanguageAspectDescriptor;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AspectMethodDescriptor:
        if (props_AspectMethodDescriptor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("AspectMethodDescriptor");
          props_AspectMethodDescriptor = cpb.create();
        }
        return props_AspectMethodDescriptor;
      case LanguageConceptSwitch.GenerationDescriptor:
        if (props_GenerationDescriptor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_GenerationDescriptor = cpb.create();
        }
        return props_GenerationDescriptor;
      case LanguageConceptSwitch.GenerationDescriptor_ByInterface:
        if (props_GenerationDescriptor_ByInterface == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_GenerationDescriptor_ByInterface = cpb.create();
        }
        return props_GenerationDescriptor_ByInterface;
      case LanguageConceptSwitch.GenerationDescriptor_Class:
        if (props_GenerationDescriptor_Class == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_GenerationDescriptor_Class = cpb.create();
        }
        return props_GenerationDescriptor_Class;
      case LanguageConceptSwitch.IAspectConcept:
        if (props_IAspectConcept == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IAspectConcept = cpb.create();
        }
        return props_IAspectConcept;
      case LanguageConceptSwitch.LanguageAspectDescriptor:
        if (props_LanguageAspectDescriptor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_LanguageAspectDescriptor = cpb.create();
        }
        return props_LanguageAspectDescriptor;
      case LanguageConceptSwitch.LanguageReference:
        if (props_LanguageReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.deprecated(true);
          cpb.rawPresentation("LanguageReference");
          props_LanguageReference = cpb.create();
        }
        return props_LanguageReference;
      case LanguageConceptSwitch.OldHelpURL:
        if (props_OldHelpURL == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.deprecated(true);
          cpb.rawPresentation("OldHelpURL");
          props_OldHelpURL = cpb.create();
        }
        return props_OldHelpURL;
      case LanguageConceptSwitch.SimpleAspectOrderRef:
        if (props_SimpleAspectOrderRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd7814bL, 0x22035699bdd7814cL, "target", "", "");
          props_SimpleAspectOrderRef = cpb.create();
        }
        return props_SimpleAspectOrderRef;
      case LanguageConceptSwitch.SimpleLanguageAspectDescriptor:
        if (props_SimpleLanguageAspectDescriptor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder(0xf159adf43c9340f9L, 0x9c5a1f245a8697afL, 0x2fa4a8cdf0c9b076L);
          cpb.deprecateAggregation(0x2fa4a8cdf0c9b094L, "oldMainLanguages");
          cpb.deprecateAggregation(0x2fa4a8cdf0c9b096L, "oldAdditionalLanguages");
          cpb.deprecateAggregation(0x54be5be5620c1b77L, "mainLanguages");
          cpb.deprecateAggregation(0x47d8f9811b759b89L, "oldHelpUrl");
          cpb.presentationByName();
          cpb.icon(IconContainer.RESOURCE_a0a6a0a9b0l);
          props_SimpleLanguageAspectDescriptor = cpb.create();
        }
        return props_SimpleLanguageAspectDescriptor;
    }
    return null;
  }
}
