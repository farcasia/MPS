package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AuthorBlockDocTag = 0;
  public static final int BaseBlockDocTag = 1;
  public static final int BaseDocComment = 2;
  public static final int BaseDocReference = 3;
  public static final int BaseInlineDocTag = 4;
  public static final int BaseParameterReference = 5;
  public static final int BaseVariableDocReference = 6;
  public static final int ClassifierDocComment = 7;
  public static final int ClassifierDocReference = 8;
  public static final int CodeInlineDocTag = 9;
  public static final int CodeSnippet = 10;
  public static final int CommentLine = 11;
  public static final int CommentLinePart = 12;
  public static final int DeprecatedBlockDocTag = 13;
  public static final int DocMethodParameterReference = 14;
  public static final int DocTypeParameterReference = 15;
  public static final int EmptyBlockDocTag = 16;
  public static final int FieldDocComment = 17;
  public static final int FieldDocReference = 18;
  public static final int HTMLElement = 19;
  public static final int InheritDocInlineDocTag = 20;
  public static final int InlineTagCommentLinePart = 21;
  public static final int LinkInlineDocTag = 22;
  public static final int MethodDocComment = 23;
  public static final int MethodDocReference = 24;
  public static final int ParameterBlockDocTag = 25;
  public static final int ReturnBlockDocTag = 26;
  public static final int SeeBlockDocTag = 27;
  public static final int SinceBlockDocTag = 28;
  public static final int StaticFieldDocReference = 29;
  public static final int TextCommentLinePart = 30;
  public static final int ThrowsBlockDocTag = 31;
  public static final int ValueInlineDocTag = 32;
  public static final int VersionBlockDocTag = 33;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xf280165065d5424eL, 0xbb1b463a8781b786L);
    builder.put(0x4a3c146b7faee13eL, AuthorBlockDocTag);
    builder.put(0x4a3c146b7faee13dL, BaseBlockDocTag);
    builder.put(0x4a3c146b7fae70d3L, BaseDocComment);
    builder.put(0x1ec532ec252c9a26L, BaseDocReference);
    builder.put(0x60a0f9237ac5e838L, BaseInlineDocTag);
    builder.put(0x5ed0d79d7dbe86d7L, BaseParameterReference);
    builder.put(0x4d316b5973d644c2L, BaseVariableDocReference);
    builder.put(0x1cb65d9fe66a764cL, ClassifierDocComment);
    builder.put(0x1ec532ec2531d2e4L, ClassifierDocReference);
    builder.put(0x1ec532ec252a7b73L, CodeInlineDocTag);
    builder.put(0x2398cefbc261e3ffL, CodeSnippet);
    builder.put(0x757ba20a4c87f96cL, CommentLine);
    builder.put(0x7c7f5b2f31990286L, CommentLinePart);
    builder.put(0x757ba20a4c87f964L, DeprecatedBlockDocTag);
    builder.put(0x5ed0d79d7dbe86d8L, DocMethodParameterReference);
    builder.put(0x5ed0d79d7dbe86dbL, DocTypeParameterReference);
    builder.put(0x44ac82392ce5c6b0L, EmptyBlockDocTag);
    builder.put(0x5ed0d79d7dc44bf2L, FieldDocComment);
    builder.put(0x1ec532ec252c9a28L, FieldDocReference);
    builder.put(0x5bc4aa08e154b399L, HTMLElement);
    builder.put(0x41a6af3499e5305fL, InheritDocInlineDocTag);
    builder.put(0x7c7f5b2f31990289L, InlineTagCommentLinePart);
    builder.put(0x235789022a5d3a2fL, LinkInlineDocTag);
    builder.put(0x4a3c146b7faeeb34L, MethodDocComment);
    builder.put(0x1ec532ec2531d2d3L, MethodDocReference);
    builder.put(0x757ba20a4c905f8aL, ParameterBlockDocTag);
    builder.put(0x514c0f687050918eL, ReturnBlockDocTag);
    builder.put(0x1ec532ec252ca3abL, SeeBlockDocTag);
    builder.put(0x757ba20a4c87ddadL, SinceBlockDocTag);
    builder.put(0x5a38b07c2d6d7c7bL, StaticFieldDocReference);
    builder.put(0x7c7f5b2f31990287L, TextCommentLinePart);
    builder.put(0x514c0f68704ec270L, ThrowsBlockDocTag);
    builder.put(0x60a0f9237ac5e83bL, ValueInlineDocTag);
    builder.put(0x757ba20a4c87dda0L, VersionBlockDocTag);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
