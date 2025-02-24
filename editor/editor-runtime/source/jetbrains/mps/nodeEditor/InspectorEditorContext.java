/*
 * Copyright 2003-2014 JetBrains s.r.o.
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
package jetbrains.mps.nodeEditor;

import jetbrains.mps.nodeEditor.configuration.EditorConfiguration;
import jetbrains.mps.openapi.editor.EditorComponentState;
import jetbrains.mps.openapi.editor.assist.ContextAssistantManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SRepository;

/**
 * User: shatalin
 * Date: 20/07/14
 */
public class InspectorEditorContext extends EditorContext {
  public InspectorEditorContext(EditorComponent editorComponent, @Nullable SModel model, @NotNull SRepository repository, EditorConfiguration configuration,
      ContextAssistantManager contextAssistantManager) {
    super(editorComponent, model, repository, configuration, contextAssistantManager);
  }

  @Override
  public EditorComponentState getEditorComponentState() {
    return new Memento(this, true);
  }
}
