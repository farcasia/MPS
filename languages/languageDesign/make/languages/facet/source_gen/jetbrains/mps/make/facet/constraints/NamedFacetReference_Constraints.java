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
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class NamedFacetReference_Constraints extends BaseConstraintsDescriptor {
  public NamedFacetReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x1aa1f6c694329f95L, "jetbrains.mps.make.facet.structure.NamedFacetReference"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5979ed6d2b21b2f2L, 0x5979ed6d2b21b2f3L, "facet"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5979ed6d2b21b2f2L, 0x5979ed6d2b21b2f3L), this) {
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
            return breakingNode_n4zw7m_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return ListScope.forResolvableElements(SModelOperations.nodesIncludingImported(SNodeOperations.getModel(_context.getContextNode()), MetaAdapterFactory.getConcept(0x696c11654a59463bL, 0xbc5d902caab85dd0L, 0x5912a2ab1cd24c13L, "jetbrains.mps.make.facet.structure.FacetDeclaration")));
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_n4zw7m_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:6df86908-c97f-4644-97f0-5eff375e8e15(jetbrains.mps.make.facet.constraints)", "6836281137582791152");
}
