package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.plugin.behavior.KeyMapKeystroke__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_KeyMapKeystrokeRemRepl_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_KeyMapKeystrokeRemRepl_NonTypesystemRule() {
  }
  public void applyRule(final SNode keyMapKeystroke, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode simpleShortcutChange = SNodeOperations.getNodeAncestor(keyMapKeystroke, MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x15afe07f2a9bb076L, "jetbrains.mps.lang.plugin.structure.SimpleShortcutChange"), false, false);
    if ((simpleShortcutChange == null) || !((boolean) KeyMapKeystroke__BehaviorDescriptor.hasRemove_id4qYinf8$eal.invoke(keyMapKeystroke))) {
      return;
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(simpleShortcutChange, MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x15afe07f2a9bb076L, 0x15afe07f2a9bb07eL, "keystroke"))).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (boolean) KeyMapKeystroke__BehaviorDescriptor.hasReplaceAll_id4qYinf8$enm.invoke(it);
      }
    })) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(keyMapKeystroke, "Adding 'remove' modificator for action is redundant if there is other action with 'replace all' modificator", "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "5097592589863133346", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11919c665d4L, "jetbrains.mps.lang.plugin.structure.KeyMapKeystroke");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
