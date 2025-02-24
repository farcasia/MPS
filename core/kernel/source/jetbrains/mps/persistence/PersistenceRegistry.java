/*
 * Copyright 2003-2016 JetBrains s.r.o.
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

import jetbrains.mps.components.CoreComponent;
import jetbrains.mps.extapi.persistence.ModelFactoryService;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelId.ForeignSModelId;
import jetbrains.mps.smodel.SModelId.IntegerSModelId;
import jetbrains.mps.smodel.SModelId.RegularSModelId;
import jetbrains.mps.smodel.SModelId.RelativePathSModelId;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.annotation.ToRemove;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModelId;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNodeId;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SModuleId;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.FindUsagesParticipant;
import org.jetbrains.mps.openapi.persistence.ModelFactory;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.persistence.ModelRootFactory;
import org.jetbrains.mps.openapi.persistence.NavigationParticipant;
import org.jetbrains.mps.openapi.persistence.SModelIdFactory;
import org.jetbrains.mps.openapi.persistence.SNodeIdFactory;
import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;
import org.jetbrains.mps.openapi.persistence.datasource.FileExtensionDataSourceType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * evgeny, 10/23/12
 */
public class PersistenceRegistry extends org.jetbrains.mps.openapi.persistence.PersistenceFacade implements CoreComponent {
  private static final Logger LOG = LogManager.getLogger(PersistenceRegistry.class);

  public static final String DEFAULT_MODEL_ROOT = "default";
  public static final String OBSOLETE_MODEL_ROOT = "obsolete";
  public static final String JAVA_CLASSES_ROOT = "java_classes";

  private final ModelFactoryService MODEL_FACTORY_SERVICE = ModelFactoryService.getInstance();

  @ToRemove(version = 181) private final Map<String, ModelFactory> myLegacyFileExt2ModelFactoryMap = new ConcurrentHashMap<>();

  private final Map<String, ModelRootFactory> myRootFactories = new HashMap<String, ModelRootFactory>();
  private final Map<String, SModelIdFactory> myModelIdFactory = new HashMap<String, SModelIdFactory>();
  private final Map<String, SNodeIdFactory> myNodeIdFactory = new HashMap<String, SNodeIdFactory>();
  private final Set<FindUsagesParticipant> myFindUsagesParticipants = new LinkedHashSet<FindUsagesParticipant>();
  private final Set<NavigationParticipant> myNavigationParticipants = new LinkedHashSet<NavigationParticipant>();

  private boolean isDisabled = false;

  public static PersistenceRegistry getInstance() {
    return (PersistenceRegistry) INSTANCE;
  }

  @Override
  public ModelRootFactory getModelRootFactory(String type) {
    if (type == null || type.length() == 0) {
      throw new IllegalArgumentException("type");
    }
    return myRootFactories.get(type);
  }

  @Override
  public void setModelRootFactory(String type, ModelRootFactory factory) {
    if (factory == null) {
      myRootFactories.remove(type);
    } else {
      myRootFactories.put(type, factory);
    }
  }

  @Deprecated
  @Override
  public ModelFactory getModelFactory(String extension) {
    if (myLegacyFileExt2ModelFactoryMap.containsKey(extension)) {
      return myLegacyFileExt2ModelFactoryMap.get(extension);
    }
    return MODEL_FACTORY_SERVICE.getDefaultModelFactory(FileExtensionDataSourceType.of(extension));
  }

  @Deprecated
  @Override
  public ModelFactory getDefaultModelFactory() {
    String defaultExt = MPSExtentions.MODEL;
    return getModelFactory(defaultExt);
  }

  @Deprecated
  @Override
  public void setModelFactory(String extension, ModelFactory factory) {
    if (factory == null) {
      FileExtensionDataSourceType type = FileExtensionDataSourceType.of(extension);
      MODEL_FACTORY_SERVICE.getModelFactories(type).forEach(MODEL_FACTORY_SERVICE::unregister);
    } else {
      myLegacyFileExt2ModelFactoryMap.put(extension, factory);
      if (!Objects.equals(factory.getFileExtension(), extension)) {
        LOG.error("The model factory '" + factory + "' is trying to register using the legacy mechanism via PersistenceFacade.\n" +
                  "The declared file extension '" + factory.getFileExtension() + "' is not equal to the passed '" + extension + "'\n" +
                  "Please fix this.", new Throwable());
        return;
      }
      MODEL_FACTORY_SERVICE.register(factory);
    }
  }

  @Deprecated
  @Override
  public Set<String> getModelFactoryExtensions() {
    Set<String> result = new HashSet<>(myLegacyFileExt2ModelFactoryMap.keySet());
    for (ModelFactory modelFactory : MODEL_FACTORY_SERVICE.getFactories()) {
      List<DataSourceType> preferredDataSourceTypes = new ArrayList<>(modelFactory.getPreferredDataSourceTypes());
      result.addAll(preferredDataSourceTypes.stream()
                                            .filter(dataSourceType -> dataSourceType instanceof FileExtensionDataSourceType)
                                            .map(dataSourceType -> ((FileExtensionDataSourceType) dataSourceType).getFileExtension())
                                            .collect(Collectors.toList()));
    }
    return Collections.unmodifiableSet(result);
  }

  @NotNull
  @Override
  public SModuleId createModuleId(@NotNull String text) {
    return ModuleId.fromString(text);
  }

  @NotNull
  @Override
  public String asString(@NotNull SModuleId moduleId) {
    return moduleId.toString();
  }

  @Override
  public String asString(@NotNull SModuleReference reference) {
    return reference.toString();
  }

