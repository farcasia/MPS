package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import java.awt.Frame;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.devkit.cellExplorer.CellPropertiesWindow;

public class CellProperties_Action extends BaseAction {
  private static final Icon ICON = null;

  public CellProperties_Action() {
    super("Cell Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      Frame p = event.getData(MPSCommonDataKeys.FRAME);
      MapSequence.fromMap(_params).put("frame", p);
      if (p == null) {
        return false;
      }
    }
    {
      EditorCell p = event.getData(MPSEditorDataKeys.EDITOR_CELL);
      MapSequence.fromMap(_params).put("cell", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    new CellPropertiesWindow(((EditorCell) MapSequence.fromMap(_params).get("cell")), ((Frame) MapSequence.fromMap(_params).get("frame")));
  }
}
