package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import com.intellij.openapi.extensions.PluginId;

public class NamespaceMake_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.ide.make.actions.NamespaceMake_ActionGroup";
  public NamespaceMake_ActionGroup() {
    super("NamespaceMake", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    NamespaceMake_ActionGroup.this.addParameterizedAction(new MakeNamespace_Action(false), PluginId.getId("jetbrains.mps.ide.make"), false);
    NamespaceMake_ActionGroup.this.addParameterizedAction(new MakeNamespace_Action(true), PluginId.getId("jetbrains.mps.ide.make"), true);
  }
}
