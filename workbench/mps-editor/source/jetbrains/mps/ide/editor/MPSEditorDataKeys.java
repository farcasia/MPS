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
package jetbrains.mps.ide.editor;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.DataKey;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.openapi.editor.Editor;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;

/**
 * evgeny, 11/18/11
 */
public class MPSEditorDataKeys extends MPSCommonDataKeys {
  @Description(description = "current editor")
  public static final DataKey<Editor> MPS_EDITOR = DataKey.create("MPS_IEditor");

  @Description(description = "editor context")
  public static final DataKey<EditorContext> EDITOR_CONTEXT = DataKey.create("MPS_EditorContext");

  @Description(description = "current editor cell")
  public static final DataKey<EditorCell> EDITOR_CELL = DataKey.create("MPS_EditorCell");
  @Description(description = "editor create actions")
  public static final DataKey<ActionGroup> EDITOR_CREATE_GROUP = DataKey.create("MPS_EditorCreateGroup");

  @Description(description = "current editor component")
  public static final DataKey<EditorComponent> EDITOR_COMPONENT = DataKey.create("MPS_EditorComponent");
}
