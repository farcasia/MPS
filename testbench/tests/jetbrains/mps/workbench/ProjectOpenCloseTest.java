/*
 * Copyright 2003-2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.workbench;

import com.intellij.util.ui.UIUtil;
import jetbrains.mps.extapi.module.SRepositoryExt;
import jetbrains.mps.project.Project;
import jetbrains.mps.testbench.TestModuleFactoryBase;
import jetbrains.mps.tool.environment.Environment;
import jetbrains.mps.tool.environment.EnvironmentAware;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModule;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Testing opening and closing projects
 * Adding and removing modules from them.
 * Need an {@link Environment} to create/open projects at.
 * Is supposed to work with both bare MPS and full-fledged IDEA Environment instances
 */
public class ProjectOpenCloseTest implements EnvironmentAware {
  private static final FileSystem FS = FileSystem.getInstance();

  private Environment myEnvironment;
  private TestModuleFactoryBase myTestModuleFactory;

  @Override
  public void setEnvironment(@NotNull Environment env) {
    myEnvironment = env;
  }

  private Environment getEnvironment() {
    return myEnvironment;
  }

  @Test
  public void addModule() {
    Project project = getEnvironment().createEmptyProject();
    myTestModuleFactory = new TestModuleFactoryBase((SRepositoryExt) project.getRepository());
    IFile descriptorFile = FS.getFile(FileUtil.createTmpFile().getPath());
    SModule newModule = myTestModuleFactory.createSolution(descriptorFile);
    project.getModelAccess().runWriteAction(() -> project.addModule(newModule));
    Assert.assertTrue(project.getProjectModules().contains(newModule));
    project.dispose();
  }

  @Test
  public void removeModule() {
    Project project = getEnvironment().createEmptyProject();
    myTestModuleFactory = new TestModuleFactoryBase((SRepositoryExt) project.getRepository());
    IFile descriptorFile = FS.getFile(FileUtil.createTmpFile().getPath());
    SModule newModule = myTestModuleFactory.createSolution(descriptorFile);
    project.getModelAccess().runWriteAction(() -> project.addModule(newModule));
    project.getModelAccess().runWriteAction(() -> project.removeModule(newModule));
    Assert.assertFalse(project.getProjectModules().contains(newModule));
    project.dispose();
  }

  @Test
  public void reopenProject() {
    Project project = getEnvironment().createEmptyProject();
    project.dispose();
    project = getEnvironment().createEmptyProject();
    Assert.assertFalse(project.isDisposed());
    project.dispose();
    Assert.assertTrue(project.isDisposed());
  }

  @Test
  public void openTwoProjects() {
    Project project1 = getEnvironment().createEmptyProject();
    Project project2 = getEnvironment().createEmptyProject();
    project1.dispose();
    project2.dispose();
  }

  @Test
  public void reopenMPSProject() {
    Project mpsProject = getEnvironment().openProject(new File(PathManager.getHomePath()));
    testWait();
    mpsProject.dispose();
  }

  @Test //turn off test
  public void reopenMPSProject2() {
    // TODO: why need to create empty project if any way existing project going to be opened?

    getEnvironment().createEmptyProject();
    Project mpsProject = getEnvironment().openProject(new File(PathManager.getHomePath()));

    testWait();

    mpsProject.dispose();

    testWait();

    getEnvironment().createEmptyProject();
    mpsProject = getEnvironment().openProject(new File(PathManager.getHomePath()));

    testWait();

    mpsProject.dispose();

    testWait();
  }

  private void testWait() {
    // TODO: get rid of this HACK
    // Waits for every thing will be finished before doing something next step
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    UIUtil.invokeAndWaitIfNeeded(new Runnable() {
      @Override
      public void run() {
        UIUtil.dispatchAllInvocationEvents();
      }
    });
  }
}
