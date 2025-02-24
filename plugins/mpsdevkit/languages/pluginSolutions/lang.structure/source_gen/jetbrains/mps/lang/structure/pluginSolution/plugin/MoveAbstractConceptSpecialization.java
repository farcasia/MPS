package jetbrains.mps.lang.structure.pluginSolution.plugin;

/*Generated by MPS */

import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.smodel.adapter.MetaAdapterByDeclaration;
import java.util.List;
import jetbrains.mps.refactoring.participant.RefactoringParticipant;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.structure.util.ConceptIdHelper;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.behavior.ConceptId__BehaviorDescriptor;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.editor.runtime.impl.cellActions.CommentUtil;
import java.util.Collection;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.lang.structure.plugin.RefactoringRuntime;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class MoveAbstractConceptSpecialization extends StructureSpecializationBase<SAbstractConcept> {
  public Tuples._2<SAbstractConcept, SNodeReference> fetchState(SNode movingNode) {
    if (SNodeOperations.isInstanceOf(movingNode, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) && SNodeOperations.getModel(movingNode).getModule() instanceof Language) {
      return MultiTuple.<SAbstractConcept,SNodeReference>from(MetaAdapterByDeclaration.getConcept(movingNode), movingNode.getReference());
    } else {
      return null;
    }
  }
  public void confirm(List<RefactoringParticipant.Option> selectedOptions, Tuples._2<SAbstractConcept, SNodeReference> initialState, Tuples._2<SAbstractConcept, SNodeReference> finalState, SRepository repository, LanguageStructureMigrationParticipant.MigrationBuilder migrationBuilder, boolean updateModuleDependencies) {
    SNode from = SNodeOperations.cast(initialState._1().resolve(repository), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
    SNode to = SNodeOperations.cast(finalState._1().resolve(repository), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
    SPropertyOperations.set(from, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString_def(from, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "") + "_old");
    AttributeOperations.setAttribute(from, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation")), createDeprecatedNodeAnnotation_c4c66o_a0d0b("The concept was moved to language \"" + SNodeOperations.getModel(to).getModule().getModuleName() + "\""));
    SPropertyOperations.set(to, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0x5d2e6079771f8cc0L, "conceptId"), ConceptIdHelper.generateConceptId(SNodeOperations.getModel(to), to) + "");

    SModule fromModule = SNodeOperations.getModel(from).getModule();
    assert fromModule instanceof Language;
    SModel editorModel = LanguageAspect.EDITOR.getOrCreate((Language) fromModule);
    addEmptySubstituteMenu(editorModel, from);

    if (ListSequence.fromList(selectedOptions).contains(WriteSubconceptMigrationParticipant.OPTION)) {
      if (SNodeOperations.isInstanceOf(from, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) && SNodeOperations.isInstanceOf(to, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
        SLinkOperations.setTarget(SNodeOperations.cast(to, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")), MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends"), SNodeOperations.cast(from, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")));
      } else if (SNodeOperations.isInstanceOf(from, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration")) && SNodeOperations.isInstanceOf(to, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"))) {
        ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(to, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration")), MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, 0x110356e9df4L, "extends"))).addElement(createInterfaceConceptReference_c4c66o_a0a0a0a0l0b(SNodeOperations.cast(from, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"))));
      } else {
        throw new IllegalStateException();
      }
      SModule toModule = SNodeOperations.getModel(to).getModule();
      assert toModule instanceof Language;
      if (updateModuleDependencies) {
        ((Language) toModule).addExtendedLanguage(fromModule.getModuleReference());
      }
    }

    SNode oldId = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"));
    ConceptId__BehaviorDescriptor.setConcept_id5ZE7FBYYR6j.invoke(oldId, MetaAdapterByDeclaration.getConcept(from));
    SNode newId = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"));
    ConceptId__BehaviorDescriptor.setConcept_id5ZE7FBYYR6j.invoke(newId, MetaAdapterByDeclaration.getConcept(to));
    migrationBuilder.addPart(from, to, createMoveConcept_c4c66o_c0a71a1(SNodeOperations.cast(HUtil.copyIfNecessary(oldId), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId")), SNodeOperations.cast(HUtil.copyIfNecessary(newId), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x5fea1eb9fefb6fe7L, "jetbrains.mps.lang.smodel.structure.ConceptId"))));
  }
  private void addEmptySubstituteMenu(SModel editorModel, final SNode from) {
    SNode existingSubstituteMenu = ListSequence.fromList(SModelOperations.roots(editorModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x2de9c932f4e5ab84L, "jetbrains.mps.lang.editor.structure.SubstituteMenu_Default"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration")) == from;
      }
    }).first();
    if (existingSubstituteMenu != null) {
      List<SNode> parts = ListSequence.fromList(SLinkOperations.getChildren(existingSubstituteMenu, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1bc2c2df999a7727L, 0x5c03050cab44f64L, "parts"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return !(SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x25c7da75de4cff05L, "jetbrains.mps.lang.editor.structure.SubstituteMenuPart_Placeholder")));
        }
      }).toListSequence();
      CommentUtil.commentOutAll(parts);
    } else {
      SModelOperations.addRootNode(editorModel, createSubstituteMenu_Default_c4c66o_a0a0a0b0c(from));
    }
  }
  public Collection<SNode> findInstances(final SAbstractConcept concept, SearchScope searchScope) {
    {
      final SearchScope scope = CommandUtil.createScope(searchScope);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      return CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), SNodeOperations.asSConcept(concept), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(it)), SNodeOperations.asSConcept(concept));
        }
      }).toListSequence();
    }
  }
  public void doReplaceInstance(SNode instance, SAbstractConcept oldConcept, SAbstractConcept newConcept) {
    RefactoringRuntime.replaceWithNewConcept(instance, newConcept);
  }
  private static SNode createDeprecatedNodeAnnotation_c4c66o_a0d0b(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x11d0a70ae54L, 0x11d3ec760e8L, "comment"), p0 + "");
    return n1;
  }
  private static SNode createInterfaceConceptReference_c4c66o_a0a0a0a0l0b(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, "jetbrains.mps.lang.structure.structure.InterfaceConceptReference"), null, null, false);
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc"), (SNode) p0);
    return n1;
  }
  private static SNode createMoveConcept_c4c66o_c0a71a1(Object p0, Object p1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x2b3f57492c1741b6L, "jetbrains.mps.lang.migration.structure.MoveConcept"), null, null, false);
    if (p0 != null) {
      n1.addChild(MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x2b3f57492c1741b6L, 0x74cb131f590ad6eaL, "sourceId"), (SNode) p0);
    }
    if (p1 != null) {
      n1.addChild(MetaAdapterFactory.getContainmentLink(0x9074634404fd4286L, 0x97d5b46ae6a81709L, 0x2b3f57492c1741b6L, 0x74cb131f590ad6edL, "targetId"), (SNode) p1);
    }
    return n1;
  }
  private static SNode createSubstituteMenu_Default_c4c66o_a0a0a0b0c(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x2de9c932f4e5ab84L, "jetbrains.mps.lang.editor.structure.SubstituteMenu_Default"), null, null, false);
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration"), (SNode) p0);
    return n1;
  }
}
