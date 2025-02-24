package tests.testPersistence.test;

/*Generated by MPS */

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import java.util.Enumeration;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class TestOutputFilter {
  private PrintStream myOldOut;
  private PrintStream myOldErr;
  private ByteArrayOutputStream myOut = new ByteArrayOutputStream();
  private ByteArrayOutputStream myErr = new ByteArrayOutputStream();
  private Filter myFilter = new Filter() {
    @Override
    public int decide(LoggingEvent event) {
      return (isEventOK(event) ? Filter.NEUTRAL : Filter.DENY);
    }
  };
  public void start() {
    myOldOut = System.out;
    myOldErr = System.err;
    for (Enumeration<Appender> en = Logger.getRootLogger().getAllAppenders(); en.hasMoreElements();) {
      en.nextElement().addFilter(myFilter);
    }
    System.err.flush();
    System.setErr(new PrintStream(myErr));
    System.out.flush();
    System.setOut(new PrintStream(myOut));
  }
  public void stop() {
    for (Enumeration<Appender> en = Logger.getRootLogger().getAllAppenders(); en.hasMoreElements();) {
      Appender ap = en.nextElement();
      Filter f = ap.getFilter();
      ap.clearFilters();
      for (; f != null; f = f.next) {
        if (f != myFilter) {
          ap.addFilter(f);
        }
      }
    }
    System.err.flush();
    if (myOldErr != null) {
      System.setErr(myOldErr);
    }
    for (Scanner s = new Scanner(new ByteArrayInputStream(myErr.toByteArray())); s.hasNextLine();) {
      String line = s.nextLine();
      if (isErrLineOK(line)) {
        System.err.println(line);
      }
    }
    System.out.flush();
    if (myOldOut != null) {
      System.setOut(myOldOut);
    }
    for (Scanner s = new Scanner(new ByteArrayInputStream(myOut.toByteArray())); s.hasNextLine();) {
      String line = s.nextLine();
      if (isOutLineOK(line)) {
        System.out.println(line);
      }
    }
  }
  protected boolean isLineOK(String line) {
    return false;
  }
  protected boolean isOutLineOK(String line) {
    return isLineOK(line);
  }
  protected boolean isErrLineOK(String line) {
    return isLineOK(line);
  }
  protected boolean isEventOK(LoggingEvent event) {
    return isLineOK(event.getRenderedMessage());
  }
}
