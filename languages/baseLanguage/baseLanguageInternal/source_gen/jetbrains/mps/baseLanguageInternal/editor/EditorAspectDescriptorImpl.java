package jetbrains.mps.baseLanguageInternal.editor;

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
        return Collections.<ConceptEditor>singletonList(new ConstantValue_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ExtractStatementListExpression_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ExtractStatementListInnerExpression_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ExtractStaticInnerClassExpression_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new ExtractStaticMethodExpression_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ExtractStaticMethod_CallExpression_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ExtractToConstantExpression_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ExtractToConstantRefExpression_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new InternalAnonymousClass_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new InternalAnonymousClassCreator_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new InternalClassCreator_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new InternalClassExpression_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new InternalClassifierType_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new InternalNewExpression_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new InternalPartialFieldReference_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new InternalPartialInstanceMethodCall_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new InternalStaticFieldReference_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new InternalStaticMethodCall_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new InternalSuperMethodCallOperation_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new InternalThisExpression_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new InternalTypedStaticFieldReference_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new InternalVariableReference_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new TypeHintExpression_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new WeakClassReference_Editor());
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
              return Arrays.asList(new TransformationMenu[]{new InternalAnonymousClass_Empty_SideTransformMenu()});
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
        return Collections.<SubstituteMenu>singletonList(new SelectClass_Contribution());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new ExtractStaticInnerClassCreator_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new ExtractStaticMethod_CallExpression_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new ExtractToConstantRefExpression_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new InternalClassifierType_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new WeakClassReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredNamedSubstituteMenus(NamedMenuId menuId) {
    SAbstractConcept cncpt_a0f = (SAbstractConcept) menuId.getConcept();
    switch (index_xbvbvu_a0f.index(cncpt_a0f)) {
      case 0:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0a1a5, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new SubstituteMenu[]{new ExtractStaticInnerClassCreator_SmartReference()});
            default:
          }
        }
        break;
      case 1:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0b1a5, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new SubstituteMenu[]{new ExtractToConstantRefExpression_SmartReference()});
            default:
          }
        }
        break;
      default:
    }

    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x16007da97856bd8aL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b763512c9L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ed999aL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x162724dabcdc671L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2f7b79225e746809L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2f7b79225e746808L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0xf46f1c42ee50930L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1117461827dL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1118e558c6dL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x11157a3736dL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1122dd58737L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1116962fa68L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x11157912ec1L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1115749abe3L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x33c9311d003a97d3L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1180ebdd5b4L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x7232370459dfc310L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x111fb5bb1f2L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x11763791866L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x7a00a2a7a8b080daL)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2f7b79225e746809L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x50cc34ef144c9181L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ed999aL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x162724dabcdc671L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1118e558c6dL), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x7a00a2a7a8b080daL)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x50cc34ef144c9181L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x162724dabcdc671L)).seal();
  private static String[] stringSwitchCases_xbvbvu_a0a0a0a1a3 = new String[]{"jetbrains.mps.baseLanguageInternal.editor.InternalAnonymousClass_Empty_SideTransformMenu"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0a1a5 = new String[]{"jetbrains.mps.baseLanguageInternal.editor.ExtractStaticInnerClassCreator_SmartReference"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0b1a5 = new String[]{"jetbrains.mps.baseLanguageInternal.editor.ExtractToConstantRefExpression_SmartReference"};
}
