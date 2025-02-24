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
package jetbrains.mps.extapi.persistence;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.persistence.ModelRoot;

/**
 * Represents that {@link ModelRoot} can be cloned.
 * @param <T> -- is the type of the model root which one wants to copy
 *
 * @author Radimir.Sorokin, apyshkin
 */
public interface CopyableModelRoot<T extends CopyableModelRoot<T> & ModelRoot> {
  /**
   * Copies this model root contents to the <t>targetModelRoot</t>.
   * the resulting model root must be equal to the prototype
   */
  void copyTo(@NotNull T targetModelRoot) throws CopyNotSupportedException;
}
