package jetbrains.mps.lang.extension.migration;

/*Generated by MPS */

import jetbrains.mps.lang.pattern.GeneratedMatcher;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class Pattern_2kk9yi_a3a2 extends GeneratedMatcher {
  public Pattern_2kk9yi_a3a2(SNode patternNode) {
    super(patternNode, false);


    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0xc0080a477e374558L, 0xbee99ae18e690549L, 0x61a62b43e1534e99L, 0x61a62b43e1534e9dL, "fieldType")).at(0).capture("type");
    myTopMatcher.property(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "name");
  }

}
