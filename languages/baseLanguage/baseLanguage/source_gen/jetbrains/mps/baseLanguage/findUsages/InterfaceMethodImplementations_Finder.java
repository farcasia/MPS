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
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration__BehaviorDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class InterfaceMethodImplementations_Finder extends GeneratedFinder {
  public InterfaceMethodImplementations_Finder() {
  }
  @Override
  public String getDescription() {
    return "Interface Method Implementations";
  }
  @Override
  public String getLongDescription() {
    return "";
  }
  @Override
  public SAbstractConcept getSConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
  }
  @Override
  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface")) && SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
  }

  @Override
  protected void doFind(SNode node, SearchScope scope, List<SNode> _results, ProgressMonitor monitor) {
    monitor.start(getDescription(), 1);
    try {
      List<SNode> implementorsAndAncestorsList = new ArrayList<SNode>();
      for (SNode implementor : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder", SNodeOperations.getParent(node), scope, monitor.subTask(1)))) {
        ListSequence.fromList(implementorsAndAncestorsList).addElement(implementor);
      }
      for (SNode classNode : ListSequence.fromList(implementorsAndAncestorsList).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"));
        }
      })) {
        for (SNode sMethod : Sequence.fromIterable(Classifier__BehaviorDescriptor.methods_id4_LVZ3pBKCn.invoke(classNode))) {
          if ((boolean) BaseMethodDeclaration__BehaviorDescriptor.hasSameSignature_idhEwIB0z.invoke(sMethod, node)) {
            ListSequence.fromList(_results).addElement(sMethod);
          }
        }
      }
    } finally {
      monitor.done();
    }
  }
  @Override
  public String getNodeCategory(SNode node) {
    return "Method Implementation";
  }

  @Nullable
  @Override
  public SNodeReference getDeclarationNode() {
    return buildNodePointer(FindUsagesDescriptor.DECLARING_MODEL, "1200425321273");
  }
}
