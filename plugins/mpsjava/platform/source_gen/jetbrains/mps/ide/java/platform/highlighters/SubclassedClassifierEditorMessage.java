package jetbrains.mps.ide.java.platform.highlighters;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.AbstractLeftEditorHighlighterMessage;
import jetbrains.mps.nodeEditor.EditorMessageIconRenderer;
import org.jetbrains.mps.util.Condition;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.message.EditorMessageOwner;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import javax.swing.Icon;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.CellFinderUtil;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.ActionManager;

public class SubclassedClassifierEditorMessage extends AbstractLeftEditorHighlighterMessage {
  private static final EditorMessageIconRenderer.IconRendererType TYPE = new EditorMessageIconRenderer.IconRendererType(1);
  private boolean myIsInterface;
  private Condition<EditorCell> myClassifierNameCellCondition;
  public SubclassedClassifierEditorMessage(final SNode node, EditorMessageOwner owner, String tooltip, boolean isInterface) {
    super(node, owner, tooltip);
    myIsInterface = isInterface;
    myClassifierNameCellCondition = new Condition<EditorCell>() {
      @Override
      public boolean met(EditorCell cell) {
        return cell.getSNode() == node && cell instanceof EditorCell_Label && ((EditorCell_Label) cell).isEditable();
      }
    };
  }
  @Override
  public Icon getIcon() {
    return (myIsInterface ? IconResourceBundle_OverrideImplements.getInstance().getResource("IMPLEMENTED") : IconResourceBundle_OverrideImplements.getInstance().getResource("OVERRIDEN"));
  }
  @Override
  public EditorMessageIconRenderer.IconRendererType getType() {
    return TYPE;
  }

  @Nullable
  @Override
  public EditorCell getAnchorCell(EditorComponent editorComponent) {
    EditorCell nodeCell = getNodeCell(editorComponent);
    EditorCell returnTypeCell = (nodeCell == null ? null : CellFinderUtil.findChildByCondition(nodeCell, myClassifierNameCellCondition, true));
    return (returnTypeCell != null ? returnTypeCell : nodeCell);
  }

  @Override
  public AnAction getClickAction() {
    return ((BaseAction) ActionManager.getInstance().getAction("jetbrains.mps.ide.java.actions.GoToInheritedClassifier_Action"));
  }
}
