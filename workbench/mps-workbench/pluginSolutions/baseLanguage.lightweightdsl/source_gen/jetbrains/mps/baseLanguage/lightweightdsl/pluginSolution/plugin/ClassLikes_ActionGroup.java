package jetbrains.mps.baseLanguage.lightweightdsl.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import org.jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.SModelInternal;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import com.intellij.openapi.extensions.PluginId;
import org.jetbrains.annotations.Nullable;

public class ClassLikes_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "jetbrains.mps.baseLanguage.lightweightdsl.pluginSolution.plugin.ClassLikes_ActionGroup";
  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = SetSequence.fromSet(new HashSet<Pair<ActionPlace, Condition<BaseAction>>>());
  public ClassLikes_ActionGroup() {
    super("ClassLikes", ID);
    this.setIsInternal(false);
    this.setPopup(false);
  }
  public void doUpdate(AnActionEvent event) {
    removeAll();
    SModel model = MPSCommonDataKeys.MODEL.getData(event.getDataContext());
    if (!(model instanceof DefaultSModelDescriptor)) {
      return;
    }
    Iterable<SLanguage> langs = ((SModelInternal) model).importedLanguageIds();
    Iterable<SNode> descrs = Sequence.fromIterable(langs).select(new ISelector<SLanguage, SModule>() {
      public SModule select(SLanguage it) {
        return it.getSourceModule();
      }
    }).ofType(Language.class).translate(new ITranslator2<Language, SModel>() {
      public Iterable<SModel> translate(Language it) {
        return it.getAccessoryModels();
      }
    }).translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel it) {
        return SModelOperations.roots(((SModel) it), MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d160L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DSLDescriptor"));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d160L, 0x1955e1ca83e5ed92L, "preferredConcept")) != null) && SPropertyOperations.getBoolean(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d160L, 0x1955e1ca83e5ed92L, "preferredConcept")), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xff49c1d648L, "rootable"));
      }
    });

    for (SNode descr : Sequence.fromIterable(descrs)) {
      ClassLikes_ActionGroup.this.addParameterizedAction(new NewClassLike_Action(descr), PluginId.getId("jetbrains.mps.baseLanguage.lightweightdsl.pluginSolution"), descr);
    }
    for (Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      this.addPlace(p.first, p.second);
    }
  }
  public void addPlace(ActionPlace place, @Nullable Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
  }
  public boolean isStrict() {
    return false;
  }
}
