package refactoring.test.test;

/*Generated by MPS */

import jetbrains.mps.refactoring.participant.RefactoringUI;
import java.util.List;
import jetbrains.mps.refactoring.participant.RefactoringParticipant;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchTask;
import jetbrains.mps.refactoring.participant.RefactoringSession;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import junit.framework.Assert;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;

public class HeadlessRefactoringUI implements RefactoringUI {
  private List<RefactoringParticipant.Option> myOptions;
  public HeadlessRefactoringUI(List<RefactoringParticipant.Option> options) {
    myOptions = options;
  }
  public List<RefactoringParticipant.Option> getOptions() {
    return myOptions;
  }
  @Override
  public void prepare(Runnable task) {
    task.run();
  }
  @Override
  public List<RefactoringParticipant.Option> selectParticipants(List<RefactoringParticipant.Option> options) {
    return getOptions();
  }
  @Override
  public void runSearch(final _FunctionTypes._void_P1_E0<? super ProgressMonitor> task) {
    task.invoke(new EmptyProgressMonitor());
  }
  @Override
  public void showRefactoringView(final Runnable task, String refactoringName, SearchResults searchResults, SearchTask searchTask, RefactoringSession session) {
    task.run();
  }

  public static class OptionsChecker extends HeadlessRefactoringUI {
    public OptionsChecker(List<RefactoringParticipant.Option> options) {
      super(options);
    }
    @Override
    public List<RefactoringParticipant.Option> selectParticipants(List<RefactoringParticipant.Option> options) {
      for (RefactoringParticipant.Option option : ListSequence.fromList(getOptions())) {
        Assert.assertTrue("Option " + option.getId() + " is expected but was not shown.", ListSequence.fromList(options).contains(option));
      }
      for (RefactoringParticipant.Option option : ListSequence.fromList(options)) {
        Assert.assertTrue("Option " + option.getId() + " was shown but is not expected.", ListSequence.fromList(getOptions()).contains(option));
      }

      // this stops the process 
      return null;
    }
    @Override
    public void runSearch(final _FunctionTypes._void_P1_E0<? super ProgressMonitor> task) {
      // do nothing 
    }
    @Override
    public void showRefactoringView(final Runnable task, String refactoringName, SearchResults searchResults, SearchTask searchTask, RefactoringSession session) {
      // do nothing, no need to perform refactoring 
    }
  }

  public static class SearchResultsChecker extends HeadlessRefactoringUI {
    private Set<SNode> myExpectedResults;
    private Set<SNode> mySearchedNodes;
    public SearchResultsChecker(List<RefactoringParticipant.Option> options, List<SNode> searchedNodes, List<SNode> expectedResults) {
      super(options);
      myExpectedResults = SetSequence.fromSetWithValues(new HashSet<SNode>(), expectedResults);
      mySearchedNodes = SetSequence.fromSetWithValues(new HashSet<SNode>(), searchedNodes);
    }
    @Override
    public void showRefactoringView(final Runnable task, String refactoringName, SearchResults searchResults, SearchTask searchTask, RefactoringSession session) {
      Set<SNode> shownResults = (Set<SNode>) searchResults.getResultObjects();
      for (SNode result : SetSequence.fromSet(myExpectedResults)) {
        Assert.assertTrue("SearchResult " + idString(result) + " is expected but was not shown.", SetSequence.fromSet(shownResults).contains(result));
      }
      for (SNode result : SetSequence.fromSet(shownResults)) {
        Assert.assertTrue("SearchResult " + idString(result) + " was shown but is not expected.", SetSequence.fromSet(myExpectedResults).contains(result));
      }
      for (SNode node : SetSequence.fromSet(mySearchedNodes)) {
        Assert.assertTrue("SearchNode " + idString(node) + " is expected but was not shown.", searchResults.getSearchedNodes().contains(node));
      }
      for (Object node : searchResults.getSearchedNodes()) {
        Assert.assertTrue("SearchNode " + idString((SNode) node) + " was shown but is not expected.", SetSequence.fromSet(mySearchedNodes).contains((SNode) node));
      }
      // do nothing, this in fact stops the process 
    }
    private String idString(SNode n) {
      return n.getReference().toString() + "(" + n + ")";
    }
  }
}
