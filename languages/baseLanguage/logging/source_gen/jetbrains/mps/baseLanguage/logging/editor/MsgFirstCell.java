package jetbrains.mps.baseLanguage.logging.editor;

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

public class MsgFirstCell extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.SUBSTITUTE);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named transformation menu " + "MsgFirstCell", new SNodePointer("r:00000000-0000-4000-0000-011c8959057d(jetbrains.mps.baseLanguage.logging.editor)", "6057591418743177400")));
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
      result.add(new MsgFirstCell.TMP_IncludeSM_yyvtuw_a0());
    }
    return result;
  }

  public class TMP_IncludeSM_yyvtuw_a0 extends IncludeSubstituteMenuTransformationMenuPart {
    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      SAbstractConcept targetConcept = getTargetConcept(context);
      String name = (targetConcept == null ? "" : targetConcept.getName());
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include substitute menu " + "named substitute menu " + "ReplaceMessageWithLog", new SNodePointer("r:00000000-0000-4000-0000-011c8959057d(jetbrains.mps.baseLanguage.logging.editor)", "6057591418743177975")));
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
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.logging.editor.ReplaceMessageWithLog");
    }
    private SAbstractConcept getConceptToFindMenuFor(TransformationMenuContext _context) {
      return MetaAdapterFactory.getConcept(0x760a0a8ceabb4521L, 0x8bfd65db761a9ba3L, 0x57e2cf14f6d5a71dL, "jetbrains.mps.baseLanguage.logging.structure.MsgStatement");
    }
  }
}
