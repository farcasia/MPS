package jetbrains.mps.samples.Expressions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class ArithmeticSimpleMathExpression_Constraints extends BaseConstraintsDescriptor {
  public ArithmeticSimpleMathExpression_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b8289497L, "jetbrains.mps.samples.Expressions.structure.ArithmeticSimpleMathExpression"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b8289497L, 0x1cc69153b82894eaL, "operator"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0x7e282943fc6b4900L, 0xada534c0024cc4f4L, 0x1cc69153b8289497L, 0x1cc69153b82894eaL), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "operator";
        return (SPropertyOperations.getString(propertyValue)).length() == 1 && ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<String>(), "+", "-", "*", "/")).contains((SPropertyOperations.getString(propertyValue)));
      }
    });
    return properties;
  }
}
