package jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.MenuPart;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.transformation.IncludeSubstituteMenuTransformationMenuPart;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.editor.menus.substitute.NamedSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class NamedTransformationMenu extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.SUBSTITUTE);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "NamedTransformationMenu", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "8998492695591068407")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.SUBSTITUTE).contains(_context.getMenuLocation())) {
      result.add(new NamedTransformationMenu.TMP_IncludeSM_vqydc_a0());
    }
    return result;
  }

  public class TMP_IncludeSM_vqydc_a0 extends IncludeSubstituteMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      SAbstractConcept targetConcept = getTargetConcept(context);
      String name = (targetConcept == null ? "" : targetConcept.getName());
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include substitute menu " + "named substitute menu " + "NamedSubstituteMenu", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "8998492695591068410")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected SubstituteMenuLookup getSubstituteMenuLookup(TransformationMenuContext context) {
      final EditorContext editorContext = context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor.NamedSubstituteMenu");
    }
    private SAbstractConcept getConceptToFindMenuFor(TransformationMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x7ce1116e3a6fb0beL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestSubstituteChild");
    }
  }
}
