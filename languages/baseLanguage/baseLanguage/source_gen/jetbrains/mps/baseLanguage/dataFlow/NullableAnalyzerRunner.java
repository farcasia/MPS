package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.CustomAnalyzerRunner;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.dataFlow.MPSProgramFactory;
import java.util.Collections;
import jetbrains.mps.lang.dataFlow.framework.IDataFlowModeId;
import jetbrains.mps.lang.dataFlow.framework.ProgramFactory;
import jetbrains.mps.lang.dataFlow.framework.NamedAnalyzerId;
import jetbrains.mps.lang.dataFlow.framework.DataFlowAnalyzerBase;
import jetbrains.mps.lang.dataFlow.framework.Program;
import java.util.HashMap;
import java.util.List;
import jetbrains.mps.lang.dataFlow.framework.ProgramState;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.analyzers.runtime.framework.GeneratedInstruction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;
import jetbrains.mps.lang.dataFlow.framework.AnalysisDirection;

public class NullableAnalyzerRunner extends CustomAnalyzerRunner<Map<SNode, NullableState>> {
  private SNode myNode;
  public NullableAnalyzerRunner(SNode node) {
    this(node, new MPSProgramFactory(Collections.<IDataFlowModeId>emptyList()));
  }
  public NullableAnalyzerRunner(SNode node, ProgramFactory<NamedAnalyzerId> factory) {
    super(null, null);
    myNode = node;
    myAnalyzer = new NullableAnalyzerRunner.NullableAnalyzer();
    myProgram = factory.createProgram(myNode);
    factory.prepareProgram(myProgram, myNode, new NamedAnalyzerId("jetbrains.mps.baseLanguage.dataFlow.Nullable"));
  }

  public static class NullableAnalyzer extends DataFlowAnalyzerBase<Map<SNode, NullableState>> {
    public NullableAnalyzer() {
    }
    public Map<SNode, NullableState> initial(Program program) {
      Map<SNode, NullableState> result = new HashMap<SNode, NullableState>();
      return result;
    }
    public Map<SNode, NullableState> merge(Program program, List<Map<SNode, NullableState>> input) {
      Map<SNode, NullableState> result = new HashMap<SNode, NullableState>();
      for (Map<SNode, NullableState> inputElement : input) {
        for (Map.Entry<SNode, NullableState> entry : inputElement.entrySet()) {
          SNode expr = entry.getKey();
          NullableState value = entry.getValue();
          NullableState resValue = result.get(expr);
          if (resValue == null) {
            resValue = NullableState.NOT_INIT;
          }
          result.put(expr, resValue.merge(value));
        }
      }
      return result;
    }
    public Map<SNode, NullableState> fun(Map<SNode, NullableState> input, ProgramState state, @Nullable Map<ProgramState, Map<SNode, NullableState>> stateValues) {
      Map<SNode, NullableState> result = input;
      Instruction instruction = state.getInstruction();
      NullableState nullableState = NullableState.UNKNOWN;
      if (instruction instanceof GeneratedInstruction) {
        SNode node = (SNode) (((GeneratedInstruction) instruction).getParameter());
        if (instruction instanceof notNullInstruction) {
          nullableState = NullableState.NOTNULL;
        }
        if (instruction instanceof nullableInstruction) {
          nullableState = NullableState.NULLABLE;
        }
        if (instruction instanceof nullInstruction) {
          nullableState = NullableState.NULL;
        }
        if (SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"))) {
          node = SLinkOperations.getTarget(SNodeOperations.cast(node, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"));
        }
        if (node != null) {
          result.put(node, nullableState);
        }
      }
      if (instruction instanceof WriteInstruction) {
        WriteInstruction write = (WriteInstruction) instruction;
        SNode value = (SNode) write.getValue();
        if (SNodeOperations.isInstanceOf(value, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"))) {
          value = SLinkOperations.getTarget(SNodeOperations.cast(value, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"));
        }
        NullableState valueState = result.get(value);
        if (valueState == null) {
          valueState = NullableState.UNKNOWN;
        }
        result.put((SNode) write.getVariable(), valueState);
      }
      return result;
    }
    public AnalysisDirection getDirection() {
      return AnalysisDirection.FORWARD;
    }

    /**
     * 
     * @deprecated 
     */
    @Deprecated
    public static String getId() {
      return "jetbrains.mps.baseLanguage.dataFlow.Nullable";
    }
  }
}
