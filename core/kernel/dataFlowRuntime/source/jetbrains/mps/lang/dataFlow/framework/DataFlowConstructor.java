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
package jetbrains.mps.lang.dataFlow.framework;

import org.jetbrains.mps.openapi.model.SNode;

import java.util.Collection;
import java.util.Collections;

public interface DataFlowConstructor {
  boolean isApplicable(SNode node);
  void performActions(Program program, SNode node);
  default Collection<IDataFlowModeId> getModes(){
    return Collections.emptyList();
  }
}
