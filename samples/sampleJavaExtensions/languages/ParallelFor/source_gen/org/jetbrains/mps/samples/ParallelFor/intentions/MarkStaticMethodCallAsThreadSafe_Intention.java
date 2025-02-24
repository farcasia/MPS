package org.jetbrains.mps.samples.ParallelFor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class MarkStaticMethodCallAsThreadSafe_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public MarkStaticMethodCallAsThreadSafe_Intention() {
    super(Kind.NORMAL, true, new SNodePointer("r:2614090b-4018-4457-8ad5-c503bc8936fb(org.jetbrains.mps.samples.ParallelFor.intentions)", "5384012304952498864"));
  }
  @Override
  public String getPresentation() {
    return "MarkStaticMethodCallAsThreadSafe";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    if (editorContext.getSelectedNode() != node && !(isVisibleInChild(node, editorContext.getSelectedNode(), editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x294c1cd4b84332e6L, "org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe"))) == null;
  }
  private boolean isVisibleInChild(final SNode node, final SNode childNode, final EditorContext editorContext) {
    return SNodeOperations.getParent(childNode) == node;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new MarkStaticMethodCallAsThreadSafe_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Mark as Thread Safe";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x294c1cd4b84332e6L, "org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe")), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xcb7388e8f1824cdaL, 0xbd839796e8634856L, 0x294c1cd4b84332e6L, "org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe")), null));
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return MarkStaticMethodCallAsThreadSafe_Intention.this;
    }
  }
}
