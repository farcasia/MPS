package jetbrains.mps.generator.test.crossmodel.property.structure;

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
  /*package*/ final ConceptDescriptor myConceptBean = createDescriptorForBean();
  /*package*/ final ConceptDescriptor myConceptBeanProperty = createDescriptorForBeanProperty();
  /*package*/ final ConceptDescriptor myConceptInitOp = createDescriptorForInitOp();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBean, myConceptBeanProperty, myConceptInitOp);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Bean:
        return myConceptBean;
      case LanguageConceptSwitch.BeanProperty:
        return myConceptBeanProperty;
      case LanguageConceptSwitch.InitOp:
        return myConceptInitOp;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForBean() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.generator.test.crossmodel.property", "Bean", 0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x4ccbf1da2ba1fe6dL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5533782486491987565");
    b.aggregate("properties", 0x4ccbf1da2ba1fe7eL).target(0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x4ccbf1da2ba1fe70L).optional(true).ordered(true).multiple(true).origin("5533782486491987582").done();
    b.aggregate("initializers", 0x523c6873cc802769L).target(0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x523c6873cc7e12a2L).optional(true).ordered(true).multiple(true).origin("5925726056274208617").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBeanProperty() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.generator.test.crossmodel.property", "BeanProperty", 0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x4ccbf1da2ba1fe70L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5533782486491987568");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInitOp() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.generator.test.crossmodel.property", "InitOp", 0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x523c6873cc7e12a2L);
    b.class_(false, false, false);
    b.origin("r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5925726056274072226");
    b.prop("value", 0x523c6873cc7e583fL, "5925726056274090047");
    b.associate("bean", 0x47d6e5da62e55fe3L).target(0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x4ccbf1da2ba1fe6dL).optional(false).origin("5176577547833794531").done();
    b.associate("property", 0x523c6873cc7e167dL).target(0xdc1cc9486f434687L, 0x90cb17dd5cb27219L, 0x4ccbf1da2ba1fe70L).optional(false).origin("5925726056274073213").done();
    return b.create();
  }
}
