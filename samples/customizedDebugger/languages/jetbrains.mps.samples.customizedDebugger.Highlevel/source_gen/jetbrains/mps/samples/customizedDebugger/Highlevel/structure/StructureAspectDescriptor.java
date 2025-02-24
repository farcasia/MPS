package jetbrains.mps.samples.customizedDebugger.Highlevel.structure;

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
  /*package*/ final ConceptDescriptor myConceptConversation = createDescriptorForConversation();
  /*package*/ final ConceptDescriptor myConceptMessage = createDescriptorForMessage();
  /*package*/ final ConceptDescriptor myConceptParticipant = createDescriptorForParticipant();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptConversation, myConceptMessage, myConceptParticipant);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Conversation:
        return myConceptConversation;
      case LanguageConceptSwitch.Message:
        return myConceptMessage;
      case LanguageConceptSwitch.Participant:
        return myConceptParticipant;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForConversation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.customizedDebugger.Highlevel", "Conversation", 0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f6fbL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L);
    b.origin("r:952c085e-2c92-4359-824c-db4b9ee3e68e(jetbrains.mps.samples.customizedDebugger.Highlevel.structure)/8203012558887843579");
    b.aggregate("participants", 0x71d6f475fc93f721L).target(0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f707L).optional(false).ordered(true).multiple(true).origin("8203012558887843617").done();
    b.aggregate("smallTalk", 0x71d6f475fc93f723L).target(0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f713L).optional(true).ordered(true).multiple(true).origin("8203012558887843619").done();
    b.alias("conversation");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMessage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.customizedDebugger.Highlevel", "Message", 0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f713L);
    b.class_(false, false, false);
    b.origin("r:952c085e-2c92-4359-824c-db4b9ee3e68e(jetbrains.mps.samples.customizedDebugger.Highlevel.structure)/8203012558887843603");
    b.prop("text", 0x71d6f475fc93f71dL, "8203012558887843613");
    b.associate("author", 0x71d6f475fc93f71fL).target(0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f707L).optional(false).origin("8203012558887843615").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForParticipant() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.customizedDebugger.Highlevel", "Participant", 0xbdab7456dc1d4dc5L, 0xb5bfab059630252dL, 0x71d6f475fc93f707L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:952c085e-2c92-4359-824c-db4b9ee3e68e(jetbrains.mps.samples.customizedDebugger.Highlevel.structure)/8203012558887843591");
    return b.create();
  }
}
