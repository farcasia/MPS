/*
 * Copyright 2003-2017 JetBrains s.r.o.
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
package jetbrains.mps.generator;

import jetbrains.mps.util.annotation.ToRemove;

/**
 * Settings #isCheckModelsBeforeGeneration and #isGenerateDebugInfo are not generator-specific, but
 * refer to tasks that runs along with generator. That's why they are not in IGenerationSettions.
 * This, however, doesn't justify their presence ib IModifiableGenerationSettings, it requires one more
 * refactoring to extract them into a separate entity
 */
public interface IModifiableGenerationSettings extends IGenerationSettings {

  void setSaveTransientModels(boolean saveTransientModels);

  boolean isCheckModelsBeforeGeneration();

  void setCheckModelsBeforeGeneration(boolean checkModelsBeforeGeneration);

  void setParallelGenerator(boolean useNewGenerator);

  void setStrictMode(boolean strictMode);

  void setNumberOfParallelThreads(int coreNumber);

  void setPerformanceTracingLevel(int performanceTracingLevel);

  void setNumberOfModelsToKeep(int numberOfModelsToKeep);

  void setShowInfo(boolean showInfo);

  void setShowWarnings(boolean showWarnings);

  void setKeepModelsWithWarnings(boolean keepModelsWithWarnings);

  /**
   * @deprecated no more support for incremental generation
   */
  @ToRemove(version = 2017.3)
  @Deprecated
  void setIncremental(boolean isIncremental);

  /**
   * @deprecated no more support for incremental generation
   */
  @ToRemove(version = 2017.3)
  @Deprecated
  void setIncrementalUseCache(boolean incrementalUseCache);

  /**
   * @deprecated no more support for incremental generation
   */
  @ToRemove(version = 2017.3)
  @Deprecated
  void setDebugIncrementalDependencies(boolean value);

  void setGenerateDebugInfo(boolean generateDebugInfo);

  void setShowBadChildWarning(boolean showBadChildWarning);

  void enableInplaceTransformations(boolean enabled);

  void setCreateStaticReferences(boolean createStaticRefs);
}
