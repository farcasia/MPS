package jetbrains.mps.baseLanguage.overloadedOperators.structure;

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
  /*package*/ final ConceptDescriptor myConceptBinaryOperationReference = createDescriptorForBinaryOperationReference();
  /*package*/ final ConceptDescriptor myConceptContainerImport = createDescriptorForContainerImport();
  /*package*/ final ConceptDescriptor myConceptCustomOperator = createDescriptorForCustomOperator();
  /*package*/ final ConceptDescriptor myConceptCustomOperatorDeclaration = createDescriptorForCustomOperatorDeclaration();
  /*package*/ final ConceptDescriptor myConceptCustomOperatorUsage = createDescriptorForCustomOperatorUsage();
  /*package*/ final ConceptDescriptor myConceptLeftOperand = createDescriptorForLeftOperand();
  /*package*/ final ConceptDescriptor myConceptOperator = createDescriptorForOperator();
  /*package*/ final ConceptDescriptor myConceptOverloadedBinaryOperator = createDescriptorForOverloadedBinaryOperator();
  /*package*/ final ConceptDescriptor myConceptOverloadedOperatorContainer = createDescriptorForOverloadedOperatorContainer();
  /*package*/ final ConceptDescriptor myConceptRightOperand = createDescriptorForRightOperand();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBinaryOperationReference, myConceptContainerImport, myConceptCustomOperator, myConceptCustomOperatorDeclaration, myConceptCustomOperatorUsage, myConceptLeftOperand, myConceptOperator, myConceptOverloadedBinaryOperator, myConceptOverloadedOperatorContainer, myConceptRightOperand);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.BinaryOperationReference:
        return myConceptBinaryOperationReference;
      case LanguageConceptSwitch.ContainerImport:
        return myConceptContainerImport;
      case LanguageConceptSwitch.CustomOperator:
        return myConceptCustomOperator;
      case LanguageConceptSwitch.CustomOperatorDeclaration:
        return myConceptCustomOperatorDeclaration;
      case LanguageConceptSwitch.CustomOperatorUsage:
        return myConceptCustomOperatorUsage;
      case LanguageConceptSwitch.LeftOperand:
        return myConceptLeftOperand;
      case LanguageConceptSwitch.Operator:
        return myConceptOperator;
      case LanguageConceptSwitch.OverloadedBinaryOperator:
        return myConceptOverloadedBinaryOperator;
      case LanguageConceptSwitch.OverloadedOperatorContainer:
        return myConceptOverloadedOperatorContainer;
      case LanguageConceptSwitch.RightOperand:
        return myConceptRightOperand;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForBinaryOperationReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "BinaryOperationReference", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d23eb4L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.overloadedOperators.structure.Operator", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d06ca6L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/2838654975957155508");
    b.associate("binaryOperation", 0x2764eda929d23eb5L).target(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L).optional(false).origin("2838654975957155509").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForContainerImport() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "ContainerImport", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x66302c3c8df72c49L);
    b.class_(false, false, true);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/7363434029342207049");
    b.associate("container", 0x66302c3c8df72d45L).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6b6f5c413011207L).optional(false).origin("7363434029342207301").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCustomOperator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "CustomOperator", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d60237L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.overloadedOperators.structure.Operator", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d06ca6L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/2838654975957402167");
    b.associate("declaration", 0x2764eda929d60239L).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x15c86fdc60940541L).optional(false).origin("2838654975957402169").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCustomOperatorDeclaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "CustomOperatorDeclaration", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x15c86fdc60940541L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/1569627462442419521");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCustomOperatorUsage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "CustomOperatorUsage", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x15c86fdc6084766fL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.BinaryOperation", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/1569627462441399919");
    b.associate("operator", 0x15c86fdc60847670L).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x15c86fdc60940541L).optional(false).origin("1569627462441399920").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLeftOperand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "LeftOperand", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6b6f5c4130926a0L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/483844232470668960");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("left");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOperator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "Operator", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d06ca6L);
    b.class_(false, true, false);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/2838654975957036198");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOverloadedBinaryOperator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "OverloadedBinaryOperator", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6b6f5c41300f84dL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunction", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/483844232470132813");
    b.prop("commutative", 0x2519632ce12e26e2L, "2673276898228709090");
    b.aggregate("returnType", 0x5cab13b82be03a0dL).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("6677452554237917709").done();
    b.aggregate("leftType", 0x5cab13b82bf359b1L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("6677452554239170993").done();
    b.aggregate("rightType", 0x5cab13b82bf359b2L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL).optional(false).ordered(true).multiple(false).origin("6677452554239170994").done();
    b.aggregate("operator", 0x2764eda929d23eb6L).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x2764eda929d06ca6L).optional(false).ordered(true).multiple(false).origin("2838654975957155510").done();
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOverloadedOperatorContainer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "OverloadedOperatorContainer", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6b6f5c413011207L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/483844232470139399");
    b.aggregate("operators", 0x6b6f5c413011208L).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6b6f5c41300f84dL).optional(true).ordered(true).multiple(true).origin("483844232470139400").done();
    b.aggregate("customOperators", 0x2764eda929cc329cL).target(0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x15c86fdc60940541L).optional(true).ordered(true).multiple(true).origin("2838654975956759196").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRightOperand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.baseLanguage.overloadedOperators", "RightOperand", 0xfc8d557e5de64dd8L, 0xb749aab2fb23aefcL, 0x6c1973240c8fe3e1L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101c66e2c0bL);
    b.origin("r:a258f9a5-18d3-4bea-a833-20735290774c(jetbrains.mps.baseLanguage.overloadedOperators.structure)/7789383629180756961");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("right");
    return b.create();
  }
}
