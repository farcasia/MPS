package jetbrains.mps.samples.KajaSceneConstruction.generator.template.main;

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
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;

@Generated
public class Mapping_main extends MapConfigBase implements TemplateMappingConfiguration {
  private final Collection<TemplateReductionRule> rules;
  public Mapping_main(@NotNull TemplateModel model) {
    super(new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273563027"), "main", model, false);
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mapping_main.ReductionRule0(), new Mapping_main.ReductionRule1(), new Mapping_main.ReductionRule2(), new Mapping_main.ReductionRule3());
  }
  @Override
  public Collection<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  public final class ReductionRule0 extends ReductionRuleBase {
    public ReductionRule0() {
      super(new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273563032"), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a8341e10L, "jetbrains.mps.samples.KajaSceneConstruction.structure.BuildWall"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_BuildWall().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273607273"), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fa55L, "jetbrains.mps.samples.KajaSceneConstruction.structure.DestroyWall"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_DestroyWall().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule2 extends ReductionRuleBase {
    public ReductionRule2() {
      super(new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273612344"), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3eL, "jetbrains.mps.samples.KajaSceneConstruction.structure.DropMark"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_DropMark().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule3 extends ReductionRuleBase {
    public ReductionRule3() {
      super(new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273614441"), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a835165fL, "jetbrains.mps.samples.KajaSceneConstruction.structure.PickMark"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_PickMark().apply(environment, context);
      return tlist1;
    }
  }
}
