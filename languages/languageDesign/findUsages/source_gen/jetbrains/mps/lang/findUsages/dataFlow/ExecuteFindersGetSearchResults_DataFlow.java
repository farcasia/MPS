package jetbrains.mps.lang.findUsages.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ExecuteFindersGetSearchResults_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x1bd5a514384e1959L, 0x585a05e7f4113540L, "progress")));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x1bd5a514384e1959L, 0x585a05e7f411353eL, "queryNode")));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x1bd5a514384e1959L, 0x585a05e7f411353fL, "scope")));
  }
}
