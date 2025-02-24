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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.progress.EmptyProgressMonitor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class ParameterUsages_Finder extends GeneratedFinder {
  public ParameterUsages_Finder() {
  }
  @Override
  public String getDescription() {
    return "Parameter Usages";
  }
  @Override
  public String getLongDescription() {
    return "";
  }
  @Override
  public SAbstractConcept getSConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
  }
  @Override
  public boolean isApplicable(SNode node) {
    return (SNodeOperations.getNodeAncestorWhereConceptInList(node, new SAbstractConcept[]{MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf0aL, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")}, false, false) != null);
  }

  @Override
  protected void doFind(SNode node, SearchScope scope, List<SNode> _results, ProgressMonitor monitor) {
    monitor.start(getDescription(), 2);
    try {
      SNode nodeParentMethod = SNodeOperations.getNodeAncestorWhereConceptInList(node, new SAbstractConcept[]{MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf0aL, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")}, false, false);
      // 
      List<SNode> overridingMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, monitor.subTask(1));
      ListSequence.fromList(overridingMethods).addElement(nodeParentMethod);
      // 
      for (SNode methodNode : ListSequence.fromList(overridingMethods)) {
        SNode parameterNode = ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(methodNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"))).getElement(SNodeOperations.getIndexInParent(node));
        for (SNode parameterUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", parameterNode, scope, monitor.subTask(1)))) {
          ListSequence.fromList(_results).addElement(parameterUsage);
        }
      }
    } finally {
      monitor.done();
    }
  }
  @Override
  public void getSearchedNodes(SNode node, SearchScope scope, List<SNode> _results) {
    SNode nodeParentMethod = SNodeOperations.getNodeAncestorWhereConceptInList(node, new SAbstractConcept[]{MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf0aL, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")}, false, false);
    // 
    List<SNode> overridingMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, new EmptyProgressMonitor());
    ListSequence.fromList(overridingMethods).addElement(nodeParentMethod);
    // 
    for (SNode methodNode : ListSequence.fromList(overridingMethods)) {
      ListSequence.fromList(_results).addElement(ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(methodNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"))).getElement(SNodeOperations.getIndexInParent(node)));
    }
  }
  @Override
  public String getNodeCategory(SNode node) {
    return "Parameter Usages";
  }

  @Nullable
  @Override
  public SNodeReference getDeclarationNode() {
    return buildNodePointer(FindUsagesDescriptor.DECLARING_MODEL, "1201091722183");
  }
}
