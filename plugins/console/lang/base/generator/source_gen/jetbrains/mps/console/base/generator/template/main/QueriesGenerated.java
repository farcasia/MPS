package jetbrains.mps.console.base.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.console.base.generator.util.CommandUtilChooserHelper;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.ReductionRuleCondition;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.template.ReductionRuleQueryContext;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.SourceNodeQuery;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.Collection;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.generator.impl.query.InlineSwitchCaseCondition;
import jetbrains.mps.generator.template.InlineSwitchCaseContext;
import jetbrains.mps.generator.impl.query.ReferenceTargetQuery;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static boolean baseMappingRule_Condition_3395429865810138642(final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"))), _quotation_createNode_x583g4_b0a0a1());
  }
  public static boolean baseMappingRule_Condition_7600370246419375459(final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"))), _quotation_createNode_x583g4_b0a0a2());
  }
  public static boolean baseMappingRule_Condition_7600370246421231722(final BaseMappingRuleContext _context) {
    return CommandUtilChooserHelper.isSModelSequence(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object")));
  }
  public static boolean baseMappingRule_Condition_3856122757887589572(final BaseMappingRuleContext _context) {
    SNode functionType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"))), HUtil.createMatchingPatternByConcept(MetaAdapterFactory.getConcept(0xfd3920347849419dL, 0x907112563d152375L, 0x1174a4d19ffL, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")), false);
    return functionType != null;
  }
  public static boolean baseMappingRule_Condition_3786816536599965790(final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getNodeDescendants(_context.getNode(), MetaAdapterFactory.getConcept(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6979f0787b2a9377L, "jetbrains.mps.console.base.structure.PrintExpression"), false, new SAbstractConcept[]{})).isEmpty();
  }
  public static Object propertyMacro_GetPropertyValue_6690111761723079789(final PropertyMacroContext _context) {
    return "closure : " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"))));
  }
  public static Object propertyMacro_GetPropertyValue_9010839353952736697(final PropertyMacroContext _context) {
    return CommandUtilChooserHelper.getKindLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object")), _context);
  }
  public static Object referenceMacro_GetReferent_6164634611270886092(final ReferenceMacroContext _context) {
    return CommandUtilChooserHelper.chooseToResultMethod(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object")), _context);
  }
  public static Object referenceMacro_GetReferent_6164634611270907798(final ReferenceMacroContext _context) {
    return CommandUtilChooserHelper.chooseGetReferenceMethod(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object")), _context);
  }
  public static SNode sourceNodeQuery_1583916890562946186(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x15fb34051f725a2cL, 0x15fb34051f725bb1L, "commandHolder")), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x4e27160acb4484bL, 0x4e27160acb44924L, "command"));
  }
  public static SNode sourceNodeQuery_7600370246429485751(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6a40a3596560a9d9L, 0x6a40a3596560aa42L, "expression"));
  }
  public static SNode sourceNodeQuery_3395429865810287239(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_9010839353951768772(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_7600370246429334103(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_7600370246419387223(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_6134217374019005717(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_4598452390226163566(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_3501374812261883521(final SourceSubstituteMacroNodeContext _context) {
    return CommandUtilChooserHelper.getReferenceType(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object")), _context);
  }
  public static SNode sourceNodeQuery_3567142084943328805(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static SNode sourceNodeQuery_5510759644748879578(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x6c8954f469a7c420L, 0x7417cca3eb1ff761L, "object"));
  }
  public static Iterable<SNode> sourceNodesQuery_5336086527852932024(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xde1ad86d6e504a02L, 0xb306d4d17f64c375L, 0x4bd43869e610f3e9L, 0x188f8efcef6cea65L, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"));
  }
  private final Map<String, ReductionRuleCondition> rrcMethods = new HashMap<String, ReductionRuleCondition>();
  {
    int i = 0;
    rrcMethods.put("7600370246419375391", new QueriesGenerated.RRC(i++));
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
          return QueriesGenerated.baseMappingRule_Condition_3786816536599965790(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodeQuery> snqMethods = new HashMap<String, SourceNodeQuery>();
  {
    int i = 0;
    snqMethods.put("1583916890562946186", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7600370246429485751", new QueriesGenerated.SNQ(i++));
    snqMethods.put("3395429865810287239", new QueriesGenerated.SNQ(i++));
    snqMethods.put("9010839353951768772", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7600370246429334103", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7600370246419387223", new QueriesGenerated.SNQ(i++));
    snqMethods.put("6134217374019005717", new QueriesGenerated.SNQ(i++));
    snqMethods.put("4598452390226163566", new QueriesGenerated.SNQ(i++));
    snqMethods.put("3501374812261883521", new QueriesGenerated.SNQ(i++));
    snqMethods.put("3567142084943328805", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5510759644748879578", new QueriesGenerated.SNQ(i++));
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
          return QueriesGenerated.sourceNodeQuery_1583916890562946186(ctx);
        case 1:
          return QueriesGenerated.sourceNodeQuery_7600370246429485751(ctx);
        case 2:
          return QueriesGenerated.sourceNodeQuery_3395429865810287239(ctx);
        case 3:
          return QueriesGenerated.sourceNodeQuery_9010839353951768772(ctx);
        case 4:
          return QueriesGenerated.sourceNodeQuery_7600370246429334103(ctx);
        case 5:
          return QueriesGenerated.sourceNodeQuery_7600370246419387223(ctx);
        case 6:
          return QueriesGenerated.sourceNodeQuery_6134217374019005717(ctx);
        case 7:
          return QueriesGenerated.sourceNodeQuery_4598452390226163566(ctx);
        case 8:
          return QueriesGenerated.sourceNodeQuery_3501374812261883521(ctx);
        case 9:
          return QueriesGenerated.sourceNodeQuery_3567142084943328805(ctx);
        case 10:
          return QueriesGenerated.sourceNodeQuery_5510759644748879578(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("5336086527852932024", new QueriesGenerated.SNsQ(i++));
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
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_5336086527852932024(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("6690111761723079788", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), null));
    pvqMethods.put("9010839353952736696", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), ""));
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
          return QueriesGenerated.propertyMacro_GetPropertyValue_6690111761723079789(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_9010839353952736697(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, InlineSwitchCaseCondition> isccMethods = new HashMap<String, InlineSwitchCaseCondition>();
  {
    int i = 0;
    isccMethods.put("3395429865810138444", new QueriesGenerated.ISCC(i++));
    isccMethods.put("7600370246419375458", new QueriesGenerated.ISCC(i++));
    isccMethods.put("7600370246421231721", new QueriesGenerated.ISCC(i++));
    isccMethods.put("3856122757887589374", new QueriesGenerated.ISCC(i++));
  }
  @NotNull
  @Override
  public InlineSwitchCaseCondition getInlineSwitchCaseCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(isccMethods.containsKey(id))) {
      return super.getInlineSwitchCaseCondition(identity);
    }
    return isccMethods.get(id);
  }
  private static class ISCC implements InlineSwitchCaseCondition {
    private final int methodKey;
    public ISCC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull InlineSwitchCaseContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.baseMappingRule_Condition_3395429865810138642(ctx);
        case 1:
          return QueriesGenerated.baseMappingRule_Condition_7600370246419375459(ctx);
        case 2:
          return QueriesGenerated.baseMappingRule_Condition_7600370246421231722(ctx);
        case 3:
          return QueriesGenerated.baseMappingRule_Condition_3856122757887589572(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for inline switch's case %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ReferenceTargetQuery> rtqMethods = new HashMap<String, ReferenceTargetQuery>();
  {
    rtqMethods.put("6164634611270886091", new QueriesGenerated.RTQ(0, "nodesToResults"));
    rtqMethods.put("6164634611270907797", new QueriesGenerated.RTQ(1, "getNodeReference"));
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
          return QueriesGenerated.referenceMacro_GetReferent_6164634611270886092(ctx);
        case 1:
          return QueriesGenerated.referenceMacro_GetReferent_6164634611270907798(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private static SNode _quotation_createNode_x583g4_b0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc6bf96dL, "VoidType"), null, null, false);
    return quotedNode_1;
  }
  private static SNode _quotation_createNode_x583g4_b0a0a2() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"), 0x108f968b3caL, "SNodeType"), null, null, false);
    return quotedNode_1;
  }
}
