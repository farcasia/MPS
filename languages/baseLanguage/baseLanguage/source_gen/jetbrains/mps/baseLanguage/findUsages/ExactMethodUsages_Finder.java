package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.module.SearchScope;
import java.util.List;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodCallAdapter;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class ExactMethodUsages_Finder extends GeneratedFinder {
  public ExactMethodUsages_Finder() {
  }
  @Override
  public boolean isUsedByDefault(SNode node) {
    return SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
  }
  @Override
  public String getDescription() {
    return "Exact Method Usages";
  }
  @Override
  public String getLongDescription() {
    return "Usages of exactly this method, not including usages of overriding methods";
  }
  @Override
  public SAbstractConcept getSConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
  }
  @Override
  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
  }

  @Override
  protected void doFind(SNode node, SearchScope scope, List<SNode> _results, ProgressMonitor monitor) {
    monitor.start(getDescription(), 1);
    try {
      for (SNode nodeUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", node, scope, monitor.subTask(1)))) {
        if (MethodCallAdapter.isMethodCall(nodeUsage)) {
          if (new MethodCallAdapter(nodeUsage).getMethodDeclaration() == node) {
            ListSequence.fromList(_results).addElement(nodeUsage);
          }
        }
      }
    } finally {
      monitor.done();
    }
  }
  @Override
  public String getNodeCategory(SNode node) {
    return "Exact Method Usages";
  }

  @Nullable
  @Override
  public SNodeReference getDeclarationNode() {
    return buildNodePointer(FindUsagesDescriptor.DECLARING_MODEL, "1227527031007");
  }
}
