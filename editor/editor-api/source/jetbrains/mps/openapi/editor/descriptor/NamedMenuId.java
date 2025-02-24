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
package jetbrains.mps.openapi.editor.descriptor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

/**
 * Uniquely identifies a named transformation menu - contains concept and menu name
 */
public class NamedMenuId {
  @NotNull
  private final SAbstractConcept myConcept;
  @NotNull
  private final String myFqName;

  public NamedMenuId(@NotNull SAbstractConcept concept, @NotNull String fqName) {
    myConcept = concept;
    myFqName = fqName;
  }

  @NotNull
  public SAbstractConcept getConcept() {
    return myConcept;
  }

  @NotNull
  public String getFqName() {
    return myFqName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    NamedMenuId that = (NamedMenuId) o;

    return myConcept.equals(that.myConcept) && myFqName.equals(that.myFqName);

  }

  @Override
  public int hashCode() {
    int result = myConcept.hashCode();
    result = 31 * result + myFqName.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return myFqName + " for " + myConcept;
  }
}
