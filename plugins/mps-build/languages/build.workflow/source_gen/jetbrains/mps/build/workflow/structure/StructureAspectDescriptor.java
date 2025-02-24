package jetbrains.mps.build.workflow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptBwfAntStatement = createDescriptorForBwfAntStatement();
  /*package*/ final ConceptDescriptor myConceptBwfAntTaskBundleDeclaration = createDescriptorForBwfAntTaskBundleDeclaration();
  /*package*/ final ConceptDescriptor myConceptBwfAntTaskDeclaration = createDescriptorForBwfAntTaskDeclaration();
  /*package*/ final ConceptDescriptor myConceptBwfCustomMacro = createDescriptorForBwfCustomMacro();
  /*package*/ final ConceptDescriptor myConceptBwfDependency = createDescriptorForBwfDependency();
  /*package*/ final ConceptDescriptor myConceptBwfFileSet = createDescriptorForBwfFileSet();
  /*package*/ final ConceptDescriptor myConceptBwfJavaClassPath = createDescriptorForBwfJavaClassPath();
  /*package*/ final ConceptDescriptor myConceptBwfJavaDependency = createDescriptorForBwfJavaDependency();
  /*package*/ final ConceptDescriptor myConceptBwfJavaDescriptor = createDescriptorForBwfJavaDescriptor();
  /*package*/ final ConceptDescriptor myConceptBwfJavaLibrary = createDescriptorForBwfJavaLibrary();
  /*package*/ final ConceptDescriptor myConceptBwfJavaLibraryReference = createDescriptorForBwfJavaLibraryReference();
  /*package*/ final ConceptDescriptor myConceptBwfJavaModule = createDescriptorForBwfJavaModule();
  /*package*/ final ConceptDescriptor myConceptBwfJavaModuleReference = createDescriptorForBwfJavaModuleReference();
  /*package*/ final ConceptDescriptor myConceptBwfMacro = createDescriptorForBwfMacro();
  /*package*/ final ConceptDescriptor myConceptBwfMacroListImport = createDescriptorForBwfMacroListImport();
  /*package*/ final ConceptDescriptor myConceptBwfPathDeclaration = createDescriptorForBwfPathDeclaration();
  /*package*/ final ConceptDescriptor myConceptBwfPathReference = createDescriptorForBwfPathReference();
  /*package*/ final ConceptDescriptor myConceptBwfProject = createDescriptorForBwfProject();
  /*package*/ final ConceptDescriptor myConceptBwfProjectPart = createDescriptorForBwfProjectPart();
  /*package*/ final ConceptDescriptor myConceptBwfProjectPartStatement = createDescriptorForBwfProjectPartStatement();
  /*package*/ final ConceptDescriptor myConceptBwfStatement = createDescriptorForBwfStatement();
  /*package*/ final ConceptDescriptor myConceptBwfSubTask = createDescriptorForBwfSubTask();
  /*package*/ final ConceptDescriptor myConceptBwfSubTaskDependency = createDescriptorForBwfSubTaskDependency();
  /*package*/ final ConceptDescriptor myConceptBwfTask = createDescriptorForBwfTask();
  /*package*/ final ConceptDescriptor myConceptBwfTaskDependency = createDescriptorForBwfTaskDependency();
  /*package*/ final ConceptDescriptor myConceptBwfTaskLibrary = createDescriptorForBwfTaskLibrary();
  /*package*/ final ConceptDescriptor myConceptBwfTaskLibraryDependency = createDescriptorForBwfTaskLibraryDependency();
  /*package*/ final ConceptDescriptor myConceptBwfTaskPart = createDescriptorForBwfTaskPart();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBwfAntStatement, myConceptBwfAntTaskBundleDeclaration, myConceptBwfAntTaskDeclaration, myConceptBwfCustomMacro, myConceptBwfDependency, myConceptBwfFileSet, myConceptBwfJavaClassPath, myConceptBwfJavaDependency, myConceptBwfJavaDescriptor, myConceptBwfJavaLibrary, myConceptBwfJavaLibraryReference, myConceptBwfJavaModule, myConceptBwfJavaModuleReference, myConceptBwfMacro, myConceptBwfMacroListImport, myConceptBwfPathDeclaration, myConceptBwfPathReference, myConceptBwfProject, myConceptBwfProjectPart, myConceptBwfProjectPartStatement, myConceptBwfStatement, myConceptBwfSubTask, myConceptBwfSubTaskDependency, myConceptBwfTask, myConceptBwfTaskDependency, myConceptBwfTaskLibrary, myConceptBwfTaskLibraryDependency, myConceptBwfTaskPart);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.BwfAntStatement:
        return myConceptBwfAntStatement;
      case LanguageConceptSwitch.BwfAntTaskBundleDeclaration:
        return myConceptBwfAntTaskBundleDeclaration;
      case LanguageConceptSwitch.BwfAntTaskDeclaration:
        return myConceptBwfAntTaskDeclaration;
      case LanguageConceptSwitch.BwfCustomMacro:
        return myConceptBwfCustomMacro;
      case LanguageConceptSwitch.BwfDependency:
        return myConceptBwfDependency;
      case LanguageConceptSwitch.BwfFileSet:
        return myConceptBwfFileSet;
      case LanguageConceptSwitch.BwfJavaClassPath:
        return myConceptBwfJavaClassPath;
      case LanguageConceptSwitch.BwfJavaDependency:
        return myConceptBwfJavaDependency;
      case LanguageConceptSwitch.BwfJavaDescriptor:
        return myConceptBwfJavaDescriptor;
      case LanguageConceptSwitch.BwfJavaLibrary:
        return myConceptBwfJavaLibrary;
      case LanguageConceptSwitch.BwfJavaLibraryReference:
        return myConceptBwfJavaLibraryReference;
      case LanguageConceptSwitch.BwfJavaModule:
        return myConceptBwfJavaModule;
      case LanguageConceptSwitch.BwfJavaModuleReference:
        return myConceptBwfJavaModuleReference;
      case LanguageConceptSwitch.BwfMacro:
        return myConceptBwfMacro;
      case LanguageConceptSwitch.BwfMacroListImport:
        return myConceptBwfMacroListImport;
      case LanguageConceptSwitch.BwfPathDeclaration:
        return myConceptBwfPathDeclaration;
      case LanguageConceptSwitch.BwfPathReference:
        return myConceptBwfPathReference;
      case LanguageConceptSwitch.BwfProject:
        return myConceptBwfProject;
      case LanguageConceptSwitch.BwfProjectPart:
        return myConceptBwfProjectPart;
      case LanguageConceptSwitch.BwfProjectPartStatement:
        return myConceptBwfProjectPartStatement;
      case LanguageConceptSwitch.BwfStatement:
        return myConceptBwfStatement;
      case LanguageConceptSwitch.BwfSubTask:
        return myConceptBwfSubTask;
      case LanguageConceptSwitch.BwfSubTaskDependency:
        return myConceptBwfSubTaskDependency;
      case LanguageConceptSwitch.BwfTask:
        return myConceptBwfTask;
      case LanguageConceptSwitch.BwfTaskDependency:
        return myConceptBwfTaskDependency;
      case LanguageConceptSwitch.BwfTaskLibrary:
        return myConceptBwfTaskLibrary;
      case LanguageConceptSwitch.BwfTaskLibraryDependency:
        return myConceptBwfTaskLibraryDependency;
      case LanguageConceptSwitch.BwfTaskPart:
        return myConceptBwfTaskPart;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForBwfAntStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfAntStatement", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5dc467L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfStatement", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b4a1bL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284768359");
    b.aggregate("element", 0x2670d5989d5dc468L).target(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL).optional(false).ordered(true).multiple(false).origin("2769948622284768360").done();
    b.alias("ant");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfAntTaskBundleDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfAntTaskBundleDeclaration", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc1e415L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2529023923283158037");
    b.prop("resource", 0x2318e5dbdfc1e41fL, "2529023923283158047");
    b.associate("classpath", 0x2318e5dbdfc1e420L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c10L).optional(true).origin("2529023923283158048").done();
    b.alias("ant task bundle");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfAntTaskDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfAntTaskDeclaration", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x1c936d31d3127b3bL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2059109515400477499");
    b.prop("classname", 0x1c936d31d3127b3eL, "2059109515400477502");
    b.associate("classpath", 0x1c936d31d3127b3fL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c10L).optional(true).origin("2059109515400477503").done();
    b.alias("ant taskdef");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfCustomMacro() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfCustomMacro", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x365f30e12d6048cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/244868996532667532");
    b.aggregate("elements", 0x365f30e12d6048fL).target(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL).optional(true).ordered(true).multiple(true).origin("244868996532667535").done();
    b.alias("custom macro");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x7313ce29aa27bafcL);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/8292198017262926588");
    b.prop("path", 0x7313ce29aa27bb08L, "8292198017262926600");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfFileSet() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfFileSet", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/7926701909975416091");
    b.aggregate("elements", 0x6e014d63c07ebd1cL).target(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL).optional(true).ordered(true).multiple(true).origin("7926701909975416092").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaClassPath() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaClassPath", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede077L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfJavaDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6647099934206976119");
    b.aggregate("classpath", 0x6e014d63c0847621L).target(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL).optional(false).ordered(true).multiple(false).origin("7926701909975791137").done();
    b.alias("cp");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL);
    b.class_(false, true, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6647099934206976110");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaDescriptor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaDescriptor", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114723a759L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/7306485738221315929");
    b.alias("java descriptor");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaLibrary() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaLibrary", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2021cfb4db4e306L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/144710003695346438");
    b.aggregate("classpath", 0x2021cfb4db4e309L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede077L).optional(true).ordered(true).multiple(true).origin("144710003695346441").done();
    b.alias("java library");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaLibraryReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaLibraryReference", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2021cfb4db759cbL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfJavaDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/144710003695507915");
    b.associate("target", 0x2021cfb4db759ccL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2021cfb4db4e306L).optional(false).origin("144710003695507916").done();
    b.alias("library");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaModule() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaModule", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38bbL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/4755209551904389307");
    b.prop("outputFolder", 0x667edfe4171f2fb7L, "7385586609667649463");
    b.prop("generateDebugInfo", 0xcdff0e1a96739c5L, "927724900262033861");
    b.prop("heapSize", 0xcdff0e1a96ccbe3L, "927724900262398947");
    b.prop("noWarnings", 0xcdff0e1a96ccbeeL, "927724900262398958");
    b.prop("fork", 0x3d4a6c597112f405L, "4416461515995149317");
    b.prop("compiler", 0x1c936d31d30fdf98L, "2059109515400306584");
    b.prop("javaLevelSource", 0x6120f2e858e3ef7cL, "6998860900671418236");
    b.prop("javaLevelTarget", 0x6120f2e858e5a64cL, "6998860900671530572");
    b.prop("compilerOptions", 0x147ef24d5e272d05L, "1476884141930130693");
    b.aggregate("sources", 0x6e014d63c07ebd25L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL).optional(false).ordered(true).multiple(false).origin("7926701909975416101").done();
    b.aggregate("resources", 0x1708d207f21b161dL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6e014d63c07ebd1bL).optional(false).ordered(true).multiple(false).origin("1659807394254493213").done();
    b.aggregate("dependencies", 0x41fde5e4adce38c8L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL).optional(true).ordered(true).multiple(true).origin("4755209551904389320").done();
    b.aggregate("taskDeps", 0x5a7e1dc16b102462L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L).optional(true).ordered(true).multiple(true).origin("6520682027041170530").done();
    b.aggregate("prepareStatements", 0xa2d3cf45cccf776L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5dc467L).optional(true).ordered(true).multiple(true).origin("733309334557882230").done();
    b.alias("compile java module");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfJavaModuleReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfJavaModuleReference", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfJavaDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cede06eL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/4755209551904389316");
    b.associate("target", 0x41fde5e4adce38c5L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38bbL).optional(false).origin("4755209551904389317").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfMacro() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfMacro", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5fb388b43aa25d48L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6896005762093571400");
    b.prop("defaultValue", 0x5fb388b43aa25d4aL, "6896005762093571402");
    b.prop("exportToProperiesFile", 0x5fb388b43aa25d4eL, "6896005762093571406");
    b.prop("isLocation", 0x5fb388b43aa25d4fL, "6896005762093571407");
    b.prop("uninitialized", 0x600ce6822a9cc358L, "6921160174096663384");
    b.alias("macro");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfMacroListImport() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfMacroListImport", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5a7e1dc16b0ca24fL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6520682027040940623");
    b.prop("prefix", 0x5a7e1dc16b0ca250L, "6520682027040940624");
    b.prop("propertiesFile", 0x5a7e1dc16b0ca251L, "6520682027040940625");
    b.alias("import macros");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfPathDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfPathDeclaration", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c10L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6647099934207069200");
    b.aggregate("content", 0x5c3f3e2c1cef5347L).target(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486bL).optional(true).ordered(true).multiple(true).origin("6647099934207071047").done();
    b.alias("path");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfPathReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfPathReference", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c1fL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.core.xml.structure.XmlBaseElement", 0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c549486dL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/6647099934207069215");
    b.associate("target", 0x5c3f3e2c1cef4c20L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x5c3f3e2c1cef4c10L).optional(false).origin("6647099934207069216").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfProject() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfProject", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6271L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284546673");
    b.prop("temporaryFolder", 0x667edfe41720f53eL, "7385586609667765566");
    b.prop("baseDirectory", 0x47dbf964f7011e8eL, "5178006408628608654");
    b.aggregate("parts", 0x2670d5989d5ace60L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L).optional(true).ordered(true).multiple(true).origin("2769948622284574304").done();
    b.aggregate("imports", 0x6565da114725c6b7L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da1147260537L).optional(true).ordered(true).multiple(true).origin("7306485738221455031").done();
    b.alias("build workflow project");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfProjectPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.class_(false, true, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284546695");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfProjectPartStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfProjectPartStatement", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2318e5dbdfc153dbL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfStatement", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b4a1bL);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2529023923283121115");
    b.aggregate("part", 0x2318e5dbdfc153ddL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L).optional(false).ordered(true).multiple(false).origin("2529023923283121117").done();
    b.alias("project part");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfStatement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfStatement", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b4a1bL);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284605979");
    b.alias("<empty>");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfSubTask() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfSubTask", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x116b17c6e46L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284546677");
    b.aggregate("after", 0x2670d5989d5b4a01L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L).optional(true).ordered(true).multiple(true).origin("2769948622284605953").done();
    b.aggregate("before", 0x36fb0dc9fd36bb1bL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L).optional(true).ordered(true).multiple(true).origin("3961775458390293275").done();
    b.aggregate("statements", 0x2670d5989d5b4a62L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b4a1bL).optional(true).ordered(true).multiple(true).origin("2769948622284606050").done();
    b.alias("subtask");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfSubTaskDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfSubTaskDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5b49b8L);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284605880");
    b.associate("target", 0x2670d5989d5b49b9L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L).optional(false).origin("2769948622284605881").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfTask() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfTask", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284546675");
    b.aggregate("dependencies", 0x2670d5989d5ace5eL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L).optional(true).ordered(true).multiple(true).origin("2769948622284574302").done();
    b.aggregate("subTasks", 0x2670d5989d5a6277L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L).optional(true).ordered(true).multiple(true).origin("2769948622284546679").done();
    b.alias("task");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfTaskDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfTaskDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/2769948622284574294");
    b.associate("target", 0x2670d5989d5ace57L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L).optional(false).origin("2769948622284574295").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfTaskLibrary() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfTaskLibrary", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114724ce92L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/7306485738221391506");
    b.aggregate("parts", 0x6565da114724ce94L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L).optional(true).ordered(true).multiple(true).origin("7306485738221391508").done();
    b.aggregate("imports", 0x6565da114725c6b6L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da1147260537L).optional(true).ordered(true).multiple(true).origin("7306485738221455030").done();
    b.alias("build tasks library");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfTaskLibraryDependency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfTaskLibraryDependency", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da1147260537L);
    b.class_(false, false, false);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/7306485738221471031");
    b.associate("target", 0x6565da1147260538L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x6565da114724ce92L).optional(false).origin("7306485738221471032").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBwfTaskPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.build.workflow", "BwfTaskPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x36fb0dc9fd32c1b8L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.build.workflow.structure.BwfProjectPart", 0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6287L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)/3961775458390032824");
    b.associate("task", 0x36fb0dc9fd32c1b9L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6273L).optional(false).origin("3961775458390032825").done();
    b.aggregate("subTasks", 0x36fb0dc9fd32c1baL).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5a6275L).optional(true).ordered(true).multiple(true).origin("3961775458390032826").done();
    b.aggregate("additionalDependencies", 0x36fb0dc9fd37a1c2L).target(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x2670d5989d5ace56L).optional(true).ordered(true).multiple(true).origin("3961775458390352322").done();
    b.alias("task part");
    return b.create();
  }
}
