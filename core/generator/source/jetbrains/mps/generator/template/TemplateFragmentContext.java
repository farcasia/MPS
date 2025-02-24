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
package jetbrains.mps.generator.template;

import jetbrains.mps.generator.runtime.TemplateContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;

public class TemplateFragmentContext extends TemplateQueryContextWithMacro {
  private SNode myMainContextNode;

  /**
   * @since 3.1
   */
  public TemplateFragmentContext(@NotNull TemplateContext context, @NotNull SNode mainContextNode, @NotNull SNodeReference tfMacro) {
    super(context, tfMacro);
    myMainContextNode = mainContextNode;
  }

  /**
   * 'mainContextNode' mapping
   */
  public SNode getMainContextNode() {
    return myMainContextNode;
  }
}
