package jetbrains.mps.debugger.java.runtime.ui.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;

public class WatchesTreeActions_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.debugger.java.runtime.ui.actions.WatchesTreeActions_ActionGroup";
  public WatchesTreeActions_ActionGroup() {
    super("WatchesTreeActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    WatchesTreeActions_ActionGroup.this.addAction("jetbrains.mps.debugger.java.runtime.ui.actions.AddWatchAction_Action");
    WatchesTreeActions_ActionGroup.this.addAction("jetbrains.mps.debugger.java.runtime.ui.actions.EditWatchAction_Action");
    WatchesTreeActions_ActionGroup.this.addAction("jetbrains.mps.debugger.java.runtime.ui.actions.RemoveWatchAction_Action");
  }
}
