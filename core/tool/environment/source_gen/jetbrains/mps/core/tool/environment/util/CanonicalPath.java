package jetbrains.mps.core.tool.environment.util;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.util.FileUtil;
import java.io.File;

public final class CanonicalPath {
  @NotNull
  private final String myCanonicalPath;

  public CanonicalPath(@NonNls String path) {
    myCanonicalPath = convertToCanonical(path);
  }

  private static String convertToCanonical(@NonNls String path) {
    String canonicalPath = FileUtil.getCanonicalPath(path);
    return FileUtil.getUnixPath(canonicalPath);
  }

  public boolean isValidDirectory() {
    File file = new File(myCanonicalPath);
    if (file.exists() && file.isDirectory()) {
      return true;
    }
    return false;
  }

  public String getValue() {
    return myCanonicalPath;
  }
}
