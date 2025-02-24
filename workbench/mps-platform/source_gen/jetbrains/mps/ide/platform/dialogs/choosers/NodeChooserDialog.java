package jetbrains.mps.ide.platform.dialogs.choosers;

/*Generated by MPS */

import com.intellij.openapi.ui.DialogWrapper;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.workbench.goTo.ui.ChooseByNamePanel;
import org.jetbrains.mps.openapi.model.SNodeReference;
import com.intellij.openapi.project.Project;
import com.intellij.ide.util.gotoByName.ChooseByNameModel;
import jetbrains.mps.workbench.goTo.ui.MpsPopupFactory;
import com.intellij.ide.util.gotoByName.ChooseByNamePopupComponent;
import com.intellij.openapi.application.ModalityState;
import org.apache.log4j.Level;
import jetbrains.mps.workbench.choose.ChooseByNameData;
import jetbrains.mps.workbench.choose.NodesPresentation;
import jetbrains.mps.ide.project.ProjectHelper;
import java.util.Collections;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import javax.swing.JComponent;
import java.awt.Dimension;

public class NodeChooserDialog extends DialogWrapper {
  private static final Logger LOG = LogManager.getLogger(NodeChooserDialog.class);
  private final ChooseByNamePanel myChooser;
  private SNodeReference myChosenElement;

  public NodeChooserDialog(Project project, ChooseByNameModel chooseByNameModel) {
    super(project, true);
    setTitle("Choose Node");

    myChooser = MpsPopupFactory.createPanelForNode(project, chooseByNameModel, false);
    myChooser.invoke(new ChooseByNamePopupComponent.Callback() {
      @Override
      public void elementChosen(Object element) {
        doOKAction();
      }
    }, ModalityState.any(), false);

    init();
  }


  @Override
  protected void doOKAction() {
    Object element = myChooser.getChosenElement();
    if (element instanceof SNodeReference) {
      myChosenElement = (SNodeReference) element;
    } else {
      if (LOG.isEnabledFor(Level.WARN)) {
        LOG.warn("Only SNodeReference can be chosen");
      }
    }

    super.doOKAction();
  }

  public NodeChooserDialog(Project project, final Iterable<SNodeReference> nodes) {
    this(project, new ChooseByNameData(new NodesPresentation(ProjectHelper.getProjectRepository(project))).derivePrompts("node").setScope(nodes, Collections.<SNodeReference>emptySet()));
  }

  public NodeChooserDialog(Project project, final List<SNode> nodes) {
    this(project, ListSequence.fromList(nodes).select(new ISelector<SNode, SNodeReference>() {
      public SNodeReference select(SNode it) {
        return SNodeOperations.getPointer(it);
      }
    }));
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    myChooser.getPanel().setPreferredSize(new Dimension(400, 500));
    return myChooser.getPanel();
  }

  @Nullable
  public SNodeReference getResult() {
    if (getExitCode() != DialogWrapper.OK_EXIT_CODE) {
      return null;
    }
    return myChosenElement;
  }

  @Nullable
  @Override
  public JComponent getPreferredFocusedComponent() {
    return myChooser.getPreferredFocusedComponent();
  }
}
