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
package jetbrains.mps.smodel.adapter.structure.concept;

import org.jetbrains.mps.openapi.language.SDataType;

/**
 * Fixme implementation of SAbstractType methods
 */
public class SDataTypeAdapter implements SDataType {
  public SDataTypeAdapter() {
  }

  @Override
  public Object fromString(String string) {
    return string;
  }

  @Override
  public String toString(Object object) {
    return null;
  }
}
