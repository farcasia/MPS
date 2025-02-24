package jetbrains.mps.lang.actions.editor;

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

public class SideTransformHintSubstituteActionsBuilder_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SideTransformHintSubstituteActionsBuilder_SubstituteMenu.SMP_ReferenceScope_rp8b1e_a(), MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for SideTransformHintSubstituteActionsBuilder. Generated from implicit smart reference attribute.", new SNodePointer("r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)", "1138079221458")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_rp8b1e_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_rp8b1e_a() {
      super(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder"), MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x108facec6d6L, "applicableConcept"));
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
