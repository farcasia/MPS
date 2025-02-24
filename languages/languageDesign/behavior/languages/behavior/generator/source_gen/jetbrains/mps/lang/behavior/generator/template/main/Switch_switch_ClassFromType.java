package jetbrains.mps.lang.behavior.generator.template.main;

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
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.reference.RefResolver;
import java.util.Collections;

@Generated
public class Switch_switch_ClassFromType extends TemplateSwitchBase implements TemplateSwitchMapping {
  private final Iterable<TemplateReductionRule> rules;
  public Switch_switch_ClassFromType() {
    rules = TemplateUtil.<TemplateReductionRule>asIterable(new Switch_switch_ClassFromType.ReductionRule0(), new Switch_switch_ClassFromType.ReductionRule1(), new Switch_switch_ClassFromType.ReductionRule2(), new Switch_switch_ClassFromType.ReductionRule3(), new Switch_switch_ClassFromType.ReductionRule4());
  }
  public SNodeReference getSwitchNode() {
    return new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616134045");
  }
  public SNodeReference getModifiesSwitch() {
    return null;
  }
  public Iterable<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  public Collection<SNode> applyDefault(final TemplateExecutionEnvironment environment, SNodeReference templateSwitch, String mappingLabel, final TemplateContext context) throws GenerationException {
    final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940dabe4aL, "CastExpression"));
    try {
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfb4ed32b7fL, "ParenthesizedExpression"));
        try {
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode3 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940dabe4aL, "CastExpression"));
            try {
              TemplateContext context3 = context2.subContext();
              {
                final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"));
                try {
                  tnode4.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), tnode4, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~Object")));
                } finally {
                }
                tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), tnode4);
                // TODO validate child 
              }
              {
                final SNode tnode5 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"));
                try {
                  tnode5.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), tnode5, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~Class")));
                } finally {
                }
                tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), tnode5);
                // TODO validate child 
              }
            } finally {
            }
            tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), tnode3);
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), tnode2);
        // TODO validate child 
      }
      {
        final SNode tnode6 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x101de48bf9eL, "ClassifierType"));
        try {
          tnode6.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"), tnode6, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~Class")));
          TemplateContext context4 = context1.subContext();
          {
            Collection<SNode> tlist7 = null;
            final SNode copySrcInput7 = QueriesGenerated.sourceNodeQuery_517651233894477820(new SourceSubstituteMacroNodeContext(context4, copySrcMacro_ef4au6_b0a0c0c0b0c0b0f));
            tlist7 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput7), copySrcMacro_ef4au6_b0a0c0c0b0c0b0f, "tpl/r:229ce18d-2bb0-4d5b-a7cd-cec65841e459/517651233894475606", context4);
            for (SNode child8 : TemplateUtil.asNotNull(tlist7)) {
              tnode6.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x102419671abL, "parameter"), child8);
            }
            // TODO validate child 
          }
        } finally {
        }
        tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), tnode6);
        // TODO validate child 
      }
    } finally {
    }
    return TemplateUtil.singletonList(tnode1);
  }
  public void processNull(TemplateExecutionEnvironment environment, SNodeReference templateSwitch, TemplateContext context) {
  }
  public final class ReductionRule0 extends ReductionRuleBase {
    public ReductionRule0() {
      super(new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616154239"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"));
      try {
        environment.resolve(new RefResolver(tnode1, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), context, new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "517651233894479652"), "Byte") {
          @Override
          public Object resolve() {
            return QueriesGenerated.referenceMacro_GetReferent_517651233894479655(createQueryContext());
          }
        });
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616269838"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11d47da71ecL, "jetbrains.mps.baseLanguage.structure.StringType"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"));
      try {
        tnode1.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), tnode1, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~String")));
      } finally {
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }
  public final class ReductionRule2 extends ReductionRuleBase {
    public ReductionRule2() {
      super(new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616270997"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10f0ad8bde4L, "jetbrains.mps.baseLanguage.structure.PrimitiveType"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      final SNode copySrcInput1 = QueriesGenerated.sourceNodeQuery_2356949341616272818(new SourceSubstituteMacroNodeContext(context, copySrcMacro_ef4au6_b0a0d0b9));
      tlist1 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput1), copySrcMacro_ef4au6_b0a0d0b9, "tpl/r:229ce18d-2bb0-4d5b-a7cd-cec65841e459/2356949341616272816", context);
      return tlist1;
    }
  }
  public final class ReductionRule3 extends ReductionRuleBase {
    public ReductionRule3() {
      super(new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "7546323081797979702"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11c08f42e7bL, "jetbrains.mps.baseLanguage.structure.VariableArityType"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      {
        final SNode switchInput1 = QueriesGenerated.sourceNodeQuery_4698411099515244408(new SourceSubstituteMacroNodeContext(context, switchMacroRef_ef4au6_b0a0a0a2a1k));
        if (switchInput1 == null) {
          tlist1 = Collections.emptyList();
        } else {
          TemplateContext switchContext1;
          switchContext1 = context.subContext(null, switchInput1);
          tlist1 = environment.trySwitch(templateSwitchNode_ef4au6_a0a0c0a1a2a1k, switchContext1);
          if (tlist1 == null) {
            final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0x103fb730c14L, "ClassifierClassExpression"));
            try {
              tnode2.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x103fb730c14L, 0x103fb73a43eL, "classifier"), tnode2, PersistenceFacade.getInstance().createModelReference("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)"), PersistenceFacade.getInstance().createNodeId("~Object")));
            } finally {
            }
            if (tnode2 != null) {
              tlist1 = TemplateUtil.singletonList(tnode2);
            }
          }
        }
      }
      return tlist1;
    }
  }
  public final class ReductionRule4 extends ReductionRuleBase {
    public ReductionRule4() {
      super(new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "7154549807540194970"), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType"), true);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = null;
      final SNode copySrcInput1 = QueriesGenerated.sourceNodeQuery_7154549807540211992(new SourceSubstituteMacroNodeContext(context, copySrcMacro_ef4au6_b0a0d0b11));
      tlist1 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput1), copySrcMacro_ef4au6_b0a0d0b11, "tpl/r:229ce18d-2bb0-4d5b-a7cd-cec65841e459/7154549807540211989", context);
      return tlist1;
    }
  }
  private static SNodePointer copySrcMacro_ef4au6_b0a0c0c0b0c0b0f = new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "517651233894477632");
  private static SNodePointer copySrcMacro_ef4au6_b0a0d0b9 = new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616272817");
  private static SNodePointer switchMacroRef_ef4au6_b0a0a0a2a1k = new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "4698411099515243688");
  private static SNodePointer templateSwitchNode_ef4au6_a0a0c0a1a2a1k = new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "2356949341616134045");
  private static SNodePointer copySrcMacro_ef4au6_b0a0d0b11 = new SNodePointer("r:229ce18d-2bb0-4d5b-a7cd-cec65841e459(jetbrains.mps.lang.behavior.generator.template.main@generator)", "7154549807540211991");
}
