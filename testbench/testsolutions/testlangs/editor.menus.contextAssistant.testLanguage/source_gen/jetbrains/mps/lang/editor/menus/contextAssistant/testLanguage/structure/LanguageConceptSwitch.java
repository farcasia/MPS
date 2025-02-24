package jetbrains.mps.lang.editor.menus.contextAssistant.testLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Child = 0;
  public static final int Duplication_Parent = 1;
  public static final int ISameMenuApplicable = 2;
  public static final int IncludeDefaultAndNullMenu = 3;
  public static final int IncludeDifferentMenusForDifferentNodes = 4;
  public static final int IncludeDifferentMenusForSameNode = 5;
  public static final int IncludeSameMenuForDifferentLocations = 6;
  public static final int IncludeSameMenuForDifferentNodes = 7;
  public static final int IncludeSameMenuTwiceForSameNode = 8;
  public static final int OtherSubconceptOfChild = 9;
  public static final int Parent = 10;
  public static final int ParentCollapsed = 11;
  public static final int SubInterface1 = 12;
  public static final int SubInterface2 = 13;
  public static final int Subconcept = 14;
  public static final int SubconceptOfChild = 15;
  public static final int SuperInterface = 16;
  public static final int ToIncludeSubstituteMenu = 17;
  public static final int WrapDifferentSubstituteMenus = 18;
  public static final int WrapSameSubstituteMenuTwice = 19;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x9a629f9aabc94c29L, 0xb1b8db7f349f7fbcL);
    builder.put(0x4d6a8b533e60aa32L, Child);
    builder.put(0x3f759544c6a0703eL, Duplication_Parent);
    builder.put(0x3f759544c6a7e879L, ISameMenuApplicable);
    builder.put(0x41299cab94e578eeL, IncludeDefaultAndNullMenu);
    builder.put(0x1a41c6fb280910b1L, IncludeDifferentMenusForDifferentNodes);
    builder.put(0x41299cab94d8915aL, IncludeDifferentMenusForSameNode);
    builder.put(0x41299cab94ea85efL, IncludeSameMenuForDifferentLocations);
    builder.put(0x3f759544c6a7e877L, IncludeSameMenuForDifferentNodes);
    builder.put(0x3f759544c6a7e861L, IncludeSameMenuTwiceForSameNode);
    builder.put(0x7d40c2eb5957a904L, OtherSubconceptOfChild);
    builder.put(0x4d6a8b533e60aa4dL, Parent);
    builder.put(0x5428f7c9b49f682L, ParentCollapsed);
    builder.put(0x3f759544c6a07041L, SubInterface1);
    builder.put(0x3f759544c6a07042L, SubInterface2);
    builder.put(0x3f759544c6a07047L, Subconcept);
    builder.put(0x1b49c84ee1cc743bL, SubconceptOfChild);
    builder.put(0x3f759544c6a07040L, SuperInterface);
    builder.put(0x3f759544c6a82ca7L, ToIncludeSubstituteMenu);
    builder.put(0x1a41c6fb280c96b5L, WrapDifferentSubstituteMenus);
    builder.put(0x3f759544c6a0709dL, WrapSameSubstituteMenuTwice);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
