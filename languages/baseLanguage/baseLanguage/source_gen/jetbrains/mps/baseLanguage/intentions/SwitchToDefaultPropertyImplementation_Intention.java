package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class SwitchToDefaultPropertyImplementation_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public SwitchToDefaultPropertyImplementation_Intention() {
    super(Kind.NORMAL, true, new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "6526572214144798617"));
  }
  @Override
  public String getPresentation() {
    return "SwitchToDefaultPropertyImplementation";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation")));
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SwitchToDefaultPropertyImplementation_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Use Default Getter and Setter";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.replaceWithNewChild(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b744dafeL, 0x117b75fb65aL, "propertyImplementation")), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x117b7633177L, "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation")));
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return SwitchToDefaultPropertyImplementation_Intention.this;
    }
  }
}
