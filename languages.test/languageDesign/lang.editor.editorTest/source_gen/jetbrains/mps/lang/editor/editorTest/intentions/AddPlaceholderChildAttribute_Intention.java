package jetbrains.mps.lang.editor.editorTest.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class AddPlaceholderChildAttribute_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public AddPlaceholderChildAttribute_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:aaff0f7f-e57d-4430-aea6-ff86ed5c75ae(jetbrains.mps.lang.editor.editorTest.intentions)", "3766420342434505259"));
  }
  @Override
  public String getPresentation() {
    return "AddPlaceholderChildAttribute";
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
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddPlaceholderChildAttribute_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x34450358999d2201L, "jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute"))) == null)) {
        return "Add Attribute";
      } else {
        return "Remove Attribute";
      }
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x34450358999d2201L, "jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute"))) == null)) {
        AttributeOperations.createAndSetAttrbiute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x34450358999d2201L, "jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute")), MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x34450358999d2201L, "jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute"));
      } else {
        SNodeOperations.deleteNode(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x81f0abb8d71e4d13L, 0xa0c1d2291fbb28b7L, 0x34450358999d2201L, "jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute"))));
      }
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return AddPlaceholderChildAttribute_Intention.this;
    }
  }
}
