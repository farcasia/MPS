package jetbrains.mps.lang.textGen.editor;

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

public class OperationCall_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new OperationCall_SubstituteMenu.SMP_ReferenceScope_pkbewp_a(), MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x11f4ba6faaaL, "jetbrains.mps.lang.textGen.structure.OperationCall")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for OperationCall. Generated from implicit smart reference attribute.", new SNodePointer("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)", "1233924848298")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public static class SMP_ReferenceScope_pkbewp_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_pkbewp_a() {
      super(MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x11f4ba6faaaL, "jetbrains.mps.lang.textGen.structure.OperationCall"), MetaAdapterFactory.getReferenceLink(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x11f4ba6faaaL, 0x11f5b7f02d9L, "function"));
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
