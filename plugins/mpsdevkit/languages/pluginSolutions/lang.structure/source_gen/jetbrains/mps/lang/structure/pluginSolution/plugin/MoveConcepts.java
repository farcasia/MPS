package jetbrains.mps.lang.structure.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.platform.actions.core.MoveNodesAction;
import jetbrains.mps.smodel.structure.Extension;
import jetbrains.mps.project.MPSProject;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.ide.platform.actions.core.MoveNodesUtil;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.ide.ui.dialogs.properties.choosers.CommonChoosers;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.ide.platform.refactoring.NodeLocation;

public class MoveConcepts implements MoveNodesAction {

  public static class MoveConcepts_extension extends Extension.Default<MoveNodesAction> {
    public MoveConcepts_extension() {
      super("jetbrains.mps.ide.platform.MoveNodesActionEP");
    }
    public MoveNodesAction get() {
      return new MoveConcepts();
    }
  }
  private static final String NAME = "Move Concepts";
  public String getName() {
    return NAME;
  }
  public boolean isApplicable(MPSProject project, final List<SNode> target) {
    if (!(MoveNodesUtil.areSiblings(target, project.getRepository()))) {
      return false;
    }
    final Wrappers._boolean result = new Wrappers._boolean();
    project.getRepository().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        result.value = ListSequence.fromList(target).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
          }
        });
      }
    });
    return result.value;
  }
  public void execute(final MPSProject project, List<SNode> nodesToMove) {
    final List<SNode> conceptsToMove = Sequence.fromIterable(SNodeOperations.ofConcept(nodesToMove, MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))).toListSequence();

    final Wrappers._boolean hasGenerator = new Wrappers._boolean(false);
    project.getRepository().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        hasGenerator.value = ListSequence.fromList(conceptsToMove).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode node) {
            return ListSequence.fromList(AbstractConceptDeclaration__BehaviorDescriptor.findGeneratorFragments_id5zMz2aJEI4B.invoke(node)).isNotEmpty();
          }
        });
      }
    });
    if (hasGenerator.value) {
      Messages.showWarningDialog(project.getProject(), "Generator fragments will not be moved.", NAME);
    }

    final Wrappers._T<List<SModelReference>> structureModels = new Wrappers._T<List<SModelReference>>();
    project.getRepository().getModelAccess().runReadAction(new _Adapters._return_P0_E0_to_Runnable_adapter(new _FunctionTypes._return_P0_E0<List<SModelReference>>() {
      public List<SModelReference> invoke() {
        Iterable<SModule> modules = project.getProjectModules();
        return structureModels.value = Sequence.fromIterable(modules).ofType(Language.class).select(new ISelector<Language, SModelReference>() {
          public SModelReference select(Language it) {
            return check_u6ijv2_a0a0a0a0a1a0h0f(it.getStructureModelDescriptor());
          }
        }).where(new IWhereFilter<SModelReference>() {
          public boolean accept(SModelReference it) {
            return it != null;
          }
        }).toListSequence();
      }
    }));
    final SModelReference targetModelRef = CommonChoosers.showModelChooser(project, NAME, structureModels.value);
    if (targetModelRef == null) {
      return;
    }

    final Wrappers._T<SModel> targetModel = new Wrappers._T<SModel>();
    project.getRepository().getModelAccess().runReadAction(new Runnable() {
      public void run() {
        targetModel.value = targetModelRef.resolve(project.getRepository());
      }
    });

    MoveNodesUtil.moveTo(project, getName(), MapSequence.<MoveNodesUtil.NodeProcessor, List<SNode>>fromMapAndKeysArray(new HashMap<MoveNodesUtil.NodeProcessor, List<SNode>>(), new MoveNodesUtil.NodeCreatingProcessor(new NodeLocation.NodeLocationRoot(targetModel.value), project)).withValues(nodesToMove));
  }

  private static SModelReference check_u6ijv2_a0a0a0a0a1a0h0f(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getReference();
    }
    return null;
  }
}
