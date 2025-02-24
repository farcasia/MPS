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
package jetbrains.mps.ide.ui.tree;

import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author Evgeny Gerashchenko
 * @since 11/23/11
 */
public abstract class TreeHighlighterExtension {
  protected static ExtensionPointName<TreeHighlighterExtension> EP_NAME = new ExtensionPointName<TreeHighlighterExtension>("com.intellij.mps.treeCreationHandler");

  public static void attachHighlighters(MPSTree tree, @NotNull Project project) {
    if (project.isDefault()) return;
    for (TreeHighlighterExtension handler : Extensions.getExtensions(EP_NAME, project)) {
      handler.attach(tree);
    }
  }

  protected abstract void attach(MPSTree tree);
}
