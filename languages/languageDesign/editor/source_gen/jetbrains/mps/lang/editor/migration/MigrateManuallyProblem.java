package jetbrains.mps.lang.editor.migration;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.NotMigratedNode;
import org.jetbrains.mps.openapi.model.SNode;

public class MigrateManuallyProblem extends NotMigratedNode {
  public MigrateManuallyProblem(SNode reason) {
    super(reason);
  }
  public String getMessage() {
    return "Migrate node manually";
  }

}
