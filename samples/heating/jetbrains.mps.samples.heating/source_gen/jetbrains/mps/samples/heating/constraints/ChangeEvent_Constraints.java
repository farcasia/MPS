package jetbrains.mps.samples.heating.constraints;

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

public class ChangeEvent_Constraints extends BaseConstraintsDescriptor {
  public ChangeEvent_Constraints() {
    super(MetaAdapterFactory.getConcept(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec62L, "jetbrains.mps.samples.heating.structure.ChangeEvent"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec62L, 0x4644aa4ce08aec70L, "temperature"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0xa7d67633e8d9473bL, 0x98ce995a7aa66941L, 0x4644aa4ce08aec62L, 0x4644aa4ce08aec70L), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "temperature";
        return (SPropertyOperations.getInteger(propertyValue)) >= 12 && (SPropertyOperations.getInteger(propertyValue)) <= 30;
      }
    });
    return properties;
  }
}
