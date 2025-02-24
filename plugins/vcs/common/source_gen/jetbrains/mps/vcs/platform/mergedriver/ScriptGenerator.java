package jetbrains.mps.vcs.platform.mergedriver;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.project.Project;
import java.io.File;
import com.intellij.openapi.application.ApplicationInfo;
import jetbrains.mps.vcs.core.mergedriver.MergeDriverMain;
import com.intellij.openapi.util.SystemInfo;
import java.util.List;
import jetbrains.mps.util.StringsIO;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Objects;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.io.IOException;
import com.intellij.openapi.ui.Messages;

/*package*/ class ScriptGenerator {
  public static final int GIT = 1;
  public static final int SVN = 2;
  private ScriptGenerator() {
  }
  @NotNull
  public static AbstractInstaller.State generateScript(Project project, String filetype, int vcs, File scriptFile, boolean dryRun) {
    final String buildstring = "build=" + ApplicationInfo.getInstance().getBuild().asString();
    String[] lines;
    if (GIT == vcs) {
      lines = new String[]{"#/bin/sh", "# " + buildstring, String.format("%s " + filetype + " " + MergeDriverMain.GIT_OPTION + " $1 $2 $3 $4", CommandLineGenerator.getCommandLine(GIT))};
    } else if (SVN == vcs) {
      if (SystemInfo.isWindows) {
        lines = new String[]{"@ECHO OFF", "REM " + buildstring, "SHIFT", "SHIFT", String.format("%s " + filetype + " " + MergeDriverMain.SVN_OPTION + " %%8 %%7 %%9 %%4 %%2 %%6", CommandLineGenerator.getCommandLine(SVN))};
      } else {
        lines = new String[]{"#/bin/sh", "# " + buildstring, String.format("%s " + filetype + " " + MergeDriverMain.SVN_OPTION + " ${10} $9 ${11} $6 $4 $8", CommandLineGenerator.getCommandLine(SVN))};
      }
    } else {
      throw new IllegalArgumentException();
    }
    try {
      if (dryRun) {
        if (scriptFile.exists()) {
          List<String> linesInFile = StringsIO.readLines(scriptFile);
          if (ListSequence.fromList(linesInFile).count() == lines.length) {
            for (int i = 0; i < lines.length; i++) {
              if (!(Objects.equals(ListSequence.fromList(linesInFile).getElement(i), lines[i]))) {
                return AbstractInstaller.State.OUTDATED;
              }
            }
            return AbstractInstaller.State.INSTALLED;
          } else {
            return AbstractInstaller.State.OUTDATED;
          }
        } else {
          return AbstractInstaller.State.NOT_INSTALLED;
        }
      }
      StringsIO.writeLines(scriptFile, Sequence.fromArray(lines));
      if (SystemInfo.isUnix && !(scriptFile.setExecutable(true))) {
        throw new IOException("Can't make script executable");
      }
      return AbstractInstaller.State.INSTALLED;
    } catch (IOException e) {
      Messages.showErrorDialog(project, "Can't create merger script: " + e.getMessage(), "Can't Create Merger Script");
      return AbstractInstaller.State.NOT_INSTALLED;
    }
  }
}
