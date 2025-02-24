package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.editor.behavior.IExtensibleTransformationMenuPart__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class fix_MissingFeaturesForOneLocation_QuickFix extends QuickFix_Runtime {
  public fix_MissingFeaturesForOneLocation_QuickFix() {
    super(new SNodePointer("r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "5126791860785760389"));
  }
  public String getDescription(SNode node) {
    return "Add missing features";
  }
  public void execute(SNode node) {
    SNode part = SNodeOperations.cast(node, MetaAdapterFactory.getInterfaceConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x652f322a364c9a28L, "jetbrains.mps.lang.editor.structure.IExtensibleTransformationMenuPart"));

    for (SConcept c : Sequence.fromIterable(IExtensibleTransformationMenuPart__BehaviorDescriptor.getMissingFeatures_id6kJcyCQjeiA.invoke(part))) {
      ListSequence.fromList(SLinkOperations.getChildren(part, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x652f322a364c9a28L, 0x7c45559defbb3517L, "features"))).addElement(SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(c), null));
    }
  }
}
