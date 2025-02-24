package jetbrains.mps.lang.editor.table.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int CellModel_HierarchycalTable = 0;
  public static final int CellModel_Table = 1;
  public static final int QueryFunction_TableModel = 2;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x272d3b44cc8481eL, 0x9e2f07793fbfcb41L);
    builder.put(0x1f44bcab4ea21b62L, CellModel_HierarchycalTable);
    builder.put(0x40e932ec28a2d18bL, CellModel_Table);
    builder.put(0x3e51593e83e97a4dL, QueryFunction_TableModel);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
