package jetbrains.mps.lang.core.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.refactoring.participant.RefactoringParticipantBase;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.refactoring.participant.RenameNodeRefactoringParticipant;
import jetbrains.mps.smodel.structure.Extension;
import jetbrains.mps.refactoring.participant.RefactoringParticipant;
import java.util.List;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.refactoring.participant.MoveNodeRefactoringParticipant;
import jetbrains.mps.refactoring.participant.RefactoringSession;
import org.jetbrains.mps.openapi.model.EditableSModel;

public class RenameReferencesParticipant extends RefactoringParticipantBase<SNodeReference, String, SNode, String> implements RenameNodeRefactoringParticipant<SNodeReference, String> {

  public static class RenameReferencesParticipant_extension extends Extension.Default<RenameNodeRefactoringParticipant<?, ?>> {
    public RenameReferencesParticipant_extension() {
      super("jetbrains.mps.refactoring.participant.RenameNodeParticipantEP");
    }
    public RenameNodeRefactoringParticipant<?, ?> get() {
      return new RenameReferencesParticipant();
    }
  }

  public static final RefactoringParticipant.Option OPTION = new RefactoringParticipant.Option("renameNode.options.renameReferences", "Update resolveInfo");
  private RefactoringParticipant.RefactoringDataCollector<SNodeReference, String, SNode, String> myDataCollector = new RefactoringParticipant.RefactoringDataCollector<SNodeReference, String, SNode, String>() {
    public SNodeReference beforeMove(SNode nodeToMove) {
      return nodeToMove.getReference();
    }
    public String afterMove(String name) {
      return name;
    }
  };
  public RefactoringParticipant.RefactoringDataCollector<SNodeReference, String, SNode, String> getDataCollector() {
    return myDataCollector;
  }
  public List<RefactoringParticipant.Option> getAvailableOptions(SNodeReference initialState, SRepository repository) {
    return ListSequence.fromListAndArray(new ArrayList<RefactoringParticipant.Option>(), OPTION);
  }

  public List<RefactoringParticipant.Change<SNodeReference, String>> getChanges(final SNodeReference initialState, SRepository repository, List<RefactoringParticipant.Option> selectedOptions, SearchScope searchScope) {
    if (!(ListSequence.fromList(selectedOptions).contains(RenameReferencesParticipant.OPTION))) {
      return ListSequence.fromList(new ArrayList<RefactoringParticipant.Change<SNodeReference, String>>());
    }
    {
      final SearchScope scope = CommandUtil.createScope(searchScope);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      final SNode movingNode = initialState.resolve(repository);
      Collection<SReference> usages;
      if (movingNode != null) {
        usages = CommandUtil.usages(CommandUtil.selectScope(null, context), movingNode);
      } else {
        usages = Sequence.fromIterable(CommandUtil.references(CommandUtil.selectScope(null, context))).where(new IWhereFilter<SReference>() {
          public boolean accept(SReference it) {
            return Objects.equals(it.getTargetNodeReference(), initialState);
          }
        }).toListSequence();
      }
      return CollectionSequence.fromCollection(usages).select(new ISelector<SReference, RefactoringParticipant.Change<SNodeReference, String>>() {
        public RefactoringParticipant.Change<SNodeReference, String> select(SReference ref) {
          final SNodeReference containingNode = ref.getSourceNode().getReference();
          final SReferenceLink role = ref.getLink();
          final SearchResults searchResults = new SearchResults(SetSequence.fromSetAndArray(new HashSet<SNode>(), movingNode), ListSequence.fromListAndArray(new ArrayList<SearchResult<SNode>>(), new SearchResult<SNode>(ref.getSourceNode(), "reference")));
          RefactoringParticipant.Change<SNodeReference, String> change = new MoveNodeRefactoringParticipant.ChangeBase<SNodeReference, String>() {
            public SearchResults getSearchResults() {
              return searchResults;
            }
            public void confirm(final String finalState, final SRepository repository, RefactoringSession refactoringSession) {
              refactoringSession.registerChange(new Runnable() {
                public void run() {
                  SNode node = containingNode.resolve(repository);
                  if (node == null) {
                    return;
                  }
                  if (node.getModel() instanceof EditableSModel && node.getReference(role) instanceof jetbrains.mps.smodel.SReference) {
                    ((jetbrains.mps.smodel.SReference) node.getReference(role)).setResolveInfo(finalState);
                    as_xv67ae_a0a1a2a0a0a0a0a1a0a0d0a0a0a0a5a1a8(node.getModel(), EditableSModel.class).setChanged(true);
                  }
                }
              });
            }
          };
          return change;
        }
      }).toListSequence();
    }
  }
  private static <T> T as_xv67ae_a0a1a2a0a0a0a0a1a0a0d0a0a0a0a5a1a8(Object o, Class<T> type) {
    return (type.isInstance(o) ? (T) o : null);
  }
}
