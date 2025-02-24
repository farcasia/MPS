package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.SimpleConceptSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class StopStatement_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new StopStatement_SubstituteMenu.SMP_Group_zaqlh_a());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "StopStatement", new SNodePointer("r:00000000-0000-4000-0000-011c8959032a(jetbrains.mps.baseLanguage.collections.editor)", "2722384699545533373")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Group_zaqlh_a extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
    @Override
    protected boolean isApplicable(SubstituteMenuContext _context) {
      SNode cl = SNodeOperations.getNodeAncestor(_context.getParentNode(), MetaAdapterFactory.getConcept(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), true, false);
      SNode parent = SNodeOperations.getParent(cl);
      return (cl != null) || (SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x1188e700c31L, "jetbrains.mps.baseLanguage.collections.structure.VisitAllOperation")) || SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x117d06362dcL, "jetbrains.mps.baseLanguage.collections.structure.TranslateOperation")) || SNodeOperations.isInstanceOf(parent, MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d14c97b16L, "jetbrains.mps.baseLanguage.collections.structure.SequenceCreator")));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c8959032a(jetbrains.mps.baseLanguage.collections.editor)", "2722384699545533374")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
      return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new ConstraintsFilteringSubstituteMenuPartDecorator(new SimpleConceptSubstituteMenuPart(MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d17046bf4L, "jetbrains.mps.baseLanguage.collections.structure.StopStatement")) {

        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("simple substitute menu part for concept: " + "StopStatement", new SNodePointer("r:00000000-0000-4000-0000-011c8959032a(jetbrains.mps.baseLanguage.collections.editor)", "2722384699545533407")));
          try {
            return super.createItems(context);
          } finally {
            context.getEditorMenuTrace().popTraceInfo();
          }
        }
      }, MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d17046bf4L, "jetbrains.mps.baseLanguage.collections.structure.StopStatement")), new StopStatement_SubstituteMenu.SMP_Group_zaqlh_a.SMP_Subconcepts_zaqlh_b0());
    }
    public class SMP_Subconcepts_zaqlh_b0 extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
      protected Collection getConcepts(final SubstituteMenuContext _context) {
        return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x11d17046bf4L, "jetbrains.mps.baseLanguage.collections.structure.StopStatement"));
      }
      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "StopStatement", new SNodePointer("r:00000000-0000-4000-0000-011c8959032a(jetbrains.mps.baseLanguage.collections.editor)", "2722384699545533408")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }

      @Override
      protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
        return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
      }
    }
  }
}
