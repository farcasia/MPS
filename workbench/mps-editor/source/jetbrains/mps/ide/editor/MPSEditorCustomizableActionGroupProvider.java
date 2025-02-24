/*
 * Copyright 2003-2017 JetBrains s.r.o.
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

import com.intellij.ide.ui.customization.CustomizableActionGroupProvider;
import jetbrains.mps.ide.actions.MPSActions;

public class MPSEditorCustomizableActionGroupProvider extends CustomizableActionGroupProvider {
  @Override
  public void registerGroups(CustomizableActionGroupRegistrar registrar) {
    registrar.addCustomizableActionGroup(MPSActions.EDITOR_POPUP_GROUP, "MPS Editor Popup Menu");
    registrar.addCustomizableActionGroup(MPSActions.EDITOR_ACTIONS_GROUP, "MPS Editor Actions");
    registrar.addCustomizableActionGroup(MPSActions.EDITOR_LEFTPANEL_GROUP, "MPS Editor Gutter Popup Menu");
    registrar.addCustomizableActionGroup(MPSActions.ACTIONS_AS_INTENTIONS_GROUP, "MPS Actions As Intentions");
  }
}
