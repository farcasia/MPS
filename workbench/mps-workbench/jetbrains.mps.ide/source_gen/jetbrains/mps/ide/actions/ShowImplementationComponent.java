package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.ui.ComboBox;
import javax.swing.JLabel;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import com.intellij.openapi.ui.popup.JBPopup;
import jetbrains.mps.project.Project;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.ArrayList;
import javax.swing.JComponent;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.CustomShortcutSet;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.CompositeShortcutSet;
import com.intellij.openapi.actionSystem.CommonShortcuts;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import com.intellij.ui.IdeBorderFactory;
import com.intellij.ui.SideBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.intellij.ui.CollectionComboBoxModel;
import com.intellij.ui.ColoredListCellRenderer;
import javax.swing.JList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Dimension;
import com.intellij.openapi.Disposable;
import javax.swing.Icon;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.ide.icons.IconManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.openapi.navigation.NavigationSupport;

public class ShowImplementationComponent extends JPanel {
  private ComboBox myNodeChooser;
  private JLabel myLocationLabel = new JLabel("");
  private JLabel myCountLabel = new JLabel("0 of 0");
  private EmbeddableEditor myEditor;
  private int mySelectedIndex = -1;
  private JBPopup myPopup;
  private Project myProject;
  private List<ShowImplementationComponent.ImplementationNode> myImplNodes;
  public ShowImplementationComponent(List<SNode> nodes, Project project) {
    project.getModelAccess().checkReadAccess();
    myImplNodes = new ArrayList<ShowImplementationComponent.ImplementationNode>(nodes.size());
    for (SNode node : nodes) {
      myImplNodes.add(new ShowImplementationComponent.ImplementationNode(node));
    }
    myProject = project;
    myEditor = new EmbeddableEditor(myProject, false);
    myEditor.editNode(myImplNodes.get(0).myNode);
    init();
    if (myImplNodes.size() > 0) {
      myNodeChooser.setSelectedIndex(0);
    }
  }
  public void setPopup(JBPopup popup) {
    myPopup = popup;
  }
  public JComponent getPreferredFocusableComponent() {
    return myNodeChooser;
  }
  private boolean isDisposed = false;
  public void dispose() {
    if (isDisposed) {
      return;
    }
    isDisposed = true;
    for (ShowImplementationComponent.ImplementationNode node : myImplNodes) {
      node.dispose();
    }
    myEditor.disposeEditor();
  }
  private ActionToolbar createToolbar() {
    DefaultActionGroup group = new DefaultActionGroup();
    ShowImplementationComponent.BackAction back = new ShowImplementationComponent.BackAction();
    back.registerCustomShortcutSet(new CustomShortcutSet(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0)), this);
    group.add(back);
    ShowImplementationComponent.ForwardAction forward = new ShowImplementationComponent.ForwardAction();
    forward.registerCustomShortcutSet(new CustomShortcutSet(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0)), this);
    group.add(forward);
    ShowImplementationComponent.ShowSourceAction showSource = new ShowImplementationComponent.ShowSourceAction("Edit Source", AllIcons.Actions.EditSource, true);
    showSource.registerCustomShortcutSet(new CustomShortcutSet(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0)), this);
    group.add(showSource);
    showSource = new ShowImplementationComponent.ShowSourceAction("Show Source", AllIcons.Actions.ShowViewer, false);
    // TODO: choose better icon 
    showSource.registerCustomShortcutSet(new CompositeShortcutSet(CommonShortcuts.getViewSource(), CommonShortcuts.CTRL_ENTER), this);
    group.add(showSource);
    return ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, true);
  }
  private void updateControls() {
    final int index = myNodeChooser.getSelectedIndex();
    if (index == -1) {
      return;
    }
    if (mySelectedIndex == index) {
      return;
    }
    myProject.getModelAccess().executeCommandInEDT(new Runnable() {
      @Override
      public void run() {
        myLocationLabel.setText(myImplNodes.get(index).myModuleName);
        myLocationLabel.setIcon(myImplNodes.get(index).myModuleIcon);
        myCountLabel.setText((index + 1) + " of " + myImplNodes.size());
        myEditor.editNode(myImplNodes.get(index).myNode);
        myEditor.setBackground((StyleRegistry.getInstance().isDarkTheme() ? StyleRegistry.getInstance().getEditorBackground() : new Color(255, 255, 215)));
        mySelectedIndex = index;
        myEditor.repaint();
        myNodeChooser.updateUI();
      }
    });
  }
  private void init() {
    setLayout(new BorderLayout());
    add(myEditor, BorderLayout.CENTER);
    JPanel northPanel = new JPanel(new BorderLayout(2, 0));
    northPanel.setBorder(BorderFactory.createCompoundBorder(IdeBorderFactory.createBorder(SideBorder.BOTTOM), IdeBorderFactory.createEmptyBorder(0, 0, 0, 5)));
    JPanel toolbarPanel = new JPanel(new GridBagLayout());
    final GridBagConstraints gc = new GridBagConstraints(GridBagConstraints.RELATIVE, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 2, 0, 0), 0, 0);
    toolbarPanel.add(createToolbar().getComponent(), gc);
    this.myNodeChooser = new ComboBox(new CollectionComboBoxModel(myImplNodes, null));
    myNodeChooser.setRenderer(new ColoredListCellRenderer() {
      @Override
      protected void customizeCellRenderer(JList list, Object value, int index, boolean selected, boolean hasFocus) {
        if (!((value instanceof ShowImplementationComponent.ImplementationNode))) {
          return;
        }
        ShowImplementationComponent.ImplementationNode node = (ShowImplementationComponent.ImplementationNode) value;
        setIcon(node.myNodeIcon);
        append(node.myNodePresentation);
      }
    });
    myNodeChooser.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        ShowImplementationComponent.this.updateControls();
      }
    });
    gc.fill = GridBagConstraints.HORIZONTAL;
    gc.weightx = 1;
    toolbarPanel.add(myNodeChooser, gc);
    gc.fill = GridBagConstraints.NONE;
    gc.weightx = 0;
    toolbarPanel.add(myCountLabel, gc);
    northPanel.add(toolbarPanel, BorderLayout.CENTER);
    northPanel.add(myLocationLabel, BorderLayout.EAST);
    add(northPanel, BorderLayout.NORTH);
    setPreferredSize(new Dimension(600, 400));
  }
  private class ImplementationNode implements Disposable {
    public final SNode myNode;
    public final String myNodePresentation;
    public final Icon myNodeIcon;
    public final String myModuleName;
    public final Icon myModuleIcon;
    public final SNodeReference myOriginalNodePointer;
    public ImplementationNode(SNode node) {
      myNode = SNodeOperations.copyNode(((SNode) node));
      myNodePresentation = (SNodeOperations.isInstanceOf(((SNode) node), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b21dL, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")) && node.getParent() != null ? node.getParent() + "." + node.getPresentation() : node.getPresentation());
      myNodeIcon = IconManager.getIconFor(node);
      myModuleName = node.getModel().getModule().getModuleName();
      myModuleIcon = IconManager.getIconFor(node.getModel().getModule());
      myOriginalNodePointer = node.getReference();
    }
    @Override
    public void dispose() {
      myNode.delete();
    }
  }
  private class BackAction extends AnAction {
    public BackAction() {
      super("Back", null, AllIcons.Actions.Back);
    }
    @Override
    public void actionPerformed(AnActionEvent e) {
      assert myNodeChooser.getSelectedIndex() > 0;
      myNodeChooser.setSelectedIndex(myNodeChooser.getSelectedIndex() - 1);
      updateControls();
    }
    @Override
    public void update(AnActionEvent e) {
      e.getPresentation().setEnabled(myNodeChooser != null && myNodeChooser.getSelectedIndex() > 0);
    }
  }
  private class ForwardAction extends AnAction {
    public ForwardAction() {
      super("Forward", null, AllIcons.Actions.Forward);
    }
    @Override
    public void actionPerformed(AnActionEvent e) {
      assert myNodeChooser.getSelectedIndex() < myNodeChooser.getItemCount() - 1;
      myNodeChooser.setSelectedIndex(myNodeChooser.getSelectedIndex() + 1);
      updateControls();
    }
    @Override
    public void update(AnActionEvent e) {
      e.getPresentation().setEnabled(myNodeChooser != null && myNodeChooser.getSelectedIndex() < myNodeChooser.getItemCount() - 1);
    }
  }
  private class ShowSourceAction extends AnAction {
    private boolean myClosePopup;
    public ShowSourceAction(String name, Icon icon, boolean closePopup) {
      super(name, null, icon);
      myClosePopup = closePopup;
    }
    @Override
    public void actionPerformed(AnActionEvent e) {
      myProject.getModelAccess().runWriteInEDT(new Runnable() {
        @Override
        public void run() {
          int selectedIndex = myNodeChooser.getSelectedIndex();
          if (selectedIndex < 0) {
            return;
          }
          SNode selectedNode = myImplNodes.get(selectedIndex).myOriginalNodePointer.resolve(myProject.getRepository());
          if (selectedNode == null) {
            return;
          }
          NavigationSupport.getInstance().openNode(myProject, selectedNode, true, true);
          NavigationSupport.getInstance().selectInTree(myProject, selectedNode, false);
          if (myClosePopup) {
            myPopup.cancel();
          }
        }
      });
    }
  }
}
