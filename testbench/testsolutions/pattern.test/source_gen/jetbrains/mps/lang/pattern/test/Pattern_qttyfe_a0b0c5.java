package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.lang.pattern.GeneratedMatcher;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.pattern.NodeMatcher;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class Pattern_qttyfe_a0b0c5 extends GeneratedMatcher {
  public Pattern_qttyfe_a0b0c5(SNode patternNode, SNode orClause0, SNode orClause1) {
    super(patternNode, false);

    NodeMatcher disjunct0 = new NodeMatcher(myValues);
    NodeMatcher disjunct1 = new NodeMatcher(myValues);
    disjunct0.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression")).at(0).capture("ds");
    disjunct1.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression")).at(0).capture("ds");

    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b219L, "ifTrue")).at(0).child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement")).at(0).capture("body");
    myTopMatcher.child(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition")).at(0).disjunct(orClause0, disjunct0).disjunct(orClause1, disjunct1);
  }

}
