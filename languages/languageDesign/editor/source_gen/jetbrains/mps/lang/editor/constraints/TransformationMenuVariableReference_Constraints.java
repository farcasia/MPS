package jetbrains.mps.lang.editor.constraints;

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

public class TransformationMenuVariableReference_Constraints extends BaseConstraintsDescriptor {
  public TransformationMenuVariableReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x201faaffc29bac4fL, "jetbrains.mps.lang.editor.structure.TransformationMenuVariableReference"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L), this) {
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
            return breakingNode_28ntjz_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContainmentLink(), _context.getPosition(), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11266742db0L, "jetbrains.mps.lang.editor.structure.TransformationMenuVariableDeclaration"));
              return (scope == null ? new EmptyScope() : scope);
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_28ntjz_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.lang.editor.constraints)", "2314756748950088823");
}
