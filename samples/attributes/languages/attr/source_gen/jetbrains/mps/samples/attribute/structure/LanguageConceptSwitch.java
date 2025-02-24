package jetbrains.mps.samples.attribute.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int CommentAttribute = 0;
  public static final int CommentAttribute2 = 1;
  public static final int HandlerAsChild = 2;
  public static final int HandlerAsRoot = 3;
  public static final int SubConceptToTransform = 4;
  public static final int SubConceptToTransformNested = 5;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xe8e38af60cf34cc1L, 0xbaa3ba261722e8f3L);
    builder.put(0x63feb1ccbe205151L, CommentAttribute);
    builder.put(0x702703eb14011dd3L, CommentAttribute2);
    builder.put(0x33ec18d5113b4bdcL, HandlerAsChild);
    builder.put(0x33ec18d5113abcd9L, HandlerAsRoot);
    builder.put(0x702703eb1401f557L, SubConceptToTransform);
    builder.put(0x702703eb14027bc6L, SubConceptToTransformNested);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
