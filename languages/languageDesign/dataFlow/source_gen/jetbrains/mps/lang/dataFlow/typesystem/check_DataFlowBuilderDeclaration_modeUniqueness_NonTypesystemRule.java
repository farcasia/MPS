package jetbrains.mps.lang.dataFlow.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModuleOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.lang.core.behavior.INamedConcept__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_DataFlowBuilderDeclaration_modeUniqueness_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_DataFlowBuilderDeclaration_modeUniqueness_NonTypesystemRule() {
  }
  public void applyRule(final SNode builder, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Language containingLanguage = as_46aqev_a0a0a1(SNodeOperations.getModel(builder).getModule(), Language.class);
    if (containingLanguage == null || SLinkOperations.getTarget(builder, MetaAdapterFactory.getReferenceLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x118e58d76a0L, "conceptDeclaration")) == null) {
      return;
    }


    Map<SNode, List<SNode>> duplicatingDeclarations = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    SModel dataFlowModel = SModuleOperations.getAspect(containingLanguage, "dataFlow");
    if (dataFlowModel != null) {
      List<SNode> roots = SModelOperations.roots(dataFlowModel, MetaAdapterFactory.getConcept(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration"));
      for (SNode root : ListSequence.fromList(roots)) {
        if (root == builder || SLinkOperations.getTarget(root, MetaAdapterFactory.getReferenceLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x118e58d76a0L, "conceptDeclaration")) != SLinkOperations.getTarget(builder, MetaAdapterFactory.getReferenceLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x118e58d76a0L, "conceptDeclaration"))) {
          continue;
        }
        if (ListSequence.fromList(SLinkOperations.getChildren(builder, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x6e8db6877fd04efbL, "modes"))).isEmpty() && ListSequence.fromList(SLinkOperations.getChildren(root, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x6e8db6877fd04efbL, "modes"))).isEmpty()) {
          MapSequence.fromMap(duplicatingDeclarations).put(root, ListSequence.fromList(new ArrayList<SNode>()));
        } else {
          for (SNode myMode : ListSequence.fromList(SLinkOperations.getChildren(builder, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x6e8db6877fd04efbL, "modes")))) {
            if (ListSequence.fromList(SLinkOperations.getChildren(root, MetaAdapterFactory.getContainmentLink(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, 0x6e8db6877fd04efbL, "modes"))).select(new ISelector<SNode, SConcept>() {
              public SConcept select(SNode it) {
                return SNodeOperations.getConcept(it);
              }
            }).contains(SNodeOperations.getConcept(myMode))) {
              if (MapSequence.fromMap(duplicatingDeclarations).get(root) == null) {
                MapSequence.fromMap(duplicatingDeclarations).put(root, ListSequence.fromList(new ArrayList<SNode>()));
              }
              ListSequence.fromList(MapSequence.fromMap(duplicatingDeclarations).get(root)).addElement(myMode);
            }
          }
        }
      }
    }

    if (SetSequence.fromSet(MapSequence.fromMap(duplicatingDeclarations).keySet()).isNotEmpty()) {
      for (SNode duplicatingDecl : SetSequence.fromSet(MapSequence.fromMap(duplicatingDeclarations).keySet())) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(builder, "Conflicting modes. Data flow builder" + ((ListSequence.fromList(MapSequence.fromMap(duplicatingDeclarations).get(duplicatingDecl)).isEmpty() ? "" : "  with modes (" + ListSequence.fromList(MapSequence.fromMap(duplicatingDeclarations).get(duplicatingDecl)).select(new ISelector<SNode, String>() {
            public String select(SNode it) {
              return SNodeOperations.getConcept(it).getName();
            }
          }).reduceLeft(new ILeftCombinator<String, String>() {
            public String combine(String a, String b) {
              return a + " , " + b;
            }
          }) + ")")) + " was defined in: " + INamedConcept__BehaviorDescriptor.getFqName_idhEwIO9y.invoke(duplicatingDecl), "r:00000000-0000-4000-0000-011c8959037a(jetbrains.mps.lang.dataFlow.typesystem)", "6246554009626560906", null, errorTarget);
        }
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x7fa12e9cb9494976L, 0xb4fa19accbc320b4L, 0x118e58cd635L, "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static <T> T as_46aqev_a0a0a1(Object o, Class<T> type) {
    return (type.isInstance(o) ? (T) o : null);
  }
}
