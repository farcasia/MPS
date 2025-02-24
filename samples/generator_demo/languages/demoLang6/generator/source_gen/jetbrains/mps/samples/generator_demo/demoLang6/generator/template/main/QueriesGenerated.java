package jetbrains.mps.samples.generator_demo.demoLang6.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.GenerationFailureException;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetPropertyValue_3978102045101880178(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x82fb751df7fb4b58L, 0xa16e303356f8e0afL, 0x37350ebbae8d1283L, 0x37350ebbae8d12f3L, "text"));
  }
  public static Object propertyMacro_GetPropertyValue_3978102045101880673(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x82fb751df7fb4b58L, 0xa16e303356f8e0afL, 0x37350ebbae8d186cL, 0x37350ebbae8d1876L, "text"));
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("3978102045101880175", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8a1L, 0x11d45f8a8a3L, "value"), "text"));
    pvqMethods.put("3978102045101880670", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x772f6dcd8c0d48f7L, 0x869c908e036f7c8eL, 0x11d45f8a8a1L, 0x11d45f8a8a3L, "value"), "text"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(pvqMethods.containsKey(id))) {
      return super.getPropertyValueQuery(identity);
    }
    return pvqMethods.get(id);
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetPropertyValue_3978102045101880178(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_3978102045101880673(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
}
