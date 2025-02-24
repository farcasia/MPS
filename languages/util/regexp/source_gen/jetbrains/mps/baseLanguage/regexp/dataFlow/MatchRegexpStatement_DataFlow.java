package jetbrains.mps.baseLanguage.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class MatchRegexpStatement_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11176652f14L, 0x11176678c5eL, "expr")));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117ecbc07aL, 0x1117ecc427cL, "regexp")));
    _context.getBuilder().emitIfJump(_context.getBuilder().label(_context.getNode(), "begin"), "r:f8e2b09f-b9d8-4076-a472-4264b3fb6a47(jetbrains.mps.baseLanguage.regexp.dataFlow)/633895403833151076");
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x11176652f14L, 0x1117665624aL, "body")));
    _context.getBuilder().emitLabel("begin");
  }
}
