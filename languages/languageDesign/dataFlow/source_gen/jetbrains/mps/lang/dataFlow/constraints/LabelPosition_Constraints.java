package jetbrains.mps.lang.dataFlow.constraints;

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
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.smodel.SNodePointer;

public class LabelPosition_Constraints extends BaseConstraintsDescriptor {
  public LabelPosition_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x1190a8b1526L, "jetbrains.mps.lang.dataFlow.structure.LabelPosition"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x1190a8b1526L, 0x1190a8b2ed8L, "label"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x1190a8b1526L, 0x1190a8b2ed8L), this) {
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
            return breakingNode_t9qyyi_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              List<SNode> labels = new ArrayList<SNode>();
              SNode builder = SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration"), true, false);
              ListSequence.fromList(labels).addSequence(ListSequence.fromList(SNodeOperations.getNodeDescendants(builder, MetaAdapterFactory.getConcept(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x1190a87adadL, "jetbrains.mps.lang.dataFlow.structure.EmitLabelStatement"), true, new SAbstractConcept[]{})));
              return ListScope.forResolvableElements(labels);
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_t9qyyi_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c89590377(jetbrains.mps.lang.dataFlow.constraints)", "6836281137582782170");
}
