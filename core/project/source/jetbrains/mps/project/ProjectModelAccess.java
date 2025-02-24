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
package jetbrains.mps.project;

import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModelAccessBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.repository.WriteActionListener;

/**
 * This class represents a ModelAccess for cases when there is an available project in scope.
 * Currently it delegates all command execution to the class {@link jetbrains.mps.smodel.ModelAccess}
 *
 * Created by Alex Pyshkin on 9/2/14.
 */
public class ProjectModelAccess extends ModelAccessBase {
  private final Project myProject;

  public ProjectModelAccess(Project project) {
    myProject = project;
  }

  @NotNull
  private ModelAccess getDelegate() {
    return ModelAccess.instance();
  }

  @Override
  public void executeCommand(Runnable r) {
    getDelegate().executeCommand(r, myProject);
  }

  @Override
  public void executeCommandInEDT(Runnable r) {
    getDelegate().runCommandInEDT(r, myProject);
  }

  @Override
  public void executeUndoTransparentCommand(Runnable r) {
    getDelegate().runUndoTransparentCommand(r, myProject);
  }

  @Override
  public boolean isCommandAction() {
    return getDelegate().isCommandAction();
  }
}
