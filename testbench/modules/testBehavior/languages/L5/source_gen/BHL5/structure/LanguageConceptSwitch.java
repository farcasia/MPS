package BHL5.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int C0 = 0;
  public static final int C1 = 1;
  public static final int C2 = 2;
  public static final int C3 = 3;
  public static final int C4 = 4;
  public static final int C5 = 5;
  public static final int C6 = 6;
  public static final int C7 = 7;
  public static final int I1 = 8;
  public static final int I2 = 9;
  public static final int I3 = 10;
  public static final int I4 = 11;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb4fa1e36714a4c77L, 0x8e953eae9632decbL);
    builder.put(0x355d469f0ba2c627L, C0);
    builder.put(0x355d469f0ba23bc7L, C1);
    builder.put(0x355d469f0ba2f187L, C2);
    builder.put(0x355d469f0ba2f82fL, C3);
    builder.put(0x355d469f0ba30886L, C4);
    builder.put(0x3f852a67e9131504L, C5);
    builder.put(0x23a893587ca1aaedL, C6);
    builder.put(0x23a893587ca1af93L, C7);
    builder.put(0x355d469f0ba114cbL, I1);
    builder.put(0x355d469f0ba23ba9L, I2);
    builder.put(0x25076477397e4c6fL, I3);
    builder.put(0x25076477397e4c74L, I4);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
