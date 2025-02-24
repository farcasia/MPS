package jetbrains.mps.lang.script.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.runtime.ConceptKind;
import jetbrains.mps.smodel.runtime.StaticScope;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAbstractClassifierSpecification = createDescriptorForAbstractClassifierSpecification();
  /*package*/ final ConceptDescriptor myConceptAbstractMethodSpecification = createDescriptorForAbstractMethodSpecification();
  /*package*/ final ConceptDescriptor myConceptCommentMigrationScriptPart = createDescriptorForCommentMigrationScriptPart();
  /*package*/ final ConceptDescriptor myConceptDirectClassifierSpecification = createDescriptorForDirectClassifierSpecification();
  /*package*/ final ConceptDescriptor myConceptDirectMethodSpecification = createDescriptorForDirectMethodSpecification();
  /*package*/ final ConceptDescriptor myConceptExtractInterfaceMigration = createDescriptorForExtractInterfaceMigration();
  /*package*/ final ConceptDescriptor myConceptFQNameClassifierSpecification = createDescriptorForFQNameClassifierSpecification();
  /*package*/ final ConceptDescriptor myConceptFQNameMethodSpecification = createDescriptorForFQNameMethodSpecification();
  /*package*/ final ConceptDescriptor myConceptFactoryMigrationScriptPart = createDescriptorForFactoryMigrationScriptPart();
  /*package*/ final ConceptDescriptor myConceptMigrationScript = createDescriptorForMigrationScript();
  /*package*/ final ConceptDescriptor myConceptMigrationScriptPart = createDescriptorForMigrationScriptPart();
  /*package*/ final ConceptDescriptor myConceptMigrationScriptPart_Instance = createDescriptorForMigrationScriptPart_Instance();
  /*package*/ final ConceptDescriptor myConceptMigrationScriptPart_Instance_Predicate = createDescriptorForMigrationScriptPart_Instance_Predicate();
  /*package*/ final ConceptDescriptor myConceptMigrationScriptPart_Instance_Updater = createDescriptorForMigrationScriptPart_Instance_Updater();
  /*package*/ final ConceptDescriptor myConceptMigrationScriptPart_node = createDescriptorForMigrationScriptPart_node();
  /*package*/ final ConceptDescriptor myConceptPullUpMethod = createDescriptorForPullUpMethod();
  /*package*/ final ConceptDescriptor myConceptWhitespaceMigrationScriptPart = createDescriptorForWhitespaceMigrationScriptPart();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAbstractClassifierSpecification, myConceptAbstractMethodSpecification, myConceptCommentMigrationScriptPart, myConceptDirectClassifierSpecification, myConceptDirectMethodSpecification, myConceptExtractInterfaceMigration, myConceptFQNameClassifierSpecification, myConceptFQNameMethodSpecification, myConceptFactoryMigrationScriptPart, myConceptMigrationScript, myConceptMigrationScriptPart, myConceptMigrationScriptPart_Instance, myConceptMigrationScriptPart_Instance_Predicate, myConceptMigrationScriptPart_Instance_Updater, myConceptMigrationScriptPart_node, myConceptPullUpMethod, myConceptWhitespaceMigrationScriptPart);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AbstractClassifierSpecification:
        return myConceptAbstractClassifierSpecification;
      case LanguageConceptSwitch.AbstractMethodSpecification:
        return myConceptAbstractMethodSpecification;
      case LanguageConceptSwitch.CommentMigrationScriptPart:
        return myConceptCommentMigrationScriptPart;
      case LanguageConceptSwitch.DirectClassifierSpecification:
        return myConceptDirectClassifierSpecification;
      case LanguageConceptSwitch.DirectMethodSpecification:
        return myConceptDirectMethodSpecification;
      case LanguageConceptSwitch.ExtractInterfaceMigration:
        return myConceptExtractInterfaceMigration;
      case LanguageConceptSwitch.FQNameClassifierSpecification:
        return myConceptFQNameClassifierSpecification;
      case LanguageConceptSwitch.FQNameMethodSpecification:
        return myConceptFQNameMethodSpecification;
      case LanguageConceptSwitch.FactoryMigrationScriptPart:
        return myConceptFactoryMigrationScriptPart;
      case LanguageConceptSwitch.MigrationScript:
        return myConceptMigrationScript;
      case LanguageConceptSwitch.MigrationScriptPart:
        return myConceptMigrationScriptPart;
      case LanguageConceptSwitch.MigrationScriptPart_Instance:
        return myConceptMigrationScriptPart_Instance;
      case LanguageConceptSwitch.MigrationScriptPart_Instance_Predicate:
        return myConceptMigrationScriptPart_Instance_Predicate;
      case LanguageConceptSwitch.MigrationScriptPart_Instance_Updater:
        return myConceptMigrationScriptPart_Instance_Updater;
      case LanguageConceptSwitch.MigrationScriptPart_node:
        return myConceptMigrationScriptPart_node;
      case LanguageConceptSwitch.PullUpMethod:
        return myConceptPullUpMethod;
      case LanguageConceptSwitch.WhitespaceMigrationScriptPart:
        return myConceptWhitespaceMigrationScriptPart;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAbstractClassifierSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "AbstractClassifierSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a61a23aL);
    b.class_(false, true, false);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/5434557751112081978");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAbstractMethodSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "AbstractMethodSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4243146ba1b46c9dL);
    b.class_(false, true, false);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/4774682482449869981");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCommentMigrationScriptPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "CommentMigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x5c5c941438569102L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/6655357163912204546");
    b.prop("text", 0x5c5c941438569103L, "6655357163912204547");
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    b.alias("//");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDirectClassifierSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "DirectClassifierSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a638d23L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.AbstractClassifierSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a61a23aL);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/5434557751112207651");
    b.associate("classifier", 0x4b6b6d7b2a638e5dL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L).optional(false).origin("5434557751112207965").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDirectMethodSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "DirectMethodSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x1fcdfeb518c43583L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.AbstractMethodSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4243146ba1b46c9dL);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/2291767839159498115");
    b.associate("methodDeclaration", 0x1fcdfeb518c43c59L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL).optional(false).origin("2291767839159499865").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExtractInterfaceMigration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "ExtractInterfaceMigration", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x5c5c941438573499L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/6655357163912246425");
    b.prop("updateClassifierTypes", 0x6d2dea9e179eb2e5L, "7867202088808133349");
    b.associate("newClassifier", 0x5c5c94143857349bL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L).optional(false).origin("6655357163912246427").done();
    b.aggregate("oldClassifier", 0x4b6b6d7b2a62097fL).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a61a23aL).optional(false).ordered(true).multiple(false).origin("5434557751112108415").done();
    b.aggregate("pullUpMethods", 0xbc887f0950cf34dL).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L).optional(true).ordered(true).multiple(true).origin("849077997121893197").done();
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    b.alias("extract interface");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFQNameClassifierSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "FQNameClassifierSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a638ddbL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.AbstractClassifierSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4b6b6d7b2a61a23aL);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/5434557751112207835");
    b.prop("classifierFQName", 0x4b6b6d7b2a6bdf42L, "5434557751112752962");
    b.prop("smodelReference", 0x4b6b6d7b2a76ca23L, "5434557751113468451");
    b.prop("snodeId", 0x7bba19eddf8bfaa0L, "8915466921781754528");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFQNameMethodSpecification() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "FQNameMethodSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4243146ba1b412e3L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.AbstractMethodSpecification", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4243146ba1b46c9dL);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/4774682482449847011");
    b.prop("snodeId", 0x1fcdfeb518d2fe29L, "2291767839160466985");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFactoryMigrationScriptPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "FactoryMigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x24105a807c757c2dL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/2598676492883164205");
    b.aggregate("factoryMethod", 0x24105a807c757c2fL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbebabf09L).optional(false).ordered(true).multiple(false).origin("2598676492883164207").done();
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    b.alias("factory migration script part");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScript() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScript", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225e9072dL);
    b.class_(false, false, true);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11a3afa8c0dL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x12509ddfaa98f128L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/1177457067821");
    b.prop("title", 0x11225f2354aL, "1177457669450");
    b.prop("migrationFromBuild", 0x118d28c5944L, "1206123256132");
    b.prop("category", 0x118d28cf5b3L, "1206123296179");
    b.prop("type", 0x498b4f71ee081153L, "5299416737274925395");
    b.prop("toBuild", 0x498b4f71ee081155L, "5299416737274925397");
    b.aggregate("part", 0x11225f9fb49L).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L).optional(true).ordered(true).multiple(true).origin("1177458178889").done();
    b.kind(ConceptKind.INTERFACE, StaticScope.GLOBAL);
    b.alias("Language Migration Script");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScriptPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.class_(false, true, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x12509ddfaa7c0557L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/6970965131508596229");
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScriptPart_Instance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScriptPart_Instance", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225f4f883L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/1177457850499");
    b.prop("description", 0x11225f6d349L, "1177457972041");
    b.prop("showAsIntention", 0x11d52f0c33cL, "1225457189692");
    b.associate("affectedInstanceConcept", 0x11225f69a65L).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL).optional(false).origin("1177457957477").done();
    b.aggregate("affectedInstancePredicate", 0x11225f69a66L).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225f8301cL).optional(true).ordered(true).multiple(false).origin("1177457957478").done();
    b.aggregate("affectedInstanceUpdater", 0x11225f7554bL).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225fec23cL).optional(false).ordered(true).multiple(false).origin("1177458005323").done();
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    b.alias("concept instances updater");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScriptPart_Instance_Predicate() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScriptPart_Instance_Predicate", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225f8301cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/1177458061340");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("instance predicate");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScriptPart_Instance_Updater() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScriptPart_Instance_Updater", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225fec23cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/1177458491964");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("instance predicate");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMigrationScriptPart_node() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "MigrationScriptPart_node", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x11225fae1f1L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x19796fa16a19888bL);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/1177458237937");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("node");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPullUpMethod() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "PullUpMethod", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0xbc887f0950c99c4L);
    b.class_(false, false, false);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/849077997121870276");
    b.associate("newMethodDeclaration", 0x3ae1f3a73b9e55daL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL).optional(true).origin("4242940223545038298").done();
    b.aggregate("oldMethodSpecification", 0x4243146ba1b41281L).target(0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x4243146ba1b46c9dL).optional(true).ordered(true).multiple(false).origin("4774682482449846913").done();
    b.alias("pull up method");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWhitespaceMigrationScriptPart() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.lang.script", "WhitespaceMigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x24105a807c76b63eL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.script.structure.MigrationScriptPart", 0xeddeefac2d64437L, 0xbc2cde50fd4ce470L, 0x60bdd7da75343e05L);
    b.origin("r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)/2598676492883244606");
    b.kind(ConceptKind.IMPLEMENTATION, StaticScope.GLOBAL);
    b.alias("whitespace");
    return b.create();
  }
}
