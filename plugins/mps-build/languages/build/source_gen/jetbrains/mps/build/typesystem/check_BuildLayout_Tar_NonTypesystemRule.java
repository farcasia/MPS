package jetbrains.mps.build.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.build.behavior.BuildString__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_BuildLayout_Tar_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_BuildLayout_Tar_NonTypesystemRule() {
  }
  public void applyRule(final SNode tarArchive, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    String approxName = BuildString__BehaviorDescriptor.getText_id3NagsOfTioI.invoke(SLinkOperations.getTarget(tarArchive, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, 0x3cca41cd0fe75496L, "containerName")), null);
    String ext = ".tar";
    if (SPropertyOperations.hasValue(tarArchive, MetaAdapterFactory.getProperty(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7709f0532a526203L, 0x1b76dbd13de88928L, "compression"), "bzip2", "none")) {
      ext = ".tar.bz2";
    } else if (SPropertyOperations.hasValue(tarArchive, MetaAdapterFactory.getProperty(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7709f0532a526203L, 0x1b76dbd13de88928L, "compression"), "gzip", "none")) {
      ext = ".tar.gz";
    }
    if (!(approxName.endsWith("}")) && !(approxName.toLowerCase().endsWith(ext))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(SLinkOperations.getTarget(tarArchive, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x668c6cfbafac7f8cL, 0x3cca41cd0fe75496L, "containerName")), "should end with `" + ext + "'", "r:2349e4dd-6518-4a4c-9022-c7887bed8b52(jetbrains.mps.build.typesystem)", "1979010778009323432", null, errorTarget);
        {
          BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.build.typesystem.fixContainerName_QuickFix", false);
          intentionProvider.putArgument("newExtension", ext);
          _reporter_2309309498.addIntentionProvider(intentionProvider);
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x7709f0532a526203L, "jetbrains.mps.build.structure.BuildLayout_Tar");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
