package jetbrains.mps.console.actions.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.generator.GenerationFacade;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SModelName;
import jetbrains.mps.console.tool.ConsoleTool;
import java.awt.event.InputEvent;

public class ShowGenerationPlan_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowGenerationPlan_Action() {
    super("Show Generation Plan", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    // I'd love to update presentation to reflect alternative action with keyboard modifier, but IDEA 
    // doesn't update action on key pressed once menu is visible, and doesn't pass initial modifiers, 
    // see com.intellij.openapi.actionSystem.impl.Util#expandActionGroup:135 (always 0). 
    return GenerationFacade.canGenerate(event.getData(MPSCommonDataKeys.MODEL));
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
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    {
      SModel p = event.getData(MPSCommonDataKeys.MODEL);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    final boolean alternative = ShowGenerationPlan_Action.this.isIgnoreExternalPlan(event, event);
    SNode command = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, "jetbrains.mps.console.ideCommands.structure.ShowGenPlan"));
    SPropertyOperations.set(command, MetaAdapterFactory.getProperty(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x2c510b378f8ce5ddL, "ignoreExternalPlan"), "" + (alternative));
    SLinkOperations.setTarget(command, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x61f2dd6de47f867aL, "targetModel"), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x6c8954f469900928L, "jetbrains.mps.console.ideCommands.structure.ModelReference")));
    SModelName name = event.getData(MPSCommonDataKeys.MODEL).getName();
    SPropertyOperations.set(SLinkOperations.getTarget(command, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x61f2dd6de47f867aL, "targetModel")), MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x7c3f2da20e92b62L, 0x7c3f2da20e92b66L, "name"), name.getLongName());
    SPropertyOperations.set(SLinkOperations.getTarget(command, MetaAdapterFactory.getContainmentLink(0xa5e4de5346a344daL, 0xaab368fdf1c34ed0L, 0x61f2dd6de47f85e4L, 0x61f2dd6de47f867aL, "targetModel")), MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x7c3f2da20e92b62L, 0x7c3f2da20e93b6fL, "stereotype"), name.getStereotype());
    event.getData(MPSCommonDataKeys.MPS_PROJECT).getProject().getComponent(ConsoleTool.class).executeCommand(command);
  }
  /*package*/ boolean isIgnoreExternalPlan(AnActionEvent evt, final AnActionEvent event) {
    if (evt.getInputEvent() != null && evt.getInputEvent().isAltDown()) {
      return true;
    }
    return (evt.getModifiers() & (InputEvent.ALT_DOWN_MASK | InputEvent.ALT_MASK)) != 0;
  }
}
