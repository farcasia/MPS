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
package jetbrains.mps.codeStyle;

import com.intellij.codeStyle.DefaultCodeStyleFacade;
import com.intellij.openapi.project.Project;
import jetbrains.mps.baseLanguage.util.CodeStyleSettings;
import jetbrains.mps.baseLanguage.util.CodeStyleSettingsRegistry;
import jetbrains.mps.ide.project.ProjectHelper;

public class MPSCodeStyleFacade extends DefaultCodeStyleFacade {
  private final Project myProject;

  public MPSCodeStyleFacade() {
    this(null);
  }

  public MPSCodeStyleFacade(Project project) {
    myProject = project;
  }

  @Override
  public String getLineSeparator() {
    final CodeStyleSettings settings = CodeStyleSettingsRegistry.getSettings(ProjectHelper.fromIdeaProject(myProject));
    return settings != null ? settings.getLineSeparatorValue() : System.lineSeparator();
  }
}
