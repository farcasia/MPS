package jetbrains.mps.ide.refactoring;

/*Generated by MPS */

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.Nullable;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

@State(name = "MpsRefactoringSettings", storages = @Storage(value = "refactoringSettings.xml")
)
public class RefactoringSettings implements PersistentStateComponent<RefactoringSettings>, ApplicationComponent {

  public boolean SAFE_DELETE = true;

  public static RefactoringSettings getInstance() {
    return ApplicationManager.getApplication().getComponent(RefactoringSettings.class);
  }
  @Nullable
  public RefactoringSettings getState() {
    return this;
  }
  public void loadState(RefactoringSettings state) {
    XmlSerializerUtil.copyBean(state, this);
  }

  public void initComponent() {
  }
  public void disposeComponent() {
  }
  @NonNls
  @NotNull
  public String getComponentName() {
    return "Refactoring Settings";
  }

}
