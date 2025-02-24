package jetbrains.mps.lang.editor.forms.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AbstractCheckboxUI = 0;
  public static final int CellModel_Checkbox = 1;
  public static final int CheckboxUI_Platform = 2;
  public static final int CheckboxUI_Text = 3;
  public static final int StubCellModel_Checkbox = 4;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x602c36adcc5547ffL, 0x8c4073d7f12f035cL);
    builder.put(0x1900c370e334d3daL, AbstractCheckboxUI);
    builder.put(0x455f8dda63d6378L, CellModel_Checkbox);
    builder.put(0x617bb6da72073973L, CheckboxUI_Platform);
    builder.put(0x1298d6f05780e83bL, CheckboxUI_Text);
    builder.put(0x455f8dda63eef06L, StubCellModel_Checkbox);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
