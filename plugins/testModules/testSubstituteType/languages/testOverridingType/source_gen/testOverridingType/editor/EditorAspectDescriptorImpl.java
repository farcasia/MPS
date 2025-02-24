package testOverridingType.editor;

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
        return Collections.<ConceptEditor>singletonList(new ErrorType_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new OverrideAnnotation_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new OverridingPrimNumConstant_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new UnconditionalOverrideAnnotation_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x394e385732564e8bL, 0x96015abe7ad354d9L, 0x19f3ac4f6f2a7f40L), MetaIdFactory.conceptId(0x394e385732564e8bL, 0x96015abe7ad354d9L, 0x391548fac32006d4L), MetaIdFactory.conceptId(0x394e385732564e8bL, 0x96015abe7ad354d9L, 0x5b362c13a4988795L), MetaIdFactory.conceptId(0x394e385732564e8bL, 0x96015abe7ad354d9L, 0x19f3ac4f6f2a050aL)).seal();
}
