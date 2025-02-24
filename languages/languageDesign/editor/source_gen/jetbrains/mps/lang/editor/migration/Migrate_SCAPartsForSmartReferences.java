package jetbrains.mps.lang.editor.migration;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.MigrationScriptBase;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import java.util.Map;
import jetbrains.mps.lang.migration.runtime.base.MigrationScriptReference;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.structure.util.SmartRefAttributeUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class Migrate_SCAPartsForSmartReferences extends MigrationScriptBase {
  public String getCaption() {
    return "Migrate 'simple concept action' menu parts for smart references";
  }
  @Override
  public boolean isRerunnable() {
    return true;
  }
  public SNode execute(final SModule m) {
    doExecute(m);
    return null;
  }
  public void doExecute(final SModule m) {
    final Map<SModule, SNode> data = getDataCollector().collectData(m, new MigrationScriptReference(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 8));
    {
      final SearchScope scope = CommandUtil.createScope(m);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      Collection<SNode> SCAs = CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5c03050cab46db2L, "jetbrains.mps.lang.editor.structure.SubstituteMenuPart_AddConcept"), false);

      for (SNode sca : CollectionSequence.fromCollection(SCAs)) {
        final SNode conceptNode = SLinkOperations.getTarget(sca, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5c03050cab46db2L, 0x9aeec2e0d781773L, "concept"));

        SNode smartRefAttr = SmartRefAttributeUtil.extractAttribute(conceptNode);
        if ((smartRefAttr != null)) {
          SNode charactersticReference = SLinkOperations.getTarget(smartRefAttr, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x7ab7b29c4d6297e8L, 0x7ab7b29c4d6297edL, "charactersticReference"));
          SNode template = SLinkOperations.getTarget(smartRefAttr, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x7ab7b29c4d6297e8L, 0x7ab7b29c4d66ac37L, "refPresentationTemplate"));

          SNode entity = ListSequence.fromList(SLinkOperations.getChildren(MapSequence.fromMap(data).get(check_6mkphx_a0a0a0d0d0c0b0d(SNodeOperations.getModel(SLinkOperations.getTarget(sca, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5c03050cab46db2L, 0x9aeec2e0d781773L, "concept"))))), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x29e124551692debaL, 0x29e124551692ded1L, "entities"))).where(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return Objects.equals(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x29e124551692debbL, 0x29e124551692debeL, "conceptNode")), conceptNode);
            }
          }).first();

          if ((entity != null)) {
            SNodeOperations.replaceWithAnother(sca, _quotation_createNode_6mkphx_a0a0a5a3a2a0a6(SLinkOperations.getTarget(entity, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x29e124551692debbL, 0x29e124551692dec1L, "generatedMenu"))));
          } else if ((template != null)) {
            SNodeOperations.replaceWithAnother(sca, RefScopeFactories.template(charactersticReference, SPropertyOperations.getString(template, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x7ab7b29c4d66855eL, 0x3bc83bac475c4b59L, "prefix")), SPropertyOperations.getString(template, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x7ab7b29c4d66855eL, 0x3bc83bac475c4b5cL, "suffix")), conceptNode));
          } else {
            SNodeOperations.replaceWithAnother(sca, RefScopeFactories.simple(charactersticReference, conceptNode));
          }
        }
      }
    }
  }
  public Iterable<MigrationScriptReference> requiresData() {
    return ListSequence.fromListAndArray(new ArrayList<MigrationScriptReference>(), new MigrationScriptReference(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 8));
  }
  public MigrationScriptReference getDescriptor() {
    return new MigrationScriptReference(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 9);
  }



  private static SModule check_6mkphx_a0a0a0d0d0c0b0d(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }
  private static SNode _quotation_createNode_6mkphx_a0a0a5a3a2a0a6(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0xa22200b56b57990L, "SubstituteMenuPart_IncludeMenu"), null, null, false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x5480a271c0d1df1fL, "SubstituteMenuReference_Named"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5480a271c0d1df1fL, 0x5480a271c0d2a27eL, "menu"), (SNode) parameter_1);
    quotedNode_2.addChild(MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xa22200b56b57990L, 0xa22200b56b57993L, "menuReference"), quotedNode_3);
    return quotedNode_2;
  }
}
