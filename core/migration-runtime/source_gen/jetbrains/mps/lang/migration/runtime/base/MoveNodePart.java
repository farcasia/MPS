package jetbrains.mps.lang.migration.runtime.base;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SearchScope;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.ide.findusages.model.scopes.ModulesScope;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class MoveNodePart {
  private SNodeReference myFrom;
  private SNodeReference myTo;

  public MoveNodePart(SNodeReference from, SNodeReference to) {
    myFrom = from;
    myTo = to;
  }
  public MoveNodePart(SNodeReference from) {
    myFrom = from;
  }
  public void setTo(SNodeReference to) {
    myTo = to;
  }

  public Iterable<SNodeReference> getAffectedNodes(final SearchScope searchScope, SRepository repository) {
    Iterable<SReference> references;
    SNode targetFromNode = myFrom.resolve(repository);
    {
      final SearchScope scope = CommandUtil.createScope(searchScope);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      if (targetFromNode != null) {
        references = CommandUtil.usages(CommandUtil.selectScope(null, context), targetFromNode);
      } else {
        references = CommandUtil.references(CommandUtil.selectScope(null, context));
      }
    }
    return Sequence.fromIterable(references).where(new IWhereFilter<SReference>() {
      public boolean accept(SReference it) {
        return Objects.equals(myFrom, it.getTargetNodeReference());
      }
    }).select(new ISelector<SReference, SNodeReference>() {
      public SNodeReference select(SReference it) {
        return it.getSourceNode().getReference();
      }
    }).toListSequence();
  }
  public void execute(final SModule module) {
    execute(Sequence.fromIterable(getAffectedNodes(new ModulesScope(module), module.getRepository())).select(new ISelector<SNodeReference, SNode>() {
      public SNode select(SNodeReference it) {
        return it.resolve(module.getRepository());
      }
    }));
  }
  public void execute(Iterable<SNode> nodes) {
    Sequence.fromIterable(nodes).translate(new ITranslator2<SNode, SReference>() {
      public Iterable<SReference> translate(SNode it) {
        return SNodeOperations.getReferences(it);
      }
    }).where(new IWhereFilter<SReference>() {
      public boolean accept(SReference it) {
        return Objects.equals(myFrom, it.getTargetNodeReference());
      }
    }).visitAll(new IVisitor<SReference>() {
      public void visit(SReference it) {
        updateUsage(it, myTo);
      }
    });
  }
  public void updateUsage(SReference usage, SNodeReference newReference) {
    usage.getSourceNode().setReference(usage.getLink(), jetbrains.mps.smodel.SReference.create(usage.getLink(), usage.getSourceNode(), newReference.getModelReference(), newReference.getNodeId()));
  }
  public SNodeReference getFrom() {
    return myFrom;
  }
  public SNodeReference getTo() {
    return myTo;
  }
}
