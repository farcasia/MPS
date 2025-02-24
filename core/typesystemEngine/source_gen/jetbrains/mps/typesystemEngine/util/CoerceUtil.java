package jetbrains.mps.typesystemEngine.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;

public final class CoerceUtil {
  public static SConcept concept_MeetType = MetaAdapterFactory.getConcept(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x114b68ad132L, "jetbrains.mps.lang.typesystem.structure.MeetType");
  public static SContainmentLink link_MeetType_argument = MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x114b68ad132L, 0x114b68b040bL, "argument");
  public static SConcept concept_JoinType = MetaAdapterFactory.getConcept(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x1129e737f02L, "jetbrains.mps.lang.typesystem.structure.JoinType");
  public static SContainmentLink link_JoinType_argument = MetaAdapterFactory.getContainmentLink(0x7a5dda6291404668L, 0xab76d5ed1746f2b2L, 0x1129e737f02L, 0x1129e73a76aL, "argument");

  public CoerceUtil() {
  }

  public static boolean canBeCoerced(SNode type, SAbstractConcept concept) {
    if (concept == null) {
      return true;
    }
    return (SNodeOperations.isInstanceOf(type, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type")) ? ((boolean) (Boolean) BHReflection.invoke0(SNodeOperations.cast(type, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL, "jetbrains.mps.baseLanguage.structure.Type"), SMethodTrimmedId.create("canBeCoerced", null, "476YRQvP9l3"), concept)) : true);
  }
}
