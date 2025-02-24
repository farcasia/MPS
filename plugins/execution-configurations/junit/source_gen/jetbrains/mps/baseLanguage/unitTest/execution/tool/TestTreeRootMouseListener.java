package jetbrains.mps.baseLanguage.unitTest.execution.tool;

/*Generated by MPS */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestTreeRootMouseListener extends MouseAdapter {
  private final StatisticsTableModel myStatisticsModel;
  private final TestOutputComponent myOutputComponent;
  private final TestTree myTreeComponent;
  public TestTreeRootMouseListener(TestTree tree, StatisticsTableModel statistics, TestOutputComponent outputComponent) {
    myStatisticsModel = statistics;
    myOutputComponent = outputComponent;
    myTreeComponent = tree;
  }
  @Override
  public void mouseClicked(MouseEvent event) {
    if (myTreeComponent.getPathForLocation(event.getX(), event.getY()) != null) {
      return;
    }
    myOutputComponent.filter(null, null);
    myStatisticsModel.setFilter(null, null);
    myTreeComponent.clearSelection();
  }
}
