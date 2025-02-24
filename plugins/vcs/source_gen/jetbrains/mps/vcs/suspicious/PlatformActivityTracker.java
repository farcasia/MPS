package jetbrains.mps.vcs.suspicious;

/*Generated by MPS */

import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vfs.VirtualFileManager;
import jetbrains.mps.ide.platform.watching.ReloadManagerComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.vfs.VirtualFileManagerListener;
import jetbrains.mps.ide.platform.watching.ReloadListener;

/**
 * Monitors and {@link jetbrains.mps.vcs.suspicious.PlatformActivityTracker#isProcessingAllowed() tells} if it's ok to perform our VCS operations (i.e. if no other backround platform VCS job is running and VFS is ready for action
 */
/*package*/ class PlatformActivityTracker {
  private final PlatformActivityTracker.BanVFMListener myVirtualFileManagerListener = new PlatformActivityTracker.BanVFMListener();
  private final PlatformActivityTracker.BanReloadListener myReloadListener = new PlatformActivityTracker.BanReloadListener();
  private final ProjectManager myProjectManager;
  private final VirtualFileManager myVirtualFileManager;
  private final ReloadManagerComponent myReloadManager;

  public PlatformActivityTracker(ProjectManager manager, VirtualFileManager virtualFileManager, ReloadManagerComponent reloadManager) {
    myProjectManager = manager;
    myVirtualFileManager = virtualFileManager;
    myReloadManager = reloadManager;
  }

  public void activate() {
    myReloadManager.addReloadListener(myReloadListener);
    myVirtualFileManager.addVirtualFileManagerListener(myVirtualFileManagerListener);
  }

  public void deactivate() {
    myReloadManager.removeReloadListener(myReloadListener);
    myVirtualFileManager.removeVirtualFileManagerListener(myVirtualFileManagerListener);
  }

  public boolean isProcessingAllowed() {
    for (Project p : myProjectManager.getOpenProjects()) {
      ProjectLevelVcsManager vcsMan = p.getComponent(ProjectLevelVcsManager.class);
      if (vcsMan.isBackgroundVcsOperationRunning()) {
        return false;
      }
    }
    return !(myVirtualFileManagerListener.isBanned()) && !(myReloadListener.isBanned());
  }

  private static class BanVFMListener implements VirtualFileManagerListener {
    private int myVFMBan = 0;
    private BanVFMListener() {
    }
    @Override
    public void beforeRefreshStart(boolean async) {
      if (async) {
        return;
      }
      myVFMBan++;
    }
    @Override
    public void afterRefreshFinish(boolean async) {
      if (async) {
        return;
      }
      myVFMBan--;
    }
    public boolean isBanned() {
      return myVFMBan != 0;
    }
  }

  private static class BanReloadListener implements ReloadListener {
    private int myReloadBan = 0;
    private BanReloadListener() {
    }
    @Override
    public void reloadStarted() {
      myReloadBan++;
    }
    @Override
    public void reloadFinished() {
      myReloadBan--;
    }
    public boolean isBanned() {
      return myReloadBan != 0;
    }
  }
}
