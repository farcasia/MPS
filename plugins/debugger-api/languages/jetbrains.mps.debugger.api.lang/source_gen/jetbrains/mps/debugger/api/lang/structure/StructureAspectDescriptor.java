package jetbrains.mps.debugger.api.lang.structure;

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
  /*package*/ final ConceptDescriptor myConceptBreakpointCreator = createDescriptorForBreakpointCreator();
  /*package*/ final ConceptDescriptor myConceptBreakpointableNodeItem = createDescriptorForBreakpointableNodeItem();
  /*package*/ final ConceptDescriptor myConceptConceptDeclarationReference = createDescriptorForConceptDeclarationReference();
  /*package*/ final ConceptDescriptor myConceptConceptFunctionParameter_Concept = createDescriptorForConceptFunctionParameter_Concept();
  /*package*/ final ConceptDescriptor myConceptConceptFunctionParameter_Debug_Project = createDescriptorForConceptFunctionParameter_Debug_Project();
  /*package*/ final ConceptDescriptor myConceptConceptFunctionParameter_DebuggableNode = createDescriptorForConceptFunctionParameter_DebuggableNode();
  /*package*/ final ConceptDescriptor myConceptConceptFunction_CreateBreakpoint = createDescriptorForConceptFunction_CreateBreakpoint();
  /*package*/ final ConceptDescriptor myConceptConceptFunction_IsApplicableBreakpoint = createDescriptorForConceptFunction_IsApplicableBreakpoint();
  /*package*/ final ConceptDescriptor myConceptCreateBreakpointOperation = createDescriptorForCreateBreakpointOperation();
  /*package*/ final ConceptDescriptor myConceptDebuggerConfiguration = createDescriptorForDebuggerConfiguration();
  /*package*/ final ConceptDescriptor myConceptDebuggerReference = createDescriptorForDebuggerReference();
  /*package*/ final ConceptDescriptor myConceptDebuggerType = createDescriptorForDebuggerType();
  /*package*/ final ConceptDescriptor myConceptGetDebuggerSettings_Function = createDescriptorForGetDebuggerSettings_Function();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBreakpointCreator, myConceptBreakpointableNodeItem, myConceptConceptDeclarationReference, myConceptConceptFunctionParameter_Concept, myConceptConceptFunctionParameter_Debug_Project, myConceptConceptFunctionParameter_DebuggableNode, myConceptConceptFunction_CreateBreakpoint, myConceptConceptFunction_IsApplicableBreakpoint, myConceptCreateBreakpointOperation, myConceptDebuggerConfiguration, myConceptDebuggerReference, myConceptDebuggerType, myConceptGetDebuggerSettings_Function);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.BreakpointCreator:
        return myConceptBreakpointCreator;
      case LanguageConceptSwitch.BreakpointableNodeItem:
        return myConceptBreakpointableNodeItem;
      case LanguageConceptSwitch.ConceptDeclarationReference:
        return myConceptConceptDeclarationReference;
      case LanguageConceptSwitch.ConceptFunctionParameter_Concept:
        return myConceptConceptFunctionParameter_Concept;
      case LanguageConceptSwitch.ConceptFunctionParameter_Debug_Project:
        return myConceptConceptFunctionParameter_Debug_Project;
      case LanguageConceptSwitch.ConceptFunctionParameter_DebuggableNode:
        return myConceptConceptFunctionParameter_DebuggableNode;
      case LanguageConceptSwitch.ConceptFunction_CreateBreakpoint:
        return myConceptConceptFunction_CreateBreakpoint;
      case LanguageConceptSwitch.ConceptFunction_IsApplicableBreakpoint:
        return myConceptConceptFunction_IsApplicableBreakpoint;
      case LanguageConceptSwitch.CreateBreakpointOperation:
        return myConceptCreateBreakpointOperation;
      case LanguageConceptSwitch.DebuggerConfiguration:
        return myConceptDebuggerConfiguration;
      case LanguageConceptSwitch.DebuggerReference:
        return myConceptDebuggerReference;
      case LanguageConceptSwitch.DebuggerType:
        return myConceptDebuggerType;
      case LanguageConceptSwitch.GetDebuggerSettings_Function:
        return myConceptGetDebuggerSettings_Function;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForBreakpointCreator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "BreakpointCreator", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2bd07aa080dfb3a4L);
    b.class_(false, false, true);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/3157158168562217892");
    b.aggregate("breakpointableConcepts", 0x11a2c8c0148e6233L).target(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2bd07aa080dfb937L).optional(true).ordered(true).multiple(true).origin("1270798772176052787").done();
    b.alias("breakpoint creators");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBreakpointableNodeItem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "BreakpointableNodeItem", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2bd07aa080dfb937L);
    b.class_(false, false, false);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/3157158168562219319");
    b.prop("isComplex", 0x79747203892d4cd6L, "8751745335399632086");
    b.associate("declaration", 0x2bd07aa080dfb939L).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L).optional(true).origin("3157158168562219321").done();
    b.aggregate("createBreakpoint", 0x2bd07aa080dfb938L).target(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2bd07aa080dfb93aL).optional(false).ordered(true).multiple(false).origin("3157158168562219320").done();
    b.aggregate("isApplicableBreakpoint", 0x2b1681328a5d11f6L).target(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2b1681328a5d4b64L).optional(true).ordered(true).multiple(false).origin("3104811047188238838").done();
    b.aggregate("conceptsToCreateBreakpoint", 0x5058b4b262ffd5e0L).target(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x5058b4b262ffd5deL).optional(true).ordered(true).multiple(true).origin("5789575999242884576").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptDeclarationReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptDeclarationReference", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x5058b4b262ffd5deL);
    b.class_(false, false, false);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/5789575999242884574");
    b.associate("conceptDeclaration", 0x5058b4b262ffd5dfL).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L).optional(false).origin("5789575999242884575").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunctionParameter_Concept() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptFunctionParameter_Concept", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x79747203892d4ccdL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/8751745335399632077");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("concept");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunctionParameter_Debug_Project() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptFunctionParameter_Debug_Project", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x11a2c8c0148e628cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/1270798772176052876");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("project");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunctionParameter_DebuggableNode() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptFunctionParameter_DebuggableNode", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x11a2c8c0148e6290L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/1270798772176052880");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("debuggableNode");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunction_CreateBreakpoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptFunction_CreateBreakpoint", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2bd07aa080dfb93aL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/3157158168562219322");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConceptFunction_IsApplicableBreakpoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "ConceptFunction_IsApplicableBreakpoint", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x2b1681328a5d4b64L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/3104811047188253540");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("isApplicable");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCreateBreakpointOperation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "CreateBreakpointOperation", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x23a852e9c43bcae9L);
    b.class_(false, false, false);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46ac030L);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/2569394751387978473");
    b.prop("kindName", 0x23a852e9c43bcaebL, "2569394751387978475");
    b.prop("kindPresentation", 0x23a852e9c43bcaecL, "2569394751387978476");
    b.aggregate("nodeExpression", 0x23a852e9c43bcafcL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("2569394751387978492").done();
    b.aggregate("projectExpression", 0x23a852e9c43bcafdL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("2569394751387978493").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("create breakpoint");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDebuggerConfiguration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "DebuggerConfiguration", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x5d457621242d16f5L);
    b.class_(false, false, false);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/6720907903633266421");
    b.aggregate("debugger", 0x5d457621242d18e0L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL).optional(false).ordered(true).multiple(false).origin("6720907903633266912").done();
    b.aggregate("getSettings", 0x5d457621242d18e1L).target(0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x5d457621242d18e2L).optional(false).ordered(true).multiple(false).origin("6720907903633266913").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDebuggerReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "DebuggerReference", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912d151L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/1104094430779068753");
    b.prop("debuggerName", 0xf528808f912d155L, "1104094430779068757");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("debugger");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDebuggerType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "DebuggerType", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0xf528808f912bd83L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/1104094430779063683");
    b.prop("name", 0x23a852e9c43c456dL, "2569394751388009837");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("debugger type");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGetDebuggerSettings_Function() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.debugger.api.lang", "GetDebuggerSettings_Function", 0xfbc142795e2a4c87L, 0xa5d15f7061e6c456L, 0x5d457621242d18e2L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debugger.api.lang.structure)/6720907903633266914");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("get debugger settings");
    return b.create();
  }
}
