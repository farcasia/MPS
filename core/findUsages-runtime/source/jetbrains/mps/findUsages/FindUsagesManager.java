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
package jetbrains.mps.findUsages;

import jetbrains.mps.components.CoreComponent;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.module.FindUsagesFacade;
import org.jetbrains.mps.openapi.module.SearchScope;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUsagesManager extends FindUsagesFacade implements CoreComponent {

  public static FindUsagesManager getInstance() {
    return (FindUsagesManager) INSTANCE;
  }

  @Override
  public Set<SReference> findUsages(@NotNull SearchScope scope, Set<SNode> nodes, ProgressMonitor monitor) {
    return findUsages(nodes, new UsagesSearchType(), scope, monitor);
  }

  @Override
  public Set<SNode> findInstances(@NotNull SearchScope scope, Set<? extends SAbstractConcept> concepts, boolean exact, ProgressMonitor monitor) {
    return findUsages(concepts, new InstancesSearchType(exact), scope, monitor);
  }

  @Override
  public Set<SModel> findModelUsages(@NotNull SearchScope scope, Set<SModelReference> modelReferences, ProgressMonitor monitor) {
    return findUsages(modelReferences, new ModelUsagesSearchType(), scope, monitor);
  }

  private  <T, R> Set<T> findUsages(Set<? extends R> elements, SearchType<T, R> type, SearchScope scope, @Nullable ProgressMonitor monitor) {
    if (monitor == null) monitor = new EmptyProgressMonitor();

    return type.search(new LinkedHashSet<R>(elements), scope, monitor);
  }

  @Override
  public void init() {
    if (INSTANCE != null) {
      throw new IllegalStateException("double initialization");
    }
    INSTANCE = this;
  }

  @Override
  public void dispose() {
    INSTANCE = null;
  }
}
