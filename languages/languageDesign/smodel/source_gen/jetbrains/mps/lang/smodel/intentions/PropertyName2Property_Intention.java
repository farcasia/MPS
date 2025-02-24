package jetbrains.mps.lang.smodel.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class PropertyName2Property_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public PropertyName2Property_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:00000000-0000-4000-0000-011c895902ff(jetbrains.mps.lang.smodel.intentions)", "6369157954018134381"));
  }
  @Override
  public String getPresentation() {
    return "PropertyName2Property";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new PropertyName2Property_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Convert to property<...>";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode repl = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce1a42fa0L, "jetbrains.mps.lang.smodel.structure.PropertyIdRefExpression"));
      SLinkOperations.setTarget(repl, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce1a42fa0L, 0x24b2bf7ce1a42fa1L, "conceptDeclaration"), SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x48e6e269518c89f7L, 0x48e6e269518c89f8L, "conceptDeclaration")));
      SLinkOperations.setTarget(repl, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce1a42fa0L, 0x24b2bf7ce1a42fa2L, "propertyDeclaration"), SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x48e6e269518c89f7L, 0x48e6e269518c89f9L, "propertyDeclaration")));
      SNodeOperations.replaceWithAnother(node, repl);
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return PropertyName2Property_Intention.this;
    }
  }
}
