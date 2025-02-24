package jetbrains.mps.vcs.diff.ui.common;

/*Generated by MPS */

import com.intellij.openapi.fileEditor.DocumentsEditor;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import org.jetbrains.annotations.NotNull;
import javax.swing.JComponent;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import java.beans.PropertyChangeListener;
import com.intellij.codeHighlighting.BackgroundEditorHighlighter;
import com.intellij.openapi.fileEditor.FileEditorLocation;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.editor.Document;
import jetbrains.mps.nodefs.MPSNodeVirtualFile;
import jetbrains.mps.ide.undo.MPSUndoUtil;

public class DiffFileEditor implements DocumentsEditor {
  private DiffEditor.MainEditorComponent myEditor;
  private FileEditorState myState = new FileEditorState() {
    public boolean canBeMergedWith(FileEditorState p0, FileEditorStateLevel p1) {
      return false;
    }
  };

  public DiffFileEditor(DiffEditor.MainEditorComponent editor) {
    myEditor = editor;
  }
  @NotNull
  public JComponent getComponent() {
    return null;
  }
  @Nullable
  public JComponent getPreferredFocusedComponent() {
    return null;
  }
  @NonNls
  @NotNull
  public String getName() {
    return null;
  }
  @NotNull
  public FileEditorState getState(@NotNull FileEditorStateLevel level) {
    return myState;
  }
  public void setState(@NotNull FileEditorState state) {
    myState = state;
  }
  public boolean isModified() {
    return false;
  }
  public boolean isValid() {
    return false;
  }
  public void selectNotify() {
  }
  public void deselectNotify() {
  }
  public void addPropertyChangeListener(@NotNull PropertyChangeListener listener) {
  }
  public void removePropertyChangeListener(@NotNull PropertyChangeListener listener) {
  }
  @Nullable
  public BackgroundEditorHighlighter getBackgroundHighlighter() {
    return null;
  }
  @Nullable
  public FileEditorLocation getCurrentLocation() {
    return null;
  }
  @Nullable
  public StructureViewBuilder getStructureViewBuilder() {
    return null;
  }
  @Nullable
  public <T> T getUserData(@NotNull Key<T> key) {
    return null;
  }
  public <T> void putUserData(@NotNull Key<T> key, @Nullable T t) {
  }
  public void dispose() {
  }
  public Document[] getDocuments() {
    MPSNodeVirtualFile virtualFile = myEditor.getVirtualFile();
    if (virtualFile == null) {
      return new Document[0];
    }
    Document document = MPSUndoUtil.getDoc(virtualFile);
    return (document != null ? new Document[]{document} : new Document[0]);
  }
}
