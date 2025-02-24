package jetbrains.mps.baseLanguage.overloadedOperators.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int BinaryOperationReference = 0;
  public static final int ContainerImport = 1;
  public static final int CustomOperator = 2;
  public static final int CustomOperatorDeclaration = 3;
  public static final int CustomOperatorUsage = 4;
  public static final int LeftOperand = 5;
  public static final int Operator = 6;
  public static final int OverloadedBinaryOperator = 7;
  public static final int OverloadedOperatorContainer = 8;
  public static final int RightOperand = 9;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL);
    builder.put(0x2764eda929d23eb4L, BinaryOperationReference);
    builder.put(0x66302c3c8df72c49L, ContainerImport);
    builder.put(0x2764eda929d60237L, CustomOperator);
    builder.put(0x15c86fdc60940541L, CustomOperatorDeclaration);
    builder.put(0x15c86fdc6084766fL, CustomOperatorUsage);
    builder.put(0x6b6f5c4130926a0L, LeftOperand);
    builder.put(0x2764eda929d06ca6L, Operator);
    builder.put(0x6b6f5c41300f84dL, OverloadedBinaryOperator);
    builder.put(0x6b6f5c413011207L, OverloadedOperatorContainer);
    builder.put(0x6c1973240c8fe3e1L, RightOperand);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
