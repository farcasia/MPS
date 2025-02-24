package jetbrains.mps.samples.highlevel.simpleStructure.editor;

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
        return Collections.<ConceptEditor>singletonList(new SimpleConceptDeclaration_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new SimplePropertyDeclaration_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new StructureAspectDeclaration_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xbaa9238b36da4ccbL, 0xa76b8ad70e222183L, 0x460f3ddb176b0a3cL), MetaIdFactory.conceptId(0xbaa9238b36da4ccbL, 0xa76b8ad70e222183L, 0x346ead2c08cc7faeL), MetaIdFactory.conceptId(0xbaa9238b36da4ccbL, 0xa76b8ad70e222183L, 0x346ead2c08cc7fc8L)).seal();
}
