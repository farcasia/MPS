package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.pattern.GeneratedMatcher;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class Pattern_hz3823_a0a0b0j extends GeneratedMatcher {
  public Pattern_hz3823_a0a0b0j(SNode patternNode) {
    super(patternNode, true);


    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter")).capture("l");
    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter")).at(0).capture("ignored");
  }

}
