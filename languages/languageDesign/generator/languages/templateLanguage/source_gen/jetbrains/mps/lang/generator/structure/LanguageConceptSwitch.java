package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AbandonInput_RuleConsequence = 0;
  public static final int AbstractMacro = 1;
  public static final int BaseMappingRule = 2;
  public static final int BaseMappingRule_Condition = 3;
  public static final int ContextVariableDeclaration = 4;
  public static final int ContextVariableProvider = 5;
  public static final int CopySrcListMacro = 6;
  public static final int CopySrcNodeMacro = 7;
  public static final int CreateRootRule = 8;
  public static final int CreateRootRule_Condition = 9;
  public static final int DismissTopMappingRule = 10;
  public static final int DropAttributeRule = 11;
  public static final int DropAttributeRule_Condition = 12;
  public static final int DropRootRule = 13;
  public static final int DropRootRule_Condition = 14;
  public static final int GeneratorDebug_InputNode = 15;
  public static final int GeneratorDebug_LabelEntry = 16;
  public static final int GeneratorDebug_Mappings = 17;
  public static final int GeneratorDebug_NodeMapEntry = 18;
  public static final int GeneratorDebug_NodeRef = 19;
  public static final int GeneratorInternal_AbstractReferenceDescriptor = 20;
  public static final int GeneratorInternal_InternalReferenceDescriptor = 21;
  public static final int GeneratorInternal_PropertyDescriptor = 22;
  public static final int GeneratorInternal_ReferenceDescriptor = 23;
  public static final int GeneratorMessage = 24;
  public static final int GeneratorParameterReference = 25;
  public static final int IGeneratorParameter = 26;
  public static final int IParameterizedTemplate = 27;
  public static final int ITemplateCall = 28;
  public static final int IfMacro = 29;
  public static final int IfMacro_Condition = 30;
  public static final int IncludeMacro = 31;
  public static final int InlineSwitch_Case = 32;
  public static final int InlineSwitch_RuleConsequence = 33;
  public static final int InlineTemplateWithContext_RuleConsequence = 34;
  public static final int InlineTemplate_RuleConsequence = 35;
  public static final int InsertMacro = 36;
  public static final int InsertMacro_CreateNodeQuery = 37;
  public static final int LabelMacro = 38;
  public static final int LoopMacro = 39;
  public static final int MapSrcListMacro = 40;
  public static final int MapSrcMacro_MapperFunction = 41;
  public static final int MapSrcMacro_PostMapperFunction = 42;
  public static final int MapSrcNodeMacro = 43;
  public static final int MappingConfiguration = 44;
  public static final int MappingConfiguration_Condition = 45;
  public static final int MappingLabelDeclaration = 46;
  public static final int MappingScript = 47;
  public static final int MappingScriptReference = 48;
  public static final int MappingScript_CodeBlock = 49;
  public static final int NodeIdentity = 50;
  public static final int NodeMacro = 51;
  public static final int PatternReduction_MappingRule = 52;
  public static final int PropertyMacro = 53;
  public static final int PropertyMacro_GetPropertyValue = 54;
  public static final int ReductionRule = 55;
  public static final int Reduction_MappingRule = 56;
  public static final int ReferenceMacro = 57;
  public static final int ReferenceMacro_GetReferent = 58;
  public static final int ReferenceReductionRule = 59;
  public static final int RootTemplateAnnotation = 60;
  public static final int Root_MappingRule = 61;
  public static final int RuleConsequence = 62;
  public static final int SourceSubstituteMacro = 63;
  public static final int SourceSubstituteMacro_SourceNodeQuery = 64;
  public static final int SourceSubstituteMacro_SourceNodesQuery = 65;
  public static final int TemplateArgumentLinkPatternRefExpression = 66;
  public static final int TemplateArgumentParameterExpression = 67;
  public static final int TemplateArgumentPatternRef = 68;
  public static final int TemplateArgumentPatternVarRefExpression = 69;
  public static final int TemplateArgumentPropertyPatternRefExpression = 70;
  public static final int TemplateArgumentQuery = 71;
  public static final int TemplateArgumentQueryExpression = 72;
  public static final int TemplateArgumentVariableRefExpression = 73;
  public static final int TemplateCallMacro = 74;
  public static final int TemplateDeclaration = 75;
  public static final int TemplateDeclarationReference = 76;
  public static final int TemplateFragment = 77;
  public static final int TemplateFunctionParameter_mainContextNode = 78;
  public static final int TemplateFunctionParameter_outputNode = 79;
  public static final int TemplateFunctionParameter_parentOutputNode = 80;
  public static final int TemplateFunctionParameter_sourceNode = 81;
  public static final int TemplateFunctionParameter_templatePropertyValue = 82;
  public static final int TemplateFunctionParameter_templateReferent = 83;
  public static final int TemplateParameterDeclaration = 84;
  public static final int TemplateQueryBase = 85;
  public static final int TemplateSwitch = 86;
  public static final int TemplateSwitchMacro = 87;
  public static final int TemplateSwitchReference = 88;
  public static final int TraceMacro = 89;
  public static final int TrivialNodeId = 90;
  public static final int VarMacro = 91;
  public static final int VarMacro_ValueQuery = 92;
  public static final int WeaveEach_RuleConsequence = 93;
  public static final int WeaveMacro = 94;
  public static final int WeavingAnchorQuery = 95;
  public static final int Weaving_MappingRule = 96;
  public static final int Weaving_MappingRule_ContextNodeQuery = 97;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb401a68083254110L, 0x8fd384331ff25befL);
    builder.put(0x1180b1792dbL, AbandonInput_RuleConsequence);
    builder.put(0x11dc0f7933bL, AbstractMacro);
    builder.put(0x10fc0b64647L, BaseMappingRule);
    builder.put(0x10fc0b05beaL, BaseMappingRule_Condition);
    builder.put(0x671e792f3d94989fL, ContextVariableDeclaration);
    builder.put(0x671e792f3d934cacL, ContextVariableProvider);
    builder.put(0x1038b0c2cc7L, CopySrcListMacro);
    builder.put(0x10389b50fefL, CopySrcNodeMacro);
    builder.put(0x10fbbd5854aL, CreateRootRule);
    builder.put(0x10fbbd643c6L, CreateRootRule_Condition);
    builder.put(0x11013931abdL, DismissTopMappingRule);
    builder.put(0x67b585b44f4d943bL, DropAttributeRule);
    builder.put(0x67b585b44f4d9446L, DropAttributeRule_Condition);
    builder.put(0x11c0acf58efL, DropRootRule);
    builder.put(0x11c0ad08d2aL, DropRootRule_Condition);
    builder.put(0x509c00a998897534L, GeneratorDebug_InputNode);
    builder.put(0x35a02f6bfc9806c4L, GeneratorDebug_LabelEntry);
    builder.put(0x35a02f6bfc97f1c1L, GeneratorDebug_Mappings);
    builder.put(0x35a02f6bfc9806c7L, GeneratorDebug_NodeMapEntry);
    builder.put(0x35a02f6bfc9806d2L, GeneratorDebug_NodeRef);
    builder.put(0x2073070af8a4bc2aL, GeneratorInternal_AbstractReferenceDescriptor);
    builder.put(0x2073070af8a4bc1bL, GeneratorInternal_InternalReferenceDescriptor);
    builder.put(0x2073070af892f9edL, GeneratorInternal_PropertyDescriptor);
    builder.put(0x2073070af8a42ba1L, GeneratorInternal_ReferenceDescriptor);
    builder.put(0x11055c63121L, GeneratorMessage);
    builder.put(0x90726ff283cbf8aL, GeneratorParameterReference);
    builder.put(0x90726ff283822d4L, IGeneratorParameter);
    builder.put(0xda3dc6e5137e9b1L, IParameterizedTemplate);
    builder.put(0x17e941d108ce3120L, ITemplateCall);
    builder.put(0x1047c1472deL, IfMacro);
    builder.put(0x10feefdbd6eL, IfMacro_Condition);
    builder.put(0x11621ab7715L, IncludeMacro);
    builder.put(0x11644fdbf49L, InlineSwitch_Case);
    builder.put(0x11644fa2edeL, InlineSwitch_RuleConsequence);
    builder.put(0x7b85dded0be53d6cL, InlineTemplateWithContext_RuleConsequence);
    builder.put(0x112103dd1e8L, InlineTemplate_RuleConsequence);
    builder.put(0x1231e32ff7a958ceL, InsertMacro);
    builder.put(0x1231e32ff7a958cfL, InsertMacro_CreateNodeQuery);
    builder.put(0x473cc5baf8a1e7a4L, LabelMacro);
    builder.put(0x1047ce009c3L, LoopMacro);
    builder.put(0x107ce4fbf98L, MapSrcListMacro);
    builder.put(0x11094af4e18L, MapSrcMacro_MapperFunction);
    builder.put(0x11d455674bfL, MapSrcMacro_PostMapperFunction);
    builder.put(0x10759372d78L, MapSrcNodeMacro);
    builder.put(0xff0bea0475L, MappingConfiguration);
    builder.put(0x6cab949e66d5ae81L, MappingConfiguration_Condition);
    builder.put(0x1179be47606L, MappingLabelDeclaration);
    builder.put(0x1165958fcd6L, MappingScript);
    builder.put(0x116597b27aaL, MappingScriptReference);
    builder.put(0x11659655aa8L, MappingScript_CodeBlock);
    builder.put(0x7d58bd9fd9b5e358L, NodeIdentity);
    builder.put(0xfd47ed6742L, NodeMacro);
    builder.put(0x190d31fe6a12ebb4L, PatternReduction_MappingRule);
    builder.put(0xfd47e9f6f0L, PropertyMacro);
    builder.put(0x10fe3afb5ffL, PropertyMacro_GetPropertyValue);
    builder.put(0x3592736deb001cfdL, ReductionRule);
    builder.put(0x10fca296532L, Reduction_MappingRule);
    builder.put(0xfd7f44d616L, ReferenceMacro);
    builder.put(0x10fe485cc9bL, ReferenceMacro_GetReferent);
    builder.put(0x7786936d61b8dafaL, ReferenceReductionRule);
    builder.put(0x11017244494L, RootTemplateAnnotation);
    builder.put(0x10fd54746dbL, Root_MappingRule);
    builder.put(0x110138ccc4bL, RuleConsequence);
    builder.put(0x10fef52f5efL, SourceSubstituteMacro);
    builder.put(0x10ff3acfa74L, SourceSubstituteMacro_SourceNodeQuery);
    builder.put(0x10fef5bd603L, SourceSubstituteMacro_SourceNodesQuery);
    builder.put(0x42d71bfbeb1a5de8L, TemplateArgumentLinkPatternRefExpression);
    builder.put(0x457655815a794e79L, TemplateArgumentParameterExpression);
    builder.put(0x42d71bfbeb1a07e5L, TemplateArgumentPatternRef);
    builder.put(0x40be82ad503b3c88L, TemplateArgumentPatternVarRefExpression);
    builder.put(0x42d71bfbeb1a5de7L, TemplateArgumentPropertyPatternRefExpression);
    builder.put(0x380132d742e95ce5L, TemplateArgumentQuery);
    builder.put(0x380132d742e8ccb0L, TemplateArgumentQueryExpression);
    builder.put(0x3d6f2506d88aa028L, TemplateArgumentVariableRefExpression);
    builder.put(0x14f7f8a311b8f14fL, TemplateCallMacro);
    builder.put(0xfe43cb41d0L, TemplateDeclaration);
    builder.put(0x11013906056L, TemplateDeclarationReference);
    builder.put(0xff1b29b76cL, TemplateFragment);
    builder.put(0x113c23283bdL, TemplateFunctionParameter_mainContextNode);
    builder.put(0x113d50d6be6L, TemplateFunctionParameter_outputNode);
    builder.put(0x113db24924aL, TemplateFunctionParameter_parentOutputNode);
    builder.put(0x10fc0b471fcL, TemplateFunctionParameter_sourceNode);
    builder.put(0x10fe3b1dbebL, TemplateFunctionParameter_templatePropertyValue);
    builder.put(0x10fe4879c6aL, TemplateFunctionParameter_templateReferent);
    builder.put(0x190d31fe6a0962e6L, TemplateParameterDeclaration);
    builder.put(0x11b4d0ca830L, TemplateQueryBase);
    builder.put(0x10313ed7688L, TemplateSwitch);
    builder.put(0xda3dc6e51747593L, TemplateSwitchMacro);
    builder.put(0x1031eb3122dL, TemplateSwitchReference);
    builder.put(0x2b456582595e739bL, TraceMacro);
    builder.put(0x7d58bd9fd9b64463L, TrivialNodeId);
    builder.put(0x45991daad6a3d34eL, VarMacro);
    builder.put(0x45991daad6a5c71aL, VarMacro_ValueQuery);
    builder.put(0x1104fcac3b1L, WeaveEach_RuleConsequence);
    builder.put(0x300c02df884235d3L, WeaveMacro);
    builder.put(0xe2b8adb3aba4b3bL, WeavingAnchorQuery);
    builder.put(0x10fc0d8c573L, Weaving_MappingRule);
    builder.put(0x113d09e4da2L, Weaving_MappingRule_ContextNodeQuery);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
