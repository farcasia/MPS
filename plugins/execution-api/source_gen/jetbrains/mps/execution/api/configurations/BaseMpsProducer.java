package jetbrains.mps.execution.api.configurations;

/*Generated by MPS */

import com.intellij.execution.junit.RuntimeConfigurationProducer;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ConfigurationFactory;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.project.ProjectHelper;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.Location;
import java.util.List;
import java.util.Objects;
import com.intellij.execution.configurations.RunConfiguration;
import jetbrains.mps.plugins.runconfigs.MPSLocation;
import jetbrains.mps.plugins.runconfigs.MPSPsiElement;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.Computable;
import com.intellij.execution.impl.RunnerAndConfigurationSettingsImpl;
import com.intellij.execution.impl.RunManagerImpl;
import jetbrains.mps.util.EqualUtil;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.apache.log4j.Level;

/**
 * Currently extends the deprecated RuntimeConfigurationProducer
 * To be migrated in 3.5 to the {@link com.intellij.execution.actions.RunConfigurationProducer }
 * 
 * @param <T> denotes the MpsPsiElement's item which is the 'key' of the subclassing producer
 */
public abstract class BaseMpsProducer<T> extends RuntimeConfigurationProducer {
  private static final Logger LOG = LogManager.getLogger(BaseMpsProducer.class);
  private PsiElement mySourceElement;
  @Nullable
  private ConfigurationContext myContext;

  public BaseMpsProducer(ConfigurationType configurationType, String factoryClassName) {
    super(BaseMpsProducer.findFactory(configurationType, factoryClassName));
  }

  public BaseMpsProducer(ConfigurationFactory configurationFactory) {
    super(configurationFactory);
  }

  public void setSourceElement(PsiElement sourceElement) {
    mySourceElement = sourceElement;
  }

  @Override
  public PsiElement getSourceElement() {
    return mySourceElement;
  }

  @NotNull
  protected final MPSProject getMpsProject() {
    if (myContext == null) {
      throw new IllegalStateException("Context is not set");
    }
    Project project = myContext.getProject();
    return ProjectHelper.fromIdeaProject(project);
  }

  @Nullable
  protected ConfigurationContext getContext() {
    return myContext;
  }

  /**
   * Here we are making resolve by type and name (!), however it is not legal in some scenarios (consider main1 and main2, user creates configuration
   * named main2, which runs the main method from the main1 class. If now user switches to the main2 and presses ctrl-shift-f10 he will be still
   * running the main method from the main1 class)
   * The proper way is to implement this method in each producer obligatory.
   * However runconfigurations generator must be fully updated with new platform
   * RunConfigurationProducer (instead of RuntimeConfigurationProducer).
   */
  @Override
  @Nullable
  protected RunnerAndConfigurationSettings findExistingByElement(Location location, @NotNull List<RunnerAndConfigurationSettings> existingConfigurations, ConfigurationContext context) {
    RunnerAndConfigurationSettings given = getConfiguration();
    for (RunnerAndConfigurationSettings existing : existingConfigurations) {
      if (Objects.equals(existing.getType(), given.getType())) {
        if (isConfigurationFromContext(existing.getConfiguration(), context)) {
          return existing;
        }
      }
    }
    return null;
  }

  /**
   * Supposed to return whether the given location is created from the given context
   * By default compares by names
   * 
   * TODO keep it after migration to the {@link com.intellij.execution.actions.RunConfigurationProducer }
   */
  protected boolean isConfigurationFromContext(@NotNull RunConfiguration configuration, @NotNull ConfigurationContext context) {
    RunnerAndConfigurationSettings given = getConfiguration();
    return Objects.equals(configuration.getName(), given.getName());
  }

  @Nullable
  @Override
  protected RunnerAndConfigurationSettings createConfigurationByElement(Location location, ConfigurationContext context) {
    myContext = context;
    if (!((location instanceof MPSLocation))) {
      return null;
    }
    MPSLocation mpsLocation = (MPSLocation) location;
    final MPSPsiElement psiElement = mpsLocation.getPsiElement();
    MPSProject mpsProject = mpsLocation.getMPSProject();
    if (psiElement.isTransientElement()) {
      // Generally, no run configurations for transient elements might be too much - one may desire 
      // e.g. to run a main class for a transient model. Perhaps, each producer shall decide itself (in isApplicable) whether 
      // to ignore tranient models, however, at the moment I decided to prevent any code execution for transient models for  
      // the sake of change simplicity. 
      return null;
    }
    RunConfiguration config = new ModelAccessHelper(mpsProject.getRepository()).runReadAction(new Computable<RunConfiguration>() {
      @Override
      public RunConfiguration compute() {
        Object mpsItem = psiElement.getMPSItem();
        if (mpsItem == null) {
          return null;
        }
        if (!(isApplicable(mpsItem))) {
          return null;
        }
        return doCreateConfiguration((T) mpsItem);
      }
    });
    if (config == null) {
      return null;
    }
    return new RunnerAndConfigurationSettingsImpl(RunManagerImpl.getInstanceImpl(location.getProject()), config, false);
  }

  @Nullable
  protected abstract RunConfiguration doCreateConfiguration(T node);

  protected abstract boolean isApplicable(Object element);

  @Override
  public int compareTo(Object o) {
    return RuntimeConfigurationProducer.PREFERED;
  }

  @Override
  public int hashCode() {
    return ((myContext == null ? 0 : myContext.hashCode())) + 10 * ((mySourceElement == null ? 0 : mySourceElement.hashCode())) + 20 * getClass().getName().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || !((obj instanceof BaseMpsProducer))) {
      return false;
    }
    BaseMpsProducer configCreator = (BaseMpsProducer) obj;
    return EqualUtil.equals(configCreator.myContext, myContext) && EqualUtil.equals(configCreator.mySourceElement, mySourceElement) && EqualUtil.equals(configCreator.getClass().getName(), getClass().getName());
  }

  @NotNull
  protected static ConfigurationFactory findFactory(ConfigurationType configurationType, @NonNls String configurationFactoryClassName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().equals(configurationFactoryClassName)) {
        return factory;
      }
    }
    if (LOG.isEnabledFor(Level.WARN)) {
      LOG.warn("Cound not find configuration factory for " + configurationFactoryClassName + " in type " + configurationType.getDisplayName() + ".");
    }
    return configurationType.getConfigurationFactories()[0];
  }
}
