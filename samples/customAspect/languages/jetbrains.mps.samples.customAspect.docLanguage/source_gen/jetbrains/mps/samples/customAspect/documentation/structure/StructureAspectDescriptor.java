package jetbrains.mps.samples.customAspect.documentation.structure;

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
  /*package*/ final ConceptDescriptor myConceptConceptDocumentation = createDescriptorForConceptDocumentation();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptConceptDocumentation);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.ConceptDocumentation:
        return myConceptConceptDocumentation;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForConceptDocumentation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.customAspect.documentation", "ConceptDocumentation", 0x22916f45e98f4433L, 0x9c1b1b382cf5bd8dL, 0x28360eb22c3ac732L);
    b.class_(false, false, true);
    b.origin("r:554f8053-4df6-4aa3-9ecf-e71658269bf9(jetbrains.mps.samples.customAspect.documentation.structure)/2897519568668510002");
    b.prop("text", 0x28360eb22c3acdf0L, "2897519568668511728");
    b.associate("cncpt", 0x28360eb22c3ad436L).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL).optional(false).origin("2897519568668513334").done();
    return b.create();
  }
}
