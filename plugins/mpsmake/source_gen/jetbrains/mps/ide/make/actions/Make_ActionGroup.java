package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.plugins.actions.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;

public class Make_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.ide.make.actions.Make_ActionGroup";
  public static final String LABEL_ID_preview = ID + "preview";
  public Make_ActionGroup() {
    super("Make", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    Make_ActionGroup.this.addParameterizedAction(new MakeSelection_Action(false), PluginId.getId("jetbrains.mps.ide.make"), false);
    Make_ActionGroup.this.addParameterizedAction(new MakeSelection_Action(true), PluginId.getId("jetbrains.mps.ide.make"), true);
    {
      LabelledAnchor action = new LabelledAnchor(Make_ActionGroup.LABEL_ID_preview);
      ActionManagerEx manager = ActionManagerEx.getInstanceEx();
      manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide.make"));
      Make_ActionGroup.this.addAction(action);
    }
  }
}
