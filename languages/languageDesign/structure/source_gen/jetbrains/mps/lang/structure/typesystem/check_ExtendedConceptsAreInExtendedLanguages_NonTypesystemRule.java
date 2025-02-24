package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.kernel.model.SModelUtil;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_ExtendedConceptsAreInExtendedLanguages_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ExtendedConceptsAreInExtendedLanguages_NonTypesystemRule() {
  }
  public void applyRule(final SNode cd, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Language language = SModelUtil.getDeclaringLanguage(cd);
    if (language == null) {
      return;
    }
    Set<Language> extendedLanguages = language.getAllExtendedLanguages();
    List<SNode> superConcepts = new ArrayList<SNode>();
    if (SNodeOperations.isInstanceOf(cd, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
      ListSequence.fromList(superConcepts).addElement(SLinkOperations.getTarget(SNodeOperations.as(cd, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")), MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends")));
      // for implemented interfaces, we do not require extends between languages. 
      // I'm not quite sure we shall demand extends between languages even for super-concepts, but it's just too much to lift this restriction now ;) 
      // Generally, however, it seems reasonable to demand extends in super-concepts case, as it means re-use of functionality, and absence of this 
      // constraint would encourage people to have bad design and extend concepts they shall not extend. OTOH, each language extending lang.core look odd. 
    } else if (SNodeOperations.isInstanceOf(cd, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"))) {
      ListSequence.fromList(superConcepts).addSequence(Sequence.fromIterable(SLinkOperations.collect(SLinkOperations.getChildren(SNodeOperations.as(cd, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration")), MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103556dcafL, 0x110356e9df4L, "extends")), MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc"))));
    }
    for (SNode superConcept : superConcepts) {
      Language conceptLanguage = SModelUtil.getDeclaringLanguage(superConcept);
      if (conceptLanguage == null || conceptLanguage == language) {
        continue;
      }
      if (!(SetSequence.fromSet(extendedLanguages).contains(conceptLanguage))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget("name");
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(cd, "language " + conceptLanguage.getModuleName() + " of concept " + SPropertyOperations.getString(superConcept, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " is not extended by " + language.getModuleName(), "r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "1235136520823", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.structure.typesystem.AddExtendedLanguage_QuickFix", false);
            intentionProvider.putArgument("extLang", conceptLanguage);
            intentionProvider.putArgument("lang", language);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
        break;
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
