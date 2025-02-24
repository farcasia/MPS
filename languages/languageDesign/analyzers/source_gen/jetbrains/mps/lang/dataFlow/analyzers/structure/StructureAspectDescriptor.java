package jetbrains.mps.lang.dataFlow.analyzers.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.runtime.ConceptKind;
import jetbrains.mps.smodel.runtime.StaticScope;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAnalysisDirection = createDescriptorForAnalysisDirection();
  /*package*/ final ConceptDescriptor myConceptAnalyzer = createDescriptorForAnalyzer();
  /*package*/ final ConceptDescriptor myConceptAnalyzerConstructorParameter = createDescriptorForAnalyzerConstructorParameter();
  /*package*/ final ConceptDescriptor myConceptAnalyzerConstructorParameterReference = createDescriptorForAnalyzerConstructorParameterReference();
  /*package*/ final ConceptDescriptor myConceptAnalyzerFunFunction = createDescriptorForAnalyzerFunFunction();
  /*package*/ final ConceptDescriptor myConceptAnalyzerFunParameterInput = createDescriptorForAnalyzerFunParameterInput();
  /*package*/ final ConceptDescriptor myConceptAnalyzerFunParameterProgramState = createDescriptorForAnalyzerFunParameterProgramState();
  /*package*/ final ConceptDescriptor myConceptAnalyzerFunParameterStateValues = createDescriptorForAnalyzerFunParameterStateValues();
  /*package*/ final ConceptDescriptor myConceptAnalyzerFunctionResultType = createDescriptorForAnalyzerFunctionResultType();
  /*package*/ final ConceptDescriptor myConceptAnalyzerInitialFunction = createDescriptorForAnalyzerInitialFunction();
  /*package*/ final ConceptDescriptor myConceptAnalyzerMergeFunction = createDescriptorForAnalyzerMergeFunction();
  /*package*/ final ConceptDescriptor myConceptAnalyzerMergeParameterInput = createDescriptorForAnalyzerMergeParameterInput();
  /*package*/ final ConceptDescriptor myConceptAnalyzerParameterProgram = createDescriptorForAnalyzerParameterProgram();
  /*package*/ final ConceptDescriptor myConceptAnalyzerRunnerAnalyzeOperation = createDescriptorForAnalyzerRunnerAnalyzeOperation();
  /*package*/ final ConceptDescriptor myConceptAnalyzerRunnerClassKeeper = createDescriptorForAnalyzerRunnerClassKeeper();
  /*package*/ final ConceptDescriptor myConceptAnalyzerRunnerCreator = createDescriptorForAnalyzerRunnerCreator();
  /*package*/ final ConceptDescriptor myConceptAnalyzerRunnerType = createDescriptorForAnalyzerRunnerType();
  /*package*/ final ConceptDescriptor myConceptApplicableCondition = createDescriptorForApplicableCondition();
  /*package*/ final ConceptDescriptor myConceptApplicableNodeReference = createDescriptorForApplicableNodeReference();
  /*package*/ final ConceptDescriptor myConceptBackwardDirection = createDescriptorForBackwardDirection();
  /*package*/ final ConceptDescriptor myConceptConceptCondition = createDescriptorForConceptCondition();
  /*package*/ final ConceptDescriptor myConceptCustomInstructionsContainer = createDescriptorForCustomInstructionsContainer();
  /*package*/ final ConceptDescriptor myConceptCustomInstructionsContainerReference = createDescriptorForCustomInstructionsContainerReference();
  /*package*/ final ConceptDescriptor myConceptEmitInstruction = createDescriptorForEmitInstruction();
  /*package*/ final ConceptDescriptor myConceptForwardDirection = createDescriptorForForwardDirection();
  /*package*/ final ConceptDescriptor myConceptInsertAfterPosition = createDescriptorForInsertAfterPosition();
  /*package*/ final ConceptDescriptor myConceptInsertBeforePosition = createDescriptorForInsertBeforePosition();
  /*package*/ final ConceptDescriptor myConceptInsertPosition = createDescriptorForInsertPosition();
  /*package*/ final ConceptDescriptor myConceptInstruction = createDescriptorForInstruction();
  /*package*/ final ConceptDescriptor myConceptInstructionParameter = createDescriptorForInstructionParameter();
  /*package*/ final ConceptDescriptor myConceptInstructionReference = createDescriptorForInstructionReference();
  /*package*/ final ConceptDescriptor myConceptIsOperation = createDescriptorForIsOperation();
  /*package*/ final ConceptDescriptor myConceptPatternCondition = createDescriptorForPatternCondition();
  /*package*/ final ConceptDescriptor myConceptProgramParameter = createDescriptorForProgramParameter();
  /*package*/ final ConceptDescriptor myConceptRule = createDescriptorForRule();
  /*package*/ final ConceptDescriptor myConceptRuleReference = createDescriptorForRuleReference();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAnalysisDirection, myConceptAnalyzer, myConceptAnalyzerConstructorParameter, myConceptAnalyzerConstructorParameterReference, myConceptAnalyzerFunFunction, myConceptAnalyzerFunParameterInput, myConceptAnalyzerFunParameterProgramState, myConceptAnalyzerFunParameterStateValues, myConceptAnalyzerFunctionResultType, myConceptAnalyzerInitialFunction, myConceptAnalyzerMergeFunction, myConceptAnalyzerMergeParameterInput, myConceptAnalyzerParameterProgram, myConceptAnalyzerRunnerAnalyzeOperation, myConceptAnalyzerRunnerClassKeeper, myConceptAnalyzerRunnerCreator, myConceptAnalyzerRunnerType, myConceptApplicableCondition, myConceptApplicableNodeReference, myConceptBackwardDirection, myConceptConceptCondition, myConceptCustomInstructionsContainer, myConceptCustomInstructionsContainerReference, myConceptEmitInstruction, myConceptForwardDirection, myConceptInsertAfterPosition, myConceptInsertBeforePosition, myConceptInsertPosition, myConceptInstruction, myConceptInstructionParameter, myConceptInstructionReference, myConceptIsOperation, myConceptPatternCondition, myConceptProgramParameter, myConceptRule, myConceptRuleReference);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AnalysisDirection:
        return myConceptAnalysisDirection;
      case LanguageConceptSwitch.Analyzer:
        return myConceptAnalyzer;
      case LanguageConceptSwitch.AnalyzerConstructorParameter:
        return myConceptAnalyzerConstructorParameter;
      case LanguageConceptSwitch.AnalyzerConstructorParameterReference:
        return myConceptAnalyzerConstructorParameterReference;
      case LanguageConceptSwitch.AnalyzerFunFunction:
        return myConceptAnalyzerFunFunction;
      case LanguageConceptSwitch.AnalyzerFunParameterInput:
        return myConceptAnalyzerFunParameterInput;
      case LanguageConceptSwitch.AnalyzerFunParameterProgramState:
        return myConceptAnalyzerFunParameterProgramState;
      case LanguageConceptSwitch.AnalyzerFunParameterStateValues:
        return myConceptAnalyzerFunParameterStateValues;
      case LanguageConceptSwitch.AnalyzerFunctionResultType:
        return myConceptAnalyzerFunctionResultType;
      case LanguageConceptSwitch.AnalyzerInitialFunction:
        return myConceptAnalyzerInitialFunction;
      case LanguageConceptSwitch.AnalyzerMergeFunction:
        return myConceptAnalyzerMergeFunction;
      case LanguageConceptSwitch.AnalyzerMergeParameterInput:
        return myConceptAnalyzerMergeParameterInput;
      case LanguageConceptSwitch.AnalyzerParameterProgram:
        return myConceptAnalyzerParameterProgram;
      case LanguageConceptSwitch.AnalyzerRunnerAnalyzeOperation:
        return myConceptAnalyzerRunnerAnalyzeOperation;
      case LanguageConceptSwitch.AnalyzerRunnerClassKeeper:
        return myConceptAnalyzerRunnerClassKeeper;
      case LanguageConceptSwitch.AnalyzerRunnerCreator:
        return myConceptAnalyzerRunnerCreator;
      case LanguageConceptSwitch.AnalyzerRunnerType:
        return myConceptAnalyzerRunnerType;
      case LanguageConceptSwitch.ApplicableCondition:
        return myConceptApplicableCondition;
      case LanguageConceptSwitch.ApplicableNodeReference:
        return myConceptApplicableNodeReference;
      case LanguageConceptSwitch.BackwardDirection:
        return myConceptBackwardDirection;
      case LanguageConceptSwitch.ConceptCondition:
        return myConceptConceptCondition;
      case LanguageConceptSwitch.CustomInstructionsContainer:
        return myConceptCustomInstructionsContainer;
      case LanguageConceptSwitch.CustomInstructionsContainerReference:
        return myConceptCustomInstructionsContainerReference;
      case LanguageConceptSwitch.EmitInstruction:
        return myConceptEmitInstruction;
      case LanguageConceptSwitch.ForwardDirection:
        return myConceptForwardDirection;
      case LanguageConceptSwitch.InsertAfterPosition:
        return myConceptInsertAfterPosition;
      case LanguageConceptSwitch.InsertBeforePosition:
        return myConceptInsertBeforePosition;
      case LanguageConceptSwitch.InsertPosition:
        return myConceptInsertPosition;
      case LanguageConceptSwitch.Instruction:
        return myConceptInstruction;
      case LanguageConceptSwitch.InstructionParameter:
        return myConceptInstructionParameter;
      case LanguageConceptSwitch.InstructionReference:
        return myConceptInstructionReference;
      case LanguageConceptSwitch.IsOperation:
        return myConceptIsOperation;
      case LanguageConceptSwitch.PatternCondition:
        return myConceptPatternCondition;
      case LanguageConceptSwitch.ProgramParameter:
        return myConceptProgramParameter;
      case LanguageConceptSwitch.Rule:
        return myConceptRule;
      case LanguageConceptSwitch.RuleReference:
        return myConceptRuleReference;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAnalysisDirection() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalysisDirection", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb86L);
    b.class_(false, true, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/9177062368042220422");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "Analyzer", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f46789L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/6618572076229093257");
    b.aggregate("initialFunction", 0x41dd50940e1dd4ddL).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4c8L).optional(false).ordered(true).multiple(false).origin("4746038179140588765").done();
    b.aggregate("mergeFunction", 0x41dd50940e1dcaccL).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x58ba0a6689e9c309L).optional(false).ordered(true).multiple(false).origin("4746038179140586188").done();
    b.aggregate("funFunction", 0x41dd50940e1dd4deL).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4c9L).optional(false).ordered(true).multiple(false).origin("4746038179140588766").done();
    b.aggregate("direction", 0x7f5b799a00c2fb98L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb86L).optional(false).ordered(true).multiple(false).origin("9177062368042220440").done();
    b.aggregate("latticeElementType", 0x7f5b799a00c51bbbL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("9177062368042359739").done();
    b.aggregate("instruction", 0x2e25b6b7919ac138L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL).optional(true).ordered(true).multiple(true).origin("3325264799421088056").done();
    b.aggregate("constructorParameters", 0x376a4d52f8c2e303L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c420b0L).optional(true).ordered(true).multiple(true).origin("3993089038373544707").done();
    b.aggregate("usedContainers", 0x73e1fea9c173f804L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c1738798L).optional(true).ordered(true).multiple(true).origin("8350235189170141188").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerConstructorParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerConstructorParameter", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c420b0L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/3993089038373626032");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerConstructorParameterReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerConstructorParameterReference", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x376a4d52f8c421f8L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.BaseVariableReference", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x4c4b92003e49a704L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/3993089038373626360");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerFunFunction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerFunFunction", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4c9L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140588745");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("fun");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerFunParameterInput() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerFunParameterInput", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4d4L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140588756");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("input");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerFunParameterProgramState() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerFunParameterProgramState", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4d2L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140588754");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("state");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerFunParameterStateValues() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerFunParameterStateValues", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7e9442f75769ab4eL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/9120988775422995278");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("stateValues");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerFunctionResultType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerFunctionResultType", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c52fa7L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/9177062368042364839");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("lattice element type");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerInitialFunction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerInitialFunction", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1dd4c8L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140588744");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("initial");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerMergeFunction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerMergeFunction", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x58ba0a6689e9c309L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/6393434056522580745");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("merge");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerMergeParameterInput() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerMergeParameterInput", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1d7ec5L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140566725");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("input");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerParameterProgram() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerParameterProgram", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x41dd50940e1d7ebcL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4746038179140566716");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("program");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerRunnerAnalyzeOperation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerRunnerAnalyzeOperation", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x151c4f99e489a11L);
    b.class_(false, false, false);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46ac030L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/95073643532950033");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("analyze");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerRunnerClassKeeper() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerRunnerClassKeeper", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x13ac225cc9e9f5bfL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/1417545764634752447");
    b.aggregate("member", 0x3dafeb06931e61abL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112574373bdL).optional(true).ordered(true).multiple(true).origin("4445029770708541867").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerRunnerCreator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerRunnerCreator", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x151c4f99e489a16L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/95073643532950038");
    b.associate("analyzer", 0x151c4f99e489a17L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f46789L).optional(false).origin("95073643532950039").done();
    b.aggregate("nodeToCheck", 0x27b1f33dd958ca0L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("178770917832625312").done();
    b.aggregate("parameters", 0x376a4d52f8d10dc6L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(true).ordered(true).multiple(true).origin("3993089038374473158").done();
    b.aggregate("mode", 0x2eb1cddc01267d7aL).target(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x6e8db6877fc9fed4L).optional(true).ordered(true).multiple(false).origin("3364696741418270074").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("runner");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyzerRunnerType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "AnalyzerRunnerType", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x1c63af9d2f3a7f23L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/2045671745393426211");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("analyzerRunner");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForApplicableCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "ApplicableCondition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919dd6d8L);
    b.class_(false, true, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/3325264799421290200");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForApplicableNodeReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "ApplicableNodeReference", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788f30110L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4943044633102057744");
    b.associate("applicableNode", 0x449938e788f30111L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788e9b9deL).optional(false).origin("4943044633102057745").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBackwardDirection() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "BackwardDirection", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb96L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.dataFlow.analyzers.structure.AnalysisDirection", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb86L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/9177062368042220438");
    b.alias("backward");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "ConceptCondition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x449938e788e9b9deL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.dataFlow.analyzers.structure.ApplicableCondition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919dd6d8L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4943044633101449694");
    b.associate("concept", 0x449938e788ee2395L).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL).optional(false).origin("4943044633101738901").done();
    b.alias("concept =");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCustomInstructionsContainer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "CustomInstructionsContainer", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c172b8b1L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/8350235189170059441");
    b.aggregate("instruction", 0x73e1fea9c172d0e9L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL).optional(true).ordered(true).multiple(true).origin("8350235189170065641").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCustomInstructionsContainerReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "CustomInstructionsContainerReference", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c1738798L);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/8350235189170112408");
    b.associate("containter", 0x73e1fea9c1738799L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x73e1fea9c172b8b1L).optional(false).origin("8350235189170112409").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEmitInstruction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "EmitInstruction", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b3e894L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.pattern.structure.ActionStatement", 0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x3d3ef1fc1815d960L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4217760266503579796");
    b.aggregate("instructionRef", 0x3a887e9da0b4fd5bL).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b4cedcL).optional(false).ordered(true).multiple(false).origin("4217760266503650651").done();
    b.aggregate("target", 0x47cfbf00eaa5802L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(true).ordered(true).multiple(false).origin("323410281720600578").done();
    b.aggregate("position", 0x5594ff2e14ba2cL).target(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x16e4c142caf2bd3cL).optional(false).ordered(true).multiple(false).origin("24089196731087404").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("insert");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForForwardDirection() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "ForwardDirection", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb88L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.dataFlow.analyzers.structure.AnalysisDirection", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x7f5b799a00c2fb86L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/9177062368042220424");
    b.alias("forward");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInsertAfterPosition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "InsertAfterPosition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x74ea0fbaafcebf24L);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/8424563347437829924");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInsertBeforePosition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "InsertBeforePosition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x74ea0fbaafce9c9fL);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/8424563347437821087");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInsertPosition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "InsertPosition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x74ea0fbaafcebf23L);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/8424563347437829923");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInstruction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "Instruction", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/6618572076229093258");
    b.aggregate("parameter", 0x2e25b6b7919ac144L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd583aa0L).optional(true).ordered(true).multiple(true).origin("3325264799421088068").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInstructionParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "InstructionParameter", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd583aa0L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/430844094082202272");
    b.aggregate("type", 0x5faaa6bbd583aa2L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("430844094082202274").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInstructionReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "InstructionReference", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x3a887e9da0b4cedcL);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/4217760266503638748");
    b.associate("instruction", 0x3a887e9da0b4cee5L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL).optional(false).origin("4217760266503638757").done();
    b.aggregate("argument", 0x3a887e9da0b4ceddL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(true).ordered(true).multiple(true).origin("4217760266503638749").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIsOperation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "IsOperation", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x6ed2c546d46ea462L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/7985661997283714146");
    b.associate("instruction", 0x6ed2c546d46ea463L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f4678aL).optional(false).origin("7985661997283714147").done();
    b.aggregate("left", 0x6ed2c546d46efef1L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("7985661997283737329").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("is");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPatternCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "PatternCondition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919e0b63L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.dataFlow.analyzers.structure.ApplicableCondition", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919dd6d8L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/3325264799421303651");
    b.aggregate("pattern", 0x2e25b6b7919e1042L).target(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb4791L).optional(false).ordered(true).multiple(false).origin("3325264799421304898").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProgramParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "ProgramParameter", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x33bb3f8bce3bc61cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/3727642986272245276");
    b.alias("program");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRule() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "Rule", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd57b6c8L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/430844094082168520");
    b.associate("analyzer", 0x3952cf7bd76e6440L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5bd9e43c93f46789L).optional(false).origin("4130591939054429248").done();
    b.aggregate("actions", 0x449938e788ee338aL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L).optional(true).ordered(true).multiple(false).origin("4943044633101742986").done();
    b.aggregate("condition", 0x2e25b6b7919dd956L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x2e25b6b7919dd6d8L).optional(false).ordered(true).multiple(false).origin("3325264799421290838").done();
    b.aggregate("modes", 0x6e8db6877fd04efbL).target(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x6e8db6877fc9fed4L).optional(true).ordered(true).multiple(true).origin("7966224008969473787").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRuleReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.dataFlow.analyzers", "RuleReference", 0x97a52717898f4598L, 0x8150573d9fd03868L, 0xa72ff3b2ca7c5b0L);
    b.class_(false, false, false);
    b.origin("r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.lang.dataFlow.analyzers.structure)/752944717341640112");
    b.associate("rule", 0xa72ff3b2ca7c5b1L).target(0x97a52717898f4598L, 0x8150573d9fd03868L, 0x5faaa6bbd57b6c8L).optional(false).origin("752944717341640113").done();
    return b.create();
  }
}
