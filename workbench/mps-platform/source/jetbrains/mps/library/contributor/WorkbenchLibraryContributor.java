/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.library.contributor;

import jetbrains.mps.util.PathManager;
import jetbrains.mps.vfs.openapi.FileSystem;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Contributes workbench modules -- IDE and platform (idea) layers
 */
public final class WorkbenchLibraryContributor implements LibraryContributor {
  private final FileSystem myFs;

  public WorkbenchLibraryContributor(@NotNull FileSystem fs) {
    myFs = fs;
  }

  @Override
  public Set<LibDescriptor> getPaths() {
    Set<LibDescriptor> res = new HashSet<LibDescriptor>();
    res.add(new LibDescriptor(myFs.getFile(PathManager.getWorkbenchPath()), null));
    return res;
  }

  @Override
  public boolean hiddenLanguages() {
    return false;
  }
}
