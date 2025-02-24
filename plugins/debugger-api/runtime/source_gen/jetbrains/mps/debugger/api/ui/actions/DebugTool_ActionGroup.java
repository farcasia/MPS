package jetbrains.mps.debugger.api.ui.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import jetbrains.mps.plugins.actions.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class DebugTool_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.debugger.api.ui.actions.DebugTool_ActionGroup";
  public static final String LABEL_ID_StopAction = ID + "StopAction";
  public static final String LABEL_ID_MuteAction = ID + "MuteAction";
  public DebugTool_ActionGroup() {
    super("DebugTool", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    DebugTool_ActionGroup.this.addSeparator();
    DebugTool_ActionGroup.this.addAction("jetbrains.mps.debugger.api.ui.actions.Resume_Action");
    DebugTool_ActionGroup.this.addAction("jetbrains.mps.debugger.api.ui.actions.Pause_Action");
    {
      LabelledAnchor action = new LabelledAnchor(DebugTool_ActionGroup.LABEL_ID_StopAction);
      ActionManagerEx manager = ActionManagerEx.getInstanceEx();
      manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.debugger.api.runtime"));
      DebugTool_ActionGroup.this.addAction(action);
    }
    DebugTool_ActionGroup.this.addSeparator();
    DebugTool_ActionGroup.this.addAction("jetbrains.mps.debugger.api.ui.actions.EvaluateExpression_Action");
    DebugTool_ActionGroup.this.addAction("jetbrains.mps.debugger.api.ui.actions.ExportThreads_Action");
    DebugTool_ActionGroup.this.addAction("jetbrains.mps.debugger.api.ui.actions.ViewBreakpoints_Action");
    {
      LabelledAnchor action = new LabelledAnchor(DebugTool_ActionGroup.LABEL_ID_MuteAction);
      ActionManagerEx manager = ActionManagerEx.getInstanceEx();
      manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.debugger.api.runtime"));
      DebugTool_ActionGroup.this.addAction(action);
    }
    DebugTool_ActionGroup.this.addSeparator();
  }
}
