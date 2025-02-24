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
package jetbrains.mps.reloading;

import jetbrains.mps.util.iterable.IterableEnumeration;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.impl.IoFileSystem;
import jetbrains.mps.vfs.path.Path;
import jetbrains.mps.vfs.path.UniPath;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public abstract class RealClassPathItem extends AbstractClassPathItem {
  private static Logger LOG = LogManager.getLogger(RealClassPathItem.class);

  private static final jetbrains.mps.vfs.openapi.FileSystem FS = IoFileSystem.INSTANCE;

  public abstract String getPath();

  // relies on the fact that {@link #getResource(String)} returns unique resource for each name
  @Override
  public Enumeration<URL> getResources(String name) {
    List<URL> result = new ArrayList<URL>();
    URL resource = getResource(name);
    if (resource != null) {
      result.add(resource);
    }
    return new IterableEnumeration<URL>(result);
  }

  @NotNull
  public static RealClassPathItem create(@NotNull String path, @Nullable String caller) {
    IFile file = FS.getFile(path);
    Path fPath = file.toPath().toNormal();
    if (!file.exists()) {
      notifyNonExistentCP(caller, file, fPath);
      return new NonExistingClassPathItem(fPath.toString());
    } else if (file.isArchive()) {
      return new JarFileClassPathItem(FS, fPath.toString());
    } else if (file.isDirectory()) {
      return new FileClassPathItem(fPath.toString());
    } else if (file.isInArchive()) {
      throw new IllegalArgumentException("Path variable `" + fPath + "' points to the location inside the jar which is not supported");
    } else {
      throw new IllegalArgumentException("Path variable `" + fPath + "' does not point to a directory or to a jar/zip location");
    }
  }

  private static void notifyNonExistentCP(@Nullable String caller, IFile file, Path path) {
    String moduleString = caller == null ? "" : " in " + caller;
    LOG.debug(String.format("Can't load class path item %s%s.%s", path, moduleString, file.isDirectory() ? " Execute make in IDEA." : ""));
  }
}
