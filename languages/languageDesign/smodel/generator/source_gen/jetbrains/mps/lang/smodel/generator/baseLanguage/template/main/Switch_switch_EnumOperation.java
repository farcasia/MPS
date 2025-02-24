package jetbrains.mps.lang.smodel.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateSwitchBase;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.impl.DismissTopMappingRuleException;
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;

@Generated
public class Switch_switch_EnumOperation extends TemplateSwitchBase implements TemplateSwitchMapping {
  private final Iterable<TemplateReductionRule> rules;
  public Switch_switch_EnumOperation() {
    rules = TemplateUtil.<TemplateReductionRule>asIterable(new Switch_switch_EnumOperation.ReductionRule0(), new Switch_switch_EnumOperation.ReductionRule1(), new Switch_switch_EnumOperation.ReductionRule2(), new Switch_switch_EnumOperation.ReductionRule3());
  }
  public SNodeReference getSwitchNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552946201");
  }
  public SNodeReference getModifiesSwitch() {
    return null;
  }
  public Iterable<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  public Collection<SNode> applyDefault(final TemplateExecutionEnvironment environment, SNodeReference templateSwitch, String mappingLabel, final TemplateContext context) throws GenerationException {
    DismissTopMappingRuleException ex_vpgdz1_a = new DismissTopMappingRuleException(DismissTopMappingRuleException.MessageType.error, "Unsupported enum operation");
    ex_vpgdz1_a.setTemplateContext(context);
    ex_vpgdz1_a.setTemplateModelLocation(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552952274"));
    throw ex_vpgdz1_a;
  }
  public void processNull(TemplateExecutionEnvironment environment, SNodeReference templateSwitch, TemplateContext context) {
  }
  public final class ReductionRule0 extends ReductionRuleBase {
    public ReductionRule0() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552951783"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e691L, "jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("2733396919552567794")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("1101499704720825413")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          SNode callInputNode2 = QueriesGenerated.sourceNodeQuery_6686995902560841967(new SourceSubstituteMacroNodeContext(context1, callMacro_r03umb_b0a0a1a3a2a1h));
          TemplateContext context2 = context1.subContext(null, callInputNode2);
          if (callInputNode2 != null) {
            tlist2 = new Template_reduce_EnumDeclaration_indentityValueSequence().apply(environment, context2);

          }
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
        {
          final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x3b418722717710b4L, "LongLiteral"));
          try {
            SNodeAccessUtil.setProperty(tnode4, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x3b418722717710b4L, 0x3b418722717710b5L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_2733396919553278889(new PropertyMacroContext(context1, "1L", propertyMacro_r03umb_c0a0c0a0b0e0c0b7))));
          } finally {
          }
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode4);
          // TODO validate child 
        }
        {
          Collection<SNode> tlist5 = null;
          if (QueriesGenerated.ifMacro_Condition_5374941486721969421(new IfMacroContext(context1, ifMacroRef_r03umb_b0a0b0f0c0b7))) {
            final SNode tnode6 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf93d565d10L, "StringLiteral"));
            try {
              SNodeAccessUtil.setProperty(tnode6, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_2733396919553278914(new PropertyMacroContext(context1, "v", propertyMacro_r03umb_c0a0c0a0b0b0f0c0b7))));
            } finally {
            }
            tlist5 = TemplateUtil.singletonList(tnode6);
          } else {
            final SNode tnode7 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940cd6167L, "NullLiteral"));
            try {
            } finally {
            }
            tlist5 = TemplateUtil.singletonList(tnode7);
          }
          for (SNode child8 : TemplateUtil.asNotNull(tlist5)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child8);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552952244"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e6b4L, "jetbrains.mps.lang.smodel.structure.SEnum_MembersOperation"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("2733396919552539316")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("1101499704720825413")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          SNode callInputNode2 = QueriesGenerated.sourceNodeQuery_3799973320546241361(new SourceSubstituteMacroNodeContext(context1, callMacro_r03umb_b0a0a1a3a2a1i));
          TemplateContext context2 = context1.subContext(null, callInputNode2);
          if (callInputNode2 != null) {
            tlist2 = new Template_reduce_EnumDeclaration_indentityValueSequence().apply(environment, context2);

          }
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
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552952250"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e60cL, "jetbrains.mps.lang.smodel.structure.SEnum_MemberForNameOperation"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("2733396919552563672")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("1101499704720825413")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          final SNode copySrcInput2 = QueriesGenerated.sourceNodeQuery_2733396919553294654(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_r03umb_b0a0c0d0c0b9));
          tlist2 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput2), copySrcMacro_r03umb_b0a0c0d0c0b9, "tpl/r:00000000-0000-4000-0000-011c89590303/2733396919553280458", context1);
          for (SNode child3 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child3);
          }
          // TODO validate child 
        }
        {
          Collection<SNode> tlist4 = null;
          SNode callInputNode4 = QueriesGenerated.sourceNodeQuery_6686995902560844508(new SourceSubstituteMacroNodeContext(context1, callMacro_r03umb_b0a0a1a4a2a1j));
          TemplateContext context2 = context1.subContext(null, callInputNode4);
          if (callInputNode4 != null) {
            tlist4 = new Template_reduce_EnumDeclaration_indentityValueSequence().apply(environment, context2);

          }
          for (SNode child5 : TemplateUtil.asNotNull(tlist4)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child5);
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
      super(new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919552952258"), MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x120ed37e64eL, "jetbrains.mps.lang.smodel.structure.SEnum_MemberForValueOperation"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfbbebabf09L, "StaticMethodCall"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("2733396919552565911")));
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L, 0x10a7588b546L, "classConcept"), tnode1, PersistenceFacade.getInstance().createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), PersistenceFacade.getInstance().createNodeId("1101499704720825413")));
        TemplateContext context1 = context.subContext();
        {
          Collection<SNode> tlist2 = null;
          if (QueriesGenerated.ifMacro_Condition_2733396919553298521(new IfMacroContext(context1, ifMacroRef_r03umb_b0a0b0d0c0b01))) {
            final SNode tnode3 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf8cc67c7fbL, "PlusExpression"));
            try {
              TemplateContext context2 = context1.subContext();
              {
                final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf93d565d10L, "StringLiteral"));
                try {
                  SNodeAccessUtil.setProperty(tnode4, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "");
                } finally {
                }
                tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), tnode4);
                // TODO validate child 
              }
              {
                Collection<SNode> tlist5 = null;
                final SNode copySrcInput5 = QueriesGenerated.sourceNodeQuery_2733396919553298547(new SourceSubstituteMacroNodeContext(context2, copySrcMacro_r03umb_b0a0c0c0b0b0d0c0b01));
                tlist5 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput5), copySrcMacro_r03umb_b0a0c0c0b0b0d0c0b01, "tpl/r:00000000-0000-4000-0000-011c89590303/2733396919553298545", context2);
                for (SNode child6 : TemplateUtil.asNotNull(tlist5)) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), child6);
                }
                // TODO validate child 
              }
            } finally {
            }
            tlist2 = TemplateUtil.singletonList(tnode3);
          } else {
            Collection<SNode> tlist7 = null;
            final SNode copySrcInput7 = QueriesGenerated.sourceNodeQuery_2733396919553298534(new SourceSubstituteMacroNodeContext(context1, copySrcMacro_r03umb_b0a0c0a1a3a2a1k));
            tlist7 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput7), copySrcMacro_r03umb_b0a0c0a1a3a2a1k, "tpl/r:00000000-0000-4000-0000-011c89590303/2733396919553298532", context1);
            tlist2 = tlist7;
          }
          for (SNode child8 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child8);
          }
          // TODO validate child 
        }
        {
          Collection<SNode> tlist9 = null;
          SNode callInputNode9 = QueriesGenerated.sourceNodeQuery_6686995902560845877(new SourceSubstituteMacroNodeContext(context1, callMacro_r03umb_b0a0a1a4a2a1k));
          TemplateContext context3 = context1.subContext(null, callInputNode9);
          if (callInputNode9 != null) {
            tlist9 = new Template_reduce_EnumDeclaration_indentityValueSequence().apply(environment, context3);

          }
          for (SNode child10 : TemplateUtil.asNotNull(tlist9)) {
            tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), child10);
          }
          // TODO validate child 
        }
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  private static SNodePointer callMacro_r03umb_b0a0a1a3a2a1h = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553278886");
  private static SNodePointer propertyMacro_r03umb_c0a0c0a0b0e0c0b7 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553278888");
  private static SNodePointer propertyMacro_r03umb_c0a0c0a0b0b0f0c0b7 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553278913");
  private static SNodePointer ifMacroRef_r03umb_b0a0b0f0c0b7 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "5374941486721969419");
  private static SNodePointer callMacro_r03umb_b0a0a1a3a2a1i = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "3799973320546241360");
  private static SNodePointer copySrcMacro_r03umb_b0a0c0d0c0b9 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553294540");
  private static SNodePointer callMacro_r03umb_b0a0a1a4a2a1j = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553280585");
  private static SNodePointer copySrcMacro_r03umb_b0a0c0c0b0b0d0c0b01 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553298546");
  private static SNodePointer ifMacroRef_r03umb_b0a0b0d0c0b01 = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553298520");
  private static SNodePointer copySrcMacro_r03umb_b0a0c0a1a3a2a1k = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553298533");
  private static SNodePointer callMacro_r03umb_b0a0a1a4a2a1k = new SNodePointer("r:00000000-0000-4000-0000-011c89590303(jetbrains.mps.lang.smodel.generator.baseLanguage.template.main@generator)", "2733396919553281070");
}
