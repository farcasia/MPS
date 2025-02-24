package jetbrains.mps.samples.secretCompartmentLanguage.editor;

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

public class StateMachineTest_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new StateMachineTest_SubstituteMenu.SMP_ReferenceScope_4nt6vc_a(), MetaAdapterFactory.getConcept(0x6986543d82184ebfL, 0xa2e9565e5049c1ceL, 0x116c17a1865L, "jetbrains.mps.samples.secretCompartmentLanguage.structure.StateMachineTest")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for StateMachineTest. Generated from implicit smart reference attribute.", new SNodePointer("r:00000000-0000-4000-0000-011c8959042e(jetbrains.mps.samples.secretCompartmentLanguage.structure)", "1197246912613")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_4nt6vc_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_4nt6vc_a() {
      super(MetaAdapterFactory.getConcept(0x6986543d82184ebfL, 0xa2e9565e5049c1ceL, 0x116c17a1865L, "jetbrains.mps.samples.secretCompartmentLanguage.structure.StateMachineTest"), MetaAdapterFactory.getReferenceLink(0x6986543d82184ebfL, 0xa2e9565e5049c1ceL, 0x116c17a1865L, 0x116c1878903L, "stateMachine"));
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
