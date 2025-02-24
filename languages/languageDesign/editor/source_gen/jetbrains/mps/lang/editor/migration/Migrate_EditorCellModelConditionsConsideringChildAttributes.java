package jetbrains.mps.lang.editor.migration;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.MigrationScriptBase;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import java.util.Collection;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.migration.runtime.base.MigrationScriptReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class Migrate_EditorCellModelConditionsConsideringChildAttributes extends MigrationScriptBase {
  public String getCaption() {
    return "Migrate_EditorCellModelConditionsConsideringChildAttributes";
  }
  @Override
  public boolean isRerunnable() {
    return false;
  }
  public SNode execute(final SModule m) {
    doExecute(m);
    return null;
  }
  public void doExecute(final SModule m) {
    {
      final SearchScope scope = CommandUtil.createScope(m);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      Collection<SNode> allCellModels = CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eafb9a39L, "jetbrains.mps.lang.editor.structure.EditorCellModel"), false);
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eafb9a39L, 0x10a19696199L, "renderingCondition")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(cellModel, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eafb9a39L, 0x10a19696199L, "renderingCondition"));
        }
      });
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eafb9a39L, 0x1170ce1df2aL, "focusPolicyApplicable")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(cellModel, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eafb9a39L, 0x1170ce1df2aL, "focusPolicyApplicable"));
        }
      });
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd766383e4L, "jetbrains.mps.lang.editor.structure.CellModel_Alternation")) && (SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd766383e4L, "jetbrains.mps.lang.editor.structure.CellModel_Alternation")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd766383e4L, 0x10ace10f2d6L, "alternationCondition")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(SNodeOperations.cast(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd766383e4L, "jetbrains.mps.lang.editor.structure.CellModel_Alternation")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd766383e4L, 0x10ace10f2d6L, "alternationCondition"));
        }
      });
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) && (SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x569b712fbc6ece29L, "collapseByDefaultCondition")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(SNodeOperations.cast(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x569b712fbc6ece29L, "collapseByDefaultCondition"));
        }
      });
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) && (SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x78de9e36d994f770L, "usesFoldingCondition")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(SNodeOperations.cast(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, "jetbrains.mps.lang.editor.structure.CellModel_Collection")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eaff2517L, 0x78de9e36d994f770L, "usesFoldingCondition"));
        }
      });
      migrateEditorCellModels(CollectionSequence.fromCollection(allCellModels).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1098c8cf48aL, "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole")) && (SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1098c8cf48aL, "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1098c8cf48aL, 0x3fdace61664c27e7L, "usesFoldingCondition")) != null);
        }
      }), new _FunctionTypes._return_P1_E0<SNode, SNode>() {
        public SNode invoke(SNode cellModel) {
          return SLinkOperations.getTarget(SNodeOperations.cast(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1098c8cf48aL, "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole")), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1098c8cf48aL, 0x3fdace61664c27e7L, "usesFoldingCondition"));
        }
      });
    }
  }
  public MigrationScriptReference getDescriptor() {
    return new MigrationScriptReference(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0);
  }
  private Iterable<SNode> linkCellsInsideCellModel(SNode cellModel) {
    return ListSequence.fromList(SNodeOperations.getNodeDescendants(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb05cdc7L, "jetbrains.mps.lang.editor.structure.CellModel_RefNode"), true, new SAbstractConcept[]{})).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"));
      }
    }).concat(ListSequence.fromList(SNodeOperations.getNodeDescendants(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb0ad38eL, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList"), true, new SAbstractConcept[]{})).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"));
      }
    }).concat(ListSequence.fromList(SNodeOperations.getNodeDescendants(cellModel, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd52a2c922L, "jetbrains.mps.lang.editor.structure.CellModel_RefCell"), true, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd52a2c922L, "jetbrains.mps.lang.editor.structure.CellModel_RefCell")), MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration")), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass"), "aggregation", "reference");
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfd52a2c922L, "jetbrains.mps.lang.editor.structure.CellModel_RefCell")), MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"));
      }
    })));
  }
  private void migrateEditorCellModels(Iterable<SNode> cellModels, _FunctionTypes._return_P1_E0<? extends SNode, ? super SNode> getCondition) {
    for (SNode cellModel : Sequence.fromIterable(cellModels)) {
      Iterable<SNode> affectedLinks = linkCellsInsideCellModel(cellModel);
      SNode conditionFunction = getCondition.invoke(cellModel);
      migrateSLinkAccessAndSLinkListAccessDescendants(conditionFunction, affectedLinks);
    }
  }
  private boolean isChildOfNotNullOrNotEqualsToNullExpression(SNode node) {
    SNode parent = SNodeOperations.getParent(node);
    if (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"))) {
      return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation")), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x110e123bce7L, "jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation"));
    } else if (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf9e20e303fL, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression"))) {
      if (Objects.equals(node.getContainmentLink(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"))) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf9e20e303fL, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940cd6167L, "jetbrains.mps.baseLanguage.structure.NullLiteral"));
      } else {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf9e20e303fL, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940cd6167L, "jetbrains.mps.baseLanguage.structure.NullLiteral"));
      }
    }
    return false;
  }

  private boolean isChildOfNotEmptyExpression(SNode node) {
    SNode parent = SNodeOperations.getParent(node);
    if (!(SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")))) {
      return false;
    }
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation")), MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x111ecf423b7L, "jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation"));
  }
  private boolean isChildSizeEqualsToZeroExpression(SNode node) {
    SNode parent = SNodeOperations.getParent(node);
    if (!(SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")))) {
      return false;
    }
    SNode operation = SLinkOperations.getTarget(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation"));
    if (!(SNodeOperations.isInstanceOf(operation, MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10ec4627e6fL, "jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation")))) {
      return false;
    }
    SNode grandParent = SNodeOperations.getParent(parent);
    if (!((SNodeOperations.isInstanceOf(grandParent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation"))))) {
      return false;
    }
    boolean isLeft = Objects.equals(parent.getContainmentLink(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"));
    SNode otherExpression;
    if (isLeft) {
      otherExpression = SLinkOperations.getTarget(SNodeOperations.cast(grandParent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"));
    } else {
      otherExpression = SLinkOperations.getTarget(SNodeOperations.cast(grandParent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, "jetbrains.mps.baseLanguage.structure.BinaryOperation")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"));
    }
    boolean isZero = SNodeOperations.isInstanceOf(otherExpression, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant")) && SPropertyOperations.getInteger(SNodeOperations.cast(otherExpression, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant")), MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) == 0;
    if (!(isZero)) {
      return false;
    }
    SAbstractConcept cncpt_l0k = SNodeOperations.getConcept(grandParent);
    boolean noneMatched_l0k = true;
    if (noneMatched_l0k && SConceptOperations.isSubConceptOf(cncpt_l0k, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbced38fcfL, "jetbrains.mps.baseLanguage.structure.GreaterThanExpression"))) {
      noneMatched_l0k = false;
      return isLeft;
    }
    if (noneMatched_l0k && SConceptOperations.isSubConceptOf(cncpt_l0k, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbced3b82aL, "jetbrains.mps.baseLanguage.structure.LessThanExpression"))) {
      noneMatched_l0k = false;
      return !(isLeft);
    }
    if (noneMatched_l0k && SConceptOperations.isSubConceptOf(cncpt_l0k, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf9e20e303fL, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression"))) {
      noneMatched_l0k = false;
      return true;
    }
    if (noneMatched_l0k) {
    }
    return false;
  }
  private void migrateSLinkAccessAndSLinkListAccessDescendants(SNode conditionQueryNode, Iterable<SNode> affectedLinks) {
    migrateAllDescendantsByConcept(conditionQueryNode, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f96ea2caL, "jetbrains.mps.lang.smodel.structure.SLinkAccess"), affectedLinks, new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
      public Boolean invoke(SNode parent) {
        return isChildOfNotNullOrNotEqualsToNullExpression(parent);
      }
    }, new _FunctionTypes._return_P1_E0<SNode, SNode>() {
      public SNode invoke(SNode linkAccess) {
        return SLinkOperations.getTarget(SNodeOperations.cast(linkAccess, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f96ea2caL, "jetbrains.mps.lang.smodel.structure.SLinkAccess")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f96ea2caL, 0x108f974549cL, "link"));
      }
    }, new _FunctionTypes._return_P1_E0<SNode, SNode>() {
      public SNode invoke(SNode parent) {
        assert SNodeOperations.getParent(parent) != null;
        return SNodeOperations.getParent(parent);
      }
    });

    migrateAllDescendantsByConcept(conditionQueryNode, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, "jetbrains.mps.lang.smodel.structure.SLinkListAccess"), affectedLinks, new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
      public Boolean invoke(SNode parent) {
        return isChildOfNotEmptyExpression(parent) || isChildSizeEqualsToZeroExpression(parent);
      }
    }, new _FunctionTypes._return_P1_E0<SNode, SNode>() {
      public SNode invoke(SNode linkAccess) {
        return SLinkOperations.getTarget(SNodeOperations.cast(linkAccess, MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, "jetbrains.mps.lang.smodel.structure.SLinkListAccess")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, 0x108f974c962L, "link"));
      }
    }, new _FunctionTypes._return_P1_E0<SNode, SNode>() {
      public SNode invoke(SNode parent) {
        if (isChildOfNotEmptyExpression(parent)) {
          assert SNodeOperations.getParent(parent) != null;
          return SNodeOperations.getParent(parent);
        } else if (isChildSizeEqualsToZeroExpression(parent)) {
          assert SNodeOperations.getParent(SNodeOperations.getParent(parent)) != null;
          return SNodeOperations.getParent(SNodeOperations.getParent(parent));
        } else {
          assert false;
          return null;
        }
      }
    });
  }


  private void migrateAllDescendantsByConcept(SNode conditionQueryNode, SAbstractConcept concept, Iterable<SNode> affectedLinks, _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> linkAccessParentCondition, _FunctionTypes._return_P1_E0<? extends SNode, ? super SNode> linkFunction, _FunctionTypes._return_P1_E0<? extends SNode, ? super SNode> nodeToReplaceFunction) {
    for (SNode linkAccess : ListSequence.fromList(SNodeOperations.getNodeDescendants(conditionQueryNode, SNodeOperations.asSConcept(concept), false, new SAbstractConcept[]{}))) {
      SNode link = linkFunction.invoke(linkAccess);
      if (!(SPropertyOperations.hasValue(link, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf980556927L, "metaClass"), "aggregation", "reference"))) {
        continue;
      }
      if (!(Sequence.fromIterable(affectedLinks).contains(link))) {
        continue;
      }
      SNode parent = SNodeOperations.getParent(linkAccess);
      if (!(SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")))) {
        continue;
      }
      if (linkAccessParentCondition.invoke(parent)) {
        replaceLinkAccessWithChildAndAttributesOperation(SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")), link);
        replaceNodeWithNotEmptyExpression(nodeToReplaceFunction.invoke(parent), SNodeOperations.cast(parent, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")));
      }
    }
  }

  private void replaceNodeWithNotEmptyExpression(SNode nodeToReplace, SNode operand) {
    SNode newExpression = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"));
    SLinkOperations.setTarget(newExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand"), operand);
    SLinkOperations.setNewChild(newExpression, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation"), MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x111ecf423b7L, "jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation"));
    SNodeOperations.replaceWithAnother(nodeToReplace, newExpression);

  }
  private void replaceLinkAccessWithChildAndAttributesOperation(SNode operand, SNode link) {
    SNode newLinkAccess = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x6cbc725f4b35314cL, "jetbrains.mps.lang.smodel.structure.Node_GetChildrenAndChildAttributesOperation"));
    SNode parameter = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x47bb2de70d00ff8cL, "jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier"));
    ListSequence.fromList(SLinkOperations.getChildren(newLinkAccess, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x1090ea2ebacL, 0x10a61ef5a56L, "parameter"))).addElement(parameter);
    SNode refQualifier = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, "jetbrains.mps.lang.smodel.structure.LinkRefQualifier"));
    SLinkOperations.setTarget(parameter, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x47bb2de70d00ff8cL, 0x47bb2de70d00ff8dL, "linkQualifier"), refQualifier);
    SLinkOperations.setTarget(refQualifier, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x11886c4bac0L, 0x11886c4bac1L, "link"), link);
    SLinkOperations.setTarget(SNodeOperations.cast(operand, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation"), newLinkAccess);
  }

}
