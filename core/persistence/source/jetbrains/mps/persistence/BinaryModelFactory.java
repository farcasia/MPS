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

import jetbrains.mps.extapi.model.GeneratableSModel;
import jetbrains.mps.extapi.model.SModelBase;
import jetbrains.mps.extapi.model.SModelData;
import jetbrains.mps.extapi.persistence.datasource.PreinstalledDataSourceTypes;
import jetbrains.mps.generator.ModelDigestUtil;
import jetbrains.mps.persistence.MetaModelInfoProvider.MetaInfoLoadingOption;
import jetbrains.mps.persistence.MetaModelInfoProvider.RegularMetaModelInfo;
import jetbrains.mps.persistence.MetaModelInfoProvider.StuffedMetaModelInfo;
import jetbrains.mps.persistence.binary.BinaryPersistence;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModelHeader;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.smodel.loading.ModelLoadResult;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.smodel.persistence.def.ModelReadException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.annotations.Internal;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelName;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.persistence.DataSource;
import org.jetbrains.mps.openapi.persistence.ModelCreationException;
import org.jetbrains.mps.openapi.persistence.ModelFactory;
import org.jetbrains.mps.openapi.persistence.ModelFactoryType;
import org.jetbrains.mps.openapi.persistence.ModelLoadException;
import org.jetbrains.mps.openapi.persistence.ModelLoadingOption;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;
import org.jetbrains.mps.openapi.persistence.UnsupportedDataSourceException;
import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * evgeny, 11/20/12
 */
public class BinaryModelFactory implements ModelFactory, IndexAwareModelFactory {
  @NotNull
  private static PersistenceFacade FACADE() {
    return PersistenceFacade.getInstance();
  }

  @Internal
  public BinaryModelFactory() {
    // do not delete, it is a java service
  }

  @NotNull
  @Override
  public SModel load(@NotNull DataSource dataSource, @NotNull Map<String, String> options) throws IOException {
    try {
      if (Boolean.parseBoolean(options.get(MetaModelInfoProvider.OPTION_KEEP_READ_METAINFO))) {
        return load(dataSource, MetaInfoLoadingOption.KEEP_READ);
      }
      return load(dataSource);
    } catch (ModelLoadException e) {
      throw new IOException(e);
    }
  }

  @NotNull
  @Override
  public SModel create(@NotNull DataSource dataSource, @NotNull Map<String, String> options) throws IOException {
    String modelName = options.get(OPTION_MODELNAME);
    if (modelName == null) {
      throw new IOException("Model name is not provided");
    }
    try {
      return create(dataSource, new SModelName(modelName));
    } catch (ModelCreationException e) {
      throw new IOException(e);
    }
  }

  @Override
  public boolean canCreate(@NotNull DataSource dataSource, @NotNull Map<String, String> options) {
    return dataSource instanceof StreamDataSource;
  }

  @Override
  public boolean supports(@NotNull DataSource dataSource) {
    return dataSource instanceof StreamDataSource;
  }

  @NotNull
  @Override
  public SModel create(@NotNull DataSource dataSource,
                       @NotNull SModelName modelName,
                       @NotNull ModelLoadingOption... options) throws
                                                               UnsupportedDataSourceException,
                                                               ModelCreationException {
    if (!supports(dataSource)) {
      throw new UnsupportedDataSourceException(dataSource);
    }

    StreamDataSource source = (StreamDataSource) dataSource;
    final SModelHeader header = new SModelHeader();
    SModelReference newModelRef = FACADE().createModelReference(null, SModelId.generate(), modelName.getValue());
    header.setModelReference(newModelRef);
    return new DefaultSModelDescriptor(new PersistenceFacility(this, source), header);
  }

  @NotNull
  @Override
  public SModel load(@NotNull DataSource dataSource, @NotNull ModelLoadingOption... options) throws UnsupportedDataSourceException,
                                                                                                    ModelLoadException {
    if (!supports(dataSource)) {
      throw new UnsupportedDataSourceException(dataSource);
    }

    StreamDataSource source = (StreamDataSource) dataSource;
    SModelHeader binaryModelHeader;
    try {
      binaryModelHeader = BinaryPersistence.readHeader(source);
    } catch (ModelReadException e) {
      throw new ModelLoadException("Could not read the model header while loading from the '" + dataSource + "'", Collections.emptyList(),
                                   getCause(e));
    }
    if (Arrays.asList(options).contains(MetaInfoLoadingOption.KEEP_READ)) {
      binaryModelHeader.setMetaInfoProvider(new StuffedMetaModelInfo(new RegularMetaModelInfo(binaryModelHeader.getModelReference())));
    }
    return new DefaultSModelDescriptor(new PersistenceFacility(this, source), binaryModelHeader);
  }

  private Throwable getCause(ModelReadException e) {
    Throwable cause;
    if (e.getCause() instanceof IOException) {
      cause = e.getCause();
    } else {
      cause = e;
    }
    return cause;
  }

