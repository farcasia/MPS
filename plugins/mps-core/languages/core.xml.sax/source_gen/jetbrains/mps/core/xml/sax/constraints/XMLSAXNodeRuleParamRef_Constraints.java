package jetbrains.mps.core.xml.sax.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
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
import jetbrains.mps.scope.EmptyScope;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class XMLSAXNodeRuleParamRef_Constraints extends BaseConstraintsDescriptor {
  public XMLSAXNodeRuleParamRef_Constraints() {
    super(MetaAdapterFactory.getConcept(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x4180d2369b1f16c6L, "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParamRef"));
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
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x4180d2369b1f16c6L, 0x4180d2369b1f17e0L, "param"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x4180d2369b1f16c6L, 0x4180d2369b1f17e0L), this) {
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
            return breakingNode_58jyk7_a0a0a0a0a1a0b0a1a3;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContainmentLink(), _context.getPosition(), MetaAdapterFactory.getConcept(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0xd9be961730be3edL, "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRuleParam"));
              return (scope == null ? new EmptyScope() : scope);
            }
          }
        };
      }
    });
    return references;
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return (SNodeOperations.getNodeAncestor(parentNode, MetaAdapterFactory.getConcept(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e301L, "jetbrains.mps.core.xml.sax.structure.XMLSAXParser"), true, false) != null);
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:a2a452cd-a0b4-4774-9b7e-00f9c8226bfa(jetbrains.mps.core.xml.sax.constraints)", "1227128029536581166");
  private static SNodePointer breakingNode_58jyk7_a0a0a0a0a1a0b0a1a3 = new SNodePointer("r:a2a452cd-a0b4-4774-9b7e-00f9c8226bfa(jetbrains.mps.core.xml.sax.constraints)", "4720003541456853031");
}
