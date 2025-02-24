package jetbrains.mps.baseLanguage.constraints;

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
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.smodel.SNodePointer;

public class LoopLabelReference_Constraints extends BaseConstraintsDescriptor {
  public LoopLabelReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x50c493bf9555129L, "jetbrains.mps.baseLanguage.structure.LoopLabelReference"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x50c493bf9555129L, 0x50c493bf955512aL, "loopLabel"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x50c493bf9555129L, 0x50c493bf955512aL), this) {
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
            return breakingNode_hn9a9l_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContainmentLink(), _context.getPosition(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x50c493bf9552f6aL, "jetbrains.mps.baseLanguage.structure.LoopLabel"));
              return (scope == null ? new EmptyScope() : scope);
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_hn9a9l_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "7898359107948137263");
}
