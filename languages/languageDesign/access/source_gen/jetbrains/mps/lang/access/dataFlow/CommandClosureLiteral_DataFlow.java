package jetbrains.mps.lang.access.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.baseLanguage.behavior.IStatementListContainer__BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.behavior.StatementList__BehaviorDescriptor;

public class CommandClosureLiteral_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    if ((boolean) IStatementListContainer__BehaviorDescriptor.isExecuteSynchronous_idhTIpcC8.invoke(_context.getNode())) {
      _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf0522fL, "body")));
    } else {
      for (SNode var : StatementList__BehaviorDescriptor.getExternalVariablesDeclarations_idhF5UhAC.invoke(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf0522fL, "body")))) {
        _context.getBuilder().emitRead(var, "r:7fecad41-ba00-432a-a44f-b9577c19856b(jetbrains.mps.lang.access.dataFlow)/8974276187400348282");
      }
    }
  }
}
