package jetbrains.mps.make.script.structure;

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
  /*package*/ final ConceptDescriptor myConceptAdvanceWorkStatement = createDescriptorForAdvanceWorkStatement();
  /*package*/ final ConceptDescriptor myConceptAllWorkLeftExpression = createDescriptorForAllWorkLeftExpression();
  /*package*/ final ConceptDescriptor myConceptBeginWorkStatement = createDescriptorForBeginWorkStatement();
  /*package*/ final ConceptDescriptor myConceptConceptFunctionParameter_progressMonitor = createDescriptorForConceptFunctionParameter_progressMonitor();
  /*package*/ final ConceptDescriptor myConceptConfigDefinition = createDescriptorForConfigDefinition();
  /*package*/ final ConceptDescriptor myConceptExpected = createDescriptorForExpected();
  /*package*/ final ConceptDescriptor myConceptExpectedInput = createDescriptorForExpectedInput();
  /*package*/ final ConceptDescriptor myConceptExpectedOption = createDescriptorForExpectedOption();
  /*package*/ final ConceptDescriptor myConceptFinishWorkStatement = createDescriptorForFinishWorkStatement();
  /*package*/ final ConceptDescriptor myConceptGetMakeSessionExpression = createDescriptorForGetMakeSessionExpression();
  /*package*/ final ConceptDescriptor myConceptIExpected = createDescriptorForIExpected();
  /*package*/ final ConceptDescriptor myConceptInputResourcesParameter = createDescriptorForInputResourcesParameter();
  /*package*/ final ConceptDescriptor myConceptJobDeclaration = createDescriptorForJobDeclaration();
  /*package*/ final ConceptDescriptor myConceptJobDefinition = createDescriptorForJobDefinition();
  /*package*/ final ConceptDescriptor myConceptOption = createDescriptorForOption();
  /*package*/ final ConceptDescriptor myConceptOptionExpression = createDescriptorForOptionExpression();
  /*package*/ final ConceptDescriptor myConceptOptionType = createDescriptorForOptionType();
  /*package*/ final ConceptDescriptor myConceptOutputResources = createDescriptorForOutputResources();
  /*package*/ final ConceptDescriptor myConceptPropertiesAccessorParameter = createDescriptorForPropertiesAccessorParameter();
  /*package*/ final ConceptDescriptor myConceptQueryDefinition = createDescriptorForQueryDefinition();
  /*package*/ final ConceptDescriptor myConceptQueryParameterDeclaration = createDescriptorForQueryParameterDeclaration();
  /*package*/ final ConceptDescriptor myConceptRelayQueryExpression = createDescriptorForRelayQueryExpression();
  /*package*/ final ConceptDescriptor myConceptReportFeedbackStatement = createDescriptorForReportFeedbackStatement();
  /*package*/ final ConceptDescriptor myConceptResourceType = createDescriptorForResourceType();
  /*package*/ final ConceptDescriptor myConceptResultStatement = createDescriptorForResultStatement();
  /*package*/ final ConceptDescriptor myConceptText = createDescriptorForText();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAdvanceWorkStatement, myConceptAllWorkLeftExpression, myConceptBeginWorkStatement, myConceptConceptFunctionParameter_progressMonitor, myConceptConfigDefinition, myConceptExpected, myConceptExpectedInput, myConceptExpectedOption, myConceptFinishWorkStatement, myConceptGetMakeSessionExpression, myConceptIExpected, myConceptInputResourcesParameter, myConceptJobDeclaration, myConceptJobDefinition, myConceptOption, myConceptOptionExpression, myConceptOptionType, myConceptOutputResources, myConceptPropertiesAccessorParameter, myConceptQueryDefinition, myConceptQueryParameterDeclaration, myConceptRelayQueryExpression, myConceptReportFeedbackStatement, myConceptResourceType, myConceptResultStatement, myConceptText);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AdvanceWorkStatement:
        return myConceptAdvanceWorkStatement;
      case LanguageConceptSwitch.AllWorkLeftExpression:
        return myConceptAllWorkLeftExpression;
      case LanguageConceptSwitch.BeginWorkStatement:
        return myConceptBeginWorkStatement;
      case LanguageConceptSwitch.ConceptFunctionParameter_progressMonitor:
        return myConceptConceptFunctionParameter_progressMonitor;
      case LanguageConceptSwitch.ConfigDefinition:
        return myConceptConfigDefinition;
      case LanguageConceptSwitch.Expected:
        return myConceptExpected;
      case LanguageConceptSwitch.ExpectedInput:
        return myConceptExpectedInput;
      case LanguageConceptSwitch.ExpectedOption:
        return myConceptExpectedOption;
      case LanguageConceptSwitch.FinishWorkStatement:
        return myConceptFinishWorkStatement;
      case LanguageConceptSwitch.GetMakeSessionExpression:
        return myConceptGetMakeSessionExpression;
      case LanguageConceptSwitch.IExpected:
        return myConceptIExpected;
      case LanguageConceptSwitch.InputResourcesParameter:
        return myConceptInputResourcesParameter;
      case LanguageConceptSwitch.JobDeclaration:
        return myConceptJobDeclaration;
      case LanguageConceptSwitch.JobDefinition:
        return myConceptJobDefinition;
      case LanguageConceptSwitch.Option:
        return myConceptOption;
      case LanguageConceptSwitch.OptionExpression:
        return myConceptOptionExpression;
      case LanguageConceptSwitch.OptionType:
        return myConceptOptionType;
      case LanguageConceptSwitch.OutputResources:
        return myConceptOutputResources;
      case LanguageConceptSwitch.PropertiesAccessorParameter:
        return myConceptPropertiesAccessorParameter;
      case LanguageConceptSwitch.QueryDefinition:
        return myConceptQueryDefinition;
      case LanguageConceptSwitch.QueryParameterDeclaration:
        return myConceptQueryParameterDeclaration;
      case LanguageConceptSwitch.RelayQueryExpression:
        return myConceptRelayQueryExpression;
      case LanguageConceptSwitch.ReportFeedbackStatement:
        return myConceptReportFeedbackStatement;
      case LanguageConceptSwitch.ResourceType:
        return myConceptResourceType;
      case LanguageConceptSwitch.ResultStatement:
        return myConceptResultStatement;
      case LanguageConceptSwitch.Text:
        return myConceptText;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAdvanceWorkStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "AdvanceWorkStatement", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6984L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/187226666892683652");
    b.associate("workStatement", 0x97a1ce11862bf5aL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6982L).optional(false).origin("682890046602395482").done();
    b.aggregate("amount", 0x29929a95c9f34d4L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("187226666892735700").done();
    b.aggregate("comment", 0x1a7648d86181bc00L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(true).ordered(true).multiple(false).origin("1906791586424011776").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("advance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAllWorkLeftExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "AllWorkLeftExpression", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x2dc2243445538ecaL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/3297237684108627658");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("ALL");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBeginWorkStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "BeginWorkStatement", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6982L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/187226666892683650");
    b.prop("workName", 0x97a1ce11865e911L, "682890046602602769");
    b.aggregate("expected", 0x29929a95c9f45e6L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("187226666892740070").done();
    b.aggregate("ofTotal", 0x29929a95c9f45e7L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("187226666892740071").done();
    b.alias("begin work");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunctionParameter_progressMonitor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ConceptFunctionParameter_progressMonitor", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x40d591ab6a24e48dL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/4671800353872995469");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("progressMonitor");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConfigDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ConfigDefinition", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x1b731b4510dcbee4L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/1977954644795375332");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExpected() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "Expected", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7c2L);
    b.class_(false, true, false);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384066");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExpectedInput() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ExpectedInput", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7c6L);
    b.class_(false, false, false);
    b.parent(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc581e7L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384070");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExpectedOption() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ExpectedOption", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7bbL);
    b.class_(false, false, false);
    b.parent(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc581e7L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3ff8b7a0d94242e1L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384059");
    b.prop("defaultOption", 0x3318e2a89ff0296cL, "3681941909241080172");
    b.aggregate("option", 0x70276038dc4d7c5L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ec9L).optional(false).ordered(true).multiple(true).origin("505095865854384069").done();
    b.alias("Option");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFinishWorkStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "FinishWorkStatement", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6987L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/187226666892683655");
    b.associate("workStatement", 0x97a1ce11862c6ddL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6982L).optional(false).origin("682890046602397405").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("finish");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGetMakeSessionExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "GetMakeSessionExpression", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x61c1a3d1c45fac8cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/7044091413522263180");
    b.alias("makeSession");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIExpected() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "IExpected", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc581e7L);
    b.interface_();
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854427623");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInputResourcesParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "InputResourcesParameter", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972dacL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/2360002718792625580");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("input");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForJobDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "JobDeclaration", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7edL);
    b.class_(false, false, false);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384109");
    b.aggregate("config", 0x1b731b4510dd10e9L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x1b731b4510dcbee4L).optional(true).ordered(true).multiple(false).origin("1977954644795396329").done();
    b.aggregate("job", 0x70276038dc4d7eeL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972dabL).optional(false).ordered(true).multiple(false).origin("505095865854384110").done();
    b.aggregate("query", 0x70276038dc4d7efL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL).optional(true).ordered(true).multiple(true).origin("505095865854384111").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForJobDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "JobDefinition", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972dabL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/2360002718792625579");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOption() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "Option", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ec9L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854369481");
    b.aggregate("presentation", 0x70276038dc49ecbL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ecaL).optional(false).ordered(true).multiple(false).origin("505095865854369483").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOptionExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "OptionExpression", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7b2L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384050");
    b.associate("option", 0x70276038dc4d7b3L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ec9L).optional(false).origin("505095865854384051").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOptionType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "OptionType", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7b5L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3ff8b7a0d94242e1L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854384053");
    b.associate("expectedOption", 0x70276038dc4d7bcL).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc4d7bbL).optional(true).origin("505095865854384060").done();
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("option");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOutputResources() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "OutputResources", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972068L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/2360002718792622184");
    b.aggregate("resource", 0x20c069f80a972071L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("2360002718792622193").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("output");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPropertiesAccessorParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "PropertiesAccessorParameter", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x716499a9068b35e9L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/8170824575195231721");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("__pa__");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForQueryDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "QueryDefinition", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3ff8b7a0d94242e1L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854368555");
    b.aggregate("expected", 0x70276038dc4d7c4L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc581e7L).optional(false).ordered(true).multiple(false).origin("505095865854384068").done();
    b.aggregate("presentation", 0x70276038dc589f7L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ecaL).optional(false).ordered(true).multiple(false).origin("505095865854429687").done();
    b.aggregate("title", 0x3354875940086e32L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ecaL).optional(false).ordered(true).multiple(false).origin("3698730011374153266").done();
    b.alias("Query");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForQueryParameterDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "QueryParameterDeclaration", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ec7L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854369479");
    b.aggregate("parameterType", 0x70276038dc49eceL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("505095865854369486").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRelayQueryExpression() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "RelayQueryExpression", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x1b731b4510dbc59fL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/1977954644795311519");
    b.associate("query", 0x1b731b4510dbc5a2L).target(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49b2bL).optional(false).origin("1977954644795311522").done();
    b.aggregate("parameter", 0x1b731b4510dbc5a1L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(true).ordered(true).multiple(true).origin("1977954644795311521").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("relay query");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForReportFeedbackStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ReportFeedbackStatement", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x32eac1b57fc1b828L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/3668957831723333672");
    b.prop("feedback", 0x32eac1b57fc1b82eL, "3668957831723333678");
    b.aggregate("message", 0x32eac1b57fc1c3e8L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("3668957831723336680").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("report");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResourceType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ResourceType", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a947282L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/2360002718792446594");
    b.aggregate("classifierType", 0x2dead7037d3bef52L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL).optional(true).ordered(true).multiple(false).origin("3308693286243004242").done();
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("resource");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResultStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "ResultStatement", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x6237d5bb8b2a942dL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Statement", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/7077360340906447917");
    b.prop("result", 0x6237d5bb8b2a942eL, "7077360340906447918");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForText() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.make.script", "Text", 0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x70276038dc49ecaL);
    b.class_(false, false, false);
    b.origin("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)/505095865854369482");
    b.prop("text", 0x70276038dc5a5feL, "505095865854436862");
    return b.create();
  }
}
