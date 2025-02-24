package jetbrains.mps.baseLanguage.unitTest.dataFlow;

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
        return Collections.<IDataFlowBuilder>singletonList(new AssertEquals_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new AssertFalse_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new AssertIsNotNull_DataFlow());
      case 3:
        return Collections.<IDataFlowBuilder>singletonList(new AssertIsNull_DataFlow());
      case 4:
        return Collections.<IDataFlowBuilder>singletonList(new AssertSame_DataFlow());
      case 5:
        return Collections.<IDataFlowBuilder>singletonList(new AssertThrows_DataFlow());
      case 6:
        return Collections.<IDataFlowBuilder>singletonList(new AssertTrue_DataFlow());
      case 7:
        return Collections.<IDataFlowBuilder>singletonList(new Message_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110df569442L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dfae1d08L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x624233a5cf1ae0f7L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110e252ba91L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110dfcb1f43L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110e4cee82cL), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110df833483L), MetaIdFactory.conceptId(0xf61473f9130f42f6L, 0xb98d6c438812c2f6L, 0x110e5064e8fL)).seal();
}
