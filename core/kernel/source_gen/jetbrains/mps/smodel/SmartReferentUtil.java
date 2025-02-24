package jetbrains.mps.smodel;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public final class SmartReferentUtil {

  private SmartReferentUtil() {
  }

  public static String getPresentation(SNode reference, SNode referent) {
    if (SNodeOperations.isInstanceOf(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))) {
      return ((String) BHReflection.invoke0((SNodeOperations.cast(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))), MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"), SMethodTrimmedId.create("getPresentation", null, "69Qfsw3IoJg"), reference));
    }
    return null;
  }

  public static String getMatchingText(SNode reference, SNode referent) {
    if (SNodeOperations.isInstanceOf(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))) {
      return ((String) BHReflection.invoke0((SNodeOperations.cast(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))), MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"), SMethodTrimmedId.create("getMatchingText", null, "69Qfsw3InJX"), reference));
    }
    // IResolveInfo now uses to distinct matchingText and visibleMatchingText 
    if (SNodeOperations.isInstanceOf(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L, "jetbrains.mps.lang.core.structure.IResolveInfo"))) {
      return SPropertyOperations.getString((SNodeOperations.cast(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L, "jetbrains.mps.lang.core.structure.IResolveInfo"))), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L, 0x116b17cd415L, "resolveInfo"));
    }
    return null;
  }

  public static String getVisibleMatchingText(SNode reference, SNode referent) {
    if (SNodeOperations.isInstanceOf(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))) {
      return ((String) BHReflection.invoke0((SNodeOperations.cast(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))), MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"), SMethodTrimmedId.create("getVisibleMatchingText", null, "69Qfsw3Ipre"), reference));
    }
    return null;
  }

  public static String getMatchingText(SNode reference, SNode referent, boolean visible) {
    if (visible) {
      return getVisibleMatchingText(reference, referent);
    } else {
      return getMatchingText(reference, referent);
    }
  }

  public static String getDescriptionText(SNode reference, SNode referent) {
    if (SNodeOperations.isInstanceOf(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))) {
      return ((String) BHReflection.invoke0((SNodeOperations.cast(referent, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"))), MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x62763dc803b97bd8L, "jetbrains.mps.lang.core.structure.ISmartReferent"), SMethodTrimmedId.create("getDescriptionText", null, "69Qfsw3IqwE"), reference));
    }
    // compatiblity with legacy. after 3.5 -> "return null" 
    return SPropertyOperations.getString(referent, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x10d34f97574L, "shortDescription"));
  }
}
