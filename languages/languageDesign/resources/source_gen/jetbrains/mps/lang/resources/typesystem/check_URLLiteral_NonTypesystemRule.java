package jetbrains.mps.lang.resources.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_URLLiteral_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_URLLiteral_NonTypesystemRule() {
  }
  public void applyRule(final SNode url, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (isEmptyString(SPropertyOperations.getString(url, MetaAdapterFactory.getProperty(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x4197d5560e6a38b8L, 0x4197d5560e6a38f3L, "url")))) {
      return;
    }
    URLCheckUtil.check(typeCheckingContext, url, SPropertyOperations.getString(url, MetaAdapterFactory.getProperty(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x4197d5560e6a38b8L, 0x4197d5560e6a38f3L, "url")));
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x4197d5560e6a38b8L, "jetbrains.mps.lang.resources.structure.BaseURLLiteral");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
}
