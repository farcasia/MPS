package jetbrains.mps.lang.descriptor.generator.template.utils;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.generator.template.TemplateQueryContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class LanguageRuntimeGeneratorUtils {
  public static boolean isAspectOfLanguage(SModel aspectModel, TemplateQueryContext genContext, final SAbstractConcept... rootConcepts) {
    if (aspectModel == null) {
      return false;
    }
    List<SNode> roots = SModelOperations.roots(((SModel) aspectModel), null);
    return (rootConcepts.length == 0 ? ListSequence.fromList(roots).isNotEmpty() : ListSequence.fromList(roots).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        for (SAbstractConcept rootConcept : rootConcepts) {
          if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(it)), SNodeOperations.asSConcept(rootConcept))) {
            return true;
          }
        }
        return false;
      }
    }) != null);
  }

  public static boolean hasManualEditorAspectDescriptor(SModel editorModel) {
    List<SNode> roots = SModelOperations.roots(((SModel) editorModel), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"));
    return ListSequence.fromList(roots).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return "EditorAspectDescriptorImpl".equals(SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
    });
  }

  public static boolean hasStyleAttributeDeclaration(SModel editorModel) {
    List<SNode> roots = SModelOperations.roots(((SModel) editorModel), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1143b151743L, "jetbrains.mps.lang.editor.structure.StyleSheet"));
    return ListSequence.fromList(roots).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x1143b151743L, 0x1143b180146L, "styleClass"))).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x3744c0f9ea5367ebL, "jetbrains.mps.lang.editor.structure.StyleAttributeDeclaration"));
          }
        });
      }
    });
  }

}
