package jetbrains.mps.build.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.build.behavior.BuildLayout_ContainerAcceptingFileSet__BehaviorDescriptor;
import jetbrains.mps.smodel.SNodePointer;

public class BuildLayout_Filemode_Constraints extends BaseConstraintsDescriptor {
  public BuildLayout_Filemode_Constraints() {
    super(MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x6c4335df4e838e40L, "jetbrains.mps.build.structure.BuildLayout_Filemode"));
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    SNode archive = SNodeOperations.getNodeAncestor(parentNode, MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db927f229L, "jetbrains.mps.build.structure.BuildLayout_ContainerAcceptingFileSet"), true, false);
    return archive != null && (boolean) BuildLayout_ContainerAcceptingFileSet__BehaviorDescriptor.hasFileModeAttribute_id5zIo$W4pFU5.invoke(archive) || parentNode.getConcept().getQualifiedName().startsWith("jetbrains.mps.lang.generator");
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:5076fdb3-19c3-4563-aa26-7ace7591e78d(jetbrains.mps.build.constraints)", "1227128029536580395");
}
