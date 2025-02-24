package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum Level {
  OFF("OFF", "OFF"),
  FATAL("FATAL", "FATAL"),
  ERROR("ERROR", "ERROR"),
  WARN("WARN", "WARN"),
  INFO("INFO", "INFO"),
  DEBUG("DEBUG", "DEBUG"),
  TRACE("TRACE", "TRACE"),
  ALL("ALL", "ALL");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private Level(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<Level> getConstants() {
    List<Level> list = ListSequence.fromList(new LinkedList<Level>());
    ListSequence.fromList(list).addElement(Level.OFF);
    ListSequence.fromList(list).addElement(Level.FATAL);
    ListSequence.fromList(list).addElement(Level.ERROR);
    ListSequence.fromList(list).addElement(Level.WARN);
    ListSequence.fromList(list).addElement(Level.INFO);
    ListSequence.fromList(list).addElement(Level.DEBUG);
    ListSequence.fromList(list).addElement(Level.TRACE);
    ListSequence.fromList(list).addElement(Level.ALL);
    return list;
  }
  public static Level getDefault() {
    return Level.OFF;
  }
  public static Level parseValue(String value) {
    if (value == null) {
      return Level.getDefault();
    }
    if (value.equals(Level.OFF.getValueAsString())) {
      return Level.OFF;
    }
    if (value.equals(Level.FATAL.getValueAsString())) {
      return Level.FATAL;
    }
    if (value.equals(Level.ERROR.getValueAsString())) {
      return Level.ERROR;
    }
    if (value.equals(Level.WARN.getValueAsString())) {
      return Level.WARN;
    }
    if (value.equals(Level.INFO.getValueAsString())) {
      return Level.INFO;
    }
    if (value.equals(Level.DEBUG.getValueAsString())) {
      return Level.DEBUG;
    }
    if (value.equals(Level.TRACE.getValueAsString())) {
      return Level.TRACE;
    }
    if (value.equals(Level.ALL.getValueAsString())) {
      return Level.ALL;
    }
    return Level.getDefault();
  }
}
