package jetbrains.mps.baseLanguage.classifiers.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Map;
import jetbrains.mps.generator.impl.query.ReductionRuleCondition;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.template.ReductionRuleQueryContext;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.MapConfigurationCondition;
import jetbrains.mps.generator.impl.query.SourceNodeQuery;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.Collection;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.generator.impl.query.ReferenceTargetQuery;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static boolean baseMappingRule_Condition_1029302639053656988(final BaseMappingRuleContext _context) {
    return (SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0xe48d14bf726e967L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier"), false, false) != null);
  }
  public static boolean baseMappingRule_Condition_1029302639053657563(final BaseMappingRuleContext _context) {
    return (SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0xe48d14bf726e967L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier"), false, false) != null);
  }
  public static boolean baseMappingRule_Condition_1029302639053657573(final BaseMappingRuleContext _context) {
    return (SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0xe48d14bf726e967L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier"), false, false) != null);
  }
  public static boolean baseMappingRule_Condition_1029302639053657583(final BaseMappingRuleContext _context) {
    return (SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0xe48d14bf726e967L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier"), false, false) != null);
  }
  public static Object propertyMacro_GetPropertyValue_1205839158549(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_1214000545856(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5211959367043582897(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bca97396L, 0x118bcb657ecL, "member")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object referenceMacro_GetReferent_1029302639053561728(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bca97396L, 0x118bcb657ecL, "member")), "map_ClassifierField");
  }
  public static SNode sourceNodeQuery_1205839150885(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"));
  }
  public static SNode sourceNodeQuery_1205839142188(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
  }
  public static SNode sourceNodeQuery_1205839180997(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"));
  }
  public static SNode sourceNodeQuery_1214005141189(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
  }
  public static SNode sourceNodeQuery_1214004231654(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"));
  }
  public static SNode sourceNodeQuery_1214001997064(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer"));
  }
  public static SNode sourceNodeQuery_5211959367043582924(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bca97396L, 0x118bcb657ecL, "member")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"));
  }
  public static Iterable<SNode> sourceNodesQuery_1205839173800(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"));
  }
  public static Iterable<SNode> sourceNodesQuery_1221310523876(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation"));
  }
  public static Iterable<SNode> sourceNodesQuery_2922006788899445646(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0x10f383d6949L, "throwsItem"));
  }
  public static Iterable<SNode> sourceNodesQuery_6720970695571357581(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"));
  }
  public static Iterable<SNode> sourceNodesQuery_1221310499193(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a6be947aL, 0x114a6beb0bdL, "annotation"));
  }
  public static Iterable<SNode> sourceNodesQuery_5211959367043582912(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bd711e29L, 0x118bd877799L, "actualArgument"));
  }
  public static boolean mappingConfiguration_Condition_2948912184536575088(final TemplateQueryContext _context) {
    return ListSequence.fromList(SModelOperations.nodes(_context.getInputModel(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0xe48d14bf726e967L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier"))).isNotEmpty();
  }
  private final Map<String, ReductionRuleCondition> rrcMethods = new HashMap<String, ReductionRuleCondition>();
  {
    int i = 0;
    rrcMethods.put("1029302639053591512", new QueriesGenerated.RRC(i++));
    rrcMethods.put("1029302639053591514", new QueriesGenerated.RRC(i++));
    rrcMethods.put("1029302639053591516", new QueriesGenerated.RRC(i++));
    rrcMethods.put("1029302639053591518", new QueriesGenerated.RRC(i++));
  }
  @Override
  @NotNull
  public ReductionRuleCondition getReductionRuleCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(rrcMethods.containsKey(id))) {
      return super.getReductionRuleCondition(identity);
    }
    return rrcMethods.get(id);
  }
  private static class RRC implements ReductionRuleCondition {
    private final int methodKey;
    public RRC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(ReductionRuleQueryContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.baseMappingRule_Condition_1029302639053656988(ctx);
        case 1:
          return QueriesGenerated.baseMappingRule_Condition_1029302639053657563(ctx);
        case 2:
          return QueriesGenerated.baseMappingRule_Condition_1029302639053657573(ctx);
        case 3:
          return QueriesGenerated.baseMappingRule_Condition_1029302639053657583(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, MapConfigurationCondition> mccMethods = new HashMap<String, MapConfigurationCondition>();
  {
    int i = 0;
    mccMethods.put("1029302639053435662", new QueriesGenerated.MCC(i++));
  }
  @Override
  @NotNull
  public MapConfigurationCondition getMapConfigurationCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(mccMethods.containsKey(id))) {
      return super.getMapConfigurationCondition(identity);
    }
    return mccMethods.get(id);
  }
  private static class MCC implements MapConfigurationCondition {
    private final int methodKey;
    public MCC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(TemplateQueryContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.mappingConfiguration_Condition_2948912184536575088(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for map configuration %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodeQuery> snqMethods = new HashMap<String, SourceNodeQuery>();
  {
    int i = 0;
    snqMethods.put("1205839150885", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1205839142188", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1205839180997", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1214005141189", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1214004231654", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1214001997064", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5211959367043582924", new QueriesGenerated.SNQ(i++));
  }
  @NotNull
  @Override
  public SourceNodeQuery getSourceNodeQuery(@NotNull QueryKey identity) {
    final String id = ((QueryKeyImpl) identity).getQueryNodeId().toString();
    if (!(snqMethods.containsKey(id))) {
      return super.getSourceNodeQuery(identity);
    }
    return snqMethods.get(id);
  }
  private static class SNQ implements SourceNodeQuery {
    private final int methodKey;
    public SNQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public SNode evaluate(@NotNull SourceSubstituteMacroNodeContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.sourceNodeQuery_1205839150885(ctx);
        case 1:
          return QueriesGenerated.sourceNodeQuery_1205839142188(ctx);
        case 2:
          return QueriesGenerated.sourceNodeQuery_1205839180997(ctx);
        case 3:
          return QueriesGenerated.sourceNodeQuery_1214005141189(ctx);
        case 4:
          return QueriesGenerated.sourceNodeQuery_1214004231654(ctx);
        case 5:
          return QueriesGenerated.sourceNodeQuery_1214001997064(ctx);
        case 6:
          return QueriesGenerated.sourceNodeQuery_5211959367043582924(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("1205839173800", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("1221310523876", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("2922006788899445646", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("6720970695571357581", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("1221310499193", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("5211959367043582912", new QueriesGenerated.SNsQ(i++));
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
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1205839173800(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1221310523876(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2922006788899445646(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_6720970695571357581(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1221310499193(ctx));
        case 5:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_5211959367043582912(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("1205839158548", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "method"));
    pvqMethods.put("1214000545855", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "abc"));
    pvqMethods.put("5211959367043582896", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1116962fa68L, 0x1116964d747L, "methodName"), "methodName"));
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
          return QueriesGenerated.propertyMacro_GetPropertyValue_1205839158549(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_1214000545856(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetPropertyValue_5211959367043582897(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ReferenceTargetQuery> rtqMethods = new HashMap<String, ReferenceTargetQuery>();
  {
    rtqMethods.put("1029302639053561727", new QueriesGenerated.RTQ(0, "field"));
  }
  @NotNull
  @Override
  public ReferenceTargetQuery getReferenceTargetQuery(@NotNull QueryKey queryKey) {
    final String id = queryKey.getTemplateNode().getNodeId().toString();
    if (!(rtqMethods.containsKey(id))) {
      return super.getReferenceTargetQuery(queryKey);
    }
    return rtqMethods.get(id);
  }
  private static class RTQ extends ReferenceTargetQuery.Base {
    private final int methodKey;
    /*package*/ RTQ(int methodKey, String templateValue) {
      super(templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull ReferenceMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.referenceMacro_GetReferent_1029302639053561728(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
}
