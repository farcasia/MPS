package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import jetbrains.mps.plugins.actions.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class CreateRootNode_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.CreateRootNode_ActionGroup";
  public static final String LABEL_ID_mainRoot = ID + "mainRoot";
  public static final String LABEL_ID_newRoot = ID + "newRoot";
  public CreateRootNode_ActionGroup() {
    super("CreateRootNode", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    {
      LabelledAnchor action = new LabelledAnchor(CreateRootNode_ActionGroup.LABEL_ID_mainRoot);
      ActionManagerEx manager = ActionManagerEx.getInstanceEx();
      manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
      CreateRootNode_ActionGroup.this.addAction(action);
    }
    {
      LabelledAnchor action = new LabelledAnchor(CreateRootNode_ActionGroup.LABEL_ID_newRoot);
      ActionManagerEx manager = ActionManagerEx.getInstanceEx();
      manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
      CreateRootNode_ActionGroup.this.addAction(action);
    }
  }
}
