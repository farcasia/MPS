package jetbrains.mps.ide.migration.check;

/*Generated by MPS */

import jetbrains.mps.lang.migration.runtime.base.Problem;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.errors.item.ModuleReportItem;
import jetbrains.mps.lang.migration.runtime.base.MigrationScriptReference;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.migration.runtime.base.RefactoringScriptReference;
import jetbrains.mps.project.AbstractModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModuleReference;

public abstract class MissingMigrationProblem extends Problem<SModule> implements ModuleReportItem {

  public MissingMigrationProblem(SModule migrationProvider) {
    super(migrationProvider);
  }

  public static class MissingMigrationScriptProblem extends MissingMigrationProblem {
    private MigrationScriptReference myScriptReference;
    private int myUsedVersion;

    public MissingMigrationScriptProblem(MigrationScriptReference migration, int usedVersion) {
      super(migration.getLanguage().getSourceModule());
      myScriptReference = migration;
    }
    public String getMessage() {
      final Wrappers._T<String> msg = new Wrappers._T<String>();
      getReason().getRepository().getModelAccess().runReadAction(new Runnable() {
        public void run() {
          msg.value = "The language " + myScriptReference.getLanguage().getQualifiedName() + " does not provide migration from version " + myScriptReference.getFromVersion() + ". " + "Some modules use this language with version " + myUsedVersion + " while current version is " + myScriptReference.getLanguage().getLanguageVersion() + ".";
        }
      });
      return msg.value;
    }
  }

  public static class MissingRefactoringLogProblem extends MissingMigrationProblem {
    private RefactoringScriptReference myScriptReference;
    private int myUsedVersion;

    public MissingRefactoringLogProblem(RefactoringScriptReference migration, int usedVersion) {
      super(migration.getModule());
      myScriptReference = migration;
    }
    public String getMessage() {
      final Wrappers._T<String> msg = new Wrappers._T<String>();
      getReason().getRepository().getModelAccess().runReadAction(new Runnable() {
        public void run() {
          msg.value = "The module " + myScriptReference.getModule().getModuleName() + " does not provide refactoring log for version " + myScriptReference.getFromVersion() + ". " + "Some modules use this module with version " + myUsedVersion + " while current version is " + ((AbstractModule) myScriptReference.getModule()).getModuleVersion() + ".";
        }
      });
      return msg.value;
    }
  }


  public String getCategory() {
    return "Missing migrations";
  }

  @NotNull
  @Override
  public SModuleReference getModule() {
    return getReason().getModuleReference();
  }
}
