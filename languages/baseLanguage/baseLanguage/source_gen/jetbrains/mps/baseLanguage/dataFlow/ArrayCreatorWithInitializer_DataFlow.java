package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ArrayCreatorWithInitializer_DataFlow extends DataFlowBuilder {
  public void build(final DataFlowBuilderContext _context) {
    for (SNode initValue : SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01d19acL, "initValue"))) {
      _context.getBuilder().build((SNode) initValue);
    }
  }
}
