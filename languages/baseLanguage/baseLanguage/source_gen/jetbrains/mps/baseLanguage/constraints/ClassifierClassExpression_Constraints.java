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
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.baseLanguage.scopes.ClassifierScopes;
import jetbrains.mps.smodel.SNodePointer;

public class ClassifierClassExpression_Constraints extends BaseConstraintsDescriptor {
  public ClassifierClassExpression_Constraints() {
    super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, "jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }
          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {
            String nameInContext = Classifier__BehaviorDescriptor.getNestedNameInContext_id7q4lzBFjvF8.invoke(_context.getParameterNode(), _context.getEnclosingNode());
            if (_context.getSmartReference()) {
              return nameInContext + ".class";
            }
            return nameInContext;
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_w155fn_a0a2a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return ClassifierScopes.getWithClassExpressionClassifiers(_context.getContextNode());
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_w155fn_a0a2a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "6836281137582643064");
}
