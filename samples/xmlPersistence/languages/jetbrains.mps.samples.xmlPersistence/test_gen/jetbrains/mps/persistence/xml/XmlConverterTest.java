package jetbrains.mps.persistence.xml;

/*Generated by MPS */

import jetbrains.mps.tool.environment.EnvironmentAware;
import jetbrains.mps.project.Project;
import jetbrains.mps.tool.environment.Environment;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.IOException;
import org.jetbrains.mps.openapi.persistence.ModelSaveException;
import jetbrains.mps.extapi.model.SModelPersistence;
import jetbrains.mps.persistence.XmlModelPersistence;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;
import jetbrains.mps.extapi.model.SModelData;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.util.FileUtil;
import java.io.InputStreamReader;
import org.junit.Assert;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.mps.openapi.persistence.DataSourceListener;
import java.io.ByteArrayOutputStream;

/**
 * FIXME The test is not part of tests executed for an MPS build. Likely, it's to be executed from IDE when XmlModelPersistence is chaneged. 
 * Nevertheless, consider including the test into some suite (not sure which one, though).
 */
public class XmlConverterTest implements EnvironmentAware {
  private Project myProject;
  private Environment myEnvironment;

  /**
   * 
   * @param environment bare MPS environment suffice
   */
  @Override
  public void setEnvironment(@NotNull Environment environment) {
    myEnvironment = environment;
  }

  @Before
  public void prepareProject() {
    myProject = myEnvironment.createEmptyProject();
  }

  @After
  public void tearDownProject() {
    myProject.dispose();
  }

  @Test
  public void testXml1() throws Exception {
    testXml("/jetbrains/mps/persistence/xml/testdata/test1.xml");
  }
  @Test
  public void testXml2() throws Exception {
    testXml("/jetbrains/mps/persistence/xml/testdata/test2.xml");
  }
  @Test
  public void testXml3() throws Exception {
    testXml("/jetbrains/mps/persistence/xml/testdata/test3.xml");
  }
  private void testXml(String resource) throws IOException, ModelSaveException {
    final SModelPersistence pers = new XmlModelPersistence();
    final StreamDataSource source = new XmlConverterTest.MyDataSource(resource);
    final XmlConverterTest.StringBuilderDataSource sbds = new XmlConverterTest.StringBuilderDataSource();
    myProject.getModelAccess().runReadAction(new Runnable() {
      @Override
      public void run() {
        try {
          SModelData model = pers.readModel(new SModelReference(new ModuleReference("mockModule", ModuleId.regular()), SModelId.generate(), "xmlfile"), source);
          pers.writeModel(model, sbds);
        } catch (IOException e) {
          throw new RuntimeException(e);
        } catch (ModelSaveException e) {
          throw new RuntimeException(e);
        }
      }
    });
    String after = sbds.getResult();
    String before = FileUtil.read(new InputStreamReader(source.openInputStream(), FileUtil.DEFAULT_CHARSET)).trim();
    Assert.assertEquals(before, after);
  }
  private class MyDataSource implements StreamDataSource {
    private final String resourceName;
    private MyDataSource(String resourceName) {
      this.resourceName = resourceName;
    }
    @NotNull
    @Override
    public String getLocation() {
      return "test";
    }
    @Override
    public InputStream openInputStream() throws IOException {
      InputStream stream = XmlConverterTest.this.getClass().getResourceAsStream(resourceName);
      Assert.assertNotNull(stream);
      return stream;
    }
    @Override
    public boolean isReadOnly() {
      return true;
    }
    @Override
    public OutputStream openOutputStream() throws IOException {
      throw new UnsupportedOperationException();
    }
    @Override
    public void addListener(DataSourceListener listener) {
      throw new UnsupportedOperationException();
    }
    @Override
    public void removeListener(DataSourceListener listener) {
      throw new UnsupportedOperationException();
    }
    @Override
    public long getTimestamp() {
      return 0;
    }
  }
  private static class StringBuilderDataSource implements StreamDataSource {
    /*package*/ ByteArrayOutputStream bos = new ByteArrayOutputStream();
    private StringBuilderDataSource() {
    }
    public String getResult() {
      return new String(bos.toByteArray(), FileUtil.DEFAULT_CHARSET);
    }
    @NotNull
    @Override
    public String getLocation() {
      return "test";
    }
    @Override
    public InputStream openInputStream() throws IOException {
      throw new UnsupportedOperationException();
    }
    @Override
    public boolean isReadOnly() {
      return false;
    }
    @Override
    public OutputStream openOutputStream() throws IOException {
      return bos;
    }
    @Override
    public void addListener(DataSourceListener listener) {
    }
    @Override
    public void removeListener(DataSourceListener listener) {
    }
    @Override
    public long getTimestamp() {
      return 0;
    }
  }
}
