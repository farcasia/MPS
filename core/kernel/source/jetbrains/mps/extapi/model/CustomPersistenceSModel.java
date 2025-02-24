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
package jetbrains.mps.extapi.model;

import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.extapi.persistence.FileWithBackupDataSource;
import jetbrains.mps.smodel.InvalidSModel;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModel.Problem.Kind;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.DataSource;
import org.jetbrains.mps.openapi.persistence.ModelSaveException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 */
public final class CustomPersistenceSModel extends EditableSModelBase implements SingleRootSModel {
  @NotNull
  private final SModelPersistence myPersistence;
  private volatile SModel myModel = null;
  private Iterable<Problem> myProblems = Collections.emptySet();

  public CustomPersistenceSModel(@NotNull SModelReference modelReference, @NotNull StreamDataSource source, @NotNull SModelPersistence persistence) {
    super(modelReference, source instanceof FileDataSource
                          ? FileWithBackupDataSource.create((FileDataSource) source)
                          : source);
    myPersistence = persistence;
  }

  @NotNull
  @Override
  public StreamDataSource getSource() {
    return (StreamDataSource) super.getSource();
  }

  @Override
  protected SModel getCurrentModelInternal() {
    return myModel;
  }

  @Override
  public SModel getSModelInternal() {
    if (myModel == null) {
      final ModelLoadingState oldState;
      synchronized (this) {
        oldState = getLoadingState();
        if (myModel == null) {
          myModel = loadSModel();
          myModel.setModelDescriptor(this);
          setLoadingState(ModelLoadingState.FULLY_LOADED);
        }
      }
      fireModelStateChanged(oldState, getLoadingState());
    }
    return myModel;
  }

  private IFile getBackupFile(boolean ifExists) {
    StreamDataSource source = getSource();
    if (source instanceof FileWithBackupDataSource) {
      IFile brokenFile = ((FileWithBackupDataSource) source).getBackupFile();
      if (!ifExists || brokenFile.exists()) {
        return brokenFile;
      }
    }
    return null;
  }

  private SModel loadSModel() {
    DataSource source = getSource();
    if (!source.isReadOnly() && source.getTimestamp() == -1) {
      // no file on disk
      return (SModel) myPersistence.createEmpty(getReference(), getSource());
    }

    try {
      IFile brokenFile = getBackupFile(true);
      if (brokenFile != null) {
        long l = ((FileDataSource) getSource()).getFile().lastModified();
        if (l > 0 && brokenFile.lastModified() > l) {
          SModelBase brokenModel = (SModelBase) PersistenceFacade.getInstance().getDefaultModelFactory().load(
              new FileDataSource(brokenFile, null), Collections.<String, String>emptyMap());
          brokenModel.load();
          // force save
          setChanged(true);
          return brokenModel.getSModel();
        }
      }
      return (SModel) myPersistence.readModel(getReference(), getSource());
    } catch (IOException e) {
      return new StubModel(getReference(), e);
    }
  }

  @Override
  protected void doUnload() {
    super.doUnload();
    myModel = null;
  }

  @Override
  protected void reloadContents() {
    assertCanChange();

    if (!isLoaded()) {
      return;
    }

    final SModel oldModel = myModel;
    myModel = loadSModel();
    oldModel.setModelDescriptor(null);
    myModel.setModelDescriptor(this);
    oldModel.dispose();
    setChanged(false);

    // XXX loadSModel() doesn't change loading state (though it's wrong, as reload might load empty model)
    //     hence no fireModelStateChanged() call here
    fireModelReplaced();
  }

  @Override
  protected boolean saveModel() throws ModelSaveException, IOException {
    SModel smodel = getSModel();
    if (smodel instanceof InvalidSModel) {
      // we do not save stub model to not overwrite the real model
      return false;
    }
    try {
      myPersistence.writeModel(smodel, getSource());
      IFile brokenFile = getBackupFile(true);
      if (brokenFile != null) {
        brokenFile.delete();
      }
      myProblems = Collections.emptySet();
    } catch (ModelSaveException e) {
      IFile brokenFile = getBackupFile(false);
      try {
        PersistenceFacade.getInstance().getDefaultModelFactory().save(this, new FileDataSource(brokenFile, null));
      } catch (ModelSaveException ignore) {
      } catch (IOException ignore) {
      }
      myProblems = e.getProblems();
      throw e;
    }
    return false;
  }

  @Override
  public SNode getRoot() {
    Iterator<SNode> iterator = getRootNodes().iterator();
    return iterator.hasNext() ? iterator.next() : null;
  }

  @NotNull
  @Override
  public Iterable<Problem> getProblems() {
    return IterableUtil.merge(myProblems, super.getProblems());
  }

  public static class StubModel extends jetbrains.mps.smodel.SModel implements InvalidSModel {
    private IOException myCause;

    public StubModel(@NotNull SModelReference modelReference, @Nullable IOException cause) {
      super(modelReference);
      myCause = cause;
    }

    @NotNull
    @Override
    public Iterable<Problem> getProblems() {
      return Collections.<Problem>singleton(
          new PersistenceProblem(Kind.Load, myCause == null ? "Couldn't read model." : "Cannot load. I/O problem: " + myCause.getMessage(), null,
              true));
    }
  }
}
