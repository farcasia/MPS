package jetbrains.mps.lang.smodel.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.MapConfigBase;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import jetbrains.mps.generator.runtime.TemplateRuleWithCondition;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.ReductionRuleQueryContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

@Generated
public class Mapping_mc_reflection extends MapConfigBase implements TemplateMappingConfiguration {
  private final Collection<TemplateReductionRule> rules;
  public Mapping_mc_reflection(@NotNull TemplateModel model) {
    super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5692182839348358131"), "mc_reflection", model, false);
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mapping_mc_reflection.ReductionRule0(), new Mapping_mc_reflection.ReductionRule1(), new Mapping_mc_reflection.ReductionRule2(), new Mapping_mc_reflection.ReductionRule3(), new Mapping_mc_reflection.ReductionRule4(), new Mapping_mc_reflection.ReductionRule5());
  }
  @Override
  public boolean isApplicable(@NotNull ITemplateGenerator generator) {
    return QueriesGenerated.mappingConfiguration_Condition_3624172675691970307(new TemplateQueryContext(getMappingNode(), generator));
  }
  @Override
  public Collection<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  public final class ReductionRule0 extends ReductionRuleBase implements TemplateRuleWithCondition {
    public ReductionRule0() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "6409763769033721790"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"), true);
    }
    @Override
    public boolean isApplicable(@NotNull TemplateContext context) throws GenerationException {
      return QueriesGenerated.baseMappingRule_Condition_6409763769033724373(new ReductionRuleQueryContext(context, getRuleNode()));
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      final SNode copySrcInput1 = QueriesGenerated.sourceNodeQuery_9203425869795792358(new SourceSubstituteMacroNodeContext(context, copySrcMacro_yrbd5d_b0a0d0c4));
      tlist1 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput1), copySrcMacro_yrbd5d_b0a0d0c4, "tpl/r:00000000-0000-4000-0000-011c89590303/9203425869795792356", context);
      return tlist1;
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5692182839348392789"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x393cc52c868a600aL, "jetbrains.mps.lang.smodel.structure.Reference_GetTargetOperation"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286857")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286349")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_6253932327129588408(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_yrbd5d_b0a0c0d0c0b5));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_yrbd5d_b0a0c0d0c0b5, "tpl/r:00000000-0000-4000-0000-011c89590303/6253932327129588405", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule2 extends ReductionRuleBase {
    public ReductionRule2() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5692182839348392791"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x157abf675bd53debL, "jetbrains.mps.lang.smodel.structure.Reference_GetLinkDeclarationOperation"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286824")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286349")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_6253932327129609777(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_yrbd5d_b0a0c0d0c0b6));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_yrbd5d_b0a0c0d0c0b6, "tpl/r:00000000-0000-4000-0000-011c89590303/6253932327129609774", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule3 extends ReductionRuleBase {
    public ReductionRule3() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2926695023085820535"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x289db59e00eee79dL, "jetbrains.mps.lang.smodel.structure.Reference_ContainingLinkOperation"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("2926695023085831496")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286349")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_2926695023085834539(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_yrbd5d_b0a0c0d0c0b7));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_yrbd5d_b0a0c0d0c0b7, "tpl/r:00000000-0000-4000-0000-011c89590303/2926695023085834537", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule4 extends ReductionRuleBase {
    public ReductionRule4() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5692182839349415250"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x4efeb22247ff02a7L, "jetbrains.mps.lang.smodel.structure.Reference_GetRoleOperation"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286874")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286349")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_6253932327129609793(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_yrbd5d_b0a0c0d0c0b8));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_yrbd5d_b0a0c0d0c0b8, "tpl/r:00000000-0000-4000-0000-011c89590303/6253932327129609790", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule5 extends ReductionRuleBase {
    public ReductionRule5() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5708036808576088298"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x4f37053c240837e1L, "jetbrains.mps.lang.smodel.structure.Reference_GetResolveInfo"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286891")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("6599163591527286349")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_2071115835942461387(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_yrbd5d_b0a0c0d0c0b9));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_yrbd5d_b0a0c0d0c0b9, "tpl/r:00000000-0000-4000-0000-011c89590303/2071115835942461384", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  private static SNodePointer copySrcMacro_yrbd5d_b0a0d0c4 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "9203425869795792357");
  private static SNodePointer copySrcMacro_yrbd5d_b0a0c0d0c0b5 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "6253932327129588407");
  private static SNodePointer copySrcMacro_yrbd5d_b0a0c0d0c0b6 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "6253932327129609776");
  private static SNodePointer copySrcMacro_yrbd5d_b0a0c0d0c0b7 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2926695023085834538");
  private static SNodePointer copySrcMacro_yrbd5d_b0a0c0d0c0b8 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "6253932327129609792");
  private static SNodePointer copySrcMacro_yrbd5d_b0a0c0d0c0b9 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2071115835942461386");
}
