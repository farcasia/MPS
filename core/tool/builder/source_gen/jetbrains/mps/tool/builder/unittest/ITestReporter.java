package jetbrains.mps.tool.builder.unittest;

/*Generated by MPS */


public interface ITestReporter {
  void runFinished();
  void testStarted(String testFQname);
  void testFinished(String testFQname);
  void testFailed(String testFQname, String msg, String longMsg);
  void testOutputLine(String testFQname, String msg);
  void testErrorLine(String testFQname, String msg);
  void outputLine(String msg);
  void errorLine(String msg);
}
