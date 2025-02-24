package jetbrains.mps.lang.editor.multiple.testLanguage.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum ProjectionType {
  defaultEditor("defaultEditor", null),
  rich("rich", "rich"),
  compact("compact", "compact");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private ProjectionType(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<ProjectionType> getConstants() {
    List<ProjectionType> list = ListSequence.fromList(new LinkedList<ProjectionType>());
    ListSequence.fromList(list).addElement(ProjectionType.defaultEditor);
    ListSequence.fromList(list).addElement(ProjectionType.rich);
    ListSequence.fromList(list).addElement(ProjectionType.compact);
    return list;
  }
  public static ProjectionType getDefault() {
    return ProjectionType.defaultEditor;
  }
  public static ProjectionType parseValue(String value) {
    if (value == null) {
      return ProjectionType.getDefault();
    }
    if (value.equals(ProjectionType.defaultEditor.getValueAsString())) {
      return ProjectionType.defaultEditor;
    }
    if (value.equals(ProjectionType.rich.getValueAsString())) {
      return ProjectionType.rich;
    }
    if (value.equals(ProjectionType.compact.getValueAsString())) {
      return ProjectionType.compact;
    }
    return ProjectionType.getDefault();
  }
}