  @Override
  public boolean needsUpgrade(@NotNull DataSource dataSource) throws IOException {
    return false;
  }

  @Override
  public void upgrade(@NotNull DataSource dataSource) throws IOException {
    // no-op
  }

  @Override
  public void save(@NotNull SModel model, @NotNull DataSource dataSource) throws IOException {
    if (!(dataSource instanceof StreamDataSource)) {
      throw new UnsupportedDataSourceException(dataSource);
    }
    BinaryPersistence.writeModel(((SModelBase) model).getSModel(), (StreamDataSource) dataSource);
  }

  @Override
  public boolean isBinary() {
    return true;
  }

  @Override
  public String getFileExtension() {
    return MPSExtentions.MODEL_BINARY;
  }

  @NotNull
  @Override
  public String getFormatTitle() {
    return "Universal binary format";
  }

  @NotNull
  @Override
  public ModelFactoryType getType() {
    return PreinstalledModelFactoryTypes.BINARY;
  }

  @NotNull
  @Override
  public List<DataSourceType> getPreferredDataSourceTypes() {
    return Collections.singletonList(PreinstalledDataSourceTypes.BINARY);
  }

  @Override
  public void index(@NotNull InputStream input, @NotNull Callback callback) throws IOException {
    BinaryPersistence.index(input, callback);
  }

  @Override
  public SModelData parseSingleStream(@NotNull String name, @NotNull InputStream input) throws IOException {
    return BinaryPersistence.getModelData(input);
  }

  public static Map<String, String> getDigestMap(@NotNull StreamDataSource source) {
    try {
      SModelHeader binaryModelHeader = BinaryPersistence.readHeader(source);
      binaryModelHeader.setMetaInfoProvider(new StuffedMetaModelInfo(new RegularMetaModelInfo(binaryModelHeader.getModelReference())));
      final ModelLoadResult loadedModel = BinaryPersistence.readModel(binaryModelHeader, source, false);
      Map<String, String> result = BinaryPersistence.getDigestMap(loadedModel.getModel(), binaryModelHeader.getMetaInfoProvider());
      result.put(GeneratableSModel.FILE, ModelDigestUtil.hashBytes(source.openInputStream()));
      return result;
    } catch (ModelReadException ignored) {
      /* ignore */
    } catch (IOException ignored) {
      /* ignore */
    }
    return null;
  }

  /**
   * This is provisional workaround to deal with performance tuning in jps/plugin (see CachedRepositoryData, CachedModelData)
   * where header is serialized to get passed to another process, where model is instantiated without need to read model file.
   *
   * If there's real benefit in this optimization (commit comment suggests it's 0.5 second in process startup time, which doesn't look too much, imo)
   * this serialization shall be addressed with an object supplied by descriptor itself, rather than by external means, so that full control over
   * serialize/restore is inside implementation, and all the internal stuff (like model header) doesn't get exposed.
   * FIXME revisit, reconsider approach
   */
  public static SModel createFromHeader(@NotNull SModelHeader header, @NotNull StreamDataSource dataSource) {
    final ModelFactory modelFactory = FACADE().getModelFactory(MPSExtentions.MODEL_BINARY);
    assert modelFactory instanceof BinaryModelFactory;
    return new DefaultSModelDescriptor(new PersistenceFacility((BinaryModelFactory) modelFactory, dataSource), header.createCopy());
  }

  private static class PersistenceFacility extends LazyLoadFacility {
    /*package*/ PersistenceFacility(BinaryModelFactory modelFactory, StreamDataSource dataSource) {
      super(modelFactory, dataSource);
    }

    @NotNull
    @Override
    public StreamDataSource getSource() {
      return (StreamDataSource) super.getSource();
    }

    @Override
    public Map<String, String> getGenerationHashes() {
      Map<String, String> generationHashes = ModelDigestHelper.getInstance().getGenerationHashes(getSource());
      if (generationHashes != null) return generationHashes;

      return BinaryModelFactory.getDigestMap(getSource());
    }

    @NotNull
    @Override
    public SModelHeader readHeader() throws ModelReadException {
      return BinaryPersistence.readHeader(getSource());
    }

    @NotNull
    @Override
    public ModelLoadResult readModel(@NotNull SModelHeader header, @NotNull ModelLoadingState state) throws ModelReadException {
      return BinaryPersistence.readModel(header, getSource(), state == ModelLoadingState.INTERFACE_LOADED);
    }

    @Override
    public boolean doesSaveUpgradePersistence(@NotNull SModelHeader header) {
      // binary persistence doesn't have versions yet
      return false;
    }

    @Override
    public void saveModel(@NotNull SModelHeader header, SModelData modelData) throws IOException {
      BinaryPersistence.writeModel((jetbrains.mps.smodel.SModel) modelData, getSource());
    }
  }
}
