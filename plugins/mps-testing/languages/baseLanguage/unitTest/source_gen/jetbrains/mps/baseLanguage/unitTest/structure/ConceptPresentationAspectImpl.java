package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_AfterTest;
  private ConceptPresentation props_AssertEquals;
  private ConceptPresentation props_AssertFalse;
  private ConceptPresentation props_AssertIsNotNull;
  private ConceptPresentation props_AssertIsNull;
  private ConceptPresentation props_AssertSame;
  private ConceptPresentation props_AssertThrows;
  private ConceptPresentation props_AssertTrue;
  private ConceptPresentation props_BTestCase;
  private ConceptPresentation props_BeforeTest;
  private ConceptPresentation props_BinaryAssert;
  private ConceptPresentation props_Fail;
  private ConceptPresentation props_ITestCase;
  private ConceptPresentation props_ITestMethod;
  private ConceptPresentation props_ITestable;
  private ConceptPresentation props_Message;
  private ConceptPresentation props_MessageHolder;
  private ConceptPresentation props_PrepareMethod;
  private ConceptPresentation props_TestMethod;
  private ConceptPresentation props_TestMethodList;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AfterTest:
        if (props_AfterTest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("afterTest");
          props_AfterTest = cpb.create();
        }
        return props_AfterTest;
      case LanguageConceptSwitch.AssertEquals:
        if (props_AssertEquals == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert equals");
          props_AssertEquals = cpb.create();
        }
        return props_AssertEquals;
      case LanguageConceptSwitch.AssertFalse:
        if (props_AssertFalse == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert false");
          props_AssertFalse = cpb.create();
        }
        return props_AssertFalse;
      case LanguageConceptSwitch.AssertIsNotNull:
        if (props_AssertIsNotNull == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert is not null");
          props_AssertIsNotNull = cpb.create();
        }
        return props_AssertIsNotNull;
      case LanguageConceptSwitch.AssertIsNull:
        if (props_AssertIsNull == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert is null");
          props_AssertIsNull = cpb.create();
        }
        return props_AssertIsNull;
      case LanguageConceptSwitch.AssertSame:
        if (props_AssertSame == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert same (\"==\")");
          props_AssertSame = cpb.create();
        }
        return props_AssertSame;
      case LanguageConceptSwitch.AssertThrows:
        if (props_AssertThrows == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert throws");
          props_AssertThrows = cpb.create();
        }
        return props_AssertThrows;
      case LanguageConceptSwitch.AssertTrue:
        if (props_AssertTrue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("assert true");
          props_AssertTrue = cpb.create();
        }
        return props_AssertTrue;
      case LanguageConceptSwitch.BTestCase:
        if (props_BTestCase == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          cpb.icon(IconContainer.RESOURCE_a0a2a0a8b0v);
          props_BTestCase = cpb.create();
        }
        return props_BTestCase;
      case LanguageConceptSwitch.BeforeTest:
        if (props_BeforeTest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("beforeTest");
          props_BeforeTest = cpb.create();
        }
        return props_BeforeTest;
      case LanguageConceptSwitch.BinaryAssert:
        if (props_BinaryAssert == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_BinaryAssert = cpb.create();
        }
        return props_BinaryAssert;
      case LanguageConceptSwitch.Fail:
        if (props_Fail == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("fail");
          props_Fail = cpb.create();
        }
        return props_Fail;
      case LanguageConceptSwitch.ITestCase:
        if (props_ITestCase == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ITestCase = cpb.create();
        }
        return props_ITestCase;
      case LanguageConceptSwitch.ITestMethod:
        if (props_ITestMethod == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ITestMethod = cpb.create();
        }
        return props_ITestMethod;
      case LanguageConceptSwitch.ITestable:
        if (props_ITestable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ITestable = cpb.create();
        }
        return props_ITestable;
      case LanguageConceptSwitch.Message:
        if (props_Message == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("message");
          props_Message = cpb.create();
        }
        return props_Message;
      case LanguageConceptSwitch.MessageHolder:
        if (props_MessageHolder == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_MessageHolder = cpb.create();
        }
        return props_MessageHolder;
      case LanguageConceptSwitch.PrepareMethod:
        if (props_PrepareMethod == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_PrepareMethod = cpb.create();
        }
        return props_PrepareMethod;
      case LanguageConceptSwitch.TestMethod:
        if (props_TestMethod == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TestMethod = cpb.create();
        }
        return props_TestMethod;
      case LanguageConceptSwitch.TestMethodList:
        if (props_TestMethodList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("TestMethodList");
          props_TestMethodList = cpb.create();
        }
        return props_TestMethodList;
    }
    return null;
  }
}
