package jetbrains.mps.execution.api.settings;

/*Generated by MPS */

import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.configurations.RuntimeConfigurationException;

public interface IPersistentConfiguration extends JDOMExternalizable {
  void checkConfiguration(PersistentConfigurationContext context) throws RuntimeConfigurationException;
  SettingsEditorEx<? extends IPersistentConfiguration> getEditor();
  IPersistentConfiguration createCloneTemplate();
}
