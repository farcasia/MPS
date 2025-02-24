package jetbrains.mps.migration.workbench.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class FindMetaCreationCode_Action extends BaseAction {
  private static final Icon ICON = null;

  public FindMetaCreationCode_Action() {
    super("Find Code that Creates Language Structures", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    Set<SNode> nodes = SetSequence.fromSet(new HashSet<SNode>());
    {
      final SearchScope scope = CommandUtil.createScope(((jetbrains.mps.project.Project) event.getData(MPSCommonDataKeys.MPS_PROJECT)));
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      SetSequence.fromSet(nodes).addSequence(Sequence.fromIterable(SNodeOperations.ofConcept(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"), false)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, 0x10ab847b486L, "creator"));
        }
      }), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, "jetbrains.mps.lang.smodel.structure.SNodeCreator"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, 0x112e36f7138L, "createdType")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1169125787135")));
        }
      }));
      SetSequence.fromSet(nodes).addSequence(Sequence.fromIterable(SNodeOperations.ofConcept(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"), false)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, 0x10ab847b486L, "creator"));
        }
      }), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, "jetbrains.mps.lang.smodel.structure.SNodeCreator"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, 0x112e36f7138L, "createdType")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489288299")));
        }
      }));
      SetSequence.fromSet(nodes).addSequence(Sequence.fromIterable(SNodeOperations.ofConcept(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"), false)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, 0x10ab847b486L, "creator"));
        }
      }), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, "jetbrains.mps.lang.smodel.structure.SNodeCreator"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, 0x112e36f7138L, "createdType")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489288298")));
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SNodeOperations.getNodeAncestor(it, MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, "jetbrains.mps.lang.quotation.structure.Quotation"), false, false) != null);
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SNodeOperations.getNodeAncestor(it, MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, "jetbrains.mps.lang.quotation.structure.Quotation"), false, false) != null);
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SNodeOperations.getNodeAncestor(it, MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x1168c104659L, "jetbrains.mps.lang.quotation.structure.Quotation"), false, false) != null);
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, "jetbrains.mps.lang.quotation.structure.NodeBuilderNode"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, 0x4bb51009d20b02b1L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1169125787135")));
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, "jetbrains.mps.lang.quotation.structure.NodeBuilderNode"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, 0x4bb51009d20b02b1L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489288299")));
        }
      }));
      SetSequence.fromSet(nodes).addSequence(CollectionSequence.fromCollection(CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, "jetbrains.mps.lang.quotation.structure.NodeBuilderNode"), false)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x3a13115c633c4c5cL, 0xbbcc75c4219e9555L, 0x4bb51009d20a4aa0L, 0x4bb51009d20b02b1L, "concept")), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), SMethodTrimmedId.create("isSubconceptOf", MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "73yVtVlWOga"), SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1071489288298")));
        }
      }));
    }
    event.getData(CommonDataKeys.PROJECT).getComponent(UsagesViewTool.class).show(FindMetaCreationCode_Action.this.convertNodes(nodes, event), "No results to show");
  }
  public SearchResults convertNodes(Set<SNode> nodes, final AnActionEvent event) {
    final SearchResults sr = new SearchResults<SNode>();
    SetSequence.fromSet(nodes).select(new ISelector<SNode, SearchResult<SNode>>() {
      public SearchResult<SNode> select(SNode node) {
        return new SearchResult<SNode>(node, node, "Usages");
      }
    }).visitAll(new IVisitor<SearchResult<SNode>>() {
      public void visit(SearchResult<SNode> it) {
        sr.add(it);
      }
    });
    return sr;
  }
}
