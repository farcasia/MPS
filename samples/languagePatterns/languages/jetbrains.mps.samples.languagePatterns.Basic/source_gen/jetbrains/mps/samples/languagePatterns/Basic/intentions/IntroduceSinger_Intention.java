package jetbrains.mps.samples.languagePatterns.Basic.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class IntroduceSinger_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public IntroduceSinger_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:c5491b56-9eb5-4130-90fd-7da3cef76a4e(jetbrains.mps.samples.languagePatterns.Basic.intentions)", "6918512748467657857"));
  }
  @Override
  public String getPresentation() {
    return "IntroduceSinger";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return editorContext.getSelectedCell() instanceof EditorCell_Error && isNotEmptyString(((EditorCell_Error) editorContext.getSelectedCell()).getText());
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IntroduceSinger_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Introduce Singer";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      EditorCell_Error selectedCell = (EditorCell_Error) editorContext.getSelectedCell();
      String text = selectedCell.getText();
      SNode concert = SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x34c8853ae7895c45L, "jetbrains.mps.samples.languagePatterns.Basic.structure.Concert"), false, false);
      SNode singer = SNodeFactoryOperations.addNewChild(concert, MetaAdapterFactory.getContainmentLink(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x34c8853ae7895c45L, 0x34c8853ae7895c8bL, "performers"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x34c8853ae7895c8dL, "jetbrains.mps.samples.languagePatterns.Basic.structure.Singer")));
      SPropertyOperations.set(singer, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), text);
      SNode performance = SNodeFactoryOperations.replaceWithNewChild(node, SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x34c8853ae7895ce1L, "jetbrains.mps.samples.languagePatterns.Basic.structure.Performance")));
      SLinkOperations.setTarget(performance, MetaAdapterFactory.getReferenceLink(0x7a6f7ef73988464bL, 0x8cc51182671c136eL, 0x34c8853ae7895ce1L, 0x34c8853ae7895ce2L, "singer"), singer);
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return IntroduceSinger_Intention.this;
    }
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
