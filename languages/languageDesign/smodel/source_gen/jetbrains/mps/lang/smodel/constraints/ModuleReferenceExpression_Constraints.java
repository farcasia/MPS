package jetbrains.mps.lang.smodel.constraints;

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
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.lang.smodel.behavior.ModuleReferenceExpression__BehaviorDescriptor;

public class ModuleReferenceExpression_Constraints extends BaseConstraintsDescriptor {
  public ModuleReferenceExpression_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x38130dc4e3db5af1L, "jetbrains.mps.lang.smodel.structure.ModuleReferenceExpression"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x38130dc4e3db5af1L, 0x38130dc4e3db5af2L, "name"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x38130dc4e3db5af1L, 0x38130dc4e3db5af2L), this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }
      @Override
      public Object getValue(SNode node) {
        String propertyName = "name";
        {
          SModule module = ModuleReferenceExpression__BehaviorDescriptor.getModule_id3wj3sjzQUV1.invoke(node);
          if (module == null) {
            return null;
          }
          return module.getModuleName();
        }
      }
    });
    return properties;
  }
}
