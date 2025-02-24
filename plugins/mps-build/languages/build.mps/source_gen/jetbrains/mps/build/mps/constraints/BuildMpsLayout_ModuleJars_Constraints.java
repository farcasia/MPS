package jetbrains.mps.build.mps.constraints;

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
import jetbrains.mps.scope.FilteringScope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class BuildMpsLayout_ModuleJars_Constraints extends BaseConstraintsDescriptor {
  public BuildMpsLayout_ModuleJars_Constraints() {
    super(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x11918e0f209b83e7L, "jetbrains.mps.build.mps.structure.BuildMpsLayout_ModuleJars"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x11918e0f209b83e7L, 0x11918e0f209b83e9L, "module"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x11918e0f209b83e7L, 0x11918e0f209b83e9L), this) {
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
            return breakingNode_9ulpon_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope outer = Scope.getScope(Scope.parent(_context.getContextNode()), _context.getContextNode(), MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d333ebL, "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule"));
              return (outer == null ? null : new FilteringScope(outer) {
                @Override
                public boolean isExcluded(SNode node) {
                  // it's ok to reference generators that are project parts, but those that come as part of a language 
                  // get processed together with language and doesn't need distinct layout 
                  return SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4c6db07d2e56a8b4L, "jetbrains.mps.build.mps.structure.BuildMps_Generator")) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c446791464290f8L, "jetbrains.mps.build.mps.structure.BuildMps_Language"));
                }
              });
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_9ulpon_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:76dda237-5120-4688-b749-201ab5c5059d(jetbrains.mps.build.mps.constraints)", "6836281137582840096");
}
