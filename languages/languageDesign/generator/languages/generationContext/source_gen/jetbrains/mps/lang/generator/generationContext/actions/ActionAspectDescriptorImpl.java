package jetbrains.mps.lang.generator.generationContext.actions;

/*Generated by MPS */

import jetbrains.mps.actions.descriptor.BaseActionAspectDescriptor;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import java.util.Collection;
import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Arrays;
import java.util.Collections;

public class ActionAspectDescriptorImpl extends BaseActionAspectDescriptor implements ActionAspectDescriptor {
  private static final String LANGUAGE_FQ_NAME = "jetbrains.mps.lang.generator.generationContext";

  @Override
  public Collection<NodeFactory> getFactories(SAbstractConcept concept) {
    if (LANGUAGE_FQ_NAME.equals(concept.getLanguage().getQualifiedName())) {
      switch (Arrays.binarySearch(stringSwitchCases_tpto26_a0a0a0c, concept.getName())) {
        case 0:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1216861604197());
        case 1:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1216861604215());
        case 2:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1221157578225());
        case 3:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1217895102248());
        case 4:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1217895169604());
        case 5:
          return Collections.<NodeFactory>singletonList(new node_factories.NodeFactory_1217895187934());
        default:
      }
    }
    return Collections.<NodeFactory>emptyList();
  }

  @Override
  public boolean hasBuilders() {
    return false;
  }
  private static String[] stringSwitchCases_tpto26_a0a0a0c = new String[]{"GenerationContextOp_GetOutputByLabel", "GenerationContextOp_GetOutputByLabelAndInput", "GenerationContextOp_GetOutputListByLabelAndInput", "GenerationContextOp_SessionObjectAccess", "GenerationContextOp_StepObjectAccess", "GenerationContextOp_TransientObjectAccess"};
}
