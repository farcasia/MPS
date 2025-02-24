package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.lib.ui.ListPanel;
import org.jetbrains.mps.openapi.model.SNodeReference;
import java.util.function.Function;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.module.SRepository;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.smodel.ModelAccessHelper;
import jetbrains.mps.util.Computable;
import java.util.List;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import java.util.Set;
import org.jetbrains.mps.openapi.module.FindUsagesFacade;
import jetbrains.mps.project.GlobalScope;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.ide.platform.dialogs.choosers.NodeChooserDialog;
import jetbrains.mps.workbench.choose.ChooseByNameData;
import jetbrains.mps.workbench.choose.NodesPresentation;

public class PluginsListPanel extends ListPanel<SNodeReference> {
  private final Function<SNode, String> myPluginNameFunc = new Function<SNode, String>() {
    public String apply(SNode n) {
      return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.as(n, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb6eL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_Plugin")), MetaAdapterFactory.getReferenceLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb6eL, 0x5b7be37b4dee5919L, "plugin")), MetaAdapterFactory.getProperty(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb74L, 0x5b7be37b4de9bb6fL, "id"));
    }
  };

  public PluginsListPanel(Project p) {
    super(p, "Plugins to deploy");
  }

  @Override
  protected SNodeReference wrap(SNode node) {
    return new SNodePointer(node);
  }
  @Override
  protected SNodeReference unwrap(SNodeReference reference) {
    return reference;
  }

  @Override
  protected String getFqName(final SNodeReference element) {
    final SRepository repo = ProjectHelper.getProjectRepository(myProject);
    return new ModelAccessHelper(repo).runReadAction(new Computable<String>() {
      public String compute() {
        return myPluginNameFunc.apply(element.resolve(repo));
      }
    });
  }

  @Override
  protected List<SNodeReference> collectCandidates(final ProgressMonitor progress) {
    final SRepository repo = ProjectHelper.getProjectRepository(myProject);
    return new ModelAccessHelper(repo).runReadAction(new Computable<List<SNodeReference>>() {
      public List<SNodeReference> compute() {
        Set<SNode> usages = FindUsagesFacade.getInstance().findInstances(GlobalScope.getInstance(), Collections.singleton(MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x5b7be37b4de9bb6eL, "jetbrains.mps.build.mps.structure.BuildMpsLayout_Plugin")), false, progress);
        List<SNodeReference> rv = ListSequence.fromList(new ArrayList<SNodeReference>());
        for (SNode node : SetSequence.fromSet(usages)) {
          ListSequence.fromList(rv).addElement(node.getReference());
        }
        return rv;
      }
    });
  }

  @Override
  public NodeChooserDialog createNodeChooserDialog(List<SNodeReference> nodesList) {
    ChooseByNameData d = new ChooseByNameData(new NodesPresentation(ProjectHelper.getProjectRepository(myProject), myPluginNameFunc));
    d.derivePrompts("node").setScope(nodesList, Collections.emptySet());
    return new NodeChooserDialog(myProject, d);
  }
}
