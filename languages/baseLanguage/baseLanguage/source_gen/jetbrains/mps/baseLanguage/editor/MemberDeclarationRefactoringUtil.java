package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class MemberDeclarationRefactoringUtil {

  public static void rewireMethodReferences(final SNode originalMethod, final SNode replacingMethod) {
    Iterable<SNode> refs = ListSequence.fromList(SNodeOperations.getNodeDescendants(SNodeOperations.getContainingRoot(replacingMethod), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, "jetbrains.mps.baseLanguage.structure.IMethodCall"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Objects.equals(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")), originalMethod);
      }
    });
    Sequence.fromIterable(refs).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        SLinkOperations.setTarget(it, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), replacingMethod);
      }
    });
  }

  public static void rewireFieldReferences(final SNode originalField, final SNode replacingField) {
    Iterable<SNode> refs = ListSequence.fromList(SNodeOperations.getNodeDescendants(SNodeOperations.getContainingRoot(replacingField), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Objects.equals(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), originalField);
      }
    });
    Sequence.fromIterable(refs).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        SLinkOperations.setTarget(it, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), replacingField);
      }
    });
  }
}
