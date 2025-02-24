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
package jetbrains.mps.nodeEditor.selection;

import jetbrains.mps.openapi.editor.EditorComponent;
import jetbrains.mps.openapi.editor.selection.Selection;
import jetbrains.mps.openapi.editor.selection.SelectionListener;
import jetbrains.mps.openapi.editor.selection.SingularSelection;

public abstract class SingularSelectionListenerAdapter implements SelectionListener {
  @Override
  public void selectionChanged(EditorComponent editorComponent, Selection oldSelection, Selection newSelection) {
    if (oldSelection == newSelection) {
      return;
    }
    if (oldSelection instanceof SingularSelection) {
      selectionChangedFrom(editorComponent, (SingularSelection) oldSelection);
    }
    if (newSelection instanceof SingularSelection) {
      selectionChangedTo(editorComponent, (SingularSelection) newSelection);
    }
  }

  protected void selectionChangedFrom(EditorComponent editorComponent, SingularSelection oldSelection) {
  }

  protected void selectionChangedTo(EditorComponent editorComponent, SingularSelection newSelection) {
  }
}
