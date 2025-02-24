package jetbrains.mps.lang.test.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;

public class MigrationReference_Constraints extends BaseConstraintsDescriptor {
  public MigrationReference_Constraints() {
    super(MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x5bf7864595dddf89L, "jetbrains.mps.lang.test.structure.MigrationReference"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x5bf7864595dddf89L, 0x5bf7864595dddf8aL, "migration"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x5bf7864595dddf89L, 0x5bf7864595dddf8aL), this) {
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
        if (SNodeOperations.hasRole(referenceNode, MetaAdapterFactory.getContainmentLink(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x4c010b30d9be4be7L, 0x5bf7864595df8b02L, "migration")) && ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(referenceNode), MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x4c010b30d9be4be7L, "jetbrains.mps.lang.test.structure.MigrationTestCase")), MetaAdapterFactory.getContainmentLink(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x4c010b30d9be4be7L, 0x5bf7864595df8b02L, "migration"))).count() == 1) {
          SPropertyOperations.set(SNodeOperations.cast(SNodeOperations.getParent(referenceNode), MetaAdapterFactory.getConcept(0x8585453e6bfb4d80L, 0x98deb16074f1d86cL, 0x4c010b30d9be4be7L, "jetbrains.mps.lang.test.structure.MigrationTestCase")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(newReferentNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_Test");
        }
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {};
      }
    });
    return references;
  }
}
