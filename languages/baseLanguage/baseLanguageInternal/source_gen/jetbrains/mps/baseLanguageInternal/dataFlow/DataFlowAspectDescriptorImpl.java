package jetbrains.mps.baseLanguageInternal.dataFlow;

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
        return Collections.<IDataFlowBuilder>singletonList(new ExtractStatementListExpression_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new ExtractStatementListInnerExpression_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new InternalAnonymousClassCreator_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b763512c9L), MetaIdFactory.conceptId(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2f7b79225e746808L)).seal();
}
