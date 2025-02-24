package jetbrains.mps.baseLanguage.classifiers.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class DefaultClassifierMethodCallOperation_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    for (SNode argument : SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bd711e29L, 0x118bd877799L, "actualArgument"))) {
      _context.getBuilder().build((SNode) argument);
    }
  }
}
