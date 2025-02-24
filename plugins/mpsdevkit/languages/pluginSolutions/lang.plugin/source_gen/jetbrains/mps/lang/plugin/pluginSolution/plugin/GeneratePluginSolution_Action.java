package jetbrains.mps.lang.plugin.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.newModuleDialogs.NewSolutionDialog;
import jetbrains.mps.project.Solution;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.extapi.model.SModelBase;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.project.structure.modules.SolutionKind;
import jetbrains.mps.ide.projectPane.ProjectPane;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class GeneratePluginSolution_Action extends BaseAction {
  private static final Icon ICON = AllIcons.Nodes.Plugin;

  public GeneratePluginSolution_Action() {
    super("Plugin Solution", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      MPSProject p = event.getData(MPSCommonDataKeys.MPS_PROJECT);
      if (p == null) {
        return false;
      }
    }
    {
      String p = event.getData(MPSDataKeys.NAMESPACE);
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    NewSolutionDialog dialog = new NewSolutionDialog(event.getData(MPSCommonDataKeys.MPS_PROJECT), event.getData(MPSDataKeys.NAMESPACE));
    dialog.show();
    final Solution s = dialog.getModule();
    if (s == null) {
      return;
    }

    event.getData(MPSCommonDataKeys.MPS_PROJECT).getModelAccess().executeCommand(new Runnable() {
      public void run() {
        ModelRoot defaultRoot = s.getModelRoots().iterator().next();
        SModel newModel = defaultRoot.createModel(s.getModuleName() + ".plugin");

        ((SModelBase) newModel).addLanguage(MetaAdapterFactory.getLanguage(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, "jetbrains.mps.lang.plugin"));
        ((SModelBase) newModel).addLanguage(MetaAdapterFactory.getLanguage(0xef7bf5acd06c4342L, 0xb11de42104eb9343L, "jetbrains.mps.lang.plugin.standalone"));
        ((SModelBase) newModel).addLanguage(MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel"));
        ((SModelBase) newModel).addLanguage(MetaAdapterFactory.getLanguage(0x63650c5916c8498aL, 0x99c8005c7ee9515dL, "jetbrains.mps.lang.access"));
        ((SModelBase) newModel).addLanguage(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"));

        SModelOperations.addRootNode(newModel, _quotation_createNode_ljjiw0_a0a9a0a0a0a5a0());

        s.getModuleDescriptor().setKind(SolutionKind.PLUGIN_OTHER);
        event.getData(MPSCommonDataKeys.MPS_PROJECT).getRepository().saveAll();
      }
    });

    ProjectPane projectPane = ProjectPane.getInstance(event.getData(MPSCommonDataKeys.MPS_PROJECT));
    projectPane.selectModule(s, false);
  }
  private static SNode _quotation_createNode_ljjiw0_a0a9a0a0a0a5a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xef7bf5acd06c4342L, 0xb11de42104eb9343L, "jetbrains.mps.lang.plugin.standalone"), 0x685ef16bc1750e9cL, "StandalonePluginDescriptor"), null, null, false);
    return quotedNode_1;
  }
}
