package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import com.intellij.openapi.ui.DialogWrapper;
import javax.swing.JScrollPane;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.ui.ScrollPaneFactory;
import java.awt.event.MouseEvent;
import org.jetbrains.mps.openapi.model.SNodeReference;
import javax.swing.SwingUtilities;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.openapi.navigation.EditorNavigator;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;
import javax.swing.JComponent;
import javax.swing.Action;
import javax.swing.Scrollable;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Rectangle;

public class ShowCFGDialog extends DialogWrapper {
  private JScrollPane myScrollPane;
  private ShowCFGDialog.MyComponent myComponent;
  private ControlFlowGraph<InstructionWrapper> myControlFlowGraph;
  private final MPSProject myProject;
  public ShowCFGDialog(@NotNull ControlFlowGraph<InstructionWrapper> graph, @NotNull MPSProject project, @NotNull String title) {
    super(project.getProject());
    myProject = project;
    this.myComponent = new ShowCFGDialog.MyComponent();
    this.myScrollPane = ScrollPaneFactory.createScrollPane(myComponent);
    this.myScrollPane.setBackground(this.getBackground());
    this.myComponent.setFont(this.myComponent.getFont().deriveFont(10.0f));
    this.myControlFlowGraph = graph;
    graph.setComponent(myComponent);
    graph.relayout();
    this.myControlFlowGraph.addBlockListener(new IBlockListener() {
      @Override
      public void mousePressed(MouseEvent event, IBlock block) {
        final SNodeReference sourceRef = block.getSourceNode();
        if (SwingUtilities.isRightMouseButton(event)) {

          JPopupMenu menu = new JPopupMenu();
          JMenuItem ruleItem = new JMenuItem("Go To Data Flow Rule");
          JMenuItem nodeItem = new JMenuItem("Go To Node");
          menu.add(ruleItem);
          menu.add(nodeItem);
          final SNodeReference ruleNodeReference = block.getRuleNodeReference();
          ruleItem.setEnabled(ruleNodeReference != null);
          nodeItem.setEnabled(sourceRef != null);
          menu.show(event.getComponent(), event.getX(), event.getY());
          ruleItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent p0) {
              openNode(ruleNodeReference);
            }
          });
          nodeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent p0) {
              openNode(sourceRef);
            }
          });
        } else if (sourceRef != null) {
          openNode(sourceRef);
        }
      }
    });
    setModal(false);
    setTitle(title);
    init();
  }
  private void openNode(SNodeReference nodeReference) {
    new EditorNavigator(myProject).shallFocus(true).shallSelect(true).open(nodeReference);
  }

  public Color getBackground() {
    return Color.LIGHT_GRAY;
  }
  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    return myScrollPane;
  }
  @Override
  @NotNull
  protected Action[] createActions() {
    return new Action[0];
  }
  private class MyComponent extends JComponent implements Scrollable {
    public MyComponent() {
      this.setLayout(new BorderLayout());
      this.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          ShowCFGDialog.this.myControlFlowGraph.processMousePressed(e);
        }
      });
    }
    @Override
    public Color getBackground() {
      return ShowCFGDialog.this.getBackground();
    }
    @Override
    public void paint(Graphics g) {
      g.setColor(this.getBackground());
      g.fillRect(0, 0, this.getWidth(), this.getHeight());
      ShowCFGDialog.this.myControlFlowGraph.paint(g);
    }
    @Override
    public Dimension getPreferredScrollableViewportSize() {
      return this.getPreferredSize();
    }
    @Override
    public Dimension getPreferredSize() {
      return new Dimension(ShowCFGDialog.this.myControlFlowGraph.getWidth(), ShowCFGDialog.this.myControlFlowGraph.getHeight());
    }
    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
      return 20;
    }
    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
      return visibleRect.height;
    }
    @Override
    public boolean getScrollableTracksViewportWidth() {
      return false;
    }
    @Override
    public boolean getScrollableTracksViewportHeight() {
      return false;
    }
  }
}
