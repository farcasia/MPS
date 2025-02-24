package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.vcs.diff.StructChangeSet;
import jetbrains.mps.vcs.diff.ui.common.DiffEditor;
import java.util.List;
import jetbrains.mps.vcs.diff.ui.common.ChangeGroupLayout;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.vcs.diff.ui.common.DiffEditorSeparator;
import jetbrains.mps.vcs.diff.ui.common.DiffEditorsGroup;
import com.intellij.ui.JBSplitter;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.diff.ex.DiffStatusBar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.vcs.diff.ui.common.NextPreviousTraverser;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeId;
import com.intellij.openapi.actionSystem.ToggleAction;
import jetbrains.mps.ide.icons.IdeIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ActionGroup;
import javax.swing.JComponent;
import jetbrains.mps.vcs.diff.ui.common.Bounds;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.diff.ui.common.DiffChangeGroupLayout;
import jetbrains.mps.vcs.diff.ui.common.ChangeGroupMessages;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import jetbrains.mps.smodel.SModelOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.vcs.diff.StructChangeSetBuilder;

public class StructDifferencePane {
  private static final String PARAM_SHOW_INSPECTOR = StructDifferencePane.class.getName() + "ShowInspector";
  private static final String PARAM_INSPECTOR_SPLITTER_POSITION = StructDifferencePane.class.getName() + "InspectorSplitterPosition";
  private Project myProject;
  private StructChangeSet myChangeSet;

  private DiffEditor myOldEditor;
  private DiffEditor myNewEditor;

  private List<ChangeGroupLayout> myChangeGroupLayouts = ListSequence.fromList(new ArrayList<ChangeGroupLayout>());
  private List<DiffEditorSeparator> myEditorSeparators = ListSequence.fromList(new ArrayList<DiffEditorSeparator>());
  private DiffEditorsGroup myDiffEditorsGroup;

  private JBSplitter myPanel = new JBSplitter(true, 0.7f);
  private JPanel myTopPanel = new JPanel(new GridBagLayout());
  private JPanel myBottomPanel = new JPanel(new GridBagLayout());
  private boolean isInspectorShown = PropertiesComponent.getInstance().getBoolean(PARAM_SHOW_INSPECTOR, true);

  private DiffStatusBar myStatusBar;
  private DefaultActionGroup myActionGroup;
  private NextPreviousTraverser myTraverser;

  public StructDifferencePane(Project project, StructChangeSet changeSet, String[] titles, DiffStatusBar statusBar) {
    myChangeSet = changeSet;
    myProject = project;
    myDiffEditorsGroup = new DiffEditorsGroup() {
      @Nullable
      @Override
      protected SNodeId mapID(DiffEditor myEditor, SNodeId myNodeId, DiffEditor otherEditor) {
        if (myEditor == otherEditor) {
          return myNodeId;
        }
        if (myOldEditor == myEditor && myNewEditor == otherEditor) {
          return myChangeSet.mapToNewId(myNodeId);
        }
        if (myNewEditor == myEditor && myOldEditor == otherEditor) {
          return myChangeSet.mapToOldId(myNodeId);
        }
        return null;
      }
    };

    myStatusBar = statusBar;

    myOldEditor = addEditor(0, myChangeSet.getOldModel(), myChangeSet.getOldNodeId(), titles[0]);
    myNewEditor = addEditor(1, myChangeSet.getNewModel(), myChangeSet.getNewNodeId(), titles[1]);
    linkEditors(true);
    linkEditors(false);

    myPanel.setSplitterProportionKey(PARAM_INSPECTOR_SPLITTER_POSITION);
    myPanel.setFirstComponent(myTopPanel);
    if (isInspectorShown) {
      myPanel.setSecondComponent(myBottomPanel);
    }

    myTraverser = new NextPreviousTraverser(myChangeGroupLayouts, myNewEditor.getMainEditor());

    createActionGroup();
  }
  private void createActionGroup() {
    myActionGroup = new DefaultActionGroup();
    myActionGroup.addAll(myTraverser.previousAction(), myTraverser.nextAction());
    myTraverser.previousAction().registerCustomShortcutSet(NextPreviousTraverser.PREV_CHANGE_SHORTCUT, myPanel);
    myTraverser.nextAction().registerCustomShortcutSet(NextPreviousTraverser.NEXT_CHANGE_SHORTCUT, myPanel);
    myActionGroup.addSeparator();
    myActionGroup.add(new ToggleAction("Show Inspector", "Show Inspector Windows", IdeIcons.INSPECTOR_ICON) {
      public boolean isSelected(AnActionEvent e) {
        return isInspectorShown;
      }
      public void setSelected(AnActionEvent e, boolean b) {
        showInspector(b);
      }
    });
  }

