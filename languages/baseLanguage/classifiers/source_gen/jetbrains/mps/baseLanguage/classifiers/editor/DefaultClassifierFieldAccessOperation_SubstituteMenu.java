package jetbrains.mps.baseLanguage.classifiers.editor;

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

public class DefaultClassifierFieldAccessOperation_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new DefaultClassifierFieldAccessOperation_SubstituteMenu.SMP_ReferenceScope_6scv6e_a(), MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x11aa7fc7570L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for DefaultClassifierFieldAccessOperation. Generated from implicit smart reference attribute.", new SNodePointer("r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)", "1213999117680")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_6scv6e_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_6scv6e_a() {
      super(MetaAdapterFactory.getConcept(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x11aa7fc7570L, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation"), MetaAdapterFactory.getReferenceLink(0x443f4c36fcf54eb6L, 0x95008d06ed259e3eL, 0x118bca97396L, 0x118bcb657ecL, "member"));
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
