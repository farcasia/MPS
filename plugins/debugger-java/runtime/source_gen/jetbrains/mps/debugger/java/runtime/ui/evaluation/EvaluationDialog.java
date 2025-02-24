package jetbrains.mps.debugger.java.runtime.ui.evaluation;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debugger.java.runtime.evaluation.EvaluationProvider;
import jetbrains.mps.debugger.java.runtime.evaluation.container.IEvaluationContainer;
import javax.swing.Action;
import com.intellij.openapi.ui.DialogWrapper;
import java.awt.event.ActionEvent;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;

public class EvaluationDialog extends AbstractEvaluationDialog {
  public EvaluationDialog(@NotNull Project ideaProject, @NotNull EvaluationProvider provider, IEvaluationContainer container) {
    super(ideaProject, provider, container, "Evaluate");
  }

  @Override
  @NotNull
  protected Action[] createActions() {
    return new Action[]{new DialogWrapper.DialogWrapperAction("Evaluate") {
      @Override
      protected void doAction(ActionEvent p0) {
        myEvaluationPanel.evaluate();
      }
    }, new DialogWrapper.DialogWrapperAction("Watch") {
      @Override
      protected void doAction(ActionEvent p0) {
        myProvider.addWatch(myEvaluationPanel.getEvaluationContainer());
        doOKAction();
      }
    }, new DialogWrapper.DialogWrapperAction("Close") {
      @Override
      protected void doAction(ActionEvent p0) {
        doOKAction();
      }
    }};
  }

  @Nullable
  @NonNls
  @Override
  protected String getDimensionServiceKey() {
    return EvaluationDialog.class.getName();
  }
}
