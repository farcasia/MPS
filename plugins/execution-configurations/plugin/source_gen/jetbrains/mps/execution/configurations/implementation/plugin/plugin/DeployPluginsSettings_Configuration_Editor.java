package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.settings.SettingsEditorEx;
import org.jetbrains.annotations.NotNull;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.ide.common.LayoutUtil;
import com.intellij.openapi.options.ConfigurationException;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.execution.lib.PointerUtils;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Factory;

public class DeployPluginsSettings_Configuration_Editor extends SettingsEditorEx<DeployPluginsSettings_Configuration> {
  private PluginsListPanel myPluginsPanel;
  public void disposeEditor() {
  }
  @NotNull
  public JPanel createEditor() {
    JPanel panel = new JPanel(new GridBagLayout());
    myPluginsPanel = new PluginsListPanel(myp);
    myPluginsPanel.setData(ListSequence.fromList(new ArrayList<SNodeReference>()));
    panel.add(myPluginsPanel, LayoutUtil.createPanelConstraints(0));
    return panel;
  }
  public void applyEditorTo(final DeployPluginsSettings_Configuration configuration) throws ConfigurationException {
    configuration.getPluginsToDeploy().clear();
    ListSequence.fromList(configuration.getPluginsToDeploy().getData()).addSequence(ListSequence.fromList(myPluginsPanel.getItems()).select(new ISelector<SNodeReference, String>() {
      public String select(SNodeReference it) {
        return PointerUtils.pointerToString(it);
      }
    }));
  }
  public void resetEditorFrom(final DeployPluginsSettings_Configuration configuration) {
    myPluginsPanel.setData(PointerUtils.clonableListToNodes(configuration.getPluginsToDeploy()));
  }
  private Project myp;
  public DeployPluginsSettings_Configuration_Editor(final Project p) {
    super(new Factory<DeployPluginsSettings_Configuration>() {
      public DeployPluginsSettings_Configuration create() {
        return new DeployPluginsSettings_Configuration(p);
      }
    });
    myp = p;
  }
}
