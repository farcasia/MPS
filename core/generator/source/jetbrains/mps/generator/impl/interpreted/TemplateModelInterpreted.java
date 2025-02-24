/*
 * Copyright 2003-2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.generator.impl.interpreted;

import jetbrains.mps.generator.impl.RuleUtil;
import jetbrains.mps.generator.impl.query.GeneratorQueryProvider;
import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.generator.runtime.TemplateModelBase;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Evgeny Gryaznov, Nov 29, 2010
 */
public class TemplateModelInterpreted extends TemplateModelBase {

  private final SModel myModel;
  private Class<? extends GeneratorQueryProvider> myQueryProviderClass;
  private Collection<TemplateSwitchMapping> mySwitches;
  private Collection<TemplateMappingConfiguration> myMappings;

  public TemplateModelInterpreted(@NotNull TemplateModule module, @Nullable SModel model) {
    super(module);
    myModel = model;
    mySwitches = new ArrayList<>();
    myMappings = new ArrayList<>();
    init();
  }

  public TemplateModelInterpreted(@NotNull TemplateModule module, @Nullable SModel model, @Nullable Class<? extends GeneratorQueryProvider> queryProviderClass) {
    this(module, model);
    myQueryProviderClass = queryProviderClass;
  }

  private void init() {
    if (myModel == null) {
      return;
    }
    for (SNode root : myModel.getRootNodes()) {
      SConcept c = root.getConcept();
      if (RuleUtil.concept_TemplateSwitch.equals(c)) {
        mySwitches.add(new TemplateSwitchMappingInterpreted(root));
      } else if (RuleUtil.concept_MappingConfiguration.equals(c)) {
        myMappings.add(new TemplateMappingConfigurationInterpreted(this, root));
      }
    }
  }

  @Override
  public Collection<TemplateSwitchMapping> getSwitches() {
    return mySwitches;
  }

  @Override
  public Collection<TemplateMappingConfiguration> getConfigurations() {
    return myMappings;
  }

  @Override
  public TemplateDeclaration loadTemplate(SNodeReference template, Object... arguments) {
    assert template.getModelReference().equals(getSModelReference());
    SNode templateNode = template.resolve(myModel.getRepository());
    if (templateNode == null || !RuleUtil.concept_TemplateDeclaration.equals(templateNode.getConcept())) {
      return null;
    }

    return TemplateDeclarationInterpreted.create(templateNode, arguments);
  }

  @Override
  public String getLongName() {
    return myModel.getName().getLongName();
  }

  @Override
  public SModelReference getSModelReference() {
    return myModel.getReference();
  }

  @Override
  public GeneratorQueryProvider getQueryProvider() {
    if (myQueryProviderClass != null) {
      try {
        return myQueryProviderClass.newInstance();
      } catch (InstantiationException | IllegalAccessException ex) {
        String msg = String.format("Failed to instantiate class with generated queries: %s", myQueryProviderClass.getName());
        Logger.getLogger(TemplateModelInterpreted.class).error(msg, ex);
        return null;
      }
    }
    String packageName = getSModelReference().getName().getLongName();
    String queriesClassName = packageName + ".QueriesGenerated";
    try {
      Class<?> qg = getModule().loadClass(queriesClassName);
      if (GeneratorQueryProvider.class.isAssignableFrom(qg)) {
        @SuppressWarnings("unchecked")
        Class<GeneratorQueryProvider> providerClass = (Class<GeneratorQueryProvider>) qg;
        return providerClass.newInstance();
      }
      return reflectiveProvider(qg);
    } catch (ClassNotFoundException ex) {
      String msg = String.format("Failed to load class with generated queries: %s", queriesClassName);
      Logger.getLogger(TemplateModelInterpreted.class).error(msg, ex);
      return null;
    } catch (IllegalAccessException | InstantiationException ex) {
      String msg = String.format("Failed to instantiate class with generated queries: %s", queriesClassName);
      Logger.getLogger(TemplateModelInterpreted.class).error(msg, ex);
      return null;
    }
  }
}
