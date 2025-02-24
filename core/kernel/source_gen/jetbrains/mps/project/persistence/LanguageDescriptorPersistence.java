package jetbrains.mps.project.persistence;

/*Generated by MPS */

import jetbrains.mps.util.MacroHelper;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.util.xml.XmlUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.structure.modules.GeneratorDescriptor;
import java.util.List;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Collection;
import org.jetbrains.mps.openapi.module.SModuleReference;

/**
 * XML/DOM persistence for a descriptor of Language module 
 */
public class LanguageDescriptorPersistence {
  private final String SOURCE_GEN_DEFAULT = "${module}/source_gen";

  private final MacroHelper myMacroHelper;

  public LanguageDescriptorPersistence(@NotNull MacroHelper macroHelper) {
    myMacroHelper = macroHelper;
  }

  @NotNull
  public LanguageDescriptor load(@NotNull final Element languageElement) throws ModuleReadException {
    LanguageDescriptor descriptor;

    try {
      descriptor = new _FunctionTypes._return_P0_E0<LanguageDescriptor>() {
        public LanguageDescriptor invoke() {
          final LanguageDescriptor result_v3r4p8_a0a0a0c0g = new LanguageDescriptor();
          final String result_v3r4p8_a0a0a0a0c0g = languageElement.getAttributeValue("namespace");
          result_v3r4p8_a0a0a0c0g.setNamespace(result_v3r4p8_a0a0a0a0c0g);
          String uuid = languageElement.getAttributeValue("uuid");
          if (uuid != null) {
            final ModuleId result_v3r4p8_a0a2a0a0a0c0g = ModuleId.fromString(uuid);
            result_v3r4p8_a0a0a0c0g.setId(result_v3r4p8_a0a2a0a0a0c0g);
          }

          final String result_v3r4p8_a4a0a0a0c0g = myMacroHelper.expandPath(XmlUtil.stringWithDefault(languageElement, "generatorOutputPath", SOURCE_GEN_DEFAULT));
          result_v3r4p8_a0a0a0c0g.setGenPath(result_v3r4p8_a4a0a0a0c0g);

          String moduleVersion = languageElement.getAttributeValue("moduleVersion");
          if (moduleVersion != null) {
            try {
              result_v3r4p8_a0a0a0c0g.setModuleVersion(Integer.parseInt(moduleVersion));
            } catch (NumberFormatException ignored) {
            }
          }
          String languageVersion = (languageElement.getAttributeValue("languageVersion") != null ? languageElement.getAttributeValue("languageVersion") : languageElement.getAttributeValue("version"));
          if (languageVersion != null) {
            try {
              result_v3r4p8_a0a0a0c0g.setLanguageVersion(Integer.parseInt(languageVersion));
            } catch (NumberFormatException ignored) {
            }
          }

          Element modelsTag = XmlUtil.first(languageElement, "models");
          if (modelsTag != null) {
            result_v3r4p8_a0a0a0c0g.getModelRootDescriptors().addAll(ModuleDescriptorPersistence.loadModelRoots(XmlUtil.children(modelsTag, "modelRoot"), myMacroHelper));
          }

          Element facets = XmlUtil.first(languageElement, "facets");
          if (facets != null) {
            result_v3r4p8_a0a0a0c0g.getModuleFacetDescriptors().addAll(ModuleDescriptorPersistence.loadFacets(XmlUtil.children(facets, "facet"), myMacroHelper));
          }


          ModuleDescriptorPersistence.loadDependencies(result_v3r4p8_a0a0a0c0g, languageElement);
          for (Element extendedLanguage : Sequence.fromIterable(XmlUtil.children(XmlUtil.first(languageElement, "extendedLanguages"), "extendedLanguage"))) {
            result_v3r4p8_a0a0a0c0g.getExtendedLanguages().add(PersistenceFacade.getInstance().createModuleReference(extendedLanguage.getText()));
          }

          Element autoImports = XmlUtil.first(languageElement, "accessoryModels");
          if (autoImports == null) {
            // deprecated name 
            autoImports = XmlUtil.first(languageElement, "library");
          }
          for (Element modelElement : Sequence.fromIterable(XmlUtil.children(autoImports, "model"))) {
            result_v3r4p8_a0a0a0c0g.getAccessoryModels().add(PersistenceFacade.getInstance().createModelReference(modelElement.getAttributeValue("modelUID")));
          }

          GeneratorDescriptorPersistence gdp = new GeneratorDescriptorPersistence(myMacroHelper, true);
          for (Element generatorElement : Sequence.fromIterable(XmlUtil.children(XmlUtil.first(languageElement, "generators"), "generator"))) {
            GeneratorDescriptor gd = gdp.load(generatorElement);
            // as long as generator descriptors are part of language descriptor, no need to persist identity of a source language, we can 
            // re-construct it here at loading time. 
            gd.setSourceLanguage(result_v3r4p8_a0a0a0c0g.getModuleReference());
            result_v3r4p8_a0a0a0c0g.getGenerators().add(gd);
          }

          // odd 'stubModelEntry' name for auxiliary classpath is due to legacy 
          Element stubModelEntries = XmlUtil.first(languageElement, "stubModelEntries");
          if (stubModelEntries != null) {
            List<String> roots = ModuleDescriptorPersistence.loadStubModelEntries(stubModelEntries, myMacroHelper);
            result_v3r4p8_a0a0a0c0g.getAdditionalJavaStubPaths().addAll(roots);
          }

          for (Element entryElement : Sequence.fromIterable(XmlUtil.children(XmlUtil.first(languageElement, "sourcePath"), "source"))) {
            result_v3r4p8_a0a0a0c0g.getSourcePaths().add(myMacroHelper.expandPath(entryElement.getAttributeValue("path")));
          }
          return result_v3r4p8_a0a0a0c0g;
        }
      }.invoke();
    } catch (ModuleReadException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new ModuleReadException(ex);
    }
    return descriptor;
  }

