package testDefaultEditor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AbstractChild = 0;
  public static final int AbstractDeveloper = 1;
  public static final int BaseChild = 2;
  public static final int Canvas = 3;
  public static final int Company = 4;
  public static final int ConcreteChild = 5;
  public static final int Container = 6;
  public static final int DefaultNodeAttribute = 7;
  public static final int DefaultPropertyAttribute = 8;
  public static final int DefaultReferenceAttribute = 9;
  public static final int Developer = 10;
  public static final int DummyMethod = 11;
  public static final int Friend = 12;
  public static final int IConcreteChild = 13;
  public static final int InterfaceChild = 14;
  public static final int NotSubstitutableDeveloper = 15;
  public static final int Parent = 16;
  public static final int Shape = 17;
  public static final int Team = 18;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL);
    builder.put(0x39b86dbfcead76d6L, AbstractChild);
    builder.put(0x6903a6b9852e888L, AbstractDeveloper);
    builder.put(0x77c1a85c9f845583L, BaseChild);
    builder.put(0x5a79ee4e776cb5daL, Canvas);
    builder.put(0xd0768d7cf12f723L, Company);
    builder.put(0x77c1a85c9f851487L, ConcreteChild);
    builder.put(0x77c1a85c9f845581L, Container);
    builder.put(0x27d5e845b8e8aee1L, DefaultNodeAttribute);
    builder.put(0x27d5e845b8e8ae64L, DefaultPropertyAttribute);
    builder.put(0x27d5e845b8e8aeb7L, DefaultReferenceAttribute);
    builder.put(0xd0768d7cf132939L, Developer);
    builder.put(0x535e489f8b62af67L, DummyMethod);
    builder.put(0xd0768d7cf13be7aL, Friend);
    builder.put(0x28d7d3470747a409L, IConcreteChild);
    builder.put(0x28d7d3470747a408L, InterfaceChild);
    builder.put(0x6903a6b9853b871L, NotSubstitutableDeveloper);
    builder.put(0x77c1a85c9f845582L, Parent);
    builder.put(0x5a79ee4e776cb5dbL, Shape);
    builder.put(0xd0768d7cf12f792L, Team);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
