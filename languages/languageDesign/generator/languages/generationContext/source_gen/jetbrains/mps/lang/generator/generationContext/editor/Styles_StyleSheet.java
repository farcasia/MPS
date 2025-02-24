package jetbrains.mps.lang.generator.generationContext.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.editor.runtime.style.AbstractStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.kernel.language.ConceptAspectsHelper;

public class Styles_StyleSheet {
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_genContext_operation(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.genContext_operationStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_deprecated(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.deprecatedStyleClass(editorContext, node).apply(style, editorCell);
  }

  public static class genContext_operationStyleClass extends AbstractStyleClass {
    public genContext_operationStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.EDITABLE, true);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.darkGray));
      if (_StyleParameter_QueryFunction_kkd5s1_a3a()) {
        new deprecatedStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
      }
    }

    private boolean _StyleParameter_QueryFunction_kkd5s1_a3a() {
      ConceptPresentation pres = ConceptAspectsHelper.getPresentationAspect(getNode());
      return (pres == null ? false : pres.isDeprecated());
    }
  }
  public static class deprecatedStyleClass extends AbstractStyleClass {
    public deprecatedStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.STRIKE_OUT, true);
    }

  }
}
