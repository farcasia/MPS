package jetbrains.mps.build.constraints;

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
import jetbrains.mps.build.behavior.BuildTextStringPart__BehaviorDescriptor;
import jetbrains.mps.build.behavior.BuildStringContainer__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BuildTextStringPart_Constraints extends BaseConstraintsDescriptor {
  public BuildTextStringPart_Constraints() {
    super(MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x440d7ea3b68b7d03L, "jetbrains.mps.build.structure.BuildTextStringPart"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L), this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }
      @Override
      public Object getValue(SNode node) {
        String propertyName = "name";
        return SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x440d7ea3b68b7d03L, 0x440d7ea3b68c4d56L, "text"));
      }
    });
    properties.put(MetaAdapterFactory.getProperty(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x440d7ea3b68b7d03L, 0x440d7ea3b68c4d56L, "text"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x440d7ea3b68b7d03L, 0x440d7ea3b68c4d56L), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "text";
        {
          SNode container = BuildTextStringPart__BehaviorDescriptor.getContainer_id5hFYqIiYHaE.invoke(node);
          if (container != null) {
            return (boolean) BuildStringContainer__BehaviorDescriptor.isValidPart_id7XQqoCTkVIS.invoke(container, (SPropertyOperations.getString(propertyValue)), SNodeOperations.getParent(node).getContainmentLink());
          }
          return !((SPropertyOperations.getString(propertyValue)).contains("$"));
        }
      }
    });
    return properties;
  }
}