  @Override
  public SModuleReference createModuleReference(@NotNull String text) {
    return ModuleReference.parseReference(text);
  }

  @Override
  public SModuleReference createModuleReference(@NotNull SModuleId moduleId, String moduleName) {
    return new ModuleReference(moduleName, moduleId);
  }

  @Override
  public SModelId createModelId(@NotNull String text) {
    int colon = text.indexOf(':');
    if (colon == -1) {
      throw new IllegalArgumentException(String.format("No model id factory designator (':') in %s", text));
    }
    final String factoryDesignator = text.substring(0, colon);
    SModelIdFactory factory = myModelIdFactory.get(factoryDesignator);
    if (factory == null) {
      throw new IllegalArgumentException(String.format("Unknown model id factory '%s' in %s", factoryDesignator, text));
    }
    return factory.create(text.substring(colon + 1));
  }

  @Override
  public String asString(@NotNull SModelId modelId) {
    // FIXME In fact, shall delegate to proper SModelIdFactory. toString here is just the first step in transition - once all code out there
    // stops using SModelId.toString() for persistence and switch to PersistenceFacade.asString, this implementation shall change and delegate to factory.
    return modelId.toString();
  }

  @NotNull
  @Override
  public SModelReference createModelReference(@NotNull String text) {
    return jetbrains.mps.smodel.SModelReference.parseReference(text);
  }

  @Override
  public String asString(@NotNull SModelReference modelRef) {
    // FIXME once there's no direct uses of SModelReference#toString in persistence code, this might change to produce another format
    return modelRef.toString();
  }

  @Override
  public SModelReference createModelReference(SModuleReference module, @NotNull SModelId modelId, @NotNull String modelName) {
    return new jetbrains.mps.smodel.SModelReference(module, modelId, modelName);
  }

  @Override
  public void setModelIdFactory(String type, SModelIdFactory factory) {
    if (factory == null) {
      myModelIdFactory.remove(type);
    } else {
      myModelIdFactory.put(type, factory);
    }
  }

  @Override
  @Nullable
  public SNodeId createNodeId(@NotNull String text) {
    if (text.length() == 0) return null;
    char c = text.charAt(0);

    if (c == '~' || c <= '9' && c >= '0') {
      // default id is supported without type+colon prefix
      return jetbrains.mps.smodel.SNodeId.fromString(text);
    }

    int colon = text.indexOf(':');
    if (colon == -1) {
      throw new IncorrectNodeIdFormatException(String.format("The node id text '%s' does not contain the colon ':' separator", text), null);
    }
    SNodeIdFactory factory = myNodeIdFactory.get(text.substring(0, colon));
    if (factory == null) {
      return null;
    }
    return factory.create(text.substring(colon + 1));
  }

  @NotNull
  @Override
  public String asString(@NotNull SNodeReference nodeRef) {
    return SNodePointer.serialize(nodeRef);
  }

  @Override
  public SNodeReference createNodeReference(@NotNull String text) {
    return SNodePointer.deserialize(text);
  }

  @Override
  public void setNodeIdFactory(String type, SNodeIdFactory factory) {
    if (factory == null) {
      myNodeIdFactory.remove(type);
    } else {
      myNodeIdFactory.put(type, factory);
    }
  }

  @Override
  public Iterable<String> getTypeIds() {
    return Collections.unmodifiableCollection(myRootFactories.keySet());
  }

  @Override
  public void addFindUsagesParticipant(FindUsagesParticipant participant) {
    myFindUsagesParticipants.add(participant);
  }

  @Override
  public void removeFindUsagesParticipant(FindUsagesParticipant participant) {
    myFindUsagesParticipants.remove(participant);
  }

  @Override
  public Set<FindUsagesParticipant> getFindUsagesParticipants() {
    return isDisabled ? Collections.<FindUsagesParticipant>emptySet() : Collections.unmodifiableSet(myFindUsagesParticipants);
  }

  public boolean isFastSearch() {
    return !isDisabled;
  }

  @Override
  public void addNavigationParticipant(NavigationParticipant participant) {
    myNavigationParticipants.add(participant);
  }

  @Override
  public void removeNavigationParticipant(NavigationParticipant participant) {
    myNavigationParticipants.remove(participant);
  }

  @Override
  public Set<NavigationParticipant> getNavigationParticipants() {
    return myNavigationParticipants;
  }

  @Override
  public void init() {
    if (INSTANCE != null) {
      throw new IllegalStateException("double initialization");
    }
    INSTANCE = this;

    setModelRootFactory(DEFAULT_MODEL_ROOT, new DefaultModelRootFactory());
    setNodeIdFactory(jetbrains.mps.smodel.SNodeId.TYPE, jetbrains.mps.smodel.SNodeId::fromString);
    setModelIdFactory(RegularSModelId.TYPE, jetbrains.mps.smodel.SModelId::regular);
    setModelIdFactory(ForeignSModelId.TYPE, jetbrains.mps.smodel.SModelId::foreign);
    setModelIdFactory(RelativePathSModelId.TYPE, RelativePathSModelId::new);
    setModelIdFactory(IntegerSModelId.TYPE, IntegerSModelId::parse);
  }

  @Override
  public void dispose() {
    INSTANCE = null;
  }

  public void disableFastFindUsages() {
    isDisabled = true;
  }

  public void enableFastFindUsages() {
    isDisabled = false;
  }

  private static class DefaultModelRootFactory implements ModelRootFactory {
    @NotNull
    @Override
    public ModelRoot create() {
      return new DefaultModelRoot();
    }
  }
}
