package jetbrains.mps.vcs.platform.integration;

/*Generated by MPS */

import com.intellij.diff.merge.MergeTool;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import com.intellij.diff.merge.MergeContext;
import com.intellij.diff.merge.TextMergeRequest;
import jetbrains.mps.vcs.diff.ui.merge.MergeModelsPanel;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.intellij.diff.merge.MergeRequest;
import java.util.List;
import com.intellij.diff.contents.DocumentContent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.diff.contents.FileContent;
import java.io.File;
import jetbrains.mps.vcs.platform.util.MergeBackupUtil;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.persistence.FilePerRootDataSource;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.vcspersistence.VCSPersistenceUtil;
import jetbrains.mps.vcs.util.MergeConstants;
import jetbrains.mps.vcs.diff.ui.merge.ISaveMergedModel;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.persistence.PersistenceVersionAware;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.apache.log4j.Level;
import jetbrains.mps.util.FileUtil;
import java.io.IOException;
import javax.swing.JComponent;
import com.intellij.openapi.util.BooleanGetter;
import javax.swing.Action;
import com.intellij.diff.merge.MergeResult;
import com.intellij.diff.merge.MergeUtil;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import com.intellij.openapi.diff.DiffBundle;
import com.intellij.diff.contents.DiffContent;
import com.intellij.openapi.editor.Document;
import java.nio.charset.Charset;
import com.intellij.openapi.vfs.CharsetToolkit;
import jetbrains.mps.persistence.PersistenceUtil;

public class ModelMergeViewer implements MergeTool.MergeViewer {
  private static final Logger LOG_276369528 = LogManager.getLogger(ModelMergeViewer.class);
  private static final Logger LOG = LogManager.getLogger(ModelMergeViewer.class);

  private MergeContext myMergeContext;
  private TextMergeRequest myMergeRequest;

  private MergeModelsPanel myPanel;

  public ModelMergeViewer(MergeContext context, TextMergeRequest request, SModel base, SModel mine, SModel repo) {
    myMergeContext = context;
    myMergeRequest = request;
    myPanel = new MergeModelsPanel(context.getProject(), base, mine, repo, request);
  }

  @Nullable
  public static ModelMergeViewer createComponent(@NotNull MergeContext context, @NotNull MergeRequest request) {
    try {
      TextMergeRequest textRequest = (TextMergeRequest) request;
      List<DocumentContent> contents = textRequest.getContents();
      byte[][] byteContents = {getContentBytes(ListSequence.fromList(contents).getElement(0)), getContentBytes(ListSequence.fromList(contents).getElement(1)), getContentBytes(ListSequence.fromList(contents).getElement(2))};

      final VirtualFile file = ((FileContent) textRequest.getOutputContent()).getFile();
      final File backupFile = MergeBackupUtil.zipModel(byteContents, file);

      final Wrappers._T<String> ext = new Wrappers._T<String>(file.getExtension());
      if (FilePerRootDataSource.isPerRootPersistenceFile(FileSystem.getInstance().getFileByPath(file.getPath()))) {
        // load model partially from per-root persistence with "normal" persistence loading 
        ext.value = MPSExtentions.MODEL;
      }
      final SModel baseModel = VCSPersistenceUtil.loadModel(byteContents[MergeConstants.ORIGINAL], ext.value);
      SModel mineModel = loadModel(byteContents[MergeConstants.CURRENT], ext.value);
      SModel newModel = loadModel(byteContents[MergeConstants.LAST_REVISION], ext.value);
      if (baseModel != null && mineModel != null && newModel != null) {
        final ModelMergeViewer viewer = new ModelMergeViewer(context, textRequest, baseModel, mineModel, newModel);

        ISaveMergedModel saver = new ISaveMergedModel() {
          public boolean save(MergeModelsPanel parent, final SModel resultModel) {
            ApplicationManager.getApplication().assertIsDispatchThread();

            final Wrappers._boolean closeDialog = new Wrappers._boolean(true);
            final Wrappers._T<String> resultContent = new Wrappers._T<String>(null);

            ModelAccess.instance().runReadAction(new Runnable() {
              public void run() {
                try {
                  resultContent.value = ModelMergeViewer.saveModel(resultModel, file, ext.value);
                } catch (Throwable error) {
                  // this can be when saving in 9 persistence after merge with 8 persistence => trying to save in 8th 
                  if (baseModel instanceof PersistenceVersionAware && resultModel instanceof PersistenceVersionAware && ((PersistenceVersionAware) baseModel).getPersistenceVersion() == 8 && ((PersistenceVersionAware) resultModel).getPersistenceVersion() == 9) {
                    String message = "The merged model cannot be saved using the new 9th persistence." + " The most-likely reason: one of the languages used in this model has not yet been generated." + " You can revert the changes, merge and generate the used languages first and only then merge this model again." + " Alternatively, you can save the model in old 8th persistence version and then migrate it to the latest persistence, after all used languages will have been merged manually.";
                    int result = Messages.showYesNoCancelDialog(viewer.getComponent(), message, "Save model " + SModelOperations.getModelName(resultModel), "Save in 8th persistence", "Revert changes", "Return to merge", Messages.getWarningIcon());
                    switch (result) {
                      case Messages.YES:
                        ((PersistenceVersionAware) resultModel).setPersistenceVersion(8);
                        resultContent.value = ModelMergeViewer.saveModel(resultModel, file, ext.value);
                        break;
                      case Messages.NO:
                        resultContent.value = null;
                        break;
                      default:
                        closeDialog.value = false;
                        break;
                    }
                  } else {
                    if (LOG_276369528.isEnabledFor(Level.ERROR)) {
                      LOG_276369528.error("Cannot save merge resulting model " + SModelOperations.getModelName(resultModel), error);
                    }
                  }
                }

              }
            });
            if (resultContent.value != null) {
              ModelAccess.instance().runWriteAction(new Runnable() {
                public void run() {
                  try {
                    file.setBinaryContent(resultContent.value.getBytes(FileUtil.DEFAULT_CHARSET));
                  } catch (IOException e) {
                    if (LOG_276369528.isEnabledFor(Level.ERROR)) {
                      LOG_276369528.error("Cannot save merge result into " + file.getPath(), e);
                    }
                  }
                }
              });
              MergeBackupUtil.packMergeResult(backupFile, file.getName(), resultContent.value);
            }

            return closeDialog.value;
          }
        };
        viewer.myPanel.setSaver(saver);

        return viewer;
      }
    } catch (IOException e) {
      LOG.error(null, e);
    }
    return null;
  }


