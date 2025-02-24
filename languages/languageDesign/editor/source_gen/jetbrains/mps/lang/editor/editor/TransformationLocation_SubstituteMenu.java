package jetbrains.mps.lang.editor.editor;

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
import jetbrains.mps.util.Computable;
import java.util.Objects;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.editor.actions.TransformationMenuActionsUtil;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.SimpleConceptSubstituteMenuPart;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;

public class TransformationLocation_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new TransformationLocation_SubstituteMenu.SMP_Group_fvfxl9_a());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "TransformationLocation", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587150505")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Group_fvfxl9_a extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
    private boolean condition;
    @Override
    protected void initialize(SubstituteMenuContext _context) {
      super.initialize(_context);
      condition = new Computable<Boolean>() {
        public Boolean compute() {
          return Objects.equals(_context.getLink(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations"));
        }
      }.compute();
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587150506")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
      return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new TransformationLocation_SubstituteMenu.SMP_Group_fvfxl9_a.SMP_Group_fvfxl9_a0(), new TransformationLocation_SubstituteMenu.SMP_Group_fvfxl9_a.SMP_Group_fvfxl9_b0());
    }
    public class SMP_Group_fvfxl9_a0 extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
      @Override
      protected boolean isApplicable(SubstituteMenuContext _context) {
        return condition;
      }
      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587150547")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }

      @Override
      protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
        return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new ConstraintsFilteringSubstituteMenuPartDecorator(new TransformationLocation_SubstituteMenu.SMP_Group_fvfxl9_a.SMP_Group_fvfxl9_a0.SMP_Concepts_fvfxl9_a0a(), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7c45559defb64aa6L, "jetbrains.mps.lang.editor.structure.TransformationLocation")));
      }
      public class SMP_Concepts_fvfxl9_a0a extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
        protected Collection getConcepts(SubstituteMenuContext _context) {
          return Sequence.fromIterable(TransformationMenuActionsUtil.getSubconceptsWithCurrentChildConceptsExcluded(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7c45559defb64aa6L, "jetbrains.mps.lang.editor.structure.TransformationLocation"), _context.getParentNode(), MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations"), _context.getCurrentTargetNode())).toListSequence();
        }

        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(SubstituteMenuContext _context) {
          _context.getEditorMenuTrace().pushTraceInfo();
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("simple actions for the list of concepts", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587150552")));
          try {
            return super.createItems(_context);
          } finally {
            _context.getEditorMenuTrace().popTraceInfo();
          }
        }
        @Override
        protected Collection<SubstituteMenuItem> createItemsForConcept(final SubstituteMenuContext _context, final SAbstractConcept concept) {
          return new SimpleConceptSubstituteMenuPart(concept) {
            @NotNull
            @Override
            public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
              context.getEditorMenuTrace().pushTraceInfo();
              context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("simple action for concept: " + concept.getName(), null));
              try {
                return super.createItems(context);
              } finally {
                context.getEditorMenuTrace().popTraceInfo();
              }
            }
          }.createItems(_context);
        }
      }
    }
    public class SMP_Group_fvfxl9_b0 extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
      @Override
      protected boolean isApplicable(SubstituteMenuContext _context) {
        return !((condition));
      }
      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587154152")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }

      @Override
      protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
        return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new TransformationLocation_SubstituteMenu.SMP_Group_fvfxl9_a.SMP_Group_fvfxl9_b0.SMP_Subconcepts_fvfxl9_a1a());
      }
      public class SMP_Subconcepts_fvfxl9_a1a extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
        protected Collection getConcepts(final SubstituteMenuContext _context) {
          return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7c45559defb64aa6L, "jetbrains.mps.lang.editor.structure.TransformationLocation"));
        }
        @NotNull
        @Override
        public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
          context.getEditorMenuTrace().pushTraceInfo();
          context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "TransformationLocation", new SNodePointer("r:00000000-0000-4000-0000-011c89590299(jetbrains.mps.lang.editor.editor)", "1741258697587154156")));
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
}
