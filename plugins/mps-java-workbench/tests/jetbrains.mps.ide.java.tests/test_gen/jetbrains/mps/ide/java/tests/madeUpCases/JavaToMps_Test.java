package jetbrains.mps.ide.java.tests.madeUpCases;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.ide.java.tests.utility.Utils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.AbstractModule;

@MPSLaunch
public class JavaToMps_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(JavaToMps_Test.class, "${mps_home}", "r:62acf462-bd7b-40b0-b72a-892ef900fe37(jetbrains.mps.ide.java.tests.madeUpCases@tests)", false);


  public JavaToMps_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_SelfRef() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_SelfRef", true);
  }
  @Test
  public void test_ClassWInnerInterace() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_ClassWInnerInterace", true);
  }
  @Test
  public void test_Imports1() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_Imports1", true);
  }
  @Test
  public void test_Imports2() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_Imports2", true);
  }
  @Test
  public void test_Imports3() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_Imports3", true);
  }
  @Test
  public void test_Annotations() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_Annotations", true);
  }
  @Test
  public void test_ClassNesting() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_ClassNesting", true);
  }
  @Test
  public void test_FullSource() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_FullSource", true);
  }
  @Test
  public void test_LittleSource() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_LittleSource", true);
  }
  @Test
  public void test_ByteCodeVsSourceStubs() throws Throwable {
    runTest("jetbrains.mps.ide.java.tests.madeUpCases.JavaToMps_Test$TestBody", "test_ByteCodeVsSourceStubs", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_SelfRef() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkFile(this.testsLocation().getDescendant("singleFiles/selfref"), SNodeOperations.cast(getNodeById("4795297196607521155"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
    }
    public void test_ClassWInnerInterace() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkFile(this.testsLocation().getDescendant("singleFiles/classwiface"), SNodeOperations.cast(getNodeById("1218582063869484741"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
    }
    public void test_Imports1() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkStubModels(this.testsLocation().getDescendant("testDir1"), PersistenceFacade.getInstance().createModelReference("r:ef4b52fd-dbf4-4fce-b7bb-1854f38cfc7e(jetbrains.mps.ide.java.testMaterial.testModel1)"), PersistenceFacade.getInstance().createModelReference("r:4bf8b65f-f792-4142-b0d6-29e233d89bf9(jetbrains.mps.ide.java.testMaterial.testModel1.sub)"));
    }
    public void test_Imports2() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkStubModels(this.testsLocation().getDescendant("testDir2"), PersistenceFacade.getInstance().createModelReference("r:d45660ba-136e-450b-8238-fb2cceb7481c(jetbrains.mps.ide.java.testMaterial.testModel2)"), PersistenceFacade.getInstance().createModelReference("r:ebf0924b-b6b1-4927-b5b5-45c50b516a21(jetbrains.mps.ide.java.testMaterial.testModel2.sub)"));
    }
    public void test_Imports3() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkStubModels(this.testsLocation().getDescendant("testDir3"), PersistenceFacade.getInstance().createModelReference("r:d8a04b41-593b-40ad-8fa1-52c3ccb0b7ef(jetbrains.mps.ide.java.testMaterial.testModel3)"), PersistenceFacade.getInstance().createModelReference("r:8b9c3824-e139-4993-893a-476446730917(jetbrains.mps.ide.java.testMaterial.testModel3.sub)"));
    }
    public void test_Annotations() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkStubModels(this.testsLocation().getDescendant("testDirAnnotations"), PersistenceFacade.getInstance().createModelReference("r:34fd912a-e1ab-4cd8-b902-62b5e223065f(jetbrains.mps.ide.java.testMaterial.annotations)"), PersistenceFacade.getInstance().createModelReference("r:acd963df-05cb-4d3c-ae72-bfc5c052a222(jetbrains.mps.ide.java.testMaterial.annotations.user)"));
    }
    public void test_ClassNesting() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkFile(this.testsLocation().getDescendant("singleFiles/nestcontainer"), SNodeOperations.cast(getNodeById("8083368042256419834"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8c108ca66L, "ClassConcept"))));
    }
    public void test_FullSource() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
    }
    public void test_LittleSource() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      new Utils(myProject.getRepository()).checkSourceModel(this.testsLocation().getDescendant("singleFiles/statements"), PersistenceFacade.getInstance().createModelReference("r:2527791c-6ce6-4422-9215-ce9af0862613(jetbrains.mps.ide.java.testMaterial.singleFiles)"));
    }
    public void test_ByteCodeVsSourceStubs() throws Exception {
      addNodeById("4795297196607520929");
      addNodeById("1218582063869484737");
      addNodeById("8083368042256419833");
      String guavaPath = this.testsLocation() + "realCodeBase/google-guava/";
      new Utils(myProject.getRepository()).compareBinAndSrcStubs(guavaPath + "guava-12.0.1.jar", guavaPath + "src");
    }


    public IFile testsLocation() {
      SModule testMaterial = PersistenceFacade.getInstance().createModuleReference("49166c31-952a-46f6-8970-ea45964379d0(jetbrains.mps.ide.java.testMaterial)").resolve(myProject.getRepository());
      return ((AbstractModule) testMaterial).getOutputPath();
    }
  }
}
