package org.jetbrains.mps.samples.Constants.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Constant = 0;
  public static final int ConstantReference = 1;
  public static final int Constants = 2;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xd40d465dded40d0L, 0x8d4c2c6d177f60d7L);
    builder.put(0x14be6cdec1861419L, Constant);
    builder.put(0x37600150f5294665L, ConstantReference);
    builder.put(0x14be6cdec1861417L, Constants);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
