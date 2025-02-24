package jetbrains.mps.samples.SwingBuilder.editor;

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
        return Collections.<ConceptEditor>singletonList(new Button_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ElementReference_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new EmptyComponent_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Filter_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Frame_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Label_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new Map_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Panel_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new SourceDataType_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new SwingBuilderMember_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new TargetDataType_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new TextField_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Transformers_Editor());
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
        return Collections.<SubstituteMenu>singletonList(new ElementReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new EmptyComponent_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543043L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1e8aL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa545621L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1c61L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543006L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543023L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1d95L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa543033L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4d5f82383b276c5aL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa5245c9L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4d5f82383b277405L), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa54931bL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1e78L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0xd0f6999e83a1e8aL), MetaIdFactory.conceptId(0xb4dbff0c8c314a79L, 0xa45a98e5fd0530e7L, 0x4a1cc65caa545621L)).seal();
}
