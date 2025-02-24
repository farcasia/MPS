package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;

public class Insert_Action extends BaseAction {
  private static final Icon ICON = null;

  public Insert_Action() {
    super("Insert New Element", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).isFocusOwner() && EditorActionUtils.getEditorCellToInsert(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent"))) != null && EditorActionUtils.isWriteActionEnabled(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")), Sequence.<EditorCell>singleton(EditorActionUtils.getEditorCellToInsert(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")))));
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    this.setEnabledState(event.getPresentation(), this.isApplicable(event, _params));
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      EditorComponent editorComponent = event.getData(MPSEditorDataKeys.EDITOR_COMPONENT);
      if (editorComponent != null && editorComponent.isInvalid()) {
        editorComponent = null;
      }
      MapSequence.fromMap(_params).put("editorComponent", editorComponent);
      if (editorComponent == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    if (((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).isDisposed()) {
      return;
    }

    EditorCell editorCell = EditorActionUtils.getEditorCellToInsert(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")));
    if (InsertUtil.isAtFirstPositionOfCellWithCaret(editorCell)) {
      EditorActionUtils.callInsertBeforeAction(editorCell);
    } else {
      if (editorCell instanceof EditorCell_Property && ((EditorCell_Property) editorCell).commit()) {
        return;
      } else {
        EditorActionUtils.callInsertAction(editorCell);
      }
    }

  }
}
