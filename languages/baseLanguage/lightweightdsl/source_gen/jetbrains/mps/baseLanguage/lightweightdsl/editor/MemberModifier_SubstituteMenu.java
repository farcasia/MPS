package jetbrains.mps.baseLanguage.lightweightdsl.editor;

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
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.function.Predicate;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.stream.Collectors;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class MemberModifier_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new MemberModifier_SubstituteMenu.SMP_Subconcepts_aj0y4j_a());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "MemberModifier", new SNodePointer("c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:60fc5d65-00f5-411a-8513-c8d5fe6ffc51(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.editor)", "1741258697586929252")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Subconcepts_aj0y4j_a extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getInterfaceConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x2f38f33681e6c5feL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MemberModifier")).stream().filter(new Predicate<SAbstractConcept>() {
        public boolean test(SAbstractConcept concept) {
          return filterConcept(_context, concept);
        }
      }).collect(Collectors.toList());
    }
    private boolean filterConcept(SubstituteMenuContext _context, SAbstractConcept concept) {
      return Sequence.fromIterable(SNodeOperations.ofConcept(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(_context.getParentNode(), MetaAdapterFactory.getInterfaceConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x72b255a0447fe4c7L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DSLClassMember"), true, false), MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x72b255a0447fe4c7L, 0x2f38f33681e6c568L, "modifier")), SNodeOperations.asSConcept(concept))).isEmpty();
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "MemberModifier", new SNodePointer("c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:60fc5d65-00f5-411a-8513-c8d5fe6ffc51(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.editor)", "1741258697586929709")));
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
