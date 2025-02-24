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
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.behavior.ILinkAccessQualifierContainer__BehaviorDescriptor;
import jetbrains.mps.smodel.SNodePointer;

public class LinkRefQualifier_Constraints extends BaseConstraintsDescriptor {
  public LinkRefQualifier_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, "jetbrains.mps.lang.smodel.structure.LinkRefQualifier"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, 0x11886c4bac1L, "link"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, 0x11886c4bac1L), this) {
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
            return breakingNode_cgym5w_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              final SNode enclosingNode = (((_context.getReferenceNode() == null) ? _context.getContextNode() : SNodeOperations.getParent(_context.getReferenceNode())));
              if (!(SNodeOperations.isInstanceOf(enclosingNode, MetaAdapterFactory.getInterfaceConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x312a67f61731e269L, "jetbrains.mps.lang.smodel.structure.ILinkAccessQualifierContainer")))) {
                return new EmptyScope();
              }
              SNode qualifierContainer = SNodeOperations.cast(enclosingNode, MetaAdapterFactory.getInterfaceConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x312a67f61731e269L, "jetbrains.mps.lang.smodel.structure.ILinkAccessQualifierContainer"));
              return ListScope.forResolvableElements(ILinkAccessQualifierContainer__BehaviorDescriptor.getLinkAccessScope_id2xk$X1Ld2Yi.invoke(qualifierContainer));
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_cgym5w_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)", "6836281137582802839");
}
