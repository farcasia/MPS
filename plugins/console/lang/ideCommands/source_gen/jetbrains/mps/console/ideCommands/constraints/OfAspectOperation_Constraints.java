package jetbrains.mps.console.ideCommands.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ModelsScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModuleOperations;
import jetbrains.mps.smodel.SNodePointer;

public class OfAspectOperation_Constraints extends BaseConstraintsDescriptor {
  public OfAspectOperation_Constraints() {
    super(MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x5252d9021b8b45a8L, "jetbrains.mps.console.ideCommands.structure.OfAspectOperation"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x5252d9021b8b45a8L, 0x7cd422dbfa7b06f8L, "requestedAspect"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x5252d9021b8b45a8L, 0x7cd422dbfa7b06f8L), this) {
      @Override
      public boolean hasOwnOnReferenceSetHandler() {
        return true;
      }
      @Override
      public boolean validate(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode) {
        return true;
      }
      @Override
      public void onReferenceSet(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode) {
        SLinkOperations.setTarget(referenceNode, MetaAdapterFactory.getReferenceLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x5252d9021b8b45a8L, 0x5252d9021b8c25b0L, "requestedAspect_old"), null);
      }
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
            return breakingNode_srl38n_a0a0a0a0a4a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Iterable<SModule> modules = SNodeOperations.getModel(_context.getContextNode()).getModule().getRepository().getModules();
              return new ModelsScope(Sequence.fromIterable(modules).select(new ISelector<SModule, SModel>() {
                public SModel select(SModule it) {
                  return SModuleOperations.getAspect(it, "plugin");
                }
              }), true, MetaAdapterFactory.getReferenceLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x5252d9021b8b45a8L, 0x7cd422dbfa7b06f8L, "requestedAspect").getTargetConcept());
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_srl38n_a0a0a0a0a4a0b0a1a2 = new SNodePointer("r:64807243-49b2-422a-a08f-a5df76bf508d(jetbrains.mps.console.ideCommands.constraints)", "6836281137582820753");
}
