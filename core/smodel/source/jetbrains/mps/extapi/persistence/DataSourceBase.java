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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.persistence.DataSource;
import org.jetbrains.mps.openapi.persistence.DataSourceListener;
import org.jetbrains.mps.openapi.persistence.datasource.DataSourceType;

/**
 * A base convenience class for data sources with empty implementations for all methods.
 */
public abstract class DataSourceBase implements DataSource {

  @Override
  public void addListener(@NotNull DataSourceListener listener) {
  }

  @Override
  public void removeListener(@NotNull DataSourceListener listener) {
  }

  @Nullable
  @Override
  public DataSourceType getType() {
    return null;
  }

  @Override
  public long getTimestamp() {
    return 0;
  }

  public void refresh() {
  }

  @NotNull
  @Override
  public String getLocation() {
    return "unknown";
  }

  @Override
  public boolean isReadOnly() {
    return true;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "; Location: " + getLocation();
  }
}
