package BHL4.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int C1 = 0;
  public static final int C2 = 1;
  public static final int C3 = 2;
  public static final int C4 = 3;
  public static final int C5 = 4;
  public static final int I = 5;
  public static final int I1 = 6;
  public static final int I2 = 7;
  public static final int I3 = 8;
  public static final int I4 = 9;
  public static final int I5 = 10;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x2b679aa1c9e84a47L, 0x84b9ce94c2202df5L);
    builder.put(0x6ab2e61d35e495a9L, C1);
    builder.put(0x6c7dcb937b144615L, C2);
    builder.put(0x6c7dcb937b14482aL, C3);
    builder.put(0x3f852a67e912f9d9L, C4);
    builder.put(0x7c8b762a91513ff6L, C5);
    builder.put(0x6ab2e61d35e495a3L, I);
    builder.put(0x6ab2e61d35e495aaL, I1);
    builder.put(0x6ab2e61d35e495adL, I2);
    builder.put(0x7c8b762a91513ff7L, I3);
    builder.put(0x7c8b762a91514024L, I4);
    builder.put(0x7c8b762a9153b68eL, I5);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
