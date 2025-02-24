package jetbrains.mps.lang.migration.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;

public class PluginSolution_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.migration.pluginSolution");
  public PluginSolution_ApplicationPlugin() {
  }
  public PluginId getId() {
    return myId;
  }
  public void createGroups() {
    // actions w/o parameters 
    addAction(new GoToTarget_Action());
    // groups 
    addGroup(new GoToAddition_ActionGroup());
  }
  public void adjustRegularGroups() {
    insertGroupIntoAnother(GoToAddition_ActionGroup.ID, "GoToEditorPopupAddition_ActionGroupother", null);
  }
}
