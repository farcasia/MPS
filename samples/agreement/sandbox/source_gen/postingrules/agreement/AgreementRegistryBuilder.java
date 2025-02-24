package postingrules.agreement;

/*Generated by MPS */

import postingrules.AgreementRegistry;
import postingrules.ServiceAgreement;
import mf.MfDate;
import postingrules.EventType;
import formulaAdapter.PostingRule_Formula;
import postingrules.AccountType;
import formulaAdapter.MoneyAdapter;
import jetbrains.mps.samples.formulaLanguage.api.MultiplyOperation;
import formulaAdapter.ValueDouble;
import formulaAdapter.UsageDouble;
import mf.Currency;
import formulaAdapter.MoneyAddOperation;
import formulaAdapter.MoneyMultiplyOperation;
import formulaAdapter.FeeMoney;
import jetbrains.mps.samples.formulaLanguage.api.DoubleConstant;
import formulaAdapter.MoneyConstant;
import mf.Quantity;
import mf.Unit;
import jetbrains.mps.samples.formulaLanguage.api.IfFunction;
import mf.Money;
import formulaAdapter.QuantityGreaterThanOperation;
import formulaAdapter.UsageQuantity;
import formulaAdapter.ValueQuantity;

public class AgreementRegistryBuilder {
  public AgreementRegistryBuilder() {
  }
  public void setUp(AgreementRegistry registry) {
    registry.register("regular", this.setUpRegular());
    registry.register("lowPay", this.setUpLowPay());
  }
  public ServiceAgreement setUpRegular() {
    ServiceAgreement result = new ServiceAgreement();
    result.registerValue("BASE_RATE");
    result.setValue("BASE_RATE", 10.0, MfDate.PAST);
    result.setValue("BASE_RATE", 12.0, new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.USAGE, new PostingRule_Formula(AccountType.BASE_USAGE, true, new MoneyAdapter(new MultiplyOperation(new ValueDouble("BASE_RATE"), new UsageDouble()), Currency.USD)), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyAddOperation(new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.5)), new MoneyConstant(10.0, Currency.USD))), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyAddOperation(new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.5)), new MoneyConstant(15.0, Currency.USD))), new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.TAX, new PostingRule_Formula(AccountType.TAX, false, new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.055))), new MfDate(1999, 10, 1));
    return result;
  }
  public ServiceAgreement setUpLowPay() {
    ServiceAgreement result = new ServiceAgreement();
    result.registerValue("BASE_RATE");
    result.registerValue("REDUCED_RATE");
    result.registerValue("CAP");
    result.setValue("BASE_RATE", 10.0, MfDate.PAST);
    result.setValue("REDUCED_RATE", 5.0, MfDate.PAST);
    result.setValue("CAP", new Quantity(50.0, Unit.KWH), MfDate.PAST);
    result.setValue("CAP", new Quantity(60.0, Unit.KWH), new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.USAGE, new PostingRule_Formula(AccountType.BASE_USAGE, true, new IfFunction<Money>(new QuantityGreaterThanOperation(new UsageQuantity(), new ValueQuantity("CAP")), new MoneyAdapter(new MultiplyOperation(new ValueDouble("BASE_RATE"), new UsageDouble()), Currency.USD), new MoneyAdapter(new MultiplyOperation(new ValueDouble("REDUCED_RATE"), new UsageDouble()), Currency.USD))), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyConstant(10.0, Currency.USD)), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.TAX, new PostingRule_Formula(AccountType.TAX, false, new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.055))), new MfDate(1999, 10, 1));
    return result;
  }
}
