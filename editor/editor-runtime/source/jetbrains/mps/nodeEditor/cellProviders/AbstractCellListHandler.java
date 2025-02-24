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
package jetbrains.mps.nodeEditor.cellProviders;

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import jetbrains.mps.editor.runtime.descriptor.EditorBuilderEnvironment;
import jetbrains.mps.editor.runtime.impl.cellActions.CommentUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.nodeEditor.cellActions.CellAction_InsertIntoCollection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.mps.openapi.model.SNode;

import java.util.Iterator;
import java.util.List;

public abstract class AbstractCellListHandler extends AbstractEditorBuilder implements EditorBuilderEnvironment {
  public static final String ELEMENT_CELL_ACTIONS_SET = "element-cell-actions-set";

  /**
   * @deprecated since MPS 3.5 use {@link #getNode()} method, this field will become private in the next release
   */
  @Deprecated
  protected SNode myOwnerNode;
  /**
   * @deprecated since MPS 3.5 use {@link #getEditorContext()} method, this field will become private in the next release
   */
  @Deprecated
  protected EditorContext myEditorContext;
  protected EditorCell_Collection myListEditorCell_Collection;
  protected String myElementRole;

  public AbstractCellListHandler(String elementRole, EditorContext editorContext) {
    super(editorContext);
    myElementRole = elementRole;
    myEditorContext = editorContext;
  }

  /**
   * @deprecated since MPS 3.5 use {@link #AbstractCellListHandler(String, EditorContext)}
   */
  @Deprecated
  public AbstractCellListHandler(SNode ownerNode, String elementRole, EditorContext editorContext) {
    this(elementRole, editorContext);
    myOwnerNode = ownerNode;
  }

  /**
   * @deprecated since MPS 3.5 use {@link #getNode()} method
   */
  @Deprecated
  public SNode getOwner() {
    return myOwnerNode;
  }

  public String getElementRole() {
    return myElementRole;
  }

  protected abstract SNode getAnchorNode(EditorCell anchorCell);

  protected abstract void doInsertNode(SNode nodeToInsert, SNode anchorNode, boolean insertBefore);

  public void insertNewChild(EditorContext editorContext, EditorCell anchorCell, boolean insertBefore) {
    SNode anchorNode = getAnchorNode(anchorCell);
    SNode nodeToInsert = createNodeToInsert(editorContext);
    doInsertNode(nodeToInsert, anchorNode, insertBefore);
  }

  public EditorCell createNodeCell(SNode node) {
    // TODO: after MPS 3.5 make this method abstract
    return createNodeCell(getEditorContext(), node);
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createNodeCell(SNode)}
   */
  @Deprecated
  public EditorCell createNodeCell(EditorContext editorContext, SNode node) {
    return null;
  }

  protected EditorCell createSeparatorCell(SNode prevNode, SNode nextNode) {
    return createSeparatorCell(getEditorContext(), prevNode, nextNode);
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createSeparatorCell(SNode, SNode)}
   */
  @Deprecated
  protected EditorCell createSeparatorCell(EditorContext editorContext, SNode prevNode, SNode nextNode) {
    return null;
  }

  protected EditorCell createEmptyCell() {
    // TODO: after MPS 3.5 make this method abstract
    return createEmptyCell(getEditorContext());
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createEmptyCell()}
   */
  @Deprecated
  protected EditorCell createEmptyCell(EditorContext editorContext) {
    return null;
  }

  public abstract SNode createNodeToInsert(EditorContext editorContext);

  public EditorCell_Collection createCells_Vertical(EditorContext editorContext) {
    return createCells(editorContext, new CellLayout_Vertical());
  }

  public EditorCell_Collection createCells_Horizontal(EditorContext editorContext) {
    return createCells(editorContext, new CellLayout_Horizontal());
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createCells(CellLayout, boolean)}
   */
  @Deprecated
  public EditorCell_Collection createCells(EditorContext editorContext, CellLayout cellLayout, boolean selectable) {
    return createCells(cellLayout, selectable);
  }

  public EditorCell_Collection createCells(CellLayout cellLayout, boolean selectable) {
    EditorCell_Collection cellsCollection = createCells(cellLayout);
    if (!selectable) {
      return cellsCollection;
    }

    // if the list compartment is selectable - create wrapping cell collection around it so
    // that actions intended to work for the list element do not work for the list owner.
    EditorCell_Collection wrapperCell = EditorCell_Collection.create(getEditorContext(), getNode(), new CellLayout_Horizontal(), null);
    wrapperCell.setSelectable(true);
    wrapperCell.addEditorCell(cellsCollection);
    return wrapperCell;
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createCells(CellLayout)}
   */
  @Deprecated
  public EditorCell_Collection createCells(EditorContext editorContext, CellLayout cellLayout) {
    return createCells(cellLayout);
  }

  public EditorCell_Collection createCells(CellLayout cellLayout) {
    myListEditorCell_Collection = EditorCell_Collection.create(getEditorContext(), getNode(), cellLayout, this);
    myListEditorCell_Collection.setSelectable(false);

    createInnerCells();

    // add insert/insert-before actions
    myListEditorCell_Collection.setAction(CellActionType.INSERT, new CellAction_InsertIntoCollection(this, false));
    myListEditorCell_Collection.setAction(CellActionType.INSERT_BEFORE, new CellAction_InsertIntoCollection(this, true));

    return myListEditorCell_Collection;
  }

  /**
   * @deprecated since MPS 3.5 use {@link #createInnerCells()}
   */
  protected void createInnerCells(SNode node, EditorContext editorContext) {
    //TODO: after MPS 3.5 remove createInnerCells(SNode node, EditorContext editorContext) & inline it here.
    createInnerCells(getNode(), getEditorContext());
  }

  protected void createInnerCells() {
    Iterator<? extends SNode> listNodes = getNodesForList().iterator();
    if (!listNodes.hasNext()) {
      EditorCell emptyCell = createEmptyCell();
      emptyCell.setRole(getElementRole());
      myListEditorCell_Collection.addEditorCell(emptyCell);
    } else {
      SNode prevNode = null;
      while (listNodes.hasNext()) {
        SNode nextNode = listNodes.next();
        addSeparatorCell(prevNode, nextNode);
        myListEditorCell_Collection.addEditorCell(createNodeCell(nextNode));
        prevNode = nextNode;
      }
    }
  }

  protected abstract List<? extends SNode> getNodesForList();

  private void addSeparatorCell(SNode prevNode, SNode nextNode) {
    if (prevNode == null || AttributeOperations.isChildAttribute(nextNode) && !CommentUtil.isComment(nextNode)) {
      return;
    }
    EditorCell separatorCell = createSeparatorCell(prevNode, nextNode);
    if (separatorCell != null) {
      myListEditorCell_Collection.addEditorCell(separatorCell);
    }
  }
}
