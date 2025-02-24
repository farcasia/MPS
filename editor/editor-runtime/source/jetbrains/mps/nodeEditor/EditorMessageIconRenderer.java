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
package jetbrains.mps.nodeEditor;

import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.openapi.editor.EditorComponent;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SRepository;

import javax.swing.Icon;
import javax.swing.JPopupMenu;
import java.awt.Cursor;

public interface EditorMessageIconRenderer {

  Icon getIcon();

  String getTooltipText();

  /**
   * @return node, if any, this message icon is rendered for
   */
  @Nullable
  default SNodeReference getNodeReference() {
    SNode n = getNode();
    return n == null ? null : n.getReference();
  }

  /**
   * @deprecated implement {@link #getNodeReference()} instead
   */
  @Deprecated
  @ToRemove(version = 2017.3)
  default SNode getNode() {
    return null;
  }

  IconRendererType getType();

  /**
   * @return semantic cell this icon renderer is associated with
   */
  @Nullable
  default EditorCell getNodeCell(EditorComponent editorComponent) {
    SNodeReference nodeRef = getNodeReference();
    if (nodeRef == null) {
      return null;
    }
    final SRepository repo = editorComponent.getEditorContext().getRepository();
    return new ModelAccessHelper(repo).runReadAction(() -> {
      SNode n = nodeRef.resolve(repo);
      // intentionally look up under folded cells, client can check if cell is folded.
      return n == null ? null : editorComponent.findNodeCell(n, true);
    });
  }

  /**
   * @return cell this icon is painted relative to, defaults to {@link #getNodeCell(EditorComponent)}
   */
  @Nullable
  default EditorCell getAnchorCell(EditorComponent editorComponent) {
    // deprecated method is for compatibility, MPS code calls this one. Drop deprecated call once 2017.3 is out
    EditorCell nodeCell = getNodeCell(editorComponent);
    return nodeCell == null ? null : getAnchorCell(nodeCell);
  }

  /**
   * @deprecated Override {@link #getAnchorCell(EditorComponent)} instead. The method will be removed after 2017.3 release
   */
  @Deprecated
  @ToRemove(version = 2017.3)
  default EditorCell getAnchorCell(EditorCell cell) {
    return cell;
  }

  Cursor getMouseOverCursor();

  AnAction getClickAction();

  JPopupMenu getPopupMenu();

  public class IconRendererType {

    private final int myWeight;

    public IconRendererType(int weight) {
      myWeight = weight;
    }

    public int getWeight() {
      return myWeight;
    }
  }
}
