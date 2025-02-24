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
package jetbrains.mps.openapi.editor.cells;

/**
 * User: shatalin
 * Date: 2/11/13
 */
public enum CellActionType {
  INSERT,
  INSERT_BEFORE,
  DELETE,
  BACKSPACE,
  DELETE_TO_WORD_END,
// TODO: DELETE_TO_WORD_START,

  COPY,
  CUT,
  PASTE,
  PASTE_BEFORE,
  PASTE_AFTER,

  LEFT,
  RIGHT,
  UP,
  DOWN,
  NEXT,
  PREV,
  HOME,
  END,
  PAGE_UP,
  PAGE_DOWN,
  ROOT_HOME,
  ROOT_END,
  LOCAL_HOME,
  LOCAL_END,

  SELECT_ALL,
  SELECT_LEFT,
  SELECT_RIGHT,
  SELECT_UP,
  SELECT_DOWN,
  SELECT_HOME,
  SELECT_END,
  SELECT_LOCAL_END,
  SELECT_LOCAL_HOME,
  SELECT_NEXT,
  SELECT_PREVIOUS,

  RIGHT_TRANSFORM,
  LEFT_TRANSFORM,

  COMPLETE,
  COMPLETE_SMART,

  FOLD,
  UNFOLD,
  FOLD_ALL,
  UNFOLD_ALL,
  FOLD_RECURSIVELY,
  UNFOLD_RECURSIVELY,
  TOGGLE_FOLDING,

  SHOW_MESSAGE,
  CLEAR_SELECTION,

  COMMENT,

  INSERT_PLACEHOLDER,
  INSERT_PLACEHOLDER_BEFORE,

  CLICK
}
