package jetbrains.mps.core.xml.sax.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_XMLSAXAttributeHandler;
  private ConceptPresentation props_XMLSAXAttributeHandler_value;
  private ConceptPresentation props_XMLSAXAttributeReference;
  private ConceptPresentation props_XMLSAXAttributeRule;
  private ConceptPresentation props_XMLSAXBreakStatement;
  private ConceptPresentation props_XMLSAXChildHandler;
  private ConceptPresentation props_XMLSAXChildHandler_childObject;
  private ConceptPresentation props_XMLSAXChildRule;
  private ConceptPresentation props_XMLSAXChildRuleCondition;
  private ConceptPresentation props_XMLSAXDefaultChildHandler;
  private ConceptPresentation props_XMLSAXDefaultChildHandler_tagName;
  private ConceptPresentation props_XMLSAXDefaultChildRule;
  private ConceptPresentation props_XMLSAXFieldDeclaration;
  private ConceptPresentation props_XMLSAXFieldReference;
  private ConceptPresentation props_XMLSAXHandlerFunction;
  private ConceptPresentation props_XMLSAXHandler_resultObject;
  private ConceptPresentation props_XMLSAXLocatorExpression;
  private ConceptPresentation props_XMLSAXNodeCreator;
  private ConceptPresentation props_XMLSAXNodeRule;
  private ConceptPresentation props_XMLSAXNodeRuleParam;
  private ConceptPresentation props_XMLSAXNodeRuleParamRef;
  private ConceptPresentation props_XMLSAXNodeValidator;
  private ConceptPresentation props_XMLSAXParser;
  private ConceptPresentation props_XMLSAXTextHandler;
  private ConceptPresentation props_XMLSAXTextHandler_value;
  private ConceptPresentation props_XMLSAXTextRule;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.XMLSAXAttributeHandler:
        if (props_XMLSAXAttributeHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("attribute handler");
          props_XMLSAXAttributeHandler = cpb.create();
        }
        return props_XMLSAXAttributeHandler;
      case LanguageConceptSwitch.XMLSAXAttributeHandler_value:
        if (props_XMLSAXAttributeHandler_value == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("attribute value");
          cpb.rawPresentation("value");
          props_XMLSAXAttributeHandler_value = cpb.create();
        }
        return props_XMLSAXAttributeHandler_value;
      case LanguageConceptSwitch.XMLSAXAttributeReference:
        if (props_XMLSAXAttributeReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2c9L, 0x1f6c736337b5e2caL, "attribute", "", "");
          props_XMLSAXAttributeReference = cpb.create();
        }
        return props_XMLSAXAttributeReference;
      case LanguageConceptSwitch.XMLSAXAttributeRule:
        if (props_XMLSAXAttributeRule == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_XMLSAXAttributeRule = cpb.create();
        }
        return props_XMLSAXAttributeRule;
      case LanguageConceptSwitch.XMLSAXBreakStatement:
        if (props_XMLSAXBreakStatement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("break parser");
          props_XMLSAXBreakStatement = cpb.create();
        }
        return props_XMLSAXBreakStatement;
      case LanguageConceptSwitch.XMLSAXChildHandler:
        if (props_XMLSAXChildHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("child handler");
          props_XMLSAXChildHandler = cpb.create();
        }
        return props_XMLSAXChildHandler;
      case LanguageConceptSwitch.XMLSAXChildHandler_childObject:
        if (props_XMLSAXChildHandler_childObject == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("parsed child object");
          cpb.rawPresentation("child");
          props_XMLSAXChildHandler_childObject = cpb.create();
        }
        return props_XMLSAXChildHandler_childObject;
      case LanguageConceptSwitch.XMLSAXChildRule:
        if (props_XMLSAXChildRule == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2d8L, 0x1f6c736337b5e2dcL, "rule", "", "");
          props_XMLSAXChildRule = cpb.create();
        }
        return props_XMLSAXChildRule;
      case LanguageConceptSwitch.XMLSAXChildRuleCondition:
        if (props_XMLSAXChildRuleCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("XMLSAXChildRuleCondition");
          props_XMLSAXChildRuleCondition = cpb.create();
        }
        return props_XMLSAXChildRuleCondition;
      case LanguageConceptSwitch.XMLSAXDefaultChildHandler:
        if (props_XMLSAXDefaultChildHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("child handler");
          props_XMLSAXDefaultChildHandler = cpb.create();
        }
        return props_XMLSAXDefaultChildHandler;
      case LanguageConceptSwitch.XMLSAXDefaultChildHandler_tagName:
        if (props_XMLSAXDefaultChildHandler_tagName == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("tag name");
          cpb.rawPresentation("name");
          props_XMLSAXDefaultChildHandler_tagName = cpb.create();
        }
        return props_XMLSAXDefaultChildHandler_tagName;
      case LanguageConceptSwitch.XMLSAXDefaultChildRule:
        if (props_XMLSAXDefaultChildRule == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("XMLSAXDefaultChildRule");
          props_XMLSAXDefaultChildRule = cpb.create();
        }
        return props_XMLSAXDefaultChildRule;
      case LanguageConceptSwitch.XMLSAXFieldDeclaration:
        if (props_XMLSAXFieldDeclaration == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_XMLSAXFieldDeclaration = cpb.create();
        }
        return props_XMLSAXFieldDeclaration;
      case LanguageConceptSwitch.XMLSAXFieldReference:
        if (props_XMLSAXFieldReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2e0L, 0x1f6c736337b5e2e1L, "declaration", "", "");
          props_XMLSAXFieldReference = cpb.create();
        }
        return props_XMLSAXFieldReference;
      case LanguageConceptSwitch.XMLSAXHandlerFunction:
        if (props_XMLSAXHandlerFunction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_XMLSAXHandlerFunction = cpb.create();
        }
        return props_XMLSAXHandlerFunction;
      case LanguageConceptSwitch.XMLSAXHandler_resultObject:
        if (props_XMLSAXHandler_resultObject == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("an object");
          cpb.rawPresentation("result");
          props_XMLSAXHandler_resultObject = cpb.create();
        }
        return props_XMLSAXHandler_resultObject;
      case LanguageConceptSwitch.XMLSAXLocatorExpression:
        if (props_XMLSAXLocatorExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("locator");
          props_XMLSAXLocatorExpression = cpb.create();
        }
        return props_XMLSAXLocatorExpression;
      case LanguageConceptSwitch.XMLSAXNodeCreator:
        if (props_XMLSAXNodeCreator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("create");
          props_XMLSAXNodeCreator = cpb.create();
        }
        return props_XMLSAXNodeCreator;
      case LanguageConceptSwitch.XMLSAXNodeRule:
        if (props_XMLSAXNodeRule == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_XMLSAXNodeRule = cpb.create();
        }
        return props_XMLSAXNodeRule;
      case LanguageConceptSwitch.XMLSAXNodeRuleParam:
        if (props_XMLSAXNodeRuleParam == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("parameter");
          cpb.presentationByName();
          props_XMLSAXNodeRuleParam = cpb.create();
        }
        return props_XMLSAXNodeRuleParam;
      case LanguageConceptSwitch.XMLSAXNodeRuleParamRef:
        if (props_XMLSAXNodeRuleParamRef == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x4180d2369b1f16c6L, 0x4180d2369b1f17e0L, "param", "", "");
          props_XMLSAXNodeRuleParamRef = cpb.create();
        }
        return props_XMLSAXNodeRuleParamRef;
      case LanguageConceptSwitch.XMLSAXNodeValidator:
        if (props_XMLSAXNodeValidator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("validate");
          props_XMLSAXNodeValidator = cpb.create();
        }
        return props_XMLSAXNodeValidator;
      case LanguageConceptSwitch.XMLSAXParser:
        if (props_XMLSAXParser == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_XMLSAXParser = cpb.create();
        }
        return props_XMLSAXParser;
      case LanguageConceptSwitch.XMLSAXTextHandler:
        if (props_XMLSAXTextHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("text handler");
          props_XMLSAXTextHandler = cpb.create();
        }
        return props_XMLSAXTextHandler;
      case LanguageConceptSwitch.XMLSAXTextHandler_value:
        if (props_XMLSAXTextHandler_value == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("text value");
          cpb.rawPresentation("value");
          props_XMLSAXTextHandler_value = cpb.create();
        }
        return props_XMLSAXTextHandler_value;
      case LanguageConceptSwitch.XMLSAXTextRule:
        if (props_XMLSAXTextRule == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("XMLSAXTextRule");
          props_XMLSAXTextRule = cpb.create();
        }
        return props_XMLSAXTextRule;
    }
    return null;
  }
}
