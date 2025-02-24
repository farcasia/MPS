package jetbrains.mps.console.internalCommands.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_ConsoleModelExpression;
  private ConceptPresentation props_InternalMode;
  private ConceptPresentation props_ReloadClassesCommand;
  private ConceptPresentation props_ShowRepositoryCommand;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.ConsoleModelExpression:
        if (props_ConsoleModelExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("#consoleModel");
          props_ConsoleModelExpression = cpb.create();
        }
        return props_ConsoleModelExpression;
      case LanguageConceptSwitch.InternalMode:
        if (props_InternalMode == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("#internalMode");
          props_InternalMode = cpb.create();
        }
        return props_InternalMode;
      case LanguageConceptSwitch.ReloadClassesCommand:
        if (props_ReloadClassesCommand == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("#reloadClasses");
          props_ReloadClassesCommand = cpb.create();
        }
        return props_ReloadClassesCommand;
      case LanguageConceptSwitch.ShowRepositoryCommand:
        if (props_ShowRepositoryCommand == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ShowRepositoryCommand = cpb.create();
        }
        return props_ShowRepositoryCommand;
    }
    return null;
  }
}
