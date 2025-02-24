package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import org.jetbrains.mps.util.Condition;
import jetbrains.mps.openapi.intentions.IntentionExecutable;

public class MatchIntentionById implements Condition<IntentionExecutable> {
  private final String myExpectedId;

  public MatchIntentionById(String expectedId) {
    myExpectedId = expectedId;
  }

  @Override
  public boolean met(IntentionExecutable intention) {
    return intention.getDescriptor().getPersistentStateKey().equals(myExpectedId);
  }
  @Override
  public String toString() {
    return "id: " + myExpectedId;
  }

}
