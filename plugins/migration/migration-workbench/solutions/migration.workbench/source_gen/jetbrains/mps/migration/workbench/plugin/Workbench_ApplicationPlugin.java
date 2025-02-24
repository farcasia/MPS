package jetbrains.mps.migration.workbench.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.ToolsInternal_ActionGroup;

public class Workbench_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.migration.workbench");
  public Workbench_ApplicationPlugin() {
  }
  public PluginId getId() {
    return myId;
  }
  public void createGroups() {
    // actions w/o parameters 
    addAction(new ExecuteMigrationAssistant_Action());
    addAction(new ExecuteRerunnableMigrations_Action());
    addAction(new FindMetaCreationCode_Action());
    addAction(new RunPreUpdateCheck_Action());
    addAction(new ShowDeprecatedStuff_Action());
    addAction(new ShowDeprecatedUsages_Action());
    addAction(new TestMigrationWizard_Action());
    // groups 
    addGroup(new LanguageMigrations_ActionGroup());
    addGroup(new MigrationUtils_ActionGroup());
    addGroup(new MigrationsMenu_ActionGroup());
    addGroup(new Migrations_ActionGroup());
    addGroup(new ProjectMigrations_ActionGroup());
    addGroup(new ToolsInternalAddition_ActionGroup());
  }
  public void adjustInterfaceGroups() {
  }
  public void adjustRegularGroups() {
    insertGroupIntoAnother(LanguageMigrations_ActionGroup.ID, Migrations_ActionGroup.ID, Migrations_ActionGroup.LABEL_ID_languageMigrations);
    insertGroupIntoAnother(ProjectMigrations_ActionGroup.ID, Migrations_ActionGroup.ID, Migrations_ActionGroup.LABEL_ID_projectMigrations);
    insertGroupIntoAnother(MigrationUtils_ActionGroup.ID, MigrationsMenu_ActionGroup.ID, MigrationsMenu_ActionGroup.LABEL_ID_utils);
    insertGroupIntoAnother(MigrationsMenu_ActionGroup.ID, "Migration", null);
    insertGroupIntoAnother(Migrations_ActionGroup.ID, MigrationsMenu_ActionGroup.ID, MigrationsMenu_ActionGroup.LABEL_ID_migrations);
    insertGroupIntoAnother(ToolsInternalAddition_ActionGroup.ID, ToolsInternal_ActionGroup.ID, null);
  }
}