  @NotNull
  public Element save(@NotNull LanguageDescriptor descriptor) {
    Element languageElement = new Element("language");
    languageElement.setAttribute("namespace", descriptor.getNamespace());
    if (descriptor.getId() != null) {
      languageElement.setAttribute("uuid", descriptor.getId().toString());
    }
    if (descriptor.getGenPath() != null) {
      String p = myMacroHelper.shrinkPath(descriptor.getGenPath());
      if (!(SOURCE_GEN_DEFAULT.equals(p))) {
        languageElement.setAttribute("generatorOutputPath", p);
      }
    }
    languageElement.setAttribute("languageVersion", Integer.toString(descriptor.getLanguageVersion()));
    languageElement.setAttribute("moduleVersion", Integer.toString(descriptor.getModuleVersion()));

    Element models = new Element("models");
    ModuleDescriptorPersistence.saveModelRoots(models, descriptor.getModelRootDescriptors(), myMacroHelper);
    languageElement.addContent(models);

    if (!(descriptor.getModuleFacetDescriptors().isEmpty())) {
      Element facets = new Element("facets");
      ModuleDescriptorPersistence.saveFacets(facets, descriptor.getModuleFacetDescriptors(), myMacroHelper);
      languageElement.addContent(facets);
    }

    Element accessoryModels = new Element("accessoryModels");
    for (SModelReference model : SetSequence.fromSet(descriptor.getAccessoryModels())) {
      XmlUtil.tagWithAttribute(accessoryModels, "model", "modelUID", model.toString());
    }
    languageElement.addContent(accessoryModels);


    if (!(descriptor.getGenerators().isEmpty())) {
      Element generators = new Element("generators");
      GeneratorDescriptorPersistence gdp = new GeneratorDescriptorPersistence(myMacroHelper, true);
      for (GeneratorDescriptor generatorDescriptor : ListSequence.fromList(descriptor.getGenerators())) {
        generators.addContent(gdp.save(generatorDescriptor));
      }
      languageElement.addContent(generators);
    }

    if (!(descriptor.getAdditionalJavaStubPaths().isEmpty())) {
      Element stubModelEntries = new Element("stubModelEntries");
      ModuleDescriptorPersistence.saveStubModelEntries(stubModelEntries, (Collection<String>) descriptor.getAdditionalJavaStubPaths(), myMacroHelper);
      languageElement.addContent(stubModelEntries);
    }

    Element sourcePath = new Element("sourcePath");
    for (String p : descriptor.getSourcePaths()) {
      XmlUtil.tagWithAttribute(sourcePath, "source", "path", myMacroHelper.shrinkPath(p));
    }
    languageElement.addContent(sourcePath);

    ModuleDescriptorPersistence.saveDependencies(languageElement, descriptor);

    Element extendedLanguages = new Element("extendedLanguages");
    for (SModuleReference ref : SetSequence.fromSet(descriptor.getExtendedLanguages())) {
      XmlUtil.tagWithText(extendedLanguages, "extendedLanguage", ref.toString());
    }
    languageElement.addContent(extendedLanguages);
    return languageElement;
  }
}
