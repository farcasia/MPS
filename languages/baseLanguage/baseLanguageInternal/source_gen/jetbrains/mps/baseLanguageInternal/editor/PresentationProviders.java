package jetbrains.mps.baseLanguageInternal.editor;

/*Generated by MPS */

import jetbrains.mps.smodel.action.IReferentPresentationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class PresentationProviders {
  public static final IReferentPresentationProvider PRESENTATION_7zoim2_a0a3a0 = new IReferentPresentationProvider() {
    @NotNull
    @Override
    public String getPresentation(@NotNull SNode sourceNode, @NotNull SNode targetNode) {
      return (String) Classifier__BehaviorDescriptor.getNestedNameInContext_id7q4lzBFjvF8.invoke(targetNode, sourceNode);
    }
  };
  public static final IReferentPresentationProvider PRESENTATION_7zoim2_a0a3a0_0 = new IReferentPresentationProvider() {
    @NotNull
    @Override
    public String getPresentation(@NotNull SNode sourceNode, @NotNull SNode targetNode) {
      return (String) Classifier__BehaviorDescriptor.getNestedNameInContext_id7q4lzBFjvF8.invoke(targetNode, sourceNode);
    }
  };
  public static final IReferentPresentationProvider PRESENTATION_4woyb4_a0a0a = new IReferentPresentationProvider() {
    @NotNull
    @Override
    public String getPresentation(@NotNull SNode sourceNode, @NotNull SNode targetNode) {
      return SPropertyOperations.getString(targetNode, MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x1204d89aadaL, "fieldName"));
    }
  };
}
