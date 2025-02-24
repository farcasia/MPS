package jetbrains.mps.ide.platform.actions.core;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import com.intellij.featureStatistics.FeatureUsageTracker;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.JOptionPane;
import jetbrains.mps.ide.platform.refactoring.RenameDialog;
import jetbrains.mps.refactoring.participant.RefactoringParticipant;
import jetbrains.mps.smodel.structure.ExtensionPoint;
import jetbrains.mps.refactoring.participant.RenameNodeRefactoringParticipant;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.refactoring.participant.RefactoringSession;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import org.apache.log4j.Level;

public class Rename_Action extends BaseAction {
  private static final Logger LOG = LogManager.getLogger(Rename_Action.class);
  private static final Icon ICON = null;

  public Rename_Action() {
    super("Rename", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return RefactoringUtil.isApplicable(RefactoringUtil.getRefactoringByClassName("jetbrains.mps.lang.core.refactorings" + "." + "Rename"), ((SNode) MapSequence.fromMap(_params).get("target")));
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    this.setEnabledState(event.getPresentation(), this.isApplicable(event, _params));
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null && !(SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, "jetbrains.mps.lang.core.structure.INamedConcept")))) {
        node = null;
      }
      MapSequence.fromMap(_params).put("target", node);
      if (node == null) {
        return false;
      }
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      MapSequence.fromMap(_params).put("project", p);
      if (p == null) {
        return false;
      }
    }
    {
      Frame p = event.getData(MPSCommonDataKeys.FRAME);
      MapSequence.fromMap(_params).put("frame", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    FeatureUsageTracker.getInstance().triggerFeatureUsed("refactoring.rename");

    final Wrappers._T<String> oldName = new Wrappers._T<String>();
    final Wrappers._boolean canBeRenamed = new Wrappers._boolean();
    ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        canBeRenamed.value = Rename_Action.this.canBeRenamed(_params);
        oldName.value = SPropertyOperations.getString(((SNode) MapSequence.fromMap(_params).get("target")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    });
    if (!(canBeRenamed.value)) {
      JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "Nodes with getter and without setter for the \"name\" property can't be renamed", "Read-only property", JOptionPane.INFORMATION_MESSAGE);
      return;
    }
    final String newName = RenameDialog.getNewName(((MPSProject) MapSequence.fromMap(_params).get("project")).getProject(), oldName.value, "node");
    if (newName == null) {
      return;
    }

    Iterable<? extends RefactoringParticipant<?, ?, SNode, String>> participants = new ExtensionPoint<RenameNodeRefactoringParticipant<?, ?>>("jetbrains.mps.refactoring.participant.RenameNodeParticipantEP").getObjects();
    RefactoringProcessor.performRefactoringUserInteractive(((MPSProject) MapSequence.fromMap(_params).get("project")), "Rename node", participants, ListSequence.fromListAndArray(new ArrayList<SNode>(), ((SNode) MapSequence.fromMap(_params).get("target"))), new _FunctionTypes._return_P2_E0<Map<SNode, String>, Iterable<RefactoringParticipant.ParticipantApplied<?, ?, SNode, String, SNode, String>>, RefactoringSession>() {
      public Map<SNode, String> invoke(Iterable<RefactoringParticipant.ParticipantApplied<?, ?, SNode, String, SNode, String>> changes, RefactoringSession refactoringSession) {
        SPropertyOperations.set(((SNode) MapSequence.fromMap(_params).get("target")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), newName);
        Map<SNode, String> m = MapSequence.<SNode, String>fromMapAndKeysArray(new HashMap<SNode, String>(), ((SNode) MapSequence.fromMap(_params).get("target"))).withValues(newName);
        return m;
      }
    });
  }
  private boolean canBeRenamed(final Map<String, Object> _params) {
    // we won't rename nodes, for which there is getter without setter 
    SAbstractConcept concept = SNodeOperations.getConcept(((SNode) MapSequence.fromMap(_params).get("target")));
    ConstraintsDescriptor cd = ConceptRegistry.getInstance().getConstraintsDescriptor(concept);
    PropertyConstraintsDescriptor propertyConstraint = cd.getProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    if (propertyConstraint == null) {
      if (LOG.isEnabledFor(Level.ERROR)) {
        LOG.error("Missing constraints descriptor for property INamedConcept.name for concept:" + concept);
      }
      return false;
    }
    return !(propertyConstraint.isReadOnly());
  }
}
