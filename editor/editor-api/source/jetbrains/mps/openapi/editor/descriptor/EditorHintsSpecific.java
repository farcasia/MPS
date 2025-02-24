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
package jetbrains.mps.openapi.editor.descriptor;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface EditorHintsSpecific {
  /**
   * Used to specify collection of editor context hints this instance is applicable to.
   * Empty collection indicates default instance (applicable in any context). Instance
   * is applicable in particular context only if all specified context hints are available in
   * this context.
   * <p/>
   * When choosing an instance, the instance having the maximum number of context hints specified will be used.
   *
   * @return collection of context hints, possibly empty, never null
   */
  @NotNull
  Collection<String> getContextHints();
}
