/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package jetbrains.mps.nodeEditor.cells;

import jetbrains.mps.editor.runtime.commands.EditorCommand;
import jetbrains.mps.editor.runtime.impl.LayoutConstraints;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteInfoFilterDecorator;
import jetbrains.mps.openapi.editor.cells.CellInfo;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.openapi.editor.cells.SubstituteInfo;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.typesystem.inference.ITypeContextOwner;
import jetbrains.mps.typesystem.inference.TypeContextManager;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.ModelAccess;

import java.util.List;

/**
 * User: shatalin
 * Date: 12/19/12
 */
// TODO: Temporary adapter should be removed at the end of migration onto EditorCel API
public class APICellAdapter {
  public static boolean isPunctuationLayout(EditorCell cell) {
    return LayoutConstraints.PUNCTUATION_LAYOUT_CONSTRAINT.getName().equals(cell.getStyle().get(StyleAttributes.LAYOUT_CONSTRAINT));
  }

  public static void synchronizeViewWithModel(EditorCell cell) {
    ((jetbrains.mps.nodeEditor.cells.EditorCell) cell).synchronizeViewWithModel();
  }

  public static SNode getSNodeWRTReference(EditorCell cell) {
    SNode target = cell.getStyle().get(StyleAttributes.NAVIGATABLE_NODE);
    if (target != null) {
      return target;
    }
    SNode node = cell.getSNode();
    String role = cell.getRole();
    SNode referentNode = role == null ? null : node.getReferenceTarget(role);
    return referentNode != null ? referentNode : node;
  }

  public static boolean validate(final EditorCell cell, final boolean strict, final boolean canActivatePopup) {
    SubstituteInfo substituteInfo = cell.getSubstituteInfo();
    if (substituteInfo == null) {
      return false;
    }

    final SubstituteInfo substituteInfoWithPatternMatchingFilter = NodeSubstituteInfoFilterDecorator.createSubstituteInfoWithPatternMatchingFilter(substituteInfo, cell.getContext().getRepository());

    if (cell instanceof EditorCell_Collection) {
      return false;
    }
    final String pattern = cell.renderText().getText();

    if (pattern.equals("")) {
      return false;
    }

    List<SubstituteAction> matchingActions = new ModelAccessHelper(cell.getContext().getRepository()).runReadAction(
        () -> TypeContextManager.getInstance().runTypeCheckingComputation((ITypeContextOwner) cell.getEditorComponent(),
                                                                          cell.getEditorComponent().getEditedNode(),
                                                                          context -> substituteInfoWithPatternMatchingFilter.getMatchingActions(pattern, strict)));
    return substituteIfPossible(cell, canActivatePopup, pattern, matchingActions);
  }

  static boolean substituteIfPossible(EditorCell cell, boolean canActivatePopup, final String pattern, List<SubstituteAction> matchingActions) {
    if (matchingActions.size() == 0 && canActivatePopup) {
      return false;
    }
    if (matchingActions.size() != 1) {
      if (canActivatePopup) {
        ((EditorComponent) cell.getEditorComponent()).activateNodeSubstituteChooser(cell, false);
      } else {
        return false;
      }
      return true;
    }
    final SubstituteAction action = matchingActions.get(0);
    ModelAccess modelAccess = cell.getContext().getRepository().getModelAccess();
    if (new ModelAccessHelper(modelAccess).runReadAction(() -> action.canSubstitute(pattern))) {
      modelAccess.executeCommand(new EditorCommand(cell.getContext()) {
        @Override
        protected void doExecute() {
          action.substitute(cell.getContext(), pattern);
        }
      });
      return true;
    } else {
      return false;
    }
  }

  /**
   * @deprecated since MPS 3.4 use {@link GeometryUtil#isFirstPositionInBigCell(jetbrains.mps.openapi.editor.cells.EditorCell)}
   */
  @Deprecated
  public static boolean isFirstPositionInBigCell(EditorCell cell) {
    return ((jetbrains.mps.nodeEditor.cells.EditorCell) cell).isFirstPositionInBigCell();
  }

  /**
   * @deprecated since MPS 3.4 use {@link GeometryUtil#isLastPositionInBigCell(jetbrains.mps.openapi.editor.cells.EditorCell)}
   */
  @Deprecated
  public static boolean isLastPositionInBigCell(EditorCell cell) {
    return ((jetbrains.mps.nodeEditor.cells.EditorCell) cell).isLastPositionInBigCell();
  }

  public static boolean isUnderFolded(EditorCell cell) {
    for (EditorCell_Collection parent = cell.getParent(); parent != null; parent = parent.getParent()) {
      if (parent.isCollapsed()) {
        return true;
      }
    }
    return false;
  }

  /**
   * @deprecated since MPS 3.4 use {@link EditorCell#getCellInfo()}
   */
  @Deprecated
  public static CellInfo getCellInfo(EditorCell cell) {
    return cell.getCellInfo();
  }

  /**
   * @deprecated since MPS 3.4 use {@link jetbrains.mps.openapi.editor.cells.CellTraversalUtil#getContainingBigCell(jetbrains.mps.openapi.editor.cells.EditorCell)}
   */
  @Deprecated
  public static EditorCell getContainingBigCell(EditorCell cell) {
    return ((jetbrains.mps.nodeEditor.cells.EditorCell) cell).getContainingBigCell();
  }
}
