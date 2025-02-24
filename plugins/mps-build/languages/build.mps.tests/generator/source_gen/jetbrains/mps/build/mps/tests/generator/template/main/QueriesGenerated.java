package jetbrains.mps.build.mps.tests.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.build.util.DependenciesHelper;
import jetbrains.mps.build.behavior.BuildLayout_PathElement__BehaviorDescriptor;
import jetbrains.mps.build.util.MacroHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.behavior.BuildString__BehaviorDescriptor;
import jetbrains.mps.build.behavior.BuildSourcePath__BehaviorDescriptor;
import jetbrains.mps.build.util.Context;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.build.mps.util.ModuleFinder;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.build.mps.tests.behavior.BuildMpsLayout_TestModules_Content__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.TemplateVarContext;
import jetbrains.mps.build.mps.util.MPSModulesClosure;
import jetbrains.mps.build.mps.util.ModulePlugins;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import java.util.Collection;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import jetbrains.mps.generator.impl.query.VariableValueQuery;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetPropertyValue_4608161086085620431(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"));
  }
  public static Object propertyMacro_GetPropertyValue_3944198881067747478(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"));
  }
  public static Object propertyMacro_GetPropertyValue_4608161086086019487(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"));
  }
  public static Object propertyMacro_GetPropertyValue_7459197473276946301(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"));
  }
  public static Object propertyMacro_GetPropertyValue_7459197473276744078(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"));
  }
  public static Object propertyMacro_GetPropertyValue_185990153988622954(final PropertyMacroContext _context) {
    SNode project = SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getNode()), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject"));
    if (project == null) {
      _context.showErrorMessage(project, "Context project is null");
      return _context.getTemplateValue();
    }
    DependenciesHelper helper = new DependenciesHelper(_context, project);
    String artifact = "mps-test-folder";
    SNode mpsTestJar = helper.getArtifact(artifact);
    if ((mpsTestJar != null)) {
      return BuildLayout_PathElement__BehaviorDescriptor.location_id6b4RkXS8sT2.invoke(mpsTestJar, helper, artifact);
    }
    return _context.getTemplateValue();
  }
  public static Object propertyMacro_GetPropertyValue_7206546315287713492(final PropertyMacroContext _context) {
    SNode project = SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getNode()), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject"));
    MacroHelper macroHelper = new MacroHelper.MacroContext(project, _context).getMacros(project);
    if ((SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x3600cb0a44dd4a5bL, 0x996822924406419eL, 0x3f496e80bd8ef36dL, 0x6402cbb11c1307aeL, "haltonfailure")) == null)) {
      return "false";
    }
    return (String) BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x3600cb0a44dd4a5bL, 0x996822924406419eL, 0x3f496e80bd8ef36dL, 0x6402cbb11c1307aeL, "haltonfailure")), macroHelper);
  }
  public static Object propertyMacro_GetPropertyValue_149846544984625626(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_149846544985221020(final PropertyMacroContext _context) {
    return (String) BuildSourcePath__BehaviorDescriptor.getAntPath_id7ro1ZztyOh5.invoke(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafadd002L, 0x668c6cfbafadf0eaL, "defaultPath")), Context.defaultContext(_context));
  }
  public static Object propertyMacro_GetPropertyValue_8568272520041595726(final PropertyMacroContext _context) {
    return _context.getTemplateValue() + "-" + SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_4005526075832899342(final PropertyMacroContext _context) {
    return _context.getTemplateValue() + "." + SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static boolean ifMacro_Condition_7459197473276644771(final IfMacroContext _context) {
    return !(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path")).endsWith(".jar"));
  }
  public static boolean ifMacro_Condition_7459197473282491895(final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x3600cb0a44dd4a5bL, 0x996822924406419eL, 0x3f496e80bd8ef36dL, 0x3f496e80bd8ef370L, "modules"))).isNotEmpty();
  }
  public static Iterable<SNode> sourceNodesQuery_4608161086082595438(final SourceSubstituteMacroNodesContext _context) {
    return ModuleFinder.findModules(((Iterable<SNode>) _context.getVariable("var:modules")), _context, _context.getNode());
  }
  public static Iterable<SNode> sourceNodesQuery_3944198881066888502(final SourceSubstituteMacroNodesContext _context) {
    return Sequence.fromIterable(Sequence.fromArray(((String[]) _context.getVariable("var:requiredPlugins")))).select(new ISelector<String, SNode>() {
      public SNode select(String it) {
        return createGeneratorInternal_String_x583g4_a0a0a0a0p(it);
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_4608161086085543486(final SourceSubstituteMacroNodesContext _context) {
    return ModuleFinder.findModules(ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x3600cb0a44dd4a5bL, 0x996822924406419eL, 0x3f496e80bd8ef36dL, 0x3f496e80bd8ef370L, "modules"))).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return (Iterable<SNode>) BuildMpsLayout_TestModules_Content__BehaviorDescriptor.getModules_id3X9rC2XzJij.invoke(it);
      }
    }), _context, _context.getNode());
  }
  public static Iterable<SNode> sourceNodesQuery_7459197473276626316(final SourceSubstituteMacroNodesContext _context) {
    return Sequence.fromIterable(Sequence.fromArray(((String[]) _context.getVariable("var:requiredPlugins")))).select(new ISelector<String, SNode>() {
      public SNode select(String it) {
        return createGeneratorInternal_String_x583g4_a0a0a0a0r(it);
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_149846544984029122(final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject")), MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, 0x4df58c6f18f84a22L, "macros"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafadd002L, "jetbrains.mps.build.structure.BuildFolderMacro"));
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SNodeOperations.cast(it, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafadd002L, "jetbrains.mps.build.structure.BuildFolderMacro"));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).startsWith("mps.macro.");
      }
    });
  }
  public static Object insertMacro_varValue_4608161086082556980(final TemplateVarContext _context) {
    return ((MPSModulesClosure) _context.getVariable("var:closure")).getAllModules();
  }
  public static Object insertMacro_varValue_4005526075833130408(final TemplateVarContext _context) {
    return new MPSModulesClosure(ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x3600cb0a44dd4a5bL, 0x996822924406419eL, 0x3f496e80bd8ef36dL, 0x3f496e80bd8ef370L, "modules"))).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return (Iterable<SNode>) BuildMpsLayout_TestModules_Content__BehaviorDescriptor.getModules_id3X9rC2XzJij.invoke(it);
      }
    }), new MPSModulesClosure.ModuleDependenciesOptions().trackDevkits()).designtimeClosure();
  }
  public static Object insertMacro_varValue_4005526075833129160(final TemplateVarContext _context) {
    return new ModulePlugins(SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getNode()), MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject")), _context).getPluginPaths();
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("4608161086082595438", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("3944198881066888502", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("4608161086085543486", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("7459197473276626316", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("149846544984029122", new QueriesGenerated.SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    final String id = ((QueryKeyImpl) identity).getQueryNodeId().toString();
    if (!(snsqMethods.containsKey(id))) {
      return super.getSourceNodesQuery(identity);
    }
    return snsqMethods.get(id);
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4608161086082595438(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_3944198881066888502(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4608161086085543486(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_7459197473276626316(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_149846544984029122(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("4608161086085620430", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "lib.module.location"));
    pvqMethods.put("3944198881067747475", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "plugin.location"));
    pvqMethods.put("4608161086086019484", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "test.module.location"));
    pvqMethods.put("7459197473276946300", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "plugin.jar.path"));
    pvqMethods.put("7459197473276744077", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "plugin.dir"));
    pvqMethods.put("185990153988622848", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "${artifacts.mps}/lib"));
    pvqMethods.put("7206546315287713491", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "${mps.junit.haltonfailure}"));
    pvqMethods.put("149846544984625625", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "mps.macro"));
    pvqMethods.put("149846544985221019", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "mps.macro.value"));
    pvqMethods.put("8568272520041595725", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54cfd1fL, 0x5c842a42c54cfd20L, "text"), "TEST-jetbrains.mps.testbench.junit.suites.AntModuleTestSuite"));
    pvqMethods.put("4005526075832899341", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "test"));
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
          return QueriesGenerated.propertyMacro_GetPropertyValue_4608161086085620431(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_3944198881067747478(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetPropertyValue_4608161086086019487(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetPropertyValue_7459197473276946301(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetPropertyValue_7459197473276744078(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetPropertyValue_185990153988622954(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetPropertyValue_7206546315287713492(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetPropertyValue_149846544984625626(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetPropertyValue_149846544985221020(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetPropertyValue_8568272520041595726(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetPropertyValue_4005526075832899342(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("7459197473276644769", new QueriesGenerated.IfMC(i++));
    imcMethods.put("7459197473282491893", new QueriesGenerated.IfMC(i++));
  }
  @NotNull
  @Override
  public IfMacroCondition getIfMacroCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(imcMethods.containsKey(id))) {
      return super.getIfMacroCondition(identity);
    }
    return imcMethods.get(id);
  }
  private static class IfMC implements IfMacroCondition {
    private final int methodKey;
    public IfMC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull IfMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.ifMacro_Condition_7459197473276644771(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_7459197473282491895(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, VariableValueQuery> vvqMethods = new HashMap<String, VariableValueQuery>();
  {
    vvqMethods.put("4608161086082556978", new QueriesGenerated.VVQ(0));
    vvqMethods.put("4005526075833130406", new QueriesGenerated.VVQ(1));
    vvqMethods.put("4005526075833129158", new QueriesGenerated.VVQ(2));
  }
  @NotNull
  @Override
  public VariableValueQuery getVariableValueQuery(@NotNull QueryKey queryKey) {
    final String id = queryKey.getTemplateNode().getNodeId().toString();
    if (!(vvqMethods.containsKey(id))) {
      return super.getVariableValueQuery(queryKey);
    }
    return vvqMethods.get(id);
  }
  private static class VVQ implements VariableValueQuery {
    private final int methodKey;
    /*package*/ VVQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull TemplateVarContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.insertMacro_varValue_4608161086082556980(ctx);
        case 1:
          return QueriesGenerated.insertMacro_varValue_4005526075833130408(ctx);
        case 2:
          return QueriesGenerated.insertMacro_varValue_4005526075833129160(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private static SNode createGeneratorInternal_String_x583g4_a0a0a0a0p(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, "jetbrains.mps.build.mps.structure.GeneratorInternal_String"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"), p0 + "");
    return n1;
  }
  private static SNode createGeneratorInternal_String_x583g4_a0a0a0a0r(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, "jetbrains.mps.build.mps.structure.GeneratorInternal_String"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0xd94b027412f0824L, 0xd94b027412f0827L, "path"), p0 + "");
    return n1;
  }
}
