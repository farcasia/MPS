package jetbrains.mps.traceInfo.testWeavingInterpreted.data.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new ChildConceptWeave_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ChildConceptWeaveEach_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ChildConceptWeaveEachMany_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ChildConceptWeaveMany_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new RootConcept_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xffafcf63cbe64e5cL, 0x9717541f01743ac7L, 0x55da9f701c64f39cL), MetaIdFactory.conceptId(0xffafcf63cbe64e5cL, 0x9717541f01743ac7L, 0x55da9f701c64f39aL), MetaIdFactory.conceptId(0xffafcf63cbe64e5cL, 0x9717541f01743ac7L, 0x55da9f701c681163L), MetaIdFactory.conceptId(0xffafcf63cbe64e5cL, 0x9717541f01743ac7L, 0x55da9f701c681159L), MetaIdFactory.conceptId(0xffafcf63cbe64e5cL, 0x9717541f01743ac7L, 0x55da9f701c64caccL)).seal();
}
