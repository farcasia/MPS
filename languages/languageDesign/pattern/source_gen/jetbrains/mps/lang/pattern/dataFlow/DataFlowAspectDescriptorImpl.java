package jetbrains.mps.lang.pattern.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.DataFlowAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.lang.dataFlow.framework.IDataFlowBuilder;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class DataFlowAspectDescriptorImpl extends DataFlowAspectDescriptorBase {

  @NotNull
  @Override
  public Collection<IDataFlowBuilder> getDataFlowBuilders(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0b = ((SAbstractConcept) concept);
    switch (index_vhxjlb_a0b.index(cncpt_a0b)) {
      case 0:
        return Collections.<IDataFlowBuilder>singletonList(new PatternExpression_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new PatternVariableDeclaration_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new PropertyPatternVariableDeclaration_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb4791L), MetaIdFactory.conceptId(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb4793L), MetaIdFactory.conceptId(0xd4615e3bd6714ba9L, 0xaf012b78369b0ba7L, 0x108a9cb4795L)).seal();
}
