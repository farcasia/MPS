package jetbrains.mps.build.mps.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0c = concept;
    switch (index_2qnle6_a0c.index(cncpt_a0c)) {
      case 0:
        return new BuildMpsAspect_Constraints();
      case 1:
        return new BuildMpsLayout_ModuleJars_Constraints();
      case 2:
        return new BuildMpsLayout_ModuleSources_Constraints();
      case 3:
        return new BuildMpsLayout_ModuleXml_Constraints();
      case 4:
        return new BuildMpsLayout_Plugin_Constraints();
      case 5:
        return new BuildMpsLayout_PluginDescriptor_Constraints();
      case 6:
        return new BuildMps_Branding_Constraints();
      case 7:
        return new BuildMps_DevKit_Constraints();
      case 8:
        return new BuildMps_DevKitExportLanguage_Constraints();
      case 9:
        return new BuildMps_DevKitExportSolution_Constraints();
      case 10:
        return new BuildMps_DevKitRef_Constraints();
      case 11:
        return new BuildMps_Generator_Constraints();
      case 12:
        return new BuildMps_Group_Constraints();
      case 13:
        return new BuildMps_IdeaPlugin_Constraints();
      case 14:
        return new BuildMps_IdeaPluginDependency_Constraints();
      case 15:
        return new BuildMps_IdeaPluginGroup_Constraints();
      case 16:
        return new BuildMps_IdeaPluginGroupCustomModule_Constraints();
      case 17:
        return new BuildMps_IdeaPluginModule_Constraints();
      case 18:
        return new BuildMps_Language_Constraints();
      case 19:
        return new BuildMps_ModuleDependencyExtendLanguage_Constraints();
      case 20:
        return new BuildMps_ModuleDependencyOnDevKit_Constraints();
      case 21:
        return new BuildMps_ModuleDependencyOnJavaModule_Constraints();
      case 22:
        return new BuildMps_ModuleDependencyOnModule_Constraints();
      case 23:
        return new BuildMps_ModuleDependencyUseLanguage_Constraints();
      case 24:
        return new BuildMps_ModuleSolutionRuntime_Constraints();
      case 25:
        return new BuildMps_Solution_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex index_2qnle6_a0c = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5a408fb8c80220a9L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x11918e0f209b83e7L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x177c2feaf3463710L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x6a3e160a3efe6274L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb6eL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4dee437cL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x6b9a2011083b778dL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d2060eL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d29d6aL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d29d7aL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d2313aL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4c6db07d2e56a8b4L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x14d3fb6fb843ebddL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb74L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bbd3L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4deb1201L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x37fdb3de482e2b27L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bbdcL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c446791464290f8L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x3b60c4a45c19032eL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d5bc49L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c4467914643e8fbL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x48e82d508334b11aL), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c4467914643d2d2L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c4467914644b6e3L), MetaIdFactory.conceptId(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x2c446791464290f7L)).seal();
}
