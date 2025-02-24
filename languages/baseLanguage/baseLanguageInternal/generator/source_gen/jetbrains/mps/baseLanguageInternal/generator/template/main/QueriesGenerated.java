package jetbrains.mps.baseLanguageInternal.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguageInternal.generator.template.util.Flags;
import jetbrains.mps.generator.template.PropertyMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguageInternal.generator.template.util.ContextUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Map;
import jetbrains.mps.generator.impl.query.ReductionRuleCondition;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.template.ReductionRuleQueryContext;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.WeaveRuleCondition;
import jetbrains.mps.generator.impl.query.WeaveRuleQuery;
import jetbrains.mps.generator.impl.query.WeaveAnchorQuery;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.template.WeavingAnchorContext;
import jetbrains.mps.generator.impl.query.ScriptCodeBlock;
import jetbrains.mps.generator.impl.query.SourceNodeQuery;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.Collection;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import jetbrains.mps.generator.impl.query.ReferenceTargetQuery;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static boolean baseMappingRule_Condition_7805405506192340589(final BaseMappingRuleContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getNode(), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x38fdeea21cec83e5L, "nonStatic")));
  }
  public static boolean baseMappingRule_Condition_7805405506192340615(final BaseMappingRuleContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x38fdeea21cec83e5L, "nonStatic"));
  }
  public static boolean baseMappingRule_Condition_5546896804536307549(final BaseMappingRuleContext _context) {
    return Flags.EXTRACT_STATEMENTS.isFlagged(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_1238251891480(final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(_context.getNode(), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x7a9f3e4819fe50ffL, "makeUnique"))) {
      SNode context = ContextUtil.getContextForConstant(_context, _context.getNode(), true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x1204d89aadaL, "fieldName")), context);
    }
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x1204d89aadaL, "fieldName"));
  }
  public static Object propertyMacro_GetPropertyValue_8733626498296662444(final PropertyMacroContext _context) {
    SNode esm = SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression"));
    if (SPropertyOperations.getBoolean(esm, MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, 0x7934130707e86393L, "makeUnique"))) {
      SNode context = ContextUtil.getContextForMethod(_context, esm, true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), context);
    }
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5822086619725756114(final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression")), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x6b63d434472420e6L, "makeUnique"))) {
      SNode context = ContextUtil.getContextForInnerClass(_context, SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression")), true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), context);
    }
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_7805405506192339138(final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression")), MetaAdapterFactory.getProperty(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x6b63d434472420e6L, "makeUnique"))) {
      SNode context = ContextUtil.getContextForInnerClass(_context, SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression")), true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), context);
    }
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8791205313600587351(final PropertyMacroContext _context) {
    return (String) INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x7a00a2a7a8b080daL, 0x7a00a2a7a8b080dbL, "classifier")));
  }
  public static Object referenceMacro_GetReferent_8567847449660562845(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ExtractToField");
  }
  public static Object referenceMacro_GetReferent_99767819676012224(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x162724dabcdc671L, 0x162724dabcdc672L, "original")), "ExtractToField");
  }
  public static Object referenceMacro_GetReferent_8881995820265485461(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")), "ExtractedMeth");
  }
  public static Object referenceMacro_GetReferent_5822086619725756473(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")), "ExtractedCtor");
  }
  public static boolean ifMacro_Condition_8567847449660562851(final IfMacroContext _context) {
    return true;
  }
  public static boolean ifMacro_Condition_3136320261568143563(final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b204L, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"));
  }
  public static boolean ifMacro_Condition_3136320261568096497(final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b204L, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"));
  }
  public static SNode sourceNodeQuery_8733626498296395211(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L, 0x2c5dbc7b7630f550L, "innerExpr")), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b763512c9L, 0x2c5dbc7b763512caL, "inner"));
  }
  public static SNode sourceNodeQuery_1822032100475268596(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, 0x31c3f88088ea0ac5L, "inner"));
  }
  public static SNode sourceNodeQuery_5822086619725756459(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x6b63d434472420ceL, "inner"));
  }
  public static SNode sourceNodeQuery_1585405235656404797(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x16007da97856bd8aL, 0x16007da97856bd8bL, "constant")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer"));
  }
  public static SNode sourceNodeQuery_1238251880657(final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x1204d89beb2L, "expression")));
  }
  public static SNode sourceNodeQuery_1238251903567(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x1204d897032L, 0x1204d89beb2L, "expression"));
  }
  public static SNode sourceNodeQuery_8733626498296637791(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType"));
  }
  public static SNode sourceNodeQuery_8733626498296662866(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
  }
  public static SNode sourceNodeQuery_4662313646679725670(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1ffL, "body"));
  }
  public static SNode sourceNodeQuery_8733626498296662888(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x31c3f88088ea0ac4L, 0x31c3f88088ea0ac6L, "method"));
  }
  public static SNode sourceNodeQuery_5822086619725756099(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
  }
  public static SNode sourceNodeQuery_5822086619725756086(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x6b63d4344723dac9L, "innerClass"));
  }
  public static SNode sourceNodeQuery_5822086619725756147(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass"));
  }
  public static SNode sourceNodeQuery_7805405506192339112(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"));
  }
  public static SNode sourceNodeQuery_7805405506192339131(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x6b63d4344723dac8L, 0x6b63d4344723dac9L, "innerClass"));
  }
  public static SNode sourceNodeQuery_7805405506192339187(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass"));
  }
  public static Iterable<SNode> sourceNodesQuery_7905975464767281412(final SourceSubstituteMacroNodesContext _context) {
    List<SNode> stlist = new ArrayList<SNode>();
    for (SNode exl : SNodeOperations.getNodeDescendants(_context.getNode(), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression"), false, new SAbstractConcept[]{})) {
      if ((SLinkOperations.getTarget(exl, MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L, 0x2c5dbc7b762fdcf9L, "stmts")) != null)) {
        ListSequence.fromList(stlist).addSequence(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(exl, MetaAdapterFactory.getContainmentLink(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L, 0x2c5dbc7b762fdcf9L, "stmts")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))));
      }
    }
    ListSequence.fromList(stlist).addElement(_context.getNode());
    return stlist;
  }
  public static Iterable<SNode> sourceNodesQuery_8881995820265483078(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"));
  }
  public static Iterable<SNode> sourceNodesQuery_5822086619725756498(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"));
  }
  public static Iterable<SNode> sourceNodesQuery_8733626498296662462(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1feL, "parameter"));
  }
  public static Iterable<SNode> sourceNodesQuery_8733626498296662815(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0x10f383d6949L, "throwsItem"));
  }
  public static Iterable<SNode> sourceNodesQuery_2118978533621033533(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102463b447aL, 0x102463bb98eL, "typeVariableDeclaration"));
  }
  public static Iterable<SNode> sourceNodesQuery_3136320261568143549(final SourceSubstituteMacroNodesContext _context) {
    return (Iterable<SNode>) Classifier__BehaviorDescriptor.members_id1hodSy8nQmC.invoke(_context.getNode());
  }
  public static Iterable<SNode> sourceNodesQuery_5822086619725756164(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0xff2ac0b419L, "implementedInterface"));
  }
  public static Iterable<SNode> sourceNodesQuery_3136320261568118134(final SourceSubstituteMacroNodesContext _context) {
    return (Iterable<SNode>) Classifier__BehaviorDescriptor.members_id1hodSy8nQmC.invoke(_context.getNode());
  }
  public static Iterable<SNode> sourceNodesQuery_7805405506192339195(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0xff2ac0b419L, "implementedInterface"));
  }
  public static SNode weaving_MappingRule_ContextNodeQuery_5822086619725756049(final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForInnerClass(_context, _context.getNode(), false);
  }
  public static SNode weaving_MappingRule_ContextNodeQuery_7805405506192340587(final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForInnerClass(_context, _context.getNode(), false);
  }
  public static SNode weaving_MappingRule_ContextNodeQuery_8881995820265482161(final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForMethod(_context, _context.getNode(), false);
  }
  public static SNode weaving_MappingRule_ContextNodeQuery_1238251595165(final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForConstant(_context, _context.getNode(), true);
  }
  public static void mappingScript_CodeBlock_5546896804536307448(final MappingScriptContext _context) {
    for (SNode nn : SModelOperations.nodes(_context.getModel(), MetaAdapterFactory.getConcept(0xdf345b11b8c74213L, 0xac6648d2a9b75d88L, 0x2c5dbc7b762fd2a7L, "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression"))) {
      List<SNode> all = SNodeOperations.getNodeAncestors(nn, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"), false);
      for (SNode statement : all) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(statement), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"))) {
          Flags.EXTRACT_STATEMENTS.flag(statement);
          break;
        }
      }
    }
  }
  private final Map<String, ReductionRuleCondition> rrcMethods = new HashMap<String, ReductionRuleCondition>();
  {
    int i = 0;
    rrcMethods.put("5546896804536307526", new QueriesGenerated.RRC(i++));
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
          return QueriesGenerated.baseMappingRule_Condition_5546896804536307549(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, QueriesGenerated.WRQ> wrcnMethods = new HashMap<String, QueriesGenerated.WRQ>();
  {
    int i = 0;
    wrcnMethods.put("5822086619725756047", new QueriesGenerated.WRQ(i++));
    wrcnMethods.put("7805405506192340585", new QueriesGenerated.WRQ(i++));
    wrcnMethods.put("8881995820265482159", new QueriesGenerated.WRQ(i++));
    wrcnMethods.put("1238251595163", new QueriesGenerated.WRQ(i++));
  }
  @Override
  @NotNull
  public WeaveRuleCondition getWeaveRuleCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(wrcnMethods.containsKey(id))) {
      return super.getWeaveRuleCondition(identity);
    }
    return wrcnMethods.get(id);
  }
  @Override
  @NotNull
  public WeaveRuleQuery getWeaveRuleQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(wrcnMethods.containsKey(id))) {
      return super.getWeaveRuleQuery(identity);
    }
    return wrcnMethods.get(id);
  }
  @NotNull
  @Override
  public WeaveAnchorQuery getWeaveAnchorQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(wrcnMethods.containsKey(id))) {
      return super.getWeaveAnchorQuery(identity);
    }
    return wrcnMethods.get(id);
  }
  private static class WRQ implements WeaveRuleQuery, WeaveRuleCondition, WeaveAnchorQuery {
    private final int methodKey;
    public WRQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull WeavingMappingRuleContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.baseMappingRule_Condition_7805405506192340589(ctx);
        case 1:
          return QueriesGenerated.baseMappingRule_Condition_7805405506192340615(ctx);
        case 2:
          return true;
        case 3:
          return true;
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
    @Override
    public SNode contextNode(WeavingMappingRuleContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.weaving_MappingRule_ContextNodeQuery_5822086619725756049(ctx);
        case 1:
          return QueriesGenerated.weaving_MappingRule_ContextNodeQuery_7805405506192340587(ctx);
        case 2:
          return QueriesGenerated.weaving_MappingRule_ContextNodeQuery_8881995820265482161(ctx);
        case 3:
          return QueriesGenerated.weaving_MappingRule_ContextNodeQuery_1238251595165(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no context node query method for weaving rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }

    }
    @Nullable
    @Override
    public SNode anchorNode(WeavingAnchorContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return null;
        case 1:
          return null;
        case 2:
          return null;
        case 3:
          return null;
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no anchor query method for rule %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ScriptCodeBlock> mscbMethods = new HashMap<String, ScriptCodeBlock>();
  {
    int i = 0;
    mscbMethods.put("5546896804536307447", new QueriesGenerated.SCB(i++));
  }
  @Override
  @NotNull
  public ScriptCodeBlock getScriptCodeBlock(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(mscbMethods.containsKey(id))) {
      return super.getScriptCodeBlock(identity);
    }
    return mscbMethods.get(id);
  }
  private static class SCB implements ScriptCodeBlock {
    private final int methodKey;
    public SCB(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public void invoke(MappingScriptContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          QueriesGenerated.mappingScript_CodeBlock_5546896804536307448(ctx);
          return;
        default:
          throw new GenerationFailureException(String.format("There's no code block with method index %d ", methodKey));
      }
    }
  }
  private final Map<String, SourceNodeQuery> snqMethods = new HashMap<String, SourceNodeQuery>();
  {
    int i = 0;
    snqMethods.put("8733626498296395211", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1822032100475268596", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5822086619725756459", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1585405235656404797", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1238251880657", new QueriesGenerated.SNQ(i++));
    snqMethods.put("1238251903567", new QueriesGenerated.SNQ(i++));
    snqMethods.put("8733626498296637791", new QueriesGenerated.SNQ(i++));
    snqMethods.put("8733626498296662866", new QueriesGenerated.SNQ(i++));
    snqMethods.put("4662313646679725670", new QueriesGenerated.SNQ(i++));
    snqMethods.put("8733626498296662888", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5822086619725756099", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5822086619725756086", new QueriesGenerated.SNQ(i++));
    snqMethods.put("5822086619725756147", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7805405506192339112", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7805405506192339131", new QueriesGenerated.SNQ(i++));
    snqMethods.put("7805405506192339187", new QueriesGenerated.SNQ(i++));
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
          return QueriesGenerated.sourceNodeQuery_8733626498296395211(ctx);
        case 1:
          return QueriesGenerated.sourceNodeQuery_1822032100475268596(ctx);
        case 2:
          return QueriesGenerated.sourceNodeQuery_5822086619725756459(ctx);
        case 3:
          return QueriesGenerated.sourceNodeQuery_1585405235656404797(ctx);
        case 4:
          return QueriesGenerated.sourceNodeQuery_1238251880657(ctx);
        case 5:
          return QueriesGenerated.sourceNodeQuery_1238251903567(ctx);
        case 6:
          return QueriesGenerated.sourceNodeQuery_8733626498296637791(ctx);
        case 7:
          return QueriesGenerated.sourceNodeQuery_8733626498296662866(ctx);
        case 8:
          return QueriesGenerated.sourceNodeQuery_4662313646679725670(ctx);
        case 9:
          return QueriesGenerated.sourceNodeQuery_8733626498296662888(ctx);
        case 10:
          return QueriesGenerated.sourceNodeQuery_5822086619725756099(ctx);
        case 11:
          return QueriesGenerated.sourceNodeQuery_5822086619725756086(ctx);
        case 12:
          return QueriesGenerated.sourceNodeQuery_5822086619725756147(ctx);
        case 13:
          return QueriesGenerated.sourceNodeQuery_7805405506192339112(ctx);
        case 14:
          return QueriesGenerated.sourceNodeQuery_7805405506192339131(ctx);
        case 15:
          return QueriesGenerated.sourceNodeQuery_7805405506192339187(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("7905975464767281412", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("8881995820265483078", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("5822086619725756498", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("8733626498296662462", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("8733626498296662815", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("2118978533621033533", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("3136320261568143549", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("5822086619725756164", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("3136320261568118134", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("7805405506192339195", new QueriesGenerated.SNsQ(i++));
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
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_7905975464767281412(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_8881995820265483078(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_5822086619725756498(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_8733626498296662462(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_8733626498296662815(ctx));
        case 5:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2118978533621033533(ctx));
        case 6:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_3136320261568143549(ctx));
        case 7:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_5822086619725756164(ctx));
        case 8:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_3136320261568118134(ctx));
        case 9:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_7805405506192339195(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("1238251891479", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "FIELD"));
    pvqMethods.put("8733626498296662443", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "METHOD"));
    pvqMethods.put("5822086619725756113", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "custom"));
    pvqMethods.put("7805405506192339137", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "custom"));
    pvqMethods.put("8791205313600587350", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "class.name"));
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
          return QueriesGenerated.propertyMacro_GetPropertyValue_1238251891480(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_8733626498296662444(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetPropertyValue_5822086619725756114(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetPropertyValue_7805405506192339138(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetPropertyValue_8791205313600587351(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("8567847449660562850", new QueriesGenerated.IfMC(i++));
    imcMethods.put("3136320261568143555", new QueriesGenerated.IfMC(i++));
    imcMethods.put("3136320261568096495", new QueriesGenerated.IfMC(i++));
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
          return QueriesGenerated.ifMacro_Condition_8567847449660562851(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_3136320261568143563(ctx);
        case 2:
          return QueriesGenerated.ifMacro_Condition_3136320261568096497(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ReferenceTargetQuery> rtqMethods = new HashMap<String, ReferenceTargetQuery>();
  {
    rtqMethods.put("8567847449660562844", new QueriesGenerated.RTQ(0, null));
    rtqMethods.put("99767819676012223", new QueriesGenerated.RTQ(1, null));
    rtqMethods.put("8881995820265485460", new QueriesGenerated.RTQ(2, null));
    rtqMethods.put("5822086619725756472", new QueriesGenerated.RTQ(3, null));
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
          return QueriesGenerated.referenceMacro_GetReferent_8567847449660562845(ctx);
        case 1:
          return QueriesGenerated.referenceMacro_GetReferent_99767819676012224(ctx);
        case 2:
          return QueriesGenerated.referenceMacro_GetReferent_8881995820265485461(ctx);
        case 3:
          return QueriesGenerated.referenceMacro_GetReferent_5822086619725756473(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
}