  public ActionGroup getActions() {
    return myActionGroup;
  }
  public void registerShortcuts(JComponent component) {
    myTraverser.previousAction().registerCustomShortcutSet(NextPreviousTraverser.PREV_CHANGE_SHORTCUT, component);
    myTraverser.nextAction().registerCustomShortcutSet(NextPreviousTraverser.NEXT_CHANGE_SHORTCUT, component);
  }
  public void unregisterShortcuts(JComponent component) {
    myTraverser.previousAction().unregisterCustomShortcutSet(component);
    myTraverser.nextAction().unregisterCustomShortcutSet(component);
  }
  public JPanel getPanel() {
    return myPanel;
  }
  public void navigateInitial(@Nullable final Bounds firstChange) {
    highlightAllChanges();
    if (firstChange != null) {
      ApplicationManager.getApplication().invokeLater(new Runnable() {
        public void run() {
          myTraverser.goToBounds(firstChange);
        }
      });
    } else {
      myTraverser.goToFirstChangeLater();
    }
  }

  private void showInspector(boolean show) {
    if (isInspectorShown == show) {
      return;
    }
    isInspectorShown = show;
    PropertiesComponent.getInstance().setValue(PARAM_SHOW_INSPECTOR, show + "");
    myPanel.setSecondComponent((isInspectorShown ? myBottomPanel : null));
  }

  private void linkEditors(boolean inspector) {
    // create change group builder, trapecium strip and merge buttons painter 
    // 'mine' parameter means mine changeset, 'inspector' - highlight inspector editor component 
    ChangeGroupLayout layout = new DiffChangeGroupLayout(null, myChangeSet, myOldEditor, myNewEditor, inspector);
    ChangeGroupMessages.startMaintaining(layout);
    ListSequence.fromList(myChangeGroupLayouts).addElement(layout);
    DiffEditorSeparator separator = new DiffEditorSeparator(layout);
    GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0);
    ((inspector ? myBottomPanel : myTopPanel)).add(separator, gbc);
    ListSequence.fromList(myEditorSeparators).addElement(separator);
    if (!(SModelOperations.isReadOnly(myChangeSet.getNewModel()))) {
      StructDiffButtonsPainter.addTo(myOldEditor, layout, inspector);
      StructDiffButtonsPainter.addTo(myNewEditor, layout, inspector);
    }
  }
  private DiffEditor addEditor(int index, SModel model, SNodeId nodeId, String title) {
    final DiffEditor result = new DiffEditor(ProjectHelper.fromIdeaProject(myProject), model.getNode(nodeId), title, index == 0);

    GridBagConstraints gbc = new GridBagConstraints(index * 2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, (index == 0 ? 5 : 0), 5, (index == 2 ? 5 : 0)), 0, 0);
    myTopPanel.add(result.getTopComponent(), gbc);
    myBottomPanel.add(result.getInspector().getExternalComponent(), gbc);
    myDiffEditorsGroup.add(result);
    return result;
  }

  private void highlightAllChanges() {
    ListSequence.fromList(myChangeGroupLayouts).visitAll(new IVisitor<ChangeGroupLayout>() {
      public void visit(ChangeGroupLayout b) {
        b.invalidate();
      }
    });
    for (ModelChange change : ListSequence.fromList(myChangeSet.getModelChanges())) {
      higlightChange(myOldEditor, myChangeSet.getOldModel(), true, change);
      higlightChange(myNewEditor, myChangeSet.getNewModel(), false, change);
    }
    ListSequence.fromList(myChangeGroupLayouts).visitAll(new IVisitor<ChangeGroupLayout>() {
      public void visit(ChangeGroupLayout b) {
        b.invalidate();
      }
    });

    myOldEditor.repaintAndRebuildEditorMessages();
    myNewEditor.repaintAndRebuildEditorMessages();

    int count = ListSequence.fromList(myChangeSet.getModelChanges()).count();
    myStatusBar.setText((count == 0 ? "no differences" : NameUtil.formatNumericalString(count, "difference")));
  }
  private void higlightChange(DiffEditor diffEditor, SModel model, boolean isOldEditor, ModelChange change) {
    diffEditor.highlightChange(model, change, isOldEditor, null);
  }
  public void rehighlight() {
    StructChangeSetBuilder.rebuildChangeSet(myChangeSet);
    myNewEditor.unhighlightAllChanges();
    myOldEditor.unhighlightAllChanges();

    if (myNewEditor.getEditedNode() == null) {
      myNewEditor.editNode(myChangeSet.getNewNodeId(), myChangeSet.getNewModel());
    }

    myNewEditor.getMainEditor().rebuildEditorContent();
    myOldEditor.getMainEditor().rebuildEditorContent();

    highlightAllChanges();
  }

  public void dispose() {
    myActionGroup.removeAll();
    myActionGroup = null;
    myOldEditor.dispose();
    myOldEditor = null;
    myNewEditor.dispose();
    myNewEditor = null;
    ListSequence.fromList(myEditorSeparators).visitAll(new IVisitor<DiffEditorSeparator>() {
      public void visit(DiffEditorSeparator s) {
        s.dispose();
      }
    });
    ListSequence.fromList(myEditorSeparators).clear();
    myEditorSeparators = null;
  }

}
