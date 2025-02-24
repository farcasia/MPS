package jetbrains.mps.lang.editor.imageGen.tests;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import java.awt.image.BufferedImage;
import junit.framework.Assert;
import java.io.IOException;

@MPSLaunch
public class ImageExport_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(ImageExport_Test.class, "${mps_home}", "r:57812925-2ef0-43c6-8314-0222b2c13acf(jetbrains.mps.lang.editor.imageGen.tests@tests)", false);


  public ImageExport_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_manuallyExportedImage() throws Throwable {
    runTest("jetbrains.mps.lang.editor.imageGen.tests.ImageExport_Test$TestBody", "test_manuallyExportedImage", true);
  }
  @Test
  public void test_imageExportedByGenerator() throws Throwable {
    runTest("jetbrains.mps.lang.editor.imageGen.tests.ImageExport_Test$TestBody", "test_imageExportedByGenerator", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_manuallyExportedImage() throws Exception {
      ImageLoader imageloader = new ImageLoader("ManuallyExportedImage.gif");
      try {
        BufferedImage image = imageloader.getImage();
        Assert.assertNotNull(image);
      } catch (IOException e) {
        Assert.fail("exception on loading image: " + e);
      }
    }
    public void test_imageExportedByGenerator() throws Exception {
      ImageLoader imageloader = new ImageLoader(Cls.class.getSimpleName() + ".png");
      try {
        BufferedImage image = imageloader.getImage();
        Assert.assertNotNull(image);
      } catch (IOException e) {
        Assert.fail("exception on loading image: " + e);
      }
    }


  }
}
