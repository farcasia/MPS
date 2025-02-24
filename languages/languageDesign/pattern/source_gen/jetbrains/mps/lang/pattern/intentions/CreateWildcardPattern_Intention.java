package jetbrains.mps.lang.pattern.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.pattern.editor.PatternAddingUtil;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class CreateWildcardPattern_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public CreateWildcardPattern_Intention() {
    super(Kind.NORMAL, true, new SNodePointer("r:00000000-0000-4000-0000-011c89590344(jetbrains.mps.lang.pattern.intentions)", "3514655265371789444"));
  }
  @Override
  public String getPresentation() {
    return "CreateWildcardPattern";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return PatternAddingUtil.isPatternApplicable(editorContext);
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new CreateWildcardPattern_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Create Wildcard";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode currentNode = editorContext.getSelectedNode();
      SNodeFactoryOperations.setNewAttribute(currentNode, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb478fL, "jetbrains.mps.lang.pattern.structure.Pattern")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb4797L, "jetbrains.mps.lang.pattern.structure.WildcardPattern")));
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return CreateWildcardPattern_Intention.this;
    }
  }
}
