package jetbrains.mps.baseLanguage.constructors.editor;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.jetbrains.annotations.Nullable;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ListArgumentClauseSubstitute extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ListArgumentClauseSubstitute.SMP_Group_fp1u36_a());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named substitute menu " + "ListArgumentClauseSubstitute", new SNodePointer("r:a26c2d31-3099-460a-9c78-2ba0012a8914(jetbrains.mps.baseLanguage.constructors.editor)", "1741258697587217705")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_Group_fp1u36_a extends GroupMenuPart<SubstituteMenuItem, SubstituteMenuContext> {
    @Override
    protected boolean isApplicable(SubstituteMenuContext _context) {
      if (SNodeOperations.isInstanceOf(_context.getParentNode(), MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x7500da2cf0943c2L, "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor"))) {
        return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x7500da2cf0943c2L, "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor")), MetaAdapterFactory.getContainmentLink(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x7500da2cf0943c2L, 0x4aa85872b7431817L, "arguments")), MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause")));
      }
      return false;
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(@NotNull SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("substitute menu group", new SNodePointer("r:a26c2d31-3099-460a-9c78-2ba0012a8914(jetbrains.mps.baseLanguage.constructors.editor)", "1741258697587217707")));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts() {
      return Arrays.<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>asList(new ConstraintsFilteringSubstituteMenuPartDecorator(new ListArgumentClauseSubstitute.SMP_Group_fp1u36_a.SMP_Action_fp1u36_a0(), MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause")));
    }
    private class SMP_Action_fp1u36_a0 extends SingleItemSubstituteMenuPart {

      @Nullable
      @Override
      protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
        ListArgumentClauseSubstitute.SMP_Group_fp1u36_a.SMP_Action_fp1u36_a0.Item item = new ListArgumentClauseSubstitute.SMP_Group_fp1u36_a.SMP_Action_fp1u36_a0.Item(_context);
        String description;
        try {
          description = "Substitute item: " + item.getMatchingText("");
        } catch (Throwable t) {
          Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
          return null;
        }

        _context.getEditorMenuTrace().pushTraceInfo();
        try {
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:a26c2d31-3099-460a-9c78-2ba0012a8914(jetbrains.mps.baseLanguage.constructors.editor)", "1741258697587217755")));
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
          super(MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
          _context = context;
        }

        private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
          myTraceInfo = traceInfo;
        }

        @Nullable
        @Override
        public SNode createNode(@NotNull String pattern) {
          return SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xae47ad35abd486cL, 0xac0f298884f39393L, 0x4aa85872b742b6b9L, "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause")), null);
        }

        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myTraceInfo;
        }
        @Nullable
        @Override
        public String getMatchingText(@NotNull String pattern) {
          return "listof";
        }
      }
    }
  }
}
