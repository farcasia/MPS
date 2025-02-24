/*
 * Copyright 2003-2012 JetBrains s.r.o.
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

import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.persistence.DataSource;

import java.util.Collection;

/**
 * This kind of data source describes a location within physical file system.
 * For example it can be a folder or a single file or a set of folders.
 *
 * TODO I would rather have a single implementor of this
 *
 * @author evgeny, apyshkin
 * @since 11/4/12
 */
public interface FileSystemBasedDataSource extends DataSource, DisposableDataSource {

  /**
   * @return collection of files (or folders) which comprise a set of source paths (!) for this DataSource
   * CONTRACT:
   * Minimality:
   * 1. If a 'file' is in the result then 'file.getParent()' could not be among resulting files
   * 2. All the files in the directory could not be there (the parent directory as a whole would be returned instead)
   */
  @NotNull Collection<IFile> getAffectedFiles();
}
