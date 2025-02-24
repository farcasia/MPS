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
package jetbrains.mps.extapi.persistence;

import jetbrains.mps.extapi.persistence.datasource.DataSourceFactoryFromName;
import jetbrains.mps.util.FileUtil;
import org.jetbrains.mps.openapi.persistence.NullDataSource.NullDataSourceType;
import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;
import jetbrains.mps.extapi.persistence.datasource.DataSourceFactoryRuleService;
import org.jetbrains.mps.openapi.persistence.datasource.FileExtensionDataSourceType;
import jetbrains.mps.util.annotation.ToRemove;
import jetbrains.mps.vfs.FileSystemEvent;
import jetbrains.mps.vfs.FileSystemListener;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.persistence.DataSourceListener;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;
import org.jetbrains.mps.openapi.util.ProgressMonitor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * A data source which points explicitly to the single file location.
 * Currently it also knows something about vfs (listens to the events)
 * but it is going to be cleared away.
 * Also it is worth considering the merging of this notion with the <code>FolderDataSource</code>
 * and others which points to some files on the file system.
 * It seems that it is unnecessary to separate these entities [as soon as there is no additional vfs functionality]
 * AP
 *
 * @author evgeny, 11/2/12
 */
public class FileDataSource extends DataSourceBase implements StreamDataSource, FileSystemListener, FileSystemBasedDataSource {
  private final Object LOCK = new Object();
  private List<DataSourceListener> myListeners = new ArrayList<DataSourceListener>();

  @NotNull private IFile myFile;
  final ModelRoot myModelRoot; // fixme is needed only for the file system dependencies, to be removed

  /**
   * @deprecated see below
   */
  @Deprecated
  @ToRemove(version = 3.5) // will become package-private
  public FileDataSource(@NotNull IFile file) {
    this(file, null);
  }

  /**
   * FIXME remove modelRoot parameter
   * @param modelRoot (optional) containing model root, which should be notified before the source during the update
   *
   * @deprecated use {@link DataSourceFactoryRuleService#getFactory} AND
   *             {@link DataSourceFactoryFromName#create}
   */
  @ToRemove(version = 3.5)
  @Deprecated
  public FileDataSource(@NotNull IFile file, @Nullable ModelRoot modelRoot) {
    myFile = file;
    myModelRoot = modelRoot;
  }

  @NotNull
  public IFile getFile() {
    return myFile;
  }

  public void setFile(@NotNull IFile file) {
    synchronized (LOCK) {
      if (!(myListeners.isEmpty())) {
        stopListening();
        myFile = file;
        startListening();
      }
    }
  }

  @Override
  public boolean isReadOnly() {
    return myFile.isInArchive() || myFile.isReadOnly();
  }

  @NotNull
  @Override
  public String getLocation() {
    return myFile.toString();
  }

  @Override
  public InputStream openInputStream() throws IOException {
    return myFile.openInputStream();
  }

  @Override
  public OutputStream openOutputStream() throws IOException {
    return myFile.openOutputStream();
  }

  @Override
  public void refresh() {
    myFile.refresh();
  }

  @Override
  public long getTimestamp() {
    if (!myFile.exists()) return -1;
    return myFile.lastModified();
  }

  @Override
  public final void addListener(@NotNull DataSourceListener listener) {
    synchronized (LOCK) {
      if (myListeners.isEmpty()) {
        startListening();
      }
      myListeners.add(listener);
    }
  }

  protected void startListening() {
    myFile.getFileSystem().addListener(this);
  }

  @Override
  public final void removeListener(@NotNull DataSourceListener listener) {
    synchronized (LOCK) {
      myListeners.remove(listener);
      if (myListeners.isEmpty()) {
        stopListening();
      }
    }
  }

  @Override
  public void delete() {
    if (myFile.exists() && !isReadOnly()) {
      myFile.delete();
    }
  }

  protected void stopListening() {
    myFile.getFileSystem().removeListener(this);
  }

  @NotNull
  @Override
  public IFile getFileToListen() {
    return myFile;
  }

  @Override
  public Iterable<FileSystemListener> getListenerDependencies() {
    FileSystemListener parentListener = getParentListener();
    if (parentListener != null) {
      return Collections.singleton(parentListener);
    }
    return null;
  }

  FileSystemListener getParentListener() {
    if (myModelRoot instanceof FileSystemListener) {
      return (FileSystemListener) myModelRoot;
    }
    if (myModelRoot != null && myModelRoot.getModule() instanceof FileSystemListener) {
      return (FileSystemListener) myModelRoot.getModule();
    }
    return null;
  }

  @Override
  public void update(ProgressMonitor monitor, @NotNull FileSystemEvent event) {
    for (IFile file : event.getChanged()) {
      if (file.equals(myFile)) {
        fireChanged(monitor);
        break;
      }
    }
    // ignore, deletion is handled by model roots
  }

  protected void fireChanged(ProgressMonitor monitor) {
    List<DataSourceListener> listeners;
    synchronized (LOCK) {
      listeners = new ArrayList<>(myListeners);
    }
    monitor.start("Reloading", listeners.size());
    try {
      for (DataSourceListener l : listeners) {
        l.changed(this);
        monitor.advance(1);
      }
    } finally {
      monitor.done();
    }
  }

  @NotNull
  @Override
  public Collection<IFile> getAffectedFiles() {
    return Collections.singleton(myFile);
  }

  @NotNull
  @Override
  public DataSourceType getType() {
    String extension = FileUtil.getExtension(myFile.getPath());
    if (extension == null) {
      return NullDataSourceType.INSTANCE;
    }
    return FileExtensionDataSourceType.of(extension);
  }
}
