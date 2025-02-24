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
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class IfInstanceOfVarReference_Constraints extends BaseConstraintsDescriptor {
  public IfInstanceOfVarReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1a228da1357fca73L, "jetbrains.mps.lang.smodel.structure.IfInstanceOfVarReference"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x4c4b92003e49a704L, 0x4c4b92003e49a705L, "baseVariableDeclaration"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x4c4b92003e49a704L, 0x4c4b92003e49a705L), this) {
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
            return breakingNode_p36rc2_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return ListScope.forResolvableElements(ListSequence.fromList(SNodeOperations.getNodeAncestors(_context.getContextNode(), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1a228da1357e4a44L, "jetbrains.mps.lang.smodel.structure.IfInstanceOfStatement"), false)).select(new ISelector<SNode, SNode>() {
              public SNode select(SNode it) {
                return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1a228da1357e4a44L, 0x1a228da1357e4a47L, "variable"));
              }
            }));
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_p36rc2_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)", "6836281137582800563");
}