  @NotNull
  public JComponent getComponent() {
    return myPanel;
  }
  @Nullable
  public JComponent getPreferredFocusedComponent() {
    return myPanel.getPreferredFocusedComponent();
  }

  public MergeTool.ToolbarComponents init() {
    MergeTool.ToolbarComponents components = new MergeTool.ToolbarComponents();

    components.toolbarActions = myPanel.getToolbarActions();
    components.closeHandler = new BooleanGetter() {
      public boolean get() {
        return allowCancel();
      }
    };
    return components;
  }
  @Nullable
  public Action getResolveAction(@NotNull final MergeResult result) {
    String caption = MergeUtil.getResolveActionTitle(result, myMergeRequest, myMergeContext);
    switch (result) {
      case CANCEL:
        return new AbstractAction(caption) {
          public void actionPerformed(ActionEvent e) {
            if (allowCancel()) {
              myMergeContext.finishMerge(MergeResult.CANCEL);
            }
          }
        };
      case RESOLVED:
        return new AbstractAction(caption) {
          public void actionPerformed(ActionEvent e) {
            if (myPanel.saveResults()) {
              myMergeContext.finishMerge(MergeResult.RESOLVED);
            }
          }
        };
      default:
        // Accept LEFT or Accept RIGHT 
        // can't call finishMerge(LEFT/RIGHT) directly, as we probably want accept only one root 
        // we can't just accept old byte[] content, because this could break model 
        return null;
    }
  }
  public void dispose() {
    myPanel.dispose();
  }

  private boolean allowCancel() {
    return Messages.showYesNoDialog(getComponent().getRootPane(), DiffBundle.message("merge.dialog.exit.without.applying.changes.confirmation.message"), DiffBundle.message("cancel.visual.merge.dialog.title"), Messages.getQuestionIcon()) == Messages.YES;
  }

  @Nullable
  private static byte[] getContentBytes(@NotNull DiffContent content) {
    Document document = ((DocumentContent) content).getDocument();
    Charset charset = ((DocumentContent) content).getCharset();
    if (charset == null) {
      charset = CharsetToolkit.getDefaultSystemCharset();
    }
    return document.getText().getBytes(charset);
  }
  @Nullable
  private static SModel loadModel(byte[] bytes, String ext) {
    if (bytes.length == 0) {
      return null;
    }
    return VCSPersistenceUtil.loadModel(bytes, ext);
  }
  @Nullable
  private static String saveModel(SModel resultModel, VirtualFile file, String ext) {
    // file is just to check and select proper format for per-root persistence 
    if (FilePerRootDataSource.isPerRootPersistenceFile(FileSystem.getInstance().getFileByPath(file.getPath()))) {
      return PersistenceUtil.savePerRootModel(resultModel, MPSExtentions.MODEL_HEADER.equals(file.getExtension()));
    } else {
      return PersistenceUtil.saveModel(resultModel, ext);
    }
  }

}
