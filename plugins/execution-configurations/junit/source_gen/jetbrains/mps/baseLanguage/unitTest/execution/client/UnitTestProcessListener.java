package jetbrains.mps.baseLanguage.unitTest.execution.client;

/*Generated by MPS */

import com.intellij.execution.process.ProcessAdapter;
import jetbrains.mps.baseLanguage.unitTest.execution.TestEvent;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.util.Key;
import com.intellij.execution.process.ProcessOutputTypes;

/**
 * Listener for an output of a Process, that parses TestEvent tokens in process's output stream and 
 * update {@link jetbrains.mps.baseLanguage.unitTest.execution.client.TestRunState } with a help of TestEventsDispatcher.
 * You likely don't need this one unless there's {@link jetbrains.mps.baseLanguage.unitTest.execution.client.TestRunState } you'd like to refresh.
 */
public class UnitTestProcessListener extends ProcessAdapter {
  private final TestEventsDispatcher myDispatcher;
  private TestEvent myLastEvent;
  public UnitTestProcessListener(TestRunState runState) {
    myDispatcher = new TestEventsDispatcher(runState);
  }

  @Override
  public void processTerminated(@NotNull ProcessEvent event) {
    myDispatcher.onProcessTerminated(event.getText());
  }

  @Override
  public void onTextAvailable(ProcessEvent event, Key k) {
    String text = event.getText();
    if (text == null) {
      return;
    }
    TestEvent testEvent = TestEvent.parse(text.trim());
    if (testEvent != null) {
      myLastEvent = testEvent;
      myDispatcher.onTestEvent(testEvent);
    } else {
      if (myLastEvent != null && (TestEvent.ASSUMPTION_FAILURE_TEST_PREFIX.equals(myLastEvent.getToken()) || TestEvent.FAILURE_TEST_PREFIX.equals(myLastEvent.getToken()))) {
        k = ProcessOutputTypes.STDERR;
      }
      myDispatcher.onSimpleTextAvailable(text, k);
    }
  }
}
