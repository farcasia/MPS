package jetbrains.mps.baseLanguage.builders.dataFlow;

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
        return Collections.<IDataFlowBuilder>singletonList(new AsBuilderStatement_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new BeanPropertyBuilder_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new BuilderCreator_DataFlow());
      case 3:
        return Collections.<IDataFlowBuilder>singletonList(new BuilderStatement_DataFlow());
      case 4:
        return Collections.<IDataFlowBuilder>singletonList(new SimpleBuilderPropertyBuilder_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x6c473c8a08195e1cL), MetaIdFactory.conceptId(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x252efd34f8a58ec7L), MetaIdFactory.conceptId(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x61f1de4171d2bf0eL), MetaIdFactory.conceptId(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x61f1de4171d2bf23L), MetaIdFactory.conceptId(0x132aa4d8a3f7441cL, 0xa7eb3fce23492c6aL, 0x4acc05c8d72ec05fL)).seal();
}
