package jetbrains.mps.core.xml.sax.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class typeof_XMLSAXChildRule_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_XMLSAXChildRule_InferenceRule() {
  }
  public void applyRule(final SNode childRule, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(childRule, MetaAdapterFactory.getReferenceLink(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2d8L, 0x1f6c736337b5e2dcL, "rule")) == null) {
      return;
    }

    List<SNode> actualArgument = SLinkOperations.getChildren(childRule, MetaAdapterFactory.getContainmentLink(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2d8L, 0xf8c78301aeL, "actualArgument"));
    List<SNode> params = SLinkOperations.getChildren(SLinkOperations.getTarget(childRule, MetaAdapterFactory.getReferenceLink(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2d8L, 0x1f6c736337b5e2dcL, "rule")), MetaAdapterFactory.getContainmentLink(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2f2L, 0xd9be961730be2e2L, "params"));
    if (ListSequence.fromList(actualArgument).count() != ListSequence.fromList(params).count()) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new ReferenceMessageTarget("actualArgument");
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(childRule, "number of arguments doesn't match the declaration", "r:553bcb75-a1cc-4005-9641-b5a2524d9f6a(jetbrains.mps.core.xml.sax.typesystem)", "4720003541458949937", null, errorTarget);
      }
      return;
    }

    {
      Iterator<SNode> arg_it = ListSequence.fromList(actualArgument).iterator();
      Iterator<SNode> param_it = ListSequence.fromList(params).iterator();
      SNode arg_var;
      SNode param_var;
      while (arg_it.hasNext() && param_it.hasNext()) {
        arg_var = arg_it.next();
        param_var = param_it.next();
        if (!(typeCheckingContext.isSingleTypeComputation())) {
          {
            SNode _nodeToCheck_1029348928467 = arg_var;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:553bcb75-a1cc-4005-9641-b5a2524d9f6a(jetbrains.mps.core.xml.sax.typesystem)", "4720003541459243546", 0, null);
            typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:553bcb75-a1cc-4005-9641-b5a2524d9f6a(jetbrains.mps.core.xml.sax.typesystem)", "4720003541459240933", true), (SNode) SLinkOperations.getTarget(param_var, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), true, true, _info_12389875345);
          }
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xdcb5a83a19a844ffL, 0xa4cbfc7d324ecc63L, 0x1f6c736337b5e2d8L, "jetbrains.mps.core.xml.sax.structure.XMLSAXChildRule");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
