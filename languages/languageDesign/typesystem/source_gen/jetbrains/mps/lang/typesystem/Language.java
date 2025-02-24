package jetbrains.mps.lang.typesystem;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ILanguageAspect;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import jetbrains.mps.lang.typesystem.actions.ActionAspectDescriptorImpl;
import jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor;
import jetbrains.mps.lang.dataFlow.framework.DataFlowAspectDescriptor;
import jetbrains.mps.lang.typesystem.dataFlow.DataFlowAspectDescriptorImpl;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import jetbrains.mps.lang.typesystem.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.openapi.intentions.IntentionAspectDescriptor;
import jetbrains.mps.lang.typesystem.intentions.IntentionsDescriptor;
import jetbrains.mps.lang.migration.runtime.base.MigrationAspectDescriptor;
import jetbrains.mps.lang.typesystem.migration.MigrationDescriptor;
import jetbrains.mps.lang.script.runtime.ScriptAspectDescriptor;
import jetbrains.mps.lang.typesystem.scripts.ScriptsDescriptor;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptPresentationAspect;
import jetbrains.mps.lang.typesystem.structure.ConceptPresentationAspectImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.lang.typesystem.typesystem.TypesystemDescriptor;

public class Language extends LanguageRuntime {
  private final SLanguageId myId;

  public Language() {
    myId = SLanguageId.deserialize("7a5dda62-9140-4668-ab76-d5ed1746f2b2");
  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.lang.typesystem";
  }

  @Override
  public int getVersion() {
    return 1;
  }

  public SLanguageId getId() {
    return myId;
  }

  @Override
  protected void fillExtendedLanguages(Collection<SLanguage> extendedLanguages) {
    extendedLanguages.add(MetaAdapterFactory.getLanguage(SLanguageId.deserialize("7866978e-a0f0-4cc7-81bc-4d213d9375e1"), "jetbrains.mps.lang.smodel"));
    extendedLanguages.add(MetaAdapterFactory.getLanguage(SLanguageId.deserialize("f3061a53-9226-4cc5-a443-f952ceaf5816"), "jetbrains.mps.baseLanguage"));
    extendedLanguages.add(MetaAdapterFactory.getLanguage(SLanguageId.deserialize("c72da2b9-7cce-4447-8389-f407dc1158b7"), "jetbrains.mps.lang.structure"));
  }

  @Override
  protected <T extends ILanguageAspect> T createAspect(Class<T> aspectClass) {
    if (aspectClass == ActionAspectDescriptor.class) {
      return aspectClass.cast(new ActionAspectDescriptorImpl());
    }
    if (aspectClass == BehaviorAspectDescriptor.class) {
      return aspectClass.cast(new jetbrains.mps.lang.typesystem.behavior.BehaviorAspectDescriptor());
    }
    if (aspectClass == ConstraintsAspectDescriptor.class) {
      return aspectClass.cast(new jetbrains.mps.lang.typesystem.constraints.ConstraintsAspectDescriptor());
    }
    if (aspectClass == DataFlowAspectDescriptor.class) {
      return aspectClass.cast(new DataFlowAspectDescriptorImpl());
    }
    if (aspectClass == EditorAspectDescriptor.class) {
      return aspectClass.cast(new EditorAspectDescriptorImpl());
    }
    if (aspectClass == IntentionAspectDescriptor.class) {
      return aspectClass.cast(new IntentionsDescriptor());
    }
    if (aspectClass == MigrationAspectDescriptor.class) {
      return aspectClass.cast(new MigrationDescriptor());
    }
    if (aspectClass == ScriptAspectDescriptor.class) {
      return aspectClass.cast(new ScriptsDescriptor());
    }
    if (aspectClass == StructureAspectDescriptor.class) {
      return aspectClass.cast(new jetbrains.mps.lang.typesystem.structure.StructureAspectDescriptor());
    }
    if (aspectClass == ConceptPresentationAspect.class) {
      return aspectClass.cast(new ConceptPresentationAspectImpl());
    }
    if (aspectClass == IHelginsDescriptor.class) {
      return aspectClass.cast(new TypesystemDescriptor());
    }
    return null;
  }
}
