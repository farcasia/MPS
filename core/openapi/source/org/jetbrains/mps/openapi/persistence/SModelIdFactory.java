/*
 * Copyright 2003-2013 JetBrains s.r.o.
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
package org.jetbrains.mps.openapi.persistence;

import org.jetbrains.mps.openapi.model.SModelId;

/**
 *  Factories that create SModelId. They are registered through PersistenceFacade and associated with model id types.
 */
public interface SModelIdFactory {

  /**
   *  Given a serialized representation (without a type+colon prefix), creates an Immutable class.
   *  @throws IllegalArgumentException if this factory can't parse given value
   */
  SModelId create(String text);
}
