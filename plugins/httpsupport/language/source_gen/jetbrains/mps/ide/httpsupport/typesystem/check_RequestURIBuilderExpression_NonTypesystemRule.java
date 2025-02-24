package jetbrains.mps.ide.httpsupport.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.ide.httpsupport.behavior.RequestURLBuilderExpression__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ide.httpsupport.behavior.RequestHandler__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_RequestURIBuilderExpression_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_RequestURIBuilderExpression_NonTypesystemRule() {
  }
  public void applyRule(final SNode requestURIBuilderExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(requestURIBuilderExpression, MetaAdapterFactory.getReferenceLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5ce93L, 0x4027f9073ff5cebeL, "requestHandler")) != null) {
      final Iterable<SNode> initializedParameters = RequestURLBuilderExpression__BehaviorDescriptor.getInitializedParameters_id40BYgt09_iZ.invoke(requestURIBuilderExpression);
      boolean allRequiredParams = Sequence.fromIterable(RequestHandler__BehaviorDescriptor.getRequieredParameters_id40BYgsZXRLw.invoke(SLinkOperations.getTarget(requestURIBuilderExpression, MetaAdapterFactory.getReferenceLink(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5ce93L, 0x4027f9073ff5cebeL, "requestHandler")))).all(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Sequence.fromIterable(initializedParameters).contains(it);
        }
      });

      if (!(allRequiredParams)) {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(requestURIBuilderExpression, "All required parameters should be initialized", "r:c79f1d68-0099-426e-a3a4-72db4a9f1693(jetbrains.mps.ide.httpsupport.typesystem)", "4622937352052456453", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x817e4e70961e4a95L, 0x98a115e9f32231f1L, 0x4027f9073ff5ce93L, "jetbrains.mps.ide.httpsupport.structure.RequestURLBuilderExpression");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
