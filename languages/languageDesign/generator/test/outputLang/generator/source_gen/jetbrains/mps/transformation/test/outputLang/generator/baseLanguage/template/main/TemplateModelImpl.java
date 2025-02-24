package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateModelBase;
import jetbrains.mps.generator.runtime.TemplateModel;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.runtime.TemplateDeclaration;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.impl.query.GeneratorQueryProvider;

@Generated
public class TemplateModelImpl extends TemplateModelBase implements TemplateModel {
  private final Collection<TemplateMappingConfiguration> mappings;
  private final Collection<TemplateSwitchMapping> switches;
  private final SModelReference model;
  public TemplateModelImpl(TemplateModule module) {
    super(module);
    mappings = TemplateUtil.<TemplateMappingConfiguration>asCollection(new Mapping_main(this));
    switches = TemplateUtil.<TemplateSwitchMapping>asCollection(new Switch_customStatement());
    model = PersistenceFacade.getInstance().createModelReference("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)");
  }
  public String getLongName() {
    return "jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main";
  }
  public SModelReference getSModelReference() {
    return model;
  }
  public Collection<TemplateMappingConfiguration> getConfigurations() {
    return mappings;
  }
  public Collection<TemplateSwitchMapping> getSwitches() {
    return switches;
  }
  public TemplateDeclaration loadTemplate(SNodeReference template, Object... arguments) {
    if (!(model.equals(template.getModelReference()))) {
      return null;
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992617065"))) {
      TemplateUtil.assertTemplateParametersCount(template, 2, arguments.length);
      return new Template_convertMult((SNode) arguments[0], (SNode) arguments[1]);
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "2681305894288695007"))) {
      TemplateUtil.assertTemplateParametersCount(template, 5, arguments.length);
      return new Template_processStatement((String) arguments[0], (String) arguments[1], (SNode) arguments[2], (Integer) arguments[3], (Boolean) arguments[4]);
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "5857536350883030947"))) {
      TemplateUtil.assertTemplateParametersCount(template, 1, arguments.length);
      return new Template_process42((SNode) arguments[0]);
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "933643154466320524"))) {
      TemplateUtil.assertTemplateParametersCount(template, 1, arguments.length);
      return new Template_aaaaa((SNode) arguments[0]);
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "3392060900980718989"))) {
      TemplateUtil.assertTemplateParametersCount(template, 0, arguments.length);
      return new Template_gen_static_method();
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "3571912445009934880"))) {
      TemplateUtil.assertTemplateParametersCount(template, 0, arguments.length);
      return new Template_weave_Statement();
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "6458924870076077829"))) {
      TemplateUtil.assertTemplateParametersCount(template, 0, arguments.length);
      return new Template_weave_StmtToCons();
    }
    if (template.equals(new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412775"))) {
      TemplateUtil.assertTemplateParametersCount(template, 0, arguments.length);
      return new Template_RootCustom();
    }
    return null;
  }
  @Override
  public GeneratorQueryProvider getQueryProvider() {
    return reflectiveProvider(QueriesGenerated.class);
  }
}
