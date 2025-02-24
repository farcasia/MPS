package jetbrains.mps.debug.api.evaluation;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.annotations.Nullable;
import javax.swing.JComponent;

public interface IEvaluationProvider {
  void showEvaluationDialog(Project mpsProject);
  void showEvaluationDialog(Project mpsProject, List<SNodeReference> selectedNodes);
  @Nullable
  JComponent createWatchesPanel();
  boolean canEvaluate();
}
