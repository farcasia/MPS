package jetbrains.mps.samples.languagePatterns.Basic.constraints;

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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.samples.languagePatterns.Basic.behavior.Component__BehaviorDescriptor;
import jetbrains.mps.smodel.SNodePointer;

public class ComponentUsage_Constraints extends BaseConstraintsDescriptor {
  public ComponentUsage_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fb71L, "jetbrains.mps.samples.languagePatterns.Basic.structure.ComponentUsage"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fb71L, 0x4ed97160b0a7fba5L, "usedComponent"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fb71L, 0x4ed97160b0a7fba5L), this) {
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
            return breakingNode_4swebx_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Iterable<SNode> unusedComponents = ListSequence.fromList(SModelOperations.nodes(SNodeOperations.getModel(_context.getContextNode()), MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fa2aL, "jetbrains.mps.samples.languagePatterns.Basic.structure.Component"))).where(new IWhereFilter<SNode>() {
                public boolean accept(final SNode b) {
                  return ListSequence.fromList(SModelOperations.nodes(SNodeOperations.getModel(_context.getContextNode()), MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fb71L, "jetbrains.mps.samples.languagePatterns.Basic.structure.ComponentUsage"))).where(new IWhereFilter<SNode>() {
                    public boolean accept(SNode u) {
                      return !(Objects.equals(u, _context.getContextNode()));
                    }
                  }).all(new IWhereFilter<SNode>() {
                    public boolean accept(SNode u) {
                      return !(Objects.equals(SLinkOperations.getTarget(u, MetaAdapterFactory.getReferenceLink(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fb71L, 0x4ed97160b0a7fba5L, "usedComponent")), b));
                    }
                  });
                }
              });
              return new ListScope(unusedComponents) {
                public String getName(SNode child) {
                  return (String) Component__BehaviorDescriptor.fullName_id4Vpsm2KEoLo.invoke(SNodeOperations.cast(child, MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x4ed97160b0a7fa2aL, "jetbrains.mps.samples.languagePatterns.Basic.structure.Component")));
                }
              };
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_4swebx_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:7e1c7518-df7a-4f22-84b2-a5e68261264a(jetbrains.mps.samples.languagePatterns.Basic.constraints)", "6836281137582847690");
}
