package jetbrains.mps.lang.editor.diagram.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_AbstractArgument;
  private ConceptPresentation props_AbstractDiagramCreation;
  private ConceptPresentation props_AbstractFigureReference;
  private ConceptPresentation props_ActionGroup;
  private ConceptPresentation props_ActionReference;
  private ConceptPresentation props_AttributedFigureReference;
  private ConceptPresentation props_BLQueryArgument;
  private ConceptPresentation props_CellModel_Diagram;
  private ConceptPresentation props_CellModel_DiagramConnector;
  private ConceptPresentation props_CellModel_DiagramNode;
  private ConceptPresentation props_CellModel_DiagramPort;
  private ConceptPresentation props_ConnectionEnd;
  private ConceptPresentation props_ConnectionEndBLQuery;
  private ConceptPresentation props_CreationActionReference;
  private ConceptPresentation props_CustomElementReference;
  private ConceptPresentation props_DiagramConnectorCanCreateHandler;
  private ConceptPresentation props_DiagramConnectorCreation;
  private ConceptPresentation props_DiagramConnectorCreationHandler;
  private ConceptPresentation props_DiagramElement;
  private ConceptPresentation props_DiagramElementBLQuery;
  private ConceptPresentation props_DiagramElementCreationHandler;
  private ConceptPresentation props_DiagramElementsCreation;
  private ConceptPresentation props_ExternalFigureReference;
  private ConceptPresentation props_FigureParameterMapping;
  private ConceptPresentation props_FromIdFunctionParameter;
  private ConceptPresentation props_FromNodeFunctionParameter;
  private ConceptPresentation props_LinkArgument;
  private ConceptPresentation props_NodeFunctionParameter;
  private ConceptPresentation props_Palette;
  private ConceptPresentation props_PaletteElement;
  private ConceptPresentation props_PropertyArgument;
  private ConceptPresentation props_Separator;
  private ConceptPresentation props_StubCellModel_Diagram;
  private ConceptPresentation props_StubCellModel_DiagramConnector;
  private ConceptPresentation props_StubCellModel_DiagramNode;
  private ConceptPresentation props_StubCellModel_DiagramPort;
  private ConceptPresentation props_ThisEditorNodeExpression;
  private ConceptPresentation props_ToIdFunctionParameter;
  private ConceptPresentation props_ToNodeFunctionParameter;
  private ConceptPresentation props_XFunctionParameter;
  private ConceptPresentation props_YFunctionParameter;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AbstractArgument:
        if (props_AbstractArgument == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_AbstractArgument = cpb.create();
        }
        return props_AbstractArgument;
      case LanguageConceptSwitch.AbstractDiagramCreation:
        if (props_AbstractDiagramCreation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_AbstractDiagramCreation = cpb.create();
        }
        return props_AbstractDiagramCreation;
      case LanguageConceptSwitch.AbstractFigureReference:
        if (props_AbstractFigureReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_AbstractFigureReference = cpb.create();
        }
        return props_AbstractFigureReference;
      case LanguageConceptSwitch.ActionGroup:
        if (props_ActionGroup == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("group");
          props_ActionGroup = cpb.create();
        }
        return props_ActionGroup;
      case LanguageConceptSwitch.ActionReference:
        if (props_ActionReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ActionReference = cpb.create();
        }
        return props_ActionReference;
      case LanguageConceptSwitch.AttributedFigureReference:
        if (props_AttributedFigureReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x4b412569a095b4ceL, 0x4b412569a0e43041L, "figureAttribute", "", "");
          props_AttributedFigureReference = cpb.create();
        }
        return props_AttributedFigureReference;
      case LanguageConceptSwitch.BLQueryArgument:
        if (props_BLQueryArgument == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("BLQueryArgument");
          props_BLQueryArgument = cpb.create();
        }
        return props_BLQueryArgument;
      case LanguageConceptSwitch.CellModel_Diagram:
        if (props_CellModel_Diagram == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("diagram");
          props_CellModel_Diagram = cpb.create();
        }
        return props_CellModel_Diagram;
      case LanguageConceptSwitch.CellModel_DiagramConnector:
        if (props_CellModel_DiagramConnector == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("diagram connector");
          props_CellModel_DiagramConnector = cpb.create();
        }
        return props_CellModel_DiagramConnector;
      case LanguageConceptSwitch.CellModel_DiagramNode:
        if (props_CellModel_DiagramNode == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("diagram node");
          props_CellModel_DiagramNode = cpb.create();
        }
        return props_CellModel_DiagramNode;
      case LanguageConceptSwitch.CellModel_DiagramPort:
        if (props_CellModel_DiagramPort == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("diagram port");
          props_CellModel_DiagramPort = cpb.create();
        }
        return props_CellModel_DiagramPort;
      case LanguageConceptSwitch.ConnectionEnd:
        if (props_ConnectionEnd == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ConnectionEnd = cpb.create();
        }
        return props_ConnectionEnd;
      case LanguageConceptSwitch.ConnectionEndBLQuery:
        if (props_ConnectionEndBLQuery == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ConnectionEndBLQuery");
          props_ConnectionEndBLQuery = cpb.create();
        }
        return props_ConnectionEndBLQuery;
      case LanguageConceptSwitch.CreationActionReference:
        if (props_CreationActionReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("creation");
          props_CreationActionReference = cpb.create();
        }
        return props_CreationActionReference;
      case LanguageConceptSwitch.CustomElementReference:
        if (props_CustomElementReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("custom");
          props_CustomElementReference = cpb.create();
        }
        return props_CustomElementReference;
      case LanguageConceptSwitch.DiagramConnectorCanCreateHandler:
        if (props_DiagramConnectorCanCreateHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DiagramConnectorCanCreateHandler");
          props_DiagramConnectorCanCreateHandler = cpb.create();
        }
        return props_DiagramConnectorCanCreateHandler;
      case LanguageConceptSwitch.DiagramConnectorCreation:
        if (props_DiagramConnectorCreation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DiagramConnectorCreation = cpb.create();
        }
        return props_DiagramConnectorCreation;
      case LanguageConceptSwitch.DiagramConnectorCreationHandler:
        if (props_DiagramConnectorCreationHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DiagramConnectorCreationHandler");
          props_DiagramConnectorCreationHandler = cpb.create();
        }
        return props_DiagramConnectorCreationHandler;
      case LanguageConceptSwitch.DiagramElement:
        if (props_DiagramElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_DiagramElement = cpb.create();
        }
        return props_DiagramElement;
      case LanguageConceptSwitch.DiagramElementBLQuery:
        if (props_DiagramElementBLQuery == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DiagramElementBLQuery");
          props_DiagramElementBLQuery = cpb.create();
        }
        return props_DiagramElementBLQuery;
      case LanguageConceptSwitch.DiagramElementCreationHandler:
        if (props_DiagramElementCreationHandler == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DiagramElementCreationHandler");
          props_DiagramElementCreationHandler = cpb.create();
        }
        return props_DiagramElementCreationHandler;
      case LanguageConceptSwitch.DiagramElementsCreation:
        if (props_DiagramElementsCreation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DiagramElementsCreation = cpb.create();
        }
        return props_DiagramElementsCreation;
      case LanguageConceptSwitch.ExternalFigureReference:
        if (props_ExternalFigureReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a655cbL, 0xf301bf106a65713L, "figure", "", "");
          props_ExternalFigureReference = cpb.create();
        }
        return props_ExternalFigureReference;
      case LanguageConceptSwitch.FigureParameterMapping:
        if (props_FigureParameterMapping == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_FigureParameterMapping = cpb.create();
        }
        return props_FigureParameterMapping;
      case LanguageConceptSwitch.FromIdFunctionParameter:
        if (props_FromIdFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("fromId");
          props_FromIdFunctionParameter = cpb.create();
        }
        return props_FromIdFunctionParameter;
      case LanguageConceptSwitch.FromNodeFunctionParameter:
        if (props_FromNodeFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("from");
          props_FromNodeFunctionParameter = cpb.create();
        }
        return props_FromNodeFunctionParameter;
      case LanguageConceptSwitch.LinkArgument:
        if (props_LinkArgument == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x3f6e840fd86f9b7L, 0x3f6e840fdc4a7a7L, "link", "", "");
          props_LinkArgument = cpb.create();
        }
        return props_LinkArgument;
      case LanguageConceptSwitch.NodeFunctionParameter:
        if (props_NodeFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("node");
          props_NodeFunctionParameter = cpb.create();
        }
        return props_NodeFunctionParameter;
      case LanguageConceptSwitch.Palette:
        if (props_Palette == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Palette");
          props_Palette = cpb.create();
        }
        return props_Palette;
      case LanguageConceptSwitch.PaletteElement:
        if (props_PaletteElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_PaletteElement = cpb.create();
        }
        return props_PaletteElement;
      case LanguageConceptSwitch.PropertyArgument:
        if (props_PropertyArgument == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0x3f6e840fdc48c85L, 0x3f6e840fdc4ce94L, "property", "", "");
          props_PropertyArgument = cpb.create();
        }
        return props_PropertyArgument;
      case LanguageConceptSwitch.Separator:
        if (props_Separator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("separator");
          props_Separator = cpb.create();
        }
        return props_Separator;
      case LanguageConceptSwitch.StubCellModel_Diagram:
        if (props_StubCellModel_Diagram == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StubCellModel_Diagram");
          props_StubCellModel_Diagram = cpb.create();
        }
        return props_StubCellModel_Diagram;
      case LanguageConceptSwitch.StubCellModel_DiagramConnector:
        if (props_StubCellModel_DiagramConnector == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StubCellModel_DiagramConnector");
          props_StubCellModel_DiagramConnector = cpb.create();
        }
        return props_StubCellModel_DiagramConnector;
      case LanguageConceptSwitch.StubCellModel_DiagramNode:
        if (props_StubCellModel_DiagramNode == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StubCellModel_DiagramNode");
          props_StubCellModel_DiagramNode = cpb.create();
        }
        return props_StubCellModel_DiagramNode;
      case LanguageConceptSwitch.StubCellModel_DiagramPort:
        if (props_StubCellModel_DiagramPort == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StubCellModel_DiagramPort");
          props_StubCellModel_DiagramPort = cpb.create();
        }
        return props_StubCellModel_DiagramPort;
      case LanguageConceptSwitch.ThisEditorNodeExpression:
        if (props_ThisEditorNodeExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("this");
          props_ThisEditorNodeExpression = cpb.create();
        }
        return props_ThisEditorNodeExpression;
      case LanguageConceptSwitch.ToIdFunctionParameter:
        if (props_ToIdFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("toId");
          props_ToIdFunctionParameter = cpb.create();
        }
        return props_ToIdFunctionParameter;
      case LanguageConceptSwitch.ToNodeFunctionParameter:
        if (props_ToNodeFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("to");
          props_ToNodeFunctionParameter = cpb.create();
        }
        return props_ToNodeFunctionParameter;
      case LanguageConceptSwitch.XFunctionParameter:
        if (props_XFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("x");
          props_XFunctionParameter = cpb.create();
        }
        return props_XFunctionParameter;
      case LanguageConceptSwitch.YFunctionParameter:
        if (props_YFunctionParameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("y");
          props_YFunctionParameter = cpb.create();
        }
        return props_YFunctionParameter;
    }
    return null;
  }
}
