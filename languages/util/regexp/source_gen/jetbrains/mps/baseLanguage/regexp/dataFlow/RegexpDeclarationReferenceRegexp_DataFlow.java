package jetbrains.mps.baseLanguage.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class RegexpDeclarationReferenceRegexp_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xdaafa647f1f74b0bL, 0xb09669cd7c8408c0L, 0x1117f58ea2aL, 0x1117f594636L, "regexp")));
  }
}
