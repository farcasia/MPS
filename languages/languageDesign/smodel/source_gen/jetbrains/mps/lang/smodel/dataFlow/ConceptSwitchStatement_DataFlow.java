package jetbrains.mps.lang.smodel.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ConceptSwitchStatement_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f42dL, 0x527e98a73771f430L, "expression")));
    for (SNode switchCase : SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f42dL, 0x527e98a73771f431L, "case"))) {
      _context.getBuilder().emitIfJump(_context.getBuilder().before(switchCase), "r:00000000-0000-4000-0000-011c895902fc(jetbrains.mps.lang.smodel.dataFlow)/1207558714582");
    }
    _context.getBuilder().emitIfJump(_context.getBuilder().before(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f42dL, 0x53cfca750aa0c6d0L, "defaultBlock"))), "r:00000000-0000-4000-0000-011c895902fc(jetbrains.mps.lang.smodel.dataFlow)/1207558718604");
    for (SNode switchCase : SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f42dL, 0x527e98a73771f431L, "case"))) {
      _context.getBuilder().build((SNode) switchCase);
      _context.getBuilder().emitMayBeUnreachable(new Runnable() {
        public void run() {
          _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()), "r:00000000-0000-4000-0000-011c895902fc(jetbrains.mps.lang.smodel.dataFlow)/3564379068314596551");
        }
      });
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x527e98a73771f42dL, 0x53cfca750aa0c6d0L, "defaultBlock")));
  }
}
