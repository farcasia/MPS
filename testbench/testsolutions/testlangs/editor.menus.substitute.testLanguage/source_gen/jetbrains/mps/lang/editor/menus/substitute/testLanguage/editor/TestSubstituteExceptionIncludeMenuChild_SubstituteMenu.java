package jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor;

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
import jetbrains.mps.lang.editor.menus.substitute.IncludeSubstituteMenuSubstituteMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuLookup;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class TestSubstituteExceptionIncludeMenuChild_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new TestSubstituteExceptionIncludeMenuChild_SubstituteMenu.SMP_Include_1tzb4w_a());
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new TestSubstituteExceptionIncludeMenuChild_SubstituteMenu.SMP_Action_1tzb4w_b(), MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x63457d5cb58267deL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestSubstituteExceptionIncludeMenuChild")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for " + "TestSubstituteExceptionIncludeMenuChild", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "7153261420283586535")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Include_1tzb4w_a extends IncludeSubstituteMenuSubstituteMenuPart {

    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include " + "", new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "7153261420283582125")));
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
      return new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(editorContext.getRepository()), conceptToFindMenuFor);
    }
    private SAbstractConcept getConceptToFindMenuFor(SubstituteMenuContext _context) {
      throw new RuntimeException("Intentional exception - ignore this");
    }
  }
  private class SMP_Action_1tzb4w_b extends SingleItemSubstituteMenuPart {

    @Nullable
    @Override
    protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
      TestSubstituteExceptionIncludeMenuChild_SubstituteMenu.SMP_Action_1tzb4w_b.Item item = new TestSubstituteExceptionIncludeMenuChild_SubstituteMenu.SMP_Action_1tzb4w_b.Item(_context);
      String description;
      try {
        description = "Substitute item: " + item.getMatchingText("");
      } catch (Throwable t) {
        Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
        return null;
      }

      _context.getEditorMenuTrace().pushTraceInfo();
      try {
        _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:d793eea9-8b7b-4c58-a7a2-62336f54dcce(jetbrains.mps.lang.editor.menus.substitute.testLanguage.editor)", "7153261420283589418")));
        item.setTraceInfo(_context.getEditorMenuTrace().getTraceInfo());
      } finally {
        _context.getEditorMenuTrace().popTraceInfo();
      }

      return item;
    }
    private class Item extends DefaultSubstituteMenuItem {
      private final SubstituteMenuContext _context;
      private EditorMenuTraceInfo myTraceInfo;
      public Item(SubstituteMenuContext context) {
        super(MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x63457d5cb58267deL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestSubstituteExceptionIncludeMenuChild"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
        _context = context;
      }

      private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
        myTraceInfo = traceInfo;
      }

      @Nullable
      @Override
      public SNode createNode(@NotNull String pattern) {
        return SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xcb6d57037c8e46a9L, 0xb993c1373dc0942fL, 0x63457d5cb58267deL, "jetbrains.mps.lang.editor.menus.substitute.testLanguage.structure.TestSubstituteExceptionIncludeMenuChild"));
      }

      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myTraceInfo;
      }
      @Nullable
      @Override
      public String getMatchingText(@NotNull String pattern) {
        return "action";
      }
    }
  }
}
