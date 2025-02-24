package jetbrains.mps.lang.checkedName.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.ListScope;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;
import jetbrains.mps.smodel.SNodePointer;

public class PropertyRefExpression_Constraints extends BaseConstraintsDescriptor {
  public PropertyRefExpression_Constraints() {
    super(MetaAdapterFactory.getConcept(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f39L, "jetbrains.mps.lang.checkedName.structure.PropertyRefExpression"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f39L, 0x433c3c31e7218f3bL, "propertyDeclaration"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f39L, 0x433c3c31e7218f3bL), this) {
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
            return breakingNode_e11h12_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            if (!(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getContainmentLink(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f39L, 0x433c3c31e7218f3aL, "nodeExpr"))), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType")))) {
              return ListScope.forResolvableElements(new ArrayList<SNode>());
            }
            return ListScope.forResolvableElements(AbstractConceptDeclaration__BehaviorDescriptor.getPropertyDeclarations_idhEwILLM.invoke(SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getContainmentLink(0xfe9d76d7580945c9L, 0xae28a40915b4d6ffL, 0x433c3c31e7218f39L, 0x433c3c31e7218f3aL, "nodeExpr"))), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"))));
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_e11h12_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:bfde7c59-4df1-47aa-b96c-63906ea441df(jetbrains.mps.lang.checkedName.constraints)", "6836281137582781244");
}
