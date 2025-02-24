package jetbrains.mps.lang.editor.diagram.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;

public class ExternalFigureReference_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new ExternalFigureReference_SubstituteMenu.SMP_ReferenceScope_2fg9j2_a(), MetaAdapterFactory.getConcept(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a655cbL, "jetbrains.mps.lang.editor.diagram.structure.ExternalFigureReference")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for ExternalFigureReference. Generated from implicit smart reference attribute.", new SNodePointer("r:5181c66d-005f-421e-88f2-2c6d80a7738d(jetbrains.mps.lang.editor.diagram.structure)", "1094405431463663051")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_2fg9j2_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_2fg9j2_a() {
      super(MetaAdapterFactory.getConcept(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a655cbL, "jetbrains.mps.lang.editor.diagram.structure.ExternalFigureReference"), MetaAdapterFactory.getReferenceLink(0x6106f6117a7442d1L, 0x80deedc5c602bfd1L, 0xf301bf106a655cbL, 0xf301bf106a65713L, "figure"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("reference scope substitute menu part", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

  }
}
