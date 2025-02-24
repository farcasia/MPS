package jetbrains.mps.ide.platform.watching;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.util.Map;
import com.intellij.openapi.vfs.LocalFileSystem;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonNls;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.util.FileUtil;
import org.apache.log4j.Level;

/**
 * Component that lets you add watch requests.
 * It also lets you maintain big umbrella watched paths, like a whole project dir.
 * This saves us a lot of other watch request creation, if they are under project dir, which is often the case.
 * The thing is our module structure is opaque (arbitrary model roots, data sources, etc, all of them
 * adding fs listeners on some dirs/files), unlike idea's where there is a known structure: modules, source roots.
 */
public class WatchedRoots implements ApplicationComponent {
  private static final Logger LOG = LogManager.getLogger(WatchedRoots.class);
  private final Map<String, LocalFileSystem.WatchRequest> myRequests = new HashMap<String, LocalFileSystem.WatchRequest>();
  private final Map<String, Integer> myRequestedPaths = new HashMap<String, Integer>();
  private final LocalFileSystem myLocalFileSystem;

  public WatchedRoots(@NotNull LocalFileSystem lfs) {
    myLocalFileSystem = lfs;
  }

  @Override
  public void initComponent() {
  }

  @Override
  public void disposeComponent() {
  }

  @NonNls
  @NotNull
  @Override
  public String getComponentName() {
    return "Watched Roots";
  }

  /**
   * 
   * @return true iff a new watch request was registered at the local file system
   */
  public synchronized boolean addWatchRequest(@NotNull String path) {
    ApplicationManager.getApplication().assertReadAccessAllowed();
    Integer count = myRequestedPaths.get(path);
    if (count != null) {
      myRequestedPaths.put(path, count + 1);
      return false;
    } else {
      myRequestedPaths.put(path, 1);
      return maybeAddWatchRequest(path);
    }
  }

  private boolean maybeAddWatchRequest(String path) {
    boolean alreadyCovered = false;

    for (LocalFileSystem.WatchRequest watch : CollectionSequence.fromCollection(myRequests.values())) {
      String watchPath = watch.getRootPath();
      if (FileUtil.isSubPath(watchPath, path)) {
        alreadyCovered = true;
        break;
      }
    }
    if (!(alreadyCovered)) {
      if (LOG.isDebugEnabled()) {
        LOG.debug("Adding watch request for the path " + path);
      }
      LocalFileSystem.WatchRequest request = myLocalFileSystem.addRootToWatch(path, true);
      if (LOG.isDebugEnabled()) {
        LOG.debug("Watch request added");
      }
      if (request != null) {
        myRequests.put(path, request);
        return true;
      }
    }
    return false;
  }

  public synchronized void removeWatchRequest(@NotNull String path) {
    ApplicationManager.getApplication().assertReadAccessAllowed();
    Integer count = myRequestedPaths.get(path);
    if (count == null || count == 0) {
      if (LOG.isEnabledFor(Level.WARN)) {
        LOG.warn("The watch request for the path " + path + " is not presented");
      }
      return;
    }
    if (--count > 0) {
      myRequestedPaths.put(path, count);
    } else {
      myRequestedPaths.remove(path);
      LocalFileSystem.WatchRequest req = myRequests.get(path);
      myLocalFileSystem.removeWatchedRoot(req);
      myRequests.remove(path);
    }
  }
}
