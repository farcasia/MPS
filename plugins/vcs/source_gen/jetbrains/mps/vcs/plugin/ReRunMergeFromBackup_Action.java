package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.extapi.persistence.FileDataSource;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.mps.openapi.model.EditableSModel;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import java.io.File;
import jetbrains.mps.vcs.platform.util.MergeBackupUtil;
import jetbrains.mps.vcs.util.MergeVersion;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.vcspersistence.VCSPersistenceSupport;
import org.xml.sax.InputSource;
import java.io.StringReader;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.extapi.model.SModelBase;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.diff.merge.MergeRequest;
import com.intellij.diff.DiffRequestFactory;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.diff.DiffManager;
import java.io.IOException;
import org.apache.log4j.Level;
import com.intellij.diff.InvalidDiffRequestException;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.generator.ModelDigestUtil;

public class ReRunMergeFromBackup_Action extends BaseAction {
  private static final Logger LOG = LogManager.getLogger(ReRunMergeFromBackup_Action.class);
  private static final Icon ICON = null;

  public ReRunMergeFromBackup_Action() {
    super("Rerun Merge from Backup", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (!(((SModel) MapSequence.fromMap(_params).get("model")).getSource() instanceof FileDataSource)) {
      return false;
    }
    ProjectLevelVcsManager manager = ProjectLevelVcsManager.getInstance(((Project) MapSequence.fromMap(_params).get("project")));
    if (manager.getAllVersionedRoots().length == 0) {
      return false;
    }
    VirtualFile file = VirtualFileUtils.getProjectVirtualFile(ReRunMergeFromBackup_Action.this.getModelFile(_params));
    if (file == null) {
      return false;
    }
    return manager.getVcsFor(file) != null && Sequence.fromIterable(ReRunMergeFromBackup_Action.this.getBackupFiles(_params)).isNotEmpty();
  }
  @Override
  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    this.setEnabledState(event.getPresentation(), this.isApplicable(event, _params));
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SModel p = event.getData(MPSCommonDataKeys.MODEL);
      MapSequence.fromMap(_params).put("model", p);
      if (p == null) {
        return false;
      }
      if (!(p instanceof EditableSModel) || p.isReadOnly()) {
        return false;
      }
    }
    {
      Project p = event.getData(CommonDataKeys.PROJECT);
      MapSequence.fromMap(_params).put("project", p);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    for (File backupFile : Sequence.fromIterable(ReRunMergeFromBackup_Action.this.getBackupFiles(_params))) {
      try {
        String[] modelsAsText = MergeBackupUtil.loadZippedModelsAsText(backupFile, MergeVersion.values());
        String mine = modelsAsText[MergeVersion.MINE.ordinal()];
        String base = modelsAsText[MergeVersion.BASE.ordinal()];
        String repository = modelsAsText[MergeVersion.REPOSITORY.ordinal()];

        SModelReference uid = VCSPersistenceSupport.loadDescriptor(new InputSource(new StringReader(mine))).getModelReference();
        if (uid == null || !(uid.equals(((SModel) MapSequence.fromMap(_params).get("model")).getReference()))) {
          continue;
        }

        // this.model came from repo, so it must be supported by ModelPersistence 
        final Wrappers._T<String> modelData = new Wrappers._T<String>();
        ((SModel) MapSequence.fromMap(_params).get("model")).getRepository().getModelAccess().runReadAction(new Runnable() {
          public void run() {
            modelData.value = ModelPersistence.modelToString(((SModelBase) ((SModel) MapSequence.fromMap(_params).get("model"))).getSModelInternal());
          }
        });
        mine = ReRunMergeFromBackup_Action.this.selectMineModel(modelData.value, mine, _params);
        if (mine == null) {
          return;
        }
        VirtualFile file = VirtualFileUtils.getProjectVirtualFile(ReRunMergeFromBackup_Action.this.getModelFile(_params));
        assert file != null;
        List<String> contents = ListSequence.fromListAndArray(new ArrayList<String>(), mine, base, repository);
        List<String> titles = ListSequence.fromListAndArray(new ArrayList<String>(), "Mine", "Base version", "Repository");
        MergeRequest request = DiffRequestFactory.getInstance().createMergeRequest(((Project) MapSequence.fromMap(_params).get("project")), file.getFileType(), FileDocumentManager.getInstance().getDocument(file), contents, null, titles, null);
        DiffManager.getInstance().showMerge(((Project) MapSequence.fromMap(_params).get("project")), request);
        return;
      } catch (IOException e) {
        if (LOG.isEnabledFor(Level.WARN)) {
          LOG.warn("", e);
        }
        // Skip this backup 
        continue;
      } catch (InvalidDiffRequestException e) {
        if (LOG.isEnabledFor(Level.ERROR)) {
          LOG.error("", e);
        }
      }
    }
    Messages.showInfoMessage("No suitable backup files for " + ((SModel) MapSequence.fromMap(_params).get("model")).getReference().getModelName() + "was not found.", "No Backup Files Found");
  }
  private Iterable<File> getBackupFiles(final Map<String, Object> _params) {
    return MergeBackupUtil.findZipFilesForModelFile(ReRunMergeFromBackup_Action.this.getModelFile(_params).getName());
  }
  private IFile getModelFile(final Map<String, Object> _params) {
    return ((FileDataSource) ((SModel) MapSequence.fromMap(_params).get("model")).getSource()).getFile();
  }
  private String selectMineModel(String currentModel, String backUpModel, final Map<String, Object> _params) {
    if (ModelDigestUtil.hashText(currentModel).equals(ModelDigestUtil.hashText(backUpModel))) {
      return backUpModel;
    } else {
      String current = "Currently Loaded Model";
      String backup = "Backed Up Model";
      String[] options = {current, backup};
      int result = Messages.showDialog("Backed up \"mine\" model is different from current model.\n Which version would you like to use?", "Current model differs from backup.", options, 0, Messages.getQuestionIcon());
      if (result == -1) {
        return null;
      } else if (options[result].equals(current)) {
        return currentModel;
      } else {
        return backUpModel;
      }
    }
  }
}
