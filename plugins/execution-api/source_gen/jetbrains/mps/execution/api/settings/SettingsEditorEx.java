package jetbrains.mps.execution.api.settings;

/*Generated by MPS */

import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.util.Factory;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.ui.Messages;

public abstract class SettingsEditorEx<Settings> extends SettingsEditor<Settings> {
  public SettingsEditorEx() {
  }
  public SettingsEditorEx(Factory<Settings> factory) {
    super(factory);
  }
  public void apply(Settings settings) {
    try {
      applyTo(settings);
    } catch (ConfigurationException e) {
      Messages.showErrorDialog(getComponent(), e.getMessage(), "Configuration Error");
    }
  }
}
