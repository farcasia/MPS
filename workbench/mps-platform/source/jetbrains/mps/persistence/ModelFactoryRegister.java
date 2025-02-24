/*
 * Copyright 2003-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.persistence;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.extensions.AbstractExtensionPointBean;
import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.xmlb.annotations.Attribute;
import jetbrains.mps.extapi.persistence.ModelFactoryService;
import jetbrains.mps.generator.impl.plan.ConnectedComponentPartitioner.Component;
import jetbrains.mps.ide.MPSCoreComponents;
import jetbrains.mps.util.annotation.ToRemove;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.annotations.Internal;
import org.jetbrains.mps.openapi.persistence.ModelFactory;
import org.jetbrains.mps.openapi.persistence.NotImplementedModelFactoryType;
import org.jetbrains.mps.openapi.persistence.NullDataSource.NullDataSourceType;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;

import java.util.ArrayList;
import java.util.List;

/**
 * A platform extension point to client custom model factories
 * delegates to the {@link ModelFactoryService}
 * The legacy persistence facade registration eventually triggers the registration in the {@link ModelFactoryService}.
 */
@Internal
public final class ModelFactoryRegister implements ApplicationComponent {
  private static final Logger LOG = LogManager.getLogger(ModelFactoryRegister.class);

  private final List<ModelFactory> myRegisteredFactories = new ArrayList<>();

  private final PersistenceFacade myPersistenceRegistry;

  public ModelFactoryRegister(MPSCoreComponents mpsCoreComponents) {
    myPersistenceRegistry = mpsCoreComponents.getPersistenceFacade();
  }

  @Override
  public void initComponent() {
    for (ModelFactoryProvider provider : ModelFactoryProvider.EP_MODEL_FACTORY.getExtensions()) {
      try {
        ModelFactory modelFactory = provider.instantiate(provider.getImplementationClass(), ApplicationManager.getApplication().getPicoContainer());
        myRegisteredFactories.add(modelFactory);
        check(modelFactory);
        registerLEGACY(modelFactory);
      } catch (ClassNotFoundException e) {
        String m = String.format("Failed to load %s in the plugin %s",
                                 provider.getImplementationClass(),
                                 provider.getPluginDescriptor().getPluginId());
        LogManager.getLogger(ModelFactoryRegister.class).error(m, e);
      }
    }
  }

  @ToRemove(version = 181)
  private boolean isLegacy(ModelFactory factory) {
    return factory.getType() == NotImplementedModelFactoryType.INSTANCE;
  }

  private void check(@NotNull ModelFactory modelFactory) {
    if (isLegacy(modelFactory)) {
      String message = "The model factory '" + modelFactory + "' seems to be restrained to the legacy API.\n" +
                       "Please reimplement new methods properly since the legacy API will be dropped in the 2018.1 version.";
      if (ApplicationManager.getApplication().isHeadlessEnvironment()) {
        LOG.error(message, new Throwable());
      } else {
        Messages.showErrorDialog((Project) null, message, "Attention");
      }
    }
  }

  @ToRemove(version = 3.7)
  @Deprecated
  private void registerLEGACY(ModelFactory modelFactory) {
    myPersistenceRegistry.setModelFactory(modelFactory.getFileExtension(), modelFactory);
  }

  @Override
  public void disposeComponent() {
    for (ModelFactory modelFactory : myRegisteredFactories) {
      unregisterLEGACY(modelFactory);
    }
    myRegisteredFactories.clear();
  }

  private void unregisterLEGACY(ModelFactory modelFactory) {
    myPersistenceRegistry.setModelFactory(modelFactory.getFileExtension(), null);
  }

  @NotNull
  @Override
  public String getComponentName() {
    return "ModelFactoryRegister";
  }

  public static class ModelFactoryProvider extends AbstractExtensionPointBean {
    public static final ExtensionPointName<ModelFactoryProvider> EP_MODEL_FACTORY = ExtensionPointName.create("com.intellij.mps.ModelFactoryProvider");

    @Attribute(value = "implementationClass")
    public String myImplementationClass;

    public String getImplementationClass() {
      return myImplementationClass;
    }
  }
}
