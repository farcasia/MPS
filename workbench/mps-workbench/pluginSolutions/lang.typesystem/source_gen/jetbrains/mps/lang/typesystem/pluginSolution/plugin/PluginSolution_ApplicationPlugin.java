package jetbrains.mps.lang.typesystem.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.DebugActions_ActionGroup;
import java.util.List;
import jetbrains.mps.plugins.actions.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class PluginSolution_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.typesystem.pluginSolution");
  public PluginSolution_ApplicationPlugin() {
  }
  public PluginId getId() {
    return myId;
  }
  public void createGroups() {
    // actions w/o parameters 
    addAction(new ConvertInferenceRuleToCheckingRule_Action());
    addAction(new ShowNodeType_Action());
    // groups 
    addGroup(new ShowAsIntentions_TypeSystem_ActionGroup());
    addGroup(new TypesystemActions_Plugin_ActionGroup());
  }
  public void adjustRegularGroups() {
    insertGroupIntoAnother(ShowAsIntentions_TypeSystem_ActionGroup.ID, "jetbrains.mps.ide.editor.actions.ActionsAsIntentions_ActionGroup", null);
    insertGroupIntoAnother(TypesystemActions_Plugin_ActionGroup.ID, DebugActions_ActionGroup.ID, DebugActions_ActionGroup.LABEL_ID_types);
  }
  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    return res;
  }
}
