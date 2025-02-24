package jetbrains.mps.baseLanguage.unitTest.execution.tool;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;
import java.util.Objects;

public class TestCaseRow extends TestContainerRow {
  private final String myTestCaseName;
  public TestCaseRow(ITestNodeWrapper testCase) {
    super(testCase.getFqName(), testCase.getNodePointer().getModelReference().getName().getLongName());
    myTestCaseName = testCase.getFqName();
  }
  @Override
  public boolean matches(String testCase, String testMethod) {
    return testCase == null || Objects.equals(testCase, myTestCaseName);
  }
}
