package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.dependency.GlobalModuleDependenciesManager;
import java.util.Collection;
import jetbrains.mps.baseLanguage.behavior.Classifier__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class CheckExtendedClassIsImported_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public CheckExtendedClassIsImported_NonTypesystemRule() {
  }
  public void applyRule(final SNode classifierType, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode classifier = SLinkOperations.getTarget(classifierType, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"));
    if (classifier == null) {
      return;
    }
    SModule module = classifierType.getModel().getModule();

    GlobalModuleDependenciesManager depManager = new GlobalModuleDependenciesManager(module);

    Collection<SModule> deps = depManager.getModules(GlobalModuleDependenciesManager.Deptype.COMPILE);
    for (SNode extendedClassifierType : Classifier__BehaviorDescriptor.getExtendedClassifierTypes_id1UeCwxlWKny.invoke(classifier)) {
      SNode extendedClassifier = SLinkOperations.getTarget(extendedClassifierType, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"));
      if (extendedClassifier == SNodeOperations.getNode("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)", "~Object")) {
        continue;
      }
      SModule classifierModule = extendedClassifier.getModel().getModule();
      assert classifierModule != null;
      if (!(deps.contains(classifierModule))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(classifierType, "The definition of some ancestor of " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(extendedClassifier) + " classifier is not visible from this module", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8421390612612470765", null, errorTarget);
        }

      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
