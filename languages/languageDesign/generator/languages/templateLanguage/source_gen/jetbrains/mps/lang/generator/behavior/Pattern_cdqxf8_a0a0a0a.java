package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.pattern.GeneratedMatcher;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class Pattern_cdqxf8_a0a0a0a extends GeneratedMatcher {
  public Pattern_cdqxf8_a0a0a0a(SNode patternNode) {
    super(patternNode, false);


    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10c25fb076aL, 0x10c25fe95c5L, "elementType")).at(0).association(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept"), "concept");
  }

}
