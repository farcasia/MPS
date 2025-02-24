package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import java.awt.event.MouseEvent;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.awt.Point;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import javax.swing.SwingUtilities;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import java.util.LinkedList;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class MouseEventsDispatcher {
  private final BaseEditorTestBody myEditorTest;

  public MouseEventsDispatcher(BaseEditorTestBody editorTest) {
    myEditorTest = editorTest;
  }

  private static MouseEvent createMouseEvent(Component targetComponent, int id, int x, int y) {
    return new MouseEvent(targetComponent, id, System.currentTimeMillis(), 0, x, y, x, y, 1, false, MouseEvent.BUTTON1);
  }

  public void processSecondaryMouseEvent(final Component targetComponent, int x, int y, int eventType) throws InvocationTargetException, InterruptedException {
    Point componentPoint = convertToComponent(x, y, targetComponent);

    final MouseEvent e = MouseEventsDispatcher.createMouseEvent(targetComponent, eventType, componentPoint.x, componentPoint.y);
    myEditorTest.runUndoableInEDTAndWait(new Runnable() {
      public void run() {
        targetComponent.dispatchEvent(e);
      }
    });
  }

  private Point convertToComponent(int x, int y, final Component targetComponent) {
    final EditorComponent editorComponent = myEditorTest.getEditorComponent();
    EditorCell rootCell = editorComponent.getRootCell();
    return SwingUtilities.convertPoint(editorComponent, x + rootCell.getX(), y + rootCell.getY(), targetComponent);
  }

  public Component processMouseEvent(int x, int y, int eventType) throws InvocationTargetException, InterruptedException {
    final EditorComponent editorComponent = myEditorTest.getEditorComponent();
    EditorCell rootCell = editorComponent.getRootCell();
    assert rootCell != null;

    Queue<jetbrains.mps.openapi.editor.cells.EditorCell> cellCandidates = QueueSequence.fromQueue(new LinkedList<jetbrains.mps.openapi.editor.cells.EditorCell>());
    QueueSequence.fromQueue(cellCandidates).addLastElement(rootCell);
    int editorX = x + rootCell.getX();
    int editorY = y + rootCell.getY();
    jetbrains.mps.openapi.editor.cells.EditorCell eventTargetCell = null;
    while (QueueSequence.fromQueue(cellCandidates).isNotEmpty()) {
      jetbrains.mps.openapi.editor.cells.EditorCell nextCell = QueueSequence.fromQueue(cellCandidates).removeFirstElement();
      if (nextCell.getX() <= editorX && nextCell.getY() <= editorY && nextCell.getX() + nextCell.getWidth() > editorX && nextCell.getY() + nextCell.getHeight() > editorY) {
        eventTargetCell = nextCell;
        if (nextCell instanceof EditorCell_Collection) {
          QueueSequence.fromQueue(cellCandidates).addSequence(Sequence.fromIterable((EditorCell_Collection) nextCell));
        }
      }
    }
    assert eventTargetCell != null;

    Component cellComponent = EditorUtil.getEventTargetComponent(eventTargetCell, editorComponent);
    Point cellComponentPoint = SwingUtilities.convertPoint(editorComponent, editorX, editorY, cellComponent);

    final Component targetComponent = cellComponent.getComponentAt(cellComponentPoint);
    assert targetComponent != null;

    Point targetComponentPoint = SwingUtilities.convertPoint(editorComponent, editorX, editorY, targetComponent);

    final MouseEvent e = MouseEventsDispatcher.createMouseEvent(cellComponent, eventType, targetComponentPoint.x, targetComponentPoint.y);
    myEditorTest.runUndoableInEDTAndWait(new Runnable() {
      public void run() {
        targetComponent.dispatchEvent(e);
      }
    });
    return targetComponent;
  }

}
