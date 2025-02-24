/*
 * Copyright 2003-2016 JetBrains s.r.o.
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
package jetbrains.mps.openapi.editor.menus.transformation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ActionItemBase implements ActionItem {
  @Nullable
  @Override
  public String getLabelText(String pattern) {
    return null;
  }

  @Override
  public void execute(@NotNull String pattern) {
  }

  @NotNull
  @Override
  public CommandPolicy getCommandPolicy() {
    return CommandPolicy.COMMAND_REQUIRED;
  }

  @Override
  public <ResultT> ResultT accept(TransformationMenuItemVisitor<ResultT> visitor) {
    return visitor.visit(this);
  }
}
