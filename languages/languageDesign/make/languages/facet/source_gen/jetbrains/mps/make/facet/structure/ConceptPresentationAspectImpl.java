package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_ExtendsFacetReference;
  private ConceptPresentation props_FacetDeclaration;
  private ConceptPresentation props_FacetJavaClassExpression;
  private ConceptPresentation props_FacetReference;
  private ConceptPresentation props_FacetReferenceExpression;
  private ConceptPresentation props_ForeignParametersComponentExpression;
  private ConceptPresentation props_ForeignParametersExpression;
  private ConceptPresentation props_IFacet;
  private ConceptPresentation props_IPropertyExpression;
  private ConceptPresentation props_LocalParametersComponentExpression;
  private ConceptPresentation props_LocalParametersExpression;
  private ConceptPresentation props_NamedFacetReference;
  private ConceptPresentation props_ParametersDeclaration;
  private ConceptPresentation props_RelatedFacetReference;
  private ConceptPresentation props_ResourceClassifierType;
  private ConceptPresentation props_ResourceSpecificPropertiesExpression;
  private ConceptPresentation props_ResourceTypeDeclaration;
  private ConceptPresentation props_TargetDeclaration;
  private ConceptPresentation props_TargetDependency;
  private ConceptPresentation props_TargetReferenceExpression;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.ExtendsFacetReference:
        if (props_ExtendsFacetReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5979ed6d2b21b2f2L, 0x5979ed6d2b21b2f3L, "facet", "", "");
          props_ExtendsFacetReference = cpb.create();
        }
        return props_ExtendsFacetReference;
      case LanguageConceptSwitch.FacetDeclaration:
        if (props_FacetDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          cpb.icon(IconContainer.RESOURCE_a0a2a0a1b0v);
          props_FacetDeclaration = cpb.create();
        }
        return props_FacetDeclaration;
      case LanguageConceptSwitch.FacetJavaClassExpression:
        if (props_FacetJavaClassExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("facet class/");
          props_FacetJavaClassExpression = cpb.create();
        }
        return props_FacetJavaClassExpression;
      case LanguageConceptSwitch.FacetReference:
        if (props_FacetReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_FacetReference = cpb.create();
        }
        return props_FacetReference;
      case LanguageConceptSwitch.FacetReferenceExpression:
        if (props_FacetReferenceExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("FacetReferenceExpression");
          props_FacetReferenceExpression = cpb.create();
        }
        return props_FacetReferenceExpression;
      case LanguageConceptSwitch.ForeignParametersComponentExpression:
        if (props_ForeignParametersComponentExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ForeignParametersComponentExpression");
          props_ForeignParametersComponentExpression = cpb.create();
        }
        return props_ForeignParametersComponentExpression;
      case LanguageConceptSwitch.ForeignParametersExpression:
        if (props_ForeignParametersExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x2e69d2eba535f3b0L, 0x2e69d2eba535f3beL, "target", "", "");
          props_ForeignParametersExpression = cpb.create();
        }
        return props_ForeignParametersExpression;
      case LanguageConceptSwitch.IFacet:
        if (props_IFacet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IFacet = cpb.create();
        }
        return props_IFacet;
      case LanguageConceptSwitch.IPropertyExpression:
        if (props_IPropertyExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IPropertyExpression = cpb.create();
        }
        return props_IPropertyExpression;
      case LanguageConceptSwitch.LocalParametersComponentExpression:
        if (props_LocalParametersComponentExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("LocalParametersComponentExpression");
          props_LocalParametersComponentExpression = cpb.create();
        }
        return props_LocalParametersComponentExpression;
      case LanguageConceptSwitch.LocalParametersExpression:
        if (props_LocalParametersExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("LocalParametersExpression");
          props_LocalParametersExpression = cpb.create();
        }
        return props_LocalParametersExpression;
      case LanguageConceptSwitch.NamedFacetReference:
        if (props_NamedFacetReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5979ed6d2b21b2f2L, 0x5979ed6d2b21b2f3L, "facet", "", "");
          props_NamedFacetReference = cpb.create();
        }
        return props_NamedFacetReference;
      case LanguageConceptSwitch.ParametersDeclaration:
        if (props_ParametersDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ParametersDeclaration = cpb.create();
        }
        return props_ParametersDeclaration;
      case LanguageConceptSwitch.RelatedFacetReference:
        if (props_RelatedFacetReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5979ed6d2b21b2f2L, 0x5979ed6d2b21b2f3L, "facet", "", "");
          props_RelatedFacetReference = cpb.create();
        }
        return props_RelatedFacetReference;
      case LanguageConceptSwitch.ResourceClassifierType:
        if (props_ResourceClassifierType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier", "", "");
          props_ResourceClassifierType = cpb.create();
        }
        return props_ResourceClassifierType;
      case LanguageConceptSwitch.ResourceSpecificPropertiesExpression:
        if (props_ResourceSpecificPropertiesExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ResourceSpecificPropertiesExpression");
          props_ResourceSpecificPropertiesExpression = cpb.create();
        }
        return props_ResourceSpecificPropertiesExpression;
      case LanguageConceptSwitch.ResourceTypeDeclaration:
        if (props_ResourceTypeDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ResourceTypeDeclaration");
          props_ResourceTypeDeclaration = cpb.create();
        }
        return props_ResourceTypeDeclaration;
      case LanguageConceptSwitch.TargetDeclaration:
        if (props_TargetDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TargetDeclaration = cpb.create();
        }
        return props_TargetDeclaration;
      case LanguageConceptSwitch.TargetDependency:
        if (props_TargetDependency == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, 0x5912a2ab1cd24c63L, "dependsOn", "", "");
          props_TargetDependency = cpb.create();
        }
        return props_TargetDependency;
      case LanguageConceptSwitch.TargetReferenceExpression:
        if (props_TargetReferenceExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x78c916bd7aecaff7L, 0x78c916bd7aecc3bcL, "target", "", "");
          props_TargetReferenceExpression = cpb.create();
        }
        return props_TargetReferenceExpression;
    }
    return null;
  }
}
