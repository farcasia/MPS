package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Arrays;
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
        return Collections.<ConceptEditor>singletonList(new ActionAccessOperation_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ActionConstructionParameterDeclaration_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ActionConstructorParameterReferenceOperation_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ActionDataParameterDeclaration_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new ActionDataParameterReferenceOperation_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ActionDeclaration_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ActionGroupDeclaration_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ActionGroupRef_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new ActionInstance_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new ActionParameterDeclaration_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new ActionParameterReferenceOperation_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new ActionReference_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new ActionType_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new AddElementStatement_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new AddKeystrokeStatement_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new AddStatement_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new AddTabOperation_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new ButtonCreator_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new CloseTabOperation_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new ConceptCondition_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new CreateTabBlock_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new CustomToolShortcut_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new EditableModel_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new EditorTab_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new EditorTabReference_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new ElementListContents_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new EverywhereActionPlace_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new GetGroupOperation_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new GetSelectedTabOperation_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new GroupAccessOperation_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new GroupAnchor_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new GroupType_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new IdeaActionsDescriptor_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new IdeaConfigurationXml_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new IdeaInitializerDescriptor_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new IdeaPluginDependency_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new InterfaceExtentionPoint_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new InterfaceGroup_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new KeyMapKeystroke_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new KeyStrokeType_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new KeymapChangesDeclaration_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new KeymapRef_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new MPSPluginDependency_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new ModificationStatement_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new NonDumbAwareActions_Editor());
      case 45:
        return Collections.<ConceptEditor>singletonList(new NumberToolShortcut_Editor());
      case 46:
        return Collections.<ConceptEditor>singletonList(new Order_Editor());
      case 47:
        return Collections.<ConceptEditor>singletonList(new OrderReference_Editor());
      case 48:
        return Collections.<ConceptEditor>singletonList(new ParameterizedShortcutChange_Editor());
      case 49:
        return Collections.<ConceptEditor>singletonList(new PersistentPropertyDeclaration_Editor());
      case 50:
        return Collections.<ConceptEditor>singletonList(new PersistentPropertyReference_Editor());
      case 51:
        return Collections.<ConceptEditor>singletonList(new PinTabOperation_Editor());
      case 52:
        return Collections.<ConceptEditor>singletonList(new PopupCreator_Editor());
      case 53:
        return Collections.<ConceptEditor>singletonList(new PreferencePage_Editor());
      case 54:
        return Collections.<ConceptEditor>singletonList(new PreferencesComponentDeclaration_Editor());
      case 55:
        return Collections.<ConceptEditor>singletonList(new PreferencesComponentType_Editor());
      case 56:
        return Collections.<ConceptEditor>singletonList(new RequiredCondition_Editor());
      case 57:
        return Collections.<ConceptEditor>singletonList(new Separator_Editor());
      case 58:
        return Collections.<ConceptEditor>singletonList(new SimpleShortcutChange_Editor());
      case 59:
        return Collections.<ConceptEditor>singletonList(new SmartDisposeClosureParameterDeclaration_Editor());
      case 60:
        return Collections.<ConceptEditor>singletonList(new TabbedToolDeclaration_Editor());
      case 61:
        return Collections.<ConceptEditor>singletonList(new ToolDeclaration_Editor());
      case 62:
        return Collections.<ConceptEditor>singletonList(new ToolInstanceExpression_Editor());
      case 63:
        return Collections.<ConceptEditor>singletonList(new ToolKeystroke_Editor());
      case 64:
        return Collections.<ConceptEditor>singletonList(new ToolTab_Editor());
      case 65:
        return Collections.<ConceptEditor>singletonList(new ToolType_Editor());
      case 66:
        return Collections.<ConceptEditor>singletonList(new ToolbarCreator_Editor());
      case 67:
        return Collections.<ConceptEditor>singletonList(new UnpinTabOperation_Editor());
      case 68:
        return Collections.<ConceptEditor>singletonList(new UpdateGroupBlock_Editor());
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
          if ("jetbrains.mps.lang.plugin.editor.ModificationsEditor".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ModificationsEditor());
          }
        }
        break;
      case 1:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0b1a2, editorComponentId)) {
            case 0:
              return Collections.<ConceptEditorComponent>singletonList(new ActionParameter_Hint());
            case 1:
              return Collections.<ConceptEditorComponent>singletonList(new ActionParameter_NameCellComponent());
            default:
              return Collections.<ConceptEditorComponent>emptyList();
          }
        }
        break;
      case 2:
        if (true) {
          if ("jetbrains.mps.lang.plugin.editor.BaseToolDeclaration_Header".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new BaseToolDeclaration_Header());
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
        return Collections.<TransformationMenu>singletonList(new ActionDeclaration_TransformationMenu());
      case 1:
        return Collections.<TransformationMenu>singletonList(new KeyMapKeystroke_TransformationMenu());
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
        return Collections.<SubstituteMenu>singletonList(new AbstractToolShortcut_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new ActionAccessOperation_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new ActionConstructorParameterReferenceOperation_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new ActionDataParameterReferenceOperation_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new ActionGroupRef_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new ActionInstance_SubstituteMenu());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new ActionParameter_SubstituteMenu());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new ActionParameterReference_SubstituteMenu());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new ActionParameterReferenceOperation_SubstituteMenu());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new ActionReference_SubstituteMenu());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new ActionType_SubstituteMenu());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new AddElementStatement_SubstituteMenu());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_AnActionEvent_SubstituteMenu());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_IModule_SubstituteMenu());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_MPSProject_SubstituteMenu());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_Model_SubstituteMenu());
      case 16:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_OperationContext_SubstituteMenu());
      case 17:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_PreferencePage_component_SubstituteMenu());
      case 18:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_Project_SubstituteMenu());
      case 19:
        return Collections.<SubstituteMenu>singletonList(new ConceptFunctionParameter_node_SubstituteMenu());
      case 20:
        return Collections.<SubstituteMenu>singletonList(new EditorTab_SubstituteMenu());
      case 21:
        return Collections.<SubstituteMenu>singletonList(new EditorTabReference_SubstituteMenu());
      case 22:
        return Collections.<SubstituteMenu>singletonList(new GetGroupOperation_SubstituteMenu());
      case 23:
        return Collections.<SubstituteMenu>singletonList(new GroupAccessOperation_SubstituteMenu());
      case 24:
        return Collections.<SubstituteMenu>singletonList(new GroupType_SubstituteMenu());
      case 25:
        return Collections.<SubstituteMenu>singletonList(new InterfaceExtentionPoint_SubstituteMenu());
      case 26:
        return Collections.<SubstituteMenu>singletonList(new InterfaceGroup_SubstituteMenu());
      case 27:
        return Collections.<SubstituteMenu>singletonList(new KeymapRef_SubstituteMenu());
      case 28:
        return Collections.<SubstituteMenu>singletonList(new MPSPluginDependency_SubstituteMenu());
      case 29:
        return Collections.<SubstituteMenu>singletonList(new NumberToolShortcut_SubstituteMenu());
      case 30:
        return Collections.<SubstituteMenu>singletonList(new OrderReference_SubstituteMenu());
      case 31:
        return Collections.<SubstituteMenu>singletonList(new PersistentPropertyReference_SubstituteMenu());
      case 32:
        return Collections.<SubstituteMenu>singletonList(new PreferencesComponentType_SubstituteMenu());
      case 33:
        return Collections.<SubstituteMenu>singletonList(new SimpleActionPlace_SubstituteMenu());
      case 34:
        return Collections.<SubstituteMenu>singletonList(new ToStringParameter_SubstituteMenu());
      case 35:
        return Collections.<SubstituteMenu>singletonList(new ToolActionPlace_SubstituteMenu());
      case 36:
        return Collections.<SubstituteMenu>singletonList(new ToolKeystroke_SubstituteMenu());
      case 37:
        return Collections.<SubstituteMenu>singletonList(new ToolType_SubstituteMenu());
      case 38:
        return Collections.<SubstituteMenu>singletonList(new ComplexParameters_Contribution());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2c7cd89ac8d0060cL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11daf6d2bdcL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11daf6e60e3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11b69e025e0L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11b69e60be0L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181ca87c38L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x498be7ea73fa71fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da2ba57L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118b812427fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118d0b7fab3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x14fc9beabb2214dfL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118c26632a3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f7a2d1aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x70d8274412a8919cL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11dafad4b27L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x51d51510f17237b8L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207afL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x50be5f478b3541f2L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0xe9375051ff52781L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x16c373ab7fdbb667L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x4ecd9810833251a2L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x33f4c34299ff0d2fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x22035699bdd7814bL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f756bc5L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x57ad0f513474398L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119b4514b56L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x19da07a14b82ef06L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2c7cd89ac8d17d74L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11840f36089L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119240f9168L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x498be7ea73fa71eL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2c7d36ab0e3b095aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x45b64b294c2b3514L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x516313f5e8537eecL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1186bb08443L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1186ae0bf01L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11919c665d4L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x7a5e2454bfcdad14L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x15afe07f2a9bb075L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x498be7ea73fa87eL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2d2ad2584076330L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181de4920dL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x14fc9beabb2214dcL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76107L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x22035699bdd78147L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x22035699bdd79211L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x55f30a5d1e096c3aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c44cfd36L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c466b22aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x3b9dce676f3861a1L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb0207abL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119e269a79fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c44c226fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c497fc64L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x4cdc1c9014f52faeL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1188a1ecd8aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x15afe07f2a9bb076L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x6bd88e2e00aae68L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x51d51510f17223c5L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181ca8f3faL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11870178843L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x6048eaf0c78f324eL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11961ebbf24L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1b97d211bb01f6f6L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x4ac06ca1bf6e6788L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x120b44a69d3L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da058d2L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11b737a6b7cL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x5adc7622e710bddcL)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181ca87c38L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11919c665d4L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b5f981L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2c7cd89ac8d0060cL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11daf6e60e3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11b69e60be0L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x498be7ea73fa71fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181da2ba57L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11b737a6b7cL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1947b3e0f0959deeL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118d0b7fab3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x14fc9beabb2214dfL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118c26632a3L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1190f7a2d1aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1181d54406fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11870797a07L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118707cdfb8L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x513f22c4bae4fb15L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x118565418cbL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119e2cb827fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11aa1691a43L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1184b3b848fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x33f4c34299ff0d2fL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x22035699bdd7814bL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119b4514b56L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2c7cd89ac8d17d74L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119240f9168L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1186bb08443L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x1186ae0bf01L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x498be7ea73fa87eL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x2d2ad2584076330L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76107L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x22035699bdd79211L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c466b22aL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x119c497fc64L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x57ad0f5134202ebL), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11db00cd5f8L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x57ad0f513426286L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b765b0L), MetaIdFactory.conceptId(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x11961ebbf24L), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL)).seal();
  private static String[] stringSwitchCases_xbvbvu_a0a0a0b1a2 = new String[]{"jetbrains.mps.lang.plugin.editor.ActionParameter_Hint", "jetbrains.mps.lang.plugin.editor.ActionParameter_NameCellComponent"};
}
