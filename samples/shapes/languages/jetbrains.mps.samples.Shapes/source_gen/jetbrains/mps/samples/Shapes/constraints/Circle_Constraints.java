package jetbrains.mps.samples.Shapes.constraints;

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

public class Circle_Constraints extends BaseConstraintsDescriptor {
  public Circle_Constraints() {
    super(MetaAdapterFactory.getConcept(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc198L, "jetbrains.mps.samples.Shapes.structure.Circle"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc198L, 0x51dcaa29974fc19eL, "radius"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc198L, 0x51dcaa29974fc19eL), this) {
      @Override
      public boolean hasOwnSetter() {
        return true;
      }
      @Override
      public void setValue(SNode node, String propertyValue) {
        String propertyName = "radius";
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc198L, 0x51dcaa29974fc19eL, "radius"), "" + (11110));
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc198L, 0x51dcaa29974fc19eL, "radius"), "" + ((SPropertyOperations.getInteger(propertyValue))));
      }
    });
    return properties;
  }
}
