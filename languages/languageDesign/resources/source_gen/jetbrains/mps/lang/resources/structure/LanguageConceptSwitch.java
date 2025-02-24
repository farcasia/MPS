package jetbrains.mps.lang.resources.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int BaseURL = 0;
  public static final int BaseURLFunction = 1;
  public static final int BaseURLLiteral = 2;
  public static final int Circle = 3;
  public static final int Color = 4;
  public static final int ColorLiteral = 5;
  public static final int ConceptIconResourceExpression = 6;
  public static final int FileIcon = 7;
  public static final int HelpURL = 8;
  public static final int Icon = 9;
  public static final int IconExpression = 10;
  public static final int IconLayerDescription = 11;
  public static final int IconResourceExpression = 12;
  public static final int Image = 13;
  public static final int NodeIconResourceExpression = 14;
  public static final int OldIconBundle = 15;
  public static final int OldIconDeclaration = 16;
  public static final int OldIconReference = 17;
  public static final int Primitive = 18;
  public static final int Rect = 19;
  public static final int Resource = 20;
  public static final int Text = 21;
  public static final int TextIcon = 22;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x982eb8df2c964bd7L, 0x996311712ea622e5L);
    builder.put(0x4197d5560e6a38b7L, BaseURL);
    builder.put(0x4197d5560e696656L, BaseURLFunction);
    builder.put(0x4197d5560e6a38b8L, BaseURLLiteral);
    builder.put(0x26417c37742e0e60L, Circle);
    builder.put(0x19d079f4ec114bdeL, Color);
    builder.put(0x19d079f4ec114bddL, ColorLiteral);
    builder.put(0x7ce01982590bd1eL, ConceptIconResourceExpression);
    builder.put(0x7c8b08a50a39c6bbL, FileIcon);
    builder.put(0x47d8f9811b73d397L, HelpURL);
    builder.put(0x26417c3774289eeeL, Icon);
    builder.put(0x7c8b08a50a39c6c3L, IconExpression);
    builder.put(0x26417c37742e0e65L, IconLayerDescription);
    builder.put(0x52fb86deea79455eL, IconResourceExpression);
    builder.put(0xb8b96b5078f3367L, Image);
    builder.put(0x7ce019825925c1aL, NodeIconResourceExpression);
    builder.put(0x7c8b08a50a39c6bdL, OldIconBundle);
    builder.put(0x7c8b08a50a39c6c0L, OldIconDeclaration);
    builder.put(0x7c8b08a50a39c6c7L, OldIconReference);
    builder.put(0x26417c37742e28b1L, Primitive);
    builder.put(0x26417c37742e0e61L, Rect);
    builder.put(0x7c8b08a50a39c6caL, Resource);
    builder.put(0x26417c37742e28b9L, Text);
    builder.put(0x26417c37742e0d45L, TextIcon);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
