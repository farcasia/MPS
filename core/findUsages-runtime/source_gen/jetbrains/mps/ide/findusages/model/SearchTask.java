package jetbrains.mps.ide.findusages.model;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.ModelAccess;
import org.jetbrains.mps.openapi.util.ProgressMonitor;

/**
 * Abstraction of search activity one could execute several times.
 * Use {@link jetbrains.mps.ide.findusages.model.SearchTask#canExecute() } and {@link jetbrains.mps.ide.findusages.model.SearchTask#execute(ModelAccess, ProgressMonitor) }.
 */
public interface SearchTask {
  boolean canExecute();
  SearchResults execute(ModelAccess modelAccess, ProgressMonitor progressMonitor);
}
