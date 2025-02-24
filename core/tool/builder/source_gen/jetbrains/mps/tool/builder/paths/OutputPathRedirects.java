package jetbrains.mps.tool.builder.paths;

/*Generated by MPS */

import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;

public class OutputPathRedirects implements IRedirects {
  private String outputRoot;
  private String cachesOutputRoot;
  private boolean useTransientOutput;
  private ModuleOutputPaths moduleOutputPaths;

  /**
   * 
   * @deprecated there's no reason to bound IRedirects to string, if we know about IFile anyway. OutputPathRedirects shall not make assumptions about FS (or shall get FS as cons argument directly). Use {@link jetbrains.mps.tool.builder.paths.OutputPathRedirects#OutputPathRedirects(ModuleOutputPaths, IFile, IFile, boolean) }instead.
   */
  @Deprecated
  public OutputPathRedirects(ModuleOutputPaths outputPaths, String outputRoot, String cachesOutputRoot, boolean useTransientOutput) {
    this.outputRoot = outputRoot;
    this.cachesOutputRoot = cachesOutputRoot;
    this.useTransientOutput = useTransientOutput;
    this.moduleOutputPaths = outputPaths;
  }

  public OutputPathRedirects(ModuleOutputPaths outputPaths, IFile outputRoot, IFile cachesOutputRoot, boolean useTransientOutput) {
    this.outputRoot = outputRoot.getPath();
    this.cachesOutputRoot = cachesOutputRoot.getPath();
    this.useTransientOutput = useTransientOutput;
    this.moduleOutputPaths = outputPaths;
  }
  @Override
  public IFile getRedirect(String path) {
    if (useTransientOutput) {
      IFile outputRedirect = getOutputRedirect(path);
      if (outputRedirect != null) {
        return outputRedirect;
      }
    }
    // use transient folder for caches always 
    IFile cachesOutputRedirect = getCachesOutputRedirect(path);
    if (cachesOutputRedirect != null) {
      return cachesOutputRedirect;
    }

    // can't convert, return the literal path 
    return FileSystem.getInstance().getFileByPath(path);
  }
  public IFile getOutputRedirect(String path) {
    if (outputRoot != null) {
      String localOutPath = moduleOutputPaths.toLocalPath(path);
      if (localOutPath != null) {
        return FileSystem.getInstance().getFileByPath(outputRoot).getDescendant(localOutPath);
      }
    }
    return null;
  }
  public IFile getCachesOutputRedirect(String path) {
    if (cachesOutputRoot != null) {
      String localOutCachePath = moduleOutputPaths.toLocalCachePath(path);
      if (localOutCachePath != null) {
        return FileSystem.getInstance().getFileByPath(cachesOutputRoot).getDescendant(localOutCachePath);
      }
    }
    return null;
  }
  public boolean isInCacheOutput(String fullPath) {
    if (cachesOutputRoot != null && fullPath != null) {
      return fullPath.startsWith(cachesOutputRoot);
    }
    return false;
  }
}
