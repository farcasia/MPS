package jetbrains.mps.tool.builder.unittest;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.io.BufferedWriter;
import org.jetbrains.annotations.NotNull;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.log4j.Level;

public class UnitTestOutputReader {
  private static final Logger LOG = LogManager.getLogger(UnitTestOutputReader.class);
  private final Process myUnitTestProcess;
  private final UnitTestOutputReader.BaseOutputReader myInputReader;
  private final UnitTestOutputReader.BaseOutputReader myErrorReader;
  private final BufferedWriter myOutputWriter;
  private final UnitTestListener myUnitTestListener;

  private boolean myInsideTestError = false;
  private StringBuffer myLastError = new StringBuffer();
  private String myLastMessage = "";
  private String myCurrentlyRunningTest;

  public UnitTestOutputReader(@NotNull Process unitTestProcess, @NotNull UnitTestListener unitTestListener) {
    myUnitTestProcess = unitTestProcess;
    myUnitTestListener = unitTestListener;
    myInputReader = new UnitTestOutputReader.BaseOutputReader(myUnitTestProcess.getInputStream()) {
      @Override
      protected void addMessage(final String message) {
        parseMessage(message, false);
      }
    };
    myErrorReader = new UnitTestOutputReader.BaseOutputReader(myUnitTestProcess.getErrorStream()) {
      @Override
      protected void addMessage(final String message) {
        parseMessage(message, true);
      }
    };
    myOutputWriter = new BufferedWriter(new OutputStreamWriter(myUnitTestProcess.getOutputStream()));
  }

  private void parseMessage(@NotNull String text, boolean error) {
    String textTrimmed = text.trim();
    if (text.startsWith(UnitTestRunner.START_TEST_PREFIX)) {
      saveLastTestIfNecessary();
      myCurrentlyRunningTest = removeTag(text, UnitTestRunner.START_TEST_PREFIX);
      myUnitTestListener.testStarted(myCurrentlyRunningTest);
    } else
    if (text.startsWith(UnitTestRunner.END_TEST_PREFIX)) {
      myCurrentlyRunningTest = null;
      myUnitTestListener.testFinished(removeTag(text, UnitTestRunner.END_TEST_PREFIX));
    } else
    if (text.startsWith(UnitTestRunner.FAILURE_TEST_PREFIX)) {
      myLastMessage = removeTag(text, UnitTestRunner.FAILURE_TEST_PREFIX);
      myInsideTestError = true;
    } else
    if (text.startsWith(UnitTestRunner.FAILURE_TEST_SUFFIX)) {
      myUnitTestListener.testFailed(removeTag(text, UnitTestRunner.FAILURE_TEST_SUFFIX), myLastMessage, myLastError.toString());
      myLastError = new StringBuffer();
      myInsideTestError = false;
    } else
    if (error) {
      if (myInsideTestError) {
        myLastError.append(textTrimmed);
        myLastError.append("\n");
      } else {
        myUnitTestListener.logError(text);
      }
    } else {
      myUnitTestListener.logMessage(text);
    }
  }

  private void saveLastTestIfNecessary() {
    if (myCurrentlyRunningTest != null) {
      myUnitTestListener.testFinished(myCurrentlyRunningTest);
      myCurrentlyRunningTest = null;
    }
  }

  private String removeTag(String text, String prefix) {
    return text.substring(prefix.length());
  }

  public int start() {
    myInputReader.start();
    myErrorReader.start();
    try {
      myOutputWriter.newLine();
      myOutputWriter.close();
      return myUnitTestProcess.waitFor();
    } catch (InterruptedException ignored) {
    } catch (IOException ignored) {
    }
    return -1;
  }

  private static abstract class BaseOutputReader extends Thread {
    private final InputStream myIs;

    public BaseOutputReader(InputStream is) {
      myIs = is;
    }

    @Override
    public void run() {
      Scanner s = new Scanner(this.myIs);
      try {
        while (!((this.isInterrupted())) && s.hasNextLine()) {
          addMessage(s.nextLine());
        }
      } catch (Exception e) {
        if (LOG.isEnabledFor(Level.ERROR)) {
          LOG.error("", e);
        }
      }
    }

    protected abstract void addMessage(String message);
  }
}
