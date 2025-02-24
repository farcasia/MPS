package jetbrains.mps.samples.componentDependencies.structure;

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
  /*package*/ final ConceptDescriptor myConceptComponent = createDescriptorForComponent();
  /*package*/ final ConceptDescriptor myConceptComponentSet = createDescriptorForComponentSet();
  /*package*/ final ConceptDescriptor myConceptDependency = createDescriptorForDependency();
  /*package*/ final ConceptDescriptor myConceptInPort = createDescriptorForInPort();
  /*package*/ final ConceptDescriptor myConceptOutPort = createDescriptorForOutPort();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptComponent, myConceptComponentSet, myConceptDependency, myConceptInPort, myConceptOutPort);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Component:
        return myConceptComponent;
      case LanguageConceptSwitch.ComponentSet:
        return myConceptComponentSet;
      case LanguageConceptSwitch.Dependency:
        return myConceptDependency;
      case LanguageConceptSwitch.InPort:
        return myConceptInPort;
      case LanguageConceptSwitch.OutPort:
        return myConceptOutPort;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForComponent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.componentDependencies", "Component", 0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e19763814f144L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:afaf73eb-94a1-4aae-902b-ed4d28124667(jetbrains.mps.samples.componentDependencies.structure)/6223439730610336068");
    b.prop("x", 0x565e1976381bdb4dL, "6223439730610789197");
    b.prop("y", 0x565e1976381bdb4fL, "6223439730610789199");
    b.prop("width", 0x7128192564721b88L, "8153794773743967112");
    b.prop("heigh", 0x7128192564721b8fL, "8153794773743967119");
    b.prop("subsystem", 0x7128192564721babL, "8153794773743967147");
    b.aggregate("dep", 0x565e19763814f147L).target(0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381b71a0L).optional(true).ordered(true).multiple(true).origin("6223439730610336071").done();
    b.aggregate("in", 0x565e1976381be142L).target(0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381be166L).optional(true).ordered(true).multiple(true).origin("6223439730610790722").done();
    b.aggregate("out", 0x565e1976381be146L).target(0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381be145L).optional(true).ordered(true).multiple(true).origin("6223439730610790726").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForComponentSet() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.componentDependencies", "ComponentSet", 0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e19763814242bL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:afaf73eb-94a1-4aae-902b-ed4d28124667(jetbrains.mps.samples.componentDependencies.structure)/6223439730610283563");
    b.prop("query", 0x67281f6f60dc969eL, "7433225748201903774");
    b.aggregate("component", 0x565e197638146fa8L).target(0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e19763814f144L).optional(false).ordered(true).multiple(true).origin("6223439730610302888").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.componentDependencies", "Dependency", 0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381b71a0L);
    b.class_(false, false, false);
    b.origin("r:afaf73eb-94a1-4aae-902b-ed4d28124667(jetbrains.mps.samples.componentDependencies.structure)/6223439730610762144");
    b.associate("to", 0x565e1976381b7654L).target(0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e19763814f144L).optional(false).origin("6223439730610763348").done();
    b.alias("depends on");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInPort() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.componentDependencies", "InPort", 0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381be166L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:afaf73eb-94a1-4aae-902b-ed4d28124667(jetbrains.mps.samples.componentDependencies.structure)/6223439730610790758");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOutPort() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.componentDependencies", "OutPort", 0x3066bc0924384300L, 0xa9365bd59917ae9bL, 0x565e1976381be145L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:afaf73eb-94a1-4aae-902b-ed4d28124667(jetbrains.mps.samples.componentDependencies.structure)/6223439730610790725");
    return b.create();
  }
}
