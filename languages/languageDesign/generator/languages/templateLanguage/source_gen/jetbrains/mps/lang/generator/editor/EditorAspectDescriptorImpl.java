package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Arrays;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.openapi.editor.descriptor.NamedMenuId;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AbandonInput_RuleConsequence_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new CopySrcListMacro_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new CopySrcNodeMacro_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new CreateRootRule_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DismissTopMappingRule_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new DropAttributeRule_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new DropRootRule_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new GeneratorDebug_InputNode_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new GeneratorDebug_LabelEntry_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new GeneratorDebug_Mappings_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new GeneratorDebug_NodeMapEntry_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new GeneratorDebug_NodeRef_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new GeneratorMessage_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new GeneratorParameterReference_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new IfMacro_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new IncludeMacro_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new InlineSwitch_Case_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new InlineSwitch_RuleConsequence_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new InlineTemplateWithContext_RuleConsequence_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new InlineTemplate_RuleConsequence_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new InsertMacro_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new LabelMacro_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new LoopMacro_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new MapSrcListMacro_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new MapSrcNodeMacro_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new MappingConfiguration_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new MappingLabelDeclaration_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new MappingScript_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new MappingScriptReference_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new NodeMacro_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new PatternReduction_MappingRule_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new PropertyMacro_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new Reduction_MappingRule_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new ReferenceMacro_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new ReferenceReductionRule_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new RootTemplateAnnotation_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new Root_MappingRule_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new RuleConsequence_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentLinkPatternRefExpression_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentParameterExpression_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentPatternVarRefExpression_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentPropertyPatternRefExpression_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentQueryExpression_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new TemplateArgumentVariableRefExpression_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new TemplateCallMacro_Editor());
      case 45:
        return Collections.<ConceptEditor>singletonList(new TemplateDeclaration_Editor());
      case 46:
        return Collections.<ConceptEditor>singletonList(new TemplateDeclarationReference_Editor());
      case 47:
        return Collections.<ConceptEditor>singletonList(new TemplateFragment_Editor());
      case 48:
        return Collections.<ConceptEditor>singletonList(new TemplateParameterDeclaration_Editor());
      case 49:
        return Collections.<ConceptEditor>singletonList(new TemplateSwitch_Editor());
      case 50:
        return Collections.<ConceptEditor>singletonList(new TemplateSwitchMacro_Editor());
      case 51:
        return Collections.<ConceptEditor>singletonList(new TemplateSwitchReference_Editor());
      case 52:
        return Collections.<ConceptEditor>singletonList(new TraceMacro_Editor());
      case 53:
        return Collections.<ConceptEditor>singletonList(new VarMacro_Editor());
      case 54:
        return Collections.<ConceptEditor>singletonList(new WeaveEach_RuleConsequence_Editor());
      case 55:
        return Collections.<ConceptEditor>singletonList(new WeaveMacro_Editor());
      case 56:
        return Collections.<ConceptEditor>singletonList(new Weaving_MappingRule_Editor());
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
          if ("jetbrains.mps.lang.generator.editor.AbstractMacro_comment_inspector".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new AbstractMacro_comment_inspector());
          }
        }
        break;
      case 1:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0b1a2, editorComponentId)) {
            case 0:
              return Collections.<ConceptEditorComponent>singletonList(new BaseMappingRule_premise());
            case 1:
              return Collections.<ConceptEditorComponent>singletonList(new MappingRuleCommonFields());
            default:
              return Collections.<ConceptEditorComponent>emptyList();
          }
        }
        break;
      case 2:
        if (true) {
          if ("jetbrains.mps.lang.generator.editor.ITemplateCall_actualArguments".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ITemplateCall_actualArguments());
          }
        }
        break;
      case 3:
        if (true) {
          if ("jetbrains.mps.lang.generator.editor.ExtensionsPlaceholder".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ExtensionsPlaceholder());
          }
        }
        break;
      case 4:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0e1a2, editorComponentId)) {
            case 0:
              return Collections.<ConceptEditorComponent>singletonList(new NodeMacro_label_inspector());
            case 1:
              return Collections.<ConceptEditorComponent>singletonList(new NodeMacro_postfix());
            default:
              return Collections.<ConceptEditorComponent>emptyList();
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0e = concept;
    switch (index_xbvbvu_a0e.index(cncpt_a0e)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new DropAttributeRule_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new DropRootRule_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new templateCallArguments_Contribution());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new GeneratorDebug_NodeRef_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new GeneratorParameterReference_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new InlineSwitch_RuleConsequence_SubstituteMenu());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new MappingScriptReference_SubstituteMenu());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new PropertyMacro_SubstituteMenu());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new RuleConsequence_SubstituteMenu());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new TemplateArgumentLinkPatternRefExpression_SubstituteMenu());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new TemplateArgumentParameterExpression_SubstituteMenu());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new TemplateArgumentPatternVarRefExpression_SubstituteMenu());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new TemplateArgumentPropertyPatternRefExpression_SubstituteMenu());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new TemplateArgumentVariableRefExpression_SubstituteMenu());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new TemplateDeclarationReference_SubstituteMenu());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_mainContextNode_SubstituteMenu());
      case 16:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_outputNode_SubstituteMenu());
      case 17:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_parentOutputNode_SubstituteMenu());
      case 18:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_sourceNode_SubstituteMenu());
      case 19:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_templatePropertyValue_SubstituteMenu());
      case 20:
        return Collections.<SubstituteMenu>singletonList(new TemplateFunctionParameter_templateReferent_SubstituteMenu());
      case 21:
        return Collections.<SubstituteMenu>singletonList(new TemplateSwitchReference_SubstituteMenu());
      case 22:
        return Collections.<SubstituteMenu>singletonList(new WeaveEach_RuleConsequence_SubstituteMenu());
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
              return Arrays.asList(new SubstituteMenu[]{new GeneratorParameterReference_SmartReference()});
            default:
          }
        }
        break;
      case 1:
        if (true) {
          switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a0b1a5, menuId.getFqName())) {
            case 0:
              return Arrays.asList(new SubstituteMenu[]{new TemplateArgumentVariableRefExpression_SmartReference()});
            default:
          }
        }
        break;
      default:
    }

    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1180b1792dbL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1038b0c2cc7L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10389b50fefL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fbbd5854aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11013931abdL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x67b585b44f4d943bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11c0acf58efL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x509c00a998897534L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c4L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc97f1c1L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806c7L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11055c63121L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x90726ff283cbf8aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047c1472deL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11621ab7715L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11644fdbf49L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11644fa2edeL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7b85dded0be53d6cL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x112103dd1e8L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1231e32ff7a958ceL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x473cc5baf8a1e7a4L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1047ce009c3L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x107ce4fbf98L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10759372d78L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xff0bea0475L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1179be47606L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1165958fcd6L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x116597b27aaL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd47ed6742L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x190d31fe6a12ebb4L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd47e9f6f0L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fca296532L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd7f44d616L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x7786936d61b8dafaL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11017244494L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fd54746dbL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x110138ccc4bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x42d71bfbeb1a5de8L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x457655815a794e79L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x40be82ad503b3c88L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x42d71bfbeb1a5de7L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x380132d742e8ccb0L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x3d6f2506d88aa028L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x14f7f8a311b8f14fL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfe43cb41d0L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11013906056L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xff1b29b76cL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x190d31fe6a0962e6L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10313ed7688L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xda3dc6e51747593L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1031eb3122dL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x2b456582595e739bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x45991daad6a3d34eL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1104fcac3b1L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x300c02df884235d3L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0d8c573L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11dc0f7933bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b64647L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x17e941d108ce3120L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xff0bea0475L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd47ed6742L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x67b585b44f4d943bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11c0acf58efL), MetaIdFactory.conceptId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x35a02f6bfc9806d2L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x90726ff283cbf8aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11644fa2edeL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x116597b27aaL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0xfd47e9f6f0L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x110138ccc4bL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x42d71bfbeb1a5de8L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x457655815a794e79L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x40be82ad503b3c88L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x42d71bfbeb1a5de7L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x3d6f2506d88aa028L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x11013906056L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x113c23283bdL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x113d50d6be6L), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x113db24924aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fc0b471fcL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fe3b1dbebL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x10fe4879c6aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1031eb3122dL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x1104fcac3b1L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x90726ff283cbf8aL), MetaIdFactory.conceptId(0xb401a68083254110L, 0x8fd384331ff25befL, 0x3d6f2506d88aa028L)).seal();
  private static String[] stringSwitchCases_xbvbvu_a0a0a0b1a2 = new String[]{"jetbrains.mps.lang.generator.editor.BaseMappingRule_premise", "jetbrains.mps.lang.generator.editor.MappingRuleCommonFields"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0e1a2 = new String[]{"jetbrains.mps.lang.generator.editor.NodeMacro_label_inspector", "jetbrains.mps.lang.generator.editor.NodeMacro_postfix"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0a1a5 = new String[]{"jetbrains.mps.lang.generator.editor.GeneratorParameterReference_SmartReference"};
  private static String[] stringSwitchCases_xbvbvu_a0a0a0b1a5 = new String[]{"jetbrains.mps.lang.generator.editor.TemplateArgumentVariableRefExpression_SmartReference"};
}
