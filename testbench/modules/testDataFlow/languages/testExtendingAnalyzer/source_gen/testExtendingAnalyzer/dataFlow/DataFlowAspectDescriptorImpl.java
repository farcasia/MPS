package testExtendingAnalyzer.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.DataFlowAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.lang.dataFlow.framework.DataFlowConstructor;
import java.util.Arrays;
import java.util.Collections;

public class DataFlowAspectDescriptorImpl extends DataFlowAspectDescriptorBase {
  @NotNull
  @Override
  public Collection<DataFlowConstructor> getConstructors(String analyzerId) {
    switch (Arrays.binarySearch(stringSwitchCases_vhxjlb_a0a0a, analyzerId)) {
      case 0:
        return Collections.<DataFlowConstructor>singletonList(new NullSafeRule());
      default:
    }
    return Collections.<DataFlowConstructor>emptyList();
  }

  private static String[] stringSwitchCases_vhxjlb_a0a0a = new String[]{"jetbrains.mps.baseLanguage.dataFlow.Nullable"};
}
