package jetbrains.mps.lang.access.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class SurroundWithExecuteLightweightCommandStatement_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public SurroundWithExecuteLightweightCommandStatement_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:4df57e9b-2a09-44c7-b16d-4af6620e3aaa(jetbrains.mps.lang.access.intentions)", "1616052750811363739"));
  }
  @Override
  public String getPresentation() {
    return "SurroundWithExecuteLightweightCommandStatement";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return true;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SurroundWithExecuteLightweightCommandStatement_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Read Action";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode readActionStatement = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x63650c5916c8498aL, 0x99c8005c7ee9515dL, 0x7c8b08a50a3ea215L, "jetbrains.mps.lang.access.structure.ExecuteLightweightCommandStatement")), null);
      List<SNode> selectedNodes = editorContext.getSelectedNodes();
      SNodeOperations.insertNextSiblingChild(node, readActionStatement);
      for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
        ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(readActionStatement, MetaAdapterFactory.getContainmentLink(0x63650c5916c8498aL, 0x99c8005c7ee9515dL, 0x7c8b08a50a3ea20aL, 0x7c8b08a50a3ea20bL, "commandClosureLiteral")), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf0522fL, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(SNodeOperations.getNodeAncestor(selectedNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), true, false));
      }
      editorContext.select(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(readActionStatement, MetaAdapterFactory.getContainmentLink(0x63650c5916c8498aL, 0x99c8005c7ee9515dL, 0x7c8b08a50a3ea20aL, 0x7c8b08a50a3ea20bL, "commandClosureLiteral")), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf0522fL, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).first());
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return SurroundWithExecuteLightweightCommandStatement_Intention.this;
    }
  }
}
