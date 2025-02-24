package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.ListScope;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNodePointer;

public class SEnum_MemberOperation_Constraints extends BaseConstraintsDescriptor {
  public SEnum_MemberOperation_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e691L, "jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e691L, 0x120ed37e692L, "member"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e691L, 0x120ed37e692L), this) {
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
            return breakingNode_h040h8_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              final SNode enclosingNode = (((_context.getReferenceNode() == null) ? _context.getContextNode() : SNodeOperations.getParent(_context.getReferenceNode())));
              SNode enumNode = (SNodeOperations.isInstanceOf(enclosingNode, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed32e98bL, "jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation")) ? SLinkOperations.getTarget(SNodeOperations.cast(enclosingNode, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed32e98bL, "jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed32e98bL, 0x120ed32e98cL, "enumDeclaration")) : null);
              if (enumNode != null) {
                return ListScope.forResolvableElements(SLinkOperations.getChildren(enumNode, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xfc26875dfbL, 0xfc32151efeL, "member")));
              }
              return ListScope.forResolvableElements(new ArrayList<SNode>());
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_h040h8_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)", "6836281137582800917");
}
