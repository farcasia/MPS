package jetbrains.mps.debugger.api.ui.breakpoints;

/*Generated by MPS */

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.ui.tree.MPSTree;
import jetbrains.mps.project.Project;

@State(name = "BreakpointViewSettings", storages = @Storage(value = StoragePathMacros.WORKSPACE_FILE)
)
public class BreakpointViewSettingsComponent implements PersistentStateComponent<BreakpointViewSettingsComponent.MyState>, ProjectComponent {
  private BreakpointViewSettingsComponent.MyState myState = new BreakpointViewSettingsComponent.MyState();
  public BreakpointViewSettingsComponent() {
  }
  @Override
  public BreakpointViewSettingsComponent.MyState getState() {
    return myState;
  }
  @Override
  public void loadState(BreakpointViewSettingsComponent.MyState state) {
    myState = state;
  }
  @Override
  public void projectOpened() {
  }
  @Override
  public void projectClosed() {
  }
  @NotNull
  @Override
  public String getComponentName() {
    return "Breakpoints Settings";
  }
  @Override
  public void initComponent() {
  }
  @Override
  public void disposeComponent() {
  }
  public int getViewIndex() {
    return myState.myViewIndex;
  }
  public void setViewIndex(int viewIndex) {
    myState.myViewIndex = viewIndex;
  }
  public boolean isGroupByModule() {
    return myState.myGroupByModule;
  }
  public void setGroupByModule(boolean groupByModule) {
    myState.myGroupByModule = groupByModule;
  }
  public boolean isGroupByModel() {
    return myState.myGroupByModel;
  }
  public void setGroupByModel(boolean groupByModel) {
    myState.myGroupByModel = groupByModel;
  }
  public boolean isGroupByRoot() {
    return myState.myGroupByRoot;
  }
  public void setGroupByRoot(boolean groupByRoot) {
    myState.myGroupByRoot = groupByRoot;
  }
  public MPSTree.TreeState getTreeState() {
    return myState.myTreeState;
  }
  public void setTreeState(MPSTree.TreeState treeState) {
    myState.myTreeState = treeState;
  }
  public static BreakpointViewSettingsComponent getInstance(Project project) {
    return project.getComponent(BreakpointViewSettingsComponent.class);
  }
  public static class MyState {
    public int myViewIndex = 0;
    public boolean myGroupByModule = true;
    public boolean myGroupByModel = true;
    public boolean myGroupByRoot = true;
    public MPSTree.TreeState myTreeState;
    public MyState() {
    }
  }
}
