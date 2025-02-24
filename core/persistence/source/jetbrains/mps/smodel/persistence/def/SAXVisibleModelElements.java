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
package jetbrains.mps.smodel.persistence.def;

import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.util.HashMap;
import java.util.Map;

/**
 * Evgeny Gryaznov, Aug 6, 2010
 */
public class SAXVisibleModelElements implements VisibleModelElements {

  private Map<Integer, SModelReference> myVisibleModelElements = new HashMap<Integer, SModelReference>();

  @Override
  public SModelReference getModelUID(int index) {
    return myVisibleModelElements.get(index);
  }

  public void addVisible(int index, String modelUID) {
    myVisibleModelElements.put(index, PersistenceFacade.getInstance().createModelReference(modelUID));
  }

  @Override
  public int getVisibleModelIndex(SModelReference targetModelReference) {
    throw new UnsupportedOperationException();
  }
}
