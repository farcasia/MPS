package jetbrains.mps.baseLanguage.jdk7.generator.template.main;

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
import jetbrains.mps.generator.impl.query.GeneratorQueryProvider;

@Generated
public class TemplateModelImpl extends TemplateModelBase implements TemplateModel {
  private final Collection<TemplateMappingConfiguration> mappings;
  private final Collection<TemplateSwitchMapping> switches;
  private final SModelReference model;
  public TemplateModelImpl(TemplateModule module) {
    super(module);
    mappings = TemplateUtil.<TemplateMappingConfiguration>asCollection(new Mapping_main(this));
    switches = TemplateUtil.<TemplateSwitchMapping>asCollection();
    model = PersistenceFacade.getInstance().createModelReference("r:23911370-3645-4974-be70-79d5cfba7db1(jetbrains.mps.baseLanguage.jdk7.generator.template.main@generator)");
  }
  public String getLongName() {
    return "jetbrains.mps.baseLanguage.jdk7.generator.template.main";
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
    if (template.equals(new SNodePointer("r:23911370-3645-4974-be70-79d5cfba7db1(jetbrains.mps.baseLanguage.jdk7.generator.template.main@generator)", "400642802550420129"))) {
      TemplateUtil.assertTemplateParametersCount(template, 0, arguments.length);
      return new Template_string_switch_template();
    }
    return null;
  }
  @Override
  public GeneratorQueryProvider getQueryProvider() {
    return reflectiveProvider(QueriesGenerated.class);
  }
}
