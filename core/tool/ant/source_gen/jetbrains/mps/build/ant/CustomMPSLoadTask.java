package jetbrains.mps.build.ant;

/*Generated by MPS */

import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import java.util.Set;
import java.io.File;
import org.apache.tools.ant.BuildException;
import java.util.LinkedHashSet;

public class CustomMPSLoadTask extends MpsLoadTask {
  private String myWorkerClass;
  private List<String> myArgs;

  public void setWorker(String workerClass) {
    myWorkerClass = workerClass;
  }

  public void setArgs(String args) {
    myArgs = Arrays.asList(args.split(" "));

  }

  protected String getWorkerClass() {
    return myWorkerClass;
  }

  @Override
  @NotNull
  protected List<String> getAdditionalArgs() {
    return (myArgs == null ? Collections.<String>emptyList() : myArgs);
  }

  @Override
  protected Set<File> calculateClassPath(boolean fork) {
    List<File> classPathRoots = MPSClasspathUtil.getClassPathRootsFromDependencies(getProject());
    if (classPathRoots.isEmpty()) {
      throw new BuildException("Dependency on MPS build scripts is required to generate MPS modules.");

    }
    Set<File> classPath = new LinkedHashSet<File>();
    for (File file : classPathRoots) {
      MPSClasspathUtil.gatherAllClassesAndJarsUnder(file, classPath);
    }

    return classPath;
  }
}
