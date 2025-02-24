package jetbrains.mps.sampleXML.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAttribute = createDescriptorForAttribute();
  /*package*/ final ConceptDescriptor myConceptDocument = createDescriptorForDocument();
  /*package*/ final ConceptDescriptor myConceptElement = createDescriptorForElement();
  /*package*/ final ConceptDescriptor myConceptElementPart = createDescriptorForElementPart();
  /*package*/ final ConceptDescriptor myConceptText = createDescriptorForText();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAttribute, myConceptDocument, myConceptElement, myConceptElementPart, myConceptText);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Attribute:
        return myConceptAttribute;
      case LanguageConceptSwitch.Document:
        return myConceptDocument;
      case LanguageConceptSwitch.Element:
        return myConceptElement;
      case LanguageConceptSwitch.ElementPart:
        return myConceptElementPart;
      case LanguageConceptSwitch.Text:
        return myConceptText;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAttribute() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.sampleXML", "Attribute", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8a1L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ec0ffc91-3a14-4002-ac57-dd36c5dcf10a(jetbrains.mps.sampleXML.structure)/1225239603361");
    b.prop("value", 0x11d45f8a8a3L, "1225239603363");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDocument() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.sampleXML", "Document", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8b6L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ec0ffc91-3a14-4002-ac57-dd36c5dcf10a(jetbrains.mps.sampleXML.structure)/1225239603382");
    b.aggregate("rootElement", 0x11d45f8a8b8L).target(0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8b9L).optional(false).ordered(true).multiple(false).origin("1225239603384").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.sampleXML", "Element", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8b9L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.sampleXML.structure.ElementPart", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8beL);
    b.origin("r:ec0ffc91-3a14-4002-ac57-dd36c5dcf10a(jetbrains.mps.sampleXML.structure)/1225239603385");
    b.aggregate("attribute", 0x11d45f8a8baL).target(0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8a1L).optional(true).ordered(true).multiple(true).origin("1225239603386").done();
    b.aggregate("content", 0x11d45f8a8bbL).target(0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8beL).optional(true).ordered(true).multiple(true).origin("1225239603387").done();
    b.alias("<");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.sampleXML", "ElementPart", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8beL);
    b.class_(false, true, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ec0ffc91-3a14-4002-ac57-dd36c5dcf10a(jetbrains.mps.sampleXML.structure)/1225239603390");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForText() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.sampleXML", "Text", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8c1L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.sampleXML.structure.ElementPart", 0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8beL);
    b.origin("r:ec0ffc91-3a14-4002-ac57-dd36c5dcf10a(jetbrains.mps.sampleXML.structure)/1225239603393");
    b.prop("text", 0x11d45f8a8c2L, "1225239603394");
    return b.create();
  }
}
