package jetbrains.mps.console.scripts.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_AbstractConsoleScript;
  private ConceptPresentation props_ConsoleScript;
  private ConceptPresentation props_Execute;
  private ConceptPresentation props_RefactorOperation;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AbstractConsoleScript:
        if (props_AbstractConsoleScript == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_AbstractConsoleScript = cpb.create();
        }
        return props_AbstractConsoleScript;
      case LanguageConceptSwitch.ConsoleScript:
        if (props_ConsoleScript == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ConsoleScript = cpb.create();
        }
        return props_ConsoleScript;
      case LanguageConceptSwitch.Execute:
        if (props_Execute == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("execute a script");
          cpb.rawPresentation("#exec");
          props_Execute = cpb.create();
        }
        return props_Execute;
      case LanguageConceptSwitch.RefactorOperation:
        if (props_RefactorOperation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("perform changes on selected nodes");
          cpb.rawPresentation("refactor");
          props_RefactorOperation = cpb.create();
        }
        return props_RefactorOperation;
    }
    return null;
  }
}
