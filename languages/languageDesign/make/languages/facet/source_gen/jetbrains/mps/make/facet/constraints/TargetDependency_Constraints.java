package jetbrains.mps.make.facet.constraints;

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
import jetbrains.mps.make.facet.behavior.FacetDeclaration__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.SNodePointer;

public class TargetDependency_Constraints extends BaseConstraintsDescriptor {
  public TargetDependency_Constraints() {
    super(MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, "jetbrains.mps.make.facet.structure.TargetDependency"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, 0x5912a2ab1cd24c63L, "dependsOn"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c60L, 0x5912a2ab1cd24c63L), this) {
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
            return breakingNode_hpg3kp_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Iterable<SNode> relatedFacets = FacetDeclaration__BehaviorDescriptor.allRelated_id7fB872uckWE.invoke(SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c13L, "jetbrains.mps.make.facet.structure.FacetDeclaration"), false, false));
              return ListScope.forResolvableElements(Sequence.fromIterable(relatedFacets).translate(new ITranslator2<SNode, SNode>() {
                public Iterable<SNode> translate(SNode it) {
                  return SNodeOperations.getNodeDescendants(it, MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c3dL, "jetbrains.mps.make.facet.structure.TargetDeclaration"), false, new SAbstractConcept[]{});
                }
              }));
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_hpg3kp_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:6df86908-c97f-4644-97f0-5eff375e8e15(jetbrains.mps.make.facet.constraints)", "6836281137582789251");
}
