package jetbrains.mps.lang.editor.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeRoot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModuleOperations;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SNodePointer;

public class CellKeyMapDeclaration_Constraints extends BaseConstraintsDescriptor {
  public CellKeyMapDeclaration_Constraints() {
    super(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfbc216b31bL, "jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration"));
  }

  @Override
  public ConstraintFunction<ConstraintContext_CanBeRoot, Boolean> calculateCanBeRootConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeRoot, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeRoot context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeARoot(context.getModel());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeRootBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeARoot(SModel model) {
    return SModuleOperations.isAspect(model, "editor") || SModelStereotype.isGeneratorModel(model);
  }
  private static SNodePointer canBeRootBreakingPoint = new SNodePointer("r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.lang.editor.constraints)", "1227090234635");
}
