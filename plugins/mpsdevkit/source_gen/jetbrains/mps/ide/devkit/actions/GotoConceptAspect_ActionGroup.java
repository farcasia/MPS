package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;

public class GotoConceptAspect_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.ide.devkit.actions.GotoConceptAspect_ActionGroup";
  public GotoConceptAspect_ActionGroup() {
    super("GotoConceptAspect", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    GotoConceptAspect_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.GoToConceptDeclaration_Action");
    GotoConceptAspect_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.GoToEditorDeclaration_Action");
  }
}
