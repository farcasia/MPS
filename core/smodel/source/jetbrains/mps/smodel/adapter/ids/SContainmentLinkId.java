/*
 * Copyright 2003-2014 JetBrains s.r.o.
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
package jetbrains.mps.smodel.adapter.ids;

import org.jetbrains.annotations.NotNull;

public final class SContainmentLinkId extends SConceptFeatureId {
  private final long myLinkId;

  public SContainmentLinkId(@NotNull SConceptId conceptId, long linkId) {
    super(conceptId);
    myLinkId = linkId;
  }

  //we need it here for mbeddr to have time to migrate
  //todo remove
  public SConceptId getConceptId() {
    return super.getConceptId();
  }

  public long getIdValue () {
    return myLinkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SContainmentLinkId that = (SContainmentLinkId) o;

    if (myLinkId != that.myLinkId) return false;
    if (!getConceptId().equals(that.getConceptId())) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = getConceptId().hashCode();
    result = 31 * result + (int) (myLinkId ^ (myLinkId >>> 32));
    return result;
  }

  public String serialize() {
    return getConceptId().serialize() + "/" + myLinkId;
  }

  public static SContainmentLinkId deserialize(String s) {
    int split = s.lastIndexOf('/');
    SConceptId concept = SConceptId.deserialize(s.substring(0, split));
    long ref = Long.parseLong(s.substring(split + 1));
    return new SContainmentLinkId(concept, ref);
  }

  @Override
  public String toString() {
    return serialize();
  }
}
