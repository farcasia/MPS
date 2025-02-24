package jetbrains.mps.ide.httpsupport.tests.lang;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.ide.httpsupport.tests.plugin.PingStorage;
import junit.framework.Assert;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.intellij.util.ExceptionUtil;
import org.jetbrains.ide.BuiltInServerManager;
import io.netty.handler.codec.http.QueryStringEncoder;
import jetbrains.mps.ide.httpsupport.tests.plugin.testConverter_Converter;

@MPSLaunch
public class TestRHBehavior_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(TestRHBehavior_Test.class, "${mps_home}", "r:9e9ac0ea-b755-4d57-b406-d0cd74445963(jetbrains.mps.ide.httpsupport.tests.lang@tests)", false);


  public TestRHBehavior_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_testRHSimple() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHSimple", true);
  }
  @Test
  public void test_testRHNoRequiredParams() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHNoRequiredParams", true);
  }
  @Test
  public void test_testRHRequiredParams() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHRequiredParams", true);
  }
  @Test
  public void test_testRHException() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHException", true);
  }
  @Test
  public void test_testRHTurnBack1() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHTurnBack1", true);
  }
  @Test
  public void test_testRHTurnBack2() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHTurnBack2", true);
  }
  @Test
  public void test_testURlBuilder1() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testURlBuilder1", true);
  }
  @Test
  public void test_testURlBuilder2() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testURlBuilder2", true);
  }
  @Test
  public void test_testRHConflicts() throws Throwable {
    runTest("jetbrains.mps.ide.httpsupport.tests.lang.TestRHBehavior_Test$TestBody", "test_testRHConflicts", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_testRHSimple() throws Exception {
      String url = this.buildRequest("/handlerTest/simple");
      this.testRequestResponse(url, 200, "handled");
    }
    public void test_testRHNoRequiredParams() throws Exception {
      String url = this.buildRequest("/handlerTest/requiredParams");
      this.testRequestResponse(url, 404, null);
    }
    public void test_testRHRequiredParams() throws Exception {
      String url = this.buildRequest("/handlerTest/requiredParams?param=a");
      this.testRequestResponse(url, 200, "handled");
    }
    public void test_testRHException() throws Exception {
      String url = this.buildRequest("/handlerTest/exception");
      this.testRequestResponse(url, 500, null);
    }
    public void test_testRHTurnBack1() throws Exception {
      String test = "testString";
      String url = this.buildRequest("/handlerTest/turnBack1?param=" + test);
      this.testRequestResponse(url, 200, test);
    }
    public void test_testRHTurnBack2() throws Exception {
      String test = "testString";
      String url = this.buildRequest("/handlerTest/turnBack2?param=" + test);
      this.testRequestResponse(url, 200, test + " deserialized");
    }
    public void test_testURlBuilder1() throws Exception {
      String test = "testString";
      String url = buildRequest_17tcaj_a0a1a6p(test);
      this.testRequestResponse(url, 200, test);
    }
    public void test_testURlBuilder2() throws Exception {
      String test = "testString";
      String url = buildRequest_17tcaj_a0a1a7p(test);
      this.testRequestResponse(url, 200, test + " serialized deserialized");
    }
    public void test_testRHConflicts() throws Exception {
      PingStorage.reset();
      String url = this.buildRequest("/handlerTest/conflict");
      this.testRequestResponse(url, 200, "handled");

      // If request handlers conflict with each other, only one of them should handle incoming request 
      Assert.assertEquals(PingStorage.pingCount(), 1);
    }


    public void testRequestResponse(String requestUrl, int exectedRetCode, String expectedResponse) {
      try {
        URL obj = new URL(requestUrl);
        HttpURLConnection con = as_17tcaj_a0a1a0a11p(obj.openConnection(), HttpURLConnection.class);
        con.connect();

        Assert.assertEquals(exectedRetCode, con.getResponseCode());
        if (expectedResponse != null) {
          BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
          String inputLine;
          StringBuffer response = new StringBuffer();
          while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
          }
          in.close();

          Assert.assertEquals(expectedResponse, response.toString());
        }

      } catch (IOException exception) {
        Assert.fail("got exception on testing" + requestUrl + ":\n" + ExceptionUtil.getThrowableText(exception));
      }
    }
    public String buildRequest(String path) {
      return "http://localhost:" + BuiltInServerManager.getInstance().getPort() + path;
    }
    private static String buildRequest_17tcaj_a0a1a6p(String param) {
      QueryStringEncoder encoder = new QueryStringEncoder("http://127.0.0.1:" + BuiltInServerManager.getInstance().getPort() + "/handlerTest/turnBack1");

      encoder.addParam("param", param);

      return encoder.toString();
    }
    private static String buildRequest_17tcaj_a0a1a7p(String param) {
      QueryStringEncoder encoder = new QueryStringEncoder("http://127.0.0.1:" + BuiltInServerManager.getInstance().getPort() + "/handlerTest/turnBack2");

      encoder.addParam("param", testConverter_Converter.serialize(param));

      return encoder.toString();
    }
    private static <T> T as_17tcaj_a0a1a0a11p(Object o, Class<T> type) {
      return (type.isInstance(o) ? (T) o : null);
    }
  }
}
