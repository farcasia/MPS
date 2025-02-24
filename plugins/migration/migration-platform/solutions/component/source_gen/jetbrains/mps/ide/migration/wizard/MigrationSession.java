package jetbrains.mps.ide.migration.wizard;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import java.util.Set;
import jetbrains.mps.ide.migration.MigrationRegistry;
import jetbrains.mps.ide.migration.MigrationChecker;
import jetbrains.mps.ide.migration.MigrationExecutor;
import jetbrains.mps.migration.global.MigrationOptions;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;

public interface MigrationSession {
  Project getProject();

  Set<MigrationSession.MigrationStepKind> getRequiredSteps();

  MigrationRegistry getMigrationRegistry();

  MigrationChecker getChecker();

  MigrationExecutor getExecutor();

  MigrationOptions getOptions();

  Object getCurrentStage();

  void setCurrentStage(Object stage);

  @Nullable
  MigrationError getError();

  void setError(MigrationError errors);

  abstract class MigrationSessionBase implements MigrationSession {
    private Object myStage = null;
    private MigrationError myErrors = null;
    private Set<MigrationSession.MigrationStepKind> myRequiredSteps = SetSequence.fromSet(new HashSet<MigrationSession.MigrationStepKind>());

    public MigrationSessionBase() {
    }
    public MigrationError getError() {
      return myErrors;
    }
    public void setError(MigrationError errors) {
      myErrors = errors;
    }
    @Override
    public Object getCurrentStage() {
      return myStage;
    }
    @Override
    public void setCurrentStage(Object stage) {
      myStage = stage;
    }
    @Override
    public Set<MigrationSession.MigrationStepKind> getRequiredSteps() {
      return myRequiredSteps;
    }
  }

  enum MigrationStepKind {
    RESAVE(),
    MIGRATE()
  }
}
