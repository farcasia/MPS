package jetbrains.mps.testbench.junit.suites;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SModule;
import org.junit.Assume;
import java.util.Objects;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.junit.Test;

public class MPSAuditConstraints extends AuditConstraints {
  public MPSAuditConstraints(SModule module) {
    super(module);
  }
  private void processExcludedModules() {
    Assume.assumeTrue("too much red code", !(Objects.equals(myModule.getModuleReference(), PersistenceFacade.getInstance().createModuleReference("857d0a79-6f44-4f46-84ed-9c5b42632011(jetbrains.mps.baseLanguage.closures#1199623535494)"))));
    Assume.assumeTrue("internal concept is marked as not rootable", !(Objects.equals(myModule.getModuleReference(), PersistenceFacade.getInstance().createModuleReference("e45a8b22-94f2-427f-b849-77f254c4eef5(jetbrains.mps.lang.aspect#3274906159125927726)"))));
    Assume.assumeTrue("broken skope with no possibility to suppress error", !(Objects.equals(myModule.getModuleReference(), PersistenceFacade.getInstance().createModuleReference("9b03dd0d-f0d2-42fc-8909-d7710e678ca3(jetbrains.mps.build.mps#3189788309732033979)"))));
  }
  @Test
  @Override
  public void checkConstraints() {
    processExcludedModules();

    super.checkConstraints();
  }
}
