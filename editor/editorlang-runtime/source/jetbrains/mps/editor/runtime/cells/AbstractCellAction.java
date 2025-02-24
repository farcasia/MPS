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
package jetbrains.mps.editor.runtime.cells;

import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellAction;

/**
 * User: shatalin
 * Date: 2/12/13
 */
public abstract class AbstractCellAction implements CellAction {
  private boolean myExecuteInCommand = true;

  public AbstractCellAction() {
  }

  protected AbstractCellAction(boolean executeInCommand) {
    myExecuteInCommand = executeInCommand;
  }

  @Override
  public String getDescriptionText() {
    return "no description : " + this.getClass().getName();
  }

  @Override
  public boolean executeInCommand() {
    return myExecuteInCommand;
  }

  @Override
  public boolean canExecute(EditorContext context) {
    return true;
  }
}
