package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;

public class ToolsInternalEx_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.ide.modelchecker.actions.ToolsInternalEx_ActionGroup";
  public ToolsInternalEx_ActionGroup() {
    super("ToolsInternalEx", ID);
    this.setIsInternal(true);
    this.setPopup(false);
    ToolsInternalEx_ActionGroup.this.addAction("jetbrains.mps.ide.modelchecker.actions.FindWrongAspectDependencies_Action");
    ToolsInternalEx_ActionGroup.this.addAction("jetbrains.mps.ide.modelchecker.actions.FindCrossTemplateReferences_Action");
    ToolsInternalEx_ActionGroup.this.addAction("jetbrains.mps.ide.modelchecker.actions.FindReferencesToNonReferenceable_Action");
  }
}
