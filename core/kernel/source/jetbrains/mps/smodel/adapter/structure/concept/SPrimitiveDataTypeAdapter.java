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

import org.jetbrains.mps.openapi.language.SPrimitiveDataType;

public class SPrimitiveDataTypeAdapter implements SPrimitiveDataType {
  private int type;

  public SPrimitiveDataTypeAdapter(int type) {
    this.type = type;
  }

  @Override
  public int getType() {
    return this.type;
  }

  @Override
  public Object fromString(String string) {
    switch (type) {
      case SPrimitiveDataType.INT:
        return (string != null ? Integer.valueOf(string) : 0);
      case SPrimitiveDataType.BOOL:
        return Boolean.valueOf(string);
      default:
    }
    return string;
  }

  @Override
  public String toString(Object object) {
    return object.toString();
  }
}
