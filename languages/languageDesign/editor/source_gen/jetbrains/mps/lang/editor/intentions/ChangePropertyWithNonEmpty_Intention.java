package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class ChangePropertyWithNonEmpty_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public ChangePropertyWithNonEmpty_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:00000000-0000-4000-0000-011c8959029b(jetbrains.mps.lang.editor.intentions)", "5137527105084909325"));
  }
  @Override
  public String getPresentation() {
    return "ChangePropertyWithNonEmpty";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(node)), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb02612eL, "jetbrains.mps.lang.editor.structure.CellModel_Property"));
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new ChangePropertyWithNonEmpty_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Replace Property by Non Empty Property";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode nonEmpty = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x113bef3a464L, "jetbrains.mps.lang.editor.structure.CellModel_NonEmptyProperty")), node);
      SLinkOperations.setTarget(nonEmpty, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"), SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration")));
      SLinkOperations.setTarget(node, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"), null);
      for (SNode child : ListSequence.fromList(jetbrains.mps.util.SNodeOperations.getChildren(node))) {
        SContainmentLink role = child.getContainmentLink();
        node.removeChild(child);
        nonEmpty.addChild(role, child);
      }
      for (SProperty p : Sequence.fromIterable(node.getProperties())) {
        SNodeAccessUtil.setProperty(nonEmpty, p, node.getProperty(p));
      }
      for (SReference reference : Sequence.fromIterable(node.getReferences())) {
        nonEmpty.setReference(reference.getLink(), reference);
      }
      SNodeOperations.replaceWithAnother(node, nonEmpty);
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return ChangePropertyWithNonEmpty_Intention.this;
    }
  }
}
