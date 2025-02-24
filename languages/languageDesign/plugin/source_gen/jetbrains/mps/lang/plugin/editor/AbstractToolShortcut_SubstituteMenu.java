package jetbrains.mps.lang.plugin.editor;

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
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import java.util.function.Predicate;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.stream.Collectors;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.lang.editor.menus.substitute.WrapperSubstituteMenuPart;
import jetbrains.mps.editor.runtime.menus.SubstituteItemProxy;
import jetbrains.mps.lang.editor.menus.substitute.SubstituteMenuItemWrapper;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class AbstractToolShortcut_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new AbstractToolShortcut_SubstituteMenu.SMP_Subconcepts_7ty2v0_a());
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new AbstractToolShortcut_SubstituteMenu.SMP_Wrap_7ty2v0_b(), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L, "jetbrains.mps.lang.plugin.structure.CustomToolShortcut")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "AbstractToolShortcut", new SNodePointer("r:00000000-0000-4000-0000-011c89590363(jetbrains.mps.lang.plugin.editor)", "471625927507090144")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Subconcepts_7ty2v0_a extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b5f981L, "jetbrains.mps.lang.plugin.structure.AbstractToolShortcut")).stream().filter(new Predicate<SAbstractConcept>() {
        public boolean test(SAbstractConcept concept) {
          return filterConcept(_context, concept);
        }
      }).collect(Collectors.toList());
    }
    private boolean filterConcept(SubstituteMenuContext _context, SAbstractConcept concept) {
      return !(SConceptOperations.isExactly(SNodeOperations.asSConcept(concept), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L, "jetbrains.mps.lang.plugin.structure.CustomToolShortcut")));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "AbstractToolShortcut", new SNodePointer("r:00000000-0000-4000-0000-011c89590363(jetbrains.mps.lang.plugin.editor)", "471625927507884767")));
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
  private class SMP_Wrap_7ty2v0_b extends WrapperSubstituteMenuPart {
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("wrap " + "default substitute menu for " + "AbstractToolKeystroke", new SNodePointer("r:00000000-0000-4000-0000-011c89590363(jetbrains.mps.lang.plugin.editor)", "471625927507090147")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @NotNull
    @Override
    protected SubstituteMenuItem wrapItem(final SubstituteMenuItem item, final SubstituteMenuContext _context) {
      final SubstituteItemProxy wrappedItem = new SubstituteItemProxy(item);
      return new SubstituteMenuItemWrapper(item) {
        private SNode myCreatedNode;

        @Nullable
        @Override
        public SAbstractConcept getOutputConcept() {
          return MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L, "jetbrains.mps.lang.plugin.structure.CustomToolShortcut");
        }
        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          SNode nodeToWrap = super.createNode(pattern);
          myCreatedNode = nodeToWrap;
          return createCustomToolShortcut_7ty2v0_a0a0b(SNodeOperations.cast(HUtil.copyIfNecessary(nodeToWrap), MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843e384caL, "jetbrains.mps.lang.plugin.structure.AbstractToolKeystroke")));
        }
        @Override
        public void select(@NotNull SNode createdNode, @NotNull String pattern) {
          super.select(myCreatedNode, pattern);
        }
      };
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor);
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843e384caL, "jetbrains.mps.lang.plugin.structure.AbstractToolKeystroke");
    }
  }
  private static SNode createCustomToolShortcut_7ty2v0_a0a0b(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L, "jetbrains.mps.lang.plugin.structure.CustomToolShortcut"), null, null, false);
    if (p0 != null) {
      n1.addChild(MetaAdapterFactory.getContainmentLink(0x28f9e4973b424291L, 0xaeba0a1039153ab1L, 0x68b8d4843b76125L, 0x68b8d4843b765b8L, "changes"), (SNode) p0);
    }
    return n1;
  }
}
