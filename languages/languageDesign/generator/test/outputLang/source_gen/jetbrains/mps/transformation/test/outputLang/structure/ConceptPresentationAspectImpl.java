package jetbrains.mps.transformation.test.outputLang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_CustomRoot;
  private ConceptPresentation props_CustomStatement;
  private ConceptPresentation props_CustomStatementRef;
  private ConceptPresentation props_OutputNode;
  private ConceptPresentation props_OutputNode_forDontApplyReductionTwice_test;
  private ConceptPresentation props_OutputRoot;
  private ConceptPresentation props_TwoVarStatement;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.CustomRoot:
        if (props_CustomRoot == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("root for tests");
          cpb.rawPresentation("custom root");
          props_CustomRoot = cpb.create();
        }
        return props_CustomRoot;
      case LanguageConceptSwitch.CustomStatement:
        if (props_CustomStatement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_CustomStatement = cpb.create();
        }
        return props_CustomStatement;
      case LanguageConceptSwitch.CustomStatementRef:
        if (props_CustomStatementRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x157a9668bf58417bL, 0x893e53d86388dc56L, 0x1e076e8c8ce9211aL, 0x1e076e8c8ce92801L, "myStatement", "", "");
          props_CustomStatementRef = cpb.create();
        }
        return props_CustomStatementRef;
      case LanguageConceptSwitch.OutputNode:
        if (props_OutputNode == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("OutputNode");
          props_OutputNode = cpb.create();
        }
        return props_OutputNode;
      case LanguageConceptSwitch.OutputNode_forDontApplyReductionTwice_test:
        if (props_OutputNode_forDontApplyReductionTwice_test == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("OutputNode_forDontApplyReductionTwice_test");
          props_OutputNode_forDontApplyReductionTwice_test = cpb.create();
        }
        return props_OutputNode_forDontApplyReductionTwice_test;
      case LanguageConceptSwitch.OutputRoot:
        if (props_OutputRoot == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_OutputRoot = cpb.create();
        }
        return props_OutputRoot;
      case LanguageConceptSwitch.TwoVarStatement:
        if (props_TwoVarStatement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("TwoVarStatement");
          props_TwoVarStatement = cpb.create();
        }
        return props_TwoVarStatement;
    }
    return null;
  }
}
