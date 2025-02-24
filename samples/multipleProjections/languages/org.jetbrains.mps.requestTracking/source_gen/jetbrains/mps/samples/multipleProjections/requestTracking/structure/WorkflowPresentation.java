package jetbrains.mps.samples.multipleProjections.requestTracking.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum WorkflowPresentation {
  structural("structural", "structural"),
  tabular("tabular", "tabular");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private WorkflowPresentation(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<WorkflowPresentation> getConstants() {
    List<WorkflowPresentation> list = ListSequence.fromList(new LinkedList<WorkflowPresentation>());
    ListSequence.fromList(list).addElement(WorkflowPresentation.structural);
    ListSequence.fromList(list).addElement(WorkflowPresentation.tabular);
    return list;
  }
  public static WorkflowPresentation getDefault() {
    return WorkflowPresentation.structural;
  }
  public static WorkflowPresentation parseValue(String value) {
    if (value == null) {
      return WorkflowPresentation.getDefault();
    }
    if (value.equals(WorkflowPresentation.structural.getValueAsString())) {
      return WorkflowPresentation.structural;
    }
    if (value.equals(WorkflowPresentation.tabular.getValueAsString())) {
      return WorkflowPresentation.tabular;
    }
    return WorkflowPresentation.getDefault();
  }
}
