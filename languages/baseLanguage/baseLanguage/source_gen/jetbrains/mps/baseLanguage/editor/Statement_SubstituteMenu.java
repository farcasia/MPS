package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.SimpleConceptSubstituteMenuPart;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.IncludeSubstituteMenuSubstituteMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.NamedSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;

public class Statement_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_a());
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_b());
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_c());
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_d());
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_e());
    result.add(new Statement_SubstituteMenu.SMP_Include_c8idjo_f());
    result.add(new Statement_SubstituteMenu.SMP_Subconcepts_c8idjo_g());
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SimpleConceptSubstituteMenuPart(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement")) {

      @NotNull
      @Override
      public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
        context.getEditorMenuTrace().pushTraceInfo();
        context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("simple substitute menu part for concept: " + "Statement", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586964713")));
        try {
          return super.createItems(context);
        } finally {
          context.getEditorMenuTrace().popTraceInfo();
        }
      }
    }, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "Statement", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586957758")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Include_c8idjo_a extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "localVariablesWithType", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586957825")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.localVariablesWithType");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Include_c8idjo_b extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "ifStatement_", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586959201")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.ifStatement_");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Include_c8idjo_c extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "localVariables", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586961058")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.localVariables");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Include_c8idjo_d extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "expressionStatement_", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586962393")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.expressionStatement_");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Include_c8idjo_e extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "loopStatements", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586962630")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.loopStatements");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Include_c8idjo_f extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "named substitute menu " + "thisAndSuperConstructor", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586963058")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }
    @Nullable
    @Override
    protected SubstituteMenuLookup getMenuLookup(SubstituteMenuContext _context) {
      final EditorContext editorContext = _context.getEditorContext();
      SAbstractConcept conceptToFindMenuFor = getConceptToFindMenuFor(_context);
      return new NamedSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor, "jetbrains.mps.baseLanguage.editor.thisAndSuperConstructor");
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement");
    }
  }
  public class SMP_Subconcepts_c8idjo_g extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"));
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "Statement", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586964712")));
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
