package jetbrains.mps.ide.httpsupport.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_RequestHandler_inPluginModel_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_RequestHandler_inPluginModel_NonTypesystemRule() {
  }
  public void applyRule(final SNode requestHandler, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    String modelName = SModelOperations.getModelName(SNodeOperations.getModel(requestHandler));
    String correctName = SPropertyOperations.getString(SModelOperations.getModuleStub(SNodeOperations.getModel(requestHandler)), MetaAdapterFactory.getProperty(0x86ef829012bb4ca7L, 0x947f093788f263a9L, 0x5869770da61dfe1eL, 0x5869770da61dfe23L, "namespace")) + ".plugin";

    if (!(modelName.equals(correctName))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(requestHandler, "Request Handler instances must be in plugin model", "r:c79f1d68-0099-426e-a3a4-72db4a9f1693(jetbrains.mps.ide.httpsupport.typesystem)", "581054598747850724", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4d5ac72154f4d780L, "jetbrains.mps.ide.httpsupport.structure.RequestHandler");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
