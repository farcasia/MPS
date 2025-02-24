/*
 * Copyright 2003-2017 JetBrains s.r.o.
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
package org.jetbrains.mps.openapi.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SLanguage;

import java.util.Collection;
import java.util.Set;

public abstract class FacetsFacade {

  protected FacetsFacade() {
  }

  protected static FacetsFacade INSTANCE;

  /**
   * @deprecated Use respective {@code ComponentPlugin} (i.e. {@code MPSCore}) to obtain instance of the registry.
   */
  @Deprecated
  public static FacetsFacade getInstance() {
    return INSTANCE;
  }

  /**
   * Return set of all registered facet types
   */
  public abstract Set<String> getFacetTypes();

  /**
   * @deprecated use {@link #getApplicableFacetTypes(Collection)} instead
   */
  @Deprecated
  // ToRemove(version = 3.4)
  public abstract Set<String> getApplicableFacetTypes(Iterable<String> usedLanguages);

  /**
   * For the given set of languages, returns a set of recommended (see {@link #registerLanguageFacet(SLanguage, String)}) facet types.
   */
  public abstract Set<String> getApplicableFacetTypes(Collection<SLanguage> usedLanguages);

  /**
   * @deprecated use {@link #registerLanguageFacet(SLanguage, String)} instead
   */
  @Deprecated
  // ToRemove(version = 3.4)
  public abstract void registerLanguageFacet(String language, String facetType);

  /**
   *  Associates a facet with a language. Allows MPS to advise a user to turn on the facet for
   *  modules using this language.
   */
  public abstract void registerLanguageFacet(@NotNull SLanguage language, String facetType);

  /**
   * @deprecated use {@link #unregisterLanguageFacet(SLanguage, String)} instead
   */
  @Deprecated
  // ToRemove(version = 3.4)
  public abstract void unregisterLanguageFacet(String language, String facetType);

  public abstract void unregisterLanguageFacet(@NotNull SLanguage language, String facetType);

  /**
   * @param facetType facet kind we intend to instantiate
   * @return factory, if found for the given facet type.
   */
  @Nullable
  public abstract FacetFactory getFacetFactory(String facetType);

  public abstract void addFactory(@NotNull String facetType, FacetFactory factory);

  public abstract void removeFactory(FacetFactory factory);

  public interface FacetFactory {
    // FIXME why cast to ModuleFacetBase.setModule when we can pass SModule right into #create() here?
    SModuleFacet create();
  }
}
