package org.jetbrains.mps.samples.Money.structure;

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
  /*package*/ final ConceptDescriptor myConceptConvertTo = createDescriptorForConvertTo();
  /*package*/ final ConceptDescriptor myConceptCurrencyDefTable = createDescriptorForCurrencyDefTable();
  /*package*/ final ConceptDescriptor myConceptCurrencyUnit = createDescriptorForCurrencyUnit();
  /*package*/ final ConceptDescriptor myConceptCurrentStockPrice = createDescriptorForCurrentStockPrice();
  /*package*/ final ConceptDescriptor myConceptGetAmount = createDescriptorForGetAmount();
  /*package*/ final ConceptDescriptor myConceptGetCurrency = createDescriptorForGetCurrency();
  /*package*/ final ConceptDescriptor myConceptMoneyLiteral = createDescriptorForMoneyLiteral();
  /*package*/ final ConceptDescriptor myConceptMoneyType = createDescriptorForMoneyType();
  /*package*/ final ConceptDescriptor myConceptMovingAverage = createDescriptorForMovingAverage();
  /*package*/ final ConceptDescriptor myConceptStockSymbol = createDescriptorForStockSymbol();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptConvertTo, myConceptCurrencyDefTable, myConceptCurrencyUnit, myConceptCurrentStockPrice, myConceptGetAmount, myConceptGetCurrency, myConceptMoneyLiteral, myConceptMoneyType, myConceptMovingAverage, myConceptStockSymbol);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.ConvertTo:
        return myConceptConvertTo;
      case LanguageConceptSwitch.CurrencyDefTable:
        return myConceptCurrencyDefTable;
      case LanguageConceptSwitch.CurrencyUnit:
        return myConceptCurrencyUnit;
      case LanguageConceptSwitch.CurrentStockPrice:
        return myConceptCurrentStockPrice;
      case LanguageConceptSwitch.GetAmount:
        return myConceptGetAmount;
      case LanguageConceptSwitch.GetCurrency:
        return myConceptGetCurrency;
      case LanguageConceptSwitch.MoneyLiteral:
        return myConceptMoneyLiteral;
      case LanguageConceptSwitch.MoneyType:
        return myConceptMoneyType;
      case LanguageConceptSwitch.MovingAverage:
        return myConceptMovingAverage;
      case LanguageConceptSwitch.StockSymbol:
        return myConceptStockSymbol;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForConvertTo() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "ConvertTo", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x18d8e0833b34209aL);
    b.class_(false, false, false);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46ac030L);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/1790427706118381722");
    b.prop("targetCurrency", 0x18d8e0833b34345fL, "1790427706118386783");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("convert to");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCurrencyDefTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "CurrencyDefTable", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3210b276d1443596L);
    b.class_(false, false, true);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/3607579524910560662");
    b.aggregate("units", 0x3210b276d144359cL).target(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3210b276d1443597L).optional(true).ordered(true).multiple(true).origin("3607579524910560668").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCurrencyUnit() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "CurrencyUnit", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3210b276d1443597L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/3607579524910560663");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCurrentStockPrice() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "CurrentStockPrice", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f4808999c3L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958233291203");
    b.aggregate("symbol", 0x3786e3f480b0926aL).target(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f480a9b18aL).optional(false).ordered(true).multiple(false).origin("4001135958235845226").done();
    b.alias("current stock price");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGetAmount() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "GetAmount", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x4b9a2fe55913c339L);
    b.class_(false, false, false);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46ac030L);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346519865");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("amount");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGetCurrency() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "GetCurrency", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x18d8e0833b32f1b1L);
    b.class_(false, false, false);
    b.parent(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46ac030L);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/1790427706118304177");
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("currency");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMoneyLiteral() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "MoneyLiteral", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x4b9a2fe559135132L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346490674");
    b.prop("amount", 0x4b9a2fe559135183L, "5447719361346490755");
    b.associate("unit", 0x3210b276d14435a8L).target(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3210b276d1443597L).optional(false).origin("3607579524910560680").done();
    b.kind(ConceptKind.NORMAL, StaticScope.NONE);
    b.alias("money");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMoneyType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "MoneyType", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x4b9a2fe55913516aL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Type", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506dL);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346490730");
    b.kind(ConceptKind.INTERFACE, StaticScope.NONE);
    b.alias("Money");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMovingAverage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "MovingAverage", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f480b1c19aL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.Expression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958235922842");
    b.prop("period", 0x3786e3f480b1c19bL, "4001135958235922843");
    b.aggregate("symbol", 0x3786e3f480b1c6d0L).target(0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f480a9b18aL).optional(false).ordered(true).multiple(false).origin("4001135958235924176").done();
    b.alias("moving average");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStockSymbol() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("org.jetbrains.mps.samples.Money", "StockSymbol", 0x662a9f2b58024d16L, 0x955872c65c7a681eL, 0x3786e3f480a9b18aL);
    b.class_(false, false, false);
    b.origin("r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958235394442");
    b.prop("symbol", 0x3786e3f480afac5bL, "4001135958235786331");
    b.alias("symbol");
    return b.create();
  }
}
