package jetbrains.mps.lang.editor.tableTests.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new ContentElement_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new DataCell_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Event_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new EventReference_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new HierarchycalTable_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new LightWeightDecisionTable_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new Matrix_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new State_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new StateMachine_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new StateReference_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Table_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new Transition_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new UltimateContainer_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new XElement_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new YElement_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0d = concept;
    switch (index_xbvbvu_a0d.index(cncpt_a0d)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new EventReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new StateReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23ef6a8L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x28004d411fa3bea4L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c845743bL), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8457446L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x760c9302beb3e1d1L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x6a2febf37d11d3dfL), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23e4590L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8457442L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8456ba1L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8457444L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x28004d411fa3bea0L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c845743dL), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x4c733427bdedcbd0L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23ef6a6L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0x3cc6bd99e23ef6a7L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8457446L), MetaIdFactory.conceptId(0xdf8799e7254a406fL, 0xbd67f4cc27337152L, 0xa99ffe1c8457444L)).seal();
}
