package jetbrains.mps.samples.componentDependencies.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Component = 0;
  public static final int ComponentSet = 1;
  public static final int Dependency = 2;
  public static final int InPort = 3;
  public static final int OutPort = 4;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x3066bc0924384300L, 0xa9365bd59917ae9bL);
    builder.put(0x565e19763814f144L, Component);
    builder.put(0x565e19763814242bL, ComponentSet);
    builder.put(0x565e1976381b71a0L, Dependency);
    builder.put(0x565e1976381be166L, InPort);
    builder.put(0x565e1976381be145L, OutPort);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
