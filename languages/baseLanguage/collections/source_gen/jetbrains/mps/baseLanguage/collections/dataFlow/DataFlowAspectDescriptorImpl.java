package jetbrains.mps.baseLanguage.collections.dataFlow;

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
        return Collections.<IDataFlowBuilder>singletonList(new AbstractContainerCreator_DataFlow());
      case 1:
        return Collections.<IDataFlowBuilder>singletonList(new AddAllElementsOperation_DataFlow());
      case 2:
        return Collections.<IDataFlowBuilder>singletonList(new AddAllSetElementsOperation_DataFlow());
      case 3:
        return Collections.<IDataFlowBuilder>singletonList(new AddElementOperation_DataFlow());
      case 4:
        return Collections.<IDataFlowBuilder>singletonList(new AddFirstElementOperation_DataFlow());
      case 5:
        return Collections.<IDataFlowBuilder>singletonList(new AddLastElementOperation_DataFlow());
      case 6:
        return Collections.<IDataFlowBuilder>singletonList(new AddSetElementOperation_DataFlow());
      case 7:
        return Collections.<IDataFlowBuilder>singletonList(new BinaryOperation_DataFlow());
      case 8:
        return Collections.<IDataFlowBuilder>singletonList(new ChunkOperation_DataFlow());
      case 9:
        return Collections.<IDataFlowBuilder>singletonList(new ComparatorSortOperation_DataFlow());
      case 10:
        return Collections.<IDataFlowBuilder>singletonList(new ContainsAllOperation_DataFlow());
      case 11:
        return Collections.<IDataFlowBuilder>singletonList(new ContainsKeyOperation_DataFlow());
      case 12:
        return Collections.<IDataFlowBuilder>singletonList(new ContainsOperation_DataFlow());
      case 13:
        return Collections.<IDataFlowBuilder>singletonList(new ContainsValueOperation_DataFlow());
      case 14:
        return Collections.<IDataFlowBuilder>singletonList(new DowncastExpression_DataFlow());
      case 15:
        return Collections.<IDataFlowBuilder>singletonList(new FoldLeftOperation_DataFlow());
      case 16:
        return Collections.<IDataFlowBuilder>singletonList(new FoldRightOperation_DataFlow());
      case 17:
        return Collections.<IDataFlowBuilder>singletonList(new ForEachStatement_DataFlow());
      case 18:
        return Collections.<IDataFlowBuilder>singletonList(new ForEachVariable_DataFlow());
      case 19:
        return Collections.<IDataFlowBuilder>singletonList(new ForEachVariableReference_DataFlow());
      case 20:
        return Collections.<IDataFlowBuilder>singletonList(new GetElementOperation_DataFlow());
      case 21:
        return Collections.<IDataFlowBuilder>singletonList(new GetIndexOfOperation_DataFlow());
      case 22:
        return Collections.<IDataFlowBuilder>singletonList(new GetLastIndexOfOperation_DataFlow());
      case 23:
        return Collections.<IDataFlowBuilder>singletonList(new HashMapCreator_DataFlow());
      case 24:
        return Collections.<IDataFlowBuilder>singletonList(new HeadListOperation_DataFlow());
      case 25:
        return Collections.<IDataFlowBuilder>singletonList(new HeadMapOperation_DataFlow());
      case 26:
        return Collections.<IDataFlowBuilder>singletonList(new HeadSetOperation_DataFlow());
      case 27:
        return Collections.<IDataFlowBuilder>singletonList(new InsertElementOperation_DataFlow());
      case 28:
        return Collections.<IDataFlowBuilder>singletonList(new InternalSequenceOperation_DataFlow());
      case 29:
        return Collections.<IDataFlowBuilder>singletonList(new JoinOperation_DataFlow());
      case 30:
        return Collections.<IDataFlowBuilder>singletonList(new ListElementAccessExpression_DataFlow());
      case 31:
        return Collections.<IDataFlowBuilder>singletonList(new MapElement_DataFlow());
      case 32:
        return Collections.<IDataFlowBuilder>singletonList(new MapEntry_DataFlow());
      case 33:
        return Collections.<IDataFlowBuilder>singletonList(new MapInitializer_DataFlow());
      case 34:
        return Collections.<IDataFlowBuilder>singletonList(new MapOperationExpression_DataFlow());
      case 35:
        return Collections.<IDataFlowBuilder>singletonList(new MapRemoveOperation_DataFlow());
      case 36:
        return Collections.<IDataFlowBuilder>singletonList(new MultiForEachStatement_DataFlow());
      case 37:
        return Collections.<IDataFlowBuilder>singletonList(new MultiForEachVariable_DataFlow());
      case 38:
        return Collections.<IDataFlowBuilder>singletonList(new MultiForEachVariableReference_DataFlow());
      case 39:
        return Collections.<IDataFlowBuilder>singletonList(new PageOperation_DataFlow());
      case 40:
        return Collections.<IDataFlowBuilder>singletonList(new PushOperation_DataFlow());
      case 41:
        return Collections.<IDataFlowBuilder>singletonList(new PutAllOperation_DataFlow());
      case 42:
        return Collections.<IDataFlowBuilder>singletonList(new RemoveAllElementsOperation_DataFlow());
      case 43:
        return Collections.<IDataFlowBuilder>singletonList(new RemoveAllSetElementsOperation_DataFlow());
      case 44:
        return Collections.<IDataFlowBuilder>singletonList(new RemoveAtElementOperation_DataFlow());
      case 45:
        return Collections.<IDataFlowBuilder>singletonList(new RemoveElementOperation_DataFlow());
      case 46:
        return Collections.<IDataFlowBuilder>singletonList(new RemoveSetElementOperation_DataFlow());
      case 47:
        return Collections.<IDataFlowBuilder>singletonList(new SequenceCreator_DataFlow());
      case 48:
        return Collections.<IDataFlowBuilder>singletonList(new SetElementOperation_DataFlow());
      case 49:
        return Collections.<IDataFlowBuilder>singletonList(new SingleArgumentSequenceOperation_DataFlow());
      case 50:
        return Collections.<IDataFlowBuilder>singletonList(new SingletonSequenceCreator_DataFlow());
      case 51:
        return Collections.<IDataFlowBuilder>singletonList(new SkipOperation_DataFlow());
      case 52:
        return Collections.<IDataFlowBuilder>singletonList(new SortOperation_DataFlow());
      case 53:
        return Collections.<IDataFlowBuilder>singletonList(new SubListOperation_DataFlow());
      case 54:
        return Collections.<IDataFlowBuilder>singletonList(new SubMapOperation_DataFlow());
      case 55:
        return Collections.<IDataFlowBuilder>singletonList(new SubSetOperation_DataFlow());
      case 56:
        return Collections.<IDataFlowBuilder>singletonList(new TailListOperation_DataFlow());
      case 57:
        return Collections.<IDataFlowBuilder>singletonList(new TailMapOperation_DataFlow());
      case 58:
        return Collections.<IDataFlowBuilder>singletonList(new TailSetOperation_DataFlow());
      case 59:
        return Collections.<IDataFlowBuilder>singletonList(new TakeOperation_DataFlow());
      default:
    }
    return Collections.<IDataFlowBuilder>emptyList();
  }
  private static final ConceptSwitchIndex index_vhxjlb_a0b = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x1202df1ada0L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10e3d20dbefL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d969dca87L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10e39e3ff80L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11db0384e32L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11db0389d32L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d9514ebd8L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11205199ac2L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118bc7e66e2L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x119a966b94dL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x5507720272481451L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x117b3740258L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x110efd61311L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x1203903c318L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11df825e596L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x1520010667848262L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x152001066784e507L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10cac65f399L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10cac6f0962L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10cac6fa5c3L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10ec44fd67eL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x110bc593e18L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x37cbb2bef55da8aeL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116dbb34f2dL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x489c7f2006b05842L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4071445L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4bdd40dL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d5cc25c8fL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x1188372895aL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120debe16c6L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d6213c318L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x116ea555a25L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118f249550fL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118f2481867L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x117ae10e4d9L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11914b836a4L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x7d7db8f4181fe9f2L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x7d7db8f4181fea18L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x731a0dad81895f16L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11108717200L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x2e9a0b9a88f4311cL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120ebcea0f9L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11154a8aed3L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d96b14ae4L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11db038dd8cL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x10fcd477695L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d968cae32L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d14c97b16L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d5e2fc7c1L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x7818f71827244b5L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11fade5d82aL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x111076c0538L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118b81cc8f6L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x4e2f4f8785270237L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4139de2L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4c28b15L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x489c7f2006b0588eL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4127c90L), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x120c4c1050eL), MetaIdFactory.conceptId(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x111083dd9b7L)).seal();
}
