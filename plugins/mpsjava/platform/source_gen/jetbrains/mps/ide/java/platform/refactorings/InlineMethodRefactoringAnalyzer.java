package jetbrains.mps.ide.java.platform.refactorings;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.ide.findusages.model.SearchResults;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import java.util.List;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodRefactoringUtils;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.InlineMethodRefactoring;

/*package*/ class InlineMethodRefactoringAnalyzer {
  private SNode myCall;
  private SNode myMethod;
  public InlineMethodRefactoringAnalyzer(SNode call, SNode method) {
    this.myCall = call;
    this.myMethod = method;
  }
  public void appendProblems(SearchScope scope, SearchResults<SNode> usages, StringBuilder errors, ProgressMonitor progressMonitor) {
    List<SNode> myOverriding = MethodRefactoringUtils.findOverridingMethods(scope, myMethod, progressMonitor);
    errors.append(getOverridingErrors(myOverriding));
    if (usages != null) {
      for (SearchResult<SNode> res : ListSequence.fromList(usages.getSearchResults())) {
        appendRefactoringProblems(res.getObject(), errors);
      }
    } else {
      appendRefactoringProblems(myCall, errors);
    }
  }
  private String getOverridingErrors(List<SNode> overridingMethods) {
    StringBuffer errors = new StringBuffer();
    if (overridingMethods != null && ListSequence.fromList(overridingMethods).isNotEmpty()) {
      errors.append("Inlined method overriden by this methods: ");
      for (SNode methodDeclaration : ListSequence.fromList(overridingMethods)) {
        errors.append(" ").append(SNodeOperations.getParent(methodDeclaration)).append(".").append(methodDeclaration);
      }
      errors.append(".\n");
    }
    return errors.toString();
  }
  private static void appendRefactoringProblems(SNode node, StringBuilder errors) {
    InlineMethodRefactoring ref = new InlineMethodRefactoring(node);
    errors.append(ref.getProblems());
  }
}
