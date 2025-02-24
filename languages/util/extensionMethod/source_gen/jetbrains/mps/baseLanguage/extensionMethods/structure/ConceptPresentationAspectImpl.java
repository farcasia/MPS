package jetbrains.mps.baseLanguage.extensionMethods.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_BaseExtensionMethodContainer;
  private ConceptPresentation props_ExtensionMethodCall;
  private ConceptPresentation props_ExtensionMethodDeclaration;
  private ConceptPresentation props_ExtensionStaticFieldDeclaration;
  private ConceptPresentation props_ExtensionStaticFieldReference;
  private ConceptPresentation props_LocalExtendedMethodCall;
  private ConceptPresentation props_SimpleExtensionMethodsContainer;
  private ConceptPresentation props_ThisExtensionExpression;
  private ConceptPresentation props_TypeExtension;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.BaseExtensionMethodContainer:
        if (props_BaseExtensionMethodContainer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_BaseExtensionMethodContainer = cpb.create();
        }
        return props_BaseExtensionMethodContainer;
      case LanguageConceptSwitch.ExtensionMethodCall:
        if (props_ExtensionMethodCall == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration", "", "");
          props_ExtensionMethodCall = cpb.create();
        }
        return props_ExtensionMethodCall;
      case LanguageConceptSwitch.ExtensionMethodDeclaration:
        if (props_ExtensionMethodDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ExtensionMethodDeclaration = cpb.create();
        }
        return props_ExtensionMethodDeclaration;
      case LanguageConceptSwitch.ExtensionStaticFieldDeclaration:
        if (props_ExtensionStaticFieldDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ExtensionStaticFieldDeclaration = cpb.create();
        }
        return props_ExtensionStaticFieldDeclaration;
      case LanguageConceptSwitch.ExtensionStaticFieldReference:
        if (props_ExtensionStaticFieldReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration", "", "");
          props_ExtensionStaticFieldReference = cpb.create();
        }
        return props_ExtensionStaticFieldReference;
      case LanguageConceptSwitch.LocalExtendedMethodCall:
        if (props_LocalExtendedMethodCall == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("local extended method call");
          cpb.presentationByReference(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration", "", "");
          props_LocalExtendedMethodCall = cpb.create();
        }
        return props_LocalExtendedMethodCall;
      case LanguageConceptSwitch.SimpleExtensionMethodsContainer:
        if (props_SimpleExtensionMethodsContainer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_SimpleExtensionMethodsContainer = cpb.create();
        }
        return props_SimpleExtensionMethodsContainer;
      case LanguageConceptSwitch.ThisExtensionExpression:
        if (props_ThisExtensionExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("this");
          props_ThisExtensionExpression = cpb.create();
        }
        return props_ThisExtensionExpression;
      case LanguageConceptSwitch.TypeExtension:
        if (props_TypeExtension == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TypeExtension = cpb.create();
        }
        return props_TypeExtension;
    }
    return null;
  }
}
