package jetbrains.mps.ide.httpsupport.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
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
        return Collections.<ConceptEditor>singletonList(new DefaultParameterConverter_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ParameterConverterDeclaration_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ParameterConverterReference_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ParameterInitializer_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Port_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new PortProvider_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new QueryParameter_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new QueryParameterReference_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new QueryPath_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new QuerySegment_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new RequestHandler_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new RequestURLBuilderExpression_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new ResponseSendOperation_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    SAbstractConcept cncpt_a0c = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0c.index(cncpt_a0c)) {
      case 0:
        if (true) {
          if ("jetbrains.mps.ide.httpsupport.editor.PortProvider_currentPort".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new PortProvider_currentPort());
          }
        }
        break;
      case 1:
        if (true) {
          if ("jetbrains.mps.ide.httpsupport.editor.RequestHandlerDescription".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new RequestHandlerDescription());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_xbvbvu_a0e.index(cncpt_a0e)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new IParameterConverter_TransformationMenu());
      case 1:
        return Collections.<TransformationMenu>singletonList(new QuerySegment_TransformationMenu());
      default:
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0f = concept;
    switch (index_xbvbvu_a0f.index(cncpt_a0f)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new ParameterConverterReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new ParameterInitializer_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new QueryParameterReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x46f064803fbdcb2eL), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x3d1bb14fe8385046L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x46f064803fbdb465L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5cf17L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x6f2759b7139c32c2L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x6f2759b713980586L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c585b439L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c5884e95L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x53d29f104fa64ed7L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x53d29f104fa64ed8L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4d5ac72154f4d780L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5ce93L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x5f91294323b64fc1L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x6f2759b713980586L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4d5ac72154f4d780L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x46f064803fbdb3f3L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x53d29f104fa64ed8L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x46f064803fbdb465L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5cf17L), MetaIdFactory.conceptId(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x205f4376c5884e95L)).seal();
}
