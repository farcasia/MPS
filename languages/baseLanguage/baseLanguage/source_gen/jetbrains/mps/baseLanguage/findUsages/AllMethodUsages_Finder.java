package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.module.SearchScope;
import java.util.List;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.ide.findusages.view.FindUtils;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.progress.EmptyProgressMonitor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class AllMethodUsages_Finder extends GeneratedFinder {
  public AllMethodUsages_Finder() {
  }
  @Override
  public String getDescription() {
    return "All Method Usages";
  }
  @Override
  public String getLongDescription() {
    return "Usages of this method, overriding methods and implementing methods";
  }
  @Override
  public SAbstractConcept getSConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
  }
  @Override
  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false, false) == null && SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface"), false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf0aL, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"))) && !(SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")))) {
      return false;
    }
    return true;
  }

  @Override
  protected void doFind(SNode node, SearchScope scope, List<SNode> _results, ProgressMonitor monitor) {
    try {
      monitor.start("All method usages", 10);
      List<SNode> methodDeclarations;
      if (SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false, false) != null) {
        if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
          methodDeclarations = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", node, scope, monitor.subTask(1));
        } else {
          methodDeclarations = new ArrayList<SNode>();
        }
      } else {
        methodDeclarations = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder", node, scope, monitor.subTask(1));
      }
      ListSequence.fromList(methodDeclarations).addElement(node);

      ProgressMonitor sm = monitor.subTask(9);
      try {
        sm.start("", ListSequence.fromList(methodDeclarations).count());
        for (SNode methodDeclaration : methodDeclarations) {
          for (SNode nodeUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", methodDeclaration, scope, sm.subTask(1)))) {
            if (!(SNodeOperations.isInstanceOf(nodeUsage, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall")))) {
              continue;
            }
            ListSequence.fromList(_results).addElement(nodeUsage);
          }
        }
      } finally {
        sm.done();
      }
    } finally {
      monitor.done();
    }
  }
  @Override
  public void getSearchedNodes(SNode node, SearchScope scope, List<SNode> _results) {
    List<SNode> methodDeclarations = new ArrayList<SNode>();
    if (SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false, false) != null) {
      if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
        ListSequence.fromList(methodDeclarations).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", node, scope, new EmptyProgressMonitor())));
      }
      ListSequence.fromList(methodDeclarations).addElement(node);
    } else {
      ListSequence.fromList(methodDeclarations).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder", node, scope, new EmptyProgressMonitor())));
    }
    // 
    for (SNode methodDeclaration : methodDeclarations) {
      ListSequence.fromList(_results).addElement(methodDeclaration);
    }
  }
  @Override
  public String getNodeCategory(SNode node) {
    return "Overriden And Implemented methods";
  }

  @Nullable
  @Override
  public SNodeReference getDeclarationNode() {
    return buildNodePointer(FindUsagesDescriptor.DECLARING_MODEL, "1200317943493");
  }
}
