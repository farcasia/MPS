package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import javax.swing.JButton;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.nodeEditor.EditorSettings;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingUtilities;
import java.awt.Frame;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.module.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.MacroHelper;
import jetbrains.mps.util.MacrosFactory;
import java.io.File;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.editor.runtime.commands.EditorCommand;

/**
 * 
 * @deprecated use {@link jetbrains.mps.editor.runtime.EditorUtil } instead, will be removed after 2017.2
 */
@Deprecated
public class SelectImageFileButton extends JButton {
  private final SNode myNode;
  private final EditorContext myEditorContext;

  @Deprecated
  public SelectImageFileButton(SNode node, EditorContext editorContext) {
    this.myNode = node;
    this.myEditorContext = editorContext;
    this.setFont(EditorSettings.getInstance().getDefaultEditorFont());
    this.setBorder(new MetalBorders.ButtonBorder());

    this.setAction(new AbstractAction(" ... ") {
      @Override
      public void actionPerformed(ActionEvent e) {
        Component root = SwingUtilities.getRoot(SelectImageFileButton.this);
        if (root instanceof Frame) {
          Frame frame = (Frame) root;
          TreeFileChooser chooser = new TreeFileChooser();
          final Wrappers._T<String> filename = new Wrappers._T<String>(null);
          ModelAccess modelAccess = myEditorContext.getRepository().getModelAccess();
          modelAccess.runReadAction(new Runnable() {
            public void run() {
              filename.value = SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1095e12de6fL, 0x1095e2f7e63L, "imageFile"));
            }
          });

          AbstractModule module = (AbstractModule) SNodeOperations.getModel(myNode).getModule();
          MacroHelper macroHelper = MacrosFactory.forModule(module);
          if (macroHelper != null) {
            filename.value = macroHelper.expandPath(filename.value);
          }
          final File baseFile = (filename.value == null ? null : new File(filename.value));

          if (baseFile != null && baseFile.exists()) {
            chooser.setInitialFile(FileSystem.getInstance().getFileByPath(baseFile.getAbsolutePath()));
          }
          IFile result = chooser.showDialog(frame);
          if (result == null) {
            return;
          }
          String selectedPath = result.getPath();
          final String pathToShow = (macroHelper == null ? selectedPath : macroHelper.shrinkPath(selectedPath));
          modelAccess.executeCommand(new EditorCommand(myEditorContext) {
            protected void doExecute() {
              SPropertyOperations.set(SelectImageFileButton.this.myNode, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1095e12de6fL, 0x1095e2f7e63L, "imageFile"), pathToShow);
            }
          });
        }
      }
    });
  }
}
