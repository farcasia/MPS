package jetbrains.mps.build.workflow.editor;

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

public class BwfJavaModuleReference_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new BwfJavaModuleReference_SubstituteMenu.SMP_ReferenceScope_w9a1py_a(), MetaAdapterFactory.getConcept(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L, "jetbrains.mps.build.workflow.structure.BwfJavaModuleReference")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for BwfJavaModuleReference. Generated from implicit smart reference attribute.", new SNodePointer("r:ed179f4d-7cf2-479d-8348-50c1fc63b96a(jetbrains.mps.build.workflow.structure)", "4755209551904389316")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_w9a1py_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_w9a1py_a() {
      super(MetaAdapterFactory.getConcept(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L, "jetbrains.mps.build.workflow.structure.BwfJavaModuleReference"), MetaAdapterFactory.getReferenceLink(0x698a8d22a10447a0L, 0xba8d10e3ec237f13L, 0x41fde5e4adce38c4L, 0x41fde5e4adce38c5L, "target"));
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
