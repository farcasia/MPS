package jetbrains.mps.execution.demo.pluginSolution.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationType;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import java.util.List;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;

public class Demo_Kind implements ConfigurationType {
  private static final Icon ICON = AllIcons.RunConfigurations.Application;
  private final List<ConfigurationFactory> myForeignFactories = ListSequence.fromList(new ArrayList<ConfigurationFactory>());
  public Demo_Kind() {
  }
  public ConfigurationFactory[] getConfigurationFactories() {
    List<ConfigurationFactory> result = ListSequence.fromList(new ArrayList<ConfigurationFactory>());
    ListSequence.fromList(result).addElement(new DemoApplication_Configuration_Factory(this));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(myForeignFactories));
    return ListSequence.fromList(result).toGenericArray(ConfigurationFactory.class);
  }
  @NonNls
  @NotNull
  public String getId() {
    return "Demo";
  }
  public Icon getIcon() {
    return ICON;
  }
  public String getConfigurationTypeDescription() {
    return getDisplayName();
  }
  public String getDisplayName() {
    return "Demo";
  }
  public void addForeignFactory(ConfigurationFactory factory) {
    ListSequence.fromList(myForeignFactories).addElement(factory);
  }
  public static Demo_Kind getInstance() {
    return ContainerUtil.findInstance(Extensions.getExtensions(CONFIGURATION_TYPE_EP), Demo_Kind.class);
  }
}
