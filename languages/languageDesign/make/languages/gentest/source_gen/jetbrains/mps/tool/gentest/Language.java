package jetbrains.mps.tool.gentest;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.runtime.ILanguageAspect;
import jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor;
import jetbrains.mps.smodel.runtime.MakeAspectDescriptor;
import jetbrains.mps.tool.gentest.plugin.FacetAspectDescriptor;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptPresentationAspect;
import jetbrains.mps.tool.gentest.structure.ConceptPresentationAspectImpl;

public class Language extends LanguageRuntime {
  private final SLanguageId myId;

  public Language() {
    myId = SLanguageId.deserialize("3ba7b7cf-6a5a-4981-ba0b-3302e59ffef7");
  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.tool.gentest";
  }

  @Override
  public int getVersion() {
    return 0;
  }

  public SLanguageId getId() {
    return myId;
  }

  @Override
  protected void fillExtendedLanguages(Collection<SLanguage> extendedLanguages) {
  }

  @Override
  protected <T extends ILanguageAspect> T createAspect(Class<T> aspectClass) {
    if (aspectClass == BehaviorAspectDescriptor.class) {
      return aspectClass.cast(new jetbrains.mps.tool.gentest.behavior.BehaviorAspectDescriptor());
    }
    if (aspectClass == MakeAspectDescriptor.class) {
      return aspectClass.cast(new FacetAspectDescriptor());
    }
    if (aspectClass == StructureAspectDescriptor.class) {
      return aspectClass.cast(new jetbrains.mps.tool.gentest.structure.StructureAspectDescriptor());
    }
    if (aspectClass == ConceptPresentationAspect.class) {
      return aspectClass.cast(new ConceptPresentationAspectImpl());
    }
    return null;
  }
}
