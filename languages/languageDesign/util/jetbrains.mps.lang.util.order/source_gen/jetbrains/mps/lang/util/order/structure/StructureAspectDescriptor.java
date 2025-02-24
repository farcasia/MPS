package jetbrains.mps.lang.util.order.structure;

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
  /*package*/ final ConceptDescriptor myConceptOrder = createDescriptorForOrder();
  /*package*/ final ConceptDescriptor myConceptOrderDeclaration = createDescriptorForOrderDeclaration();
  /*package*/ final ConceptDescriptor myConceptOrderParticipant = createDescriptorForOrderParticipant();
  /*package*/ final ConceptDescriptor myConceptOrderParticipantReference = createDescriptorForOrderParticipantReference();
  /*package*/ final ConceptDescriptor myConceptOrderReference = createDescriptorForOrderReference();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptOrder, myConceptOrderDeclaration, myConceptOrderParticipant, myConceptOrderParticipantReference, myConceptOrderReference);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Order:
        return myConceptOrder;
      case LanguageConceptSwitch.OrderDeclaration:
        return myConceptOrderDeclaration;
      case LanguageConceptSwitch.OrderParticipant:
        return myConceptOrderParticipant;
      case LanguageConceptSwitch.OrderParticipantReference:
        return myConceptOrderParticipantReference;
      case LanguageConceptSwitch.OrderReference:
        return myConceptOrderReference;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForOrder() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.util.order", "Order", 0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78145L);
    b.interface_();
    b.origin("r:e2f5b4d9-8319-4ef0-b685-6c50fa28ea4b(jetbrains.mps.lang.util.order.structure)/2450897840534683973");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOrderDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.util.order", "OrderDeclaration", 0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78147L);
    b.class_(false, false, true);
    b.parent(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78145L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e2f5b4d9-8319-4ef0-b685-6c50fa28ea4b(jetbrains.mps.lang.util.order.structure)/2450897840534683975");
    b.aggregate("seq", 0x22035699bdd78149L).target(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd7814bL).optional(false).ordered(true).multiple(true).origin("2450897840534683977").done();
    b.alias("Order");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOrderParticipant() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.util.order", "OrderParticipant", 0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x2085244dcb20c1dcL);
    b.interface_();
    b.origin("r:e2f5b4d9-8319-4ef0-b685-6c50fa28ea4b(jetbrains.mps.lang.util.order.structure)/2343319097655214556");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOrderParticipantReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.util.order", "OrderParticipantReference", 0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd7814bL);
    b.class_(false, true, false);
    b.origin("r:e2f5b4d9-8319-4ef0-b685-6c50fa28ea4b(jetbrains.mps.lang.util.order.structure)/2450897840534683979");
    b.associate("target", 0x22035699bdd7814cL).target(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x2085244dcb20c1dcL).optional(false).origin("2450897840534683980").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOrderReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.util.order", "OrderReference", 0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd79211L);
    b.class_(false, false, false);
    b.parent(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78145L);
    b.origin("r:e2f5b4d9-8319-4ef0-b685-6c50fa28ea4b(jetbrains.mps.lang.util.order.structure)/2450897840534688273");
    b.associate("order", 0x22035699bdd79212L).target(0xc9d137c4325944f8L, 0x80ff33ab2b506ee4L, 0x22035699bdd78147L).optional(false).origin("2450897840534688274").done();
    return b.create();
  }
}
