package jetbrains.mps.build.constraints;

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
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.build.util.ScopeUtil;
import jetbrains.mps.scope.ModelPlusImportedScope;
import jetbrains.mps.build.behavior.BuildSourcePath__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.smodel.SNodePointer;

public class BuildSource_JavaExternalJarRef_Constraints extends BaseConstraintsDescriptor {
  public BuildSource_JavaExternalJarRef_Constraints() {
    super(MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb2f64cL, "jetbrains.mps.build.structure.BuildSource_JavaExternalJarRef"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb2f64cL, 0x4ddcec86afb2f64dL, "jar"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afb2f64cL, 0x4ddcec86afb2f64dL), this) {
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
            SNode contextProject = SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject"), true, false);
            String target = null;
            if ((contextProject != null)) {
              Scope importedArtifactsScope = ScopeUtil.getVisibleJarsScope(contextProject);
              if (importedArtifactsScope != null && !(importedArtifactsScope instanceof ModelPlusImportedScope)) {
                target = importedArtifactsScope.getReferenceText(_context.getContextNode(), _context.getParameterNode());
              }
            }
            if (target == null) {
              target = (SNodeOperations.isInstanceOf(_context.getParameterNode(), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, "jetbrains.mps.build.structure.BuildInputSingleFile")) ? BuildSourcePath__BehaviorDescriptor.getRelativePath_id4Kip2_918YF.invoke(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParameterNode(), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, "jetbrains.mps.build.structure.BuildInputSingleFile")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x48d5d03db9224596L, 0x48d5d03db922459aL, "path"))) : BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(_context.getParameterNode()));
            }
            return target;
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_u5rckp_a0a2a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              SNode contextProject = SNodeOperations.getNodeAncestor(_context.getContextNode(), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject"), true, false);
              if ((contextProject != null)) {
                return ScopeUtil.getVisibleJarsScope(contextProject);
              }
              return new ModelPlusImportedScope(SNodeOperations.getModel(_context.getContextNode()), false, MetaAdapterFactory.getInterfaceConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4ddcec86afa57ad2L, "jetbrains.mps.build.structure.BuildSource_SingleFile"));
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_u5rckp_a0a2a0a0a1a0b0a1a2 = new SNodePointer("r:5076fdb3-19c3-4563-aa26-7ace7591e78d(jetbrains.mps.build.constraints)", "6836281137582840435");
}
