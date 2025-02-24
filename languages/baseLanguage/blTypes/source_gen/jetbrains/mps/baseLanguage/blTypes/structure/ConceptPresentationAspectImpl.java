package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_PrimitiveTypeDescriptor;
  private ConceptPresentation props_PrimitiveTypeRef;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.PrimitiveTypeDescriptor:
        if (props_PrimitiveTypeDescriptor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          cpb.icon(IconContainer.RESOURCE_a0a2a0a0b0d);
          props_PrimitiveTypeDescriptor = cpb.create();
        }
        return props_PrimitiveTypeDescriptor;
      case LanguageConceptSwitch.PrimitiveTypeRef:
        if (props_PrimitiveTypeRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xed6d7656532c4bc2L, 0x81d1af945aeb8280L, 0x10de9cbf8e8L, 0x10de9cbf8e7L, "descriptor", "", "");
          props_PrimitiveTypeRef = cpb.create();
        }
        return props_PrimitiveTypeRef;
    }
    return null;
  }
}
