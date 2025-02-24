package jetbrains.mps.lang.resources.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_TextIcon_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_TextIcon_NonTypesystemRule() {
  }
  public void applyRule(final SNode textIcon, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Set<String> usedIds = SetSequence.fromSet(new HashSet<String>());
    for (SNode ti : ListSequence.fromList(SModelOperations.nodes(SNodeOperations.getModel(textIcon), MetaAdapterFactory.getConcept(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x26417c37742e0d45L, "jetbrains.mps.lang.resources.structure.TextIcon")))) {
      if (SetSequence.fromSet(usedIds).contains(SPropertyOperations.getString(ti, MetaAdapterFactory.getProperty(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x26417c37742e0d45L, 0x12dbb53bb6b60039L, "iconId")))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget("iconId");
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(ti, "duplicate ID", "r:cafe8450-2876-42f2-9c43-75da10155c47(jetbrains.mps.lang.resources.typesystem)", "1860120738943515427", null, errorTarget);
        }
        break;
      }

      SetSequence.fromSet(usedIds).addElement(SPropertyOperations.getString(ti, MetaAdapterFactory.getProperty(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x26417c37742e0d45L, 0x12dbb53bb6b60039L, "iconId")));
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x982eb8df2c964bd7L, 0x996311712ea622e5L, 0x26417c37742e0d45L, "jetbrains.mps.lang.resources.structure.TextIcon");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
