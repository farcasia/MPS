package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import com.intellij.openapi.extensions.PluginId;

public class MakeFromChangesView_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.vcs.plugin.MakeFromChangesView_ActionGroup";
  public MakeFromChangesView_ActionGroup() {
    super("MakeFromChangesView", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    MakeFromChangesView_ActionGroup.this.addSeparator();
    MakeFromChangesView_ActionGroup.this.addParameterizedAction(new MakeOrRebuildModelsFromChangeList_Action(false), PluginId.getId("jetbrains.mps.ide.vcs"), false);
    MakeFromChangesView_ActionGroup.this.addParameterizedAction(new MakeOrRebuildModelsFromChangeList_Action(true), PluginId.getId("jetbrains.mps.ide.vcs"), true);
  }
}
