package jetbrains.mps.lang.sharedConcepts.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum Options_DefaultTrue {
  default_("default", null),
  true_("true", "true");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private Options_DefaultTrue(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<Options_DefaultTrue> getConstants() {
    List<Options_DefaultTrue> list = ListSequence.fromList(new LinkedList<Options_DefaultTrue>());
    ListSequence.fromList(list).addElement(Options_DefaultTrue.default_);
    ListSequence.fromList(list).addElement(Options_DefaultTrue.true_);
    return list;
  }
  public static Options_DefaultTrue getDefault() {
    return Options_DefaultTrue.default_;
  }
  public static Options_DefaultTrue parseValue(String value) {
    if (value == null) {
      return Options_DefaultTrue.getDefault();
    }
    if (value.equals(Options_DefaultTrue.default_.getValueAsString())) {
      return Options_DefaultTrue.default_;
    }
    if (value.equals(Options_DefaultTrue.true_.getValueAsString())) {
      return Options_DefaultTrue.true_;
    }
    return Options_DefaultTrue.getDefault();
  }
}
