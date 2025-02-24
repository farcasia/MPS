package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.junit.rules.TestRule;
import jetbrains.mps.project.Project;
import org.jetbrains.mps.openapi.model.SModel;
import org.junit.runners.model.Statement;
import org.junit.runner.Description;
import jetbrains.mps.smodel.tempmodel.TemporaryModels;

/**
 * Th problem is: we need to initialize, dispose and share data between instances of the same class (JUnit by default gets new instance for each test method).
 * We need something like instance field, but preserved for all instances of the same class. As long as there's no easy way to have external configuration for a test 
 * (I didn't find any standard mechanism, and writing custom runner is not the task I'd like to address now), we use static field in each generated test class.
 * 
 * Intended use: static field with {@link org.junit.ClassRule } annotation in specific test class.
 */
public final class TestParametersCache implements TestRule {
  private final Class<? extends TransformationTest> myOwner;
  private final String myProjectName;
  private final String myModelRef;
  private final boolean myReOpenProject;

  private Project myProject;
  private SModel myTestModel;
  private SModel myTransientModel;
  private boolean myInitialized = false;

  public TestParametersCache(Class<? extends TransformationTest> owner, String projectName, String modelRef, boolean reOpenProject) {
    myOwner = owner;
    myProjectName = projectName;
    myModelRef = modelRef;
    myReOpenProject = reOpenProject;
  }

  @Override
  public Statement apply(final Statement statement, Description description) {
    return new Statement() {
      public void evaluate() throws Throwable {
        statement.evaluate();
        //  NOTE, with in-process execution, TestParametersCache instance kept in a static field would be re-used, hence clean shall 
        // leave a state we can re-initialize in once again. 
        clean();
      }
    };
  }

  public void populate(BaseTransformationTest test) throws Exception {
    assert test.getClass() == myOwner;

    if (myInitialized) {
      test.setProject(myProject);
      test.setModelDescriptor(myTestModel);
      test.setTransientModelDescriptor(myTransientModel);
      return;
    }
    test.initTest(myProjectName, myModelRef, myReOpenProject);
    myProject = test.getProject();
    myTestModel = test.getModelDescriptor();
    myTransientModel = test.getTransientModelDescriptor();
    myInitialized = true;
  }

  public void populate() {
  }

  public Project getProject() {
    return myProject;
  }

  public SModel getTestModel() {
    return myTestModel;
  }

  public SModel getTransientModel() {
    return myTransientModel;
  }

  /*package*/ void clean() {
    if (myProject == null) {
      return;
    }
    myProject.getModelAccess().runWriteInEDT(new Runnable() {
      public void run() {
        TemporaryModels.getInstance().dispose(myTransientModel);
        myTransientModel = null;
      }
    });
    myProject = null;
    myTestModel = null;
    myInitialized = false;
  }
}
