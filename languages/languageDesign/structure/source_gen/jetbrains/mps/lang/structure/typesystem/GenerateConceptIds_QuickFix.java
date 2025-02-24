package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.structure.util.ConceptIdSetter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GenerateConceptIds_QuickFix extends QuickFix_Runtime {
  public GenerateConceptIds_QuickFix() {
    super(new SNodePointer("r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "1587916991969835891"));
  }
  public String getDescription(SNode node) {
    return "Generate IDs";
  }
  public void execute(SNode node) {
    ConceptIdSetter.processConcept(((SNode) GenerateConceptIds_QuickFix.this.getField("c")[0]), SNodeOperations.getModel(((SNode) GenerateConceptIds_QuickFix.this.getField("c")[0])), false);
  }
}
