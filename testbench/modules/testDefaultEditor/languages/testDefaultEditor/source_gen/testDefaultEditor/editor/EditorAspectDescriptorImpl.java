package testDefaultEditor.editor;

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
        return Collections.<ConceptEditor>singletonList(new DefaultNodeAttribute_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new DefaultPropertyAttribute_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new DefaultReferenceAttribute_Editor());
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
        return Collections.<SubstituteMenu>singletonList(new Friend_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new NotSubstitutableDeveloper_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL, 0x27d5e845b8e8aee1L), MetaIdFactory.conceptId(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL, 0x27d5e845b8e8ae64L), MetaIdFactory.conceptId(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL, 0x27d5e845b8e8aeb7L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL, 0xd0768d7cf13be7aL), MetaIdFactory.conceptId(0xb5734616c4b04639L, 0x9c6af3a1cf5dc4dbL, 0x6903a6b9853b871L)).seal();
}
