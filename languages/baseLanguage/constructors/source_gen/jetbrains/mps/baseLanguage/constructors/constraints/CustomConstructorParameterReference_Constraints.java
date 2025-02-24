package jetbrains.mps.baseLanguage.constructors.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeParent;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.scope.ListScope;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.SNodePointer;

public class CustomConstructorParameterReference_Constraints extends BaseConstraintsDescriptor {
  public CustomConstructorParameterReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b745ce64L, "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference"));
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
  @Override
  protected ConstraintFunction<ConstraintContext_CanBeParent, Boolean> calculateCanBeParentConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeParent, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeParent context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAParent(context.getNode(), context.getChildNode(), context.getChildConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeParentBreakingPoint);
        }

        return result;
      }
    };
  }
  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b745ce64L, 0x4aa85872b745ce65L, "parameter"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b745ce64L, 0x4aa85872b745ce65L), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_3lmvlt_a0a0a0a0a1a0b0a1a4;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              SNode args = SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x7500da2cf0943c2L, "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor"), false, false), MetaAdapterFactory.getContainmentLink(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x7500da2cf0943c2L, 0x4aa85872b7431817L, "arguments"));
              if (SNodeOperations.isInstanceOf(args, MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause"))) {
                List<SNode> result = new ArrayList<SNode>();
                ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(args, MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause")), MetaAdapterFactory.getContainmentLink(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, 0x41c47a507380d0bcL, "list")));
                return ListScope.forResolvableElements(result);
              } else if (SNodeOperations.isInstanceOf(args, MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6baL, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause"))) {
                return ListScope.forResolvableElements(SLinkOperations.getChildren(SNodeOperations.cast(args, MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6baL, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause")), MetaAdapterFactory.getContainmentLink(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6baL, 0x4aa85872b7431821L, "parameter")));
              } else {
                return null;
              }
            }
          }
        };
      }
    });
    return references;
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return true;
  }
  private static boolean staticCanBeAParent(SNode node, SNode childNode, SAbstractConcept childConcept, SContainmentLink link) {
    return true;
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:79d4c714-b426-4aae-a835-35e7add55090(jetbrains.mps.baseLanguage.constructors.constraints)", "1227128029536560199");
  private static SNodePointer canBeParentBreakingPoint = new SNodePointer("r:79d4c714-b426-4aae-a835-35e7add55090(jetbrains.mps.baseLanguage.constructors.constraints)", "1227128029536560195");
  private static SNodePointer breakingNode_3lmvlt_a0a0a0a0a1a0b0a1a4 = new SNodePointer("r:79d4c714-b426-4aae-a835-35e7add55090(jetbrains.mps.baseLanguage.constructors.constraints)", "6836281137582648266");
}
