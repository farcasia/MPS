package jetbrains.mps.lang.findUsages.editor;

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

public class FinderDeclaration_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new FinderDeclaration_SubstituteMenu.SMP_ReferenceScope_75v9oi_a(), MetaAdapterFactory.getConcept(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x116b5695a8dL, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for FinderDeclaration. Generated from implicit smart reference attribute.", new SNodePointer("r:00000000-0000-4000-0000-011c8959035b(jetbrains.mps.lang.findUsages.structure)", "1197044488845")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_75v9oi_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_75v9oi_a() {
      super(MetaAdapterFactory.getConcept(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x116b5695a8dL, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), MetaAdapterFactory.getReferenceLink(0x64d34fcdad024e73L, 0xaff8a581124c2e30L, 0x11bd0c17f12L, 0x11bd0c2f241L, "forConcept"));
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
