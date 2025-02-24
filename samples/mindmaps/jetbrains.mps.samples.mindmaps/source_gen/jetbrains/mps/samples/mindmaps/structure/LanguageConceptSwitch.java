package jetbrains.mps.samples.mindmaps.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int CoreThrought = 0;
  public static final int MindMap = 1;
  public static final int Relationship = 2;
  public static final int Specializes = 3;
  public static final int Thought = 4;
  public static final int VisualBox = 5;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x33f294fd370a4a40L, 0x999b43f382910018L);
    builder.put(0x46337bb59bbce054L, CoreThrought);
    builder.put(0x1198689ff14758fL, MindMap);
    builder.put(0x1198689ff14bad3L, Relationship);
    builder.put(0x46337bb59bbba841L, Specializes);
    builder.put(0x1198689ff14bac8L, Thought);
    builder.put(0x1198689ff15ca26L, VisualBox);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
