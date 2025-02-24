package jetbrains.mps.baseLanguage.javadoc.constraints;

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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.smodel.SNodePointer;

public class ReturnBlockDocTag_Constraints extends BaseConstraintsDescriptor {
  public ReturnBlockDocTag_Constraints() {
    super(MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f687050918eL, "jetbrains.mps.baseLanguage.javadoc.structure.ReturnBlockDocTag"));
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
  private static boolean staticCanBeAChild(final SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    if (!(SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7faeeb34L, "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment")))) {
      return false;
    }

    if (ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.as(parentNode, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, "jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment")), MetaAdapterFactory.getContainmentLink(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x4a3c146b7fae70d3L, 0x4ab5c2019ddc99f3L, "tags"))).all(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf280165065d5424eL, 0xbb1b463a8781b786L, 0x514c0f687050918eL, "jetbrains.mps.baseLanguage.javadoc.structure.ReturnBlockDocTag"))) || Objects.equals(it, node);
      }
    })) {
      SNode returnType = SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), false, false), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"));
      return !(((returnType != null) && SNodeOperations.isInstanceOf(returnType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc6bf96dL, "jetbrains.mps.baseLanguage.structure.VoidType"))));
    }
    return false;
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:28bcf003-0004-46b6-9fe7-2093e7fb1368(jetbrains.mps.baseLanguage.javadoc.constraints)", "1227128029536560279");
}
