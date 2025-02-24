package mf;

/*Generated by MPS */

import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class MfTester {
  public MfTester() {
  }
  public static TestSuite suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(MfDateTester.class));
    result.addTest(new TestSuite(DateRangeTester.class));
    result.addTest(new TestSuite(DoubleRangeTester.class));
    result.addTest(new TestSuite(MoneyTester.class));
    result.addTest(new TestSuite(SingleTemporalCollectionTester.class));
    result.addTest(new TestSuite(BitemporalCollectionTester.class));
    result.addTest(new TestSuite(BitemporalCollectionSuperclassTester.class));
    return result;
  }
  public static void main(String[] args) {
    TestRunner.run(MfTester.suite());
  }
}
