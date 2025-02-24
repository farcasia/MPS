package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum Option {
  option_default("option_default", "option_default"),
  option_1("option_1", "option_1"),
  drop_it("drop it", "drop_it");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private Option(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<Option> getConstants() {
    List<Option> list = ListSequence.fromList(new LinkedList<Option>());
    ListSequence.fromList(list).addElement(Option.option_default);
    ListSequence.fromList(list).addElement(Option.option_1);
    ListSequence.fromList(list).addElement(Option.drop_it);
    return list;
  }
  public static Option getDefault() {
    return Option.option_default;
  }
  public static Option parseValue(String value) {
    if (value == null) {
      return Option.getDefault();
    }
    if (value.equals(Option.option_default.getValueAsString())) {
      return Option.option_default;
    }
    if (value.equals(Option.option_1.getValueAsString())) {
      return Option.option_1;
    }
    if (value.equals(Option.drop_it.getValueAsString())) {
      return Option.drop_it;
    }
    return Option.getDefault();
  }
}
