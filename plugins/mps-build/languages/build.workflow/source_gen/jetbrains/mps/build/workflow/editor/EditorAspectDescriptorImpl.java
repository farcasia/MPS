package jetbrains.mps.build.workflow.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.NamedMenuId;
import java.util.Arrays;
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
        return Collections.<ConceptEditor>singletonList(new BwfAntStatement_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new BwfAntTaskBundleDeclaration_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new BwfAntTaskDeclaration_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new BwfCustomMacro_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new BwfDependency_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new BwfFileSet_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new BwfJavaClassPath_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new BwfJavaDependency_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new BwfJavaDescriptor_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new BwfJavaLibrary_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new BwfJavaLibraryReference_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new BwfJavaModule_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new BwfJavaModuleReference_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new BwfMacro_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new BwfMacroListImport_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new BwfPathDeclaration_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new BwfPathReference_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new BwfProject_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new BwfProjectPart_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new BwfProjectPartStatement_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new BwfStatement_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new BwfSubTask_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new BwfSubTaskDependency_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new BwfTask_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new BwfTaskDependency_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new BwfTaskLibrary_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new BwfTaskLibraryDependency_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new BwfTaskPart_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredNamedTransformationMenus(NamedMenuId menuId) {
    SAbstractConcept cncpt_a0d = (SAbstractConcept) menuId.getConcept();
    switch (index_xbvbvu_a0d.index(cncpt_a0d)) {
      case 0:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0a1a3, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new TransformationMenu[]{new BwfSubTask_ApplySideTransforms()});
            case 1:
              return Arrays.asList(new TransformationMenu[]{new add_dependencies()});
            case 2:
              return Arrays.asList(new TransformationMenu[]{new add_dependencies_BwfSubTask_ext_3()});
            default:
          }
        }
        break;
      case 1:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0b1a3, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new TransformationMenu[]{new add_dependencies_BwfTask_ext_2()});
            default:
          }
        }
        break;
      case 2:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0c1a3, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new TransformationMenu[]{new add_dependencies_BwfTaskPart()});
            default:
          }
        }
        break;
      default:
    }

    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_xbvbvu_a0e.index(cncpt_a0e)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new BwfFileSet_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new BwfJavaDependency_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new BwfJavaModuleReference_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new BwfPathReference_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new BwfSubTaskDependency_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new BwfTaskDependency_SubstituteMenu());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new BwfTaskLibraryDependency_SubstituteMenu());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new java_module_content_XmlBaseElement_Contribution());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5dc467L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc1e415L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x1c936d31d3127b3bL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x365f30e12d6048cL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x7313ce29aa27bafcL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede077L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114723a759L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2021cfb4db4e306L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2021cfb4db759cbL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38bbL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5fb388b43aa25d48L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5a7e1dc16b0ca24fL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c10L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c1fL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6271L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b4a1bL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114724ce92L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da1147260537L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x36fb0dc9fd32c1b8L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x36fb0dc9fd32c1b8L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c1fL), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L), MetaIdFactory.conceptId(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da1147260537L), MetaIdFactory.conceptId(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL)).seal();
  private static String[] stringSwitchCases_xbvbvu_a0a0a0a1a3 = new String[]{"jetbrains.mps.build.workflow.editor.BwfSubTask_ApplySideTransforms", "jetbrains.mps.build.workflow.editor.add_dependencies", "jetbrains.mps.build.workflow.editor.add_dependencies_BwfSubTask_ext_3"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0b1a3 = new String[]{"jetbrains.mps.build.workflow.editor.add_dependencies_BwfTask_ext_2"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0c1a3 = new String[]{"jetbrains.mps.build.workflow.editor.add_dependencies_BwfTaskPart"};
}
