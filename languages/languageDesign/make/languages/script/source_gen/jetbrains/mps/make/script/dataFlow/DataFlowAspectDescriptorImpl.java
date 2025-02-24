package jetbrains.mps.make.script.dataFlow;

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
        return Collections.<IDataFlowBuilder>singletonList(new AdvanceWorkStatement_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new BeginWorkStatement_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new OutputResources_DataFlow());
      case 3:
        return Collections.<IDataFlowBuilder>singletonList(new ResultStatement_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6984L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x29929a95c9e6982L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x20c069f80a972068L), MetaIdFactory.conceptId(0x95f8a3e6f9944ca0L, 0xa65e763c9bae2d3bL, 0x6237d5bb8b2a942dL)).seal();
}
